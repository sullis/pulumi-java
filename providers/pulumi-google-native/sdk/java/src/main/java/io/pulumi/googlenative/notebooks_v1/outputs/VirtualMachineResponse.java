// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.notebooks_v1.outputs.VirtualMachineConfigResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualMachineResponse {
    /**
     * The unique identifier of the Managed Compute Engine instance.
     * 
     */
    private final String instanceId;
    /**
     * The user-friendly name of the Managed Compute Engine instance.
     * 
     */
    private final String instanceName;
    /**
     * Virtual Machine configuration settings.
     * 
     */
    private final VirtualMachineConfigResponse virtualMachineConfig;

    @CustomType.Constructor
    private VirtualMachineResponse(
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("instanceName") String instanceName,
        @CustomType.Parameter("virtualMachineConfig") VirtualMachineConfigResponse virtualMachineConfig) {
        this.instanceId = instanceId;
        this.instanceName = instanceName;
        this.virtualMachineConfig = virtualMachineConfig;
    }

    /**
     * The unique identifier of the Managed Compute Engine instance.
     * 
    */
    public String getInstanceId() {
        return this.instanceId;
    }
    /**
     * The user-friendly name of the Managed Compute Engine instance.
     * 
    */
    public String getInstanceName() {
        return this.instanceName;
    }
    /**
     * Virtual Machine configuration settings.
     * 
    */
    public VirtualMachineConfigResponse getVirtualMachineConfig() {
        return this.virtualMachineConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceId;
        private String instanceName;
        private VirtualMachineConfigResponse virtualMachineConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceId = defaults.instanceId;
    	      this.instanceName = defaults.instanceName;
    	      this.virtualMachineConfig = defaults.virtualMachineConfig;
        }

        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceName(String instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }
        public Builder virtualMachineConfig(VirtualMachineConfigResponse virtualMachineConfig) {
            this.virtualMachineConfig = Objects.requireNonNull(virtualMachineConfig);
            return this;
        }        public VirtualMachineResponse build() {
            return new VirtualMachineResponse(instanceId, instanceName, virtualMachineConfig);
        }
    }
}
