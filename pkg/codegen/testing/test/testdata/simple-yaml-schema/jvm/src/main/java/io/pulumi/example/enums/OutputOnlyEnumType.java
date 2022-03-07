// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum OutputOnlyEnumType {
        Foo("foo"),
        Bar("bar");

        private final String value;

        OutputOnlyEnumType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "OutputOnlyEnumType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }