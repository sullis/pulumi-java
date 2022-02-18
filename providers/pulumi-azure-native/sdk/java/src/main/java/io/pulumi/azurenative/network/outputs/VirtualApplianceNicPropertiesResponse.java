// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VirtualApplianceNicPropertiesResponse {
    /**
     * NIC name.
     * 
     */
    private final String name;
    /**
     * Private IP address.
     * 
     */
    private final String privateIpAddress;
    /**
     * Public IP address.
     * 
     */
    private final String publicIpAddress;

    @OutputCustomType.Constructor({"name","privateIpAddress","publicIpAddress"})
    private VirtualApplianceNicPropertiesResponse(
        String name,
        String privateIpAddress,
        String publicIpAddress) {
        this.name = Objects.requireNonNull(name);
        this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
        this.publicIpAddress = Objects.requireNonNull(publicIpAddress);
    }

    /**
     * NIC name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Private IP address.
     * 
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * Public IP address.
     * 
     */
    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualApplianceNicPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String privateIpAddress;
        private String publicIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualApplianceNicPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.publicIpAddress = defaults.publicIpAddress;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }

        public Builder setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = Objects.requireNonNull(publicIpAddress);
            return this;
        }

        public VirtualApplianceNicPropertiesResponse build() {
            return new VirtualApplianceNicPropertiesResponse(name, privateIpAddress, publicIpAddress);
        }
    }
}
