// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.AgentPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.ImageDescriptorResponse;
import io.pulumi.azurenative.containerregistry.outputs.ImageUpdateTriggerResponse;
import io.pulumi.azurenative.containerregistry.outputs.PlatformPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.SourceTriggerDescriptorResponse;
import io.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import io.pulumi.azurenative.containerregistry.outputs.TimerTriggerDescriptorResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RunResponse {
    /**
     * The machine configuration of the run agent.
     * 
     */
    private final @Nullable AgentPropertiesResponse agentConfiguration;
    /**
     * The dedicated agent pool for the run.
     * 
     */
    private final @Nullable String agentPoolName;
    /**
     * The time the run was scheduled.
     * 
     */
    private final @Nullable String createTime;
    /**
     * The list of custom registries that were logged in during this run.
     * 
     */
    private final @Nullable List<String> customRegistries;
    /**
     * The time the run finished.
     * 
     */
    private final @Nullable String finishTime;
    /**
     * The resource ID.
     * 
     */
    private final String id;
    /**
     * The image update trigger that caused the run. This is applicable if the task has base image trigger configured.
     * 
     */
    private final @Nullable ImageUpdateTriggerResponse imageUpdateTrigger;
    /**
     * The value that indicates whether archiving is enabled or not.
     * 
     */
    private final @Nullable Boolean isArchiveEnabled;
    /**
     * The last updated time for the run.
     * 
     */
    private final @Nullable String lastUpdatedTime;
    /**
     * The image description for the log artifact.
     * 
     */
    private final ImageDescriptorResponse logArtifact;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The list of all images that were generated from the run. This is applicable if the run generates base image dependencies.
     * 
     */
    private final @Nullable List<ImageDescriptorResponse> outputImages;
    /**
     * The platform properties against which the run will happen.
     * 
     */
    private final @Nullable PlatformPropertiesResponse platform;
    /**
     * The provisioning state of a run.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * The error message received from backend systems after the run is scheduled.
     * 
     */
    private final String runErrorMessage;
    /**
     * The unique identifier for the run.
     * 
     */
    private final @Nullable String runId;
    /**
     * The type of run.
     * 
     */
    private final @Nullable String runType;
    /**
     * The scope of the credentials that were used to login to the source registry during this run.
     * 
     */
    private final @Nullable String sourceRegistryAuth;
    /**
     * The source trigger that caused the run.
     * 
     */
    private final @Nullable SourceTriggerDescriptorResponse sourceTrigger;
    /**
     * The time the run started.
     * 
     */
    private final @Nullable String startTime;
    /**
     * The current status of the run.
     * 
     */
    private final @Nullable String status;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The task against which run was scheduled.
     * 
     */
    private final @Nullable String task;
    /**
     * The timer trigger that caused the run.
     * 
     */
    private final @Nullable TimerTriggerDescriptorResponse timerTrigger;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * The update trigger token passed for the Run.
     * 
     */
    private final @Nullable String updateTriggerToken;

    @CustomType.Constructor
    private RunResponse(
        @CustomType.Parameter("agentConfiguration") @Nullable AgentPropertiesResponse agentConfiguration,
        @CustomType.Parameter("agentPoolName") @Nullable String agentPoolName,
        @CustomType.Parameter("createTime") @Nullable String createTime,
        @CustomType.Parameter("customRegistries") @Nullable List<String> customRegistries,
        @CustomType.Parameter("finishTime") @Nullable String finishTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("imageUpdateTrigger") @Nullable ImageUpdateTriggerResponse imageUpdateTrigger,
        @CustomType.Parameter("isArchiveEnabled") @Nullable Boolean isArchiveEnabled,
        @CustomType.Parameter("lastUpdatedTime") @Nullable String lastUpdatedTime,
        @CustomType.Parameter("logArtifact") ImageDescriptorResponse logArtifact,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("outputImages") @Nullable List<ImageDescriptorResponse> outputImages,
        @CustomType.Parameter("platform") @Nullable PlatformPropertiesResponse platform,
        @CustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @CustomType.Parameter("runErrorMessage") String runErrorMessage,
        @CustomType.Parameter("runId") @Nullable String runId,
        @CustomType.Parameter("runType") @Nullable String runType,
        @CustomType.Parameter("sourceRegistryAuth") @Nullable String sourceRegistryAuth,
        @CustomType.Parameter("sourceTrigger") @Nullable SourceTriggerDescriptorResponse sourceTrigger,
        @CustomType.Parameter("startTime") @Nullable String startTime,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("task") @Nullable String task,
        @CustomType.Parameter("timerTrigger") @Nullable TimerTriggerDescriptorResponse timerTrigger,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("updateTriggerToken") @Nullable String updateTriggerToken) {
        this.agentConfiguration = agentConfiguration;
        this.agentPoolName = agentPoolName;
        this.createTime = createTime;
        this.customRegistries = customRegistries;
        this.finishTime = finishTime;
        this.id = id;
        this.imageUpdateTrigger = imageUpdateTrigger;
        this.isArchiveEnabled = isArchiveEnabled;
        this.lastUpdatedTime = lastUpdatedTime;
        this.logArtifact = logArtifact;
        this.name = name;
        this.outputImages = outputImages;
        this.platform = platform;
        this.provisioningState = provisioningState;
        this.runErrorMessage = runErrorMessage;
        this.runId = runId;
        this.runType = runType;
        this.sourceRegistryAuth = sourceRegistryAuth;
        this.sourceTrigger = sourceTrigger;
        this.startTime = startTime;
        this.status = status;
        this.systemData = systemData;
        this.task = task;
        this.timerTrigger = timerTrigger;
        this.type = type;
        this.updateTriggerToken = updateTriggerToken;
    }

    /**
     * The machine configuration of the run agent.
     * 
    */
    public Optional<AgentPropertiesResponse> getAgentConfiguration() {
        return Optional.ofNullable(this.agentConfiguration);
    }
    /**
     * The dedicated agent pool for the run.
     * 
    */
    public Optional<String> getAgentPoolName() {
        return Optional.ofNullable(this.agentPoolName);
    }
    /**
     * The time the run was scheduled.
     * 
    */
    public Optional<String> getCreateTime() {
        return Optional.ofNullable(this.createTime);
    }
    /**
     * The list of custom registries that were logged in during this run.
     * 
    */
    public List<String> getCustomRegistries() {
        return this.customRegistries == null ? List.of() : this.customRegistries;
    }
    /**
     * The time the run finished.
     * 
    */
    public Optional<String> getFinishTime() {
        return Optional.ofNullable(this.finishTime);
    }
    /**
     * The resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The image update trigger that caused the run. This is applicable if the task has base image trigger configured.
     * 
    */
    public Optional<ImageUpdateTriggerResponse> getImageUpdateTrigger() {
        return Optional.ofNullable(this.imageUpdateTrigger);
    }
    /**
     * The value that indicates whether archiving is enabled or not.
     * 
    */
    public Optional<Boolean> getIsArchiveEnabled() {
        return Optional.ofNullable(this.isArchiveEnabled);
    }
    /**
     * The last updated time for the run.
     * 
    */
    public Optional<String> getLastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    /**
     * The image description for the log artifact.
     * 
    */
    public ImageDescriptorResponse getLogArtifact() {
        return this.logArtifact;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The list of all images that were generated from the run. This is applicable if the run generates base image dependencies.
     * 
    */
    public List<ImageDescriptorResponse> getOutputImages() {
        return this.outputImages == null ? List.of() : this.outputImages;
    }
    /**
     * The platform properties against which the run will happen.
     * 
    */
    public Optional<PlatformPropertiesResponse> getPlatform() {
        return Optional.ofNullable(this.platform);
    }
    /**
     * The provisioning state of a run.
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * The error message received from backend systems after the run is scheduled.
     * 
    */
    public String getRunErrorMessage() {
        return this.runErrorMessage;
    }
    /**
     * The unique identifier for the run.
     * 
    */
    public Optional<String> getRunId() {
        return Optional.ofNullable(this.runId);
    }
    /**
     * The type of run.
     * 
    */
    public Optional<String> getRunType() {
        return Optional.ofNullable(this.runType);
    }
    /**
     * The scope of the credentials that were used to login to the source registry during this run.
     * 
    */
    public Optional<String> getSourceRegistryAuth() {
        return Optional.ofNullable(this.sourceRegistryAuth);
    }
    /**
     * The source trigger that caused the run.
     * 
    */
    public Optional<SourceTriggerDescriptorResponse> getSourceTrigger() {
        return Optional.ofNullable(this.sourceTrigger);
    }
    /**
     * The time the run started.
     * 
    */
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * The current status of the run.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The task against which run was scheduled.
     * 
    */
    public Optional<String> getTask() {
        return Optional.ofNullable(this.task);
    }
    /**
     * The timer trigger that caused the run.
     * 
    */
    public Optional<TimerTriggerDescriptorResponse> getTimerTrigger() {
        return Optional.ofNullable(this.timerTrigger);
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The update trigger token passed for the Run.
     * 
    */
    public Optional<String> getUpdateTriggerToken() {
        return Optional.ofNullable(this.updateTriggerToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AgentPropertiesResponse agentConfiguration;
        private @Nullable String agentPoolName;
        private @Nullable String createTime;
        private @Nullable List<String> customRegistries;
        private @Nullable String finishTime;
        private String id;
        private @Nullable ImageUpdateTriggerResponse imageUpdateTrigger;
        private @Nullable Boolean isArchiveEnabled;
        private @Nullable String lastUpdatedTime;
        private ImageDescriptorResponse logArtifact;
        private String name;
        private @Nullable List<ImageDescriptorResponse> outputImages;
        private @Nullable PlatformPropertiesResponse platform;
        private @Nullable String provisioningState;
        private String runErrorMessage;
        private @Nullable String runId;
        private @Nullable String runType;
        private @Nullable String sourceRegistryAuth;
        private @Nullable SourceTriggerDescriptorResponse sourceTrigger;
        private @Nullable String startTime;
        private @Nullable String status;
        private SystemDataResponse systemData;
        private @Nullable String task;
        private @Nullable TimerTriggerDescriptorResponse timerTrigger;
        private String type;
        private @Nullable String updateTriggerToken;

        public Builder() {
    	      // Empty
        }

        public Builder(RunResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentConfiguration = defaults.agentConfiguration;
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.createTime = defaults.createTime;
    	      this.customRegistries = defaults.customRegistries;
    	      this.finishTime = defaults.finishTime;
    	      this.id = defaults.id;
    	      this.imageUpdateTrigger = defaults.imageUpdateTrigger;
    	      this.isArchiveEnabled = defaults.isArchiveEnabled;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.logArtifact = defaults.logArtifact;
    	      this.name = defaults.name;
    	      this.outputImages = defaults.outputImages;
    	      this.platform = defaults.platform;
    	      this.provisioningState = defaults.provisioningState;
    	      this.runErrorMessage = defaults.runErrorMessage;
    	      this.runId = defaults.runId;
    	      this.runType = defaults.runType;
    	      this.sourceRegistryAuth = defaults.sourceRegistryAuth;
    	      this.sourceTrigger = defaults.sourceTrigger;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.systemData = defaults.systemData;
    	      this.task = defaults.task;
    	      this.timerTrigger = defaults.timerTrigger;
    	      this.type = defaults.type;
    	      this.updateTriggerToken = defaults.updateTriggerToken;
        }

        public Builder agentConfiguration(@Nullable AgentPropertiesResponse agentConfiguration) {
            this.agentConfiguration = agentConfiguration;
            return this;
        }
        public Builder agentPoolName(@Nullable String agentPoolName) {
            this.agentPoolName = agentPoolName;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder customRegistries(@Nullable List<String> customRegistries) {
            this.customRegistries = customRegistries;
            return this;
        }
        public Builder customRegistries(String... customRegistries) {
            return customRegistries(List.of(customRegistries));
        }
        public Builder finishTime(@Nullable String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder imageUpdateTrigger(@Nullable ImageUpdateTriggerResponse imageUpdateTrigger) {
            this.imageUpdateTrigger = imageUpdateTrigger;
            return this;
        }
        public Builder isArchiveEnabled(@Nullable Boolean isArchiveEnabled) {
            this.isArchiveEnabled = isArchiveEnabled;
            return this;
        }
        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }
        public Builder logArtifact(ImageDescriptorResponse logArtifact) {
            this.logArtifact = Objects.requireNonNull(logArtifact);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder outputImages(@Nullable List<ImageDescriptorResponse> outputImages) {
            this.outputImages = outputImages;
            return this;
        }
        public Builder outputImages(ImageDescriptorResponse... outputImages) {
            return outputImages(List.of(outputImages));
        }
        public Builder platform(@Nullable PlatformPropertiesResponse platform) {
            this.platform = platform;
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder runErrorMessage(String runErrorMessage) {
            this.runErrorMessage = Objects.requireNonNull(runErrorMessage);
            return this;
        }
        public Builder runId(@Nullable String runId) {
            this.runId = runId;
            return this;
        }
        public Builder runType(@Nullable String runType) {
            this.runType = runType;
            return this;
        }
        public Builder sourceRegistryAuth(@Nullable String sourceRegistryAuth) {
            this.sourceRegistryAuth = sourceRegistryAuth;
            return this;
        }
        public Builder sourceTrigger(@Nullable SourceTriggerDescriptorResponse sourceTrigger) {
            this.sourceTrigger = sourceTrigger;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder task(@Nullable String task) {
            this.task = task;
            return this;
        }
        public Builder timerTrigger(@Nullable TimerTriggerDescriptorResponse timerTrigger) {
            this.timerTrigger = timerTrigger;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder updateTriggerToken(@Nullable String updateTriggerToken) {
            this.updateTriggerToken = updateTriggerToken;
            return this;
        }        public RunResponse build() {
            return new RunResponse(agentConfiguration, agentPoolName, createTime, customRegistries, finishTime, id, imageUpdateTrigger, isArchiveEnabled, lastUpdatedTime, logArtifact, name, outputImages, platform, provisioningState, runErrorMessage, runId, runType, sourceRegistryAuth, sourceTrigger, startTime, status, systemData, task, timerTrigger, type, updateTriggerToken);
        }
    }
}
