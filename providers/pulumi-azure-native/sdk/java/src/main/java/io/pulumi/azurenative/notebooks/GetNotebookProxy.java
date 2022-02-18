// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notebooks;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.notebooks.inputs.GetNotebookProxyArgs;
import io.pulumi.azurenative.notebooks.outputs.GetNotebookProxyResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNotebookProxy {
/**
 * A NotebookProxy resource.
 * API Version: 2019-10-11-preview.
 * 
 *
 * A NotebookProxy resource.
 * 
 */
    public static CompletableFuture<GetNotebookProxyResult> invokeAsync(GetNotebookProxyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:notebooks:getNotebookProxy", TypeShape.of(GetNotebookProxyResult.class), args == null ? GetNotebookProxyArgs.Empty : args, Utilities.withVersion(options));
    }
}
