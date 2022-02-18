// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mwaa.outputs;

import io.pulumi.awsnative.mwaa.outputs.EnvironmentModuleLoggingConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnvironmentLoggingConfiguration {
    private final @Nullable EnvironmentModuleLoggingConfiguration dagProcessingLogs;
    private final @Nullable EnvironmentModuleLoggingConfiguration schedulerLogs;
    private final @Nullable EnvironmentModuleLoggingConfiguration taskLogs;
    private final @Nullable EnvironmentModuleLoggingConfiguration webserverLogs;
    private final @Nullable EnvironmentModuleLoggingConfiguration workerLogs;

    @OutputCustomType.Constructor({"dagProcessingLogs","schedulerLogs","taskLogs","webserverLogs","workerLogs"})
    private EnvironmentLoggingConfiguration(
        @Nullable EnvironmentModuleLoggingConfiguration dagProcessingLogs,
        @Nullable EnvironmentModuleLoggingConfiguration schedulerLogs,
        @Nullable EnvironmentModuleLoggingConfiguration taskLogs,
        @Nullable EnvironmentModuleLoggingConfiguration webserverLogs,
        @Nullable EnvironmentModuleLoggingConfiguration workerLogs) {
        this.dagProcessingLogs = dagProcessingLogs;
        this.schedulerLogs = schedulerLogs;
        this.taskLogs = taskLogs;
        this.webserverLogs = webserverLogs;
        this.workerLogs = workerLogs;
    }

    public Optional<EnvironmentModuleLoggingConfiguration> getDagProcessingLogs() {
        return Optional.ofNullable(this.dagProcessingLogs);
    }
    public Optional<EnvironmentModuleLoggingConfiguration> getSchedulerLogs() {
        return Optional.ofNullable(this.schedulerLogs);
    }
    public Optional<EnvironmentModuleLoggingConfiguration> getTaskLogs() {
        return Optional.ofNullable(this.taskLogs);
    }
    public Optional<EnvironmentModuleLoggingConfiguration> getWebserverLogs() {
        return Optional.ofNullable(this.webserverLogs);
    }
    public Optional<EnvironmentModuleLoggingConfiguration> getWorkerLogs() {
        return Optional.ofNullable(this.workerLogs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentLoggingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EnvironmentModuleLoggingConfiguration dagProcessingLogs;
        private @Nullable EnvironmentModuleLoggingConfiguration schedulerLogs;
        private @Nullable EnvironmentModuleLoggingConfiguration taskLogs;
        private @Nullable EnvironmentModuleLoggingConfiguration webserverLogs;
        private @Nullable EnvironmentModuleLoggingConfiguration workerLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentLoggingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dagProcessingLogs = defaults.dagProcessingLogs;
    	      this.schedulerLogs = defaults.schedulerLogs;
    	      this.taskLogs = defaults.taskLogs;
    	      this.webserverLogs = defaults.webserverLogs;
    	      this.workerLogs = defaults.workerLogs;
        }

        public Builder setDagProcessingLogs(@Nullable EnvironmentModuleLoggingConfiguration dagProcessingLogs) {
            this.dagProcessingLogs = dagProcessingLogs;
            return this;
        }

        public Builder setSchedulerLogs(@Nullable EnvironmentModuleLoggingConfiguration schedulerLogs) {
            this.schedulerLogs = schedulerLogs;
            return this;
        }

        public Builder setTaskLogs(@Nullable EnvironmentModuleLoggingConfiguration taskLogs) {
            this.taskLogs = taskLogs;
            return this;
        }

        public Builder setWebserverLogs(@Nullable EnvironmentModuleLoggingConfiguration webserverLogs) {
            this.webserverLogs = webserverLogs;
            return this;
        }

        public Builder setWorkerLogs(@Nullable EnvironmentModuleLoggingConfiguration workerLogs) {
            this.workerLogs = workerLogs;
            return this;
        }

        public EnvironmentLoggingConfiguration build() {
            return new EnvironmentLoggingConfiguration(dagProcessingLogs, schedulerLogs, taskLogs, webserverLogs, workerLogs);
        }
    }
}
