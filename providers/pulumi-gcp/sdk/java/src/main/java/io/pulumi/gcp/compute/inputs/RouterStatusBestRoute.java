// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RouterStatusBestRoute extends io.pulumi.resources.InvokeArgs {

    public static final RouterStatusBestRoute Empty = new RouterStatusBestRoute();

    @InputImport(name="description", required=true)
    private final String description;

    public String getDescription() {
        return this.description;
    }

    @InputImport(name="destRange", required=true)
    private final String destRange;

    public String getDestRange() {
        return this.destRange;
    }

    /**
     * The name of the router.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The network name or resource link to the parent
     * network of this subnetwork.
     * 
     */
    @InputImport(name="network", required=true)
    private final String network;

    public String getNetwork() {
        return this.network;
    }

    @InputImport(name="nextHopGateway", required=true)
    private final String nextHopGateway;

    public String getNextHopGateway() {
        return this.nextHopGateway;
    }

    @InputImport(name="nextHopIlb", required=true)
    private final String nextHopIlb;

    public String getNextHopIlb() {
        return this.nextHopIlb;
    }

    @InputImport(name="nextHopInstance", required=true)
    private final String nextHopInstance;

    public String getNextHopInstance() {
        return this.nextHopInstance;
    }

    @InputImport(name="nextHopInstanceZone", required=true)
    private final String nextHopInstanceZone;

    public String getNextHopInstanceZone() {
        return this.nextHopInstanceZone;
    }

    @InputImport(name="nextHopIp", required=true)
    private final String nextHopIp;

    public String getNextHopIp() {
        return this.nextHopIp;
    }

    @InputImport(name="nextHopNetwork", required=true)
    private final String nextHopNetwork;

    public String getNextHopNetwork() {
        return this.nextHopNetwork;
    }

    @InputImport(name="nextHopVpnTunnel", required=true)
    private final String nextHopVpnTunnel;

    public String getNextHopVpnTunnel() {
        return this.nextHopVpnTunnel;
    }

    @InputImport(name="priority", required=true)
    private final Integer priority;

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * The ID of the project in which the resource
     * belongs. If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project", required=true)
    private final String project;

    public String getProject() {
        return this.project;
    }

    @InputImport(name="selfLink", required=true)
    private final String selfLink;

    public String getSelfLink() {
        return this.selfLink;
    }

    @InputImport(name="tags", required=true)
    private final List<String> tags;

    public List<String> getTags() {
        return this.tags;
    }

    public RouterStatusBestRoute(
        String description,
        String destRange,
        String name,
        String network,
        String nextHopGateway,
        String nextHopIlb,
        String nextHopInstance,
        String nextHopInstanceZone,
        String nextHopIp,
        String nextHopNetwork,
        String nextHopVpnTunnel,
        Integer priority,
        String project,
        String selfLink,
        List<String> tags) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.destRange = Objects.requireNonNull(destRange, "expected parameter 'destRange' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.nextHopGateway = Objects.requireNonNull(nextHopGateway, "expected parameter 'nextHopGateway' to be non-null");
        this.nextHopIlb = Objects.requireNonNull(nextHopIlb, "expected parameter 'nextHopIlb' to be non-null");
        this.nextHopInstance = Objects.requireNonNull(nextHopInstance, "expected parameter 'nextHopInstance' to be non-null");
        this.nextHopInstanceZone = Objects.requireNonNull(nextHopInstanceZone, "expected parameter 'nextHopInstanceZone' to be non-null");
        this.nextHopIp = Objects.requireNonNull(nextHopIp, "expected parameter 'nextHopIp' to be non-null");
        this.nextHopNetwork = Objects.requireNonNull(nextHopNetwork, "expected parameter 'nextHopNetwork' to be non-null");
        this.nextHopVpnTunnel = Objects.requireNonNull(nextHopVpnTunnel, "expected parameter 'nextHopVpnTunnel' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.selfLink = Objects.requireNonNull(selfLink, "expected parameter 'selfLink' to be non-null");
        this.tags = Objects.requireNonNull(tags, "expected parameter 'tags' to be non-null");
    }

    private RouterStatusBestRoute() {
        this.description = null;
        this.destRange = null;
        this.name = null;
        this.network = null;
        this.nextHopGateway = null;
        this.nextHopIlb = null;
        this.nextHopInstance = null;
        this.nextHopInstanceZone = null;
        this.nextHopIp = null;
        this.nextHopNetwork = null;
        this.nextHopVpnTunnel = null;
        this.priority = null;
        this.project = null;
        this.selfLink = null;
        this.tags = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterStatusBestRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String destRange;
        private String name;
        private String network;
        private String nextHopGateway;
        private String nextHopIlb;
        private String nextHopInstance;
        private String nextHopInstanceZone;
        private String nextHopIp;
        private String nextHopNetwork;
        private String nextHopVpnTunnel;
        private Integer priority;
        private String project;
        private String selfLink;
        private List<String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterStatusBestRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destRange = defaults.destRange;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.nextHopGateway = defaults.nextHopGateway;
    	      this.nextHopIlb = defaults.nextHopIlb;
    	      this.nextHopInstance = defaults.nextHopInstance;
    	      this.nextHopInstanceZone = defaults.nextHopInstanceZone;
    	      this.nextHopIp = defaults.nextHopIp;
    	      this.nextHopNetwork = defaults.nextHopNetwork;
    	      this.nextHopVpnTunnel = defaults.nextHopVpnTunnel;
    	      this.priority = defaults.priority;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDestRange(String destRange) {
            this.destRange = Objects.requireNonNull(destRange);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNextHopGateway(String nextHopGateway) {
            this.nextHopGateway = Objects.requireNonNull(nextHopGateway);
            return this;
        }

        public Builder setNextHopIlb(String nextHopIlb) {
            this.nextHopIlb = Objects.requireNonNull(nextHopIlb);
            return this;
        }

        public Builder setNextHopInstance(String nextHopInstance) {
            this.nextHopInstance = Objects.requireNonNull(nextHopInstance);
            return this;
        }

        public Builder setNextHopInstanceZone(String nextHopInstanceZone) {
            this.nextHopInstanceZone = Objects.requireNonNull(nextHopInstanceZone);
            return this;
        }

        public Builder setNextHopIp(String nextHopIp) {
            this.nextHopIp = Objects.requireNonNull(nextHopIp);
            return this;
        }

        public Builder setNextHopNetwork(String nextHopNetwork) {
            this.nextHopNetwork = Objects.requireNonNull(nextHopNetwork);
            return this;
        }

        public Builder setNextHopVpnTunnel(String nextHopVpnTunnel) {
            this.nextHopVpnTunnel = Objects.requireNonNull(nextHopVpnTunnel);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setTags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public RouterStatusBestRoute build() {
            return new RouterStatusBestRoute(description, destRange, name, network, nextHopGateway, nextHopIlb, nextHopInstance, nextHopInstanceZone, nextHopIp, nextHopNetwork, nextHopVpnTunnel, priority, project, selfLink, tags);
        }
    }
}
