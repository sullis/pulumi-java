// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Backup schedule type.
     * 
     */
    @EnumType
    public enum BackupScheduleType {
        Manual("Manual"),
        Automated("Automated");

        private final String value;

        BackupScheduleType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BackupScheduleType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }