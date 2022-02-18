// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.awsnative.imagebuilder.inputs.ContainerRecipeEbsInstanceBlockDeviceSpecificationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines block device mappings for the instance used to configure your image.
 * 
 */
public final class ContainerRecipeInstanceBlockDeviceMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerRecipeInstanceBlockDeviceMappingArgs Empty = new ContainerRecipeInstanceBlockDeviceMappingArgs();

    /**
     * The device to which these mappings apply.
     * 
     */
    @InputImport(name="deviceName")
    private final @Nullable Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName == null ? Input.empty() : this.deviceName;
    }

    /**
     * Use to manage Amazon EBS-specific configuration for this mapping.
     * 
     */
    @InputImport(name="ebs")
    private final @Nullable Input<ContainerRecipeEbsInstanceBlockDeviceSpecificationArgs> ebs;

    public Input<ContainerRecipeEbsInstanceBlockDeviceSpecificationArgs> getEbs() {
        return this.ebs == null ? Input.empty() : this.ebs;
    }

    /**
     * Use to remove a mapping from the parent image.
     * 
     */
    @InputImport(name="noDevice")
    private final @Nullable Input<String> noDevice;

    public Input<String> getNoDevice() {
        return this.noDevice == null ? Input.empty() : this.noDevice;
    }

    /**
     * Use to manage instance ephemeral devices.
     * 
     */
    @InputImport(name="virtualName")
    private final @Nullable Input<String> virtualName;

    public Input<String> getVirtualName() {
        return this.virtualName == null ? Input.empty() : this.virtualName;
    }

    public ContainerRecipeInstanceBlockDeviceMappingArgs(
        @Nullable Input<String> deviceName,
        @Nullable Input<ContainerRecipeEbsInstanceBlockDeviceSpecificationArgs> ebs,
        @Nullable Input<String> noDevice,
        @Nullable Input<String> virtualName) {
        this.deviceName = deviceName;
        this.ebs = ebs;
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    private ContainerRecipeInstanceBlockDeviceMappingArgs() {
        this.deviceName = Input.empty();
        this.ebs = Input.empty();
        this.noDevice = Input.empty();
        this.virtualName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerRecipeInstanceBlockDeviceMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deviceName;
        private @Nullable Input<ContainerRecipeEbsInstanceBlockDeviceSpecificationArgs> ebs;
        private @Nullable Input<String> noDevice;
        private @Nullable Input<String> virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerRecipeInstanceBlockDeviceMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder setDeviceName(@Nullable Input<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = Input.ofNullable(deviceName);
            return this;
        }

        public Builder setEbs(@Nullable Input<ContainerRecipeEbsInstanceBlockDeviceSpecificationArgs> ebs) {
            this.ebs = ebs;
            return this;
        }

        public Builder setEbs(@Nullable ContainerRecipeEbsInstanceBlockDeviceSpecificationArgs ebs) {
            this.ebs = Input.ofNullable(ebs);
            return this;
        }

        public Builder setNoDevice(@Nullable Input<String> noDevice) {
            this.noDevice = noDevice;
            return this;
        }

        public Builder setNoDevice(@Nullable String noDevice) {
            this.noDevice = Input.ofNullable(noDevice);
            return this;
        }

        public Builder setVirtualName(@Nullable Input<String> virtualName) {
            this.virtualName = virtualName;
            return this;
        }

        public Builder setVirtualName(@Nullable String virtualName) {
            this.virtualName = Input.ofNullable(virtualName);
            return this;
        }

        public ContainerRecipeInstanceBlockDeviceMappingArgs build() {
            return new ContainerRecipeInstanceBlockDeviceMappingArgs(deviceName, ebs, noDevice, virtualName);
        }
    }
}
