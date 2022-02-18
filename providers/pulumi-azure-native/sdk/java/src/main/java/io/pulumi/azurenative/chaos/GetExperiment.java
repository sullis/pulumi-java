// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.chaos.inputs.GetExperimentArgs;
import io.pulumi.azurenative.chaos.outputs.GetExperimentResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetExperiment {
/**
 * Model that represents a Experiment resource.
 * API Version: 2021-09-15-preview.
 * 
 *
 * Model that represents a Experiment resource.
 * 
 */
    public static CompletableFuture<GetExperimentResult> invokeAsync(GetExperimentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:chaos:getExperiment", TypeShape.of(GetExperimentResult.class), args == null ? GetExperimentArgs.Empty : args, Utilities.withVersion(options));
    }
}
