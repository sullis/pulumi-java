// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.containerregistry.enums.TaskStatus;
import io.pulumi.azurenative.containerregistry.inputs.AgentPropertiesArgs;
import io.pulumi.azurenative.containerregistry.inputs.CredentialsArgs;
import io.pulumi.azurenative.containerregistry.inputs.DockerBuildStepArgs;
import io.pulumi.azurenative.containerregistry.inputs.EncodedTaskStepArgs;
import io.pulumi.azurenative.containerregistry.inputs.FileTaskStepArgs;
import io.pulumi.azurenative.containerregistry.inputs.IdentityPropertiesArgs;
import io.pulumi.azurenative.containerregistry.inputs.PlatformPropertiesArgs;
import io.pulumi.azurenative.containerregistry.inputs.TriggerPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskArgs Empty = new TaskArgs();

    /**
     * The machine configuration of the run agent.
     * 
     */
    @InputImport(name="agentConfiguration")
      private final @Nullable Input<AgentPropertiesArgs> agentConfiguration;

    public Input<AgentPropertiesArgs> getAgentConfiguration() {
        return this.agentConfiguration == null ? Input.empty() : this.agentConfiguration;
    }

    /**
     * The dedicated agent pool for the task.
     * 
     */
    @InputImport(name="agentPoolName")
      private final @Nullable Input<String> agentPoolName;

    public Input<String> getAgentPoolName() {
        return this.agentPoolName == null ? Input.empty() : this.agentPoolName;
    }

    /**
     * The properties that describes a set of credentials that will be used when this run is invoked.
     * 
     */
    @InputImport(name="credentials")
      private final @Nullable Input<CredentialsArgs> credentials;

    public Input<CredentialsArgs> getCredentials() {
        return this.credentials == null ? Input.empty() : this.credentials;
    }

    /**
     * Identity for the resource.
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Input<IdentityPropertiesArgs> identity;

    public Input<IdentityPropertiesArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * The value of this property indicates whether the task resource is system task or not.
     * 
     */
    @InputImport(name="isSystemTask")
      private final @Nullable Input<Boolean> isSystemTask;

    public Input<Boolean> getIsSystemTask() {
        return this.isSystemTask == null ? Input.empty() : this.isSystemTask;
    }

    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
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
     * The platform properties against which the run has to happen.
     * 
     */
    @InputImport(name="platform")
      private final @Nullable Input<PlatformPropertiesArgs> platform;

    public Input<PlatformPropertiesArgs> getPlatform() {
        return this.platform == null ? Input.empty() : this.platform;
    }

    /**
     * The name of the container registry.
     * 
     */
    @InputImport(name="registryName", required=true)
      private final Input<String> registryName;

    public Input<String> getRegistryName() {
        return this.registryName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The current status of task.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<Either<String,TaskStatus>> status;

    public Input<Either<String,TaskStatus>> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * The properties of a task step.
     * 
     */
    @InputImport(name="step")
      private final @Nullable Input<Object> step;

    public Input<Object> getStep() {
        return this.step == null ? Input.empty() : this.step;
    }

    /**
     * The tags of the resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The name of the container registry task.
     * 
     */
    @InputImport(name="taskName")
      private final @Nullable Input<String> taskName;

    public Input<String> getTaskName() {
        return this.taskName == null ? Input.empty() : this.taskName;
    }

    /**
     * Run timeout in seconds.
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Input<Integer> timeout;

    public Input<Integer> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    /**
     * The properties that describe all triggers for the task.
     * 
     */
    @InputImport(name="trigger")
      private final @Nullable Input<TriggerPropertiesArgs> trigger;

    public Input<TriggerPropertiesArgs> getTrigger() {
        return this.trigger == null ? Input.empty() : this.trigger;
    }

    public TaskArgs(
        @Nullable Input<AgentPropertiesArgs> agentConfiguration,
        @Nullable Input<String> agentPoolName,
        @Nullable Input<CredentialsArgs> credentials,
        @Nullable Input<IdentityPropertiesArgs> identity,
        @Nullable Input<Boolean> isSystemTask,
        @Nullable Input<String> location,
        @Nullable Input<String> logTemplate,
        @Nullable Input<PlatformPropertiesArgs> platform,
        Input<String> registryName,
        Input<String> resourceGroupName,
        @Nullable Input<Either<String,TaskStatus>> status,
        @Nullable Input<Object> step,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> taskName,
        @Nullable Input<Integer> timeout,
        @Nullable Input<TriggerPropertiesArgs> trigger) {
        this.agentConfiguration = agentConfiguration;
        this.agentPoolName = agentPoolName;
        this.credentials = credentials;
        this.identity = identity;
        this.isSystemTask = isSystemTask == null ? Input.ofNullable(false) : isSystemTask;
        this.location = location;
        this.logTemplate = logTemplate;
        this.platform = platform;
        this.registryName = Objects.requireNonNull(registryName, "expected parameter 'registryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.status = status;
        this.step = step;
        this.tags = tags;
        this.taskName = taskName;
        this.timeout = timeout == null ? Input.ofNullable(3600) : timeout;
        this.trigger = trigger;
    }

    private TaskArgs() {
        this.agentConfiguration = Input.empty();
        this.agentPoolName = Input.empty();
        this.credentials = Input.empty();
        this.identity = Input.empty();
        this.isSystemTask = Input.empty();
        this.location = Input.empty();
        this.logTemplate = Input.empty();
        this.platform = Input.empty();
        this.registryName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.status = Input.empty();
        this.step = Input.empty();
        this.tags = Input.empty();
        this.taskName = Input.empty();
        this.timeout = Input.empty();
        this.trigger = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AgentPropertiesArgs> agentConfiguration;
        private @Nullable Input<String> agentPoolName;
        private @Nullable Input<CredentialsArgs> credentials;
        private @Nullable Input<IdentityPropertiesArgs> identity;
        private @Nullable Input<Boolean> isSystemTask;
        private @Nullable Input<String> location;
        private @Nullable Input<String> logTemplate;
        private @Nullable Input<PlatformPropertiesArgs> platform;
        private Input<String> registryName;
        private Input<String> resourceGroupName;
        private @Nullable Input<Either<String,TaskStatus>> status;
        private @Nullable Input<Object> step;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> taskName;
        private @Nullable Input<Integer> timeout;
        private @Nullable Input<TriggerPropertiesArgs> trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentConfiguration = defaults.agentConfiguration;
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.credentials = defaults.credentials;
    	      this.identity = defaults.identity;
    	      this.isSystemTask = defaults.isSystemTask;
    	      this.location = defaults.location;
    	      this.logTemplate = defaults.logTemplate;
    	      this.platform = defaults.platform;
    	      this.registryName = defaults.registryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.status = defaults.status;
    	      this.step = defaults.step;
    	      this.tags = defaults.tags;
    	      this.taskName = defaults.taskName;
    	      this.timeout = defaults.timeout;
    	      this.trigger = defaults.trigger;
        }

        public Builder setAgentConfiguration(@Nullable Input<AgentPropertiesArgs> agentConfiguration) {
            this.agentConfiguration = agentConfiguration;
            return this;
        }

        public Builder setAgentConfiguration(@Nullable AgentPropertiesArgs agentConfiguration) {
            this.agentConfiguration = Input.ofNullable(agentConfiguration);
            return this;
        }

        public Builder setAgentPoolName(@Nullable Input<String> agentPoolName) {
            this.agentPoolName = agentPoolName;
            return this;
        }

        public Builder setAgentPoolName(@Nullable String agentPoolName) {
            this.agentPoolName = Input.ofNullable(agentPoolName);
            return this;
        }

        public Builder setCredentials(@Nullable Input<CredentialsArgs> credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setCredentials(@Nullable CredentialsArgs credentials) {
            this.credentials = Input.ofNullable(credentials);
            return this;
        }

        public Builder setIdentity(@Nullable Input<IdentityPropertiesArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable IdentityPropertiesArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setIsSystemTask(@Nullable Input<Boolean> isSystemTask) {
            this.isSystemTask = isSystemTask;
            return this;
        }

        public Builder setIsSystemTask(@Nullable Boolean isSystemTask) {
            this.isSystemTask = Input.ofNullable(isSystemTask);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setPlatform(@Nullable Input<PlatformPropertiesArgs> platform) {
            this.platform = platform;
            return this;
        }

        public Builder setPlatform(@Nullable PlatformPropertiesArgs platform) {
            this.platform = Input.ofNullable(platform);
            return this;
        }

        public Builder setRegistryName(Input<String> registryName) {
            this.registryName = Objects.requireNonNull(registryName);
            return this;
        }

        public Builder setRegistryName(String registryName) {
            this.registryName = Input.of(Objects.requireNonNull(registryName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setStatus(@Nullable Input<Either<String,TaskStatus>> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable Either<String,TaskStatus> status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setStep(@Nullable Input<Object> step) {
            this.step = step;
            return this;
        }

        public Builder setStep(@Nullable Object step) {
            this.step = Input.ofNullable(step);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTaskName(@Nullable Input<String> taskName) {
            this.taskName = taskName;
            return this;
        }

        public Builder setTaskName(@Nullable String taskName) {
            this.taskName = Input.ofNullable(taskName);
            return this;
        }

        public Builder setTimeout(@Nullable Input<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public Builder setTrigger(@Nullable Input<TriggerPropertiesArgs> trigger) {
            this.trigger = trigger;
            return this;
        }

        public Builder setTrigger(@Nullable TriggerPropertiesArgs trigger) {
            this.trigger = Input.ofNullable(trigger);
            return this;
        }
        public TaskArgs build() {
            return new TaskArgs(agentConfiguration, agentPoolName, credentials, identity, isSystemTask, location, logTemplate, platform, registryName, resourceGroupName, status, step, tags, taskName, timeout, trigger);
        }
    }
}