// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * A description of why the `status` has its value
     * 
     */
    @EnumType
    public enum StatusReason {
        Expired("Expired"),
        UserRequested("UserRequested"),
        NewerRequestInitiated("NewerRequestInitiated");

        private final String value;

        StatusReason(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "StatusReason[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
