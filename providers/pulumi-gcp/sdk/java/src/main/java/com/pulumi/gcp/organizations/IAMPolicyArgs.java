// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class IAMPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final IAMPolicyArgs Empty = new IAMPolicyArgs();

    /**
     * The numeric ID of the organization in which you want to manage the audit logging config.
     * 
     */
    @Import(name="orgId", required=true)
    private Output<String> orgId;

    /**
     * @return The numeric ID of the organization in which you want to manage the audit logging config.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }

    @Import(name="policyData", required=true)
    private Output<String> policyData;

    public Output<String> policyData() {
        return this.policyData;
    }

    private IAMPolicyArgs() {}

    private IAMPolicyArgs(IAMPolicyArgs $) {
        this.orgId = $.orgId;
        this.policyData = $.policyData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IAMPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IAMPolicyArgs $;

        public Builder() {
            $ = new IAMPolicyArgs();
        }

        public Builder(IAMPolicyArgs defaults) {
            $ = new IAMPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param orgId The numeric ID of the organization in which you want to manage the audit logging config.
         * 
         * @return builder
         * 
         */
        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId The numeric ID of the organization in which you want to manage the audit logging config.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public Builder policyData(Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        public IAMPolicyArgs build() {
            $.orgId = Objects.requireNonNull($.orgId, "expected parameter 'orgId' to be non-null");
            $.policyData = Objects.requireNonNull($.policyData, "expected parameter 'policyData' to be non-null");
            return $;
        }
    }

}
