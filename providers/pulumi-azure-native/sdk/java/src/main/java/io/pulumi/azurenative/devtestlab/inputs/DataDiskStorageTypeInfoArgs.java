// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.enums.StorageType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Storage information about the data disks present in the custom image
 * 
 */
public final class DataDiskStorageTypeInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataDiskStorageTypeInfoArgs Empty = new DataDiskStorageTypeInfoArgs();

    /**
     * Disk Lun
     * 
     */
    @InputImport(name="lun")
    private final @Nullable Input<String> lun;

    public Input<String> getLun() {
        return this.lun == null ? Input.empty() : this.lun;
    }

    /**
     * Disk Storage Type
     * 
     */
    @InputImport(name="storageType")
    private final @Nullable Input<Either<String,StorageType>> storageType;

    public Input<Either<String,StorageType>> getStorageType() {
        return this.storageType == null ? Input.empty() : this.storageType;
    }

    public DataDiskStorageTypeInfoArgs(
        @Nullable Input<String> lun,
        @Nullable Input<Either<String,StorageType>> storageType) {
        this.lun = lun;
        this.storageType = storageType;
    }

    private DataDiskStorageTypeInfoArgs() {
        this.lun = Input.empty();
        this.storageType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataDiskStorageTypeInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> lun;
        private @Nullable Input<Either<String,StorageType>> storageType;

        public Builder() {
    	      // Empty
        }

        public Builder(DataDiskStorageTypeInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lun = defaults.lun;
    	      this.storageType = defaults.storageType;
        }

        public Builder setLun(@Nullable Input<String> lun) {
            this.lun = lun;
            return this;
        }

        public Builder setLun(@Nullable String lun) {
            this.lun = Input.ofNullable(lun);
            return this;
        }

        public Builder setStorageType(@Nullable Input<Either<String,StorageType>> storageType) {
            this.storageType = storageType;
            return this;
        }

        public Builder setStorageType(@Nullable Either<String,StorageType> storageType) {
            this.storageType = Input.ofNullable(storageType);
            return this;
        }

        public DataDiskStorageTypeInfoArgs build() {
            return new DataDiskStorageTypeInfoArgs(lun, storageType);
        }
    }
}
