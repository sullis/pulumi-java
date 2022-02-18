// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The time frame for pulling data for the report. If custom, then a specific time period must be provided.
     * 
     */
    @EnumType
    public enum ReportTimeframeType {
        WeekToDate("WeekToDate"),
        MonthToDate("MonthToDate"),
        YearToDate("YearToDate"),
        Custom("Custom");

        private final String value;

        ReportTimeframeType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ReportTimeframeType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
