// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.quantum;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.quantum.inputs.GetWorkspaceArgs;
import com.pulumi.azurenative.quantum.inputs.GetWorkspacePlainArgs;
import com.pulumi.azurenative.quantum.outputs.GetWorkspaceResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class QuantumFunctions {
    /**
     * The resource proxy definition object for quantum workspace.
     * API Version: 2019-11-04-preview.
     * 
     */
    public static Output<GetWorkspaceResult> getWorkspace(GetWorkspaceArgs args) {
        return getWorkspace(args, InvokeOptions.Empty);
    }
    /**
     * The resource proxy definition object for quantum workspace.
     * API Version: 2019-11-04-preview.
     * 
     */
    public static CompletableFuture<GetWorkspaceResult> getWorkspacePlain(GetWorkspacePlainArgs args) {
        return getWorkspacePlain(args, InvokeOptions.Empty);
    }
    /**
     * The resource proxy definition object for quantum workspace.
     * API Version: 2019-11-04-preview.
     * 
     */
    public static Output<GetWorkspaceResult> getWorkspace(GetWorkspaceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:quantum:getWorkspace", TypeShape.of(GetWorkspaceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The resource proxy definition object for quantum workspace.
     * API Version: 2019-11-04-preview.
     * 
     */
    public static CompletableFuture<GetWorkspaceResult> getWorkspacePlain(GetWorkspacePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:quantum:getWorkspace", TypeShape.of(GetWorkspaceResult.class), args, Utilities.withVersion(options));
    }
}
