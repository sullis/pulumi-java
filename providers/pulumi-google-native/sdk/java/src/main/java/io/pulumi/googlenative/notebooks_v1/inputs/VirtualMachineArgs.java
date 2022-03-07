// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.notebooks_v1.inputs.VirtualMachineConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Runtime using Virtual Machine for computing.
 * 
 */
public final class VirtualMachineArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineArgs Empty = new VirtualMachineArgs();

    /**
     * Virtual Machine configuration settings.
     * 
     */
    @InputImport(name="virtualMachineConfig")
      private final @Nullable Input<VirtualMachineConfigArgs> virtualMachineConfig;

    public Input<VirtualMachineConfigArgs> getVirtualMachineConfig() {
        return this.virtualMachineConfig == null ? Input.empty() : this.virtualMachineConfig;
    }

    public VirtualMachineArgs(@Nullable Input<VirtualMachineConfigArgs> virtualMachineConfig) {
        this.virtualMachineConfig = virtualMachineConfig;
    }

    private VirtualMachineArgs() {
        this.virtualMachineConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualMachineConfigArgs> virtualMachineConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualMachineConfig = defaults.virtualMachineConfig;
        }

        public Builder setVirtualMachineConfig(@Nullable Input<VirtualMachineConfigArgs> virtualMachineConfig) {
            this.virtualMachineConfig = virtualMachineConfig;
            return this;
        }

        public Builder setVirtualMachineConfig(@Nullable VirtualMachineConfigArgs virtualMachineConfig) {
            this.virtualMachineConfig = Input.ofNullable(virtualMachineConfig);
            return this;
        }
        public VirtualMachineArgs build() {
            return new VirtualMachineArgs(virtualMachineConfig);
        }
    }
}