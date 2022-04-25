// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.container_v1beta1.outputs.MaintenanceExclusionOptionsResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TimeWindowResponse {
    /**
     * @return The time that the window ends. The end time should take place after the start time.
     * 
     */
    private final String endTime;
    /**
     * @return MaintenanceExclusionOptions provides maintenance exclusion related options.
     * 
     */
    private final MaintenanceExclusionOptionsResponse maintenanceExclusionOptions;
    /**
     * @return The time that the window first starts.
     * 
     */
    private final String startTime;

    @CustomType.Constructor
    private TimeWindowResponse(
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("maintenanceExclusionOptions") MaintenanceExclusionOptionsResponse maintenanceExclusionOptions,
        @CustomType.Parameter("startTime") String startTime) {
        this.endTime = endTime;
        this.maintenanceExclusionOptions = maintenanceExclusionOptions;
        this.startTime = startTime;
    }

    /**
     * @return The time that the window ends. The end time should take place after the start time.
     * 
     */
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return MaintenanceExclusionOptions provides maintenance exclusion related options.
     * 
     */
    public MaintenanceExclusionOptionsResponse maintenanceExclusionOptions() {
        return this.maintenanceExclusionOptions;
    }
    /**
     * @return The time that the window first starts.
     * 
     */
    public String startTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private MaintenanceExclusionOptionsResponse maintenanceExclusionOptions;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.maintenanceExclusionOptions = defaults.maintenanceExclusionOptions;
    	      this.startTime = defaults.startTime;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder maintenanceExclusionOptions(MaintenanceExclusionOptionsResponse maintenanceExclusionOptions) {
            this.maintenanceExclusionOptions = Objects.requireNonNull(maintenanceExclusionOptions);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public TimeWindowResponse build() {
            return new TimeWindowResponse(endTime, maintenanceExclusionOptions, startTime);
        }
    }
}
