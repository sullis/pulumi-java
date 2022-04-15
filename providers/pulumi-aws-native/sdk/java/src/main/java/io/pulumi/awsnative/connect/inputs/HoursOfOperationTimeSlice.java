// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * The start time or end time for an hours of operation.
 * 
 */
public final class HoursOfOperationTimeSlice extends io.pulumi.resources.InvokeArgs {

    public static final HoursOfOperationTimeSlice Empty = new HoursOfOperationTimeSlice();

    /**
     * The hours.
     * 
     */
    @Import(name="hours", required=true)
      private final Integer hours;

    public Integer hours() {
        return this.hours;
    }

    /**
     * The minutes.
     * 
     */
    @Import(name="minutes", required=true)
      private final Integer minutes;

    public Integer minutes() {
        return this.minutes;
    }

    public HoursOfOperationTimeSlice(
        Integer hours,
        Integer minutes) {
        this.hours = Objects.requireNonNull(hours, "expected parameter 'hours' to be non-null");
        this.minutes = Objects.requireNonNull(minutes, "expected parameter 'minutes' to be non-null");
    }

    private HoursOfOperationTimeSlice() {
        this.hours = null;
        this.minutes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HoursOfOperationTimeSlice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer hours;
        private Integer minutes;

        public Builder() {
    	      // Empty
        }

        public Builder(HoursOfOperationTimeSlice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
        }

        public Builder hours(Integer hours) {
            this.hours = Objects.requireNonNull(hours);
            return this;
        }
        public Builder minutes(Integer minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }        public HoursOfOperationTimeSlice build() {
            return new HoursOfOperationTimeSlice(hours, minutes);
        }
    }
}
