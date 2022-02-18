// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The write behavior for the operation. Default is 'Insert'.
     * 
     */
    @EnumType
    public enum SapCloudForCustomerSinkWriteBehavior {
        Insert("Insert"),
        Update("Update");

        private final String value;

        SapCloudForCustomerSinkWriteBehavior(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SapCloudForCustomerSinkWriteBehavior[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
