// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class ScheduleResponse {
    /**
     * frequency (in minutes) at which rule condition should be evaluated.
     * 
     */
    private final Integer frequencyInMinutes;
    /**
     * Time window for which data needs to be fetched for query (should be greater than or equal to frequencyInMinutes).
     * 
     */
    private final Integer timeWindowInMinutes;

    @OutputCustomType.Constructor({"frequencyInMinutes","timeWindowInMinutes"})
    private ScheduleResponse(
        Integer frequencyInMinutes,
        Integer timeWindowInMinutes) {
        this.frequencyInMinutes = Objects.requireNonNull(frequencyInMinutes);
        this.timeWindowInMinutes = Objects.requireNonNull(timeWindowInMinutes);
    }

    /**
     * frequency (in minutes) at which rule condition should be evaluated.
     * 
     */
    public Integer getFrequencyInMinutes() {
        return this.frequencyInMinutes;
    }
    /**
     * Time window for which data needs to be fetched for query (should be greater than or equal to frequencyInMinutes).
     * 
     */
    public Integer getTimeWindowInMinutes() {
        return this.timeWindowInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer frequencyInMinutes;
        private Integer timeWindowInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequencyInMinutes = defaults.frequencyInMinutes;
    	      this.timeWindowInMinutes = defaults.timeWindowInMinutes;
        }

        public Builder setFrequencyInMinutes(Integer frequencyInMinutes) {
            this.frequencyInMinutes = Objects.requireNonNull(frequencyInMinutes);
            return this;
        }

        public Builder setTimeWindowInMinutes(Integer timeWindowInMinutes) {
            this.timeWindowInMinutes = Objects.requireNonNull(timeWindowInMinutes);
            return this;
        }

        public ScheduleResponse build() {
            return new ScheduleResponse(frequencyInMinutes, timeWindowInMinutes);
        }
    }
}
