// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Billing type of the Apigee organization. See [Apigee pricing](https://cloud.google.com/apigee/pricing).
     * 
     */
    @EnumType
    public enum OrganizationBillingType {
        /**
         * Billing type not specified.
         * 
         */
        BillingTypeUnspecified("BILLING_TYPE_UNSPECIFIED"),
        /**
         * A pre-paid subscription to Apigee.
         * 
         */
        Subscription("SUBSCRIPTION"),
        /**
         * Free and limited access to Apigee for evaluation purposes only. only.
         * 
         */
        Evaluation("EVALUATION");

        private final String value;

        OrganizationBillingType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "OrganizationBillingType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }