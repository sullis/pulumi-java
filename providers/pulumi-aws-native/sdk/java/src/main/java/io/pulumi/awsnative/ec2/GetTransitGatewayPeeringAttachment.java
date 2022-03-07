// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.inputs.GetTransitGatewayPeeringAttachmentArgs;
import io.pulumi.awsnative.ec2.outputs.GetTransitGatewayPeeringAttachmentResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTransitGatewayPeeringAttachment {
    private GetTransitGatewayPeeringAttachment() {}
    public interface BuilderApplicator {
        public void apply(GetTransitGatewayPeeringAttachmentArgs.Builder a);
    }
    private static GetTransitGatewayPeeringAttachmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetTransitGatewayPeeringAttachmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The AWS::EC2::TransitGatewayPeeringAttachment type
 * 
     */
    public static CompletableFuture<GetTransitGatewayPeeringAttachmentResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The AWS::EC2::TransitGatewayPeeringAttachment type
     * 
     */
    public static CompletableFuture<GetTransitGatewayPeeringAttachmentResult> invokeAsync(GetTransitGatewayPeeringAttachmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getTransitGatewayPeeringAttachment", TypeShape.of(GetTransitGatewayPeeringAttachmentResult.class), args == null ? GetTransitGatewayPeeringAttachmentArgs.Empty : args, Utilities.withVersion(options));
    }
}