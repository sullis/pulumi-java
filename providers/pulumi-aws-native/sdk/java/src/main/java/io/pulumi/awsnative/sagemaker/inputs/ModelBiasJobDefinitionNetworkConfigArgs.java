// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.ModelBiasJobDefinitionVpcConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Networking options for a job, such as network traffic encryption between containers, whether to allow inbound and outbound network calls to and from containers, and the VPC subnets and security groups to use for VPC-enabled jobs.
 * 
 */
public final class ModelBiasJobDefinitionNetworkConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelBiasJobDefinitionNetworkConfigArgs Empty = new ModelBiasJobDefinitionNetworkConfigArgs();

    /**
     * Whether to encrypt all communications between distributed processing jobs. Choose True to encrypt communications. Encryption provides greater security for distributed processing jobs, but the processing might take longer.
     * 
     */
    @Import(name="enableInterContainerTrafficEncryption")
      private final @Nullable Output<Boolean> enableInterContainerTrafficEncryption;

    public Output<Boolean> enableInterContainerTrafficEncryption() {
        return this.enableInterContainerTrafficEncryption == null ? Codegen.empty() : this.enableInterContainerTrafficEncryption;
    }

    /**
     * Whether to allow inbound and outbound network calls to and from the containers used for the processing job.
     * 
     */
    @Import(name="enableNetworkIsolation")
      private final @Nullable Output<Boolean> enableNetworkIsolation;

    public Output<Boolean> enableNetworkIsolation() {
        return this.enableNetworkIsolation == null ? Codegen.empty() : this.enableNetworkIsolation;
    }

    @Import(name="vpcConfig")
      private final @Nullable Output<ModelBiasJobDefinitionVpcConfigArgs> vpcConfig;

    public Output<ModelBiasJobDefinitionVpcConfigArgs> vpcConfig() {
        return this.vpcConfig == null ? Codegen.empty() : this.vpcConfig;
    }

    public ModelBiasJobDefinitionNetworkConfigArgs(
        @Nullable Output<Boolean> enableInterContainerTrafficEncryption,
        @Nullable Output<Boolean> enableNetworkIsolation,
        @Nullable Output<ModelBiasJobDefinitionVpcConfigArgs> vpcConfig) {
        this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
        this.enableNetworkIsolation = enableNetworkIsolation;
        this.vpcConfig = vpcConfig;
    }

    private ModelBiasJobDefinitionNetworkConfigArgs() {
        this.enableInterContainerTrafficEncryption = Codegen.empty();
        this.enableNetworkIsolation = Codegen.empty();
        this.vpcConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelBiasJobDefinitionNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableInterContainerTrafficEncryption;
        private @Nullable Output<Boolean> enableNetworkIsolation;
        private @Nullable Output<ModelBiasJobDefinitionVpcConfigArgs> vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelBiasJobDefinitionNetworkConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableInterContainerTrafficEncryption = defaults.enableInterContainerTrafficEncryption;
    	      this.enableNetworkIsolation = defaults.enableNetworkIsolation;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder enableInterContainerTrafficEncryption(@Nullable Output<Boolean> enableInterContainerTrafficEncryption) {
            this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
            return this;
        }
        public Builder enableInterContainerTrafficEncryption(@Nullable Boolean enableInterContainerTrafficEncryption) {
            this.enableInterContainerTrafficEncryption = Codegen.ofNullable(enableInterContainerTrafficEncryption);
            return this;
        }
        public Builder enableNetworkIsolation(@Nullable Output<Boolean> enableNetworkIsolation) {
            this.enableNetworkIsolation = enableNetworkIsolation;
            return this;
        }
        public Builder enableNetworkIsolation(@Nullable Boolean enableNetworkIsolation) {
            this.enableNetworkIsolation = Codegen.ofNullable(enableNetworkIsolation);
            return this;
        }
        public Builder vpcConfig(@Nullable Output<ModelBiasJobDefinitionVpcConfigArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public Builder vpcConfig(@Nullable ModelBiasJobDefinitionVpcConfigArgs vpcConfig) {
            this.vpcConfig = Codegen.ofNullable(vpcConfig);
            return this;
        }        public ModelBiasJobDefinitionNetworkConfigArgs build() {
            return new ModelBiasJobDefinitionNetworkConfigArgs(enableInterContainerTrafficEncryption, enableNetworkIsolation, vpcConfig);
        }
    }
}
