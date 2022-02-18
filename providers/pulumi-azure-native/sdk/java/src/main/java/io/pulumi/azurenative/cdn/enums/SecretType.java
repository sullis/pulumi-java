// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of the Secret to create.
     * 
     */
    @EnumType
    public enum SecretType {
        UrlSigningKey("UrlSigningKey"),
        CustomerCertificate("CustomerCertificate"),
        ManagedCertificate("ManagedCertificate");

        private final String value;

        SecretType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SecretType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
