// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum IndexDocumentAttributeValueType {
        StringValue("STRING_VALUE"),
        StringListValue("STRING_LIST_VALUE"),
        LongValue("LONG_VALUE"),
        DateValue("DATE_VALUE");

        private final String value;

        IndexDocumentAttributeValueType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "IndexDocumentAttributeValueType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
