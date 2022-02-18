// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IPConfigResponse {
    /**
     * The backend address pools associated with the IP configuration.
     * 
     */
    private final @Nullable List<String> lBBackendAddressPoolIds;
    /**
     * The Id of the public IP address associated with the IP configuration.
     * 
     */
    private final @Nullable String publicIpAddressId;
    /**
     * The static IP address of the IP configuration.
     * 
     */
    private final @Nullable String staticIPAddress;

    @OutputCustomType.Constructor({"lBBackendAddressPoolIds","publicIpAddressId","staticIPAddress"})
    private IPConfigResponse(
        @Nullable List<String> lBBackendAddressPoolIds,
        @Nullable String publicIpAddressId,
        @Nullable String staticIPAddress) {
        this.lBBackendAddressPoolIds = lBBackendAddressPoolIds;
        this.publicIpAddressId = publicIpAddressId;
        this.staticIPAddress = staticIPAddress;
    }

    /**
     * The backend address pools associated with the IP configuration.
     * 
     */
    public List<String> getLBBackendAddressPoolIds() {
        return this.lBBackendAddressPoolIds == null ? List.of() : this.lBBackendAddressPoolIds;
    }
    /**
     * The Id of the public IP address associated with the IP configuration.
     * 
     */
    public Optional<String> getPublicIpAddressId() {
        return Optional.ofNullable(this.publicIpAddressId);
    }
    /**
     * The static IP address of the IP configuration.
     * 
     */
    public Optional<String> getStaticIPAddress() {
        return Optional.ofNullable(this.staticIPAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> lBBackendAddressPoolIds;
        private @Nullable String publicIpAddressId;
        private @Nullable String staticIPAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(IPConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lBBackendAddressPoolIds = defaults.lBBackendAddressPoolIds;
    	      this.publicIpAddressId = defaults.publicIpAddressId;
    	      this.staticIPAddress = defaults.staticIPAddress;
        }

        public Builder setLBBackendAddressPoolIds(@Nullable List<String> lBBackendAddressPoolIds) {
            this.lBBackendAddressPoolIds = lBBackendAddressPoolIds;
            return this;
        }

        public Builder setPublicIpAddressId(@Nullable String publicIpAddressId) {
            this.publicIpAddressId = publicIpAddressId;
            return this;
        }

        public Builder setStaticIPAddress(@Nullable String staticIPAddress) {
            this.staticIPAddress = staticIPAddress;
            return this;
        }

        public IPConfigResponse build() {
            return new IPConfigResponse(lBBackendAddressPoolIds, publicIpAddressId, staticIPAddress);
        }
    }
}
