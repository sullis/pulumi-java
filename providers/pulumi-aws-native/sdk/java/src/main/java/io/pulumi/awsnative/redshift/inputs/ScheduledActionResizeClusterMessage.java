// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a resize cluster operation. For example, a scheduled action to run the `ResizeCluster` API operation.
 * 
 */
public final class ScheduledActionResizeClusterMessage extends io.pulumi.resources.InvokeArgs {

    public static final ScheduledActionResizeClusterMessage Empty = new ScheduledActionResizeClusterMessage();

    @InputImport(name="classic")
      private final @Nullable Boolean classic;

    public Optional<Boolean> getClassic() {
        return this.classic == null ? Optional.empty() : Optional.ofNullable(this.classic);
    }

    @InputImport(name="clusterIdentifier", required=true)
      private final String clusterIdentifier;

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    @InputImport(name="clusterType")
      private final @Nullable String clusterType;

    public Optional<String> getClusterType() {
        return this.clusterType == null ? Optional.empty() : Optional.ofNullable(this.clusterType);
    }

    @InputImport(name="nodeType")
      private final @Nullable String nodeType;

    public Optional<String> getNodeType() {
        return this.nodeType == null ? Optional.empty() : Optional.ofNullable(this.nodeType);
    }

    @InputImport(name="numberOfNodes")
      private final @Nullable Integer numberOfNodes;

    public Optional<Integer> getNumberOfNodes() {
        return this.numberOfNodes == null ? Optional.empty() : Optional.ofNullable(this.numberOfNodes);
    }

    public ScheduledActionResizeClusterMessage(
        @Nullable Boolean classic,
        String clusterIdentifier,
        @Nullable String clusterType,
        @Nullable String nodeType,
        @Nullable Integer numberOfNodes) {
        this.classic = classic;
        this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
        this.clusterType = clusterType;
        this.nodeType = nodeType;
        this.numberOfNodes = numberOfNodes;
    }

    private ScheduledActionResizeClusterMessage() {
        this.classic = null;
        this.clusterIdentifier = null;
        this.clusterType = null;
        this.nodeType = null;
        this.numberOfNodes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionResizeClusterMessage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean classic;
        private String clusterIdentifier;
        private @Nullable String clusterType;
        private @Nullable String nodeType;
        private @Nullable Integer numberOfNodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionResizeClusterMessage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classic = defaults.classic;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.clusterType = defaults.clusterType;
    	      this.nodeType = defaults.nodeType;
    	      this.numberOfNodes = defaults.numberOfNodes;
        }

        public Builder setClassic(@Nullable Boolean classic) {
            this.classic = classic;
            return this;
        }

        public Builder setClusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }

        public Builder setClusterType(@Nullable String clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        public Builder setNodeType(@Nullable String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        public Builder setNumberOfNodes(@Nullable Integer numberOfNodes) {
            this.numberOfNodes = numberOfNodes;
            return this;
        }
        public ScheduledActionResizeClusterMessage build() {
            return new ScheduledActionResizeClusterMessage(classic, clusterIdentifier, clusterType, nodeType, numberOfNodes);
        }
    }
}