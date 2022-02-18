// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of filter rule to apply. AWS DataSync only supports the SIMPLE_PATTERN rule type.
     * 
     */
    @EnumType
    public enum TaskFilterRuleFilterType {
        SimplePattern("SIMPLE_PATTERN");

        private final String value;

        TaskFilterRuleFilterType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TaskFilterRuleFilterType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
