// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.ModelExplainabilityJobDefinitionArgs;
import io.pulumi.awsnative.sagemaker.outputs.ModelExplainabilityJobDefinitionModelExplainabilityAppSpecification;
import io.pulumi.awsnative.sagemaker.outputs.ModelExplainabilityJobDefinitionModelExplainabilityBaselineConfig;
import io.pulumi.awsnative.sagemaker.outputs.ModelExplainabilityJobDefinitionModelExplainabilityJobInput;
import io.pulumi.awsnative.sagemaker.outputs.ModelExplainabilityJobDefinitionMonitoringOutputConfig;
import io.pulumi.awsnative.sagemaker.outputs.ModelExplainabilityJobDefinitionMonitoringResources;
import io.pulumi.awsnative.sagemaker.outputs.ModelExplainabilityJobDefinitionNetworkConfig;
import io.pulumi.awsnative.sagemaker.outputs.ModelExplainabilityJobDefinitionStoppingCondition;
import io.pulumi.awsnative.sagemaker.outputs.ModelExplainabilityJobDefinitionTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SageMaker::ModelExplainabilityJobDefinition
 * 
 */
@ResourceType(type="aws-native:sagemaker:ModelExplainabilityJobDefinition")
public class ModelExplainabilityJobDefinition extends io.pulumi.resources.CustomResource {
    /**
     * The time at which the job definition was created.
     * 
     */
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The time at which the job definition was created.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * The Amazon Resource Name (ARN) of job definition.
     * 
     */
    @OutputExport(name="jobDefinitionArn", type=String.class, parameters={})
    private Output<String> jobDefinitionArn;

    /**
     * @return The Amazon Resource Name (ARN) of job definition.
     * 
     */
    public Output<String> getJobDefinitionArn() {
        return this.jobDefinitionArn;
    }
    @OutputExport(name="jobDefinitionName", type=String.class, parameters={})
    private Output</* @Nullable */ String> jobDefinitionName;

    public Output</* @Nullable */ String> getJobDefinitionName() {
        return this.jobDefinitionName;
    }
    @OutputExport(name="jobResources", type=ModelExplainabilityJobDefinitionMonitoringResources.class, parameters={})
    private Output<ModelExplainabilityJobDefinitionMonitoringResources> jobResources;

    public Output<ModelExplainabilityJobDefinitionMonitoringResources> getJobResources() {
        return this.jobResources;
    }
    @OutputExport(name="modelExplainabilityAppSpecification", type=ModelExplainabilityJobDefinitionModelExplainabilityAppSpecification.class, parameters={})
    private Output<ModelExplainabilityJobDefinitionModelExplainabilityAppSpecification> modelExplainabilityAppSpecification;

    public Output<ModelExplainabilityJobDefinitionModelExplainabilityAppSpecification> getModelExplainabilityAppSpecification() {
        return this.modelExplainabilityAppSpecification;
    }
    @OutputExport(name="modelExplainabilityBaselineConfig", type=ModelExplainabilityJobDefinitionModelExplainabilityBaselineConfig.class, parameters={})
    private Output</* @Nullable */ ModelExplainabilityJobDefinitionModelExplainabilityBaselineConfig> modelExplainabilityBaselineConfig;

    public Output</* @Nullable */ ModelExplainabilityJobDefinitionModelExplainabilityBaselineConfig> getModelExplainabilityBaselineConfig() {
        return this.modelExplainabilityBaselineConfig;
    }
    @OutputExport(name="modelExplainabilityJobInput", type=ModelExplainabilityJobDefinitionModelExplainabilityJobInput.class, parameters={})
    private Output<ModelExplainabilityJobDefinitionModelExplainabilityJobInput> modelExplainabilityJobInput;

    public Output<ModelExplainabilityJobDefinitionModelExplainabilityJobInput> getModelExplainabilityJobInput() {
        return this.modelExplainabilityJobInput;
    }
    @OutputExport(name="modelExplainabilityJobOutputConfig", type=ModelExplainabilityJobDefinitionMonitoringOutputConfig.class, parameters={})
    private Output<ModelExplainabilityJobDefinitionMonitoringOutputConfig> modelExplainabilityJobOutputConfig;

    public Output<ModelExplainabilityJobDefinitionMonitoringOutputConfig> getModelExplainabilityJobOutputConfig() {
        return this.modelExplainabilityJobOutputConfig;
    }
    @OutputExport(name="networkConfig", type=ModelExplainabilityJobDefinitionNetworkConfig.class, parameters={})
    private Output</* @Nullable */ ModelExplainabilityJobDefinitionNetworkConfig> networkConfig;

    public Output</* @Nullable */ ModelExplainabilityJobDefinitionNetworkConfig> getNetworkConfig() {
        return this.networkConfig;
    }
    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    @OutputExport(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    @OutputExport(name="stoppingCondition", type=ModelExplainabilityJobDefinitionStoppingCondition.class, parameters={})
    private Output</* @Nullable */ ModelExplainabilityJobDefinitionStoppingCondition> stoppingCondition;

    public Output</* @Nullable */ ModelExplainabilityJobDefinitionStoppingCondition> getStoppingCondition() {
        return this.stoppingCondition;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={ModelExplainabilityJobDefinitionTag.class})
    private Output</* @Nullable */ List<ModelExplainabilityJobDefinitionTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<ModelExplainabilityJobDefinitionTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ModelExplainabilityJobDefinition(String name, ModelExplainabilityJobDefinitionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:ModelExplainabilityJobDefinition", name, args == null ? ModelExplainabilityJobDefinitionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ModelExplainabilityJobDefinition(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:ModelExplainabilityJobDefinition", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ModelExplainabilityJobDefinition get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ModelExplainabilityJobDefinition(name, id, options);
    }
}
