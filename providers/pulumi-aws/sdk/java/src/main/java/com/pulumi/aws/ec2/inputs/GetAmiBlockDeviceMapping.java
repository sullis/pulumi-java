// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GetAmiBlockDeviceMapping extends com.pulumi.resources.InvokeArgs {

    public static final GetAmiBlockDeviceMapping Empty = new GetAmiBlockDeviceMapping();

    /**
     * The physical name of the device.
     * 
     */
    @Import(name="deviceName", required=true)
    private String deviceName;

    /**
     * @return The physical name of the device.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }

    /**
     * Map containing EBS information, if the device is EBS based. Unlike most object attributes, these are accessed directly (e.g., `ebs.volume_size` or `ebs[&#34;volume_size&#34;]`) rather than accessed through the first element of a list (e.g., `ebs[0].volume_size`).
     * 
     */
    @Import(name="ebs", required=true)
    private Map<String,String> ebs;

    /**
     * @return Map containing EBS information, if the device is EBS based. Unlike most object attributes, these are accessed directly (e.g., `ebs.volume_size` or `ebs[&#34;volume_size&#34;]`) rather than accessed through the first element of a list (e.g., `ebs[0].volume_size`).
     * 
     */
    public Map<String,String> ebs() {
        return this.ebs;
    }

    /**
     * Suppresses the specified device included in the block device mapping of the AMI.
     * 
     */
    @Import(name="noDevice", required=true)
    private String noDevice;

    /**
     * @return Suppresses the specified device included in the block device mapping of the AMI.
     * 
     */
    public String noDevice() {
        return this.noDevice;
    }

    /**
     * The virtual device name (for instance stores).
     * 
     */
    @Import(name="virtualName", required=true)
    private String virtualName;

    /**
     * @return The virtual device name (for instance stores).
     * 
     */
    public String virtualName() {
        return this.virtualName;
    }

    private GetAmiBlockDeviceMapping() {}

    private GetAmiBlockDeviceMapping(GetAmiBlockDeviceMapping $) {
        this.deviceName = $.deviceName;
        this.ebs = $.ebs;
        this.noDevice = $.noDevice;
        this.virtualName = $.virtualName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAmiBlockDeviceMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAmiBlockDeviceMapping $;

        public Builder() {
            $ = new GetAmiBlockDeviceMapping();
        }

        public Builder(GetAmiBlockDeviceMapping defaults) {
            $ = new GetAmiBlockDeviceMapping(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceName The physical name of the device.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param ebs Map containing EBS information, if the device is EBS based. Unlike most object attributes, these are accessed directly (e.g., `ebs.volume_size` or `ebs[&#34;volume_size&#34;]`) rather than accessed through the first element of a list (e.g., `ebs[0].volume_size`).
         * 
         * @return builder
         * 
         */
        public Builder ebs(Map<String,String> ebs) {
            $.ebs = ebs;
            return this;
        }

        /**
         * @param noDevice Suppresses the specified device included in the block device mapping of the AMI.
         * 
         * @return builder
         * 
         */
        public Builder noDevice(String noDevice) {
            $.noDevice = noDevice;
            return this;
        }

        /**
         * @param virtualName The virtual device name (for instance stores).
         * 
         * @return builder
         * 
         */
        public Builder virtualName(String virtualName) {
            $.virtualName = virtualName;
            return this;
        }

        public GetAmiBlockDeviceMapping build() {
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.ebs = Objects.requireNonNull($.ebs, "expected parameter 'ebs' to be non-null");
            $.noDevice = Objects.requireNonNull($.noDevice, "expected parameter 'noDevice' to be non-null");
            $.virtualName = Objects.requireNonNull($.virtualName, "expected parameter 'virtualName' to be non-null");
            return $;
        }
    }

}
