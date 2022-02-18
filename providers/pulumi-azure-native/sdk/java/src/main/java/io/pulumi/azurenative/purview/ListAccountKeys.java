// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.purview;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.purview.inputs.ListAccountKeysArgs;
import io.pulumi.azurenative.purview.outputs.ListAccountKeysResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListAccountKeys {
/**
 * The Account access keys.
 * API Version: 2020-12-01-preview.
 * 
 *
 * The Account access keys.
 * 
 */
    public static CompletableFuture<ListAccountKeysResult> invokeAsync(ListAccountKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:purview:listAccountKeys", TypeShape.of(ListAccountKeysResult.class), args == null ? ListAccountKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}
