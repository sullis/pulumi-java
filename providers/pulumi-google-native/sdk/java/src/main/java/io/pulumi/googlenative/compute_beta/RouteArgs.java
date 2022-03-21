// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteArgs Empty = new RouteArgs();

    /**
     * An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The destination range of outgoing packets that this route applies to. Both IPv4 and IPv6 are supported.
     * 
     */
    @Import(name="destRange")
      private final @Nullable Output<String> destRange;

    public Output<String> getDestRange() {
        return this.destRange == null ? Output.empty() : this.destRange;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Fully-qualified URL of the network that this route applies to.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    /**
     * The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL: projects/ project/global/gateways/default-internet-gateway
     * 
     */
    @Import(name="nextHopGateway")
      private final @Nullable Output<String> nextHopGateway;

    public Output<String> getNextHopGateway() {
        return this.nextHopGateway == null ? Output.empty() : this.nextHopGateway;
    }

    /**
     * The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching packets or the IP address of the forwarding Rule. For example, the following are all valid URLs: - 10.128.0.56 - https://www.googleapis.com/compute/v1/projects/project/regions/region /forwardingRules/forwardingRule - regions/region/forwardingRules/forwardingRule
     * 
     */
    @Import(name="nextHopIlb")
      private final @Nullable Output<String> nextHopIlb;

    public Output<String> getNextHopIlb() {
        return this.nextHopIlb == null ? Output.empty() : this.nextHopIlb;
    }

    /**
     * The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
     * 
     */
    @Import(name="nextHopInstance")
      private final @Nullable Output<String> nextHopInstance;

    public Output<String> getNextHopInstance() {
        return this.nextHopInstance == null ? Output.empty() : this.nextHopInstance;
    }

    /**
     * The network IP address of an instance that should handle matching packets. Only IPv4 is supported.
     * 
     */
    @Import(name="nextHopIp")
      private final @Nullable Output<String> nextHopIp;

    public Output<String> getNextHopIp() {
        return this.nextHopIp == null ? Output.empty() : this.nextHopIp;
    }

    /**
     * The URL of the local network if it should handle matching packets.
     * 
     */
    @Import(name="nextHopNetwork")
      private final @Nullable Output<String> nextHopNetwork;

    public Output<String> getNextHopNetwork() {
        return this.nextHopNetwork == null ? Output.empty() : this.nextHopNetwork;
    }

    /**
     * The URL to a VpnTunnel that should handle matching packets.
     * 
     */
    @Import(name="nextHopVpnTunnel")
      private final @Nullable Output<String> nextHopVpnTunnel;

    public Output<String> getNextHopVpnTunnel() {
        return this.nextHopVpnTunnel == null ? Output.empty() : this.nextHopVpnTunnel;
    }

    /**
     * The priority of this route. Priority is used to break ties in cases where there is more than one matching route of equal prefix length. In cases where multiple routes have equal prefix length, the one with the lowest-numbered priority value wins. The default value is `1000`. The priority value must be from `0` to `65535`, inclusive.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority == null ? Output.empty() : this.priority;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    /**
     * A list of instance tags to which this route applies.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public RouteArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> destRange,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<String> nextHopGateway,
        @Nullable Output<String> nextHopIlb,
        @Nullable Output<String> nextHopInstance,
        @Nullable Output<String> nextHopIp,
        @Nullable Output<String> nextHopNetwork,
        @Nullable Output<String> nextHopVpnTunnel,
        @Nullable Output<Integer> priority,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<List<String>> tags) {
        this.description = description;
        this.destRange = destRange;
        this.name = name;
        this.network = network;
        this.nextHopGateway = nextHopGateway;
        this.nextHopIlb = nextHopIlb;
        this.nextHopInstance = nextHopInstance;
        this.nextHopIp = nextHopIp;
        this.nextHopNetwork = nextHopNetwork;
        this.nextHopVpnTunnel = nextHopVpnTunnel;
        this.priority = priority;
        this.project = project;
        this.requestId = requestId;
        this.tags = tags;
    }

    private RouteArgs() {
        this.description = Output.empty();
        this.destRange = Output.empty();
        this.name = Output.empty();
        this.network = Output.empty();
        this.nextHopGateway = Output.empty();
        this.nextHopIlb = Output.empty();
        this.nextHopInstance = Output.empty();
        this.nextHopIp = Output.empty();
        this.nextHopNetwork = Output.empty();
        this.nextHopVpnTunnel = Output.empty();
        this.priority = Output.empty();
        this.project = Output.empty();
        this.requestId = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> destRange;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<String> nextHopGateway;
        private @Nullable Output<String> nextHopIlb;
        private @Nullable Output<String> nextHopInstance;
        private @Nullable Output<String> nextHopIp;
        private @Nullable Output<String> nextHopNetwork;
        private @Nullable Output<String> nextHopVpnTunnel;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<List<String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destRange = defaults.destRange;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.nextHopGateway = defaults.nextHopGateway;
    	      this.nextHopIlb = defaults.nextHopIlb;
    	      this.nextHopInstance = defaults.nextHopInstance;
    	      this.nextHopIp = defaults.nextHopIp;
    	      this.nextHopNetwork = defaults.nextHopNetwork;
    	      this.nextHopVpnTunnel = defaults.nextHopVpnTunnel;
    	      this.priority = defaults.priority;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder destRange(@Nullable Output<String> destRange) {
            this.destRange = destRange;
            return this;
        }
        public Builder destRange(@Nullable String destRange) {
            this.destRange = Output.ofNullable(destRange);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Output.ofNullable(network);
            return this;
        }
        public Builder nextHopGateway(@Nullable Output<String> nextHopGateway) {
            this.nextHopGateway = nextHopGateway;
            return this;
        }
        public Builder nextHopGateway(@Nullable String nextHopGateway) {
            this.nextHopGateway = Output.ofNullable(nextHopGateway);
            return this;
        }
        public Builder nextHopIlb(@Nullable Output<String> nextHopIlb) {
            this.nextHopIlb = nextHopIlb;
            return this;
        }
        public Builder nextHopIlb(@Nullable String nextHopIlb) {
            this.nextHopIlb = Output.ofNullable(nextHopIlb);
            return this;
        }
        public Builder nextHopInstance(@Nullable Output<String> nextHopInstance) {
            this.nextHopInstance = nextHopInstance;
            return this;
        }
        public Builder nextHopInstance(@Nullable String nextHopInstance) {
            this.nextHopInstance = Output.ofNullable(nextHopInstance);
            return this;
        }
        public Builder nextHopIp(@Nullable Output<String> nextHopIp) {
            this.nextHopIp = nextHopIp;
            return this;
        }
        public Builder nextHopIp(@Nullable String nextHopIp) {
            this.nextHopIp = Output.ofNullable(nextHopIp);
            return this;
        }
        public Builder nextHopNetwork(@Nullable Output<String> nextHopNetwork) {
            this.nextHopNetwork = nextHopNetwork;
            return this;
        }
        public Builder nextHopNetwork(@Nullable String nextHopNetwork) {
            this.nextHopNetwork = Output.ofNullable(nextHopNetwork);
            return this;
        }
        public Builder nextHopVpnTunnel(@Nullable Output<String> nextHopVpnTunnel) {
            this.nextHopVpnTunnel = nextHopVpnTunnel;
            return this;
        }
        public Builder nextHopVpnTunnel(@Nullable String nextHopVpnTunnel) {
            this.nextHopVpnTunnel = Output.ofNullable(nextHopVpnTunnel);
            return this;
        }
        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = Output.ofNullable(priority);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }
        public Builder tags(@Nullable Output<List<String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }        public RouteArgs build() {
            return new RouteArgs(description, destRange, name, network, nextHopGateway, nextHopIlb, nextHopInstance, nextHopIp, nextHopNetwork, nextHopVpnTunnel, priority, project, requestId, tags);
        }
    }
}
