// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ExternalVpnGatewayInterfaceResponse {
    /**
     * @return IP address of the interface in the external VPN gateway. Only IPv4 is supported. This IP address can be either from your on-premise gateway or another Cloud provider&#39;s VPN gateway, it cannot be an IP address from Google Compute Engine.
     * 
     */
    private final String ipAddress;

    @CustomType.Constructor
    private ExternalVpnGatewayInterfaceResponse(@CustomType.Parameter("ipAddress") String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * @return IP address of the interface in the external VPN gateway. Only IPv4 is supported. This IP address can be either from your on-premise gateway or another Cloud provider&#39;s VPN gateway, it cannot be an IP address from Google Compute Engine.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalVpnGatewayInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalVpnGatewayInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }        public ExternalVpnGatewayInterfaceResponse build() {
            return new ExternalVpnGatewayInterfaceResponse(ipAddress);
        }
    }
}
