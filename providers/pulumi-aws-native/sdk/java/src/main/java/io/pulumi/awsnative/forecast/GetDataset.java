// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.forecast;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.forecast.inputs.GetDatasetArgs;
import io.pulumi.awsnative.forecast.outputs.GetDatasetResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDataset {
    private GetDataset() {}
    public interface BuilderApplicator {
        public void apply(GetDatasetArgs.Builder a);
    }
    private static GetDatasetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDatasetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource Type Definition for AWS::Forecast::Dataset
 * 
     */
    public static CompletableFuture<GetDatasetResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource Type Definition for AWS::Forecast::Dataset
     * 
     */
    public static CompletableFuture<GetDatasetResult> invokeAsync(GetDatasetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:forecast:getDataset", TypeShape.of(GetDatasetResult.class), args == null ? GetDatasetArgs.Empty : args, Utilities.withVersion(options));
    }
}