// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.OverrideTaskStepPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters for a task run request.
 * 
 */
public final class TaskRunRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskRunRequestArgs Empty = new TaskRunRequestArgs();

    /**
     * The dedicated agent pool for the run.
     * 
     */
    @InputImport(name="agentPoolName")
      private final @Nullable Input<String> agentPoolName;

    public Input<String> getAgentPoolName() {
        return this.agentPoolName == null ? Input.empty() : this.agentPoolName;
    }

    /**
     * The value that indicates whether archiving is enabled for the run or not.
     * 
     */
    @InputImport(name="isArchiveEnabled")
      private final @Nullable Input<Boolean> isArchiveEnabled;

    public Input<Boolean> getIsArchiveEnabled() {
        return this.isArchiveEnabled == null ? Input.empty() : this.isArchiveEnabled;
    }

    /**
     * The template that describes the repository and tag information for run log artifact.
     * 
     */
    @InputImport(name="logTemplate")
      private final @Nullable Input<String> logTemplate;

    public Input<String> getLogTemplate() {
        return this.logTemplate == null ? Input.empty() : this.logTemplate;
    }

    /**
     * Set of overridable parameters that can be passed when running a Task.
     * 
     */
    @InputImport(name="overrideTaskStepProperties")
      private final @Nullable Input<OverrideTaskStepPropertiesArgs> overrideTaskStepProperties;

    public Input<OverrideTaskStepPropertiesArgs> getOverrideTaskStepProperties() {
        return this.overrideTaskStepProperties == null ? Input.empty() : this.overrideTaskStepProperties;
    }

    /**
     * The resource ID of task against which run has to be queued.
     * 
     */
    @InputImport(name="taskId", required=true)
      private final Input<String> taskId;

    public Input<String> getTaskId() {
        return this.taskId;
    }

    /**
     * The type of the run request.
     * Expected value is 'TaskRunRequest'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public TaskRunRequestArgs(
        @Nullable Input<String> agentPoolName,
        @Nullable Input<Boolean> isArchiveEnabled,
        @Nullable Input<String> logTemplate,
        @Nullable Input<OverrideTaskStepPropertiesArgs> overrideTaskStepProperties,
        Input<String> taskId,
        Input<String> type) {
        this.agentPoolName = agentPoolName;
        this.isArchiveEnabled = isArchiveEnabled == null ? Input.ofNullable(false) : isArchiveEnabled;
        this.logTemplate = logTemplate;
        this.overrideTaskStepProperties = overrideTaskStepProperties;
        this.taskId = Objects.requireNonNull(taskId, "expected parameter 'taskId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TaskRunRequestArgs() {
        this.agentPoolName = Input.empty();
        this.isArchiveEnabled = Input.empty();
        this.logTemplate = Input.empty();
        this.overrideTaskStepProperties = Input.empty();
        this.taskId = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskRunRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> agentPoolName;
        private @Nullable Input<Boolean> isArchiveEnabled;
        private @Nullable Input<String> logTemplate;
        private @Nullable Input<OverrideTaskStepPropertiesArgs> overrideTaskStepProperties;
        private Input<String> taskId;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskRunRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.isArchiveEnabled = defaults.isArchiveEnabled;
    	      this.logTemplate = defaults.logTemplate;
    	      this.overrideTaskStepProperties = defaults.overrideTaskStepProperties;
    	      this.taskId = defaults.taskId;
    	      this.type = defaults.type;
        }

        public Builder setAgentPoolName(@Nullable Input<String> agentPoolName) {
            this.agentPoolName = agentPoolName;
            return this;
        }

        public Builder setAgentPoolName(@Nullable String agentPoolName) {
            this.agentPoolName = Input.ofNullable(agentPoolName);
            return this;
        }

        public Builder setIsArchiveEnabled(@Nullable Input<Boolean> isArchiveEnabled) {
            this.isArchiveEnabled = isArchiveEnabled;
            return this;
        }

        public Builder setIsArchiveEnabled(@Nullable Boolean isArchiveEnabled) {
            this.isArchiveEnabled = Input.ofNullable(isArchiveEnabled);
            return this;
        }

        public Builder setLogTemplate(@Nullable Input<String> logTemplate) {
            this.logTemplate = logTemplate;
            return this;
        }

        public Builder setLogTemplate(@Nullable String logTemplate) {
            this.logTemplate = Input.ofNullable(logTemplate);
            return this;
        }

        public Builder setOverrideTaskStepProperties(@Nullable Input<OverrideTaskStepPropertiesArgs> overrideTaskStepProperties) {
            this.overrideTaskStepProperties = overrideTaskStepProperties;
            return this;
        }

        public Builder setOverrideTaskStepProperties(@Nullable OverrideTaskStepPropertiesArgs overrideTaskStepProperties) {
            this.overrideTaskStepProperties = Input.ofNullable(overrideTaskStepProperties);
            return this;
        }

        public Builder setTaskId(Input<String> taskId) {
            this.taskId = Objects.requireNonNull(taskId);
            return this;
        }

        public Builder setTaskId(String taskId) {
            this.taskId = Input.of(Objects.requireNonNull(taskId));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public TaskRunRequestArgs build() {
            return new TaskRunRequestArgs(agentPoolName, isArchiveEnabled, logTemplate, overrideTaskStepProperties, taskId, type);
        }
    }
}