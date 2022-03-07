// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Indicates whether or not the encryption is enabled for the workspace.
     * 
     */
    @EnumType
    public enum EncryptionStatus {
        Enabled("Enabled"),
        Disabled("Disabled");

        private final String value;

        EncryptionStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EncryptionStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }