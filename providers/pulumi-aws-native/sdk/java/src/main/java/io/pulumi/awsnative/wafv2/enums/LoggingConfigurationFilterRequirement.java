// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log must match all conditions or must match at least one condition.
     * 
     */
    @EnumType
    public enum LoggingConfigurationFilterRequirement {
        MeetsAll("MEETS_ALL"),
        MeetsAny("MEETS_ANY");

        private final String value;

        LoggingConfigurationFilterRequirement(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "LoggingConfigurationFilterRequirement[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
