// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Defines how often to run the search and the time interval.
 * 
 */
public final class ScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduleArgs Empty = new ScheduleArgs();

    /**
     * frequency (in minutes) at which rule condition should be evaluated.
     * 
     */
    @Import(name="frequencyInMinutes", required=true)
    private Output<Integer> frequencyInMinutes;

    /**
     * @return frequency (in minutes) at which rule condition should be evaluated.
     * 
     */
    public Output<Integer> frequencyInMinutes() {
        return this.frequencyInMinutes;
    }

    /**
     * Time window for which data needs to be fetched for query (should be greater than or equal to frequencyInMinutes).
     * 
     */
    @Import(name="timeWindowInMinutes", required=true)
    private Output<Integer> timeWindowInMinutes;

    /**
     * @return Time window for which data needs to be fetched for query (should be greater than or equal to frequencyInMinutes).
     * 
     */
    public Output<Integer> timeWindowInMinutes() {
        return this.timeWindowInMinutes;
    }

    private ScheduleArgs() {}

    private ScheduleArgs(ScheduleArgs $) {
        this.frequencyInMinutes = $.frequencyInMinutes;
        this.timeWindowInMinutes = $.timeWindowInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduleArgs $;

        public Builder() {
            $ = new ScheduleArgs();
        }

        public Builder(ScheduleArgs defaults) {
            $ = new ScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param frequencyInMinutes frequency (in minutes) at which rule condition should be evaluated.
         * 
         * @return builder
         * 
         */
        public Builder frequencyInMinutes(Output<Integer> frequencyInMinutes) {
            $.frequencyInMinutes = frequencyInMinutes;
            return this;
        }

        /**
         * @param frequencyInMinutes frequency (in minutes) at which rule condition should be evaluated.
         * 
         * @return builder
         * 
         */
        public Builder frequencyInMinutes(Integer frequencyInMinutes) {
            return frequencyInMinutes(Output.of(frequencyInMinutes));
        }

        /**
         * @param timeWindowInMinutes Time window for which data needs to be fetched for query (should be greater than or equal to frequencyInMinutes).
         * 
         * @return builder
         * 
         */
        public Builder timeWindowInMinutes(Output<Integer> timeWindowInMinutes) {
            $.timeWindowInMinutes = timeWindowInMinutes;
            return this;
        }

        /**
         * @param timeWindowInMinutes Time window for which data needs to be fetched for query (should be greater than or equal to frequencyInMinutes).
         * 
         * @return builder
         * 
         */
        public Builder timeWindowInMinutes(Integer timeWindowInMinutes) {
            return timeWindowInMinutes(Output.of(timeWindowInMinutes));
        }

        public ScheduleArgs build() {
            $.frequencyInMinutes = Objects.requireNonNull($.frequencyInMinutes, "expected parameter 'frequencyInMinutes' to be non-null");
            $.timeWindowInMinutes = Objects.requireNonNull($.timeWindowInMinutes, "expected parameter 'timeWindowInMinutes' to be non-null");
            return $;
        }
    }

}
