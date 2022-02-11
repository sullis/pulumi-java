// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.inputs.GetModelExplainabilityJobDefinitionArgs;
import io.pulumi.awsnative.sagemaker.outputs.GetModelExplainabilityJobDefinitionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetModelExplainabilityJobDefinition {
    public static CompletableFuture<GetModelExplainabilityJobDefinitionResult> invokeAsync(GetModelExplainabilityJobDefinitionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:sagemaker:getModelExplainabilityJobDefinition", TypeShape.of(GetModelExplainabilityJobDefinitionResult.class), args == null ? GetModelExplainabilityJobDefinitionArgs.Empty : args, Utilities.withVersion(options));
    }
}
