// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.remotebuildexecution_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Defines whether a feature can be used or what values are accepted.
 * 
 */
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse Empty = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse();

    /**
     * A list of acceptable values. Only effective when the policy is `RESTRICTED`.
     * 
     */
    @Import(name="allowedValues", required=true)
    private List<String> allowedValues;

    /**
     * @return A list of acceptable values. Only effective when the policy is `RESTRICTED`.
     * 
     */
    public List<String> allowedValues() {
        return this.allowedValues;
    }

    /**
     * The policy of the feature.
     * 
     */
    @Import(name="policy", required=true)
    private String policy;

    /**
     * @return The policy of the feature.
     * 
     */
    public String policy() {
        return this.policy;
    }

    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse() {}

    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse $) {
        this.allowedValues = $.allowedValues;
        this.policy = $.policy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse $;

        public Builder() {
            $ = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse();
        }

        public Builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse defaults) {
            $ = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedValues A list of acceptable values. Only effective when the policy is `RESTRICTED`.
         * 
         * @return builder
         * 
         */
        public Builder allowedValues(List<String> allowedValues) {
            $.allowedValues = allowedValues;
            return this;
        }

        /**
         * @param allowedValues A list of acceptable values. Only effective when the policy is `RESTRICTED`.
         * 
         * @return builder
         * 
         */
        public Builder allowedValues(String... allowedValues) {
            return allowedValues(List.of(allowedValues));
        }

        /**
         * @param policy The policy of the feature.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            $.policy = policy;
            return this;
        }

        public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureResponse build() {
            $.allowedValues = Objects.requireNonNull($.allowedValues, "expected parameter 'allowedValues' to be non-null");
            $.policy = Objects.requireNonNull($.policy, "expected parameter 'policy' to be non-null");
            return $;
        }
    }

}
