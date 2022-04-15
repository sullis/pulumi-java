// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a resize cluster operation. For example, a scheduled action to run the `ResizeCluster` API operation.
 * 
 */
public final class ScheduledActionResizeClusterMessageArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledActionResizeClusterMessageArgs Empty = new ScheduledActionResizeClusterMessageArgs();

    @Import(name="classic")
      private final @Nullable Output<Boolean> classic;

    public Output<Boolean> classic() {
        return this.classic == null ? Codegen.empty() : this.classic;
    }

    @Import(name="clusterIdentifier", required=true)
      private final Output<String> clusterIdentifier;

    public Output<String> clusterIdentifier() {
        return this.clusterIdentifier;
    }

    @Import(name="clusterType")
      private final @Nullable Output<String> clusterType;

    public Output<String> clusterType() {
        return this.clusterType == null ? Codegen.empty() : this.clusterType;
    }

    @Import(name="nodeType")
      private final @Nullable Output<String> nodeType;

    public Output<String> nodeType() {
        return this.nodeType == null ? Codegen.empty() : this.nodeType;
    }

    @Import(name="numberOfNodes")
      private final @Nullable Output<Integer> numberOfNodes;

    public Output<Integer> numberOfNodes() {
        return this.numberOfNodes == null ? Codegen.empty() : this.numberOfNodes;
    }

    public ScheduledActionResizeClusterMessageArgs(
        @Nullable Output<Boolean> classic,
        Output<String> clusterIdentifier,
        @Nullable Output<String> clusterType,
        @Nullable Output<String> nodeType,
        @Nullable Output<Integer> numberOfNodes) {
        this.classic = classic;
        this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
        this.clusterType = clusterType;
        this.nodeType = nodeType;
        this.numberOfNodes = numberOfNodes;
    }

    private ScheduledActionResizeClusterMessageArgs() {
        this.classic = Codegen.empty();
        this.clusterIdentifier = Codegen.empty();
        this.clusterType = Codegen.empty();
        this.nodeType = Codegen.empty();
        this.numberOfNodes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionResizeClusterMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> classic;
        private Output<String> clusterIdentifier;
        private @Nullable Output<String> clusterType;
        private @Nullable Output<String> nodeType;
        private @Nullable Output<Integer> numberOfNodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionResizeClusterMessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classic = defaults.classic;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.clusterType = defaults.clusterType;
    	      this.nodeType = defaults.nodeType;
    	      this.numberOfNodes = defaults.numberOfNodes;
        }

        public Builder classic(@Nullable Output<Boolean> classic) {
            this.classic = classic;
            return this;
        }
        public Builder classic(@Nullable Boolean classic) {
            this.classic = Codegen.ofNullable(classic);
            return this;
        }
        public Builder clusterIdentifier(Output<String> clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }
        public Builder clusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Output.of(Objects.requireNonNull(clusterIdentifier));
            return this;
        }
        public Builder clusterType(@Nullable Output<String> clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Builder clusterType(@Nullable String clusterType) {
            this.clusterType = Codegen.ofNullable(clusterType);
            return this;
        }
        public Builder nodeType(@Nullable Output<String> nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Builder nodeType(@Nullable String nodeType) {
            this.nodeType = Codegen.ofNullable(nodeType);
            return this;
        }
        public Builder numberOfNodes(@Nullable Output<Integer> numberOfNodes) {
            this.numberOfNodes = numberOfNodes;
            return this;
        }
        public Builder numberOfNodes(@Nullable Integer numberOfNodes) {
            this.numberOfNodes = Codegen.ofNullable(numberOfNodes);
            return this;
        }        public ScheduledActionResizeClusterMessageArgs build() {
            return new ScheduledActionResizeClusterMessageArgs(classic, clusterIdentifier, clusterType, nodeType, numberOfNodes);
        }
    }
}
