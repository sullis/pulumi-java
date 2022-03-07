// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.inputs.ListIntegrationAccountMapContentCallbackUrlArgs;
import io.pulumi.azurenative.logic.outputs.ListIntegrationAccountMapContentCallbackUrlResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListIntegrationAccountMapContentCallbackUrl {
    private ListIntegrationAccountMapContentCallbackUrl() {}
    public interface BuilderApplicator {
        public void apply(ListIntegrationAccountMapContentCallbackUrlArgs.Builder a);
    }
    private static ListIntegrationAccountMapContentCallbackUrlArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListIntegrationAccountMapContentCallbackUrlArgs.builder();
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
    public static CompletableFuture<ListIntegrationAccountMapContentCallbackUrlResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
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
    public static CompletableFuture<ListIntegrationAccountMapContentCallbackUrlResult> invokeAsync(ListIntegrationAccountMapContentCallbackUrlArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:logic:listIntegrationAccountMapContentCallbackUrl", TypeShape.of(ListIntegrationAccountMapContentCallbackUrlResult.class), args == null ? ListIntegrationAccountMapContentCallbackUrlArgs.Empty : args, Utilities.withVersion(options));
    }
}