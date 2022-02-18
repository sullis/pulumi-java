// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * How often the scheduled audit takes place. Can be one of DAILY, WEEKLY, BIWEEKLY, or MONTHLY.
     * 
     */
    @EnumType
    public enum ScheduledAuditFrequency {
        Daily("DAILY"),
        Weekly("WEEKLY"),
        Biweekly("BIWEEKLY"),
        Monthly("MONTHLY");

        private final String value;

        ScheduledAuditFrequency(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ScheduledAuditFrequency[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
