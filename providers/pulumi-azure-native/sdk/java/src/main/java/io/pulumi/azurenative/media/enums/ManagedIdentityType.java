// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The identity type.
     * 
     */
    @EnumType
    public enum ManagedIdentityType {
        /**
         * A system-assigned managed identity.
         * 
         */
        SystemAssigned("SystemAssigned"),
        /**
         * No managed identity.
         * 
         */
        None("None");

        private final String value;

        ManagedIdentityType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ManagedIdentityType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
