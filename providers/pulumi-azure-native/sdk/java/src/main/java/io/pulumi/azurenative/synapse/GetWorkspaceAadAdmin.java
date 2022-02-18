// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.synapse.inputs.GetWorkspaceAadAdminArgs;
import io.pulumi.azurenative.synapse.outputs.GetWorkspaceAadAdminResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWorkspaceAadAdmin {
/**
 * Workspace active directory administrator
 * API Version: 2021-03-01.
 * 
 *
 * Workspace active directory administrator
 * 
 */
    public static CompletableFuture<GetWorkspaceAadAdminResult> invokeAsync(GetWorkspaceAadAdminArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:synapse:getWorkspaceAadAdmin", TypeShape.of(GetWorkspaceAadAdminResult.class), args == null ? GetWorkspaceAadAdminArgs.Empty : args, Utilities.withVersion(options));
    }
}
