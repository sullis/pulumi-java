// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Threshold type for a rule
     * 
     */
    @EnumType
    public enum RulesetThresholdType {
        GreaterThanOrEqual("GREATER_THAN_OR_EQUAL"),
        LessThanOrEqual("LESS_THAN_OR_EQUAL"),
        GreaterThan("GREATER_THAN"),
        LessThan("LESS_THAN");

        private final String value;

        RulesetThresholdType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RulesetThresholdType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }