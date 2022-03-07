// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaseml_v1beta2;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.firebaseml_v1beta2.inputs.GetModelArgs;
import io.pulumi.googlenative.firebaseml_v1beta2.outputs.GetModelResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetModel {
    private GetModel() {}
    public interface BuilderApplicator {
        public void apply(GetModelArgs.Builder a);
    }
    private static GetModelArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetModelArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets a model resource.
 * 
     */
    public static CompletableFuture<GetModelResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets a model resource.
     * 
     */
    public static CompletableFuture<GetModelResult> invokeAsync(GetModelArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:firebaseml/v1beta2:getModel", TypeShape.of(GetModelResult.class), args == null ? GetModelArgs.Empty : args, Utilities.withVersion(options));
    }
}