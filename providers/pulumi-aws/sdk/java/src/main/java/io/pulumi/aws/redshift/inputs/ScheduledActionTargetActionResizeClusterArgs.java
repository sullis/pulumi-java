// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduledActionTargetActionResizeClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledActionTargetActionResizeClusterArgs Empty = new ScheduledActionTargetActionResizeClusterArgs();

    /**
     * A boolean value indicating whether the resize operation is using the classic resize process. Default: `false`.
     * 
     */
    @InputImport(name="classic")
      private final @Nullable Input<Boolean> classic;

    public Input<Boolean> getClassic() {
        return this.classic == null ? Input.empty() : this.classic;
    }

    /**
     * The identifier of the cluster to be resumed.
     * 
     */
    @InputImport(name="clusterIdentifier", required=true)
      private final Input<String> clusterIdentifier;

    public Input<String> getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * The new cluster type for the specified cluster.
     * 
     */
    @InputImport(name="clusterType")
      private final @Nullable Input<String> clusterType;

    public Input<String> getClusterType() {
        return this.clusterType == null ? Input.empty() : this.clusterType;
    }

    /**
     * The new node type for the nodes you are adding.
     * 
     */
    @InputImport(name="nodeType")
      private final @Nullable Input<String> nodeType;

    public Input<String> getNodeType() {
        return this.nodeType == null ? Input.empty() : this.nodeType;
    }

    /**
     * The new number of nodes for the cluster.
     * 
     */
    @InputImport(name="numberOfNodes")
      private final @Nullable Input<Integer> numberOfNodes;

    public Input<Integer> getNumberOfNodes() {
        return this.numberOfNodes == null ? Input.empty() : this.numberOfNodes;
    }

    public ScheduledActionTargetActionResizeClusterArgs(
        @Nullable Input<Boolean> classic,
        Input<String> clusterIdentifier,
        @Nullable Input<String> clusterType,
        @Nullable Input<String> nodeType,
        @Nullable Input<Integer> numberOfNodes) {
        this.classic = classic;
        this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
        this.clusterType = clusterType;
        this.nodeType = nodeType;
        this.numberOfNodes = numberOfNodes;
    }

    private ScheduledActionTargetActionResizeClusterArgs() {
        this.classic = Input.empty();
        this.clusterIdentifier = Input.empty();
        this.clusterType = Input.empty();
        this.nodeType = Input.empty();
        this.numberOfNodes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionTargetActionResizeClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> classic;
        private Input<String> clusterIdentifier;
        private @Nullable Input<String> clusterType;
        private @Nullable Input<String> nodeType;
        private @Nullable Input<Integer> numberOfNodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionTargetActionResizeClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classic = defaults.classic;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.clusterType = defaults.clusterType;
    	      this.nodeType = defaults.nodeType;
    	      this.numberOfNodes = defaults.numberOfNodes;
        }

        public Builder setClassic(@Nullable Input<Boolean> classic) {
            this.classic = classic;
            return this;
        }

        public Builder setClassic(@Nullable Boolean classic) {
            this.classic = Input.ofNullable(classic);
            return this;
        }

        public Builder setClusterIdentifier(Input<String> clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }

        public Builder setClusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Input.of(Objects.requireNonNull(clusterIdentifier));
            return this;
        }

        public Builder setClusterType(@Nullable Input<String> clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        public Builder setClusterType(@Nullable String clusterType) {
            this.clusterType = Input.ofNullable(clusterType);
            return this;
        }

        public Builder setNodeType(@Nullable Input<String> nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        public Builder setNodeType(@Nullable String nodeType) {
            this.nodeType = Input.ofNullable(nodeType);
            return this;
        }

        public Builder setNumberOfNodes(@Nullable Input<Integer> numberOfNodes) {
            this.numberOfNodes = numberOfNodes;
            return this;
        }

        public Builder setNumberOfNodes(@Nullable Integer numberOfNodes) {
            this.numberOfNodes = Input.ofNullable(numberOfNodes);
            return this;
        }
        public ScheduledActionTargetActionResizeClusterArgs build() {
            return new ScheduledActionTargetActionResizeClusterArgs(classic, clusterIdentifier, clusterType, nodeType, numberOfNodes);
        }
    }
}