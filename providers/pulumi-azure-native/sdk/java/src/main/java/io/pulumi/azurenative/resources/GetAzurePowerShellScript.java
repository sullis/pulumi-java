// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.resources.inputs.GetAzurePowerShellScriptArgs;
import io.pulumi.azurenative.resources.outputs.GetAzurePowerShellScriptResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAzurePowerShellScript {
/**
 * Object model for the Azure PowerShell script.
 * API Version: 2020-10-01.
 * 
 *
 * Object model for the Azure PowerShell script.
 * 
 */
    public static CompletableFuture<GetAzurePowerShellScriptResult> invokeAsync(GetAzurePowerShellScriptArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:resources:getAzurePowerShellScript", TypeShape.of(GetAzurePowerShellScriptResult.class), args == null ? GetAzurePowerShellScriptArgs.Empty : args, Utilities.withVersion(options));
    }
}
