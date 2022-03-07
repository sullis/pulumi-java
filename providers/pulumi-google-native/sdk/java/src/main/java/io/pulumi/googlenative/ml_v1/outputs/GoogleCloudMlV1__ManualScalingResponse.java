// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1__ManualScalingResponse {
    /**
     * The number of nodes to allocate for this model. These nodes are always up, starting from the time the model is deployed, so the cost of operating this model will be proportional to `nodes` * number of hours since last billing cycle plus the cost for each prediction performed.
     * 
     */
    private final Integer nodes;

    @OutputCustomType.Constructor({"nodes"})
    private GoogleCloudMlV1__ManualScalingResponse(Integer nodes) {
        this.nodes = Objects.requireNonNull(nodes);
    }

    /**
     * The number of nodes to allocate for this model. These nodes are always up, starting from the time the model is deployed, so the cost of operating this model will be proportional to `nodes` * number of hours since last billing cycle plus the cost for each prediction performed.
     * 
    */
    public Integer getNodes() {
        return this.nodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__ManualScalingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer nodes;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__ManualScalingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodes = defaults.nodes;
        }

        public Builder setNodes(Integer nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }
        public GoogleCloudMlV1__ManualScalingResponse build() {
            return new GoogleCloudMlV1__ManualScalingResponse(nodes);
        }
    }
}