// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * RouteTable route.
 * 
 */
public final class HubRouteResponse extends io.pulumi.resources.InvokeArgs {

    public static final HubRouteResponse Empty = new HubRouteResponse();

    /**
     * The type of destinations (eg: CIDR, ResourceId, Service).
     * 
     */
    @InputImport(name="destinationType", required=true)
    private final String destinationType;

    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * List of all destinations.
     * 
     */
    @InputImport(name="destinations", required=true)
    private final List<String> destinations;

    public List<String> getDestinations() {
        return this.destinations;
    }

    /**
     * The name of the Route that is unique within a RouteTable. This name can be used to access this route.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * NextHop resource ID.
     * 
     */
    @InputImport(name="nextHop", required=true)
    private final String nextHop;

    public String getNextHop() {
        return this.nextHop;
    }

    /**
     * The type of next hop (eg: ResourceId).
     * 
     */
    @InputImport(name="nextHopType", required=true)
    private final String nextHopType;

    public String getNextHopType() {
        return this.nextHopType;
    }

    public HubRouteResponse(
        String destinationType,
        List<String> destinations,
        String name,
        String nextHop,
        String nextHopType) {
        this.destinationType = Objects.requireNonNull(destinationType, "expected parameter 'destinationType' to be non-null");
        this.destinations = Objects.requireNonNull(destinations, "expected parameter 'destinations' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.nextHop = Objects.requireNonNull(nextHop, "expected parameter 'nextHop' to be non-null");
        this.nextHopType = Objects.requireNonNull(nextHopType, "expected parameter 'nextHopType' to be non-null");
    }

    private HubRouteResponse() {
        this.destinationType = null;
        this.destinations = List.of();
        this.name = null;
        this.nextHop = null;
        this.nextHopType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HubRouteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destinationType;
        private List<String> destinations;
        private String name;
        private String nextHop;
        private String nextHopType;

        public Builder() {
    	      // Empty
        }

        public Builder(HubRouteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationType = defaults.destinationType;
    	      this.destinations = defaults.destinations;
    	      this.name = defaults.name;
    	      this.nextHop = defaults.nextHop;
    	      this.nextHopType = defaults.nextHopType;
        }

        public Builder setDestinationType(String destinationType) {
            this.destinationType = Objects.requireNonNull(destinationType);
            return this;
        }

        public Builder setDestinations(List<String> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNextHop(String nextHop) {
            this.nextHop = Objects.requireNonNull(nextHop);
            return this;
        }

        public Builder setNextHopType(String nextHopType) {
            this.nextHopType = Objects.requireNonNull(nextHopType);
            return this;
        }

        public HubRouteResponse build() {
            return new HubRouteResponse(destinationType, destinations, name, nextHop, nextHopType);
        }
    }
}
