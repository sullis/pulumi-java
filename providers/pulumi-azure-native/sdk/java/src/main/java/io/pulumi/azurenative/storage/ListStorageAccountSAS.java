// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storage.inputs.ListStorageAccountSASArgs;
import io.pulumi.azurenative.storage.outputs.ListStorageAccountSASResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListStorageAccountSAS {
/**
 * The List SAS credentials operation response.
 * API Version: 2021-02-01.
 * 
 *
 * The List SAS credentials operation response.
 * 
 */
    public static CompletableFuture<ListStorageAccountSASResult> invokeAsync(ListStorageAccountSASArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:storage:listStorageAccountSAS", TypeShape.of(ListStorageAccountSASResult.class), args == null ? ListStorageAccountSASArgs.Empty : args, Utilities.withVersion(options));
    }
}
