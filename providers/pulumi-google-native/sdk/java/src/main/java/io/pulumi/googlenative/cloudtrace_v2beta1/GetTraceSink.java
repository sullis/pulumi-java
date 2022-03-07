// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtrace_v2beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudtrace_v2beta1.inputs.GetTraceSinkArgs;
import io.pulumi.googlenative.cloudtrace_v2beta1.outputs.GetTraceSinkResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTraceSink {
    private GetTraceSink() {}
    public interface BuilderApplicator {
        public void apply(GetTraceSinkArgs.Builder a);
    }
    private static GetTraceSinkArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetTraceSinkArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Get a trace sink by name under the parent resource (GCP project).
 * 
     */
    public static CompletableFuture<GetTraceSinkResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Get a trace sink by name under the parent resource (GCP project).
     * 
     */
    public static CompletableFuture<GetTraceSinkResult> invokeAsync(GetTraceSinkArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudtrace/v2beta1:getTraceSink", TypeShape.of(GetTraceSinkResult.class), args == null ? GetTraceSinkArgs.Empty : args, Utilities.withVersion(options));
    }
}