// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the peering configuration.
 * 
 */
public final class ExpressRouteCircuitPeeringConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExpressRouteCircuitPeeringConfigResponse Empty = new ExpressRouteCircuitPeeringConfigResponse();

    /**
     * The communities of bgp peering. Specified for microsoft peering.
     * 
     */
    @InputImport(name="advertisedCommunities")
      private final @Nullable List<String> advertisedCommunities;

    public List<String> getAdvertisedCommunities() {
        return this.advertisedCommunities == null ? List.of() : this.advertisedCommunities;
    }

    /**
     * The reference to AdvertisedPublicPrefixes.
     * 
     */
    @InputImport(name="advertisedPublicPrefixes")
      private final @Nullable List<String> advertisedPublicPrefixes;

    public List<String> getAdvertisedPublicPrefixes() {
        return this.advertisedPublicPrefixes == null ? List.of() : this.advertisedPublicPrefixes;
    }

    /**
     * The advertised public prefix state of the Peering resource.
     * 
     */
    @InputImport(name="advertisedPublicPrefixesState", required=true)
      private final String advertisedPublicPrefixesState;

    public String getAdvertisedPublicPrefixesState() {
        return this.advertisedPublicPrefixesState;
    }

    /**
     * The CustomerASN of the peering.
     * 
     */
    @InputImport(name="customerASN")
      private final @Nullable Integer customerASN;

    public Optional<Integer> getCustomerASN() {
        return this.customerASN == null ? Optional.empty() : Optional.ofNullable(this.customerASN);
    }

    /**
     * The legacy mode of the peering.
     * 
     */
    @InputImport(name="legacyMode")
      private final @Nullable Integer legacyMode;

    public Optional<Integer> getLegacyMode() {
        return this.legacyMode == null ? Optional.empty() : Optional.ofNullable(this.legacyMode);
    }

    /**
     * The RoutingRegistryName of the configuration.
     * 
     */
    @InputImport(name="routingRegistryName")
      private final @Nullable String routingRegistryName;

    public Optional<String> getRoutingRegistryName() {
        return this.routingRegistryName == null ? Optional.empty() : Optional.ofNullable(this.routingRegistryName);
    }

    public ExpressRouteCircuitPeeringConfigResponse(
        @Nullable List<String> advertisedCommunities,
        @Nullable List<String> advertisedPublicPrefixes,
        String advertisedPublicPrefixesState,
        @Nullable Integer customerASN,
        @Nullable Integer legacyMode,
        @Nullable String routingRegistryName) {
        this.advertisedCommunities = advertisedCommunities;
        this.advertisedPublicPrefixes = advertisedPublicPrefixes;
        this.advertisedPublicPrefixesState = Objects.requireNonNull(advertisedPublicPrefixesState, "expected parameter 'advertisedPublicPrefixesState' to be non-null");
        this.customerASN = customerASN;
        this.legacyMode = legacyMode;
        this.routingRegistryName = routingRegistryName;
    }

    private ExpressRouteCircuitPeeringConfigResponse() {
        this.advertisedCommunities = List.of();
        this.advertisedPublicPrefixes = List.of();
        this.advertisedPublicPrefixesState = null;
        this.customerASN = null;
        this.legacyMode = null;
        this.routingRegistryName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitPeeringConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> advertisedCommunities;
        private @Nullable List<String> advertisedPublicPrefixes;
        private String advertisedPublicPrefixesState;
        private @Nullable Integer customerASN;
        private @Nullable Integer legacyMode;
        private @Nullable String routingRegistryName;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitPeeringConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertisedCommunities = defaults.advertisedCommunities;
    	      this.advertisedPublicPrefixes = defaults.advertisedPublicPrefixes;
    	      this.advertisedPublicPrefixesState = defaults.advertisedPublicPrefixesState;
    	      this.customerASN = defaults.customerASN;
    	      this.legacyMode = defaults.legacyMode;
    	      this.routingRegistryName = defaults.routingRegistryName;
        }

        public Builder setAdvertisedCommunities(@Nullable List<String> advertisedCommunities) {
            this.advertisedCommunities = advertisedCommunities;
            return this;
        }

        public Builder setAdvertisedPublicPrefixes(@Nullable List<String> advertisedPublicPrefixes) {
            this.advertisedPublicPrefixes = advertisedPublicPrefixes;
            return this;
        }

        public Builder setAdvertisedPublicPrefixesState(String advertisedPublicPrefixesState) {
            this.advertisedPublicPrefixesState = Objects.requireNonNull(advertisedPublicPrefixesState);
            return this;
        }

        public Builder setCustomerASN(@Nullable Integer customerASN) {
            this.customerASN = customerASN;
            return this;
        }

        public Builder setLegacyMode(@Nullable Integer legacyMode) {
            this.legacyMode = legacyMode;
            return this;
        }

        public Builder setRoutingRegistryName(@Nullable String routingRegistryName) {
            this.routingRegistryName = routingRegistryName;
            return this;
        }
        public ExpressRouteCircuitPeeringConfigResponse build() {
            return new ExpressRouteCircuitPeeringConfigResponse(advertisedCommunities, advertisedPublicPrefixes, advertisedPublicPrefixesState, customerASN, legacyMode, routingRegistryName);
        }
    }
}