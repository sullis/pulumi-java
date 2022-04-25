// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RouteInfoResponse {
    /**
     * @return Destination IP range of the route.
     * 
     */
    private final String destIpRange;
    /**
     * @return Name of a Compute Engine route.
     * 
     */
    private final String displayName;
    /**
     * @return Instance tags of the route.
     * 
     */
    private final List<String> instanceTags;
    /**
     * @return URI of a Compute Engine network.
     * 
     */
    private final String networkUri;
    /**
     * @return Next hop of the route.
     * 
     */
    private final String nextHop;
    /**
     * @return Type of next hop.
     * 
     */
    private final String nextHopType;
    /**
     * @return Priority of the route.
     * 
     */
    private final Integer priority;
    /**
     * @return Type of route.
     * 
     */
    private final String routeType;
    /**
     * @return URI of a Compute Engine route. Dynamic route from cloud router does not have a URI. Advertised route from Google Cloud VPC to on-premises network also does not have a URI.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private RouteInfoResponse(
        @CustomType.Parameter("destIpRange") String destIpRange,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("instanceTags") List<String> instanceTags,
        @CustomType.Parameter("networkUri") String networkUri,
        @CustomType.Parameter("nextHop") String nextHop,
        @CustomType.Parameter("nextHopType") String nextHopType,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("routeType") String routeType,
        @CustomType.Parameter("uri") String uri) {
        this.destIpRange = destIpRange;
        this.displayName = displayName;
        this.instanceTags = instanceTags;
        this.networkUri = networkUri;
        this.nextHop = nextHop;
        this.nextHopType = nextHopType;
        this.priority = priority;
        this.routeType = routeType;
        this.uri = uri;
    }

    /**
     * @return Destination IP range of the route.
     * 
     */
    public String destIpRange() {
        return this.destIpRange;
    }
    /**
     * @return Name of a Compute Engine route.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Instance tags of the route.
     * 
     */
    public List<String> instanceTags() {
        return this.instanceTags;
    }
    /**
     * @return URI of a Compute Engine network.
     * 
     */
    public String networkUri() {
        return this.networkUri;
    }
    /**
     * @return Next hop of the route.
     * 
     */
    public String nextHop() {
        return this.nextHop;
    }
    /**
     * @return Type of next hop.
     * 
     */
    public String nextHopType() {
        return this.nextHopType;
    }
    /**
     * @return Priority of the route.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return Type of route.
     * 
     */
    public String routeType() {
        return this.routeType;
    }
    /**
     * @return URI of a Compute Engine route. Dynamic route from cloud router does not have a URI. Advertised route from Google Cloud VPC to on-premises network also does not have a URI.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destIpRange;
        private String displayName;
        private List<String> instanceTags;
        private String networkUri;
        private String nextHop;
        private String nextHopType;
        private Integer priority;
        private String routeType;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destIpRange = defaults.destIpRange;
    	      this.displayName = defaults.displayName;
    	      this.instanceTags = defaults.instanceTags;
    	      this.networkUri = defaults.networkUri;
    	      this.nextHop = defaults.nextHop;
    	      this.nextHopType = defaults.nextHopType;
    	      this.priority = defaults.priority;
    	      this.routeType = defaults.routeType;
    	      this.uri = defaults.uri;
        }

        public Builder destIpRange(String destIpRange) {
            this.destIpRange = Objects.requireNonNull(destIpRange);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder instanceTags(List<String> instanceTags) {
            this.instanceTags = Objects.requireNonNull(instanceTags);
            return this;
        }
        public Builder instanceTags(String... instanceTags) {
            return instanceTags(List.of(instanceTags));
        }
        public Builder networkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }
        public Builder nextHop(String nextHop) {
            this.nextHop = Objects.requireNonNull(nextHop);
            return this;
        }
        public Builder nextHopType(String nextHopType) {
            this.nextHopType = Objects.requireNonNull(nextHopType);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder routeType(String routeType) {
            this.routeType = Objects.requireNonNull(routeType);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public RouteInfoResponse build() {
            return new RouteInfoResponse(destIpRange, displayName, instanceTags, networkUri, nextHop, nextHopType, priority, routeType, uri);
        }
    }
}
