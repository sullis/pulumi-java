// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * A day in a week.
     * 
     */
    @EnumType
    public enum WeekDay {
        Sunday("Sunday"),
        Monday("Monday"),
        Tuesday("Tuesday"),
        Wednesday("Wednesday"),
        Thursday("Thursday"),
        Friday("Friday"),
        Saturday("Saturday");

        private final String value;

        WeekDay(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "WeekDay[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
