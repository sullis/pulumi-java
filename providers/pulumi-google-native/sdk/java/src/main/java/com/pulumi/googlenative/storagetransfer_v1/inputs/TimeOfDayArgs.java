// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a time of day. The date and time zone are either not significant or are specified elsewhere. An API may choose to allow leap seconds. Related types are google.type.Date and `google.protobuf.Timestamp`.
 * 
 */
public final class TimeOfDayArgs extends com.pulumi.resources.ResourceArgs {

    public static final TimeOfDayArgs Empty = new TimeOfDayArgs();

    /**
     * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value &#34;24:00:00&#34; for scenarios like business closing time.
     * 
     */
    @Import(name="hours")
    private @Nullable Output<Integer> hours;

    /**
     * @return Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value &#34;24:00:00&#34; for scenarios like business closing time.
     * 
     */
    public Optional<Output<Integer>> hours() {
        return Optional.ofNullable(this.hours);
    }

    /**
     * Minutes of hour of day. Must be from 0 to 59.
     * 
     */
    @Import(name="minutes")
    private @Nullable Output<Integer> minutes;

    /**
     * @return Minutes of hour of day. Must be from 0 to 59.
     * 
     */
    public Optional<Output<Integer>> minutes() {
        return Optional.ofNullable(this.minutes);
    }

    /**
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * 
     */
    @Import(name="nanos")
    private @Nullable Output<Integer> nanos;

    /**
     * @return Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * 
     */
    public Optional<Output<Integer>> nanos() {
        return Optional.ofNullable(this.nanos);
    }

    /**
     * Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if it allows leap-seconds.
     * 
     */
    @Import(name="seconds")
    private @Nullable Output<Integer> seconds;

    /**
     * @return Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if it allows leap-seconds.
     * 
     */
    public Optional<Output<Integer>> seconds() {
        return Optional.ofNullable(this.seconds);
    }

    private TimeOfDayArgs() {}

    private TimeOfDayArgs(TimeOfDayArgs $) {
        this.hours = $.hours;
        this.minutes = $.minutes;
        this.nanos = $.nanos;
        this.seconds = $.seconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TimeOfDayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimeOfDayArgs $;

        public Builder() {
            $ = new TimeOfDayArgs();
        }

        public Builder(TimeOfDayArgs defaults) {
            $ = new TimeOfDayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hours Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value &#34;24:00:00&#34; for scenarios like business closing time.
         * 
         * @return builder
         * 
         */
        public Builder hours(@Nullable Output<Integer> hours) {
            $.hours = hours;
            return this;
        }

        /**
         * @param hours Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value &#34;24:00:00&#34; for scenarios like business closing time.
         * 
         * @return builder
         * 
         */
        public Builder hours(Integer hours) {
            return hours(Output.of(hours));
        }

        /**
         * @param minutes Minutes of hour of day. Must be from 0 to 59.
         * 
         * @return builder
         * 
         */
        public Builder minutes(@Nullable Output<Integer> minutes) {
            $.minutes = minutes;
            return this;
        }

        /**
         * @param minutes Minutes of hour of day. Must be from 0 to 59.
         * 
         * @return builder
         * 
         */
        public Builder minutes(Integer minutes) {
            return minutes(Output.of(minutes));
        }

        /**
         * @param nanos Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
         * 
         * @return builder
         * 
         */
        public Builder nanos(@Nullable Output<Integer> nanos) {
            $.nanos = nanos;
            return this;
        }

        /**
         * @param nanos Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
         * 
         * @return builder
         * 
         */
        public Builder nanos(Integer nanos) {
            return nanos(Output.of(nanos));
        }

        /**
         * @param seconds Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if it allows leap-seconds.
         * 
         * @return builder
         * 
         */
        public Builder seconds(@Nullable Output<Integer> seconds) {
            $.seconds = seconds;
            return this;
        }

        /**
         * @param seconds Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if it allows leap-seconds.
         * 
         * @return builder
         * 
         */
        public Builder seconds(Integer seconds) {
            return seconds(Output.of(seconds));
        }

        public TimeOfDayArgs build() {
            return $;
        }
    }

}
