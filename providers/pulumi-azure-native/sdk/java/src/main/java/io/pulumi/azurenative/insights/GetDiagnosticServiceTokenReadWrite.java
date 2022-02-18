// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.inputs.GetDiagnosticServiceTokenReadWriteArgs;
import io.pulumi.azurenative.insights.outputs.GetDiagnosticServiceTokenReadWriteResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDiagnosticServiceTokenReadWrite {
/**
 * The response to a diagnostic services token query.
 * API Version: 2021-03-03-preview.
 * 
 *
 * The response to a diagnostic services token query.
 * 
 */
    public static CompletableFuture<GetDiagnosticServiceTokenReadWriteResult> invokeAsync(GetDiagnosticServiceTokenReadWriteArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getDiagnosticServiceTokenReadWrite", TypeShape.of(GetDiagnosticServiceTokenReadWriteResult.class), args == null ? GetDiagnosticServiceTokenReadWriteArgs.Empty : args, Utilities.withVersion(options));
    }
}
