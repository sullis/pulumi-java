// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maintenance;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.maintenance.inputs.GetConfigurationAssignmentArgs;
import io.pulumi.azurenative.maintenance.outputs.GetConfigurationAssignmentResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConfigurationAssignment {
/**
 * Configuration Assignment
 * API Version: 2021-04-01-preview.
 * 
 *
 * Configuration Assignment
 * 
 */
    public static CompletableFuture<GetConfigurationAssignmentResult> invokeAsync(GetConfigurationAssignmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:maintenance:getConfigurationAssignment", TypeShape.of(GetConfigurationAssignmentResult.class), args == null ? GetConfigurationAssignmentArgs.Empty : args, Utilities.withVersion(options));
    }
}
