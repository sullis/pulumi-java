// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2transitgateway.inputs.GetVpcAttachmentArgs;
import io.pulumi.aws.ec2transitgateway.outputs.GetVpcAttachmentResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVpcAttachment {
    private GetVpcAttachment() {}
    public interface BuilderApplicator {
        public void apply(GetVpcAttachmentArgs.Builder a);
    }
    private static GetVpcAttachmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetVpcAttachmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Get information on an EC2 Transit Gateway VPC Attachment.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getVpcAttachment.
 * 
     *
     * A collection of values returned by getVpcAttachment.
 * 
     */
    public static CompletableFuture<GetVpcAttachmentResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Get information on an EC2 Transit Gateway VPC Attachment.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getVpcAttachment.
     * 
     *
         * A collection of values returned by getVpcAttachment.
     * 
     */
    public static CompletableFuture<GetVpcAttachmentResult> invokeAsync(@Nullable GetVpcAttachmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2transitgateway/getVpcAttachment:getVpcAttachment", TypeShape.of(GetVpcAttachmentResult.class), args == null ? GetVpcAttachmentArgs.Empty : args, Utilities.withVersion(options));
    }
}