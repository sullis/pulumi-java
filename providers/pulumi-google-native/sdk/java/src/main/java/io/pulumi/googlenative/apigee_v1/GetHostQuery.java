// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.inputs.GetHostQueryArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GetHostQueryResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetHostQuery {
    private GetHostQuery() {}
    public interface BuilderApplicator {
        public void apply(GetHostQueryArgs.Builder a);
    }
    private static GetHostQueryArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetHostQueryArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Get status of a query submitted at host level. If the query is still in progress, the `state` is set to "running" After the query has completed successfully, `state` is set to "completed"
 * 
     */
    public static CompletableFuture<GetHostQueryResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Get status of a query submitted at host level. If the query is still in progress, the `state` is set to "running" After the query has completed successfully, `state` is set to "completed"
     * 
     */
    public static CompletableFuture<GetHostQueryResult> invokeAsync(GetHostQueryArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getHostQuery", TypeShape.of(GetHostQueryResult.class), args == null ? GetHostQueryArgs.Empty : args, Utilities.withVersion(options));
    }
}