// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * 
     */
    @EnumType
    public enum AdvancedFilterOperatorType {
        NumberIn("NumberIn"),
        NumberNotIn("NumberNotIn"),
        NumberLessThan("NumberLessThan"),
        NumberGreaterThan("NumberGreaterThan"),
        NumberLessThanOrEquals("NumberLessThanOrEquals"),
        NumberGreaterThanOrEquals("NumberGreaterThanOrEquals"),
        BoolEquals("BoolEquals"),
        StringIn("StringIn"),
        StringNotIn("StringNotIn"),
        StringBeginsWith("StringBeginsWith"),
        StringEndsWith("StringEndsWith"),
        StringContains("StringContains");

        private final String value;

        AdvancedFilterOperatorType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AdvancedFilterOperatorType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
