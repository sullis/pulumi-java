// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.GetAutoscalingPolicyArgs;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.GetAutoscalingPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAutoscalingPolicy {
    private GetAutoscalingPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetAutoscalingPolicyArgs.Builder a);
    }
    private static GetAutoscalingPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAutoscalingPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Retrieves autoscaling policy.
 * 
     */
    public static CompletableFuture<GetAutoscalingPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Retrieves autoscaling policy.
     * 
     */
    public static CompletableFuture<GetAutoscalingPolicyResult> invokeAsync(GetAutoscalingPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dataproc/v1beta2:getAutoscalingPolicy", TypeShape.of(GetAutoscalingPolicyResult.class), args == null ? GetAutoscalingPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}