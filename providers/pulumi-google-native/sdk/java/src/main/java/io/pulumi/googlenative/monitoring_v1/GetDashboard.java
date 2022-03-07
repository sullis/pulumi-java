// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.monitoring_v1.inputs.GetDashboardArgs;
import io.pulumi.googlenative.monitoring_v1.outputs.GetDashboardResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDashboard {
    private GetDashboard() {}
    public interface BuilderApplicator {
        public void apply(GetDashboardArgs.Builder a);
    }
    private static GetDashboardArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDashboardArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Fetches a specific dashboard.This method requires the monitoring.dashboards.get permission on the specified dashboard. For more information, see Cloud Identity and Access Management (https://cloud.google.com/iam).
 * 
     */
    public static CompletableFuture<GetDashboardResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Fetches a specific dashboard.This method requires the monitoring.dashboards.get permission on the specified dashboard. For more information, see Cloud Identity and Access Management (https://cloud.google.com/iam).
     * 
     */
    public static CompletableFuture<GetDashboardResult> invokeAsync(GetDashboardArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:monitoring/v1:getDashboard", TypeShape.of(GetDashboardResult.class), args == null ? GetDashboardArgs.Empty : args, Utilities.withVersion(options));
    }
}