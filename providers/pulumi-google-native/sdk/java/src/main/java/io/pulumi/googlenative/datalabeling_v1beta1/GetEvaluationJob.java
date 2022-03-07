// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GetEvaluationJobArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.outputs.GetEvaluationJobResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEvaluationJob {
    private GetEvaluationJob() {}
    public interface BuilderApplicator {
        public void apply(GetEvaluationJobArgs.Builder a);
    }
    private static GetEvaluationJobArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetEvaluationJobArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets an evaluation job by resource name.
 * 
     */
    public static CompletableFuture<GetEvaluationJobResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets an evaluation job by resource name.
     * 
     */
    public static CompletableFuture<GetEvaluationJobResult> invokeAsync(GetEvaluationJobArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datalabeling/v1beta1:getEvaluationJob", TypeShape.of(GetEvaluationJobResult.class), args == null ? GetEvaluationJobArgs.Empty : args, Utilities.withVersion(options));
    }
}