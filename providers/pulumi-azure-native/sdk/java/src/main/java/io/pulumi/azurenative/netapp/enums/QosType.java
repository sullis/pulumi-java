// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The qos type of the pool
     * 
     */
    @EnumType
    public enum QosType {
        /**
         * qos type Auto
         * 
         */
        Auto("Auto"),
        /**
         * qos type Manual
         * 
         */
        Manual("Manual");

        private final String value;

        QosType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "QosType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
