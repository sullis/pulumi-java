// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless;

import io.pulumi.awsnative.iotwireless.inputs.FuotaTaskLoRaWANArgs;
import io.pulumi.awsnative.iotwireless.inputs.FuotaTaskTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FuotaTaskArgs extends io.pulumi.resources.ResourceArgs {

    public static final FuotaTaskArgs Empty = new FuotaTaskArgs();

    @InputImport(name="associateMulticastGroup")
    private final @Nullable Input<String> associateMulticastGroup;

    public Input<String> getAssociateMulticastGroup() {
        return this.associateMulticastGroup == null ? Input.empty() : this.associateMulticastGroup;
    }

    @InputImport(name="associateWirelessDevice")
    private final @Nullable Input<String> associateWirelessDevice;

    public Input<String> getAssociateWirelessDevice() {
        return this.associateWirelessDevice == null ? Input.empty() : this.associateWirelessDevice;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="disassociateMulticastGroup")
    private final @Nullable Input<String> disassociateMulticastGroup;

    public Input<String> getDisassociateMulticastGroup() {
        return this.disassociateMulticastGroup == null ? Input.empty() : this.disassociateMulticastGroup;
    }

    @InputImport(name="disassociateWirelessDevice")
    private final @Nullable Input<String> disassociateWirelessDevice;

    public Input<String> getDisassociateWirelessDevice() {
        return this.disassociateWirelessDevice == null ? Input.empty() : this.disassociateWirelessDevice;
    }

    @InputImport(name="firmwareUpdateImage", required=true)
    private final Input<String> firmwareUpdateImage;

    public Input<String> getFirmwareUpdateImage() {
        return this.firmwareUpdateImage;
    }

    @InputImport(name="firmwareUpdateRole", required=true)
    private final Input<String> firmwareUpdateRole;

    public Input<String> getFirmwareUpdateRole() {
        return this.firmwareUpdateRole;
    }

    @InputImport(name="loRaWAN", required=true)
    private final Input<FuotaTaskLoRaWANArgs> loRaWAN;

    public Input<FuotaTaskLoRaWANArgs> getLoRaWAN() {
        return this.loRaWAN;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<FuotaTaskTagArgs>> tags;

    public Input<List<FuotaTaskTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public FuotaTaskArgs(
        @Nullable Input<String> associateMulticastGroup,
        @Nullable Input<String> associateWirelessDevice,
        @Nullable Input<String> description,
        @Nullable Input<String> disassociateMulticastGroup,
        @Nullable Input<String> disassociateWirelessDevice,
        Input<String> firmwareUpdateImage,
        Input<String> firmwareUpdateRole,
        Input<FuotaTaskLoRaWANArgs> loRaWAN,
        @Nullable Input<String> name,
        @Nullable Input<List<FuotaTaskTagArgs>> tags) {
        this.associateMulticastGroup = associateMulticastGroup;
        this.associateWirelessDevice = associateWirelessDevice;
        this.description = description;
        this.disassociateMulticastGroup = disassociateMulticastGroup;
        this.disassociateWirelessDevice = disassociateWirelessDevice;
        this.firmwareUpdateImage = Objects.requireNonNull(firmwareUpdateImage, "expected parameter 'firmwareUpdateImage' to be non-null");
        this.firmwareUpdateRole = Objects.requireNonNull(firmwareUpdateRole, "expected parameter 'firmwareUpdateRole' to be non-null");
        this.loRaWAN = Objects.requireNonNull(loRaWAN, "expected parameter 'loRaWAN' to be non-null");
        this.name = name;
        this.tags = tags;
    }

    private FuotaTaskArgs() {
        this.associateMulticastGroup = Input.empty();
        this.associateWirelessDevice = Input.empty();
        this.description = Input.empty();
        this.disassociateMulticastGroup = Input.empty();
        this.disassociateWirelessDevice = Input.empty();
        this.firmwareUpdateImage = Input.empty();
        this.firmwareUpdateRole = Input.empty();
        this.loRaWAN = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FuotaTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> associateMulticastGroup;
        private @Nullable Input<String> associateWirelessDevice;
        private @Nullable Input<String> description;
        private @Nullable Input<String> disassociateMulticastGroup;
        private @Nullable Input<String> disassociateWirelessDevice;
        private Input<String> firmwareUpdateImage;
        private Input<String> firmwareUpdateRole;
        private Input<FuotaTaskLoRaWANArgs> loRaWAN;
        private @Nullable Input<String> name;
        private @Nullable Input<List<FuotaTaskTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(FuotaTaskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associateMulticastGroup = defaults.associateMulticastGroup;
    	      this.associateWirelessDevice = defaults.associateWirelessDevice;
    	      this.description = defaults.description;
    	      this.disassociateMulticastGroup = defaults.disassociateMulticastGroup;
    	      this.disassociateWirelessDevice = defaults.disassociateWirelessDevice;
    	      this.firmwareUpdateImage = defaults.firmwareUpdateImage;
    	      this.firmwareUpdateRole = defaults.firmwareUpdateRole;
    	      this.loRaWAN = defaults.loRaWAN;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setAssociateMulticastGroup(@Nullable Input<String> associateMulticastGroup) {
            this.associateMulticastGroup = associateMulticastGroup;
            return this;
        }

        public Builder setAssociateMulticastGroup(@Nullable String associateMulticastGroup) {
            this.associateMulticastGroup = Input.ofNullable(associateMulticastGroup);
            return this;
        }

        public Builder setAssociateWirelessDevice(@Nullable Input<String> associateWirelessDevice) {
            this.associateWirelessDevice = associateWirelessDevice;
            return this;
        }

        public Builder setAssociateWirelessDevice(@Nullable String associateWirelessDevice) {
            this.associateWirelessDevice = Input.ofNullable(associateWirelessDevice);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisassociateMulticastGroup(@Nullable Input<String> disassociateMulticastGroup) {
            this.disassociateMulticastGroup = disassociateMulticastGroup;
            return this;
        }

        public Builder setDisassociateMulticastGroup(@Nullable String disassociateMulticastGroup) {
            this.disassociateMulticastGroup = Input.ofNullable(disassociateMulticastGroup);
            return this;
        }

        public Builder setDisassociateWirelessDevice(@Nullable Input<String> disassociateWirelessDevice) {
            this.disassociateWirelessDevice = disassociateWirelessDevice;
            return this;
        }

        public Builder setDisassociateWirelessDevice(@Nullable String disassociateWirelessDevice) {
            this.disassociateWirelessDevice = Input.ofNullable(disassociateWirelessDevice);
            return this;
        }

        public Builder setFirmwareUpdateImage(Input<String> firmwareUpdateImage) {
            this.firmwareUpdateImage = Objects.requireNonNull(firmwareUpdateImage);
            return this;
        }

        public Builder setFirmwareUpdateImage(String firmwareUpdateImage) {
            this.firmwareUpdateImage = Input.of(Objects.requireNonNull(firmwareUpdateImage));
            return this;
        }

        public Builder setFirmwareUpdateRole(Input<String> firmwareUpdateRole) {
            this.firmwareUpdateRole = Objects.requireNonNull(firmwareUpdateRole);
            return this;
        }

        public Builder setFirmwareUpdateRole(String firmwareUpdateRole) {
            this.firmwareUpdateRole = Input.of(Objects.requireNonNull(firmwareUpdateRole));
            return this;
        }

        public Builder setLoRaWAN(Input<FuotaTaskLoRaWANArgs> loRaWAN) {
            this.loRaWAN = Objects.requireNonNull(loRaWAN);
            return this;
        }

        public Builder setLoRaWAN(FuotaTaskLoRaWANArgs loRaWAN) {
            this.loRaWAN = Input.of(Objects.requireNonNull(loRaWAN));
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

        public Builder setTags(@Nullable Input<List<FuotaTaskTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<FuotaTaskTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public FuotaTaskArgs build() {
            return new FuotaTaskArgs(associateMulticastGroup, associateWirelessDevice, description, disassociateMulticastGroup, disassociateWirelessDevice, firmwareUpdateImage, firmwareUpdateRole, loRaWAN, name, tags);
        }
    }
}
