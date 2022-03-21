// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.aws.imagebuilder.inputs.GetImageRecipeBlockDeviceMappingEb;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetImageRecipeBlockDeviceMapping extends io.pulumi.resources.InvokeArgs {

    public static final GetImageRecipeBlockDeviceMapping Empty = new GetImageRecipeBlockDeviceMapping();

    /**
     * Name of the device. For example, `/dev/sda` or `/dev/xvdb`.
     * 
     */
    @Import(name="deviceName", required=true)
      private final String deviceName;

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * Single list of object with Elastic Block Storage (EBS) block device mapping settings.
     * 
     */
    @Import(name="ebs", required=true)
      private final List<GetImageRecipeBlockDeviceMappingEb> ebs;

    public List<GetImageRecipeBlockDeviceMappingEb> getEbs() {
        return this.ebs;
    }

    /**
     * Whether to remove a mapping from the parent image.
     * 
     */
    @Import(name="noDevice", required=true)
      private final String noDevice;

    public String getNoDevice() {
        return this.noDevice;
    }

    /**
     * Virtual device name. For example, `ephemeral0`. Instance store volumes are numbered starting from 0.
     * 
     */
    @Import(name="virtualName", required=true)
      private final String virtualName;

    public String getVirtualName() {
        return this.virtualName;
    }

    public GetImageRecipeBlockDeviceMapping(
        String deviceName,
        List<GetImageRecipeBlockDeviceMappingEb> ebs,
        String noDevice,
        String virtualName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.ebs = Objects.requireNonNull(ebs, "expected parameter 'ebs' to be non-null");
        this.noDevice = Objects.requireNonNull(noDevice, "expected parameter 'noDevice' to be non-null");
        this.virtualName = Objects.requireNonNull(virtualName, "expected parameter 'virtualName' to be non-null");
    }

    private GetImageRecipeBlockDeviceMapping() {
        this.deviceName = null;
        this.ebs = List.of();
        this.noDevice = null;
        this.virtualName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageRecipeBlockDeviceMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private List<GetImageRecipeBlockDeviceMappingEb> ebs;
        private String noDevice;
        private String virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageRecipeBlockDeviceMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder ebs(List<GetImageRecipeBlockDeviceMappingEb> ebs) {
            this.ebs = Objects.requireNonNull(ebs);
            return this;
        }
        public Builder ebs(GetImageRecipeBlockDeviceMappingEb... ebs) {
            return ebs(List.of(ebs));
        }
        public Builder noDevice(String noDevice) {
            this.noDevice = Objects.requireNonNull(noDevice);
            return this;
        }
        public Builder virtualName(String virtualName) {
            this.virtualName = Objects.requireNonNull(virtualName);
            return this;
        }        public GetImageRecipeBlockDeviceMapping build() {
            return new GetImageRecipeBlockDeviceMapping(deviceName, ebs, noDevice, virtualName);
        }
    }
}
