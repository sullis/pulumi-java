// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.ListWebAppAzureStorageAccountsArgs;
import io.pulumi.azurenative.web.outputs.ListWebAppAzureStorageAccountsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListWebAppAzureStorageAccounts {
/**
 * AzureStorageInfo dictionary resource.
 * API Version: 2020-12-01.
 * 
 *
 * AzureStorageInfo dictionary resource.
 * 
 */
    public static CompletableFuture<ListWebAppAzureStorageAccountsResult> invokeAsync(ListWebAppAzureStorageAccountsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:listWebAppAzureStorageAccounts", TypeShape.of(ListWebAppAzureStorageAccountsResult.class), args == null ? ListWebAppAzureStorageAccountsArgs.Empty : args, Utilities.withVersion(options));
    }
}
