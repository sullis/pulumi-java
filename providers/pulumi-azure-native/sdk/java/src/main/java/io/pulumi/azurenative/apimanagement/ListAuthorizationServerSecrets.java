// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.inputs.ListAuthorizationServerSecretsArgs;
import io.pulumi.azurenative.apimanagement.outputs.ListAuthorizationServerSecretsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListAuthorizationServerSecrets {
/**
 * OAuth Server Secrets Contract.
 * API Version: 2020-12-01.
 * 
 *
 * OAuth Server Secrets Contract.
 * 
 */
    public static CompletableFuture<ListAuthorizationServerSecretsResult> invokeAsync(ListAuthorizationServerSecretsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:apimanagement:listAuthorizationServerSecrets", TypeShape.of(ListAuthorizationServerSecretsResult.class), args == null ? ListAuthorizationServerSecretsArgs.Empty : args, Utilities.withVersion(options));
    }
}
