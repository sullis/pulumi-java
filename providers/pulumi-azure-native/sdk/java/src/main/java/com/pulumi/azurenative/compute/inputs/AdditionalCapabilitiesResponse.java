// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Enables or disables a capability on the virtual machine or virtual machine scale set.
 * 
 */
public final class AdditionalCapabilitiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final AdditionalCapabilitiesResponse Empty = new AdditionalCapabilitiesResponse();

    /**
     * The flag that enables or disables a capability to have one or more managed data disks with UltraSSD_LRS storage account type on the VM or VMSS. Managed disks with storage account type UltraSSD_LRS can be added to a virtual machine or virtual machine scale set only if this property is enabled.
     * 
     */
    @Import(name="ultraSSDEnabled")
    private @Nullable Boolean ultraSSDEnabled;

    /**
     * @return The flag that enables or disables a capability to have one or more managed data disks with UltraSSD_LRS storage account type on the VM or VMSS. Managed disks with storage account type UltraSSD_LRS can be added to a virtual machine or virtual machine scale set only if this property is enabled.
     * 
     */
    public Optional<Boolean> ultraSSDEnabled() {
        return Optional.ofNullable(this.ultraSSDEnabled);
    }

    private AdditionalCapabilitiesResponse() {}

    private AdditionalCapabilitiesResponse(AdditionalCapabilitiesResponse $) {
        this.ultraSSDEnabled = $.ultraSSDEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdditionalCapabilitiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdditionalCapabilitiesResponse $;

        public Builder() {
            $ = new AdditionalCapabilitiesResponse();
        }

        public Builder(AdditionalCapabilitiesResponse defaults) {
            $ = new AdditionalCapabilitiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param ultraSSDEnabled The flag that enables or disables a capability to have one or more managed data disks with UltraSSD_LRS storage account type on the VM or VMSS. Managed disks with storage account type UltraSSD_LRS can be added to a virtual machine or virtual machine scale set only if this property is enabled.
         * 
         * @return builder
         * 
         */
        public Builder ultraSSDEnabled(@Nullable Boolean ultraSSDEnabled) {
            $.ultraSSDEnabled = ultraSSDEnabled;
            return this;
        }

        public AdditionalCapabilitiesResponse build() {
            return $;
        }
    }

}
