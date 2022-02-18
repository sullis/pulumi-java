// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of backup which needs to be taken.
     * 
     */
    @EnumType
    public enum BackupType {
        LocalSnapshot("LocalSnapshot"),
        CloudSnapshot("CloudSnapshot");

        private final String value;

        BackupType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BackupType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
