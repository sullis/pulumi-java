// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The direction of the rule. The direction specifies if rule will be evaluated on incoming or outgoing traffic.
     * 
     */
    @EnumType
    public enum SecurityRuleDirection {
        Inbound("Inbound"),
        Outbound("Outbound");

        private final String value;

        SecurityRuleDirection(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SecurityRuleDirection[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
