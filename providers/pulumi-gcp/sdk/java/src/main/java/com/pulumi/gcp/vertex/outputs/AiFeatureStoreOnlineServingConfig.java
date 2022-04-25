// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class AiFeatureStoreOnlineServingConfig {
    /**
     * @return The number of nodes for each cluster. The number of nodes will not scale automatically but can be scaled manually by providing different values when updating.
     * 
     */
    private final Integer fixedNodeCount;

    @CustomType.Constructor
    private AiFeatureStoreOnlineServingConfig(@CustomType.Parameter("fixedNodeCount") Integer fixedNodeCount) {
        this.fixedNodeCount = fixedNodeCount;
    }

    /**
     * @return The number of nodes for each cluster. The number of nodes will not scale automatically but can be scaled manually by providing different values when updating.
     * 
     */
    public Integer fixedNodeCount() {
        return this.fixedNodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AiFeatureStoreOnlineServingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer fixedNodeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AiFeatureStoreOnlineServingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedNodeCount = defaults.fixedNodeCount;
        }

        public Builder fixedNodeCount(Integer fixedNodeCount) {
            this.fixedNodeCount = Objects.requireNonNull(fixedNodeCount);
            return this;
        }        public AiFeatureStoreOnlineServingConfig build() {
            return new AiFeatureStoreOnlineServingConfig(fixedNodeCount);
        }
    }
}
