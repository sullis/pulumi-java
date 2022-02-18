// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Whether the publisher is verified.
     * 
     */
    @EnumType
    public enum PublisherStatus {
        Verified("VERIFIED"),
        Unverified("UNVERIFIED");

        private final String value;

        PublisherStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PublisherStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
