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
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:sagemaker:ModelExplainabilityJobDefinition")
public class ModelExplainabilityJobDefinition extends io.pulumi.resources.CustomResource {
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    @OutputExport(name="jobDefinitionArn", type=String.class, parameters={})
    private Output<String> jobDefinitionArn;

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
    @OutputExport(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    @OutputExport(name="stoppingCondition", type=ModelExplainabilityJobDefinitionStoppingCondition.class, parameters={})
    private Output</* @Nullable */ ModelExplainabilityJobDefinitionStoppingCondition> stoppingCondition;

    public Output</* @Nullable */ ModelExplainabilityJobDefinitionStoppingCondition> getStoppingCondition() {
        return this.stoppingCondition;
    }
    @OutputExport(name="tags", type=List.class, parameters={ModelExplainabilityJobDefinitionTag.class})
    private Output</* @Nullable */ List<ModelExplainabilityJobDefinitionTag>> tags;

    public Output</* @Nullable */ List<ModelExplainabilityJobDefinitionTag>> getTags() {
        return this.tags;
    }

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

    public static ModelExplainabilityJobDefinition get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ModelExplainabilityJobDefinition(name, id, options);
    }
}
