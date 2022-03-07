// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.inputs.GetNetworkAclArgs;
import io.pulumi.awsnative.ec2.outputs.GetNetworkAclResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNetworkAcl {
    private GetNetworkAcl() {}
    public interface BuilderApplicator {
        public void apply(GetNetworkAclArgs.Builder a);
    }
    private static GetNetworkAclArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetNetworkAclArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource Type definition for AWS::EC2::NetworkAcl
 * 
     */
    public static CompletableFuture<GetNetworkAclResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource Type definition for AWS::EC2::NetworkAcl
     * 
     */
    public static CompletableFuture<GetNetworkAclResult> invokeAsync(GetNetworkAclArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getNetworkAcl", TypeShape.of(GetNetworkAclResult.class), args == null ? GetNetworkAclArgs.Empty : args, Utilities.withVersion(options));
    }
}