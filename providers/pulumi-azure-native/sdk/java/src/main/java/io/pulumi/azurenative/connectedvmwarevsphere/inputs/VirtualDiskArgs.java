// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.azurenative.connectedvmwarevsphere.enums.DiskMode;
import io.pulumi.azurenative.connectedvmwarevsphere.enums.DiskType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Virtual disk model
 * 
 */
public final class VirtualDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualDiskArgs Empty = new VirtualDiskArgs();

    /**
     * Gets or sets the controller id.
     * 
     */
    @InputImport(name="controllerKey")
    private final @Nullable Input<Integer> controllerKey;

    public Input<Integer> getControllerKey() {
        return this.controllerKey == null ? Input.empty() : this.controllerKey;
    }

    /**
     * Gets or sets the device key value.
     * 
     */
    @InputImport(name="deviceKey")
    private final @Nullable Input<Integer> deviceKey;

    public Input<Integer> getDeviceKey() {
        return this.deviceKey == null ? Input.empty() : this.deviceKey;
    }

    /**
     * Gets or sets the device name.
     * 
     */
    @InputImport(name="deviceName")
    private final @Nullable Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName == null ? Input.empty() : this.deviceName;
    }

    /**
     * Gets or sets the disk mode.
     * 
     */
    @InputImport(name="diskMode")
    private final @Nullable Input<Either<String,DiskMode>> diskMode;

    public Input<Either<String,DiskMode>> getDiskMode() {
        return this.diskMode == null ? Input.empty() : this.diskMode;
    }

    /**
     * Gets or sets the disk total size.
     * 
     */
    @InputImport(name="diskSizeGB")
    private final @Nullable Input<Integer> diskSizeGB;

    public Input<Integer> getDiskSizeGB() {
        return this.diskSizeGB == null ? Input.empty() : this.diskSizeGB;
    }

    /**
     * Gets or sets the disk backing type.
     * 
     */
    @InputImport(name="diskType")
    private final @Nullable Input<Either<String,DiskType>> diskType;

    public Input<Either<String,DiskType>> getDiskType() {
        return this.diskType == null ? Input.empty() : this.diskType;
    }

    /**
     * Gets or sets the name of the virtual disk.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Gets or sets the unit number of the disk on the controller.
     * 
     */
    @InputImport(name="unitNumber")
    private final @Nullable Input<Integer> unitNumber;

    public Input<Integer> getUnitNumber() {
        return this.unitNumber == null ? Input.empty() : this.unitNumber;
    }

    public VirtualDiskArgs(
        @Nullable Input<Integer> controllerKey,
        @Nullable Input<Integer> deviceKey,
        @Nullable Input<String> deviceName,
        @Nullable Input<Either<String,DiskMode>> diskMode,
        @Nullable Input<Integer> diskSizeGB,
        @Nullable Input<Either<String,DiskType>> diskType,
        @Nullable Input<String> name,
        @Nullable Input<Integer> unitNumber) {
        this.controllerKey = controllerKey;
        this.deviceKey = deviceKey;
        this.deviceName = deviceName;
        this.diskMode = diskMode;
        this.diskSizeGB = diskSizeGB;
        this.diskType = diskType;
        this.name = name;
        this.unitNumber = unitNumber;
    }

    private VirtualDiskArgs() {
        this.controllerKey = Input.empty();
        this.deviceKey = Input.empty();
        this.deviceName = Input.empty();
        this.diskMode = Input.empty();
        this.diskSizeGB = Input.empty();
        this.diskType = Input.empty();
        this.name = Input.empty();
        this.unitNumber = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> controllerKey;
        private @Nullable Input<Integer> deviceKey;
        private @Nullable Input<String> deviceName;
        private @Nullable Input<Either<String,DiskMode>> diskMode;
        private @Nullable Input<Integer> diskSizeGB;
        private @Nullable Input<Either<String,DiskType>> diskType;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> unitNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controllerKey = defaults.controllerKey;
    	      this.deviceKey = defaults.deviceKey;
    	      this.deviceName = defaults.deviceName;
    	      this.diskMode = defaults.diskMode;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.diskType = defaults.diskType;
    	      this.name = defaults.name;
    	      this.unitNumber = defaults.unitNumber;
        }

        public Builder setControllerKey(@Nullable Input<Integer> controllerKey) {
            this.controllerKey = controllerKey;
            return this;
        }

        public Builder setControllerKey(@Nullable Integer controllerKey) {
            this.controllerKey = Input.ofNullable(controllerKey);
            return this;
        }

        public Builder setDeviceKey(@Nullable Input<Integer> deviceKey) {
            this.deviceKey = deviceKey;
            return this;
        }

        public Builder setDeviceKey(@Nullable Integer deviceKey) {
            this.deviceKey = Input.ofNullable(deviceKey);
            return this;
        }

        public Builder setDeviceName(@Nullable Input<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = Input.ofNullable(deviceName);
            return this;
        }

        public Builder setDiskMode(@Nullable Input<Either<String,DiskMode>> diskMode) {
            this.diskMode = diskMode;
            return this;
        }

        public Builder setDiskMode(@Nullable Either<String,DiskMode> diskMode) {
            this.diskMode = Input.ofNullable(diskMode);
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

        public Builder setDiskType(@Nullable Input<Either<String,DiskType>> diskType) {
            this.diskType = diskType;
            return this;
        }

        public Builder setDiskType(@Nullable Either<String,DiskType> diskType) {
            this.diskType = Input.ofNullable(diskType);
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

        public Builder setUnitNumber(@Nullable Input<Integer> unitNumber) {
            this.unitNumber = unitNumber;
            return this;
        }

        public Builder setUnitNumber(@Nullable Integer unitNumber) {
            this.unitNumber = Input.ofNullable(unitNumber);
            return this;
        }

        public VirtualDiskArgs build() {
            return new VirtualDiskArgs(controllerKey, deviceKey, deviceName, diskMode, diskSizeGB, diskType, name, unitNumber);
        }
    }
}
