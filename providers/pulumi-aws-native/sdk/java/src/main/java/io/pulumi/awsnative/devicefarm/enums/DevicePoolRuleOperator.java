// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devicefarm.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies how Device Farm compares the rule's attribute to the value.
     * 
     */
    @EnumType
    public enum DevicePoolRuleOperator {
        Equals("EQUALS"),
        LessThan("LESS_THAN"),
        LessThanOrEquals("LESS_THAN_OR_EQUALS"),
        GreaterThan("GREATER_THAN"),
        GreaterThanOrEquals("GREATER_THAN_OR_EQUALS"),
        In("IN"),
        NotIn("NOT_IN"),
        Contains("CONTAINS");

        private final String value;

        DevicePoolRuleOperator(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DevicePoolRuleOperator[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
