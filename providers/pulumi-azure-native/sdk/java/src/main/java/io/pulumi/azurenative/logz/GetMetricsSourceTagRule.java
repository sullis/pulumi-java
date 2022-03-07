// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logz.inputs.GetMetricsSourceTagRuleArgs;
import io.pulumi.azurenative.logz.outputs.GetMetricsSourceTagRuleResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMetricsSourceTagRule {
    private GetMetricsSourceTagRule() {}
    public interface BuilderApplicator {
        public void apply(GetMetricsSourceTagRuleArgs.Builder a);
    }
    private static GetMetricsSourceTagRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetMetricsSourceTagRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Capture metrics of Azure resources based on ARM tags.
 * API Version: 2022-01-01-preview.
 * 
     *
     * Capture metrics of Azure resources based on ARM tags.
 * 
     */
    public static CompletableFuture<GetMetricsSourceTagRuleResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Capture metrics of Azure resources based on ARM tags.
     * API Version: 2022-01-01-preview.
     * 
     *
         * Capture metrics of Azure resources based on ARM tags.
     * 
     */
    public static CompletableFuture<GetMetricsSourceTagRuleResult> invokeAsync(GetMetricsSourceTagRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:logz:getMetricsSourceTagRule", TypeShape.of(GetMetricsSourceTagRuleResult.class), args == null ? GetMetricsSourceTagRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}