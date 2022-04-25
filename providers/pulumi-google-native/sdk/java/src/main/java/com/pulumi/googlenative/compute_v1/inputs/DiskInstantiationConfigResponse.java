// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * A specification of the desired way to instantiate a disk in the instance template when its created from a source instance.
 * 
 */
public final class DiskInstantiationConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final DiskInstantiationConfigResponse Empty = new DiskInstantiationConfigResponse();

    /**
     * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    @Import(name="autoDelete", required=true)
    private Boolean autoDelete;

    /**
     * @return Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    public Boolean autoDelete() {
        return this.autoDelete;
    }

    /**
     * The custom source image to be used to restore this disk when instantiating this instance template.
     * 
     */
    @Import(name="customImage", required=true)
    private String customImage;

    /**
     * @return The custom source image to be used to restore this disk when instantiating this instance template.
     * 
     */
    public String customImage() {
        return this.customImage;
    }

    /**
     * Specifies the device name of the disk to which the configurations apply to.
     * 
     */
    @Import(name="deviceName", required=true)
    private String deviceName;

    /**
     * @return Specifies the device name of the disk to which the configurations apply to.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }

    /**
     * Specifies whether to include the disk and what image to use. Possible values are: - source-image: to use the same image that was used to create the source instance&#39;s corresponding disk. Applicable to the boot disk and additional read-write disks. - source-image-family: to use the same image family that was used to create the source instance&#39;s corresponding disk. Applicable to the boot disk and additional read-write disks. - custom-image: to use a user-provided image url for disk creation. Applicable to the boot disk and additional read-write disks. - attach-read-only: to attach a read-only disk. Applicable to read-only disks. - do-not-include: to exclude a disk from the template. Applicable to additional read-write disks, local SSDs, and read-only disks.
     * 
     */
    @Import(name="instantiateFrom", required=true)
    private String instantiateFrom;

    /**
     * @return Specifies whether to include the disk and what image to use. Possible values are: - source-image: to use the same image that was used to create the source instance&#39;s corresponding disk. Applicable to the boot disk and additional read-write disks. - source-image-family: to use the same image family that was used to create the source instance&#39;s corresponding disk. Applicable to the boot disk and additional read-write disks. - custom-image: to use a user-provided image url for disk creation. Applicable to the boot disk and additional read-write disks. - attach-read-only: to attach a read-only disk. Applicable to read-only disks. - do-not-include: to exclude a disk from the template. Applicable to additional read-write disks, local SSDs, and read-only disks.
     * 
     */
    public String instantiateFrom() {
        return this.instantiateFrom;
    }

    private DiskInstantiationConfigResponse() {}

    private DiskInstantiationConfigResponse(DiskInstantiationConfigResponse $) {
        this.autoDelete = $.autoDelete;
        this.customImage = $.customImage;
        this.deviceName = $.deviceName;
        this.instantiateFrom = $.instantiateFrom;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskInstantiationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskInstantiationConfigResponse $;

        public Builder() {
            $ = new DiskInstantiationConfigResponse();
        }

        public Builder(DiskInstantiationConfigResponse defaults) {
            $ = new DiskInstantiationConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoDelete Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
         * 
         * @return builder
         * 
         */
        public Builder autoDelete(Boolean autoDelete) {
            $.autoDelete = autoDelete;
            return this;
        }

        /**
         * @param customImage The custom source image to be used to restore this disk when instantiating this instance template.
         * 
         * @return builder
         * 
         */
        public Builder customImage(String customImage) {
            $.customImage = customImage;
            return this;
        }

        /**
         * @param deviceName Specifies the device name of the disk to which the configurations apply to.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param instantiateFrom Specifies whether to include the disk and what image to use. Possible values are: - source-image: to use the same image that was used to create the source instance&#39;s corresponding disk. Applicable to the boot disk and additional read-write disks. - source-image-family: to use the same image family that was used to create the source instance&#39;s corresponding disk. Applicable to the boot disk and additional read-write disks. - custom-image: to use a user-provided image url for disk creation. Applicable to the boot disk and additional read-write disks. - attach-read-only: to attach a read-only disk. Applicable to read-only disks. - do-not-include: to exclude a disk from the template. Applicable to additional read-write disks, local SSDs, and read-only disks.
         * 
         * @return builder
         * 
         */
        public Builder instantiateFrom(String instantiateFrom) {
            $.instantiateFrom = instantiateFrom;
            return this;
        }

        public DiskInstantiationConfigResponse build() {
            $.autoDelete = Objects.requireNonNull($.autoDelete, "expected parameter 'autoDelete' to be non-null");
            $.customImage = Objects.requireNonNull($.customImage, "expected parameter 'customImage' to be non-null");
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.instantiateFrom = Objects.requireNonNull($.instantiateFrom, "expected parameter 'instantiateFrom' to be non-null");
            return $;
        }
    }

}
