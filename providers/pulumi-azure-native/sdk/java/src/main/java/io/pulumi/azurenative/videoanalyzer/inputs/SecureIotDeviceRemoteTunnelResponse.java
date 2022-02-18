// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A remote tunnel securely established using IoT Hub device information.
 * 
 */
public final class SecureIotDeviceRemoteTunnelResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecureIotDeviceRemoteTunnelResponse Empty = new SecureIotDeviceRemoteTunnelResponse();

    /**
     * The IoT device id to use when establishing the remote tunnel. This string is case-sensitive.
     * 
     */
    @InputImport(name="deviceId", required=true)
    private final String deviceId;

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * Name of the IoT Hub.
     * 
     */
    @InputImport(name="iotHubName", required=true)
    private final String iotHubName;

    public String getIotHubName() {
        return this.iotHubName;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.SecureIotDeviceRemoteTunnel'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public SecureIotDeviceRemoteTunnelResponse(
        String deviceId,
        String iotHubName,
        String type) {
        this.deviceId = Objects.requireNonNull(deviceId, "expected parameter 'deviceId' to be non-null");
        this.iotHubName = Objects.requireNonNull(iotHubName, "expected parameter 'iotHubName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SecureIotDeviceRemoteTunnelResponse() {
        this.deviceId = null;
        this.iotHubName = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecureIotDeviceRemoteTunnelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceId;
        private String iotHubName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecureIotDeviceRemoteTunnelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceId = defaults.deviceId;
    	      this.iotHubName = defaults.iotHubName;
    	      this.type = defaults.type;
        }

        public Builder setDeviceId(String deviceId) {
            this.deviceId = Objects.requireNonNull(deviceId);
            return this;
        }

        public Builder setIotHubName(String iotHubName) {
            this.iotHubName = Objects.requireNonNull(iotHubName);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public SecureIotDeviceRemoteTunnelResponse build() {
            return new SecureIotDeviceRemoteTunnelResponse(deviceId, iotHubName, type);
        }
    }
}
