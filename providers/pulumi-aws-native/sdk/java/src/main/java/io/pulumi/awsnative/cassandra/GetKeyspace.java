// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cassandra;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cassandra.inputs.GetKeyspaceArgs;
import io.pulumi.awsnative.cassandra.outputs.GetKeyspaceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetKeyspace {
    private GetKeyspace() {}
    public interface BuilderApplicator {
        public void apply(GetKeyspaceArgs.Builder a);
    }
    private static GetKeyspaceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetKeyspaceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource schema for AWS::Cassandra::Keyspace
 * 
     */
    public static CompletableFuture<GetKeyspaceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource schema for AWS::Cassandra::Keyspace
     * 
     */
    public static CompletableFuture<GetKeyspaceResult> invokeAsync(GetKeyspaceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cassandra:getKeyspace", TypeShape.of(GetKeyspaceResult.class), args == null ? GetKeyspaceArgs.Empty : args, Utilities.withVersion(options));
    }
}