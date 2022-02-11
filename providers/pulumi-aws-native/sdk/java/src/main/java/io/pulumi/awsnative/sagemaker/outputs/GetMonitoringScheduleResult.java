// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.enums.MonitoringScheduleStatus;
import io.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleConfig;
import io.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleMonitoringExecutionSummary;
import io.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMonitoringScheduleResult {
    private final @Nullable String creationTime;
    private final @Nullable String endpointName;
    private final @Nullable String failureReason;
    private final @Nullable String lastModifiedTime;
    private final @Nullable MonitoringScheduleMonitoringExecutionSummary lastMonitoringExecutionSummary;
    private final @Nullable String monitoringScheduleArn;
    private final @Nullable MonitoringScheduleConfig monitoringScheduleConfig;
    private final @Nullable MonitoringScheduleStatus monitoringScheduleStatus;
    private final @Nullable List<MonitoringScheduleTag> tags;

    @OutputCustomType.Constructor({"creationTime","endpointName","failureReason","lastModifiedTime","lastMonitoringExecutionSummary","monitoringScheduleArn","monitoringScheduleConfig","monitoringScheduleStatus","tags"})
    private GetMonitoringScheduleResult(
        @Nullable String creationTime,
        @Nullable String endpointName,
        @Nullable String failureReason,
        @Nullable String lastModifiedTime,
        @Nullable MonitoringScheduleMonitoringExecutionSummary lastMonitoringExecutionSummary,
        @Nullable String monitoringScheduleArn,
        @Nullable MonitoringScheduleConfig monitoringScheduleConfig,
        @Nullable MonitoringScheduleStatus monitoringScheduleStatus,
        @Nullable List<MonitoringScheduleTag> tags) {
        this.creationTime = creationTime;
        this.endpointName = endpointName;
        this.failureReason = failureReason;
        this.lastModifiedTime = lastModifiedTime;
        this.lastMonitoringExecutionSummary = lastMonitoringExecutionSummary;
        this.monitoringScheduleArn = monitoringScheduleArn;
        this.monitoringScheduleConfig = monitoringScheduleConfig;
        this.monitoringScheduleStatus = monitoringScheduleStatus;
        this.tags = tags;
    }

    public Optional<String> getCreationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    public Optional<String> getEndpointName() {
        return Optional.ofNullable(this.endpointName);
    }
    public Optional<String> getFailureReason() {
        return Optional.ofNullable(this.failureReason);
    }
    public Optional<String> getLastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }
    public Optional<MonitoringScheduleMonitoringExecutionSummary> getLastMonitoringExecutionSummary() {
        return Optional.ofNullable(this.lastMonitoringExecutionSummary);
    }
    public Optional<String> getMonitoringScheduleArn() {
        return Optional.ofNullable(this.monitoringScheduleArn);
    }
    public Optional<MonitoringScheduleConfig> getMonitoringScheduleConfig() {
        return Optional.ofNullable(this.monitoringScheduleConfig);
    }
    public Optional<MonitoringScheduleStatus> getMonitoringScheduleStatus() {
        return Optional.ofNullable(this.monitoringScheduleStatus);
    }
    public List<MonitoringScheduleTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMonitoringScheduleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String creationTime;
        private @Nullable String endpointName;
        private @Nullable String failureReason;
        private @Nullable String lastModifiedTime;
        private @Nullable MonitoringScheduleMonitoringExecutionSummary lastMonitoringExecutionSummary;
        private @Nullable String monitoringScheduleArn;
        private @Nullable MonitoringScheduleConfig monitoringScheduleConfig;
        private @Nullable MonitoringScheduleStatus monitoringScheduleStatus;
        private @Nullable List<MonitoringScheduleTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMonitoringScheduleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.endpointName = defaults.endpointName;
    	      this.failureReason = defaults.failureReason;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.lastMonitoringExecutionSummary = defaults.lastMonitoringExecutionSummary;
    	      this.monitoringScheduleArn = defaults.monitoringScheduleArn;
    	      this.monitoringScheduleConfig = defaults.monitoringScheduleConfig;
    	      this.monitoringScheduleStatus = defaults.monitoringScheduleStatus;
    	      this.tags = defaults.tags;
        }

        public Builder setCreationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setEndpointName(@Nullable String endpointName) {
            this.endpointName = endpointName;
            return this;
        }

        public Builder setFailureReason(@Nullable String failureReason) {
            this.failureReason = failureReason;
            return this;
        }

        public Builder setLastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        public Builder setLastMonitoringExecutionSummary(@Nullable MonitoringScheduleMonitoringExecutionSummary lastMonitoringExecutionSummary) {
            this.lastMonitoringExecutionSummary = lastMonitoringExecutionSummary;
            return this;
        }

        public Builder setMonitoringScheduleArn(@Nullable String monitoringScheduleArn) {
            this.monitoringScheduleArn = monitoringScheduleArn;
            return this;
        }

        public Builder setMonitoringScheduleConfig(@Nullable MonitoringScheduleConfig monitoringScheduleConfig) {
            this.monitoringScheduleConfig = monitoringScheduleConfig;
            return this;
        }

        public Builder setMonitoringScheduleStatus(@Nullable MonitoringScheduleStatus monitoringScheduleStatus) {
            this.monitoringScheduleStatus = monitoringScheduleStatus;
            return this;
        }

        public Builder setTags(@Nullable List<MonitoringScheduleTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetMonitoringScheduleResult build() {
            return new GetMonitoringScheduleResult(creationTime, endpointName, failureReason, lastModifiedTime, lastMonitoringExecutionSummary, monitoringScheduleArn, monitoringScheduleConfig, monitoringScheduleStatus, tags);
        }
    }
}
