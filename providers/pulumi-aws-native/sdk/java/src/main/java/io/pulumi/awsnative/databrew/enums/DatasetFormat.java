// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Dataset format
     * 
     */
    @EnumType
    public enum DatasetFormat {
        Csv("CSV"),
        Json("JSON"),
        Parquet("PARQUET"),
        Excel("EXCEL");

        private final String value;

        DatasetFormat(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DatasetFormat[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
