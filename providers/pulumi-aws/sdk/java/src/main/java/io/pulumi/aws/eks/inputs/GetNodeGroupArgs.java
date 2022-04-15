// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNodeGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNodeGroupArgs Empty = new GetNodeGroupArgs();

    /**
     * The name of the cluster.
     * 
     */
    @Import(name="clusterName", required=true)
      private final String clusterName;

    public String clusterName() {
        return this.clusterName;
    }

    /**
     * The name of the node group.
     * 
     */
    @Import(name="nodeGroupName", required=true)
      private final String nodeGroupName;

    public String nodeGroupName() {
        return this.nodeGroupName;
    }

    /**
     * Key-value map of resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetNodeGroupArgs(
        String clusterName,
        String nodeGroupName,
        @Nullable Map<String,String> tags) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.nodeGroupName = Objects.requireNonNull(nodeGroupName, "expected parameter 'nodeGroupName' to be non-null");
        this.tags = tags;
    }

    private GetNodeGroupArgs() {
        this.clusterName = null;
        this.nodeGroupName = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String nodeGroupName;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodeGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.nodeGroupName = defaults.nodeGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder nodeGroupName(String nodeGroupName) {
            this.nodeGroupName = Objects.requireNonNull(nodeGroupName);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public GetNodeGroupArgs build() {
            return new GetNodeGroupArgs(clusterName, nodeGroupName, tags);
        }
    }
}
