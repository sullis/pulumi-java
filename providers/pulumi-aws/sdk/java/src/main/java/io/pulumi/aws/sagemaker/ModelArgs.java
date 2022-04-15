// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.sagemaker.inputs.ModelContainerArgs;
import io.pulumi.aws.sagemaker.inputs.ModelInferenceExecutionConfigArgs;
import io.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerArgs;
import io.pulumi.aws.sagemaker.inputs.ModelVpcConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelArgs Empty = new ModelArgs();

    /**
     * Specifies containers in the inference pipeline. If not specified, the `primary_container` argument is required. Fields are documented below.
     * 
     */
    @Import(name="containers")
      private final @Nullable Output<List<ModelContainerArgs>> containers;

    public Output<List<ModelContainerArgs>> containers() {
        return this.containers == null ? Codegen.empty() : this.containers;
    }

    /**
     * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
     * 
     */
    @Import(name="enableNetworkIsolation")
      private final @Nullable Output<Boolean> enableNetworkIsolation;

    public Output<Boolean> enableNetworkIsolation() {
        return this.enableNetworkIsolation == null ? Codegen.empty() : this.enableNetworkIsolation;
    }

    /**
     * A role that SageMaker can assume to access model artifacts and docker images for deployment.
     * 
     */
    @Import(name="executionRoleArn", required=true)
      private final Output<String> executionRoleArn;

    public Output<String> executionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * Specifies details of how containers in a multi-container endpoint are called. see Inference Execution Config.
     * 
     */
    @Import(name="inferenceExecutionConfig")
      private final @Nullable Output<ModelInferenceExecutionConfigArgs> inferenceExecutionConfig;

    public Output<ModelInferenceExecutionConfigArgs> inferenceExecutionConfig() {
        return this.inferenceExecutionConfig == null ? Codegen.empty() : this.inferenceExecutionConfig;
    }

    /**
     * The name of the model (must be unique). If omitted, this provider will assign a random, unique name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
     * 
     */
    @Import(name="primaryContainer")
      private final @Nullable Output<ModelPrimaryContainerArgs> primaryContainer;

    public Output<ModelPrimaryContainerArgs> primaryContainer() {
        return this.primaryContainer == null ? Codegen.empty() : this.primaryContainer;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
     * 
     */
    @Import(name="vpcConfig")
      private final @Nullable Output<ModelVpcConfigArgs> vpcConfig;

    public Output<ModelVpcConfigArgs> vpcConfig() {
        return this.vpcConfig == null ? Codegen.empty() : this.vpcConfig;
    }

    public ModelArgs(
        @Nullable Output<List<ModelContainerArgs>> containers,
        @Nullable Output<Boolean> enableNetworkIsolation,
        Output<String> executionRoleArn,
        @Nullable Output<ModelInferenceExecutionConfigArgs> inferenceExecutionConfig,
        @Nullable Output<String> name,
        @Nullable Output<ModelPrimaryContainerArgs> primaryContainer,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<ModelVpcConfigArgs> vpcConfig) {
        this.containers = containers;
        this.enableNetworkIsolation = enableNetworkIsolation;
        this.executionRoleArn = Objects.requireNonNull(executionRoleArn, "expected parameter 'executionRoleArn' to be non-null");
        this.inferenceExecutionConfig = inferenceExecutionConfig;
        this.name = name;
        this.primaryContainer = primaryContainer;
        this.tags = tags;
        this.vpcConfig = vpcConfig;
    }

    private ModelArgs() {
        this.containers = Codegen.empty();
        this.enableNetworkIsolation = Codegen.empty();
        this.executionRoleArn = Codegen.empty();
        this.inferenceExecutionConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.primaryContainer = Codegen.empty();
        this.tags = Codegen.empty();
        this.vpcConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ModelContainerArgs>> containers;
        private @Nullable Output<Boolean> enableNetworkIsolation;
        private Output<String> executionRoleArn;
        private @Nullable Output<ModelInferenceExecutionConfigArgs> inferenceExecutionConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<ModelPrimaryContainerArgs> primaryContainer;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<ModelVpcConfigArgs> vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containers = defaults.containers;
    	      this.enableNetworkIsolation = defaults.enableNetworkIsolation;
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.inferenceExecutionConfig = defaults.inferenceExecutionConfig;
    	      this.name = defaults.name;
    	      this.primaryContainer = defaults.primaryContainer;
    	      this.tags = defaults.tags;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder containers(@Nullable Output<List<ModelContainerArgs>> containers) {
            this.containers = containers;
            return this;
        }
        public Builder containers(@Nullable List<ModelContainerArgs> containers) {
            this.containers = Codegen.ofNullable(containers);
            return this;
        }
        public Builder containers(ModelContainerArgs... containers) {
            return containers(List.of(containers));
        }
        public Builder enableNetworkIsolation(@Nullable Output<Boolean> enableNetworkIsolation) {
            this.enableNetworkIsolation = enableNetworkIsolation;
            return this;
        }
        public Builder enableNetworkIsolation(@Nullable Boolean enableNetworkIsolation) {
            this.enableNetworkIsolation = Codegen.ofNullable(enableNetworkIsolation);
            return this;
        }
        public Builder executionRoleArn(Output<String> executionRoleArn) {
            this.executionRoleArn = Objects.requireNonNull(executionRoleArn);
            return this;
        }
        public Builder executionRoleArn(String executionRoleArn) {
            this.executionRoleArn = Output.of(Objects.requireNonNull(executionRoleArn));
            return this;
        }
        public Builder inferenceExecutionConfig(@Nullable Output<ModelInferenceExecutionConfigArgs> inferenceExecutionConfig) {
            this.inferenceExecutionConfig = inferenceExecutionConfig;
            return this;
        }
        public Builder inferenceExecutionConfig(@Nullable ModelInferenceExecutionConfigArgs inferenceExecutionConfig) {
            this.inferenceExecutionConfig = Codegen.ofNullable(inferenceExecutionConfig);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder primaryContainer(@Nullable Output<ModelPrimaryContainerArgs> primaryContainer) {
            this.primaryContainer = primaryContainer;
            return this;
        }
        public Builder primaryContainer(@Nullable ModelPrimaryContainerArgs primaryContainer) {
            this.primaryContainer = Codegen.ofNullable(primaryContainer);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder vpcConfig(@Nullable Output<ModelVpcConfigArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public Builder vpcConfig(@Nullable ModelVpcConfigArgs vpcConfig) {
            this.vpcConfig = Codegen.ofNullable(vpcConfig);
            return this;
        }        public ModelArgs build() {
            return new ModelArgs(containers, enableNetworkIsolation, executionRoleArn, inferenceExecutionConfig, name, primaryContainer, tags, vpcConfig);
        }
    }
}
