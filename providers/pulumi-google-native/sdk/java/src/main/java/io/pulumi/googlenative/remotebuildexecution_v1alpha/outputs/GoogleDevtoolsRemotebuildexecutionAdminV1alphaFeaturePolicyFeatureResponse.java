// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.remotebuildexecution_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse {
    /**
     * A list of acceptable values. Only effective when the policy is `RESTRICTED`.
     * 
     */
    private final List<String> allowedValues;
    /**
     * The policy of the feature.
     * 
     */
    private final String policy;

    @OutputCustomType.Constructor({"allowedValues","policy"})
    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse(
        List<String> allowedValues,
        String policy) {
        this.allowedValues = Objects.requireNonNull(allowedValues);
        this.policy = Objects.requireNonNull(policy);
    }

    /**
     * A list of acceptable values. Only effective when the policy is `RESTRICTED`.
     * 
    */
    public List<String> getAllowedValues() {
        return this.allowedValues;
    }
    /**
     * The policy of the feature.
     * 
    */
    public String getPolicy() {
        return this.policy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedValues;
        private String policy;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
    	      this.policy = defaults.policy;
        }

        public Builder setAllowedValues(List<String> allowedValues) {
            this.allowedValues = Objects.requireNonNull(allowedValues);
            return this;
        }

        public Builder setPolicy(String policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse build() {
            return new GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse(allowedValues, policy);
        }
    }
}