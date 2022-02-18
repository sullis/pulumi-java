// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The Network protocol of a Rule condition.
     * 
     */
    @EnumType
    public enum FirewallPolicyRuleConditionNetworkProtocol {
        TCP("TCP"),
        UDP("UDP"),
        Any("Any"),
        ICMP("ICMP");

        private final String value;

        FirewallPolicyRuleConditionNetworkProtocol(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FirewallPolicyRuleConditionNetworkProtocol[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
