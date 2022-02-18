// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerTriggerScheduleArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionJobTriggerTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerTriggerArgs Empty = new PreventionJobTriggerTriggerArgs();

    /**
     * Schedule for triggered jobs
     * Structure is documented below.
     * 
     */
    @InputImport(name="schedule")
    private final @Nullable Input<PreventionJobTriggerTriggerScheduleArgs> schedule;

    public Input<PreventionJobTriggerTriggerScheduleArgs> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    public PreventionJobTriggerTriggerArgs(@Nullable Input<PreventionJobTriggerTriggerScheduleArgs> schedule) {
        this.schedule = schedule;
    }

    private PreventionJobTriggerTriggerArgs() {
        this.schedule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PreventionJobTriggerTriggerScheduleArgs> schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedule = defaults.schedule;
        }

        public Builder setSchedule(@Nullable Input<PreventionJobTriggerTriggerScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setSchedule(@Nullable PreventionJobTriggerTriggerScheduleArgs schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public PreventionJobTriggerTriggerArgs build() {
            return new PreventionJobTriggerTriggerArgs(schedule);
        }
    }
}
