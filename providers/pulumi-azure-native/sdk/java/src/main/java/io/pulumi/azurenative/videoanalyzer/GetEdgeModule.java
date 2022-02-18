// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.videoanalyzer.inputs.GetEdgeModuleArgs;
import io.pulumi.azurenative.videoanalyzer.outputs.GetEdgeModuleResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEdgeModule {
/**
 * The representation of an edge module.
 * API Version: 2021-05-01-preview.
 * 
 *
 * The representation of an edge module.
 * 
 */
    public static CompletableFuture<GetEdgeModuleResult> invokeAsync(GetEdgeModuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:videoanalyzer:getEdgeModule", TypeShape.of(GetEdgeModuleResult.class), args == null ? GetEdgeModuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
