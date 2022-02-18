// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of the configuration for transfer.
     * 
     */
    @EnumType
    public enum TransferConfigurationType {
        /**
         * Transfer all the data.
         * 
         */
        TransferAll("TransferAll"),
        /**
         * Transfer using filter.
         * 
         */
        TransferUsingFilter("TransferUsingFilter");

        private final String value;

        TransferConfigurationType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TransferConfigurationType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
