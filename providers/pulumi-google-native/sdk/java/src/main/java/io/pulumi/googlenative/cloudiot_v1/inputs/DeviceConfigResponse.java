// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The device configuration. Eventually delivered to devices.
 * 
 */
public final class DeviceConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeviceConfigResponse Empty = new DeviceConfigResponse();

    /**
     * The device configuration data.
     * 
     */
    @InputImport(name="binaryData", required=true)
      private final String binaryData;

    public String getBinaryData() {
        return this.binaryData;
    }

    /**
     * [Output only] The time at which this configuration version was updated in Cloud IoT Core. This timestamp is set by the server.
     * 
     */
    @InputImport(name="cloudUpdateTime", required=true)
      private final String cloudUpdateTime;

    public String getCloudUpdateTime() {
        return this.cloudUpdateTime;
    }

    /**
     * [Output only] The time at which Cloud IoT Core received the acknowledgment from the device, indicating that the device has received this configuration version. If this field is not present, the device has not yet acknowledged that it received this version. Note that when the config was sent to the device, many config versions may have been available in Cloud IoT Core while the device was disconnected, and on connection, only the latest version is sent to the device. Some versions may never be sent to the device, and therefore are never acknowledged. This timestamp is set by Cloud IoT Core.
     * 
     */
    @InputImport(name="deviceAckTime", required=true)
      private final String deviceAckTime;

    public String getDeviceAckTime() {
        return this.deviceAckTime;
    }

    /**
     * [Output only] The version of this update. The version number is assigned by the server, and is always greater than 0 after device creation. The version must be 0 on the `CreateDevice` request if a `config` is specified; the response of `CreateDevice` will always have a value of 1.
     * 
     */
    @InputImport(name="version", required=true)
      private final String version;

    public String getVersion() {
        return this.version;
    }

    public DeviceConfigResponse(
        String binaryData,
        String cloudUpdateTime,
        String deviceAckTime,
        String version) {
        this.binaryData = Objects.requireNonNull(binaryData, "expected parameter 'binaryData' to be non-null");
        this.cloudUpdateTime = Objects.requireNonNull(cloudUpdateTime, "expected parameter 'cloudUpdateTime' to be non-null");
        this.deviceAckTime = Objects.requireNonNull(deviceAckTime, "expected parameter 'deviceAckTime' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private DeviceConfigResponse() {
        this.binaryData = null;
        this.cloudUpdateTime = null;
        this.deviceAckTime = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String binaryData;
        private String cloudUpdateTime;
        private String deviceAckTime;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.binaryData = defaults.binaryData;
    	      this.cloudUpdateTime = defaults.cloudUpdateTime;
    	      this.deviceAckTime = defaults.deviceAckTime;
    	      this.version = defaults.version;
        }

        public Builder setBinaryData(String binaryData) {
            this.binaryData = Objects.requireNonNull(binaryData);
            return this;
        }

        public Builder setCloudUpdateTime(String cloudUpdateTime) {
            this.cloudUpdateTime = Objects.requireNonNull(cloudUpdateTime);
            return this;
        }

        public Builder setDeviceAckTime(String deviceAckTime) {
            this.deviceAckTime = Objects.requireNonNull(deviceAckTime);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public DeviceConfigResponse build() {
            return new DeviceConfigResponse(binaryData, cloudUpdateTime, deviceAckTime, version);
        }
    }
}