// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.inputs.GetNetworkInsightsPathArgs;
import io.pulumi.awsnative.ec2.outputs.GetNetworkInsightsPathResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNetworkInsightsPath {
    private GetNetworkInsightsPath() {}
    public interface BuilderApplicator {
        public void apply(GetNetworkInsightsPathArgs.Builder a);
    }
    private static GetNetworkInsightsPathArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetNetworkInsightsPathArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource schema for AWS::EC2::NetworkInsightsPath
 * 
     */
    public static CompletableFuture<GetNetworkInsightsPathResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource schema for AWS::EC2::NetworkInsightsPath
     * 
     */
    public static CompletableFuture<GetNetworkInsightsPathResult> invokeAsync(GetNetworkInsightsPathArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ec2:getNetworkInsightsPath", TypeShape.of(GetNetworkInsightsPathResult.class), args == null ? GetNetworkInsightsPathArgs.Empty : args, Utilities.withVersion(options));
    }
}