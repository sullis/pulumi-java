// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Signifies whether SSL needs to be enabled or not.
     * 
     */
    @EnumType
    public enum SSLStatus {
        Enabled("Enabled"),
        Disabled("Disabled");

        private final String value;

        SSLStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SSLStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
