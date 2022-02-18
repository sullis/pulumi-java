// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerservice.inputs.GetAgentPoolArgs;
import io.pulumi.azurenative.containerservice.outputs.GetAgentPoolResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAgentPool {
/**
 * Agent Pool.
 * API Version: 2021-03-01.
 * 
 *
 * Agent Pool.
 * 
 */
    public static CompletableFuture<GetAgentPoolResult> invokeAsync(GetAgentPoolArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerservice:getAgentPool", TypeShape.of(GetAgentPoolResult.class), args == null ? GetAgentPoolArgs.Empty : args, Utilities.withVersion(options));
    }
}
