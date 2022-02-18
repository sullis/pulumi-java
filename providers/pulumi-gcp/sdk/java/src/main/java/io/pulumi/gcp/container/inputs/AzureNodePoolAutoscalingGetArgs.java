// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class AzureNodePoolAutoscalingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureNodePoolAutoscalingGetArgs Empty = new AzureNodePoolAutoscalingGetArgs();

    /**
     * Required. Maximum number of nodes in the node pool. Must be >= min_node_count.
     * 
     */
    @InputImport(name="maxNodeCount", required=true)
    private final Input<Integer> maxNodeCount;

    public Input<Integer> getMaxNodeCount() {
        return this.maxNodeCount;
    }

    /**
     * Required. Minimum number of nodes in the node pool. Must be >= 1 and <= max_node_count.
     * 
     */
    @InputImport(name="minNodeCount", required=true)
    private final Input<Integer> minNodeCount;

    public Input<Integer> getMinNodeCount() {
        return this.minNodeCount;
    }

    public AzureNodePoolAutoscalingGetArgs(
        Input<Integer> maxNodeCount,
        Input<Integer> minNodeCount) {
        this.maxNodeCount = Objects.requireNonNull(maxNodeCount, "expected parameter 'maxNodeCount' to be non-null");
        this.minNodeCount = Objects.requireNonNull(minNodeCount, "expected parameter 'minNodeCount' to be non-null");
    }

    private AzureNodePoolAutoscalingGetArgs() {
        this.maxNodeCount = Input.empty();
        this.minNodeCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureNodePoolAutoscalingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> maxNodeCount;
        private Input<Integer> minNodeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureNodePoolAutoscalingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxNodeCount = defaults.maxNodeCount;
    	      this.minNodeCount = defaults.minNodeCount;
        }

        public Builder setMaxNodeCount(Input<Integer> maxNodeCount) {
            this.maxNodeCount = Objects.requireNonNull(maxNodeCount);
            return this;
        }

        public Builder setMaxNodeCount(Integer maxNodeCount) {
            this.maxNodeCount = Input.of(Objects.requireNonNull(maxNodeCount));
            return this;
        }

        public Builder setMinNodeCount(Input<Integer> minNodeCount) {
            this.minNodeCount = Objects.requireNonNull(minNodeCount);
            return this;
        }

        public Builder setMinNodeCount(Integer minNodeCount) {
            this.minNodeCount = Input.of(Objects.requireNonNull(minNodeCount));
            return this;
        }

        public AzureNodePoolAutoscalingGetArgs build() {
            return new AzureNodePoolAutoscalingGetArgs(maxNodeCount, minNodeCount);
        }
    }
}
