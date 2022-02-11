// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum FlowSalesforceConnectorOperator {
        Projection("PROJECTION"),
        LessThan("LESS_THAN"),
        Contains("CONTAINS"),
        GreaterThan("GREATER_THAN"),
        Between("BETWEEN"),
        LessThanOrEqualTo("LESS_THAN_OR_EQUAL_TO"),
        GreaterThanOrEqualTo("GREATER_THAN_OR_EQUAL_TO"),
        EqualTo("EQUAL_TO"),
        NotEqualTo("NOT_EQUAL_TO"),
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

        FlowSalesforceConnectorOperator(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FlowSalesforceConnectorOperator[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
