// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDatabaseInstanceSettingMaintenanceWindow {
    private final Integer day;
    private final Integer hour;
    private final String updateTrack;

    @OutputCustomType.Constructor({"day","hour","updateTrack"})
    private GetDatabaseInstanceSettingMaintenanceWindow(
        Integer day,
        Integer hour,
        String updateTrack) {
        this.day = Objects.requireNonNull(day);
        this.hour = Objects.requireNonNull(hour);
        this.updateTrack = Objects.requireNonNull(updateTrack);
    }

    public Integer getDay() {
        return this.day;
    }
    public Integer getHour() {
        return this.hour;
    }
    public String getUpdateTrack() {
        return this.updateTrack;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstanceSettingMaintenanceWindow defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer day;
        private Integer hour;
        private String updateTrack;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseInstanceSettingMaintenanceWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.hour = defaults.hour;
    	      this.updateTrack = defaults.updateTrack;
        }

        public Builder setDay(Integer day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }

        public Builder setHour(Integer hour) {
            this.hour = Objects.requireNonNull(hour);
            return this;
        }

        public Builder setUpdateTrack(String updateTrack) {
            this.updateTrack = Objects.requireNonNull(updateTrack);
            return this;
        }
        public GetDatabaseInstanceSettingMaintenanceWindow build() {
            return new GetDatabaseInstanceSettingMaintenanceWindow(day, hour, updateTrack);
        }
    }
}