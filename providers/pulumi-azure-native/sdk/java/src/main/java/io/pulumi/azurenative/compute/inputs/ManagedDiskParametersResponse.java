// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.DiskEncryptionSetParametersResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The parameters of a managed disk.
 * 
 */
public final class ManagedDiskParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedDiskParametersResponse Empty = new ManagedDiskParametersResponse();

    /**
     * Specifies the customer managed disk encryption set resource id for the managed disk.
     * 
     */
    @InputImport(name="diskEncryptionSet")
    private final @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet;

    public Optional<DiskEncryptionSetParametersResponse> getDiskEncryptionSet() {
        return this.diskEncryptionSet == null ? Optional.empty() : Optional.ofNullable(this.diskEncryptionSet);
    }

    /**
     * Resource Id
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Specifies the storage account type for the managed disk. Managed OS disk storage account type can only be set when you create the scale set. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
     */
    @InputImport(name="storageAccountType")
    private final @Nullable String storageAccountType;

    public Optional<String> getStorageAccountType() {
        return this.storageAccountType == null ? Optional.empty() : Optional.ofNullable(this.storageAccountType);
    }

    public ManagedDiskParametersResponse(
        @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet,
        @Nullable String id,
        @Nullable String storageAccountType) {
        this.diskEncryptionSet = diskEncryptionSet;
        this.id = id;
        this.storageAccountType = storageAccountType;
    }

    private ManagedDiskParametersResponse() {
        this.diskEncryptionSet = null;
        this.id = null;
        this.storageAccountType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedDiskParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet;
        private @Nullable String id;
        private @Nullable String storageAccountType;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedDiskParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionSet = defaults.diskEncryptionSet;
    	      this.id = defaults.id;
    	      this.storageAccountType = defaults.storageAccountType;
        }

        public Builder setDiskEncryptionSet(@Nullable DiskEncryptionSetParametersResponse diskEncryptionSet) {
            this.diskEncryptionSet = diskEncryptionSet;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setStorageAccountType(@Nullable String storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }

        public ManagedDiskParametersResponse build() {
            return new ManagedDiskParametersResponse(diskEncryptionSet, id, storageAccountType);
        }
    }
}
