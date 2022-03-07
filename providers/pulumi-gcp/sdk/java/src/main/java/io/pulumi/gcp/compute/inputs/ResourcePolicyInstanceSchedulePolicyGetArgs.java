// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.ResourcePolicyInstanceSchedulePolicyVmStartScheduleGetArgs;
import io.pulumi.gcp.compute.inputs.ResourcePolicyInstanceSchedulePolicyVmStopScheduleGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourcePolicyInstanceSchedulePolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyInstanceSchedulePolicyGetArgs Empty = new ResourcePolicyInstanceSchedulePolicyGetArgs();

    /**
     * The expiration time of the schedule. The timestamp is an RFC3339 string.
     * 
     */
    @InputImport(name="expirationTime")
      private final @Nullable Input<String> expirationTime;

    public Input<String> getExpirationTime() {
        return this.expirationTime == null ? Input.empty() : this.expirationTime;
    }

    /**
     * The start time of the schedule. The timestamp is an RFC3339 string.
     * 
     */
    @InputImport(name="startTime")
      private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * Specifies the time zone to be used in interpreting the schedule. The value of this field must be a time zone name
     * from the tz database: http://en.wikipedia.org/wiki/Tz_database.
     * 
     */
    @InputImport(name="timeZone", required=true)
      private final Input<String> timeZone;

    public Input<String> getTimeZone() {
        return this.timeZone;
    }

    /**
     * Specifies the schedule for starting instances.
     * Structure is documented below.
     * 
     */
    @InputImport(name="vmStartSchedule")
      private final @Nullable Input<ResourcePolicyInstanceSchedulePolicyVmStartScheduleGetArgs> vmStartSchedule;

    public Input<ResourcePolicyInstanceSchedulePolicyVmStartScheduleGetArgs> getVmStartSchedule() {
        return this.vmStartSchedule == null ? Input.empty() : this.vmStartSchedule;
    }

    /**
     * Specifies the schedule for stopping instances.
     * Structure is documented below.
     * 
     */
    @InputImport(name="vmStopSchedule")
      private final @Nullable Input<ResourcePolicyInstanceSchedulePolicyVmStopScheduleGetArgs> vmStopSchedule;

    public Input<ResourcePolicyInstanceSchedulePolicyVmStopScheduleGetArgs> getVmStopSchedule() {
        return this.vmStopSchedule == null ? Input.empty() : this.vmStopSchedule;
    }

    public ResourcePolicyInstanceSchedulePolicyGetArgs(
        @Nullable Input<String> expirationTime,
        @Nullable Input<String> startTime,
        Input<String> timeZone,
        @Nullable Input<ResourcePolicyInstanceSchedulePolicyVmStartScheduleGetArgs> vmStartSchedule,
        @Nullable Input<ResourcePolicyInstanceSchedulePolicyVmStopScheduleGetArgs> vmStopSchedule) {
        this.expirationTime = expirationTime;
        this.startTime = startTime;
        this.timeZone = Objects.requireNonNull(timeZone, "expected parameter 'timeZone' to be non-null");
        this.vmStartSchedule = vmStartSchedule;
        this.vmStopSchedule = vmStopSchedule;
    }

    private ResourcePolicyInstanceSchedulePolicyGetArgs() {
        this.expirationTime = Input.empty();
        this.startTime = Input.empty();
        this.timeZone = Input.empty();
        this.vmStartSchedule = Input.empty();
        this.vmStopSchedule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyInstanceSchedulePolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> expirationTime;
        private @Nullable Input<String> startTime;
        private Input<String> timeZone;
        private @Nullable Input<ResourcePolicyInstanceSchedulePolicyVmStartScheduleGetArgs> vmStartSchedule;
        private @Nullable Input<ResourcePolicyInstanceSchedulePolicyVmStopScheduleGetArgs> vmStopSchedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyInstanceSchedulePolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTime = defaults.expirationTime;
    	      this.startTime = defaults.startTime;
    	      this.timeZone = defaults.timeZone;
    	      this.vmStartSchedule = defaults.vmStartSchedule;
    	      this.vmStopSchedule = defaults.vmStopSchedule;
        }

        public Builder setExpirationTime(@Nullable Input<String> expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public Builder setExpirationTime(@Nullable String expirationTime) {
            this.expirationTime = Input.ofNullable(expirationTime);
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder setTimeZone(Input<String> timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }

        public Builder setTimeZone(String timeZone) {
            this.timeZone = Input.of(Objects.requireNonNull(timeZone));
            return this;
        }

        public Builder setVmStartSchedule(@Nullable Input<ResourcePolicyInstanceSchedulePolicyVmStartScheduleGetArgs> vmStartSchedule) {
            this.vmStartSchedule = vmStartSchedule;
            return this;
        }

        public Builder setVmStartSchedule(@Nullable ResourcePolicyInstanceSchedulePolicyVmStartScheduleGetArgs vmStartSchedule) {
            this.vmStartSchedule = Input.ofNullable(vmStartSchedule);
            return this;
        }

        public Builder setVmStopSchedule(@Nullable Input<ResourcePolicyInstanceSchedulePolicyVmStopScheduleGetArgs> vmStopSchedule) {
            this.vmStopSchedule = vmStopSchedule;
            return this;
        }

        public Builder setVmStopSchedule(@Nullable ResourcePolicyInstanceSchedulePolicyVmStopScheduleGetArgs vmStopSchedule) {
            this.vmStopSchedule = Input.ofNullable(vmStopSchedule);
            return this;
        }
        public ResourcePolicyInstanceSchedulePolicyGetArgs build() {
            return new ResourcePolicyInstanceSchedulePolicyGetArgs(expirationTime, startTime, timeZone, vmStartSchedule, vmStopSchedule);
        }
    }
}