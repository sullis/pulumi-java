// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * Specifies a time limit for how long the monitoring job is allowed to run.
 * 
 */
public final class MonitoringScheduleStoppingCondition extends io.pulumi.resources.InvokeArgs {

    public static final MonitoringScheduleStoppingCondition Empty = new MonitoringScheduleStoppingCondition();

    /**
     * The maximum runtime allowed in seconds.
     * 
     */
    @InputImport(name="maxRuntimeInSeconds", required=true)
      private final Integer maxRuntimeInSeconds;

    public Integer getMaxRuntimeInSeconds() {
        return this.maxRuntimeInSeconds;
    }

    public MonitoringScheduleStoppingCondition(Integer maxRuntimeInSeconds) {
        this.maxRuntimeInSeconds = Objects.requireNonNull(maxRuntimeInSeconds, "expected parameter 'maxRuntimeInSeconds' to be non-null");
    }

    private MonitoringScheduleStoppingCondition() {
        this.maxRuntimeInSeconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleStoppingCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxRuntimeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleStoppingCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRuntimeInSeconds = defaults.maxRuntimeInSeconds;
        }

        public Builder setMaxRuntimeInSeconds(Integer maxRuntimeInSeconds) {
            this.maxRuntimeInSeconds = Objects.requireNonNull(maxRuntimeInSeconds);
            return this;
        }
        public MonitoringScheduleStoppingCondition build() {
            return new MonitoringScheduleStoppingCondition(maxRuntimeInSeconds);
        }
    }
}