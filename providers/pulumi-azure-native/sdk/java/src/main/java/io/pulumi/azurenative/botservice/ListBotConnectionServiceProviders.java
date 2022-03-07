// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.botservice.inputs.ListBotConnectionServiceProvidersArgs;
import io.pulumi.azurenative.botservice.outputs.ListBotConnectionServiceProvidersResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListBotConnectionServiceProviders {
    private ListBotConnectionServiceProviders() {}
    public interface BuilderApplicator {
        public void apply(ListBotConnectionServiceProvidersArgs.Builder a);
    }
    private static ListBotConnectionServiceProvidersArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListBotConnectionServiceProvidersArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The list of bot service providers response.
 * API Version: 2021-03-01.
 * 
     *
     * The list of bot service providers response.
 * 
     */
    public static CompletableFuture<ListBotConnectionServiceProvidersResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The list of bot service providers response.
     * API Version: 2021-03-01.
     * 
     *
         * The list of bot service providers response.
     * 
     */
    public static CompletableFuture<ListBotConnectionServiceProvidersResult> invokeAsync(@Nullable ListBotConnectionServiceProvidersArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:botservice:listBotConnectionServiceProviders", TypeShape.of(ListBotConnectionServiceProvidersResult.class), args == null ? ListBotConnectionServiceProvidersArgs.Empty : args, Utilities.withVersion(options));
    }
}