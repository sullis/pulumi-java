// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of key used to encrypt the Account Key.
     * 
     */
    @EnumType
    public enum AccountEncryptionKeyType {
        /**
         * The Account Key is encrypted with a System Key.
         * 
         */
        SystemKey("SystemKey"),
        /**
         * The Account Key is encrypted with a Customer Key.
         * 
         */
        CustomerKey("CustomerKey");

        private final String value;

        AccountEncryptionKeyType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AccountEncryptionKeyType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
