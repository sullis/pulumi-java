// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.databrew.inputs.GetDatasetArgs;
import io.pulumi.awsnative.databrew.outputs.GetDatasetResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDataset {
/**
 * Resource schema for AWS::DataBrew::Dataset.
 * 
 */
    public static CompletableFuture<GetDatasetResult> invokeAsync(GetDatasetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:databrew:getDataset", TypeShape.of(GetDatasetResult.class), args == null ? GetDatasetArgs.Empty : args, Utilities.withVersion(options));
    }
}
