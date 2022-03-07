// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.security.inputs.ListIngestionSettingTokensArgs;
import io.pulumi.azurenative.security.outputs.ListIngestionSettingTokensResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListIngestionSettingTokens {
    private ListIngestionSettingTokens() {}
    public interface BuilderApplicator {
        public void apply(ListIngestionSettingTokensArgs.Builder a);
    }
    private static ListIngestionSettingTokensArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListIngestionSettingTokensArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Configures how to correlate scan data and logs with resources associated with the subscription.
 * API Version: 2021-01-15-preview.
 * 
     *
     * Configures how to correlate scan data and logs with resources associated with the subscription.
 * 
     */
    public static CompletableFuture<ListIngestionSettingTokensResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Configures how to correlate scan data and logs with resources associated with the subscription.
     * API Version: 2021-01-15-preview.
     * 
     *
         * Configures how to correlate scan data and logs with resources associated with the subscription.
     * 
     */
    public static CompletableFuture<ListIngestionSettingTokensResult> invokeAsync(ListIngestionSettingTokensArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:security:listIngestionSettingTokens", TypeShape.of(ListIngestionSettingTokensResult.class), args == null ? ListIngestionSettingTokensArgs.Empty : args, Utilities.withVersion(options));
    }
}