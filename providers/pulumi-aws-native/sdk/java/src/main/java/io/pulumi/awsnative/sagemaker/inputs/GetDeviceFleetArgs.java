// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDeviceFleetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDeviceFleetArgs Empty = new GetDeviceFleetArgs();

    /**
     * The name of the edge device fleet
     * 
     */
    @InputImport(name="deviceFleetName", required=true)
    private final String deviceFleetName;

    public String getDeviceFleetName() {
        return this.deviceFleetName;
    }

    public GetDeviceFleetArgs(String deviceFleetName) {
        this.deviceFleetName = Objects.requireNonNull(deviceFleetName, "expected parameter 'deviceFleetName' to be non-null");
    }

    private GetDeviceFleetArgs() {
        this.deviceFleetName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceFleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceFleetName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeviceFleetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceFleetName = defaults.deviceFleetName;
        }

        public Builder setDeviceFleetName(String deviceFleetName) {
            this.deviceFleetName = Objects.requireNonNull(deviceFleetName);
            return this;
        }

        public GetDeviceFleetArgs build() {
            return new GetDeviceFleetArgs(deviceFleetName);
        }
    }
}
