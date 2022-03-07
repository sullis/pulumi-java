// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. Day of the week.
     * 
     */
    @EnumType
    public enum WeeklyScheduleDayOfWeek {
        /**
         * The day of the week is unspecified.
         * 
         */
        DayOfWeekUnspecified("DAY_OF_WEEK_UNSPECIFIED"),
        /**
         * Monday
         * 
         */
        Monday("MONDAY"),
        /**
         * Tuesday
         * 
         */
        Tuesday("TUESDAY"),
        /**
         * Wednesday
         * 
         */
        Wednesday("WEDNESDAY"),
        /**
         * Thursday
         * 
         */
        Thursday("THURSDAY"),
        /**
         * Friday
         * 
         */
        Friday("FRIDAY"),
        /**
         * Saturday
         * 
         */
        Saturday("SATURDAY"),
        /**
         * Sunday
         * 
         */
        Sunday("SUNDAY");

        private final String value;

        WeeklyScheduleDayOfWeek(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "WeeklyScheduleDayOfWeek[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }