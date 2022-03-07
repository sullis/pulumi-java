// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.mediapackage.inputs.GetPackagingConfigurationArgs;
import io.pulumi.awsnative.mediapackage.outputs.GetPackagingConfigurationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPackagingConfiguration {
    private GetPackagingConfiguration() {}
    public interface BuilderApplicator {
        public void apply(GetPackagingConfigurationArgs.Builder a);
    }
    private static GetPackagingConfigurationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetPackagingConfigurationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource schema for AWS::MediaPackage::PackagingConfiguration
 * 
     */
    public static CompletableFuture<GetPackagingConfigurationResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource schema for AWS::MediaPackage::PackagingConfiguration
     * 
     */
    public static CompletableFuture<GetPackagingConfigurationResult> invokeAsync(GetPackagingConfigurationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:mediapackage:getPackagingConfiguration", TypeShape.of(GetPackagingConfigurationResult.class), args == null ? GetPackagingConfigurationArgs.Empty : args, Utilities.withVersion(options));
    }
}