// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.inputs.GetGraphResourceGraphArgs;
import io.pulumi.azurenative.documentdb.outputs.GetGraphResourceGraphResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGraphResourceGraph {
    private GetGraphResourceGraph() {}
    public interface BuilderApplicator {
        public void apply(GetGraphResourceGraphArgs.Builder a);
    }
    private static GetGraphResourceGraphArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetGraphResourceGraphArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * An Azure Cosmos DB Graph resource.
 * API Version: 2021-07-01-preview.
 * 
     *
     * An Azure Cosmos DB Graph resource.
 * 
     */
    public static CompletableFuture<GetGraphResourceGraphResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * An Azure Cosmos DB Graph resource.
     * API Version: 2021-07-01-preview.
     * 
     *
         * An Azure Cosmos DB Graph resource.
     * 
     */
    public static CompletableFuture<GetGraphResourceGraphResult> invokeAsync(GetGraphResourceGraphArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:documentdb:getGraphResourceGraph", TypeShape.of(GetGraphResourceGraphResult.class), args == null ? GetGraphResourceGraphArgs.Empty : args, Utilities.withVersion(options));
    }
}