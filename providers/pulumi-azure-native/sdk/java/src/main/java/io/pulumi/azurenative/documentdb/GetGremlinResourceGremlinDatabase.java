// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.inputs.GetGremlinResourceGremlinDatabaseArgs;
import io.pulumi.azurenative.documentdb.outputs.GetGremlinResourceGremlinDatabaseResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGremlinResourceGremlinDatabase {
    private GetGremlinResourceGremlinDatabase() {}
    public interface BuilderApplicator {
        public void apply(GetGremlinResourceGremlinDatabaseArgs.Builder a);
    }
    private static GetGremlinResourceGremlinDatabaseArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetGremlinResourceGremlinDatabaseArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * An Azure Cosmos DB Gremlin database.
 * API Version: 2021-03-15.
 * 
     *
     * An Azure Cosmos DB Gremlin database.
 * 
     */
    public static CompletableFuture<GetGremlinResourceGremlinDatabaseResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * An Azure Cosmos DB Gremlin database.
     * API Version: 2021-03-15.
     * 
     *
         * An Azure Cosmos DB Gremlin database.
     * 
     */
    public static CompletableFuture<GetGremlinResourceGremlinDatabaseResult> invokeAsync(GetGremlinResourceGremlinDatabaseArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:documentdb:getGremlinResourceGremlinDatabase", TypeShape.of(GetGremlinResourceGremlinDatabaseResult.class), args == null ? GetGremlinResourceGremlinDatabaseArgs.Empty : args, Utilities.withVersion(options));
    }
}