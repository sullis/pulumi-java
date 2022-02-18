// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.DiskEncryptionSetParametersResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualMachineScaleSetManagedDiskParametersResponse {
    /**
     * Specifies the customer managed disk encryption set resource id for the managed disk.
     * 
     */
    private final @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet;
    /**
     * Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
     */
    private final @Nullable String storageAccountType;

    @OutputCustomType.Constructor({"diskEncryptionSet","storageAccountType"})
    private VirtualMachineScaleSetManagedDiskParametersResponse(
        @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet,
        @Nullable String storageAccountType) {
        this.diskEncryptionSet = diskEncryptionSet;
        this.storageAccountType = storageAccountType;
    }

    /**
     * Specifies the customer managed disk encryption set resource id for the managed disk.
     * 
     */
    public Optional<DiskEncryptionSetParametersResponse> getDiskEncryptionSet() {
        return Optional.ofNullable(this.diskEncryptionSet);
    }
    /**
     * Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
     */
    public Optional<String> getStorageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetManagedDiskParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet;
        private @Nullable String storageAccountType;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetManagedDiskParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionSet = defaults.diskEncryptionSet;
    	      this.storageAccountType = defaults.storageAccountType;
        }

        public Builder setDiskEncryptionSet(@Nullable DiskEncryptionSetParametersResponse diskEncryptionSet) {
            this.diskEncryptionSet = diskEncryptionSet;
            return this;
        }

        public Builder setStorageAccountType(@Nullable String storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }

        public VirtualMachineScaleSetManagedDiskParametersResponse build() {
            return new VirtualMachineScaleSetManagedDiskParametersResponse(diskEncryptionSet, storageAccountType);
        }
    }
}
