// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.inputs.GetQueryArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GetQueryResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetQuery {
    private GetQuery() {}
    public interface BuilderApplicator {
        public void apply(GetQueryArgs.Builder a);
    }
    private static GetQueryArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetQueryArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Get query status If the query is still in progress, the `state` is set to "running" After the query has completed successfully, `state` is set to "completed"
 * 
     */
    public static CompletableFuture<GetQueryResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Get query status If the query is still in progress, the `state` is set to "running" After the query has completed successfully, `state` is set to "completed"
     * 
     */
    public static CompletableFuture<GetQueryResult> invokeAsync(GetQueryArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getQuery", TypeShape.of(GetQueryResult.class), args == null ? GetQueryArgs.Empty : args, Utilities.withVersion(options));
    }
}