// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.inputs.ListIntegrationAccountAssemblyContentCallbackUrlArgs;
import io.pulumi.azurenative.logic.outputs.ListIntegrationAccountAssemblyContentCallbackUrlResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListIntegrationAccountAssemblyContentCallbackUrl {
    private ListIntegrationAccountAssemblyContentCallbackUrl() {}
    public interface BuilderApplicator {
        public void apply(ListIntegrationAccountAssemblyContentCallbackUrlArgs.Builder a);
    }
    private static ListIntegrationAccountAssemblyContentCallbackUrlArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListIntegrationAccountAssemblyContentCallbackUrlArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The workflow trigger callback URL.
 * API Version: 2019-05-01.
 * 
     *
     * The workflow trigger callback URL.
 * 
     */
    public static CompletableFuture<ListIntegrationAccountAssemblyContentCallbackUrlResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The workflow trigger callback URL.
     * API Version: 2019-05-01.
     * 
     *
         * The workflow trigger callback URL.
     * 
     */
    public static CompletableFuture<ListIntegrationAccountAssemblyContentCallbackUrlResult> invokeAsync(ListIntegrationAccountAssemblyContentCallbackUrlArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:logic:listIntegrationAccountAssemblyContentCallbackUrl", TypeShape.of(ListIntegrationAccountAssemblyContentCallbackUrlResult.class), args == null ? ListIntegrationAccountAssemblyContentCallbackUrlArgs.Empty : args, Utilities.withVersion(options));
    }
}