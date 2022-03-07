// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.inputs.GetModelQualityJobDefinitionArgs;
import io.pulumi.awsnative.sagemaker.outputs.GetModelQualityJobDefinitionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetModelQualityJobDefinition {
    private GetModelQualityJobDefinition() {}
    public interface BuilderApplicator {
        public void apply(GetModelQualityJobDefinitionArgs.Builder a);
    }
    private static GetModelQualityJobDefinitionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetModelQualityJobDefinitionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource Type definition for AWS::SageMaker::ModelQualityJobDefinition
 * 
     */
    public static CompletableFuture<GetModelQualityJobDefinitionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource Type definition for AWS::SageMaker::ModelQualityJobDefinition
     * 
     */
    public static CompletableFuture<GetModelQualityJobDefinitionResult> invokeAsync(GetModelQualityJobDefinitionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:sagemaker:getModelQualityJobDefinition", TypeShape.of(GetModelQualityJobDefinitionResult.class), args == null ? GetModelQualityJobDefinitionArgs.Empty : args, Utilities.withVersion(options));
    }
}