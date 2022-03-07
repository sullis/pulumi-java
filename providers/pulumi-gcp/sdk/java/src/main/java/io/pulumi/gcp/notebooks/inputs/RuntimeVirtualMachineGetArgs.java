// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeVirtualMachineGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeVirtualMachineGetArgs Empty = new RuntimeVirtualMachineGetArgs();

    /**
     * - 
     * The unique identifier of the Managed Compute Engine instance.
     * 
     */
    @InputImport(name="instanceId")
      private final @Nullable Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId == null ? Input.empty() : this.instanceId;
    }

    /**
     * - 
     * The user-friendly name of the Managed Compute Engine instance.
     * 
     */
    @InputImport(name="instanceName")
      private final @Nullable Input<String> instanceName;

    public Input<String> getInstanceName() {
        return this.instanceName == null ? Input.empty() : this.instanceName;
    }

    /**
     * Virtual Machine configuration settings.
     * Structure is documented below.
     * 
     */
    @InputImport(name="virtualMachineConfig")
      private final @Nullable Input<RuntimeVirtualMachineVirtualMachineConfigGetArgs> virtualMachineConfig;

    public Input<RuntimeVirtualMachineVirtualMachineConfigGetArgs> getVirtualMachineConfig() {
        return this.virtualMachineConfig == null ? Input.empty() : this.virtualMachineConfig;
    }

    public RuntimeVirtualMachineGetArgs(
        @Nullable Input<String> instanceId,
        @Nullable Input<String> instanceName,
        @Nullable Input<RuntimeVirtualMachineVirtualMachineConfigGetArgs> virtualMachineConfig) {
        this.instanceId = instanceId;
        this.instanceName = instanceName;
        this.virtualMachineConfig = virtualMachineConfig;
    }

    private RuntimeVirtualMachineGetArgs() {
        this.instanceId = Input.empty();
        this.instanceName = Input.empty();
        this.virtualMachineConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeVirtualMachineGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> instanceId;
        private @Nullable Input<String> instanceName;
        private @Nullable Input<RuntimeVirtualMachineVirtualMachineConfigGetArgs> virtualMachineConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeVirtualMachineGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceId = defaults.instanceId;
    	      this.instanceName = defaults.instanceName;
    	      this.virtualMachineConfig = defaults.virtualMachineConfig;
        }

        public Builder setInstanceId(@Nullable Input<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public Builder setInstanceId(@Nullable String instanceId) {
            this.instanceId = Input.ofNullable(instanceId);
            return this;
        }

        public Builder setInstanceName(@Nullable Input<String> instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        public Builder setInstanceName(@Nullable String instanceName) {
            this.instanceName = Input.ofNullable(instanceName);
            return this;
        }

        public Builder setVirtualMachineConfig(@Nullable Input<RuntimeVirtualMachineVirtualMachineConfigGetArgs> virtualMachineConfig) {
            this.virtualMachineConfig = virtualMachineConfig;
            return this;
        }

        public Builder setVirtualMachineConfig(@Nullable RuntimeVirtualMachineVirtualMachineConfigGetArgs virtualMachineConfig) {
            this.virtualMachineConfig = Input.ofNullable(virtualMachineConfig);
            return this;
        }
        public RuntimeVirtualMachineGetArgs build() {
            return new RuntimeVirtualMachineGetArgs(instanceId, instanceName, virtualMachineConfig);
        }
    }
}