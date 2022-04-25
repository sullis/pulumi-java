// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * The time.
 * 
 */
public final class TimeArgs extends com.pulumi.resources.ResourceArgs {

    public static final TimeArgs Empty = new TimeArgs();

    /**
     * The hour.
     * 
     */
    @Import(name="hours", required=true)
    private Output<Integer> hours;

    /**
     * @return The hour.
     * 
     */
    public Output<Integer> hours() {
        return this.hours;
    }

    /**
     * The minute.
     * 
     */
    @Import(name="minutes", required=true)
    private Output<Integer> minutes;

    /**
     * @return The minute.
     * 
     */
    public Output<Integer> minutes() {
        return this.minutes;
    }

    /**
     * The second.
     * 
     */
    @Import(name="seconds", required=true)
    private Output<Integer> seconds;

    /**
     * @return The second.
     * 
     */
    public Output<Integer> seconds() {
        return this.seconds;
    }

    private TimeArgs() {}

    private TimeArgs(TimeArgs $) {
        this.hours = $.hours;
        this.minutes = $.minutes;
        this.seconds = $.seconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimeArgs $;

        public Builder() {
            $ = new TimeArgs();
        }

        public Builder(TimeArgs defaults) {
            $ = new TimeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hours The hour.
         * 
         * @return builder
         * 
         */
        public Builder hours(Output<Integer> hours) {
            $.hours = hours;
            return this;
        }

        /**
         * @param hours The hour.
         * 
         * @return builder
         * 
         */
        public Builder hours(Integer hours) {
            return hours(Output.of(hours));
        }

        /**
         * @param minutes The minute.
         * 
         * @return builder
         * 
         */
        public Builder minutes(Output<Integer> minutes) {
            $.minutes = minutes;
            return this;
        }

        /**
         * @param minutes The minute.
         * 
         * @return builder
         * 
         */
        public Builder minutes(Integer minutes) {
            return minutes(Output.of(minutes));
        }

        /**
         * @param seconds The second.
         * 
         * @return builder
         * 
         */
        public Builder seconds(Output<Integer> seconds) {
            $.seconds = seconds;
            return this;
        }

        /**
         * @param seconds The second.
         * 
         * @return builder
         * 
         */
        public Builder seconds(Integer seconds) {
            return seconds(Output.of(seconds));
        }

        public TimeArgs build() {
            $.hours = Objects.requireNonNull($.hours, "expected parameter 'hours' to be non-null");
            $.minutes = Objects.requireNonNull($.minutes, "expected parameter 'minutes' to be non-null");
            $.seconds = Objects.requireNonNull($.seconds, "expected parameter 'seconds' to be non-null");
            return $;
        }
    }

}
