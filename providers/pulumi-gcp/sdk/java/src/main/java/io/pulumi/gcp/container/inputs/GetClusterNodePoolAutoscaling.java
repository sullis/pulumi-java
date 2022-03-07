// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class GetClusterNodePoolAutoscaling extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterNodePoolAutoscaling Empty = new GetClusterNodePoolAutoscaling();

    @InputImport(name="maxNodeCount", required=true)
      private final Integer maxNodeCount;

    public Integer getMaxNodeCount() {
        return this.maxNodeCount;
    }

    @InputImport(name="minNodeCount", required=true)
      private final Integer minNodeCount;

    public Integer getMinNodeCount() {
        return this.minNodeCount;
    }

    public GetClusterNodePoolAutoscaling(
        Integer maxNodeCount,
        Integer minNodeCount) {
        this.maxNodeCount = Objects.requireNonNull(maxNodeCount, "expected parameter 'maxNodeCount' to be non-null");
        this.minNodeCount = Objects.requireNonNull(minNodeCount, "expected parameter 'minNodeCount' to be non-null");
    }

    private GetClusterNodePoolAutoscaling() {
        this.maxNodeCount = null;
        this.minNodeCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodePoolAutoscaling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxNodeCount;
        private Integer minNodeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodePoolAutoscaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxNodeCount = defaults.maxNodeCount;
    	      this.minNodeCount = defaults.minNodeCount;
        }

        public Builder setMaxNodeCount(Integer maxNodeCount) {
            this.maxNodeCount = Objects.requireNonNull(maxNodeCount);
            return this;
        }

        public Builder setMinNodeCount(Integer minNodeCount) {
            this.minNodeCount = Objects.requireNonNull(minNodeCount);
            return this;
        }
        public GetClusterNodePoolAutoscaling build() {
            return new GetClusterNodePoolAutoscaling(maxNodeCount, minNodeCount);
        }
    }
}