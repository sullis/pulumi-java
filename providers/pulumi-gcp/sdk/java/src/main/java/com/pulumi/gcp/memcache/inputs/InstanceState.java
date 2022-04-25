// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.memcache.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.memcache.inputs.InstanceMemcacheNodeGetArgs;
import com.pulumi.gcp.memcache.inputs.InstanceMemcacheParametersGetArgs;
import com.pulumi.gcp.memcache.inputs.InstanceNodeConfigGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceState extends com.pulumi.resources.ResourceArgs {

    public static final InstanceState Empty = new InstanceState();

    /**
     * The full name of the GCE network to connect the instance to.  If not provided,
     * &#39;default&#39; will be used.
     * 
     */
    @Import(name="authorizedNetwork")
    private @Nullable Output<String> authorizedNetwork;

    /**
     * @return The full name of the GCE network to connect the instance to.  If not provided,
     * &#39;default&#39; will be used.
     * 
     */
    public Optional<Output<String>> authorizedNetwork() {
        return Optional.ofNullable(this.authorizedNetwork);
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Endpoint for Discovery API
     * 
     */
    @Import(name="discoveryEndpoint")
    private @Nullable Output<String> discoveryEndpoint;

    /**
     * @return Endpoint for Discovery API
     * 
     */
    public Optional<Output<String>> discoveryEndpoint() {
        return Optional.ofNullable(this.discoveryEndpoint);
    }

    /**
     * A user-visible name for the instance.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A user-visible name for the instance.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Resource labels to represent user-provided metadata.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The full version of memcached server running on this instance.
     * 
     */
    @Import(name="memcacheFullVersion")
    private @Nullable Output<String> memcacheFullVersion;

    /**
     * @return The full version of memcached server running on this instance.
     * 
     */
    public Optional<Output<String>> memcacheFullVersion() {
        return Optional.ofNullable(this.memcacheFullVersion);
    }

    /**
     * Additional information about the instance state, if available.
     * 
     */
    @Import(name="memcacheNodes")
    private @Nullable Output<List<InstanceMemcacheNodeGetArgs>> memcacheNodes;

    /**
     * @return Additional information about the instance state, if available.
     * 
     */
    public Optional<Output<List<InstanceMemcacheNodeGetArgs>>> memcacheNodes() {
        return Optional.ofNullable(this.memcacheNodes);
    }

    /**
     * User-specified parameters for this memcache instance.
     * Structure is documented below.
     * 
     */
    @Import(name="memcacheParameters")
    private @Nullable Output<InstanceMemcacheParametersGetArgs> memcacheParameters;

    /**
     * @return User-specified parameters for this memcache instance.
     * Structure is documented below.
     * 
     */
    public Optional<Output<InstanceMemcacheParametersGetArgs>> memcacheParameters() {
        return Optional.ofNullable(this.memcacheParameters);
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
    private @Nullable Output<String> memcacheVersion;

    /**
     * @return The major version of Memcached software. If not provided, latest supported version will be used.
     * Currently the latest supported major version is MEMCACHE_1_5. The minor version will be automatically
     * determined by our system based on the latest supported minor version.
     * Default value is `MEMCACHE_1_5`.
     * Possible values are `MEMCACHE_1_5`.
     * 
     */
    public Optional<Output<String>> memcacheVersion() {
        return Optional.ofNullable(this.memcacheVersion);
    }

    /**
     * The resource name of the instance.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the instance.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Configuration for memcache nodes.
     * Structure is documented below.
     * 
     */
    @Import(name="nodeConfig")
    private @Nullable Output<InstanceNodeConfigGetArgs> nodeConfig;

    /**
     * @return Configuration for memcache nodes.
     * Structure is documented below.
     * 
     */
    public Optional<Output<InstanceNodeConfigGetArgs>> nodeConfig() {
        return Optional.ofNullable(this.nodeConfig);
    }

    /**
     * Number of nodes in the memcache instance.
     * 
     */
    @Import(name="nodeCount")
    private @Nullable Output<Integer> nodeCount;

    /**
     * @return Number of nodes in the memcache instance.
     * 
     */
    public Optional<Output<Integer>> nodeCount() {
        return Optional.ofNullable(this.nodeCount);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The region of the Memcache instance. If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region of the Memcache instance. If it is not provided, the provider region is used.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Zones where memcache nodes should be provisioned.  If not
     * provided, all zones will be used.
     * 
     */
    @Import(name="zones")
    private @Nullable Output<List<String>> zones;

    /**
     * @return Zones where memcache nodes should be provisioned.  If not
     * provided, all zones will be used.
     * 
     */
    public Optional<Output<List<String>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private InstanceState() {}

    private InstanceState(InstanceState $) {
        this.authorizedNetwork = $.authorizedNetwork;
        this.createTime = $.createTime;
        this.discoveryEndpoint = $.discoveryEndpoint;
        this.displayName = $.displayName;
        this.labels = $.labels;
        this.memcacheFullVersion = $.memcacheFullVersion;
        this.memcacheNodes = $.memcacheNodes;
        this.memcacheParameters = $.memcacheParameters;
        this.memcacheVersion = $.memcacheVersion;
        this.name = $.name;
        this.nodeConfig = $.nodeConfig;
        this.nodeCount = $.nodeCount;
        this.project = $.project;
        this.region = $.region;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceState $;

        public Builder() {
            $ = new InstanceState();
        }

        public Builder(InstanceState defaults) {
            $ = new InstanceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizedNetwork The full name of the GCE network to connect the instance to.  If not provided,
         * &#39;default&#39; will be used.
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetwork(@Nullable Output<String> authorizedNetwork) {
            $.authorizedNetwork = authorizedNetwork;
            return this;
        }

        /**
         * @param authorizedNetwork The full name of the GCE network to connect the instance to.  If not provided,
         * &#39;default&#39; will be used.
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetwork(String authorizedNetwork) {
            return authorizedNetwork(Output.of(authorizedNetwork));
        }

        /**
         * @param createTime Creation timestamp in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Creation timestamp in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param discoveryEndpoint Endpoint for Discovery API
         * 
         * @return builder
         * 
         */
        public Builder discoveryEndpoint(@Nullable Output<String> discoveryEndpoint) {
            $.discoveryEndpoint = discoveryEndpoint;
            return this;
        }

        /**
         * @param discoveryEndpoint Endpoint for Discovery API
         * 
         * @return builder
         * 
         */
        public Builder discoveryEndpoint(String discoveryEndpoint) {
            return discoveryEndpoint(Output.of(discoveryEndpoint));
        }

        /**
         * @param displayName A user-visible name for the instance.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A user-visible name for the instance.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param labels Resource labels to represent user-provided metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Resource labels to represent user-provided metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param memcacheFullVersion The full version of memcached server running on this instance.
         * 
         * @return builder
         * 
         */
        public Builder memcacheFullVersion(@Nullable Output<String> memcacheFullVersion) {
            $.memcacheFullVersion = memcacheFullVersion;
            return this;
        }

        /**
         * @param memcacheFullVersion The full version of memcached server running on this instance.
         * 
         * @return builder
         * 
         */
        public Builder memcacheFullVersion(String memcacheFullVersion) {
            return memcacheFullVersion(Output.of(memcacheFullVersion));
        }

        /**
         * @param memcacheNodes Additional information about the instance state, if available.
         * 
         * @return builder
         * 
         */
        public Builder memcacheNodes(@Nullable Output<List<InstanceMemcacheNodeGetArgs>> memcacheNodes) {
            $.memcacheNodes = memcacheNodes;
            return this;
        }

        /**
         * @param memcacheNodes Additional information about the instance state, if available.
         * 
         * @return builder
         * 
         */
        public Builder memcacheNodes(List<InstanceMemcacheNodeGetArgs> memcacheNodes) {
            return memcacheNodes(Output.of(memcacheNodes));
        }

        /**
         * @param memcacheNodes Additional information about the instance state, if available.
         * 
         * @return builder
         * 
         */
        public Builder memcacheNodes(InstanceMemcacheNodeGetArgs... memcacheNodes) {
            return memcacheNodes(List.of(memcacheNodes));
        }

        /**
         * @param memcacheParameters User-specified parameters for this memcache instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder memcacheParameters(@Nullable Output<InstanceMemcacheParametersGetArgs> memcacheParameters) {
            $.memcacheParameters = memcacheParameters;
            return this;
        }

        /**
         * @param memcacheParameters User-specified parameters for this memcache instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder memcacheParameters(InstanceMemcacheParametersGetArgs memcacheParameters) {
            return memcacheParameters(Output.of(memcacheParameters));
        }

        /**
         * @param memcacheVersion The major version of Memcached software. If not provided, latest supported version will be used.
         * Currently the latest supported major version is MEMCACHE_1_5. The minor version will be automatically
         * determined by our system based on the latest supported minor version.
         * Default value is `MEMCACHE_1_5`.
         * Possible values are `MEMCACHE_1_5`.
         * 
         * @return builder
         * 
         */
        public Builder memcacheVersion(@Nullable Output<String> memcacheVersion) {
            $.memcacheVersion = memcacheVersion;
            return this;
        }

        /**
         * @param memcacheVersion The major version of Memcached software. If not provided, latest supported version will be used.
         * Currently the latest supported major version is MEMCACHE_1_5. The minor version will be automatically
         * determined by our system based on the latest supported minor version.
         * Default value is `MEMCACHE_1_5`.
         * Possible values are `MEMCACHE_1_5`.
         * 
         * @return builder
         * 
         */
        public Builder memcacheVersion(String memcacheVersion) {
            return memcacheVersion(Output.of(memcacheVersion));
        }

        /**
         * @param name The resource name of the instance.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the instance.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeConfig Configuration for memcache nodes.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder nodeConfig(@Nullable Output<InstanceNodeConfigGetArgs> nodeConfig) {
            $.nodeConfig = nodeConfig;
            return this;
        }

        /**
         * @param nodeConfig Configuration for memcache nodes.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder nodeConfig(InstanceNodeConfigGetArgs nodeConfig) {
            return nodeConfig(Output.of(nodeConfig));
        }

        /**
         * @param nodeCount Number of nodes in the memcache instance.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(@Nullable Output<Integer> nodeCount) {
            $.nodeCount = nodeCount;
            return this;
        }

        /**
         * @param nodeCount Number of nodes in the memcache instance.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(Integer nodeCount) {
            return nodeCount(Output.of(nodeCount));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region The region of the Memcache instance. If it is not provided, the provider region is used.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region of the Memcache instance. If it is not provided, the provider region is used.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param zones Zones where memcache nodes should be provisioned.  If not
         * provided, all zones will be used.
         * 
         * @return builder
         * 
         */
        public Builder zones(@Nullable Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones Zones where memcache nodes should be provisioned.  If not
         * provided, all zones will be used.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        /**
         * @param zones Zones where memcache nodes should be provisioned.  If not
         * provided, all zones will be used.
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public InstanceState build() {
            return $;
        }
    }

}
