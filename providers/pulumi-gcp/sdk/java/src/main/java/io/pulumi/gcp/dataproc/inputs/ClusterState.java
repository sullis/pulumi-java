// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigGetArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterState extends io.pulumi.resources.ResourceArgs {

    public static final ClusterState Empty = new ClusterState();

    /**
     * Allows you to configure various aspects of the cluster.
     * Structure defined below.
     * 
     */
    @InputImport(name="clusterConfig")
    private final @Nullable Input<ClusterClusterConfigGetArgs> clusterConfig;

    public Input<ClusterClusterConfigGetArgs> getClusterConfig() {
        return this.clusterConfig == null ? Input.empty() : this.clusterConfig;
    }

    /**
     * The timeout duration which allows graceful decomissioning when you change the number of worker nodes directly through a
     * terraform apply
     * 
     */
    @InputImport(name="gracefulDecommissionTimeout")
    private final @Nullable Input<String> gracefulDecommissionTimeout;

    public Input<String> getGracefulDecommissionTimeout() {
        return this.gracefulDecommissionTimeout == null ? Input.empty() : this.gracefulDecommissionTimeout;
    }

    /**
     * The list of labels (key/value pairs) to be applied to
     * instances in the cluster. GCP generates some itself including `goog-dataproc-cluster-name`
     * which is the name of the cluster.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The name of the cluster, unique within the project and
     * zone.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the `cluster` will exist. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The region in which the cluster and associated nodes will be created in.
     * Defaults to `global`.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    public ClusterState(
        @Nullable Input<ClusterClusterConfigGetArgs> clusterConfig,
        @Nullable Input<String> gracefulDecommissionTimeout,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> region) {
        this.clusterConfig = clusterConfig;
        this.gracefulDecommissionTimeout = gracefulDecommissionTimeout;
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.region = region;
    }

    private ClusterState() {
        this.clusterConfig = Input.empty();
        this.gracefulDecommissionTimeout = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClusterClusterConfigGetArgs> clusterConfig;
        private @Nullable Input<String> gracefulDecommissionTimeout;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterConfig = defaults.clusterConfig;
    	      this.gracefulDecommissionTimeout = defaults.gracefulDecommissionTimeout;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder setClusterConfig(@Nullable Input<ClusterClusterConfigGetArgs> clusterConfig) {
            this.clusterConfig = clusterConfig;
            return this;
        }

        public Builder setClusterConfig(@Nullable ClusterClusterConfigGetArgs clusterConfig) {
            this.clusterConfig = Input.ofNullable(clusterConfig);
            return this;
        }

        public Builder setGracefulDecommissionTimeout(@Nullable Input<String> gracefulDecommissionTimeout) {
            this.gracefulDecommissionTimeout = gracefulDecommissionTimeout;
            return this;
        }

        public Builder setGracefulDecommissionTimeout(@Nullable String gracefulDecommissionTimeout) {
            this.gracefulDecommissionTimeout = Input.ofNullable(gracefulDecommissionTimeout);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
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

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public ClusterState build() {
            return new ClusterState(clusterConfig, gracefulDecommissionTimeout, labels, name, project, region);
        }
    }
}
