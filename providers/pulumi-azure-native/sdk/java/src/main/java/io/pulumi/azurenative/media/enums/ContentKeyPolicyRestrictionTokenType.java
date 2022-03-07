// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of token.
     * 
     */
    @EnumType
    public enum ContentKeyPolicyRestrictionTokenType {
        /**
         * Represents a ContentKeyPolicyRestrictionTokenType that is unavailable in current API version.
         * 
         */
        Unknown("Unknown"),
        /**
         * Simple Web Token.
         * 
         */
        Swt("Swt"),
        /**
         * JSON Web Token.
         * 
         */
        Jwt("Jwt");

        private final String value;

        ContentKeyPolicyRestrictionTokenType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ContentKeyPolicyRestrictionTokenType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }