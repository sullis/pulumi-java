// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerservice.inputs.GetMaintenanceConfigurationArgs;
import io.pulumi.azurenative.containerservice.outputs.GetMaintenanceConfigurationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMaintenanceConfiguration {
/**
 * maintenance configuration.
 * API Version: 2021-03-01.
 * 
 *
 * maintenance configuration.
 * 
 */
    public static CompletableFuture<GetMaintenanceConfigurationResult> invokeAsync(GetMaintenanceConfigurationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerservice:getMaintenanceConfiguration", TypeShape.of(GetMaintenanceConfigurationResult.class), args == null ? GetMaintenanceConfigurationArgs.Empty : args, Utilities.withVersion(options));
    }
}
