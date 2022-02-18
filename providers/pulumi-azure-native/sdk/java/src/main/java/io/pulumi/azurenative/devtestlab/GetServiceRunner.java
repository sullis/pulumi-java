// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devtestlab.inputs.GetServiceRunnerArgs;
import io.pulumi.azurenative.devtestlab.outputs.GetServiceRunnerResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServiceRunner {
/**
 * A container for a managed identity to execute DevTest lab services.
 * API Version: 2018-09-15.
 * 
 *
 * A container for a managed identity to execute DevTest lab services.
 * 
 */
    public static CompletableFuture<GetServiceRunnerResult> invokeAsync(GetServiceRunnerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getServiceRunner", TypeShape.of(GetServiceRunnerResult.class), args == null ? GetServiceRunnerArgs.Empty : args, Utilities.withVersion(options));
    }
}
