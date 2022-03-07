// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datafactory.inputs.ListIntegrationRuntimeAuthKeysArgs;
import io.pulumi.azurenative.datafactory.outputs.ListIntegrationRuntimeAuthKeysResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListIntegrationRuntimeAuthKeys {
    private ListIntegrationRuntimeAuthKeys() {}
    public interface BuilderApplicator {
        public void apply(ListIntegrationRuntimeAuthKeysArgs.Builder a);
    }
    private static ListIntegrationRuntimeAuthKeysArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListIntegrationRuntimeAuthKeysArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The integration runtime authentication keys.
 * API Version: 2018-06-01.
 * 
     *
     * The integration runtime authentication keys.
 * 
     */
    public static CompletableFuture<ListIntegrationRuntimeAuthKeysResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The integration runtime authentication keys.
     * API Version: 2018-06-01.
     * 
     *
         * The integration runtime authentication keys.
     * 
     */
    public static CompletableFuture<ListIntegrationRuntimeAuthKeysResult> invokeAsync(ListIntegrationRuntimeAuthKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datafactory:listIntegrationRuntimeAuthKeys", TypeShape.of(ListIntegrationRuntimeAuthKeysResult.class), args == null ? ListIntegrationRuntimeAuthKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}