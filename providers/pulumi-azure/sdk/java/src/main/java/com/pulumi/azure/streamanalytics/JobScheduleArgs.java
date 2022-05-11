// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobScheduleArgs Empty = new JobScheduleArgs();

    /**
     * The starting mode of the Stream Analytics Job. Possible values are `JobStartTime`, `CustomTime` and `LastOutputEventTime`.
     * 
     */
    @Import(name="startMode", required=true)
    private Output<String> startMode;

    /**
     * @return The starting mode of the Stream Analytics Job. Possible values are `JobStartTime`, `CustomTime` and `LastOutputEventTime`.
     * 
     */
    public Output<String> startMode() {
        return this.startMode;
    }

    /**
     * The time in ISO8601 format at which the Stream Analytics Job should be started e.g. `2022-04-01T00:00:00Z`. This property can only be specified if `start_mode` is set to `CustomTime`
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return The time in ISO8601 format at which the Stream Analytics Job should be started e.g. `2022-04-01T00:00:00Z`. This property can only be specified if `start_mode` is set to `CustomTime`
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * The ID of the Stream Analytics Job that should be scheduled or started. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="streamAnalyticsJobId", required=true)
    private Output<String> streamAnalyticsJobId;

    /**
     * @return The ID of the Stream Analytics Job that should be scheduled or started. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> streamAnalyticsJobId() {
        return this.streamAnalyticsJobId;
    }

    private JobScheduleArgs() {}

    private JobScheduleArgs(JobScheduleArgs $) {
        this.startMode = $.startMode;
        this.startTime = $.startTime;
        this.streamAnalyticsJobId = $.streamAnalyticsJobId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobScheduleArgs $;

        public Builder() {
            $ = new JobScheduleArgs();
        }

        public Builder(JobScheduleArgs defaults) {
            $ = new JobScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param startMode The starting mode of the Stream Analytics Job. Possible values are `JobStartTime`, `CustomTime` and `LastOutputEventTime`.
         * 
         * @return builder
         * 
         */
        public Builder startMode(Output<String> startMode) {
            $.startMode = startMode;
            return this;
        }

        /**
         * @param startMode The starting mode of the Stream Analytics Job. Possible values are `JobStartTime`, `CustomTime` and `LastOutputEventTime`.
         * 
         * @return builder
         * 
         */
        public Builder startMode(String startMode) {
            return startMode(Output.of(startMode));
        }

        /**
         * @param startTime The time in ISO8601 format at which the Stream Analytics Job should be started e.g. `2022-04-01T00:00:00Z`. This property can only be specified if `start_mode` is set to `CustomTime`
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime The time in ISO8601 format at which the Stream Analytics Job should be started e.g. `2022-04-01T00:00:00Z`. This property can only be specified if `start_mode` is set to `CustomTime`
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param streamAnalyticsJobId The ID of the Stream Analytics Job that should be scheduled or started. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobId(Output<String> streamAnalyticsJobId) {
            $.streamAnalyticsJobId = streamAnalyticsJobId;
            return this;
        }

        /**
         * @param streamAnalyticsJobId The ID of the Stream Analytics Job that should be scheduled or started. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobId(String streamAnalyticsJobId) {
            return streamAnalyticsJobId(Output.of(streamAnalyticsJobId));
        }

        public JobScheduleArgs build() {
            $.startMode = Objects.requireNonNull($.startMode, "expected parameter 'startMode' to be non-null");
            $.streamAnalyticsJobId = Objects.requireNonNull($.streamAnalyticsJobId, "expected parameter 'streamAnalyticsJobId' to be non-null");
            return $;
        }
    }

}
