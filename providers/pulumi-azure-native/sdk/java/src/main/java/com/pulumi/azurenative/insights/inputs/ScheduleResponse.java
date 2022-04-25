// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Defines how often to run the search and the time interval.
 * 
 */
public final class ScheduleResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScheduleResponse Empty = new ScheduleResponse();

    /**
     * frequency (in minutes) at which rule condition should be evaluated.
     * 
     */
    @Import(name="frequencyInMinutes", required=true)
    private Integer frequencyInMinutes;

    /**
     * @return frequency (in minutes) at which rule condition should be evaluated.
     * 
     */
    public Integer frequencyInMinutes() {
        return this.frequencyInMinutes;
    }

    /**
     * Time window for which data needs to be fetched for query (should be greater than or equal to frequencyInMinutes).
     * 
     */
    @Import(name="timeWindowInMinutes", required=true)
    private Integer timeWindowInMinutes;

    /**
     * @return Time window for which data needs to be fetched for query (should be greater than or equal to frequencyInMinutes).
     * 
     */
    public Integer timeWindowInMinutes() {
        return this.timeWindowInMinutes;
    }

    private ScheduleResponse() {}

    private ScheduleResponse(ScheduleResponse $) {
        this.frequencyInMinutes = $.frequencyInMinutes;
        this.timeWindowInMinutes = $.timeWindowInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduleResponse $;

        public Builder() {
            $ = new ScheduleResponse();
        }

        public Builder(ScheduleResponse defaults) {
            $ = new ScheduleResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param frequencyInMinutes frequency (in minutes) at which rule condition should be evaluated.
         * 
         * @return builder
         * 
         */
        public Builder frequencyInMinutes(Integer frequencyInMinutes) {
            $.frequencyInMinutes = frequencyInMinutes;
            return this;
        }

        /**
         * @param timeWindowInMinutes Time window for which data needs to be fetched for query (should be greater than or equal to frequencyInMinutes).
         * 
         * @return builder
         * 
         */
        public Builder timeWindowInMinutes(Integer timeWindowInMinutes) {
            $.timeWindowInMinutes = timeWindowInMinutes;
            return this;
        }

        public ScheduleResponse build() {
            $.frequencyInMinutes = Objects.requireNonNull($.frequencyInMinutes, "expected parameter 'frequencyInMinutes' to be non-null");
            $.timeWindowInMinutes = Objects.requireNonNull($.timeWindowInMinutes, "expected parameter 'timeWindowInMinutes' to be non-null");
            return $;
        }
    }

}
