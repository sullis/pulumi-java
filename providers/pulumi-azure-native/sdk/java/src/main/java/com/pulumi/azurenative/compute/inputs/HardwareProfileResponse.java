// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the hardware settings for the virtual machine.
 * 
 */
public final class HardwareProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final HardwareProfileResponse Empty = new HardwareProfileResponse();

    /**
     * Specifies the size of the virtual machine. &lt;br&gt;&lt;br&gt; The enum data type is currently deprecated and will be removed by December 23rd 2023. &lt;br&gt;&lt;br&gt; Recommended way to get the list of available sizes is using these APIs: &lt;br&gt;&lt;br&gt; [List all available virtual machine sizes in an availability set](https://docs.microsoft.com/rest/api/compute/availabilitysets/listavailablesizes) &lt;br&gt;&lt;br&gt; [List all available virtual machine sizes in a region](https://docs.microsoft.com/rest/api/compute/resourceskus/list) &lt;br&gt;&lt;br&gt; [List all available virtual machine sizes for resizing](https://docs.microsoft.com/rest/api/compute/virtualmachines/listavailablesizes). For more information about virtual machine sizes, see [Sizes for virtual machines](https://docs.microsoft.com/azure/virtual-machines/sizes). &lt;br&gt;&lt;br&gt; The available VM sizes depend on region and availability set.
     * 
     */
    @Import(name="vmSize")
    private @Nullable String vmSize;

    /**
     * @return Specifies the size of the virtual machine. &lt;br&gt;&lt;br&gt; The enum data type is currently deprecated and will be removed by December 23rd 2023. &lt;br&gt;&lt;br&gt; Recommended way to get the list of available sizes is using these APIs: &lt;br&gt;&lt;br&gt; [List all available virtual machine sizes in an availability set](https://docs.microsoft.com/rest/api/compute/availabilitysets/listavailablesizes) &lt;br&gt;&lt;br&gt; [List all available virtual machine sizes in a region](https://docs.microsoft.com/rest/api/compute/resourceskus/list) &lt;br&gt;&lt;br&gt; [List all available virtual machine sizes for resizing](https://docs.microsoft.com/rest/api/compute/virtualmachines/listavailablesizes). For more information about virtual machine sizes, see [Sizes for virtual machines](https://docs.microsoft.com/azure/virtual-machines/sizes). &lt;br&gt;&lt;br&gt; The available VM sizes depend on region and availability set.
     * 
     */
    public Optional<String> vmSize() {
        return Optional.ofNullable(this.vmSize);
    }

    private HardwareProfileResponse() {}

    private HardwareProfileResponse(HardwareProfileResponse $) {
        this.vmSize = $.vmSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HardwareProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HardwareProfileResponse $;

        public Builder() {
            $ = new HardwareProfileResponse();
        }

        public Builder(HardwareProfileResponse defaults) {
            $ = new HardwareProfileResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param vmSize Specifies the size of the virtual machine. &lt;br&gt;&lt;br&gt; The enum data type is currently deprecated and will be removed by December 23rd 2023. &lt;br&gt;&lt;br&gt; Recommended way to get the list of available sizes is using these APIs: &lt;br&gt;&lt;br&gt; [List all available virtual machine sizes in an availability set](https://docs.microsoft.com/rest/api/compute/availabilitysets/listavailablesizes) &lt;br&gt;&lt;br&gt; [List all available virtual machine sizes in a region](https://docs.microsoft.com/rest/api/compute/resourceskus/list) &lt;br&gt;&lt;br&gt; [List all available virtual machine sizes for resizing](https://docs.microsoft.com/rest/api/compute/virtualmachines/listavailablesizes). For more information about virtual machine sizes, see [Sizes for virtual machines](https://docs.microsoft.com/azure/virtual-machines/sizes). &lt;br&gt;&lt;br&gt; The available VM sizes depend on region and availability set.
         * 
         * @return builder
         * 
         */
        public Builder vmSize(@Nullable String vmSize) {
            $.vmSize = vmSize;
            return this;
        }

        public HardwareProfileResponse build() {
            return $;
        }
    }

}
