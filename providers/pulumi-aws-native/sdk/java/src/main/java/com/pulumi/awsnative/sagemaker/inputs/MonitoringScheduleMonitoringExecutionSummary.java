// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.enums.MonitoringScheduleMonitoringExecutionSummaryMonitoringExecutionStatus;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Summary of information about monitoring job
 * 
 */
public final class MonitoringScheduleMonitoringExecutionSummary extends com.pulumi.resources.InvokeArgs {

    public static final MonitoringScheduleMonitoringExecutionSummary Empty = new MonitoringScheduleMonitoringExecutionSummary();

    /**
     * The time at which the monitoring job was created.
     * 
     */
    @Import(name="creationTime", required=true)
    private String creationTime;

    /**
     * @return The time at which the monitoring job was created.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }

    @Import(name="endpointName")
    private @Nullable String endpointName;

    public Optional<String> endpointName() {
        return Optional.ofNullable(this.endpointName);
    }

    /**
     * Contains the reason a monitoring job failed, if it failed.
     * 
     */
    @Import(name="failureReason")
    private @Nullable String failureReason;

    /**
     * @return Contains the reason a monitoring job failed, if it failed.
     * 
     */
    public Optional<String> failureReason() {
        return Optional.ofNullable(this.failureReason);
    }

    /**
     * A timestamp that indicates the last time the monitoring job was modified.
     * 
     */
    @Import(name="lastModifiedTime", required=true)
    private String lastModifiedTime;

    /**
     * @return A timestamp that indicates the last time the monitoring job was modified.
     * 
     */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * The status of the monitoring job.
     * 
     */
    @Import(name="monitoringExecutionStatus", required=true)
    private MonitoringScheduleMonitoringExecutionSummaryMonitoringExecutionStatus monitoringExecutionStatus;

    /**
     * @return The status of the monitoring job.
     * 
     */
    public MonitoringScheduleMonitoringExecutionSummaryMonitoringExecutionStatus monitoringExecutionStatus() {
        return this.monitoringExecutionStatus;
    }

    @Import(name="monitoringScheduleName", required=true)
    private String monitoringScheduleName;

    public String monitoringScheduleName() {
        return this.monitoringScheduleName;
    }

    /**
     * The Amazon Resource Name (ARN) of the monitoring job.
     * 
     */
    @Import(name="processingJobArn")
    private @Nullable String processingJobArn;

    /**
     * @return The Amazon Resource Name (ARN) of the monitoring job.
     * 
     */
    public Optional<String> processingJobArn() {
        return Optional.ofNullable(this.processingJobArn);
    }

    /**
     * The time the monitoring job was scheduled.
     * 
     */
    @Import(name="scheduledTime", required=true)
    private String scheduledTime;

    /**
     * @return The time the monitoring job was scheduled.
     * 
     */
    public String scheduledTime() {
        return this.scheduledTime;
    }

    private MonitoringScheduleMonitoringExecutionSummary() {}

    private MonitoringScheduleMonitoringExecutionSummary(MonitoringScheduleMonitoringExecutionSummary $) {
        this.creationTime = $.creationTime;
        this.endpointName = $.endpointName;
        this.failureReason = $.failureReason;
        this.lastModifiedTime = $.lastModifiedTime;
        this.monitoringExecutionStatus = $.monitoringExecutionStatus;
        this.monitoringScheduleName = $.monitoringScheduleName;
        this.processingJobArn = $.processingJobArn;
        this.scheduledTime = $.scheduledTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoringScheduleMonitoringExecutionSummary defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringScheduleMonitoringExecutionSummary $;

        public Builder() {
            $ = new MonitoringScheduleMonitoringExecutionSummary();
        }

        public Builder(MonitoringScheduleMonitoringExecutionSummary defaults) {
            $ = new MonitoringScheduleMonitoringExecutionSummary(Objects.requireNonNull(defaults));
        }

        /**
         * @param creationTime The time at which the monitoring job was created.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(String creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        public Builder endpointName(@Nullable String endpointName) {
            $.endpointName = endpointName;
            return this;
        }

        /**
         * @param failureReason Contains the reason a monitoring job failed, if it failed.
         * 
         * @return builder
         * 
         */
        public Builder failureReason(@Nullable String failureReason) {
            $.failureReason = failureReason;
            return this;
        }

        /**
         * @param lastModifiedTime A timestamp that indicates the last time the monitoring job was modified.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            $.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * @param monitoringExecutionStatus The status of the monitoring job.
         * 
         * @return builder
         * 
         */
        public Builder monitoringExecutionStatus(MonitoringScheduleMonitoringExecutionSummaryMonitoringExecutionStatus monitoringExecutionStatus) {
            $.monitoringExecutionStatus = monitoringExecutionStatus;
            return this;
        }

        public Builder monitoringScheduleName(String monitoringScheduleName) {
            $.monitoringScheduleName = monitoringScheduleName;
            return this;
        }

        /**
         * @param processingJobArn The Amazon Resource Name (ARN) of the monitoring job.
         * 
         * @return builder
         * 
         */
        public Builder processingJobArn(@Nullable String processingJobArn) {
            $.processingJobArn = processingJobArn;
            return this;
        }

        /**
         * @param scheduledTime The time the monitoring job was scheduled.
         * 
         * @return builder
         * 
         */
        public Builder scheduledTime(String scheduledTime) {
            $.scheduledTime = scheduledTime;
            return this;
        }

        public MonitoringScheduleMonitoringExecutionSummary build() {
            $.creationTime = Objects.requireNonNull($.creationTime, "expected parameter 'creationTime' to be non-null");
            $.lastModifiedTime = Objects.requireNonNull($.lastModifiedTime, "expected parameter 'lastModifiedTime' to be non-null");
            $.monitoringExecutionStatus = Objects.requireNonNull($.monitoringExecutionStatus, "expected parameter 'monitoringExecutionStatus' to be non-null");
            $.monitoringScheduleName = Objects.requireNonNull($.monitoringScheduleName, "expected parameter 'monitoringScheduleName' to be non-null");
            $.scheduledTime = Objects.requireNonNull($.scheduledTime, "expected parameter 'scheduledTime' to be non-null");
            return $;
        }
    }

}
