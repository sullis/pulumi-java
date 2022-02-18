// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * RouteTable route.
 * 
 */
public final class HubRouteArgs extends io.pulumi.resources.ResourceArgs {

    public static final HubRouteArgs Empty = new HubRouteArgs();

    /**
     * The type of destinations (eg: CIDR, ResourceId, Service).
     * 
     */
    @InputImport(name="destinationType", required=true)
    private final Input<String> destinationType;

    public Input<String> getDestinationType() {
        return this.destinationType;
    }

    /**
     * List of all destinations.
     * 
     */
    @InputImport(name="destinations", required=true)
    private final Input<List<String>> destinations;

    public Input<List<String>> getDestinations() {
        return this.destinations;
    }

    /**
     * The name of the Route that is unique within a RouteTable. This name can be used to access this route.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * NextHop resource ID.
     * 
     */
    @InputImport(name="nextHop", required=true)
    private final Input<String> nextHop;

    public Input<String> getNextHop() {
        return this.nextHop;
    }

    /**
     * The type of next hop (eg: ResourceId).
     * 
     */
    @InputImport(name="nextHopType", required=true)
    private final Input<String> nextHopType;

    public Input<String> getNextHopType() {
        return this.nextHopType;
    }

    public HubRouteArgs(
        Input<String> destinationType,
        Input<List<String>> destinations,
        Input<String> name,
        Input<String> nextHop,
        Input<String> nextHopType) {
        this.destinationType = Objects.requireNonNull(destinationType, "expected parameter 'destinationType' to be non-null");
        this.destinations = Objects.requireNonNull(destinations, "expected parameter 'destinations' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.nextHop = Objects.requireNonNull(nextHop, "expected parameter 'nextHop' to be non-null");
        this.nextHopType = Objects.requireNonNull(nextHopType, "expected parameter 'nextHopType' to be non-null");
    }

    private HubRouteArgs() {
        this.destinationType = Input.empty();
        this.destinations = Input.empty();
        this.name = Input.empty();
        this.nextHop = Input.empty();
        this.nextHopType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HubRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> destinationType;
        private Input<List<String>> destinations;
        private Input<String> name;
        private Input<String> nextHop;
        private Input<String> nextHopType;

        public Builder() {
    	      // Empty
        }

        public Builder(HubRouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationType = defaults.destinationType;
    	      this.destinations = defaults.destinations;
    	      this.name = defaults.name;
    	      this.nextHop = defaults.nextHop;
    	      this.nextHopType = defaults.nextHopType;
        }

        public Builder setDestinationType(Input<String> destinationType) {
            this.destinationType = Objects.requireNonNull(destinationType);
            return this;
        }

        public Builder setDestinationType(String destinationType) {
            this.destinationType = Input.of(Objects.requireNonNull(destinationType));
            return this;
        }

        public Builder setDestinations(Input<List<String>> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }

        public Builder setDestinations(List<String> destinations) {
            this.destinations = Input.of(Objects.requireNonNull(destinations));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setNextHop(Input<String> nextHop) {
            this.nextHop = Objects.requireNonNull(nextHop);
            return this;
        }

        public Builder setNextHop(String nextHop) {
            this.nextHop = Input.of(Objects.requireNonNull(nextHop));
            return this;
        }

        public Builder setNextHopType(Input<String> nextHopType) {
            this.nextHopType = Objects.requireNonNull(nextHopType);
            return this;
        }

        public Builder setNextHopType(String nextHopType) {
            this.nextHopType = Input.of(Objects.requireNonNull(nextHopType));
            return this;
        }

        public HubRouteArgs build() {
            return new HubRouteArgs(destinationType, destinations, name, nextHop, nextHopType);
        }
    }
}
