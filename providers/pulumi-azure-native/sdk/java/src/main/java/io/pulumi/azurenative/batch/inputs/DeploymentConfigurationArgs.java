// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.CloudServiceConfigurationArgs;
import io.pulumi.azurenative.batch.inputs.VirtualMachineConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentConfigurationArgs Empty = new DeploymentConfigurationArgs();

    /**
     * This property and virtualMachineConfiguration are mutually exclusive and one of the properties must be specified. This property cannot be specified if the Batch account was created with its poolAllocationMode property set to 'UserSubscription'.
     * 
     */
    @InputImport(name="cloudServiceConfiguration")
      private final @Nullable Input<CloudServiceConfigurationArgs> cloudServiceConfiguration;

    public Input<CloudServiceConfigurationArgs> getCloudServiceConfiguration() {
        return this.cloudServiceConfiguration == null ? Input.empty() : this.cloudServiceConfiguration;
    }

    /**
     * This property and cloudServiceConfiguration are mutually exclusive and one of the properties must be specified.
     * 
     */
    @InputImport(name="virtualMachineConfiguration")
      private final @Nullable Input<VirtualMachineConfigurationArgs> virtualMachineConfiguration;

    public Input<VirtualMachineConfigurationArgs> getVirtualMachineConfiguration() {
        return this.virtualMachineConfiguration == null ? Input.empty() : this.virtualMachineConfiguration;
    }

    public DeploymentConfigurationArgs(
        @Nullable Input<CloudServiceConfigurationArgs> cloudServiceConfiguration,
        @Nullable Input<VirtualMachineConfigurationArgs> virtualMachineConfiguration) {
        this.cloudServiceConfiguration = cloudServiceConfiguration;
        this.virtualMachineConfiguration = virtualMachineConfiguration;
    }

    private DeploymentConfigurationArgs() {
        this.cloudServiceConfiguration = Input.empty();
        this.virtualMachineConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CloudServiceConfigurationArgs> cloudServiceConfiguration;
        private @Nullable Input<VirtualMachineConfigurationArgs> virtualMachineConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudServiceConfiguration = defaults.cloudServiceConfiguration;
    	      this.virtualMachineConfiguration = defaults.virtualMachineConfiguration;
        }

        public Builder setCloudServiceConfiguration(@Nullable Input<CloudServiceConfigurationArgs> cloudServiceConfiguration) {
            this.cloudServiceConfiguration = cloudServiceConfiguration;
            return this;
        }

        public Builder setCloudServiceConfiguration(@Nullable CloudServiceConfigurationArgs cloudServiceConfiguration) {
            this.cloudServiceConfiguration = Input.ofNullable(cloudServiceConfiguration);
            return this;
        }

        public Builder setVirtualMachineConfiguration(@Nullable Input<VirtualMachineConfigurationArgs> virtualMachineConfiguration) {
            this.virtualMachineConfiguration = virtualMachineConfiguration;
            return this;
        }

        public Builder setVirtualMachineConfiguration(@Nullable VirtualMachineConfigurationArgs virtualMachineConfiguration) {
            this.virtualMachineConfiguration = Input.ofNullable(virtualMachineConfiguration);
            return this;
        }
        public DeploymentConfigurationArgs build() {
            return new DeploymentConfigurationArgs(cloudServiceConfiguration, virtualMachineConfiguration);
        }
    }
}