// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum FaqFileFormat {
        Csv("CSV"),
        CsvWithHeader("CSV_WITH_HEADER"),
        Json("JSON");

        private final String value;

        FaqFileFormat(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FaqFileFormat[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
