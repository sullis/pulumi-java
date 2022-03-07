// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.policyinsights.inputs.ListRemediationDeploymentsAtResourceGroupArgs;
import io.pulumi.azurenative.policyinsights.outputs.ListRemediationDeploymentsAtResourceGroupResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListRemediationDeploymentsAtResourceGroup {
    private ListRemediationDeploymentsAtResourceGroup() {}
    public interface BuilderApplicator {
        public void apply(ListRemediationDeploymentsAtResourceGroupArgs.Builder a);
    }
    private static ListRemediationDeploymentsAtResourceGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListRemediationDeploymentsAtResourceGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * List of deployments for a remediation.
 * API Version: 2019-07-01.
 * 
     *
     * List of deployments for a remediation.
 * 
     */
    public static CompletableFuture<ListRemediationDeploymentsAtResourceGroupResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * List of deployments for a remediation.
     * API Version: 2019-07-01.
     * 
     *
         * List of deployments for a remediation.
     * 
     */
    public static CompletableFuture<ListRemediationDeploymentsAtResourceGroupResult> invokeAsync(ListRemediationDeploymentsAtResourceGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:policyinsights:listRemediationDeploymentsAtResourceGroup", TypeShape.of(ListRemediationDeploymentsAtResourceGroupResult.class), args == null ? ListRemediationDeploymentsAtResourceGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}