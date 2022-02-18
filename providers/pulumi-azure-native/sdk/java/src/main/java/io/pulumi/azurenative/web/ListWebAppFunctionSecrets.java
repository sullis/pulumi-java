// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.ListWebAppFunctionSecretsArgs;
import io.pulumi.azurenative.web.outputs.ListWebAppFunctionSecretsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListWebAppFunctionSecrets {
/**
 * Function secrets.
 * API Version: 2020-12-01.
 * 
 *
 * Function secrets.
 * 
 */
    public static CompletableFuture<ListWebAppFunctionSecretsResult> invokeAsync(ListWebAppFunctionSecretsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:listWebAppFunctionSecrets", TypeShape.of(ListWebAppFunctionSecretsResult.class), args == null ? ListWebAppFunctionSecretsArgs.Empty : args, Utilities.withVersion(options));
    }
}
