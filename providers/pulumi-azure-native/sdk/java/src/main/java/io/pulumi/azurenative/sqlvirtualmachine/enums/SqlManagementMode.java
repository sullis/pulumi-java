// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * SQL Server Management type.
     * 
     */
    @EnumType
    public enum SqlManagementMode {
        Full("Full"),
        LightWeight("LightWeight"),
        NoAgent("NoAgent");

        private final String value;

        SqlManagementMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SqlManagementMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
