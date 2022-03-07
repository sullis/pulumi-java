// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.ListNetworkManagerEffectiveSecurityAdminRuleArgs;
import io.pulumi.azurenative.network.outputs.ListNetworkManagerEffectiveSecurityAdminRuleResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListNetworkManagerEffectiveSecurityAdminRule {
    private ListNetworkManagerEffectiveSecurityAdminRule() {}
    public interface BuilderApplicator {
        public void apply(ListNetworkManagerEffectiveSecurityAdminRuleArgs.Builder a);
    }
    private static ListNetworkManagerEffectiveSecurityAdminRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListNetworkManagerEffectiveSecurityAdminRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Result of the request to list networkManagerEffectiveSecurityAdminRules. It contains a list of groups and a skiptoken to get the next set of results.
 * API Version: 2021-02-01-preview.
 * 
     *
     * Result of the request to list networkManagerEffectiveSecurityAdminRules. It contains a list of groups and a skiptoken to get the next set of results.
 * 
     */
    public static CompletableFuture<ListNetworkManagerEffectiveSecurityAdminRuleResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Result of the request to list networkManagerEffectiveSecurityAdminRules. It contains a list of groups and a skiptoken to get the next set of results.
     * API Version: 2021-02-01-preview.
     * 
     *
         * Result of the request to list networkManagerEffectiveSecurityAdminRules. It contains a list of groups and a skiptoken to get the next set of results.
     * 
     */
    public static CompletableFuture<ListNetworkManagerEffectiveSecurityAdminRuleResult> invokeAsync(ListNetworkManagerEffectiveSecurityAdminRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:listNetworkManagerEffectiveSecurityAdminRule", TypeShape.of(ListNetworkManagerEffectiveSecurityAdminRuleResult.class), args == null ? ListNetworkManagerEffectiveSecurityAdminRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}