// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect.outputs;

import io.pulumi.awsnative.connect.enums.HoursOfOperationConfigDay;
import io.pulumi.awsnative.connect.outputs.HoursOfOperationTimeSlice;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class HoursOfOperationConfig {
    private final HoursOfOperationConfigDay day;
    private final HoursOfOperationTimeSlice endTime;
    private final HoursOfOperationTimeSlice startTime;

    @OutputCustomType.Constructor({"day","endTime","startTime"})
    private HoursOfOperationConfig(
        HoursOfOperationConfigDay day,
        HoursOfOperationTimeSlice endTime,
        HoursOfOperationTimeSlice startTime) {
        this.day = Objects.requireNonNull(day);
        this.endTime = Objects.requireNonNull(endTime);
        this.startTime = Objects.requireNonNull(startTime);
    }

    public HoursOfOperationConfigDay getDay() {
        return this.day;
    }
    public HoursOfOperationTimeSlice getEndTime() {
        return this.endTime;
    }
    public HoursOfOperationTimeSlice getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HoursOfOperationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HoursOfOperationConfigDay day;
        private HoursOfOperationTimeSlice endTime;
        private HoursOfOperationTimeSlice startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(HoursOfOperationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder setDay(HoursOfOperationConfigDay day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }

        public Builder setEndTime(HoursOfOperationTimeSlice endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setStartTime(HoursOfOperationTimeSlice startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public HoursOfOperationConfig build() {
            return new HoursOfOperationConfig(day, endTime, startTime);
        }
    }
}
