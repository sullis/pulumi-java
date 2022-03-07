// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.enums.MonitoringScheduleMonitoringExecutionSummaryMonitoringExecutionStatus;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Summary of information about monitoring job
 * 
 */
public final class MonitoringScheduleMonitoringExecutionSummaryArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringScheduleMonitoringExecutionSummaryArgs Empty = new MonitoringScheduleMonitoringExecutionSummaryArgs();

    /**
     * The time at which the monitoring job was created.
     * 
     */
    @InputImport(name="creationTime", required=true)
      private final Input<String> creationTime;

    public Input<String> getCreationTime() {
        return this.creationTime;
    }

    @InputImport(name="endpointName")
      private final @Nullable Input<String> endpointName;

    public Input<String> getEndpointName() {
        return this.endpointName == null ? Input.empty() : this.endpointName;
    }

    /**
     * Contains the reason a monitoring job failed, if it failed.
     * 
     */
    @InputImport(name="failureReason")
      private final @Nullable Input<String> failureReason;

    public Input<String> getFailureReason() {
        return this.failureReason == null ? Input.empty() : this.failureReason;
    }

    /**
     * A timestamp that indicates the last time the monitoring job was modified.
     * 
     */
    @InputImport(name="lastModifiedTime", required=true)
      private final Input<String> lastModifiedTime;

    public Input<String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * The status of the monitoring job.
     * 
     */
    @InputImport(name="monitoringExecutionStatus", required=true)
      private final Input<MonitoringScheduleMonitoringExecutionSummaryMonitoringExecutionStatus> monitoringExecutionStatus;

    public Input<MonitoringScheduleMonitoringExecutionSummaryMonitoringExecutionStatus> getMonitoringExecutionStatus() {
        return this.monitoringExecutionStatus;
    }

    @InputImport(name="monitoringScheduleName", required=true)
      private final Input<String> monitoringScheduleName;

    public Input<String> getMonitoringScheduleName() {
        return this.monitoringScheduleName;
    }

    /**
     * The Amazon Resource Name (ARN) of the monitoring job.
     * 
     */
    @InputImport(name="processingJobArn")
      private final @Nullable Input<String> processingJobArn;

    public Input<String> getProcessingJobArn() {
        return this.processingJobArn == null ? Input.empty() : this.processingJobArn;
    }

    /**
     * The time the monitoring job was scheduled.
     * 
     */
    @InputImport(name="scheduledTime", required=true)
      private final Input<String> scheduledTime;

    public Input<String> getScheduledTime() {
        return this.scheduledTime;
    }

    public MonitoringScheduleMonitoringExecutionSummaryArgs(
        Input<String> creationTime,
        @Nullable Input<String> endpointName,
        @Nullable Input<String> failureReason,
        Input<String> lastModifiedTime,
        Input<MonitoringScheduleMonitoringExecutionSummaryMonitoringExecutionStatus> monitoringExecutionStatus,
        Input<String> monitoringScheduleName,
        @Nullable Input<String> processingJobArn,
        Input<String> scheduledTime) {
        this.creationTime = Objects.requireNonNull(creationTime, "expected parameter 'creationTime' to be non-null");
        this.endpointName = endpointName;
        this.failureReason = failureReason;
        this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime, "expected parameter 'lastModifiedTime' to be non-null");
        this.monitoringExecutionStatus = Objects.requireNonNull(monitoringExecutionStatus, "expected parameter 'monitoringExecutionStatus' to be non-null");
        this.monitoringScheduleName = Objects.requireNonNull(monitoringScheduleName, "expected parameter 'monitoringScheduleName' to be non-null");
        this.processingJobArn = processingJobArn;
        this.scheduledTime = Objects.requireNonNull(scheduledTime, "expected parameter 'scheduledTime' to be non-null");
    }

    private MonitoringScheduleMonitoringExecutionSummaryArgs() {
        this.creationTime = Input.empty();
        this.endpointName = Input.empty();
        this.failureReason = Input.empty();
        this.lastModifiedTime = Input.empty();
        this.monitoringExecutionStatus = Input.empty();
        this.monitoringScheduleName = Input.empty();
        this.processingJobArn = Input.empty();
        this.scheduledTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleMonitoringExecutionSummaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> creationTime;
        private @Nullable Input<String> endpointName;
        private @Nullable Input<String> failureReason;
        private Input<String> lastModifiedTime;
        private Input<MonitoringScheduleMonitoringExecutionSummaryMonitoringExecutionStatus> monitoringExecutionStatus;
        private Input<String> monitoringScheduleName;
        private @Nullable Input<String> processingJobArn;
        private Input<String> scheduledTime;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleMonitoringExecutionSummaryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.endpointName = defaults.endpointName;
    	      this.failureReason = defaults.failureReason;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.monitoringExecutionStatus = defaults.monitoringExecutionStatus;
    	      this.monitoringScheduleName = defaults.monitoringScheduleName;
    	      this.processingJobArn = defaults.processingJobArn;
    	      this.scheduledTime = defaults.scheduledTime;
        }

        public Builder setCreationTime(Input<String> creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder setCreationTime(String creationTime) {
            this.creationTime = Input.of(Objects.requireNonNull(creationTime));
            return this;
        }

        public Builder setEndpointName(@Nullable Input<String> endpointName) {
            this.endpointName = endpointName;
            return this;
        }

        public Builder setEndpointName(@Nullable String endpointName) {
            this.endpointName = Input.ofNullable(endpointName);
            return this;
        }

        public Builder setFailureReason(@Nullable Input<String> failureReason) {
            this.failureReason = failureReason;
            return this;
        }

        public Builder setFailureReason(@Nullable String failureReason) {
            this.failureReason = Input.ofNullable(failureReason);
            return this;
        }

        public Builder setLastModifiedTime(Input<String> lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }

        public Builder setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Input.of(Objects.requireNonNull(lastModifiedTime));
            return this;
        }

        public Builder setMonitoringExecutionStatus(Input<MonitoringScheduleMonitoringExecutionSummaryMonitoringExecutionStatus> monitoringExecutionStatus) {
            this.monitoringExecutionStatus = Objects.requireNonNull(monitoringExecutionStatus);
            return this;
        }

        public Builder setMonitoringExecutionStatus(MonitoringScheduleMonitoringExecutionSummaryMonitoringExecutionStatus monitoringExecutionStatus) {
            this.monitoringExecutionStatus = Input.of(Objects.requireNonNull(monitoringExecutionStatus));
            return this;
        }

        public Builder setMonitoringScheduleName(Input<String> monitoringScheduleName) {
            this.monitoringScheduleName = Objects.requireNonNull(monitoringScheduleName);
            return this;
        }

        public Builder setMonitoringScheduleName(String monitoringScheduleName) {
            this.monitoringScheduleName = Input.of(Objects.requireNonNull(monitoringScheduleName));
            return this;
        }

        public Builder setProcessingJobArn(@Nullable Input<String> processingJobArn) {
            this.processingJobArn = processingJobArn;
            return this;
        }

        public Builder setProcessingJobArn(@Nullable String processingJobArn) {
            this.processingJobArn = Input.ofNullable(processingJobArn);
            return this;
        }

        public Builder setScheduledTime(Input<String> scheduledTime) {
            this.scheduledTime = Objects.requireNonNull(scheduledTime);
            return this;
        }

        public Builder setScheduledTime(String scheduledTime) {
            this.scheduledTime = Input.of(Objects.requireNonNull(scheduledTime));
            return this;
        }
        public MonitoringScheduleMonitoringExecutionSummaryArgs build() {
            return new MonitoringScheduleMonitoringExecutionSummaryArgs(creationTime, endpointName, failureReason, lastModifiedTime, monitoringExecutionStatus, monitoringScheduleName, processingJobArn, scheduledTime);
        }
    }
}