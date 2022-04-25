// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.billingbudgets_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Represents a whole or partial calendar date, such as a birthday. The time of day and time zone are either specified elsewhere or are insignificant. The date is relative to the Gregorian Calendar. This can represent one of the following: * A full date, with non-zero year, month, and day values * A month and day value, with a zero year, such as an anniversary * A year on its own, with zero month and day values * A year and month value, with a zero day, such as a credit card expiration date Related types are google.type.TimeOfDay and `google.protobuf.Timestamp`.
 * 
 */
public final class GoogleTypeDateResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleTypeDateResponse Empty = new GoogleTypeDateResponse();

    /**
     * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn&#39;t significant.
     * 
     */
    @Import(name="day", required=true)
    private Integer day;

    /**
     * @return Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn&#39;t significant.
     * 
     */
    public Integer day() {
        return this.day;
    }

    /**
     * Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
     * 
     */
    @Import(name="month", required=true)
    private Integer month;

    /**
     * @return Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
     * 
     */
    public Integer month() {
        return this.month;
    }

    /**
     * Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
     * 
     */
    @Import(name="year", required=true)
    private Integer year;

    /**
     * @return Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
     * 
     */
    public Integer year() {
        return this.year;
    }

    private GoogleTypeDateResponse() {}

    private GoogleTypeDateResponse(GoogleTypeDateResponse $) {
        this.day = $.day;
        this.month = $.month;
        this.year = $.year;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleTypeDateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleTypeDateResponse $;

        public Builder() {
            $ = new GoogleTypeDateResponse();
        }

        public Builder(GoogleTypeDateResponse defaults) {
            $ = new GoogleTypeDateResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param day Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn&#39;t significant.
         * 
         * @return builder
         * 
         */
        public Builder day(Integer day) {
            $.day = day;
            return this;
        }

        /**
         * @param month Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
         * 
         * @return builder
         * 
         */
        public Builder month(Integer month) {
            $.month = month;
            return this;
        }

        /**
         * @param year Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
         * 
         * @return builder
         * 
         */
        public Builder year(Integer year) {
            $.year = year;
            return this;
        }

        public GoogleTypeDateResponse build() {
            $.day = Objects.requireNonNull($.day, "expected parameter 'day' to be non-null");
            $.month = Objects.requireNonNull($.month, "expected parameter 'month' to be non-null");
            $.year = Objects.requireNonNull($.year, "expected parameter 'year' to be non-null");
            return $;
        }
    }

}
