// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionVpcConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataQualityJobDefinitionNetworkConfig {
    /**
     * Whether to encrypt all communications between distributed processing jobs. Choose True to encrypt communications. Encryption provides greater security for distributed processing jobs, but the processing might take longer.
     * 
     */
    private final @Nullable Boolean enableInterContainerTrafficEncryption;
    /**
     * Whether to allow inbound and outbound network calls to and from the containers used for the processing job.
     * 
     */
    private final @Nullable Boolean enableNetworkIsolation;
    private final @Nullable DataQualityJobDefinitionVpcConfig vpcConfig;

    @OutputCustomType.Constructor
    private DataQualityJobDefinitionNetworkConfig(
        @OutputCustomType.Parameter("enableInterContainerTrafficEncryption") @Nullable Boolean enableInterContainerTrafficEncryption,
        @OutputCustomType.Parameter("enableNetworkIsolation") @Nullable Boolean enableNetworkIsolation,
        @OutputCustomType.Parameter("vpcConfig") @Nullable DataQualityJobDefinitionVpcConfig vpcConfig) {
        this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
        this.enableNetworkIsolation = enableNetworkIsolation;
        this.vpcConfig = vpcConfig;
    }

    /**
     * Whether to encrypt all communications between distributed processing jobs. Choose True to encrypt communications. Encryption provides greater security for distributed processing jobs, but the processing might take longer.
     * 
    */
    public Optional<Boolean> getEnableInterContainerTrafficEncryption() {
        return Optional.ofNullable(this.enableInterContainerTrafficEncryption);
    }
    /**
     * Whether to allow inbound and outbound network calls to and from the containers used for the processing job.
     * 
    */
    public Optional<Boolean> getEnableNetworkIsolation() {
        return Optional.ofNullable(this.enableNetworkIsolation);
    }
    public Optional<DataQualityJobDefinitionVpcConfig> getVpcConfig() {
        return Optional.ofNullable(this.vpcConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataQualityJobDefinitionNetworkConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableInterContainerTrafficEncryption;
        private @Nullable Boolean enableNetworkIsolation;
        private @Nullable DataQualityJobDefinitionVpcConfig vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(DataQualityJobDefinitionNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableInterContainerTrafficEncryption = defaults.enableInterContainerTrafficEncryption;
    	      this.enableNetworkIsolation = defaults.enableNetworkIsolation;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder setEnableInterContainerTrafficEncryption(@Nullable Boolean enableInterContainerTrafficEncryption) {
            this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
            return this;
        }

        public Builder setEnableNetworkIsolation(@Nullable Boolean enableNetworkIsolation) {
            this.enableNetworkIsolation = enableNetworkIsolation;
            return this;
        }

        public Builder setVpcConfig(@Nullable DataQualityJobDefinitionVpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public DataQualityJobDefinitionNetworkConfig build() {
            return new DataQualityJobDefinitionNetworkConfig(enableInterContainerTrafficEncryption, enableNetworkIsolation, vpcConfig);
        }
    }
}
