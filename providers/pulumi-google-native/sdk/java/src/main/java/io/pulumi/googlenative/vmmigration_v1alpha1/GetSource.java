// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.vmmigration_v1alpha1.inputs.GetSourceArgs;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.GetSourceResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSource {
    private GetSource() {}
    public interface BuilderApplicator {
        public void apply(GetSourceArgs.Builder a);
    }
    private static GetSourceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetSourceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets details of a single Source.
 * 
     */
    public static CompletableFuture<GetSourceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets details of a single Source.
     * 
     */
    public static CompletableFuture<GetSourceResult> invokeAsync(GetSourceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:vmmigration/v1alpha1:getSource", TypeShape.of(GetSourceResult.class), args == null ? GetSourceArgs.Empty : args, Utilities.withVersion(options));
    }
}