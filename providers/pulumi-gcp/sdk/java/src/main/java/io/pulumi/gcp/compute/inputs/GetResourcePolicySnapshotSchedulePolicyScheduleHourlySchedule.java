// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule extends io.pulumi.resources.InvokeArgs {

    public static final GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule Empty = new GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule();

    @InputImport(name="hoursInCycle", required=true)
      private final Integer hoursInCycle;

    public Integer getHoursInCycle() {
        return this.hoursInCycle;
    }

    @InputImport(name="startTime", required=true)
      private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    public GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule(
        Integer hoursInCycle,
        String startTime) {
        this.hoursInCycle = Objects.requireNonNull(hoursInCycle, "expected parameter 'hoursInCycle' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule() {
        this.hoursInCycle = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer hoursInCycle;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hoursInCycle = defaults.hoursInCycle;
    	      this.startTime = defaults.startTime;
        }

        public Builder setHoursInCycle(Integer hoursInCycle) {
            this.hoursInCycle = Objects.requireNonNull(hoursInCycle);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule build() {
            return new GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule(hoursInCycle, startTime);
        }
    }
}