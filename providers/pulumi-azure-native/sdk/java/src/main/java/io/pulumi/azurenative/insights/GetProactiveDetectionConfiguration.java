// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.inputs.GetProactiveDetectionConfigurationArgs;
import io.pulumi.azurenative.insights.outputs.GetProactiveDetectionConfigurationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetProactiveDetectionConfiguration {
/**
 * Properties that define a ProactiveDetection configuration.
 * API Version: 2015-05-01.
 * 
 *
 * Properties that define a ProactiveDetection configuration.
 * 
 */
    public static CompletableFuture<GetProactiveDetectionConfigurationResult> invokeAsync(GetProactiveDetectionConfigurationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getProactiveDetectionConfiguration", TypeShape.of(GetProactiveDetectionConfigurationResult.class), args == null ? GetProactiveDetectionConfigurationArgs.Empty : args, Utilities.withVersion(options));
    }
}
