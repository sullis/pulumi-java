// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Backend address of an application gateway.
 * 
 */
public final class ApplicationGatewayBackendAddressResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayBackendAddressResponse Empty = new ApplicationGatewayBackendAddressResponse();

    /**
     * Fully qualified domain name (FQDN).
     * 
     */
    @InputImport(name="fqdn")
    private final @Nullable String fqdn;

    public Optional<String> getFqdn() {
        return this.fqdn == null ? Optional.empty() : Optional.ofNullable(this.fqdn);
    }

    /**
     * IP address.
     * 
     */
    @InputImport(name="ipAddress")
    private final @Nullable String ipAddress;

    public Optional<String> getIpAddress() {
        return this.ipAddress == null ? Optional.empty() : Optional.ofNullable(this.ipAddress);
    }

    public ApplicationGatewayBackendAddressResponse(
        @Nullable String fqdn,
        @Nullable String ipAddress) {
        this.fqdn = fqdn;
        this.ipAddress = ipAddress;
    }

    private ApplicationGatewayBackendAddressResponse() {
        this.fqdn = null;
        this.ipAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayBackendAddressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fqdn;
        private @Nullable String ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayBackendAddressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fqdn = defaults.fqdn;
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder setFqdn(@Nullable String fqdn) {
            this.fqdn = fqdn;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public ApplicationGatewayBackendAddressResponse build() {
            return new ApplicationGatewayBackendAddressResponse(fqdn, ipAddress);
        }
    }
}
