// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.ClusterConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cluster that is managed by the workflow.
 * 
 */
public final class ManagedClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedClusterArgs Empty = new ManagedClusterArgs();

    /**
     * The cluster name prefix. A unique cluster name will be formed by appending a random suffix.The name must contain only lower-case letters (a-z), numbers (0-9), and hyphens (-). Must begin with a letter. Cannot begin or end with hyphen. Must consist of between 2 and 35 characters.
     * 
     */
    @InputImport(name="clusterName", required=true)
      private final Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * The cluster configuration.
     * 
     */
    @InputImport(name="config", required=true)
      private final Input<ClusterConfigArgs> config;

    public Input<ClusterConfigArgs> getConfig() {
        return this.config;
    }

    /**
     * Optional. The labels to associate with this cluster.Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62}Label values must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be associated with a given cluster.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    public ManagedClusterArgs(
        Input<String> clusterName,
        Input<ClusterConfigArgs> config,
        @Nullable Input<Map<String,String>> labels) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.labels = labels;
    }

    private ManagedClusterArgs() {
        this.clusterName = Input.empty();
        this.config = Input.empty();
        this.labels = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clusterName;
        private Input<ClusterConfigArgs> config;
        private @Nullable Input<Map<String,String>> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.config = defaults.config;
    	      this.labels = defaults.labels;
        }

        public Builder setClusterName(Input<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Input.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder setConfig(Input<ClusterConfigArgs> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setConfig(ClusterConfigArgs config) {
            this.config = Input.of(Objects.requireNonNull(config));
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
        public ManagedClusterArgs build() {
            return new ManagedClusterArgs(clusterName, config, labels);
        }
    }
}