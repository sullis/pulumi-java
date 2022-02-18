// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.blockchain.inputs.ListTransactionNodeApiKeysArgs;
import io.pulumi.azurenative.blockchain.outputs.ListTransactionNodeApiKeysResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListTransactionNodeApiKeys {
/**
 * Collection of the API key payload which is exposed in the response of the resource provider.
 * API Version: 2018-06-01-preview.
 * 
 *
 * Collection of the API key payload which is exposed in the response of the resource provider.
 * 
 */
    public static CompletableFuture<ListTransactionNodeApiKeysResult> invokeAsync(ListTransactionNodeApiKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:blockchain:listTransactionNodeApiKeys", TypeShape.of(ListTransactionNodeApiKeysResult.class), args == null ? ListTransactionNodeApiKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}
