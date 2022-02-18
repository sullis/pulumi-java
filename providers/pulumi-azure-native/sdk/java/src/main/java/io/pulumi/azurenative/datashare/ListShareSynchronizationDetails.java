// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.inputs.ListShareSynchronizationDetailsArgs;
import io.pulumi.azurenative.datashare.outputs.ListShareSynchronizationDetailsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListShareSynchronizationDetails {
/**
 * details of synchronization
 * API Version: 2020-09-01.
 * 
 *
 * details of synchronization
 * 
 */
    public static CompletableFuture<ListShareSynchronizationDetailsResult> invokeAsync(ListShareSynchronizationDetailsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datashare:listShareSynchronizationDetails", TypeShape.of(ListShareSynchronizationDetailsResult.class), args == null ? ListShareSynchronizationDetailsArgs.Empty : args, Utilities.withVersion(options));
    }
}
