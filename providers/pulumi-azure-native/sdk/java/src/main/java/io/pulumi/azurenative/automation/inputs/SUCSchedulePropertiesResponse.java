// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.azurenative.automation.inputs.AdvancedScheduleResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of schedule parameters.
 * 
 */
public final class SUCSchedulePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final SUCSchedulePropertiesResponse Empty = new SUCSchedulePropertiesResponse();

    /**
     * Gets or sets the advanced schedule.
     * 
     */
    @InputImport(name="advancedSchedule")
    private final @Nullable AdvancedScheduleResponse advancedSchedule;

    public Optional<AdvancedScheduleResponse> getAdvancedSchedule() {
        return this.advancedSchedule == null ? Optional.empty() : Optional.ofNullable(this.advancedSchedule);
    }

    /**
     * Gets or sets the creation time.
     * 
     */
    @InputImport(name="creationTime")
    private final @Nullable String creationTime;

    public Optional<String> getCreationTime() {
        return this.creationTime == null ? Optional.empty() : Optional.ofNullable(this.creationTime);
    }

    /**
     * Gets or sets the description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Gets or sets the end time of the schedule.
     * 
     */
    @InputImport(name="expiryTime")
    private final @Nullable String expiryTime;

    public Optional<String> getExpiryTime() {
        return this.expiryTime == null ? Optional.empty() : Optional.ofNullable(this.expiryTime);
    }

    /**
     * Gets or sets the expiry time's offset in minutes.
     * 
     */
    @InputImport(name="expiryTimeOffsetMinutes")
    private final @Nullable Double expiryTimeOffsetMinutes;

    public Optional<Double> getExpiryTimeOffsetMinutes() {
        return this.expiryTimeOffsetMinutes == null ? Optional.empty() : Optional.ofNullable(this.expiryTimeOffsetMinutes);
    }

    /**
     * Gets or sets the frequency of the schedule.
     * 
     */
    @InputImport(name="frequency")
    private final @Nullable String frequency;

    public Optional<String> getFrequency() {
        return this.frequency == null ? Optional.empty() : Optional.ofNullable(this.frequency);
    }

    /**
     * Gets or sets the interval of the schedule.
     * 
     */
    @InputImport(name="interval")
    private final @Nullable Double interval;

    public Optional<Double> getInterval() {
        return this.interval == null ? Optional.empty() : Optional.ofNullable(this.interval);
    }

    /**
     * Gets or sets a value indicating whether this schedule is enabled.
     * 
     */
    @InputImport(name="isEnabled")
    private final @Nullable Boolean isEnabled;

    public Optional<Boolean> getIsEnabled() {
        return this.isEnabled == null ? Optional.empty() : Optional.ofNullable(this.isEnabled);
    }

    /**
     * Gets or sets the last modified time.
     * 
     */
    @InputImport(name="lastModifiedTime")
    private final @Nullable String lastModifiedTime;

    public Optional<String> getLastModifiedTime() {
        return this.lastModifiedTime == null ? Optional.empty() : Optional.ofNullable(this.lastModifiedTime);
    }

    /**
     * Gets or sets the next run time of the schedule.
     * 
     */
    @InputImport(name="nextRun")
    private final @Nullable String nextRun;

    public Optional<String> getNextRun() {
        return this.nextRun == null ? Optional.empty() : Optional.ofNullable(this.nextRun);
    }

    /**
     * Gets or sets the next run time's offset in minutes.
     * 
     */
    @InputImport(name="nextRunOffsetMinutes")
    private final @Nullable Double nextRunOffsetMinutes;

    public Optional<Double> getNextRunOffsetMinutes() {
        return this.nextRunOffsetMinutes == null ? Optional.empty() : Optional.ofNullable(this.nextRunOffsetMinutes);
    }

    /**
     * Gets or sets the start time of the schedule.
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable String startTime;

    public Optional<String> getStartTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    /**
     * Gets the start time's offset in minutes.
     * 
     */
    @InputImport(name="startTimeOffsetMinutes", required=true)
    private final Double startTimeOffsetMinutes;

    public Double getStartTimeOffsetMinutes() {
        return this.startTimeOffsetMinutes;
    }

    /**
     * Gets or sets the time zone of the schedule.
     * 
     */
    @InputImport(name="timeZone")
    private final @Nullable String timeZone;

    public Optional<String> getTimeZone() {
        return this.timeZone == null ? Optional.empty() : Optional.ofNullable(this.timeZone);
    }

    public SUCSchedulePropertiesResponse(
        @Nullable AdvancedScheduleResponse advancedSchedule,
        @Nullable String creationTime,
        @Nullable String description,
        @Nullable String expiryTime,
        @Nullable Double expiryTimeOffsetMinutes,
        @Nullable String frequency,
        @Nullable Double interval,
        @Nullable Boolean isEnabled,
        @Nullable String lastModifiedTime,
        @Nullable String nextRun,
        @Nullable Double nextRunOffsetMinutes,
        @Nullable String startTime,
        Double startTimeOffsetMinutes,
        @Nullable String timeZone) {
        this.advancedSchedule = advancedSchedule;
        this.creationTime = creationTime;
        this.description = description;
        this.expiryTime = expiryTime;
        this.expiryTimeOffsetMinutes = expiryTimeOffsetMinutes;
        this.frequency = frequency;
        this.interval = interval;
        this.isEnabled = isEnabled == null ? false : isEnabled;
        this.lastModifiedTime = lastModifiedTime;
        this.nextRun = nextRun;
        this.nextRunOffsetMinutes = nextRunOffsetMinutes;
        this.startTime = startTime;
        this.startTimeOffsetMinutes = Objects.requireNonNull(startTimeOffsetMinutes, "expected parameter 'startTimeOffsetMinutes' to be non-null");
        this.timeZone = timeZone;
    }

    private SUCSchedulePropertiesResponse() {
        this.advancedSchedule = null;
        this.creationTime = null;
        this.description = null;
        this.expiryTime = null;
        this.expiryTimeOffsetMinutes = null;
        this.frequency = null;
        this.interval = null;
        this.isEnabled = null;
        this.lastModifiedTime = null;
        this.nextRun = null;
        this.nextRunOffsetMinutes = null;
        this.startTime = null;
        this.startTimeOffsetMinutes = null;
        this.timeZone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SUCSchedulePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AdvancedScheduleResponse advancedSchedule;
        private @Nullable String creationTime;
        private @Nullable String description;
        private @Nullable String expiryTime;
        private @Nullable Double expiryTimeOffsetMinutes;
        private @Nullable String frequency;
        private @Nullable Double interval;
        private @Nullable Boolean isEnabled;
        private @Nullable String lastModifiedTime;
        private @Nullable String nextRun;
        private @Nullable Double nextRunOffsetMinutes;
        private @Nullable String startTime;
        private Double startTimeOffsetMinutes;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(SUCSchedulePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedSchedule = defaults.advancedSchedule;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.expiryTime = defaults.expiryTime;
    	      this.expiryTimeOffsetMinutes = defaults.expiryTimeOffsetMinutes;
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
    	      this.isEnabled = defaults.isEnabled;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.nextRun = defaults.nextRun;
    	      this.nextRunOffsetMinutes = defaults.nextRunOffsetMinutes;
    	      this.startTime = defaults.startTime;
    	      this.startTimeOffsetMinutes = defaults.startTimeOffsetMinutes;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setAdvancedSchedule(@Nullable AdvancedScheduleResponse advancedSchedule) {
            this.advancedSchedule = advancedSchedule;
            return this;
        }

        public Builder setCreationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setExpiryTime(@Nullable String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }

        public Builder setExpiryTimeOffsetMinutes(@Nullable Double expiryTimeOffsetMinutes) {
            this.expiryTimeOffsetMinutes = expiryTimeOffsetMinutes;
            return this;
        }

        public Builder setFrequency(@Nullable String frequency) {
            this.frequency = frequency;
            return this;
        }

        public Builder setInterval(@Nullable Double interval) {
            this.interval = interval;
            return this;
        }

        public Builder setIsEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public Builder setLastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        public Builder setNextRun(@Nullable String nextRun) {
            this.nextRun = nextRun;
            return this;
        }

        public Builder setNextRunOffsetMinutes(@Nullable Double nextRunOffsetMinutes) {
            this.nextRunOffsetMinutes = nextRunOffsetMinutes;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTimeOffsetMinutes(Double startTimeOffsetMinutes) {
            this.startTimeOffsetMinutes = Objects.requireNonNull(startTimeOffsetMinutes);
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public SUCSchedulePropertiesResponse build() {
            return new SUCSchedulePropertiesResponse(advancedSchedule, creationTime, description, expiryTime, expiryTimeOffsetMinutes, frequency, interval, isEnabled, lastModifiedTime, nextRun, nextRunOffsetMinutes, startTime, startTimeOffsetMinutes, timeZone);
        }
    }
}
