// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.VirtualMachineSizeTypes;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the hardware settings for the virtual machine.
 * 
 */
public final class HardwareProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final HardwareProfileArgs Empty = new HardwareProfileArgs();

    /**
     * Specifies the size of the virtual machine. <br><br> The enum data type is currently deprecated and will be removed by December 23rd 2023. <br><br> Recommended way to get the list of available sizes is using these APIs: <br><br> [List all available virtual machine sizes in an availability set](https://docs.microsoft.com/rest/api/compute/availabilitysets/listavailablesizes) <br><br> [List all available virtual machine sizes in a region](https://docs.microsoft.com/rest/api/compute/resourceskus/list) <br><br> [List all available virtual machine sizes for resizing](https://docs.microsoft.com/rest/api/compute/virtualmachines/listavailablesizes). For more information about virtual machine sizes, see [Sizes for virtual machines](https://docs.microsoft.com/azure/virtual-machines/sizes). <br><br> The available VM sizes depend on region and availability set.
     * 
     */
    @InputImport(name="vmSize")
    private final @Nullable Input<Either<String,VirtualMachineSizeTypes>> vmSize;

    public Input<Either<String,VirtualMachineSizeTypes>> getVmSize() {
        return this.vmSize == null ? Input.empty() : this.vmSize;
    }

    public HardwareProfileArgs(@Nullable Input<Either<String,VirtualMachineSizeTypes>> vmSize) {
        this.vmSize = vmSize;
    }

    private HardwareProfileArgs() {
        this.vmSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HardwareProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,VirtualMachineSizeTypes>> vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(HardwareProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vmSize = defaults.vmSize;
        }

        public Builder setVmSize(@Nullable Input<Either<String,VirtualMachineSizeTypes>> vmSize) {
            this.vmSize = vmSize;
            return this;
        }

        public Builder setVmSize(@Nullable Either<String,VirtualMachineSizeTypes> vmSize) {
            this.vmSize = Input.ofNullable(vmSize);
            return this;
        }

        public HardwareProfileArgs build() {
            return new HardwareProfileArgs(vmSize);
        }
    }
}
