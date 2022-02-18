// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.outputs.GetLBIPRangesResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLBIPRanges {
/**
 * Use this data source to access IP ranges in your firewall rules.
 * 
 * https://cloud.google.com/compute/docs/load-balancing/health-checks#health_check_source_ips_and_firewall_rules
 * 
 * ## Example Usage
 * 
 *
 * A collection of values returned by getLBIPRanges.
 * 
 */
    public static CompletableFuture<GetLBIPRangesResult> invokeAsync(@Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:compute/getLBIPRanges:getLBIPRanges", TypeShape.of(GetLBIPRangesResult.class), io.pulumi.resources.InvokeArgs.Empty, Utilities.withVersion(options));
    }
}
