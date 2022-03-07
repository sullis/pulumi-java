// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearning.inputs.GetCommitmentPlanArgs;
import io.pulumi.azurenative.machinelearning.outputs.GetCommitmentPlanResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCommitmentPlan {
    private GetCommitmentPlan() {}
    public interface BuilderApplicator {
        public void apply(GetCommitmentPlanArgs.Builder a);
    }
    private static GetCommitmentPlanArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetCommitmentPlanArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * An Azure ML commitment plan resource.
 * API Version: 2016-05-01-preview.
 * 
     *
     * An Azure ML commitment plan resource.
 * 
     */
    public static CompletableFuture<GetCommitmentPlanResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * An Azure ML commitment plan resource.
     * API Version: 2016-05-01-preview.
     * 
     *
         * An Azure ML commitment plan resource.
     * 
     */
    public static CompletableFuture<GetCommitmentPlanResult> invokeAsync(GetCommitmentPlanArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearning:getCommitmentPlan", TypeShape.of(GetCommitmentPlanResult.class), args == null ? GetCommitmentPlanArgs.Empty : args, Utilities.withVersion(options));
    }
}