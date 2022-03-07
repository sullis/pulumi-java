// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.bigtableadmin_v2.enums.ClusterDefaultStorageType;
import io.pulumi.googlenative.bigtableadmin_v2.inputs.ClusterConfigArgs;
import io.pulumi.googlenative.bigtableadmin_v2.inputs.EncryptionConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * Configuration for this cluster.
     * 
     */
    @InputImport(name="clusterConfig")
      private final @Nullable Input<ClusterConfigArgs> clusterConfig;

    public Input<ClusterConfigArgs> getClusterConfig() {
        return this.clusterConfig == null ? Input.empty() : this.clusterConfig;
    }

    @InputImport(name="clusterId", required=true)
      private final Input<String> clusterId;

    public Input<String> getClusterId() {
        return this.clusterId;
    }

    /**
     * Immutable. The type of storage used by this cluster to serve its parent instance's tables, unless explicitly overridden.
     * 
     */
    @InputImport(name="defaultStorageType")
      private final @Nullable Input<ClusterDefaultStorageType> defaultStorageType;

    public Input<ClusterDefaultStorageType> getDefaultStorageType() {
        return this.defaultStorageType == null ? Input.empty() : this.defaultStorageType;
    }

    /**
     * Immutable. The encryption configuration for CMEK-protected clusters.
     * 
     */
    @InputImport(name="encryptionConfig")
      private final @Nullable Input<EncryptionConfigArgs> encryptionConfig;

    public Input<EncryptionConfigArgs> getEncryptionConfig() {
        return this.encryptionConfig == null ? Input.empty() : this.encryptionConfig;
    }

    @InputImport(name="instanceId", required=true)
      private final Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * Immutable. The location where this cluster's nodes and storage reside. For best performance, clients should be located as close as possible to this cluster. Currently only zones are supported, so values should be of the form `projects/{project}/locations/{zone}`.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The unique name of the cluster. Values are of the form `projects/{project}/instances/{instance}/clusters/a-z*`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The number of nodes allocated to this cluster. More nodes enable higher throughput and more consistent performance.
     * 
     */
    @InputImport(name="serveNodes")
      private final @Nullable Input<Integer> serveNodes;

    public Input<Integer> getServeNodes() {
        return this.serveNodes == null ? Input.empty() : this.serveNodes;
    }

    public ClusterArgs(
        @Nullable Input<ClusterConfigArgs> clusterConfig,
        Input<String> clusterId,
        @Nullable Input<ClusterDefaultStorageType> defaultStorageType,
        @Nullable Input<EncryptionConfigArgs> encryptionConfig,
        Input<String> instanceId,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<Integer> serveNodes) {
        this.clusterConfig = clusterConfig;
        this.clusterId = Objects.requireNonNull(clusterId, "expected parameter 'clusterId' to be non-null");
        this.defaultStorageType = defaultStorageType;
        this.encryptionConfig = encryptionConfig;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.location = location;
        this.name = name;
        this.project = project;
        this.serveNodes = serveNodes;
    }

    private ClusterArgs() {
        this.clusterConfig = Input.empty();
        this.clusterId = Input.empty();
        this.defaultStorageType = Input.empty();
        this.encryptionConfig = Input.empty();
        this.instanceId = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.serveNodes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClusterConfigArgs> clusterConfig;
        private Input<String> clusterId;
        private @Nullable Input<ClusterDefaultStorageType> defaultStorageType;
        private @Nullable Input<EncryptionConfigArgs> encryptionConfig;
        private Input<String> instanceId;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<Integer> serveNodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterConfig = defaults.clusterConfig;
    	      this.clusterId = defaults.clusterId;
    	      this.defaultStorageType = defaults.defaultStorageType;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.instanceId = defaults.instanceId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.serveNodes = defaults.serveNodes;
        }

        public Builder setClusterConfig(@Nullable Input<ClusterConfigArgs> clusterConfig) {
            this.clusterConfig = clusterConfig;
            return this;
        }

        public Builder setClusterConfig(@Nullable ClusterConfigArgs clusterConfig) {
            this.clusterConfig = Input.ofNullable(clusterConfig);
            return this;
        }

        public Builder setClusterId(Input<String> clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }

        public Builder setClusterId(String clusterId) {
            this.clusterId = Input.of(Objects.requireNonNull(clusterId));
            return this;
        }

        public Builder setDefaultStorageType(@Nullable Input<ClusterDefaultStorageType> defaultStorageType) {
            this.defaultStorageType = defaultStorageType;
            return this;
        }

        public Builder setDefaultStorageType(@Nullable ClusterDefaultStorageType defaultStorageType) {
            this.defaultStorageType = Input.ofNullable(defaultStorageType);
            return this;
        }

        public Builder setEncryptionConfig(@Nullable Input<EncryptionConfigArgs> encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }

        public Builder setEncryptionConfig(@Nullable EncryptionConfigArgs encryptionConfig) {
            this.encryptionConfig = Input.ofNullable(encryptionConfig);
            return this;
        }

        public Builder setInstanceId(Input<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Input.of(Objects.requireNonNull(instanceId));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setServeNodes(@Nullable Input<Integer> serveNodes) {
            this.serveNodes = serveNodes;
            return this;
        }

        public Builder setServeNodes(@Nullable Integer serveNodes) {
            this.serveNodes = Input.ofNullable(serveNodes);
            return this;
        }
        public ClusterArgs build() {
            return new ClusterArgs(clusterConfig, clusterId, defaultStorageType, encryptionConfig, instanceId, location, name, project, serveNodes);
        }
    }
}