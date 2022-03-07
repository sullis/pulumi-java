// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The computation function for the KPI.
     * 
     */
    @EnumType
    public enum KpiFunctions {
        Sum("Sum"),
        Avg("Avg"),
        Min("Min"),
        Max("Max"),
        Last("Last"),
        Count("Count"),
        None("None"),
        CountDistinct("CountDistinct");

        private final String value;

        KpiFunctions(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "KpiFunctions[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }