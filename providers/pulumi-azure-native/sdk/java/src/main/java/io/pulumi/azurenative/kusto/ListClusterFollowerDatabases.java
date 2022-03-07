// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.kusto.inputs.ListClusterFollowerDatabasesArgs;
import io.pulumi.azurenative.kusto.outputs.ListClusterFollowerDatabasesResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListClusterFollowerDatabases {
    private ListClusterFollowerDatabases() {}
    public interface BuilderApplicator {
        public void apply(ListClusterFollowerDatabasesArgs.Builder a);
    }
    private static ListClusterFollowerDatabasesArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListClusterFollowerDatabasesArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The list Kusto database principals operation response.
 * API Version: 2021-01-01.
 * 
     *
     * The list Kusto database principals operation response.
 * 
     */
    public static CompletableFuture<ListClusterFollowerDatabasesResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The list Kusto database principals operation response.
     * API Version: 2021-01-01.
     * 
     *
         * The list Kusto database principals operation response.
     * 
     */
    public static CompletableFuture<ListClusterFollowerDatabasesResult> invokeAsync(ListClusterFollowerDatabasesArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:listClusterFollowerDatabases", TypeShape.of(ListClusterFollowerDatabasesResult.class), args == null ? ListClusterFollowerDatabasesArgs.Empty : args, Utilities.withVersion(options));
    }
}