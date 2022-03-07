// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.inputs.GetCassandraDataCenterArgs;
import io.pulumi.azurenative.documentdb.outputs.GetCassandraDataCenterResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCassandraDataCenter {
    private GetCassandraDataCenter() {}
    public interface BuilderApplicator {
        public void apply(GetCassandraDataCenterArgs.Builder a);
    }
    private static GetCassandraDataCenterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetCassandraDataCenterArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A managed Cassandra data center.
 * API Version: 2021-03-01-preview.
 * 
     *
     * A managed Cassandra data center.
 * 
     */
    public static CompletableFuture<GetCassandraDataCenterResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A managed Cassandra data center.
     * API Version: 2021-03-01-preview.
     * 
     *
         * A managed Cassandra data center.
     * 
     */
    public static CompletableFuture<GetCassandraDataCenterResult> invokeAsync(GetCassandraDataCenterArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:documentdb:getCassandraDataCenter", TypeShape.of(GetCassandraDataCenterResult.class), args == null ? GetCassandraDataCenterArgs.Empty : args, Utilities.withVersion(options));
    }
}