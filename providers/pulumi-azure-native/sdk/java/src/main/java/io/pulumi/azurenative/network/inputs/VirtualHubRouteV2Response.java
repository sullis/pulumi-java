// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VirtualHubRouteTableV2 route.
 * 
 */
public final class VirtualHubRouteV2Response extends io.pulumi.resources.InvokeArgs {

    public static final VirtualHubRouteV2Response Empty = new VirtualHubRouteV2Response();

    /**
     * The type of destinations.
     * 
     */
    @InputImport(name="destinationType")
    private final @Nullable String destinationType;

    public Optional<String> getDestinationType() {
        return this.destinationType == null ? Optional.empty() : Optional.ofNullable(this.destinationType);
    }

    /**
     * List of all destinations.
     * 
     */
    @InputImport(name="destinations")
    private final @Nullable List<String> destinations;

    public List<String> getDestinations() {
        return this.destinations == null ? List.of() : this.destinations;
    }

    /**
     * The type of next hops.
     * 
     */
    @InputImport(name="nextHopType")
    private final @Nullable String nextHopType;

    public Optional<String> getNextHopType() {
        return this.nextHopType == null ? Optional.empty() : Optional.ofNullable(this.nextHopType);
    }

    /**
     * NextHops ip address.
     * 
     */
    @InputImport(name="nextHops")
    private final @Nullable List<String> nextHops;

    public List<String> getNextHops() {
        return this.nextHops == null ? List.of() : this.nextHops;
    }

    public VirtualHubRouteV2Response(
        @Nullable String destinationType,
        @Nullable List<String> destinations,
        @Nullable String nextHopType,
        @Nullable List<String> nextHops) {
        this.destinationType = destinationType;
        this.destinations = destinations;
        this.nextHopType = nextHopType;
        this.nextHops = nextHops;
    }

    private VirtualHubRouteV2Response() {
        this.destinationType = null;
        this.destinations = List.of();
        this.nextHopType = null;
        this.nextHops = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualHubRouteV2Response defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String destinationType;
        private @Nullable List<String> destinations;
        private @Nullable String nextHopType;
        private @Nullable List<String> nextHops;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualHubRouteV2Response defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationType = defaults.destinationType;
    	      this.destinations = defaults.destinations;
    	      this.nextHopType = defaults.nextHopType;
    	      this.nextHops = defaults.nextHops;
        }

        public Builder setDestinationType(@Nullable String destinationType) {
            this.destinationType = destinationType;
            return this;
        }

        public Builder setDestinations(@Nullable List<String> destinations) {
            this.destinations = destinations;
            return this;
        }

        public Builder setNextHopType(@Nullable String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }

        public Builder setNextHops(@Nullable List<String> nextHops) {
            this.nextHops = nextHops;
            return this;
        }

        public VirtualHubRouteV2Response build() {
            return new VirtualHubRouteV2Response(destinationType, destinations, nextHopType, nextHops);
        }
    }
}
