// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.outputs;

import com.pulumi.azurenative.containerregistry.outputs.AgentPropertiesResponse;
import com.pulumi.azurenative.containerregistry.outputs.CredentialsResponse;
import com.pulumi.azurenative.containerregistry.outputs.DockerBuildStepResponse;
import com.pulumi.azurenative.containerregistry.outputs.EncodedTaskStepResponse;
import com.pulumi.azurenative.containerregistry.outputs.FileTaskStepResponse;
import com.pulumi.azurenative.containerregistry.outputs.IdentityPropertiesResponse;
import com.pulumi.azurenative.containerregistry.outputs.PlatformPropertiesResponse;
import com.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import com.pulumi.azurenative.containerregistry.outputs.TriggerPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListTaskDetailsResult {
    /**
     * @return The machine configuration of the run agent.
     * 
     */
    private final @Nullable AgentPropertiesResponse agentConfiguration;
    /**
     * @return The dedicated agent pool for the task.
     * 
     */
    private final @Nullable String agentPoolName;
    /**
     * @return The creation date of task.
     * 
     */
    private final String creationDate;
    /**
     * @return The properties that describes a set of credentials that will be used when this run is invoked.
     * 
     */
    private final @Nullable CredentialsResponse credentials;
    /**
     * @return The resource ID.
     * 
     */
    private final String id;
    /**
     * @return Identity for the resource.
     * 
     */
    private final @Nullable IdentityPropertiesResponse identity;
    /**
     * @return The value of this property indicates whether the task resource is system task or not.
     * 
     */
    private final @Nullable Boolean isSystemTask;
    /**
     * @return The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    private final String location;
    /**
     * @return The template that describes the repository and tag information for run log artifact.
     * 
     */
    private final @Nullable String logTemplate;
    /**
     * @return The name of the resource.
     * 
     */
    private final String name;
    /**
     * @return The platform properties against which the run has to happen.
     * 
     */
    private final @Nullable PlatformPropertiesResponse platform;
    /**
     * @return The provisioning state of the task.
     * 
     */
    private final String provisioningState;
    /**
     * @return The current status of task.
     * 
     */
    private final @Nullable String status;
    /**
     * @return The properties of a task step.
     * 
     */
    private final @Nullable Object step;
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Run timeout in seconds.
     * 
     */
    private final @Nullable Integer timeout;
    /**
     * @return The properties that describe all triggers for the task.
     * 
     */
    private final @Nullable TriggerPropertiesResponse trigger;
    /**
     * @return The type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ListTaskDetailsResult(
        @CustomType.Parameter("agentConfiguration") @Nullable AgentPropertiesResponse agentConfiguration,
        @CustomType.Parameter("agentPoolName") @Nullable String agentPoolName,
        @CustomType.Parameter("creationDate") String creationDate,
        @CustomType.Parameter("credentials") @Nullable CredentialsResponse credentials,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityPropertiesResponse identity,
        @CustomType.Parameter("isSystemTask") @Nullable Boolean isSystemTask,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("logTemplate") @Nullable String logTemplate,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("platform") @Nullable PlatformPropertiesResponse platform,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("step") @Nullable Object step,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("timeout") @Nullable Integer timeout,
        @CustomType.Parameter("trigger") @Nullable TriggerPropertiesResponse trigger,
        @CustomType.Parameter("type") String type) {
        this.agentConfiguration = agentConfiguration;
        this.agentPoolName = agentPoolName;
        this.creationDate = creationDate;
        this.credentials = credentials;
        this.id = id;
        this.identity = identity;
        this.isSystemTask = isSystemTask;
        this.location = location;
        this.logTemplate = logTemplate;
        this.name = name;
        this.platform = platform;
        this.provisioningState = provisioningState;
        this.status = status;
        this.step = step;
        this.systemData = systemData;
        this.tags = tags;
        this.timeout = timeout;
        this.trigger = trigger;
        this.type = type;
    }

    /**
     * @return The machine configuration of the run agent.
     * 
     */
    public Optional<AgentPropertiesResponse> agentConfiguration() {
        return Optional.ofNullable(this.agentConfiguration);
    }
    /**
     * @return The dedicated agent pool for the task.
     * 
     */
    public Optional<String> agentPoolName() {
        return Optional.ofNullable(this.agentPoolName);
    }
    /**
     * @return The creation date of task.
     * 
     */
    public String creationDate() {
        return this.creationDate;
    }
    /**
     * @return The properties that describes a set of credentials that will be used when this run is invoked.
     * 
     */
    public Optional<CredentialsResponse> credentials() {
        return Optional.ofNullable(this.credentials);
    }
    /**
     * @return The resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Identity for the resource.
     * 
     */
    public Optional<IdentityPropertiesResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return The value of this property indicates whether the task resource is system task or not.
     * 
     */
    public Optional<Boolean> isSystemTask() {
        return Optional.ofNullable(this.isSystemTask);
    }
    /**
     * @return The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The template that describes the repository and tag information for run log artifact.
     * 
     */
    public Optional<String> logTemplate() {
        return Optional.ofNullable(this.logTemplate);
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The platform properties against which the run has to happen.
     * 
     */
    public Optional<PlatformPropertiesResponse> platform() {
        return Optional.ofNullable(this.platform);
    }
    /**
     * @return The provisioning state of the task.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The current status of task.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return The properties of a task step.
     * 
     */
    public Optional<Object> step() {
        return Optional.ofNullable(this.step);
    }
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return The tags of the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Run timeout in seconds.
     * 
     */
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * @return The properties that describe all triggers for the task.
     * 
     */
    public Optional<TriggerPropertiesResponse> trigger() {
        return Optional.ofNullable(this.trigger);
    }
    /**
     * @return The type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListTaskDetailsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AgentPropertiesResponse agentConfiguration;
        private @Nullable String agentPoolName;
        private String creationDate;
        private @Nullable CredentialsResponse credentials;
        private String id;
        private @Nullable IdentityPropertiesResponse identity;
        private @Nullable Boolean isSystemTask;
        private String location;
        private @Nullable String logTemplate;
        private String name;
        private @Nullable PlatformPropertiesResponse platform;
        private String provisioningState;
        private @Nullable String status;
        private @Nullable Object step;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private @Nullable Integer timeout;
        private @Nullable TriggerPropertiesResponse trigger;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListTaskDetailsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentConfiguration = defaults.agentConfiguration;
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.creationDate = defaults.creationDate;
    	      this.credentials = defaults.credentials;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.isSystemTask = defaults.isSystemTask;
    	      this.location = defaults.location;
    	      this.logTemplate = defaults.logTemplate;
    	      this.name = defaults.name;
    	      this.platform = defaults.platform;
    	      this.provisioningState = defaults.provisioningState;
    	      this.status = defaults.status;
    	      this.step = defaults.step;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.trigger = defaults.trigger;
    	      this.type = defaults.type;
        }

        public Builder agentConfiguration(@Nullable AgentPropertiesResponse agentConfiguration) {
            this.agentConfiguration = agentConfiguration;
            return this;
        }
        public Builder agentPoolName(@Nullable String agentPoolName) {
            this.agentPoolName = agentPoolName;
            return this;
        }
        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }
        public Builder credentials(@Nullable CredentialsResponse credentials) {
            this.credentials = credentials;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable IdentityPropertiesResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder isSystemTask(@Nullable Boolean isSystemTask) {
            this.isSystemTask = isSystemTask;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder logTemplate(@Nullable String logTemplate) {
            this.logTemplate = logTemplate;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder platform(@Nullable PlatformPropertiesResponse platform) {
            this.platform = platform;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder step(@Nullable Object step) {
            this.step = step;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder trigger(@Nullable TriggerPropertiesResponse trigger) {
            this.trigger = trigger;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ListTaskDetailsResult build() {
            return new ListTaskDetailsResult(agentConfiguration, agentPoolName, creationDate, credentials, id, identity, isSystemTask, location, logTemplate, name, platform, provisioningState, status, step, systemData, tags, timeout, trigger, type);
        }
    }
}
