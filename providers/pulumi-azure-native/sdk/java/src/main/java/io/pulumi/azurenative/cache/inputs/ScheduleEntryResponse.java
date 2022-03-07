// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Patch schedule entry for a Premium Redis Cache.
 * 
 */
public final class ScheduleEntryResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScheduleEntryResponse Empty = new ScheduleEntryResponse();

    /**
     * Day of the week when a cache can be patched.
     * 
     */
    @InputImport(name="dayOfWeek", required=true)
      private final String dayOfWeek;

    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * ISO8601 timespan specifying how much time cache patching can take.
     * 
     */
    @InputImport(name="maintenanceWindow")
      private final @Nullable String maintenanceWindow;

    public Optional<String> getMaintenanceWindow() {
        return this.maintenanceWindow == null ? Optional.empty() : Optional.ofNullable(this.maintenanceWindow);
    }

    /**
     * Start hour after which cache patching can start.
     * 
     */
    @InputImport(name="startHourUtc", required=true)
      private final Integer startHourUtc;

    public Integer getStartHourUtc() {
        return this.startHourUtc;
    }

    public ScheduleEntryResponse(
        String dayOfWeek,
        @Nullable String maintenanceWindow,
        Integer startHourUtc) {
        this.dayOfWeek = Objects.requireNonNull(dayOfWeek, "expected parameter 'dayOfWeek' to be non-null");
        this.maintenanceWindow = maintenanceWindow;
        this.startHourUtc = Objects.requireNonNull(startHourUtc, "expected parameter 'startHourUtc' to be non-null");
    }

    private ScheduleEntryResponse() {
        this.dayOfWeek = null;
        this.maintenanceWindow = null;
        this.startHourUtc = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dayOfWeek;
        private @Nullable String maintenanceWindow;
        private Integer startHourUtc;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.startHourUtc = defaults.startHourUtc;
        }

        public Builder setDayOfWeek(String dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }

        public Builder setMaintenanceWindow(@Nullable String maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        public Builder setStartHourUtc(Integer startHourUtc) {
            this.startHourUtc = Objects.requireNonNull(startHourUtc);
            return this;
        }
        public ScheduleEntryResponse build() {
            return new ScheduleEntryResponse(dayOfWeek, maintenanceWindow, startHourUtc);
        }
    }
}