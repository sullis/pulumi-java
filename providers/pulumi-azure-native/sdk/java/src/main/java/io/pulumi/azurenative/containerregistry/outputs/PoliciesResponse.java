// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.QuarantinePolicyResponse;
import io.pulumi.azurenative.containerregistry.outputs.RetentionPolicyResponse;
import io.pulumi.azurenative.containerregistry.outputs.TrustPolicyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PoliciesResponse {
    /**
     * The quarantine policy for a container registry.
     * 
     */
    private final @Nullable QuarantinePolicyResponse quarantinePolicy;
    /**
     * The retention policy for a container registry.
     * 
     */
    private final @Nullable RetentionPolicyResponse retentionPolicy;
    /**
     * The content trust policy for a container registry.
     * 
     */
    private final @Nullable TrustPolicyResponse trustPolicy;

    @OutputCustomType.Constructor({"quarantinePolicy","retentionPolicy","trustPolicy"})
    private PoliciesResponse(
        @Nullable QuarantinePolicyResponse quarantinePolicy,
        @Nullable RetentionPolicyResponse retentionPolicy,
        @Nullable TrustPolicyResponse trustPolicy) {
        this.quarantinePolicy = quarantinePolicy;
        this.retentionPolicy = retentionPolicy;
        this.trustPolicy = trustPolicy;
    }

    /**
     * The quarantine policy for a container registry.
     * 
     */
    public Optional<QuarantinePolicyResponse> getQuarantinePolicy() {
        return Optional.ofNullable(this.quarantinePolicy);
    }
    /**
     * The retention policy for a container registry.
     * 
     */
    public Optional<RetentionPolicyResponse> getRetentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }
    /**
     * The content trust policy for a container registry.
     * 
     */
    public Optional<TrustPolicyResponse> getTrustPolicy() {
        return Optional.ofNullable(this.trustPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PoliciesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable QuarantinePolicyResponse quarantinePolicy;
        private @Nullable RetentionPolicyResponse retentionPolicy;
        private @Nullable TrustPolicyResponse trustPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(PoliciesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quarantinePolicy = defaults.quarantinePolicy;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.trustPolicy = defaults.trustPolicy;
        }

        public Builder setQuarantinePolicy(@Nullable QuarantinePolicyResponse quarantinePolicy) {
            this.quarantinePolicy = quarantinePolicy;
            return this;
        }

        public Builder setRetentionPolicy(@Nullable RetentionPolicyResponse retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        public Builder setTrustPolicy(@Nullable TrustPolicyResponse trustPolicy) {
            this.trustPolicy = trustPolicy;
            return this;
        }

        public PoliciesResponse build() {
            return new PoliciesResponse(quarantinePolicy, retentionPolicy, trustPolicy);
        }
    }
}
