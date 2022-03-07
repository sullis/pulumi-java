// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The calculation window.
     * 
     */
    @EnumType
    public enum CalculationWindowTypes {
        Lifetime("Lifetime"),
        Hour("Hour"),
        Day("Day"),
        Week("Week"),
        Month("Month");

        private final String value;

        CalculationWindowTypes(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CalculationWindowTypes[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }