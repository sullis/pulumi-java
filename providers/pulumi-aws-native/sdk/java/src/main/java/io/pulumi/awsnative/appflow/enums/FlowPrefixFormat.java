// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum FlowPrefixFormat {
        Year("YEAR"),
        Month("MONTH"),
        Day("DAY"),
        Hour("HOUR"),
        Minute("MINUTE");

        private final String value;

        FlowPrefixFormat(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FlowPrefixFormat[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
