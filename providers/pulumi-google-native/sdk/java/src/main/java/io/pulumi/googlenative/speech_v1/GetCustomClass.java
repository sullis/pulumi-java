// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.speech_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.speech_v1.inputs.GetCustomClassArgs;
import io.pulumi.googlenative.speech_v1.outputs.GetCustomClassResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCustomClass {
    private GetCustomClass() {}
    public interface BuilderApplicator {
        public void apply(GetCustomClassArgs.Builder a);
    }
    private static GetCustomClassArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetCustomClassArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Get a custom class.
 * 
     */
    public static CompletableFuture<GetCustomClassResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Get a custom class.
     * 
     */
    public static CompletableFuture<GetCustomClassResult> invokeAsync(GetCustomClassArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:speech/v1:getCustomClass", TypeShape.of(GetCustomClassResult.class), args == null ? GetCustomClassArgs.Empty : args, Utilities.withVersion(options));
    }
}