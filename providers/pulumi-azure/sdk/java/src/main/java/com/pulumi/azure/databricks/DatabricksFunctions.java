// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.databricks;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.databricks.inputs.GetWorkspaceArgs;
import com.pulumi.azure.databricks.inputs.GetWorkspacePrivateEndpointConnectionArgs;
import com.pulumi.azure.databricks.outputs.GetWorkspacePrivateEndpointConnectionResult;
import com.pulumi.azure.databricks.outputs.GetWorkspaceResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DatabricksFunctions {
    /**
     * Use this data source to access information about an existing Databricks workspace.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(DatabricksFunctions.getWorkspace(GetWorkspaceArgs.builder()
     *             .name(&#34;example-workspace&#34;)
     *             .resourceGroupName(&#34;example-rg&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;databricksWorkspaceId&#34;, example.apply(getWorkspaceResult -&gt; getWorkspaceResult.getWorkspaceId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetWorkspaceResult> getWorkspace(GetWorkspaceArgs args) {
        return getWorkspace(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetWorkspaceResult> getWorkspace(GetWorkspaceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:databricks/getWorkspace:getWorkspace", TypeShape.of(GetWorkspaceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information on an existing Databricks Workspace private endpoint connection state.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(DatabricksFunctions.getWorkspacePrivateEndpointConnection(GetWorkspacePrivateEndpointConnectionArgs.builder()
     *             .workspaceId(azurerm_databricks_workspace.getExample().getId())
     *             .privateEndpointId(azurerm_private_endpoint.getExample().getId())
     *             .build()));
     * 
     *         ctx.export(&#34;databricksWorkspacePrivateEndpointConnectionStatus&#34;, example.apply(getWorkspacePrivateEndpointConnectionResult -&gt; getWorkspacePrivateEndpointConnectionResult.getConnections()[0].getStatus()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetWorkspacePrivateEndpointConnectionResult> getWorkspacePrivateEndpointConnection(GetWorkspacePrivateEndpointConnectionArgs args) {
        return getWorkspacePrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetWorkspacePrivateEndpointConnectionResult> getWorkspacePrivateEndpointConnection(GetWorkspacePrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:databricks/getWorkspacePrivateEndpointConnection:getWorkspacePrivateEndpointConnection", TypeShape.of(GetWorkspacePrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
}
