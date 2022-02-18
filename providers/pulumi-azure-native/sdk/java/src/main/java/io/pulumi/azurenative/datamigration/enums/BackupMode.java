// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Backup Mode to specify whether to use existing backup or create new backup.
     * 
     */
    @EnumType
    public enum BackupMode {
        CreateBackup("CreateBackup"),
        ExistingBackup("ExistingBackup");

        private final String value;

        BackupMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BackupMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
