// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.inputs.ListShareSubscriptionSynchronizationsArgs;
import io.pulumi.azurenative.datashare.outputs.ListShareSubscriptionSynchronizationsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListShareSubscriptionSynchronizations {
/**
 * A consumer side list of share subscription synchronizations
 * API Version: 2020-09-01.
 * 
 *
 * A consumer side list of share subscription synchronizations
 * 
 */
    public static CompletableFuture<ListShareSubscriptionSynchronizationsResult> invokeAsync(ListShareSubscriptionSynchronizationsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datashare:listShareSubscriptionSynchronizations", TypeShape.of(ListShareSubscriptionSynchronizationsResult.class), args == null ? ListShareSubscriptionSynchronizationsArgs.Empty : args, Utilities.withVersion(options));
    }
}
