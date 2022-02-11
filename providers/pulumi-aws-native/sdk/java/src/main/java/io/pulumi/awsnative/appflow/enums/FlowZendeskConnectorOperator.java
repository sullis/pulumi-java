// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum FlowZendeskConnectorOperator {
        Projection("PROJECTION"),
        GreaterThan("GREATER_THAN"),
        Addition("ADDITION"),
        Multiplication("MULTIPLICATION"),
        Division("DIVISION"),
        Subtraction("SUBTRACTION"),
        MaskAll("MASK_ALL"),
        MaskFirstN("MASK_FIRST_N"),
        MaskLastN("MASK_LAST_N"),
        ValidateNonNull("VALIDATE_NON_NULL"),
        ValidateNonZero("VALIDATE_NON_ZERO"),
        ValidateNonNegative("VALIDATE_NON_NEGATIVE"),
        ValidateNumeric("VALIDATE_NUMERIC"),
        NoOp("NO_OP");

        private final String value;

        FlowZendeskConnectorOperator(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FlowZendeskConnectorOperator[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
