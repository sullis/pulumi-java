// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.imagebuilder.inputs.GetDistributionConfigurationArgs;
import io.pulumi.awsnative.imagebuilder.outputs.GetDistributionConfigurationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDistributionConfiguration {
    private GetDistributionConfiguration() {}
    public interface BuilderApplicator {
        public void apply(GetDistributionConfigurationArgs.Builder a);
    }
    private static GetDistributionConfigurationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDistributionConfigurationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource schema for AWS::ImageBuilder::DistributionConfiguration
 * 
     */
    public static CompletableFuture<GetDistributionConfigurationResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource schema for AWS::ImageBuilder::DistributionConfiguration
     * 
     */
    public static CompletableFuture<GetDistributionConfigurationResult> invokeAsync(GetDistributionConfigurationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:imagebuilder:getDistributionConfiguration", TypeShape.of(GetDistributionConfigurationResult.class), args == null ? GetDistributionConfigurationArgs.Empty : args, Utilities.withVersion(options));
    }
}