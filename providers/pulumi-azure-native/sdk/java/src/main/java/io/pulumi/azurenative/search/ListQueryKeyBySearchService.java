// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.search.inputs.ListQueryKeyBySearchServiceArgs;
import io.pulumi.azurenative.search.outputs.ListQueryKeyBySearchServiceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListQueryKeyBySearchService {
    private ListQueryKeyBySearchService() {}
    public interface BuilderApplicator {
        public void apply(ListQueryKeyBySearchServiceArgs.Builder a);
    }
    private static ListQueryKeyBySearchServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListQueryKeyBySearchServiceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Response containing the query API keys for a given Azure Cognitive Search service.
 * API Version: 2020-08-01.
 * 
     *
     * Response containing the query API keys for a given Azure Cognitive Search service.
 * 
     */
    public static CompletableFuture<ListQueryKeyBySearchServiceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Response containing the query API keys for a given Azure Cognitive Search service.
     * API Version: 2020-08-01.
     * 
     *
         * Response containing the query API keys for a given Azure Cognitive Search service.
     * 
     */
    public static CompletableFuture<ListQueryKeyBySearchServiceResult> invokeAsync(ListQueryKeyBySearchServiceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:search:listQueryKeyBySearchService", TypeShape.of(ListQueryKeyBySearchServiceResult.class), args == null ? ListQueryKeyBySearchServiceArgs.Empty : args, Utilities.withVersion(options));
    }
}