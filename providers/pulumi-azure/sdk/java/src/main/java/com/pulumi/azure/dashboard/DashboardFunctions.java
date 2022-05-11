// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dashboard;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.dashboard.inputs.Azurerm_portal_dashboardArgs;
import com.pulumi.azure.dashboard.outputs.Azurerm_portal_dashboardResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DashboardFunctions {
    /**
     * Use this data source to access information about an existing shared dashboard in the Azure Portal. This is the data source of the `azure.portal.Dashboard` resource.
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
     *         final var example = Output.of(PortalFunctions.getDashboard(GetDashboardArgs.builder()
     *             .name(&#34;existing-dashboard&#34;)
     *             .resourceGroupName(&#34;dashboard-rg&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, data.getAzurerm_dashboard().getExample().getId());
     *         }
     * }
     * ```
     * 
     * @deprecated
     * azure.dashboard.azurerm_portal_dashboard has been deprecated in favor of azure.portal.getDashboard
     * 
     */
    @Deprecated /* azure.dashboard.azurerm_portal_dashboard has been deprecated in favor of azure.portal.getDashboard */
    public static CompletableFuture<Azurerm_portal_dashboardResult> azurerm_portal_dashboard(Azurerm_portal_dashboardArgs args) {
        return azurerm_portal_dashboard(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<Azurerm_portal_dashboardResult> azurerm_portal_dashboard(Azurerm_portal_dashboardArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:dashboard/azurerm_portal_dashboard:azurerm_portal_dashboard", TypeShape.of(Azurerm_portal_dashboardResult.class), args, Utilities.withVersion(options));
    }
}
