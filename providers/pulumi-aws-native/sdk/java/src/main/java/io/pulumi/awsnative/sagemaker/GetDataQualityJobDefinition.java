// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.inputs.GetDataQualityJobDefinitionArgs;
import io.pulumi.awsnative.sagemaker.outputs.GetDataQualityJobDefinitionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDataQualityJobDefinition {
    public static CompletableFuture<GetDataQualityJobDefinitionResult> invokeAsync(GetDataQualityJobDefinitionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:sagemaker:getDataQualityJobDefinition", TypeShape.of(GetDataQualityJobDefinitionResult.class), args == null ? GetDataQualityJobDefinitionArgs.Empty : args, Utilities.withVersion(options));
    }
}
