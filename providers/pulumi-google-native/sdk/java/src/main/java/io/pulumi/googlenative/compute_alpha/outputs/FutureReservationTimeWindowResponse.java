// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.DurationResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FutureReservationTimeWindowResponse {
    private final DurationResponse duration;
    private final String endTime;
    /**
     * Start time of the Future Reservation. The start_time is an RFC3339 string.
     * 
     */
    private final String startTime;

    @OutputCustomType.Constructor({"duration","endTime","startTime"})
    private FutureReservationTimeWindowResponse(
        DurationResponse duration,
        String endTime,
        String startTime) {
        this.duration = Objects.requireNonNull(duration);
        this.endTime = Objects.requireNonNull(endTime);
        this.startTime = Objects.requireNonNull(startTime);
    }

    public DurationResponse getDuration() {
        return this.duration;
    }
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * Start time of the Future Reservation. The start_time is an RFC3339 string.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FutureReservationTimeWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DurationResponse duration;
        private String endTime;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(FutureReservationTimeWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder setDuration(DurationResponse duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public FutureReservationTimeWindowResponse build() {
            return new FutureReservationTimeWindowResponse(duration, endTime, startTime);
        }
    }
}