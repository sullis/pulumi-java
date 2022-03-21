// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.sagemaker.enums.MonitoringScheduleStatus;
import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleConfigArgs;
import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleMonitoringExecutionSummaryArgs;
import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MonitoringScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringScheduleArgs Empty = new MonitoringScheduleArgs();

    @Import(name="endpointName")
      private final @Nullable Output<String> endpointName;

    public Output<String> getEndpointName() {
        return this.endpointName == null ? Output.empty() : this.endpointName;
    }

    /**
     * Contains the reason a monitoring job failed, if it failed.
     * 
     */
    @Import(name="failureReason")
      private final @Nullable Output<String> failureReason;

    public Output<String> getFailureReason() {
        return this.failureReason == null ? Output.empty() : this.failureReason;
    }

    /**
     * Describes metadata on the last execution to run, if there was one.
     * 
     */
    @Import(name="lastMonitoringExecutionSummary")
      private final @Nullable Output<MonitoringScheduleMonitoringExecutionSummaryArgs> lastMonitoringExecutionSummary;

    public Output<MonitoringScheduleMonitoringExecutionSummaryArgs> getLastMonitoringExecutionSummary() {
        return this.lastMonitoringExecutionSummary == null ? Output.empty() : this.lastMonitoringExecutionSummary;
    }

    @Import(name="monitoringScheduleConfig", required=true)
      private final Output<MonitoringScheduleConfigArgs> monitoringScheduleConfig;

    public Output<MonitoringScheduleConfigArgs> getMonitoringScheduleConfig() {
        return this.monitoringScheduleConfig;
    }

    @Import(name="monitoringScheduleName")
      private final @Nullable Output<String> monitoringScheduleName;

    public Output<String> getMonitoringScheduleName() {
        return this.monitoringScheduleName == null ? Output.empty() : this.monitoringScheduleName;
    }

    /**
     * The status of a schedule job.
     * 
     */
    @Import(name="monitoringScheduleStatus")
      private final @Nullable Output<MonitoringScheduleStatus> monitoringScheduleStatus;

    public Output<MonitoringScheduleStatus> getMonitoringScheduleStatus() {
        return this.monitoringScheduleStatus == null ? Output.empty() : this.monitoringScheduleStatus;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<MonitoringScheduleTagArgs>> tags;

    public Output<List<MonitoringScheduleTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public MonitoringScheduleArgs(
        @Nullable Output<String> endpointName,
        @Nullable Output<String> failureReason,
        @Nullable Output<MonitoringScheduleMonitoringExecutionSummaryArgs> lastMonitoringExecutionSummary,
        Output<MonitoringScheduleConfigArgs> monitoringScheduleConfig,
        @Nullable Output<String> monitoringScheduleName,
        @Nullable Output<MonitoringScheduleStatus> monitoringScheduleStatus,
        @Nullable Output<List<MonitoringScheduleTagArgs>> tags) {
        this.endpointName = endpointName;
        this.failureReason = failureReason;
        this.lastMonitoringExecutionSummary = lastMonitoringExecutionSummary;
        this.monitoringScheduleConfig = Objects.requireNonNull(monitoringScheduleConfig, "expected parameter 'monitoringScheduleConfig' to be non-null");
        this.monitoringScheduleName = monitoringScheduleName;
        this.monitoringScheduleStatus = monitoringScheduleStatus;
        this.tags = tags;
    }

    private MonitoringScheduleArgs() {
        this.endpointName = Output.empty();
        this.failureReason = Output.empty();
        this.lastMonitoringExecutionSummary = Output.empty();
        this.monitoringScheduleConfig = Output.empty();
        this.monitoringScheduleName = Output.empty();
        this.monitoringScheduleStatus = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> endpointName;
        private @Nullable Output<String> failureReason;
        private @Nullable Output<MonitoringScheduleMonitoringExecutionSummaryArgs> lastMonitoringExecutionSummary;
        private Output<MonitoringScheduleConfigArgs> monitoringScheduleConfig;
        private @Nullable Output<String> monitoringScheduleName;
        private @Nullable Output<MonitoringScheduleStatus> monitoringScheduleStatus;
        private @Nullable Output<List<MonitoringScheduleTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointName = defaults.endpointName;
    	      this.failureReason = defaults.failureReason;
    	      this.lastMonitoringExecutionSummary = defaults.lastMonitoringExecutionSummary;
    	      this.monitoringScheduleConfig = defaults.monitoringScheduleConfig;
    	      this.monitoringScheduleName = defaults.monitoringScheduleName;
    	      this.monitoringScheduleStatus = defaults.monitoringScheduleStatus;
    	      this.tags = defaults.tags;
        }

        public Builder endpointName(@Nullable Output<String> endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public Builder endpointName(@Nullable String endpointName) {
            this.endpointName = Output.ofNullable(endpointName);
            return this;
        }
        public Builder failureReason(@Nullable Output<String> failureReason) {
            this.failureReason = failureReason;
            return this;
        }
        public Builder failureReason(@Nullable String failureReason) {
            this.failureReason = Output.ofNullable(failureReason);
            return this;
        }
        public Builder lastMonitoringExecutionSummary(@Nullable Output<MonitoringScheduleMonitoringExecutionSummaryArgs> lastMonitoringExecutionSummary) {
            this.lastMonitoringExecutionSummary = lastMonitoringExecutionSummary;
            return this;
        }
        public Builder lastMonitoringExecutionSummary(@Nullable MonitoringScheduleMonitoringExecutionSummaryArgs lastMonitoringExecutionSummary) {
            this.lastMonitoringExecutionSummary = Output.ofNullable(lastMonitoringExecutionSummary);
            return this;
        }
        public Builder monitoringScheduleConfig(Output<MonitoringScheduleConfigArgs> monitoringScheduleConfig) {
            this.monitoringScheduleConfig = Objects.requireNonNull(monitoringScheduleConfig);
            return this;
        }
        public Builder monitoringScheduleConfig(MonitoringScheduleConfigArgs monitoringScheduleConfig) {
            this.monitoringScheduleConfig = Output.of(Objects.requireNonNull(monitoringScheduleConfig));
            return this;
        }
        public Builder monitoringScheduleName(@Nullable Output<String> monitoringScheduleName) {
            this.monitoringScheduleName = monitoringScheduleName;
            return this;
        }
        public Builder monitoringScheduleName(@Nullable String monitoringScheduleName) {
            this.monitoringScheduleName = Output.ofNullable(monitoringScheduleName);
            return this;
        }
        public Builder monitoringScheduleStatus(@Nullable Output<MonitoringScheduleStatus> monitoringScheduleStatus) {
            this.monitoringScheduleStatus = monitoringScheduleStatus;
            return this;
        }
        public Builder monitoringScheduleStatus(@Nullable MonitoringScheduleStatus monitoringScheduleStatus) {
            this.monitoringScheduleStatus = Output.ofNullable(monitoringScheduleStatus);
            return this;
        }
        public Builder tags(@Nullable Output<List<MonitoringScheduleTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<MonitoringScheduleTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(MonitoringScheduleTagArgs... tags) {
            return tags(List.of(tags));
        }        public MonitoringScheduleArgs build() {
            return new MonitoringScheduleArgs(endpointName, failureReason, lastMonitoringExecutionSummary, monitoringScheduleConfig, monitoringScheduleName, monitoringScheduleStatus, tags);
        }
    }
}
