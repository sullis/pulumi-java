// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Frequency of full backups. In both cases, full backups begin during the next scheduled time window.
     * 
     */
    @EnumType
    public enum FullBackupFrequencyType {
        Daily("Daily"),
        Weekly("Weekly");

        private final String value;

        FullBackupFrequencyType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FullBackupFrequencyType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
