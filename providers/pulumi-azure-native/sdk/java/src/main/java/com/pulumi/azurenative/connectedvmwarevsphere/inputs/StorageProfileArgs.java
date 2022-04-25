// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere.inputs;

import com.pulumi.azurenative.connectedvmwarevsphere.inputs.VirtualDiskArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the resource properties.
 * 
 */
public final class StorageProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageProfileArgs Empty = new StorageProfileArgs();

    /**
     * Gets or sets the list of virtual disks associated with the virtual machine.
     * 
     */
    @Import(name="disks")
    private @Nullable Output<List<VirtualDiskArgs>> disks;

    /**
     * @return Gets or sets the list of virtual disks associated with the virtual machine.
     * 
     */
    public Optional<Output<List<VirtualDiskArgs>>> disks() {
        return Optional.ofNullable(this.disks);
    }

    private StorageProfileArgs() {}

    private StorageProfileArgs(StorageProfileArgs $) {
        this.disks = $.disks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageProfileArgs $;

        public Builder() {
            $ = new StorageProfileArgs();
        }

        public Builder(StorageProfileArgs defaults) {
            $ = new StorageProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disks Gets or sets the list of virtual disks associated with the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder disks(@Nullable Output<List<VirtualDiskArgs>> disks) {
            $.disks = disks;
            return this;
        }

        /**
         * @param disks Gets or sets the list of virtual disks associated with the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder disks(List<VirtualDiskArgs> disks) {
            return disks(Output.of(disks));
        }

        /**
         * @param disks Gets or sets the list of virtual disks associated with the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder disks(VirtualDiskArgs... disks) {
            return disks(List.of(disks));
        }

        public StorageProfileArgs build() {
            return $;
        }
    }

}
