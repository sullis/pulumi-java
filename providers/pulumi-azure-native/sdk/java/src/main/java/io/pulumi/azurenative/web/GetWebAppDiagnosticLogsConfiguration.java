// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.GetWebAppDiagnosticLogsConfigurationArgs;
import io.pulumi.azurenative.web.outputs.GetWebAppDiagnosticLogsConfigurationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWebAppDiagnosticLogsConfiguration {
/**
 * Configuration of App Service site logs.
 * API Version: 2020-12-01.
 * 
 *
 * Configuration of App Service site logs.
 * 
 */
    public static CompletableFuture<GetWebAppDiagnosticLogsConfigurationResult> invokeAsync(GetWebAppDiagnosticLogsConfigurationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:getWebAppDiagnosticLogsConfiguration", TypeShape.of(GetWebAppDiagnosticLogsConfigurationResult.class), args == null ? GetWebAppDiagnosticLogsConfigurationArgs.Empty : args, Utilities.withVersion(options));
    }
}
