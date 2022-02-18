// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The data source that enriched by ueba.
     * 
     */
    @EnumType
    public enum UebaDataSources {
        AuditLogs("AuditLogs"),
        AzureActivity("AzureActivity"),
        SecurityEvent("SecurityEvent"),
        SigninLogs("SigninLogs");

        private final String value;

        UebaDataSources(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "UebaDataSources[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
