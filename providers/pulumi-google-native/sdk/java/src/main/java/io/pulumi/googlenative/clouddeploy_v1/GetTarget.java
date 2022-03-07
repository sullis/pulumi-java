// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.clouddeploy_v1.inputs.GetTargetArgs;
import io.pulumi.googlenative.clouddeploy_v1.outputs.GetTargetResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTarget {
    private GetTarget() {}
    public interface BuilderApplicator {
        public void apply(GetTargetArgs.Builder a);
    }
    private static GetTargetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetTargetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets details of a single Target.
 * 
     */
    public static CompletableFuture<GetTargetResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets details of a single Target.
     * 
     */
    public static CompletableFuture<GetTargetResult> invokeAsync(GetTargetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:clouddeploy/v1:getTarget", TypeShape.of(GetTargetResult.class), args == null ? GetTargetArgs.Empty : args, Utilities.withVersion(options));
    }
}