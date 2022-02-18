// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of the managed identity.
     * 
     */
    @EnumType
    public enum ManagedServiceIdentityType {
        UserAssigned("UserAssigned");

        private final String value;

        ManagedServiceIdentityType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ManagedServiceIdentityType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
