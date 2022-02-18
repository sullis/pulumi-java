// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerregistry.inputs.ListTaskDetailsArgs;
import io.pulumi.azurenative.containerregistry.outputs.ListTaskDetailsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListTaskDetails {
/**
 * The task that has the ARM resource and task properties.
 * The task will have all information to schedule a run against it.
 * API Version: 2019-06-01-preview.
 * 
 *
 * The task that has the ARM resource and task properties.
 * The task will have all information to schedule a run against it.
 * 
 */
    public static CompletableFuture<ListTaskDetailsResult> invokeAsync(ListTaskDetailsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:listTaskDetails", TypeShape.of(ListTaskDetailsResult.class), args == null ? ListTaskDetailsArgs.Empty : args, Utilities.withVersion(options));
    }
}
