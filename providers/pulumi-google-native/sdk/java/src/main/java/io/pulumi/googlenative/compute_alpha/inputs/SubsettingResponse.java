// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Subsetting configuration for this BackendService. Currently this is applicable only for Internal TCP/UDP load balancing, Internal HTTP(S) load balancing and Traffic Director.
 * 
 */
public final class SubsettingResponse extends io.pulumi.resources.InvokeArgs {

    public static final SubsettingResponse Empty = new SubsettingResponse();

    @InputImport(name="policy", required=true)
      private final String policy;

    public String getPolicy() {
        return this.policy;
    }

    /**
     * The number of backends per backend group assigned to each proxy instance or each service mesh client. An input parameter to the `CONSISTENT_HASH_SUBSETTING` algorithm. Can only be set if `policy` is set to `CONSISTENT_HASH_SUBSETTING`. Can only be set if load balancing scheme is `INTERNAL_MANAGED` or `INTERNAL_SELF_MANAGED`. `subset_size` is optional for Internal HTTP(S) load balancing and required for Traffic Director. If you do not provide this value, Cloud Load Balancing will calculate it dynamically to optimize the number of proxies/clients visible to each backend and vice versa. Must be greater than 0. If `subset_size` is larger than the number of backends/endpoints, then subsetting is disabled.
     * 
     */
    @InputImport(name="subsetSize", required=true)
      private final Integer subsetSize;

    public Integer getSubsetSize() {
        return this.subsetSize;
    }

    public SubsettingResponse(
        String policy,
        Integer subsetSize) {
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
        this.subsetSize = Objects.requireNonNull(subsetSize, "expected parameter 'subsetSize' to be non-null");
    }

    private SubsettingResponse() {
        this.policy = null;
        this.subsetSize = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubsettingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String policy;
        private Integer subsetSize;

        public Builder() {
    	      // Empty
        }

        public Builder(SubsettingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.subsetSize = defaults.subsetSize;
        }

        public Builder setPolicy(String policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }

        public Builder setSubsetSize(Integer subsetSize) {
            this.subsetSize = Objects.requireNonNull(subsetSize);
            return this;
        }
        public SubsettingResponse build() {
            return new SubsettingResponse(policy, subsetSize);
        }
    }
}