// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DiskInstantiationConfigResponse {
    /**
     * @return Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    private final Boolean autoDelete;
    /**
     * @return The custom source image to be used to restore this disk when instantiating this instance template.
     * 
     */
    private final String customImage;
    /**
     * @return Specifies the device name of the disk to which the configurations apply to.
     * 
     */
    private final String deviceName;
    /**
     * @return Specifies whether to include the disk and what image to use. Possible values are: - source-image: to use the same image that was used to create the source instance&#39;s corresponding disk. Applicable to the boot disk and additional read-write disks. - source-image-family: to use the same image family that was used to create the source instance&#39;s corresponding disk. Applicable to the boot disk and additional read-write disks. - custom-image: to use a user-provided image url for disk creation. Applicable to the boot disk and additional read-write disks. - attach-read-only: to attach a read-only disk. Applicable to read-only disks. - do-not-include: to exclude a disk from the template. Applicable to additional read-write disks, local SSDs, and read-only disks.
     * 
     */
    private final String instantiateFrom;

    @CustomType.Constructor
    private DiskInstantiationConfigResponse(
        @CustomType.Parameter("autoDelete") Boolean autoDelete,
        @CustomType.Parameter("customImage") String customImage,
        @CustomType.Parameter("deviceName") String deviceName,
        @CustomType.Parameter("instantiateFrom") String instantiateFrom) {
        this.autoDelete = autoDelete;
        this.customImage = customImage;
        this.deviceName = deviceName;
        this.instantiateFrom = instantiateFrom;
    }

    /**
     * @return Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    public Boolean autoDelete() {
        return this.autoDelete;
    }
    /**
     * @return The custom source image to be used to restore this disk when instantiating this instance template.
     * 
     */
    public String customImage() {
        return this.customImage;
    }
    /**
     * @return Specifies the device name of the disk to which the configurations apply to.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * @return Specifies whether to include the disk and what image to use. Possible values are: - source-image: to use the same image that was used to create the source instance&#39;s corresponding disk. Applicable to the boot disk and additional read-write disks. - source-image-family: to use the same image family that was used to create the source instance&#39;s corresponding disk. Applicable to the boot disk and additional read-write disks. - custom-image: to use a user-provided image url for disk creation. Applicable to the boot disk and additional read-write disks. - attach-read-only: to attach a read-only disk. Applicable to read-only disks. - do-not-include: to exclude a disk from the template. Applicable to additional read-write disks, local SSDs, and read-only disks.
     * 
     */
    public String instantiateFrom() {
        return this.instantiateFrom;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskInstantiationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoDelete;
        private String customImage;
        private String deviceName;
        private String instantiateFrom;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskInstantiationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.customImage = defaults.customImage;
    	      this.deviceName = defaults.deviceName;
    	      this.instantiateFrom = defaults.instantiateFrom;
        }

        public Builder autoDelete(Boolean autoDelete) {
            this.autoDelete = Objects.requireNonNull(autoDelete);
            return this;
        }
        public Builder customImage(String customImage) {
            this.customImage = Objects.requireNonNull(customImage);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder instantiateFrom(String instantiateFrom) {
            this.instantiateFrom = Objects.requireNonNull(instantiateFrom);
            return this;
        }        public DiskInstantiationConfigResponse build() {
            return new DiskInstantiationConfigResponse(autoDelete, customImage, deviceName, instantiateFrom);
        }
    }
}
