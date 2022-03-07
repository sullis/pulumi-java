// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datadog;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datadog.inputs.ListMonitorHostsArgs;
import io.pulumi.azurenative.datadog.outputs.ListMonitorHostsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListMonitorHosts {
    private ListMonitorHosts() {}
    public interface BuilderApplicator {
        public void apply(ListMonitorHostsArgs.Builder a);
    }
    private static ListMonitorHostsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListMonitorHostsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Response of a list operation.
 * API Version: 2021-03-01.
 * 
     *
     * Response of a list operation.
 * 
     */
    public static CompletableFuture<ListMonitorHostsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Response of a list operation.
     * API Version: 2021-03-01.
     * 
     *
         * Response of a list operation.
     * 
     */
    public static CompletableFuture<ListMonitorHostsResult> invokeAsync(ListMonitorHostsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datadog:listMonitorHosts", TypeShape.of(ListMonitorHostsResult.class), args == null ? ListMonitorHostsArgs.Empty : args, Utilities.withVersion(options));
    }
}