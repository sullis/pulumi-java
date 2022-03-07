// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of resetting the token.
     * 
     */
    @EnumType
    public enum RegistrationTokenOperation {
        Delete("Delete"),
        None("None"),
        Update("Update");

        private final String value;

        RegistrationTokenOperation(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RegistrationTokenOperation[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }