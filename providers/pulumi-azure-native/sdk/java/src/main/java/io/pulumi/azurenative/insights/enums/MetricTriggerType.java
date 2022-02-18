// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Metric Trigger Type - 'Consecutive' or 'Total'
     * 
     */
    @EnumType
    public enum MetricTriggerType {
        Consecutive("Consecutive"),
        Total("Total");

        private final String value;

        MetricTriggerType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MetricTriggerType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
