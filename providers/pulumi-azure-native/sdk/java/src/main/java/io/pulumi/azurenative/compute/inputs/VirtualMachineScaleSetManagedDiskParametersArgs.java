// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.StorageAccountTypes;
import io.pulumi.azurenative.compute.inputs.DiskEncryptionSetParametersArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the parameters of a ScaleSet managed disk.
 * 
 */
public final class VirtualMachineScaleSetManagedDiskParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetManagedDiskParametersArgs Empty = new VirtualMachineScaleSetManagedDiskParametersArgs();

    /**
     * Specifies the customer managed disk encryption set resource id for the managed disk.
     * 
     */
    @InputImport(name="diskEncryptionSet")
      private final @Nullable Input<DiskEncryptionSetParametersArgs> diskEncryptionSet;

    public Input<DiskEncryptionSetParametersArgs> getDiskEncryptionSet() {
        return this.diskEncryptionSet == null ? Input.empty() : this.diskEncryptionSet;
    }

    /**
     * Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
     */
    @InputImport(name="storageAccountType")
      private final @Nullable Input<Either<String,StorageAccountTypes>> storageAccountType;

    public Input<Either<String,StorageAccountTypes>> getStorageAccountType() {
        return this.storageAccountType == null ? Input.empty() : this.storageAccountType;
    }

    public VirtualMachineScaleSetManagedDiskParametersArgs(
        @Nullable Input<DiskEncryptionSetParametersArgs> diskEncryptionSet,
        @Nullable Input<Either<String,StorageAccountTypes>> storageAccountType) {
        this.diskEncryptionSet = diskEncryptionSet;
        this.storageAccountType = storageAccountType;
    }

    private VirtualMachineScaleSetManagedDiskParametersArgs() {
        this.diskEncryptionSet = Input.empty();
        this.storageAccountType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetManagedDiskParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DiskEncryptionSetParametersArgs> diskEncryptionSet;
        private @Nullable Input<Either<String,StorageAccountTypes>> storageAccountType;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetManagedDiskParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionSet = defaults.diskEncryptionSet;
    	      this.storageAccountType = defaults.storageAccountType;
        }

        public Builder setDiskEncryptionSet(@Nullable Input<DiskEncryptionSetParametersArgs> diskEncryptionSet) {
            this.diskEncryptionSet = diskEncryptionSet;
            return this;
        }

        public Builder setDiskEncryptionSet(@Nullable DiskEncryptionSetParametersArgs diskEncryptionSet) {
            this.diskEncryptionSet = Input.ofNullable(diskEncryptionSet);
            return this;
        }

        public Builder setStorageAccountType(@Nullable Input<Either<String,StorageAccountTypes>> storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }

        public Builder setStorageAccountType(@Nullable Either<String,StorageAccountTypes> storageAccountType) {
            this.storageAccountType = Input.ofNullable(storageAccountType);
            return this;
        }
        public VirtualMachineScaleSetManagedDiskParametersArgs build() {
            return new VirtualMachineScaleSetManagedDiskParametersArgs(diskEncryptionSet, storageAccountType);
        }
    }
}