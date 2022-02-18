// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Data source type.
     * 
     */
    @EnumType
    public enum SourceType {
        Delimited_files("delimited_files"),
        Json_lines_files("json_lines_files"),
        Parquet_files("parquet_files");

        private final String value;

        SourceType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SourceType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
