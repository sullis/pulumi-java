// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.relay;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.relay.inputs.ListNamespaceKeysArgs;
import io.pulumi.azurenative.relay.outputs.ListNamespaceKeysResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListNamespaceKeys {
/**
 * Namespace/Relay Connection String
 * API Version: 2017-04-01.
 * 
 *
 * Namespace/Relay Connection String
 * 
 */
    public static CompletableFuture<ListNamespaceKeysResult> invokeAsync(ListNamespaceKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:relay:listNamespaceKeys", TypeShape.of(ListNamespaceKeysResult.class), args == null ? ListNamespaceKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}
