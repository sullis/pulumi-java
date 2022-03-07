// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The alert rule severity.
     * 
     */
    @EnumType
    public enum Severity {
        Sev0("Sev0"),
        Sev1("Sev1"),
        Sev2("Sev2"),
        Sev3("Sev3"),
        Sev4("Sev4");

        private final String value;

        Severity(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "Severity[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }