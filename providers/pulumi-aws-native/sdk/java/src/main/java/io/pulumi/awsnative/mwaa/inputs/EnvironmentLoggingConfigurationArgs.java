// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mwaa.inputs;

import io.pulumi.awsnative.mwaa.inputs.EnvironmentModuleLoggingConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentLoggingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentLoggingConfigurationArgs Empty = new EnvironmentLoggingConfigurationArgs();

    @InputImport(name="dagProcessingLogs")
    private final @Nullable Input<EnvironmentModuleLoggingConfigurationArgs> dagProcessingLogs;

    public Input<EnvironmentModuleLoggingConfigurationArgs> getDagProcessingLogs() {
        return this.dagProcessingLogs == null ? Input.empty() : this.dagProcessingLogs;
    }

    @InputImport(name="schedulerLogs")
    private final @Nullable Input<EnvironmentModuleLoggingConfigurationArgs> schedulerLogs;

    public Input<EnvironmentModuleLoggingConfigurationArgs> getSchedulerLogs() {
        return this.schedulerLogs == null ? Input.empty() : this.schedulerLogs;
    }

    @InputImport(name="taskLogs")
    private final @Nullable Input<EnvironmentModuleLoggingConfigurationArgs> taskLogs;

    public Input<EnvironmentModuleLoggingConfigurationArgs> getTaskLogs() {
        return this.taskLogs == null ? Input.empty() : this.taskLogs;
    }

    @InputImport(name="webserverLogs")
    private final @Nullable Input<EnvironmentModuleLoggingConfigurationArgs> webserverLogs;

    public Input<EnvironmentModuleLoggingConfigurationArgs> getWebserverLogs() {
        return this.webserverLogs == null ? Input.empty() : this.webserverLogs;
    }

    @InputImport(name="workerLogs")
    private final @Nullable Input<EnvironmentModuleLoggingConfigurationArgs> workerLogs;

    public Input<EnvironmentModuleLoggingConfigurationArgs> getWorkerLogs() {
        return this.workerLogs == null ? Input.empty() : this.workerLogs;
    }

    public EnvironmentLoggingConfigurationArgs(
        @Nullable Input<EnvironmentModuleLoggingConfigurationArgs> dagProcessingLogs,
        @Nullable Input<EnvironmentModuleLoggingConfigurationArgs> schedulerLogs,
        @Nullable Input<EnvironmentModuleLoggingConfigurationArgs> taskLogs,
        @Nullable Input<EnvironmentModuleLoggingConfigurationArgs> webserverLogs,
        @Nullable Input<EnvironmentModuleLoggingConfigurationArgs> workerLogs) {
        this.dagProcessingLogs = dagProcessingLogs;
        this.schedulerLogs = schedulerLogs;
        this.taskLogs = taskLogs;
        this.webserverLogs = webserverLogs;
        this.workerLogs = workerLogs;
    }

    private EnvironmentLoggingConfigurationArgs() {
        this.dagProcessingLogs = Input.empty();
        this.schedulerLogs = Input.empty();
        this.taskLogs = Input.empty();
        this.webserverLogs = Input.empty();
        this.workerLogs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentLoggingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EnvironmentModuleLoggingConfigurationArgs> dagProcessingLogs;
        private @Nullable Input<EnvironmentModuleLoggingConfigurationArgs> schedulerLogs;
        private @Nullable Input<EnvironmentModuleLoggingConfigurationArgs> taskLogs;
        private @Nullable Input<EnvironmentModuleLoggingConfigurationArgs> webserverLogs;
        private @Nullable Input<EnvironmentModuleLoggingConfigurationArgs> workerLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentLoggingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dagProcessingLogs = defaults.dagProcessingLogs;
    	      this.schedulerLogs = defaults.schedulerLogs;
    	      this.taskLogs = defaults.taskLogs;
    	      this.webserverLogs = defaults.webserverLogs;
    	      this.workerLogs = defaults.workerLogs;
        }

        public Builder setDagProcessingLogs(@Nullable Input<EnvironmentModuleLoggingConfigurationArgs> dagProcessingLogs) {
            this.dagProcessingLogs = dagProcessingLogs;
            return this;
        }

        public Builder setDagProcessingLogs(@Nullable EnvironmentModuleLoggingConfigurationArgs dagProcessingLogs) {
            this.dagProcessingLogs = Input.ofNullable(dagProcessingLogs);
            return this;
        }

        public Builder setSchedulerLogs(@Nullable Input<EnvironmentModuleLoggingConfigurationArgs> schedulerLogs) {
            this.schedulerLogs = schedulerLogs;
            return this;
        }

        public Builder setSchedulerLogs(@Nullable EnvironmentModuleLoggingConfigurationArgs schedulerLogs) {
            this.schedulerLogs = Input.ofNullable(schedulerLogs);
            return this;
        }

        public Builder setTaskLogs(@Nullable Input<EnvironmentModuleLoggingConfigurationArgs> taskLogs) {
            this.taskLogs = taskLogs;
            return this;
        }

        public Builder setTaskLogs(@Nullable EnvironmentModuleLoggingConfigurationArgs taskLogs) {
            this.taskLogs = Input.ofNullable(taskLogs);
            return this;
        }

        public Builder setWebserverLogs(@Nullable Input<EnvironmentModuleLoggingConfigurationArgs> webserverLogs) {
            this.webserverLogs = webserverLogs;
            return this;
        }

        public Builder setWebserverLogs(@Nullable EnvironmentModuleLoggingConfigurationArgs webserverLogs) {
            this.webserverLogs = Input.ofNullable(webserverLogs);
            return this;
        }

        public Builder setWorkerLogs(@Nullable Input<EnvironmentModuleLoggingConfigurationArgs> workerLogs) {
            this.workerLogs = workerLogs;
            return this;
        }

        public Builder setWorkerLogs(@Nullable EnvironmentModuleLoggingConfigurationArgs workerLogs) {
            this.workerLogs = Input.ofNullable(workerLogs);
            return this;
        }

        public EnvironmentLoggingConfigurationArgs build() {
            return new EnvironmentLoggingConfigurationArgs(dagProcessingLogs, schedulerLogs, taskLogs, webserverLogs, workerLogs);
        }
    }
}
