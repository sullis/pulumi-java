// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OrchestratedVirtualMachineScaleSetOsDiskDiffDiskSettings {
    /**
     * @return Specifies the Ephemeral Disk Settings for the OS Disk. At this time the only possible value is `Local`. Changing this forces a new resource to be created.
     * 
     */
    private final String option;

    @CustomType.Constructor
    private OrchestratedVirtualMachineScaleSetOsDiskDiffDiskSettings(@CustomType.Parameter("option") String option) {
        this.option = option;
    }

    /**
     * @return Specifies the Ephemeral Disk Settings for the OS Disk. At this time the only possible value is `Local`. Changing this forces a new resource to be created.
     * 
     */
    public String option() {
        return this.option;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrchestratedVirtualMachineScaleSetOsDiskDiffDiskSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String option;

        public Builder() {
    	      // Empty
        }

        public Builder(OrchestratedVirtualMachineScaleSetOsDiskDiffDiskSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.option = defaults.option;
        }

        public Builder option(String option) {
            this.option = Objects.requireNonNull(option);
            return this;
        }        public OrchestratedVirtualMachineScaleSetOsDiskDiffDiskSettings build() {
            return new OrchestratedVirtualMachineScaleSetOsDiskDiffDiskSettings(option);
        }
    }
}
