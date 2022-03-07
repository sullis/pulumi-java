// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.inputs.GetTargetServerArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GetTargetServerResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTargetServer {
    private GetTargetServer() {}
    public interface BuilderApplicator {
        public void apply(GetTargetServerArgs.Builder a);
    }
    private static GetTargetServerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetTargetServerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets a TargetServer resource.
 * 
     */
    public static CompletableFuture<GetTargetServerResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets a TargetServer resource.
     * 
     */
    public static CompletableFuture<GetTargetServerResult> invokeAsync(GetTargetServerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getTargetServer", TypeShape.of(GetTargetServerResult.class), args == null ? GetTargetServerArgs.Empty : args, Utilities.withVersion(options));
    }
}