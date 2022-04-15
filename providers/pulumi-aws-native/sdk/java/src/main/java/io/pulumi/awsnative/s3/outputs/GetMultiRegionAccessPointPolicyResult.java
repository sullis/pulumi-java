// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.outputs.PolicyStatusProperties;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMultiRegionAccessPointPolicyResult {
    /**
     * Policy document to apply to a Multi Region Access Point
     * 
     */
    private final @Nullable Object policy;
    /**
     * The Policy Status associated with this Multi Region Access Point
     * 
     */
    private final @Nullable PolicyStatusProperties policyStatus;

    @CustomType.Constructor
    private GetMultiRegionAccessPointPolicyResult(
        @CustomType.Parameter("policy") @Nullable Object policy,
        @CustomType.Parameter("policyStatus") @Nullable PolicyStatusProperties policyStatus) {
        this.policy = policy;
        this.policyStatus = policyStatus;
    }

    /**
     * Policy document to apply to a Multi Region Access Point
     * 
    */
    public Optional<Object> policy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * The Policy Status associated with this Multi Region Access Point
     * 
    */
    public Optional<PolicyStatusProperties> policyStatus() {
        return Optional.ofNullable(this.policyStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMultiRegionAccessPointPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object policy;
        private @Nullable PolicyStatusProperties policyStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMultiRegionAccessPointPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.policyStatus = defaults.policyStatus;
        }

        public Builder policy(@Nullable Object policy) {
            this.policy = policy;
            return this;
        }
        public Builder policyStatus(@Nullable PolicyStatusProperties policyStatus) {
            this.policyStatus = policyStatus;
            return this;
        }        public GetMultiRegionAccessPointPolicyResult build() {
            return new GetMultiRegionAccessPointPolicyResult(policy, policyStatus);
        }
    }
}
