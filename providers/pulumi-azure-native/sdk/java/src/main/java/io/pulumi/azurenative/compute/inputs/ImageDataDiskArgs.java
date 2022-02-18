// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.CachingTypes;
import io.pulumi.azurenative.compute.enums.StorageAccountTypes;
import io.pulumi.azurenative.compute.inputs.DiskEncryptionSetParametersArgs;
import io.pulumi.azurenative.compute.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a data disk.
 * 
 */
public final class ImageDataDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageDataDiskArgs Empty = new ImageDataDiskArgs();

    /**
     * The Virtual Hard Disk.
     * 
     */
    @InputImport(name="blobUri")
    private final @Nullable Input<String> blobUri;

    public Input<String> getBlobUri() {
        return this.blobUri == null ? Input.empty() : this.blobUri;
    }

    /**
     * Specifies the caching requirements. <br><br> Possible values are: <br><br> **None** <br><br> **ReadOnly** <br><br> **ReadWrite** <br><br> Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
     */
    @InputImport(name="caching")
    private final @Nullable Input<CachingTypes> caching;

    public Input<CachingTypes> getCaching() {
        return this.caching == null ? Input.empty() : this.caching;
    }

    /**
     * Specifies the customer managed disk encryption set resource id for the managed image disk.
     * 
     */
    @InputImport(name="diskEncryptionSet")
    private final @Nullable Input<DiskEncryptionSetParametersArgs> diskEncryptionSet;

    public Input<DiskEncryptionSetParametersArgs> getDiskEncryptionSet() {
        return this.diskEncryptionSet == null ? Input.empty() : this.diskEncryptionSet;
    }

    /**
     * Specifies the size of empty data disks in gigabytes. This element can be used to overwrite the name of the disk in a virtual machine image. <br><br> This value cannot be larger than 1023 GB
     * 
     */
    @InputImport(name="diskSizeGB")
    private final @Nullable Input<Integer> diskSizeGB;

    public Input<Integer> getDiskSizeGB() {
        return this.diskSizeGB == null ? Input.empty() : this.diskSizeGB;
    }

    /**
     * Specifies the logical unit number of the data disk. This value is used to identify data disks within the VM and therefore must be unique for each data disk attached to a VM.
     * 
     */
    @InputImport(name="lun", required=true)
    private final Input<Integer> lun;

    public Input<Integer> getLun() {
        return this.lun;
    }

    /**
     * The managedDisk.
     * 
     */
    @InputImport(name="managedDisk")
    private final @Nullable Input<SubResourceArgs> managedDisk;

    public Input<SubResourceArgs> getManagedDisk() {
        return this.managedDisk == null ? Input.empty() : this.managedDisk;
    }

    /**
     * The snapshot.
     * 
     */
    @InputImport(name="snapshot")
    private final @Nullable Input<SubResourceArgs> snapshot;

    public Input<SubResourceArgs> getSnapshot() {
        return this.snapshot == null ? Input.empty() : this.snapshot;
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

    public ImageDataDiskArgs(
        @Nullable Input<String> blobUri,
        @Nullable Input<CachingTypes> caching,
        @Nullable Input<DiskEncryptionSetParametersArgs> diskEncryptionSet,
        @Nullable Input<Integer> diskSizeGB,
        Input<Integer> lun,
        @Nullable Input<SubResourceArgs> managedDisk,
        @Nullable Input<SubResourceArgs> snapshot,
        @Nullable Input<Either<String,StorageAccountTypes>> storageAccountType) {
        this.blobUri = blobUri;
        this.caching = caching;
        this.diskEncryptionSet = diskEncryptionSet;
        this.diskSizeGB = diskSizeGB;
        this.lun = Objects.requireNonNull(lun, "expected parameter 'lun' to be non-null");
        this.managedDisk = managedDisk;
        this.snapshot = snapshot;
        this.storageAccountType = storageAccountType;
    }

    private ImageDataDiskArgs() {
        this.blobUri = Input.empty();
        this.caching = Input.empty();
        this.diskEncryptionSet = Input.empty();
        this.diskSizeGB = Input.empty();
        this.lun = Input.empty();
        this.managedDisk = Input.empty();
        this.snapshot = Input.empty();
        this.storageAccountType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageDataDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> blobUri;
        private @Nullable Input<CachingTypes> caching;
        private @Nullable Input<DiskEncryptionSetParametersArgs> diskEncryptionSet;
        private @Nullable Input<Integer> diskSizeGB;
        private Input<Integer> lun;
        private @Nullable Input<SubResourceArgs> managedDisk;
        private @Nullable Input<SubResourceArgs> snapshot;
        private @Nullable Input<Either<String,StorageAccountTypes>> storageAccountType;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageDataDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobUri = defaults.blobUri;
    	      this.caching = defaults.caching;
    	      this.diskEncryptionSet = defaults.diskEncryptionSet;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.lun = defaults.lun;
    	      this.managedDisk = defaults.managedDisk;
    	      this.snapshot = defaults.snapshot;
    	      this.storageAccountType = defaults.storageAccountType;
        }

        public Builder setBlobUri(@Nullable Input<String> blobUri) {
            this.blobUri = blobUri;
            return this;
        }

        public Builder setBlobUri(@Nullable String blobUri) {
            this.blobUri = Input.ofNullable(blobUri);
            return this;
        }

        public Builder setCaching(@Nullable Input<CachingTypes> caching) {
            this.caching = caching;
            return this;
        }

        public Builder setCaching(@Nullable CachingTypes caching) {
            this.caching = Input.ofNullable(caching);
            return this;
        }

        public Builder setDiskEncryptionSet(@Nullable Input<DiskEncryptionSetParametersArgs> diskEncryptionSet) {
            this.diskEncryptionSet = diskEncryptionSet;
            return this;
        }

        public Builder setDiskEncryptionSet(@Nullable DiskEncryptionSetParametersArgs diskEncryptionSet) {
            this.diskEncryptionSet = Input.ofNullable(diskEncryptionSet);
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

        public Builder setLun(Input<Integer> lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }

        public Builder setLun(Integer lun) {
            this.lun = Input.of(Objects.requireNonNull(lun));
            return this;
        }

        public Builder setManagedDisk(@Nullable Input<SubResourceArgs> managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }

        public Builder setManagedDisk(@Nullable SubResourceArgs managedDisk) {
            this.managedDisk = Input.ofNullable(managedDisk);
            return this;
        }

        public Builder setSnapshot(@Nullable Input<SubResourceArgs> snapshot) {
            this.snapshot = snapshot;
            return this;
        }

        public Builder setSnapshot(@Nullable SubResourceArgs snapshot) {
            this.snapshot = Input.ofNullable(snapshot);
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

        public ImageDataDiskArgs build() {
            return new ImageDataDiskArgs(blobUri, caching, diskEncryptionSet, diskSizeGB, lun, managedDisk, snapshot, storageAccountType);
        }
    }
}
