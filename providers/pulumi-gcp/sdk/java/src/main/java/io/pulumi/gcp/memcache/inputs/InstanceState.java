// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.memcache.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.memcache.inputs.InstanceMemcacheNodeGetArgs;
import io.pulumi.gcp.memcache.inputs.InstanceMemcacheParametersGetArgs;
import io.pulumi.gcp.memcache.inputs.InstanceNodeConfigGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceState extends io.pulumi.resources.ResourceArgs {

    public static final InstanceState Empty = new InstanceState();

    /**
     * The full name of the GCE network to connect the instance to.  If not provided,
     * 'default' will be used.
     * 
     */
    @Import(name="authorizedNetwork")
      private final @Nullable Output<String> authorizedNetwork;

    public Output<String> getAuthorizedNetwork() {
        return this.authorizedNetwork == null ? Output.empty() : this.authorizedNetwork;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime == null ? Output.empty() : this.createTime;
    }

    /**
     * Endpoint for Discovery API
     * 
     */
    @Import(name="discoveryEndpoint")
      private final @Nullable Output<String> discoveryEndpoint;

    public Output<String> getDiscoveryEndpoint() {
        return this.discoveryEndpoint == null ? Output.empty() : this.discoveryEndpoint;
    }

    /**
     * A user-visible name for the instance.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * The full version of memcached server running on this instance.
     * 
     */
    @Import(name="memcacheFullVersion")
      private final @Nullable Output<String> memcacheFullVersion;

    public Output<String> getMemcacheFullVersion() {
        return this.memcacheFullVersion == null ? Output.empty() : this.memcacheFullVersion;
    }

    /**
     * Additional information about the instance state, if available.
     * 
     */
    @Import(name="memcacheNodes")
      private final @Nullable Output<List<InstanceMemcacheNodeGetArgs>> memcacheNodes;

    public Output<List<InstanceMemcacheNodeGetArgs>> getMemcacheNodes() {
        return this.memcacheNodes == null ? Output.empty() : this.memcacheNodes;
    }

    /**
     * User-specified parameters for this memcache instance.
     * Structure is documented below.
     * 
     */
    @Import(name="memcacheParameters")
      private final @Nullable Output<InstanceMemcacheParametersGetArgs> memcacheParameters;

    public Output<InstanceMemcacheParametersGetArgs> getMemcacheParameters() {
        return this.memcacheParameters == null ? Output.empty() : this.memcacheParameters;
    }

    /**
     * The major version of Memcached software. If not provided, latest supported version will be used.
     * Currently the latest supported major version is MEMCACHE_1_5. The minor version will be automatically
     * determined by our system based on the latest supported minor version.
     * Default value is `MEMCACHE_1_5`.
     * Possible values are `MEMCACHE_1_5`.
     * 
     */
    @Import(name="memcacheVersion")
      private final @Nullable Output<String> memcacheVersion;

    public Output<String> getMemcacheVersion() {
        return this.memcacheVersion == null ? Output.empty() : this.memcacheVersion;
    }

    /**
     * The resource name of the instance.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Configuration for memcache nodes.
     * Structure is documented below.
     * 
     */
    @Import(name="nodeConfig")
      private final @Nullable Output<InstanceNodeConfigGetArgs> nodeConfig;

    public Output<InstanceNodeConfigGetArgs> getNodeConfig() {
        return this.nodeConfig == null ? Output.empty() : this.nodeConfig;
    }

    /**
     * Number of nodes in the memcache instance.
     * 
     */
    @Import(name="nodeCount")
      private final @Nullable Output<Integer> nodeCount;

    public Output<Integer> getNodeCount() {
        return this.nodeCount == null ? Output.empty() : this.nodeCount;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The region of the Memcache instance. If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * Zones where memcache nodes should be provisioned.  If not
     * provided, all zones will be used.
     * 
     */
    @Import(name="zones")
      private final @Nullable Output<List<String>> zones;

    public Output<List<String>> getZones() {
        return this.zones == null ? Output.empty() : this.zones;
    }

    public InstanceState(
        @Nullable Output<String> authorizedNetwork,
        @Nullable Output<String> createTime,
        @Nullable Output<String> discoveryEndpoint,
        @Nullable Output<String> displayName,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> memcacheFullVersion,
        @Nullable Output<List<InstanceMemcacheNodeGetArgs>> memcacheNodes,
        @Nullable Output<InstanceMemcacheParametersGetArgs> memcacheParameters,
        @Nullable Output<String> memcacheVersion,
        @Nullable Output<String> name,
        @Nullable Output<InstanceNodeConfigGetArgs> nodeConfig,
        @Nullable Output<Integer> nodeCount,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<List<String>> zones) {
        this.authorizedNetwork = authorizedNetwork;
        this.createTime = createTime;
        this.discoveryEndpoint = discoveryEndpoint;
        this.displayName = displayName;
        this.labels = labels;
        this.memcacheFullVersion = memcacheFullVersion;
        this.memcacheNodes = memcacheNodes;
        this.memcacheParameters = memcacheParameters;
        this.memcacheVersion = memcacheVersion;
        this.name = name;
        this.nodeConfig = nodeConfig;
        this.nodeCount = nodeCount;
        this.project = project;
        this.region = region;
        this.zones = zones;
    }

    private InstanceState() {
        this.authorizedNetwork = Output.empty();
        this.createTime = Output.empty();
        this.discoveryEndpoint = Output.empty();
        this.displayName = Output.empty();
        this.labels = Output.empty();
        this.memcacheFullVersion = Output.empty();
        this.memcacheNodes = Output.empty();
        this.memcacheParameters = Output.empty();
        this.memcacheVersion = Output.empty();
        this.name = Output.empty();
        this.nodeConfig = Output.empty();
        this.nodeCount = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.zones = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authorizedNetwork;
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> discoveryEndpoint;
        private @Nullable Output<String> displayName;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> memcacheFullVersion;
        private @Nullable Output<List<InstanceMemcacheNodeGetArgs>> memcacheNodes;
        private @Nullable Output<InstanceMemcacheParametersGetArgs> memcacheParameters;
        private @Nullable Output<String> memcacheVersion;
        private @Nullable Output<String> name;
        private @Nullable Output<InstanceNodeConfigGetArgs> nodeConfig;
        private @Nullable Output<Integer> nodeCount;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedNetwork = defaults.authorizedNetwork;
    	      this.createTime = defaults.createTime;
    	      this.discoveryEndpoint = defaults.discoveryEndpoint;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.memcacheFullVersion = defaults.memcacheFullVersion;
    	      this.memcacheNodes = defaults.memcacheNodes;
    	      this.memcacheParameters = defaults.memcacheParameters;
    	      this.memcacheVersion = defaults.memcacheVersion;
    	      this.name = defaults.name;
    	      this.nodeConfig = defaults.nodeConfig;
    	      this.nodeCount = defaults.nodeCount;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.zones = defaults.zones;
        }

        public Builder authorizedNetwork(@Nullable Output<String> authorizedNetwork) {
            this.authorizedNetwork = authorizedNetwork;
            return this;
        }
        public Builder authorizedNetwork(@Nullable String authorizedNetwork) {
            this.authorizedNetwork = Output.ofNullable(authorizedNetwork);
            return this;
        }
        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Output.ofNullable(createTime);
            return this;
        }
        public Builder discoveryEndpoint(@Nullable Output<String> discoveryEndpoint) {
            this.discoveryEndpoint = discoveryEndpoint;
            return this;
        }
        public Builder discoveryEndpoint(@Nullable String discoveryEndpoint) {
            this.discoveryEndpoint = Output.ofNullable(discoveryEndpoint);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder memcacheFullVersion(@Nullable Output<String> memcacheFullVersion) {
            this.memcacheFullVersion = memcacheFullVersion;
            return this;
        }
        public Builder memcacheFullVersion(@Nullable String memcacheFullVersion) {
            this.memcacheFullVersion = Output.ofNullable(memcacheFullVersion);
            return this;
        }
        public Builder memcacheNodes(@Nullable Output<List<InstanceMemcacheNodeGetArgs>> memcacheNodes) {
            this.memcacheNodes = memcacheNodes;
            return this;
        }
        public Builder memcacheNodes(@Nullable List<InstanceMemcacheNodeGetArgs> memcacheNodes) {
            this.memcacheNodes = Output.ofNullable(memcacheNodes);
            return this;
        }
        public Builder memcacheNodes(InstanceMemcacheNodeGetArgs... memcacheNodes) {
            return memcacheNodes(List.of(memcacheNodes));
        }
        public Builder memcacheParameters(@Nullable Output<InstanceMemcacheParametersGetArgs> memcacheParameters) {
            this.memcacheParameters = memcacheParameters;
            return this;
        }
        public Builder memcacheParameters(@Nullable InstanceMemcacheParametersGetArgs memcacheParameters) {
            this.memcacheParameters = Output.ofNullable(memcacheParameters);
            return this;
        }
        public Builder memcacheVersion(@Nullable Output<String> memcacheVersion) {
            this.memcacheVersion = memcacheVersion;
            return this;
        }
        public Builder memcacheVersion(@Nullable String memcacheVersion) {
            this.memcacheVersion = Output.ofNullable(memcacheVersion);
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
        public Builder nodeConfig(@Nullable Output<InstanceNodeConfigGetArgs> nodeConfig) {
            this.nodeConfig = nodeConfig;
            return this;
        }
        public Builder nodeConfig(@Nullable InstanceNodeConfigGetArgs nodeConfig) {
            this.nodeConfig = Output.ofNullable(nodeConfig);
            return this;
        }
        public Builder nodeCount(@Nullable Output<Integer> nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Builder nodeCount(@Nullable Integer nodeCount) {
            this.nodeCount = Output.ofNullable(nodeCount);
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
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }
        public Builder zones(@Nullable Output<List<String>> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(@Nullable List<String> zones) {
            this.zones = Output.ofNullable(zones);
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public InstanceState build() {
            return new InstanceState(authorizedNetwork, createTime, discoveryEndpoint, displayName, labels, memcacheFullVersion, memcacheNodes, memcacheParameters, memcacheVersion, name, nodeConfig, nodeCount, project, region, zones);
        }
    }
}
