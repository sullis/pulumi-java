// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.gkehub_v1beta.inputs.GetFeatureArgs;
import io.pulumi.googlenative.gkehub_v1beta.outputs.GetFeatureResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFeature {
    private GetFeature() {}
    public interface BuilderApplicator {
        public void apply(GetFeatureArgs.Builder a);
    }
    private static GetFeatureArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetFeatureArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets details of a single Feature.
 * 
     */
    public static CompletableFuture<GetFeatureResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets details of a single Feature.
     * 
     */
    public static CompletableFuture<GetFeatureResult> invokeAsync(GetFeatureArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:gkehub/v1beta:getFeature", TypeShape.of(GetFeatureResult.class), args == null ? GetFeatureArgs.Empty : args, Utilities.withVersion(options));
    }
}