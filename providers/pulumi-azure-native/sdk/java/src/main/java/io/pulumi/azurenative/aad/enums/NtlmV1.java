// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * A flag to determine whether or not NtlmV1 is enabled or disabled.
     * 
     */
    @EnumType
    public enum NtlmV1 {
        Enabled("Enabled"),
        Disabled("Disabled");

        private final String value;

        NtlmV1(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NtlmV1[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
