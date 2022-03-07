// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.inputs.GetGlobalForwardingRuleArgs;
import io.pulumi.googlenative.compute_v1.outputs.GetGlobalForwardingRuleResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGlobalForwardingRule {
    private GetGlobalForwardingRule() {}
    public interface BuilderApplicator {
        public void apply(GetGlobalForwardingRuleArgs.Builder a);
    }
    private static GetGlobalForwardingRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetGlobalForwardingRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the specified GlobalForwardingRule resource. Gets a list of available forwarding rules by making a list() request.
 * 
     */
    public static CompletableFuture<GetGlobalForwardingRuleResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the specified GlobalForwardingRule resource. Gets a list of available forwarding rules by making a list() request.
     * 
     */
    public static CompletableFuture<GetGlobalForwardingRuleResult> invokeAsync(GetGlobalForwardingRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/v1:getGlobalForwardingRule", TypeShape.of(GetGlobalForwardingRuleResult.class), args == null ? GetGlobalForwardingRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}