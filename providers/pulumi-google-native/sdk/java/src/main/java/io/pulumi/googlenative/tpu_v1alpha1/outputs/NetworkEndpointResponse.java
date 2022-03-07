// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NetworkEndpointResponse {
    /**
     * The IP address of this network endpoint.
     * 
     */
    private final String ipAddress;
    /**
     * The port of this network endpoint.
     * 
     */
    private final Integer port;

    @OutputCustomType.Constructor({"ipAddress","port"})
    private NetworkEndpointResponse(
        String ipAddress,
        Integer port) {
        this.ipAddress = Objects.requireNonNull(ipAddress);
        this.port = Objects.requireNonNull(port);
    }

    /**
     * The IP address of this network endpoint.
     * 
    */
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * The port of this network endpoint.
     * 
    */
    public Integer getPort() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipAddress;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.port = defaults.port;
        }

        public Builder setIpAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public NetworkEndpointResponse build() {
            return new NetworkEndpointResponse(ipAddress, port);
        }
    }
}