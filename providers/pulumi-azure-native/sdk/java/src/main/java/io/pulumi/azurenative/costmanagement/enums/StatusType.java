// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The status of the schedule. Whether active or not. If inactive, the report's scheduled execution is paused.
     * 
     */
    @EnumType
    public enum StatusType {
        Active("Active"),
        Inactive("Inactive");

        private final String value;

        StatusType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "StatusType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
