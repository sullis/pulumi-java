// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Time window specified for daily operations.
 * 
 */
public final class ResourcePolicyDailyCycleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourcePolicyDailyCycleResponse Empty = new ResourcePolicyDailyCycleResponse();

    /**
     * Defines a schedule with units measured in months. The value determines how many months pass between the start of each cycle.
     * 
     */
    @InputImport(name="daysInCycle", required=true)
      private final Integer daysInCycle;

    public Integer getDaysInCycle() {
        return this.daysInCycle;
    }

    /**
     * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * 
     */
    @InputImport(name="duration", required=true)
      private final String duration;

    public String getDuration() {
        return this.duration;
    }

    /**
     * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * 
     */
    @InputImport(name="startTime", required=true)
      private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    public ResourcePolicyDailyCycleResponse(
        Integer daysInCycle,
        String duration,
        String startTime) {
        this.daysInCycle = Objects.requireNonNull(daysInCycle, "expected parameter 'daysInCycle' to be non-null");
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private ResourcePolicyDailyCycleResponse() {
        this.daysInCycle = null;
        this.duration = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyDailyCycleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer daysInCycle;
        private String duration;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyDailyCycleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysInCycle = defaults.daysInCycle;
    	      this.duration = defaults.duration;
    	      this.startTime = defaults.startTime;
        }

        public Builder setDaysInCycle(Integer daysInCycle) {
            this.daysInCycle = Objects.requireNonNull(daysInCycle);
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public ResourcePolicyDailyCycleResponse build() {
            return new ResourcePolicyDailyCycleResponse(daysInCycle, duration, startTime);
        }
    }
}