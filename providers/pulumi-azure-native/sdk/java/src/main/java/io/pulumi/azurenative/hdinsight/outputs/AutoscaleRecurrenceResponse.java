// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.azurenative.hdinsight.outputs.AutoscaleScheduleResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutoscaleRecurrenceResponse {
    /**
     * Array of schedule-based autoscale rules
     * 
     */
    private final @Nullable List<AutoscaleScheduleResponse> schedule;
    /**
     * The time zone for the autoscale schedule times
     * 
     */
    private final @Nullable String timeZone;

    @OutputCustomType.Constructor({"schedule","timeZone"})
    private AutoscaleRecurrenceResponse(
        @Nullable List<AutoscaleScheduleResponse> schedule,
        @Nullable String timeZone) {
        this.schedule = schedule;
        this.timeZone = timeZone;
    }

    /**
     * Array of schedule-based autoscale rules
     * 
     */
    public List<AutoscaleScheduleResponse> getSchedule() {
        return this.schedule == null ? List.of() : this.schedule;
    }
    /**
     * The time zone for the autoscale schedule times
     * 
     */
    public Optional<String> getTimeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleRecurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AutoscaleScheduleResponse> schedule;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleRecurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedule = defaults.schedule;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setSchedule(@Nullable List<AutoscaleScheduleResponse> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public AutoscaleRecurrenceResponse build() {
            return new AutoscaleRecurrenceResponse(schedule, timeZone);
        }
    }
}
