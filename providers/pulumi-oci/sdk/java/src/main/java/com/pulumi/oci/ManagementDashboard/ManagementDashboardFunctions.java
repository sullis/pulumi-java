// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ManagementDashboard;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.ManagementDashboard.inputs.GetManagementDashboardsExportArgs;
import com.pulumi.oci.ManagementDashboard.inputs.GetManagementDashboardsExportPlainArgs;
import com.pulumi.oci.ManagementDashboard.outputs.GetManagementDashboardsExportResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class ManagementDashboardFunctions {
    /**
     * This data source provides details about a specific Management Dashboards Export resource in Oracle Cloud Infrastructure Management Dashboard service.
     * 
     * Exports an array of dashboards and their saved searches. Export is designed to work with importDashboard.
     * Here&#39;s an example of how you can use CLI to export a dashboard:
     * `$oci management-dashboard dashboard export --query data --export-dashboard-id &#34;{\&#34;dashboardIds\&#34;:[\&#34;ocid1.managementdashboard.oc1..dashboardId1\&#34;]}&#34;  &gt; dashboards.json`
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetManagementDashboardsExportResult> getManagementDashboardsExport(GetManagementDashboardsExportArgs args) {
        return getManagementDashboardsExport(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Management Dashboards Export resource in Oracle Cloud Infrastructure Management Dashboard service.
     * 
     * Exports an array of dashboards and their saved searches. Export is designed to work with importDashboard.
     * Here&#39;s an example of how you can use CLI to export a dashboard:
     * `$oci management-dashboard dashboard export --query data --export-dashboard-id &#34;{\&#34;dashboardIds\&#34;:[\&#34;ocid1.managementdashboard.oc1..dashboardId1\&#34;]}&#34;  &gt; dashboards.json`
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetManagementDashboardsExportResult> getManagementDashboardsExportPlain(GetManagementDashboardsExportPlainArgs args) {
        return getManagementDashboardsExportPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Management Dashboards Export resource in Oracle Cloud Infrastructure Management Dashboard service.
     * 
     * Exports an array of dashboards and their saved searches. Export is designed to work with importDashboard.
     * Here&#39;s an example of how you can use CLI to export a dashboard:
     * `$oci management-dashboard dashboard export --query data --export-dashboard-id &#34;{\&#34;dashboardIds\&#34;:[\&#34;ocid1.managementdashboard.oc1..dashboardId1\&#34;]}&#34;  &gt; dashboards.json`
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetManagementDashboardsExportResult> getManagementDashboardsExport(GetManagementDashboardsExportArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("oci:ManagementDashboard/getManagementDashboardsExport:getManagementDashboardsExport", TypeShape.of(GetManagementDashboardsExportResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Management Dashboards Export resource in Oracle Cloud Infrastructure Management Dashboard service.
     * 
     * Exports an array of dashboards and their saved searches. Export is designed to work with importDashboard.
     * Here&#39;s an example of how you can use CLI to export a dashboard:
     * `$oci management-dashboard dashboard export --query data --export-dashboard-id &#34;{\&#34;dashboardIds\&#34;:[\&#34;ocid1.managementdashboard.oc1..dashboardId1\&#34;]}&#34;  &gt; dashboards.json`
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetManagementDashboardsExportResult> getManagementDashboardsExportPlain(GetManagementDashboardsExportPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:ManagementDashboard/getManagementDashboardsExport:getManagementDashboardsExport", TypeShape.of(GetManagementDashboardsExportResult.class), args, Utilities.withVersion(options));
    }
}
