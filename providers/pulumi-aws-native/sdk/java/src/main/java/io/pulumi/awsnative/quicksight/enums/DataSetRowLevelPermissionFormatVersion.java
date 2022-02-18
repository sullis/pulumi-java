// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum DataSetRowLevelPermissionFormatVersion {
        Version1("VERSION_1"),
        Version2("VERSION_2");

        private final String value;

        DataSetRowLevelPermissionFormatVersion(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DataSetRowLevelPermissionFormatVersion[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
