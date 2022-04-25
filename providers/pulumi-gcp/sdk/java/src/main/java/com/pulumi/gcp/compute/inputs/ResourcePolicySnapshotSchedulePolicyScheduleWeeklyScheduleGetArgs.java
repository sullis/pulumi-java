// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekGetArgs;
import java.util.List;
import java.util.Objects;


public final class ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleGetArgs Empty = new ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleGetArgs();

    /**
     * May contain up to seven (one for each day of the week) snapshot times.
     * Structure is documented below.
     * 
     */
    @Import(name="dayOfWeeks", required=true)
    private Output<List<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekGetArgs>> dayOfWeeks;

    /**
     * @return May contain up to seven (one for each day of the week) snapshot times.
     * Structure is documented below.
     * 
     */
    public Output<List<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekGetArgs>> dayOfWeeks() {
        return this.dayOfWeeks;
    }

    private ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleGetArgs() {}

    private ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleGetArgs(ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleGetArgs $) {
        this.dayOfWeeks = $.dayOfWeeks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleGetArgs $;

        public Builder() {
            $ = new ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleGetArgs();
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleGetArgs defaults) {
            $ = new ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dayOfWeeks May contain up to seven (one for each day of the week) snapshot times.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeeks(Output<List<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekGetArgs>> dayOfWeeks) {
            $.dayOfWeeks = dayOfWeeks;
            return this;
        }

        /**
         * @param dayOfWeeks May contain up to seven (one for each day of the week) snapshot times.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeeks(List<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekGetArgs> dayOfWeeks) {
            return dayOfWeeks(Output.of(dayOfWeeks));
        }

        /**
         * @param dayOfWeeks May contain up to seven (one for each day of the week) snapshot times.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeeks(ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekGetArgs... dayOfWeeks) {
            return dayOfWeeks(List.of(dayOfWeeks));
        }

        public ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleGetArgs build() {
            $.dayOfWeeks = Objects.requireNonNull($.dayOfWeeks, "expected parameter 'dayOfWeeks' to be non-null");
            return $;
        }
    }

}
