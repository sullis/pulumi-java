// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.monitoring_v1.inputs.GetDashboardArgs;
import com.pulumi.googlenative.monitoring_v1.inputs.GetDashboardPlainArgs;
import com.pulumi.googlenative.monitoring_v1.outputs.GetDashboardResult;
import java.util.concurrent.CompletableFuture;

public final class Monitoring_v1Functions {
    /**
     * Fetches a specific dashboard.This method requires the monitoring.dashboards.get permission on the specified dashboard. For more information, see Cloud Identity and Access Management (https://cloud.google.com/iam).
     * 
     */
    public static Output<GetDashboardResult> getDashboard(GetDashboardArgs args) {
        return getDashboard(args, InvokeOptions.Empty);
    }
    /**
     * Fetches a specific dashboard.This method requires the monitoring.dashboards.get permission on the specified dashboard. For more information, see Cloud Identity and Access Management (https://cloud.google.com/iam).
     * 
     */
    public static CompletableFuture<GetDashboardResult> getDashboardPlain(GetDashboardPlainArgs args) {
        return getDashboardPlain(args, InvokeOptions.Empty);
    }
    /**
     * Fetches a specific dashboard.This method requires the monitoring.dashboards.get permission on the specified dashboard. For more information, see Cloud Identity and Access Management (https://cloud.google.com/iam).
     * 
     */
    public static Output<GetDashboardResult> getDashboard(GetDashboardArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:monitoring/v1:getDashboard", TypeShape.of(GetDashboardResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Fetches a specific dashboard.This method requires the monitoring.dashboards.get permission on the specified dashboard. For more information, see Cloud Identity and Access Management (https://cloud.google.com/iam).
     * 
     */
    public static CompletableFuture<GetDashboardResult> getDashboardPlain(GetDashboardPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:monitoring/v1:getDashboard", TypeShape.of(GetDashboardResult.class), args, Utilities.withVersion(options));
    }
}
