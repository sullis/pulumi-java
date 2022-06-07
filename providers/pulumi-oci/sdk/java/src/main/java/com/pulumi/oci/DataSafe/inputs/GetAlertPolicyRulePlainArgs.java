// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAlertPolicyRulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAlertPolicyRulePlainArgs Empty = new GetAlertPolicyRulePlainArgs();

    /**
     * The OCID of the alert policy.
     * 
     */
    @Import(name="alertPolicyId", required=true)
    private String alertPolicyId;

    /**
     * @return The OCID of the alert policy.
     * 
     */
    public String alertPolicyId() {
        return this.alertPolicyId;
    }

    private GetAlertPolicyRulePlainArgs() {}

    private GetAlertPolicyRulePlainArgs(GetAlertPolicyRulePlainArgs $) {
        this.alertPolicyId = $.alertPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertPolicyRulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertPolicyRulePlainArgs $;

        public Builder() {
            $ = new GetAlertPolicyRulePlainArgs();
        }

        public Builder(GetAlertPolicyRulePlainArgs defaults) {
            $ = new GetAlertPolicyRulePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertPolicyId The OCID of the alert policy.
         * 
         * @return builder
         * 
         */
        public Builder alertPolicyId(String alertPolicyId) {
            $.alertPolicyId = alertPolicyId;
            return this;
        }

        public GetAlertPolicyRulePlainArgs build() {
            $.alertPolicyId = Objects.requireNonNull($.alertPolicyId, "expected parameter 'alertPolicyId' to be non-null");
            return $;
        }
    }

}
