// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.sagemaker.inputs.ModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationArgs;
import io.pulumi.awsnative.sagemaker.inputs.ModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigArgs;
import io.pulumi.awsnative.sagemaker.inputs.ModelExplainabilityJobDefinitionModelExplainabilityJobInputArgs;
import io.pulumi.awsnative.sagemaker.inputs.ModelExplainabilityJobDefinitionMonitoringOutputConfigArgs;
import io.pulumi.awsnative.sagemaker.inputs.ModelExplainabilityJobDefinitionMonitoringResourcesArgs;
import io.pulumi.awsnative.sagemaker.inputs.ModelExplainabilityJobDefinitionNetworkConfigArgs;
import io.pulumi.awsnative.sagemaker.inputs.ModelExplainabilityJobDefinitionStoppingConditionArgs;
import io.pulumi.awsnative.sagemaker.inputs.ModelExplainabilityJobDefinitionTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModelExplainabilityJobDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelExplainabilityJobDefinitionArgs Empty = new ModelExplainabilityJobDefinitionArgs();

    @InputImport(name="jobDefinitionName")
    private final @Nullable Input<String> jobDefinitionName;

    public Input<String> getJobDefinitionName() {
        return this.jobDefinitionName == null ? Input.empty() : this.jobDefinitionName;
    }

    @InputImport(name="jobResources", required=true)
    private final Input<ModelExplainabilityJobDefinitionMonitoringResourcesArgs> jobResources;

    public Input<ModelExplainabilityJobDefinitionMonitoringResourcesArgs> getJobResources() {
        return this.jobResources;
    }

    @InputImport(name="modelExplainabilityAppSpecification", required=true)
    private final Input<ModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationArgs> modelExplainabilityAppSpecification;

    public Input<ModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationArgs> getModelExplainabilityAppSpecification() {
        return this.modelExplainabilityAppSpecification;
    }

    @InputImport(name="modelExplainabilityBaselineConfig")
    private final @Nullable Input<ModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigArgs> modelExplainabilityBaselineConfig;

    public Input<ModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigArgs> getModelExplainabilityBaselineConfig() {
        return this.modelExplainabilityBaselineConfig == null ? Input.empty() : this.modelExplainabilityBaselineConfig;
    }

    @InputImport(name="modelExplainabilityJobInput", required=true)
    private final Input<ModelExplainabilityJobDefinitionModelExplainabilityJobInputArgs> modelExplainabilityJobInput;

    public Input<ModelExplainabilityJobDefinitionModelExplainabilityJobInputArgs> getModelExplainabilityJobInput() {
        return this.modelExplainabilityJobInput;
    }

    @InputImport(name="modelExplainabilityJobOutputConfig", required=true)
    private final Input<ModelExplainabilityJobDefinitionMonitoringOutputConfigArgs> modelExplainabilityJobOutputConfig;

    public Input<ModelExplainabilityJobDefinitionMonitoringOutputConfigArgs> getModelExplainabilityJobOutputConfig() {
        return this.modelExplainabilityJobOutputConfig;
    }

    @InputImport(name="networkConfig")
    private final @Nullable Input<ModelExplainabilityJobDefinitionNetworkConfigArgs> networkConfig;

    public Input<ModelExplainabilityJobDefinitionNetworkConfigArgs> getNetworkConfig() {
        return this.networkConfig == null ? Input.empty() : this.networkConfig;
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    @InputImport(name="roleArn", required=true)
    private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    @InputImport(name="stoppingCondition")
    private final @Nullable Input<ModelExplainabilityJobDefinitionStoppingConditionArgs> stoppingCondition;

    public Input<ModelExplainabilityJobDefinitionStoppingConditionArgs> getStoppingCondition() {
        return this.stoppingCondition == null ? Input.empty() : this.stoppingCondition;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<ModelExplainabilityJobDefinitionTagArgs>> tags;

    public Input<List<ModelExplainabilityJobDefinitionTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ModelExplainabilityJobDefinitionArgs(
        @Nullable Input<String> jobDefinitionName,
        Input<ModelExplainabilityJobDefinitionMonitoringResourcesArgs> jobResources,
        Input<ModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationArgs> modelExplainabilityAppSpecification,
        @Nullable Input<ModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigArgs> modelExplainabilityBaselineConfig,
        Input<ModelExplainabilityJobDefinitionModelExplainabilityJobInputArgs> modelExplainabilityJobInput,
        Input<ModelExplainabilityJobDefinitionMonitoringOutputConfigArgs> modelExplainabilityJobOutputConfig,
        @Nullable Input<ModelExplainabilityJobDefinitionNetworkConfigArgs> networkConfig,
        Input<String> roleArn,
        @Nullable Input<ModelExplainabilityJobDefinitionStoppingConditionArgs> stoppingCondition,
        @Nullable Input<List<ModelExplainabilityJobDefinitionTagArgs>> tags) {
        this.jobDefinitionName = jobDefinitionName;
        this.jobResources = Objects.requireNonNull(jobResources, "expected parameter 'jobResources' to be non-null");
        this.modelExplainabilityAppSpecification = Objects.requireNonNull(modelExplainabilityAppSpecification, "expected parameter 'modelExplainabilityAppSpecification' to be non-null");
        this.modelExplainabilityBaselineConfig = modelExplainabilityBaselineConfig;
        this.modelExplainabilityJobInput = Objects.requireNonNull(modelExplainabilityJobInput, "expected parameter 'modelExplainabilityJobInput' to be non-null");
        this.modelExplainabilityJobOutputConfig = Objects.requireNonNull(modelExplainabilityJobOutputConfig, "expected parameter 'modelExplainabilityJobOutputConfig' to be non-null");
        this.networkConfig = networkConfig;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.stoppingCondition = stoppingCondition;
        this.tags = tags;
    }

    private ModelExplainabilityJobDefinitionArgs() {
        this.jobDefinitionName = Input.empty();
        this.jobResources = Input.empty();
        this.modelExplainabilityAppSpecification = Input.empty();
        this.modelExplainabilityBaselineConfig = Input.empty();
        this.modelExplainabilityJobInput = Input.empty();
        this.modelExplainabilityJobOutputConfig = Input.empty();
        this.networkConfig = Input.empty();
        this.roleArn = Input.empty();
        this.stoppingCondition = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelExplainabilityJobDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> jobDefinitionName;
        private Input<ModelExplainabilityJobDefinitionMonitoringResourcesArgs> jobResources;
        private Input<ModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationArgs> modelExplainabilityAppSpecification;
        private @Nullable Input<ModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigArgs> modelExplainabilityBaselineConfig;
        private Input<ModelExplainabilityJobDefinitionModelExplainabilityJobInputArgs> modelExplainabilityJobInput;
        private Input<ModelExplainabilityJobDefinitionMonitoringOutputConfigArgs> modelExplainabilityJobOutputConfig;
        private @Nullable Input<ModelExplainabilityJobDefinitionNetworkConfigArgs> networkConfig;
        private Input<String> roleArn;
        private @Nullable Input<ModelExplainabilityJobDefinitionStoppingConditionArgs> stoppingCondition;
        private @Nullable Input<List<ModelExplainabilityJobDefinitionTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelExplainabilityJobDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobDefinitionName = defaults.jobDefinitionName;
    	      this.jobResources = defaults.jobResources;
    	      this.modelExplainabilityAppSpecification = defaults.modelExplainabilityAppSpecification;
    	      this.modelExplainabilityBaselineConfig = defaults.modelExplainabilityBaselineConfig;
    	      this.modelExplainabilityJobInput = defaults.modelExplainabilityJobInput;
    	      this.modelExplainabilityJobOutputConfig = defaults.modelExplainabilityJobOutputConfig;
    	      this.networkConfig = defaults.networkConfig;
    	      this.roleArn = defaults.roleArn;
    	      this.stoppingCondition = defaults.stoppingCondition;
    	      this.tags = defaults.tags;
        }

        public Builder setJobDefinitionName(@Nullable Input<String> jobDefinitionName) {
            this.jobDefinitionName = jobDefinitionName;
            return this;
        }

        public Builder setJobDefinitionName(@Nullable String jobDefinitionName) {
            this.jobDefinitionName = Input.ofNullable(jobDefinitionName);
            return this;
        }

        public Builder setJobResources(Input<ModelExplainabilityJobDefinitionMonitoringResourcesArgs> jobResources) {
            this.jobResources = Objects.requireNonNull(jobResources);
            return this;
        }

        public Builder setJobResources(ModelExplainabilityJobDefinitionMonitoringResourcesArgs jobResources) {
            this.jobResources = Input.of(Objects.requireNonNull(jobResources));
            return this;
        }

        public Builder setModelExplainabilityAppSpecification(Input<ModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationArgs> modelExplainabilityAppSpecification) {
            this.modelExplainabilityAppSpecification = Objects.requireNonNull(modelExplainabilityAppSpecification);
            return this;
        }

        public Builder setModelExplainabilityAppSpecification(ModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationArgs modelExplainabilityAppSpecification) {
            this.modelExplainabilityAppSpecification = Input.of(Objects.requireNonNull(modelExplainabilityAppSpecification));
            return this;
        }

        public Builder setModelExplainabilityBaselineConfig(@Nullable Input<ModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigArgs> modelExplainabilityBaselineConfig) {
            this.modelExplainabilityBaselineConfig = modelExplainabilityBaselineConfig;
            return this;
        }

        public Builder setModelExplainabilityBaselineConfig(@Nullable ModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigArgs modelExplainabilityBaselineConfig) {
            this.modelExplainabilityBaselineConfig = Input.ofNullable(modelExplainabilityBaselineConfig);
            return this;
        }

        public Builder setModelExplainabilityJobInput(Input<ModelExplainabilityJobDefinitionModelExplainabilityJobInputArgs> modelExplainabilityJobInput) {
            this.modelExplainabilityJobInput = Objects.requireNonNull(modelExplainabilityJobInput);
            return this;
        }

        public Builder setModelExplainabilityJobInput(ModelExplainabilityJobDefinitionModelExplainabilityJobInputArgs modelExplainabilityJobInput) {
            this.modelExplainabilityJobInput = Input.of(Objects.requireNonNull(modelExplainabilityJobInput));
            return this;
        }

        public Builder setModelExplainabilityJobOutputConfig(Input<ModelExplainabilityJobDefinitionMonitoringOutputConfigArgs> modelExplainabilityJobOutputConfig) {
            this.modelExplainabilityJobOutputConfig = Objects.requireNonNull(modelExplainabilityJobOutputConfig);
            return this;
        }

        public Builder setModelExplainabilityJobOutputConfig(ModelExplainabilityJobDefinitionMonitoringOutputConfigArgs modelExplainabilityJobOutputConfig) {
            this.modelExplainabilityJobOutputConfig = Input.of(Objects.requireNonNull(modelExplainabilityJobOutputConfig));
            return this;
        }

        public Builder setNetworkConfig(@Nullable Input<ModelExplainabilityJobDefinitionNetworkConfigArgs> networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        public Builder setNetworkConfig(@Nullable ModelExplainabilityJobDefinitionNetworkConfigArgs networkConfig) {
            this.networkConfig = Input.ofNullable(networkConfig);
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setStoppingCondition(@Nullable Input<ModelExplainabilityJobDefinitionStoppingConditionArgs> stoppingCondition) {
            this.stoppingCondition = stoppingCondition;
            return this;
        }

        public Builder setStoppingCondition(@Nullable ModelExplainabilityJobDefinitionStoppingConditionArgs stoppingCondition) {
            this.stoppingCondition = Input.ofNullable(stoppingCondition);
            return this;
        }

        public Builder setTags(@Nullable Input<List<ModelExplainabilityJobDefinitionTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ModelExplainabilityJobDefinitionTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ModelExplainabilityJobDefinitionArgs build() {
            return new ModelExplainabilityJobDefinitionArgs(jobDefinitionName, jobResources, modelExplainabilityAppSpecification, modelExplainabilityBaselineConfig, modelExplainabilityJobInput, modelExplainabilityJobOutputConfig, networkConfig, roleArn, stoppingCondition, tags);
        }
    }
}
