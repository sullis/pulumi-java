// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.AzureFirewallPublicIPAddressResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HubPublicIPAddressesResponse {
    /**
     * @return The list of Public IP addresses associated with azure firewall or IP addresses to be retained.
     * 
     */
    private final @Nullable List<AzureFirewallPublicIPAddressResponse> addresses;
    /**
     * @return The number of Public IP addresses associated with azure firewall.
     * 
     */
    private final @Nullable Integer count;

    @CustomType.Constructor
    private HubPublicIPAddressesResponse(
        @CustomType.Parameter("addresses") @Nullable List<AzureFirewallPublicIPAddressResponse> addresses,
        @CustomType.Parameter("count") @Nullable Integer count) {
        this.addresses = addresses;
        this.count = count;
    }

    /**
     * @return The list of Public IP addresses associated with azure firewall or IP addresses to be retained.
     * 
     */
    public List<AzureFirewallPublicIPAddressResponse> addresses() {
        return this.addresses == null ? List.of() : this.addresses;
    }
    /**
     * @return The number of Public IP addresses associated with azure firewall.
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HubPublicIPAddressesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AzureFirewallPublicIPAddressResponse> addresses;
        private @Nullable Integer count;

        public Builder() {
    	      // Empty
        }

        public Builder(HubPublicIPAddressesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.count = defaults.count;
        }

        public Builder addresses(@Nullable List<AzureFirewallPublicIPAddressResponse> addresses) {
            this.addresses = addresses;
            return this;
        }
        public Builder addresses(AzureFirewallPublicIPAddressResponse... addresses) {
            return addresses(List.of(addresses));
        }
        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }        public HubPublicIPAddressesResponse build() {
            return new HubPublicIPAddressesResponse(addresses, count);
        }
    }
}
