// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of the secret object which determines how the value of the secret object has to be
     * interpreted.
     * 
     */
    @EnumType
    public enum SecretObjectType {
        Opaque("Opaque"),
        Vaultsecret("Vaultsecret");

        private final String value;

        SecretObjectType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SecretObjectType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }