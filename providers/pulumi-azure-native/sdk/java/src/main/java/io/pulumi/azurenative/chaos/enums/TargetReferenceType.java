// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Enum of the Target reference type.
     * 
     */
    @EnumType
    public enum TargetReferenceType {
        ChaosTarget("ChaosTarget");

        private final String value;

        TargetReferenceType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TargetReferenceType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
