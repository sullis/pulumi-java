// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.azurenative.hybridnetwork.enums.DiskCreateOptionTypes;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies information about the operating system disk used by the virtual machine. <br><br> For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-about-disks-vhds?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
 * 
 */
public final class DataDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataDiskArgs Empty = new DataDiskArgs();

    /**
     * Specifies how the virtual machine should be created.
     * 
     */
    @InputImport(name="createOption")
    private final @Nullable Input<Either<String,DiskCreateOptionTypes>> createOption;

    public Input<Either<String,DiskCreateOptionTypes>> getCreateOption() {
        return this.createOption == null ? Input.empty() : this.createOption;
    }

    /**
     * Specifies the size of an empty disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image.
     * 
     */
    @InputImport(name="diskSizeGB")
    private final @Nullable Input<Integer> diskSizeGB;

    public Input<Integer> getDiskSizeGB() {
        return this.diskSizeGB == null ? Input.empty() : this.diskSizeGB;
    }

    /**
     * The name of data disk.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public DataDiskArgs(
        @Nullable Input<Either<String,DiskCreateOptionTypes>> createOption,
        @Nullable Input<Integer> diskSizeGB,
        @Nullable Input<String> name) {
        this.createOption = createOption;
        this.diskSizeGB = diskSizeGB;
        this.name = name;
    }

    private DataDiskArgs() {
        this.createOption = Input.empty();
        this.diskSizeGB = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,DiskCreateOptionTypes>> createOption;
        private @Nullable Input<Integer> diskSizeGB;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(DataDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createOption = defaults.createOption;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.name = defaults.name;
        }

        public Builder setCreateOption(@Nullable Input<Either<String,DiskCreateOptionTypes>> createOption) {
            this.createOption = createOption;
            return this;
        }

        public Builder setCreateOption(@Nullable Either<String,DiskCreateOptionTypes> createOption) {
            this.createOption = Input.ofNullable(createOption);
            return this;
        }

        public Builder setDiskSizeGB(@Nullable Input<Integer> diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder setDiskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = Input.ofNullable(diskSizeGB);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public DataDiskArgs build() {
            return new DataDiskArgs(createOption, diskSizeGB, name);
        }
    }
}
