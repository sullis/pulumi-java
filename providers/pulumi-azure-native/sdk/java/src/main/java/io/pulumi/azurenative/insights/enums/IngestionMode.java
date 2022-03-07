// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Indicates the flow of the ingestion.
     * 
     */
    @EnumType
    public enum IngestionMode {
        ApplicationInsights("ApplicationInsights"),
        ApplicationInsightsWithDiagnosticSettings("ApplicationInsightsWithDiagnosticSettings"),
        LogAnalytics("LogAnalytics");

        private final String value;

        IngestionMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "IngestionMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }