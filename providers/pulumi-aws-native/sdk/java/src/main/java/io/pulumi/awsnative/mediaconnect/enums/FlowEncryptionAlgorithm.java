// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * 
     */
    @EnumType
    public enum FlowEncryptionAlgorithm {
        Aes128("aes128"),
        Aes192("aes192"),
        Aes256("aes256");

        private final String value;

        FlowEncryptionAlgorithm(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FlowEncryptionAlgorithm[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }