// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * ShareStatus, possible values are NOT_SHARED, SHARED_WITH_ME, SHARED_BY_ME.
     * 
     */
    @EnumType
    public enum FirewallRuleGroupShareStatus {
        NotShared("NOT_SHARED"),
        SharedWithMe("SHARED_WITH_ME"),
        SharedByMe("SHARED_BY_ME");

        private final String value;

        FirewallRuleGroupShareStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FirewallRuleGroupShareStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
