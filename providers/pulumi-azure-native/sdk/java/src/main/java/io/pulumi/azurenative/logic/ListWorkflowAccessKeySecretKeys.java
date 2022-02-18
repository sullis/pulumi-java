// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.inputs.ListWorkflowAccessKeySecretKeysArgs;
import io.pulumi.azurenative.logic.outputs.ListWorkflowAccessKeySecretKeysResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListWorkflowAccessKeySecretKeys {
/**
 * API Version: 2015-02-01-preview.
 * 
 */
    public static CompletableFuture<ListWorkflowAccessKeySecretKeysResult> invokeAsync(ListWorkflowAccessKeySecretKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:logic:listWorkflowAccessKeySecretKeys", TypeShape.of(ListWorkflowAccessKeySecretKeysResult.class), args == null ? ListWorkflowAccessKeySecretKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}
