// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker;

import com.pulumi.awsnative.sagemaker.enums.MonitoringScheduleStatus;
import com.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleConfigArgs;
import com.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleMonitoringExecutionSummaryArgs;
import com.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitoringScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitoringScheduleArgs Empty = new MonitoringScheduleArgs();

    @Import(name="endpointName")
    private @Nullable Output<String> endpointName;

    public Optional<Output<String>> endpointName() {
        return Optional.ofNullable(this.endpointName);
    }

    /**
     * Contains the reason a monitoring job failed, if it failed.
     * 
     */
    @Import(name="failureReason")
    private @Nullable Output<String> failureReason;

    /**
     * @return Contains the reason a monitoring job failed, if it failed.
     * 
     */
    public Optional<Output<String>> failureReason() {
        return Optional.ofNullable(this.failureReason);
    }

    /**
     * Describes metadata on the last execution to run, if there was one.
     * 
     */
    @Import(name="lastMonitoringExecutionSummary")
    private @Nullable Output<MonitoringScheduleMonitoringExecutionSummaryArgs> lastMonitoringExecutionSummary;

    /**
     * @return Describes metadata on the last execution to run, if there was one.
     * 
     */
    public Optional<Output<MonitoringScheduleMonitoringExecutionSummaryArgs>> lastMonitoringExecutionSummary() {
        return Optional.ofNullable(this.lastMonitoringExecutionSummary);
    }

    @Import(name="monitoringScheduleConfig", required=true)
    private Output<MonitoringScheduleConfigArgs> monitoringScheduleConfig;

    public Output<MonitoringScheduleConfigArgs> monitoringScheduleConfig() {
        return this.monitoringScheduleConfig;
    }

    @Import(name="monitoringScheduleName")
    private @Nullable Output<String> monitoringScheduleName;

    public Optional<Output<String>> monitoringScheduleName() {
        return Optional.ofNullable(this.monitoringScheduleName);
    }

    /**
     * The status of a schedule job.
     * 
     */
    @Import(name="monitoringScheduleStatus")
    private @Nullable Output<MonitoringScheduleStatus> monitoringScheduleStatus;

    /**
     * @return The status of a schedule job.
     * 
     */
    public Optional<Output<MonitoringScheduleStatus>> monitoringScheduleStatus() {
        return Optional.ofNullable(this.monitoringScheduleStatus);
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<MonitoringScheduleTagArgs>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Optional<Output<List<MonitoringScheduleTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private MonitoringScheduleArgs() {}

    private MonitoringScheduleArgs(MonitoringScheduleArgs $) {
        this.endpointName = $.endpointName;
        this.failureReason = $.failureReason;
        this.lastMonitoringExecutionSummary = $.lastMonitoringExecutionSummary;
        this.monitoringScheduleConfig = $.monitoringScheduleConfig;
        this.monitoringScheduleName = $.monitoringScheduleName;
        this.monitoringScheduleStatus = $.monitoringScheduleStatus;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoringScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringScheduleArgs $;

        public Builder() {
            $ = new MonitoringScheduleArgs();
        }

        public Builder(MonitoringScheduleArgs defaults) {
            $ = new MonitoringScheduleArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpointName(@Nullable Output<String> endpointName) {
            $.endpointName = endpointName;
            return this;
        }

        public Builder endpointName(String endpointName) {
            return endpointName(Output.of(endpointName));
        }

        /**
         * @param failureReason Contains the reason a monitoring job failed, if it failed.
         * 
         * @return builder
         * 
         */
        public Builder failureReason(@Nullable Output<String> failureReason) {
            $.failureReason = failureReason;
            return this;
        }

        /**
         * @param failureReason Contains the reason a monitoring job failed, if it failed.
         * 
         * @return builder
         * 
         */
        public Builder failureReason(String failureReason) {
            return failureReason(Output.of(failureReason));
        }

        /**
         * @param lastMonitoringExecutionSummary Describes metadata on the last execution to run, if there was one.
         * 
         * @return builder
         * 
         */
        public Builder lastMonitoringExecutionSummary(@Nullable Output<MonitoringScheduleMonitoringExecutionSummaryArgs> lastMonitoringExecutionSummary) {
            $.lastMonitoringExecutionSummary = lastMonitoringExecutionSummary;
            return this;
        }

        /**
         * @param lastMonitoringExecutionSummary Describes metadata on the last execution to run, if there was one.
         * 
         * @return builder
         * 
         */
        public Builder lastMonitoringExecutionSummary(MonitoringScheduleMonitoringExecutionSummaryArgs lastMonitoringExecutionSummary) {
            return lastMonitoringExecutionSummary(Output.of(lastMonitoringExecutionSummary));
        }

        public Builder monitoringScheduleConfig(Output<MonitoringScheduleConfigArgs> monitoringScheduleConfig) {
            $.monitoringScheduleConfig = monitoringScheduleConfig;
            return this;
        }

        public Builder monitoringScheduleConfig(MonitoringScheduleConfigArgs monitoringScheduleConfig) {
            return monitoringScheduleConfig(Output.of(monitoringScheduleConfig));
        }

        public Builder monitoringScheduleName(@Nullable Output<String> monitoringScheduleName) {
            $.monitoringScheduleName = monitoringScheduleName;
            return this;
        }

        public Builder monitoringScheduleName(String monitoringScheduleName) {
            return monitoringScheduleName(Output.of(monitoringScheduleName));
        }

        /**
         * @param monitoringScheduleStatus The status of a schedule job.
         * 
         * @return builder
         * 
         */
        public Builder monitoringScheduleStatus(@Nullable Output<MonitoringScheduleStatus> monitoringScheduleStatus) {
            $.monitoringScheduleStatus = monitoringScheduleStatus;
            return this;
        }

        /**
         * @param monitoringScheduleStatus The status of a schedule job.
         * 
         * @return builder
         * 
         */
        public Builder monitoringScheduleStatus(MonitoringScheduleStatus monitoringScheduleStatus) {
            return monitoringScheduleStatus(Output.of(monitoringScheduleStatus));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<MonitoringScheduleTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<MonitoringScheduleTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(MonitoringScheduleTagArgs... tags) {
            return tags(List.of(tags));
        }

        public MonitoringScheduleArgs build() {
            $.monitoringScheduleConfig = Objects.requireNonNull($.monitoringScheduleConfig, "expected parameter 'monitoringScheduleConfig' to be non-null");
            return $;
        }
    }

}
