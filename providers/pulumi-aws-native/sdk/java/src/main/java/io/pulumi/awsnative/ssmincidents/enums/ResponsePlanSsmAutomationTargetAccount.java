// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmincidents.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The account type to use when starting the SSM automation document.
     * 
     */
    @EnumType
    public enum ResponsePlanSsmAutomationTargetAccount {
        ImpactedAccount("IMPACTED_ACCOUNT"),
        ResponsePlanOwnerAccount("RESPONSE_PLAN_OWNER_ACCOUNT");

        private final String value;

        ResponsePlanSsmAutomationTargetAccount(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ResponsePlanSsmAutomationTargetAccount[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
