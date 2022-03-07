// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1alpha1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.networkconnectivity_v1alpha1.inputs.GetHubArgs;
import io.pulumi.googlenative.networkconnectivity_v1alpha1.outputs.GetHubResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetHub {
    private GetHub() {}
    public interface BuilderApplicator {
        public void apply(GetHubArgs.Builder a);
    }
    private static GetHubArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetHubArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets details of a single Hub.
 * 
     */
    public static CompletableFuture<GetHubResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets details of a single Hub.
     * 
     */
    public static CompletableFuture<GetHubResult> invokeAsync(GetHubArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkconnectivity/v1alpha1:getHub", TypeShape.of(GetHubResult.class), args == null ? GetHubArgs.Empty : args, Utilities.withVersion(options));
    }
}