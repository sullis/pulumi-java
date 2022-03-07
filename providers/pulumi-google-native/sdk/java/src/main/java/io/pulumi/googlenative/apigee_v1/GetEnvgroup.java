// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.inputs.GetEnvgroupArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GetEnvgroupResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEnvgroup {
    private GetEnvgroup() {}
    public interface BuilderApplicator {
        public void apply(GetEnvgroupArgs.Builder a);
    }
    private static GetEnvgroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetEnvgroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets an environment group.
 * 
     */
    public static CompletableFuture<GetEnvgroupResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets an environment group.
     * 
     */
    public static CompletableFuture<GetEnvgroupResult> invokeAsync(GetEnvgroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:apigee/v1:getEnvgroup", TypeShape.of(GetEnvgroupResult.class), args == null ? GetEnvgroupArgs.Empty : args, Utilities.withVersion(options));
    }
}