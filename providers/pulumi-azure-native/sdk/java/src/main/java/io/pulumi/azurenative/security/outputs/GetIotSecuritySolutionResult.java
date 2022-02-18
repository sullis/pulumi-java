// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.azurenative.security.outputs.AdditionalWorkspacesPropertiesResponse;
import io.pulumi.azurenative.security.outputs.RecommendationConfigurationPropertiesResponse;
import io.pulumi.azurenative.security.outputs.SystemDataResponse;
import io.pulumi.azurenative.security.outputs.UserDefinedResourcesPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIotSecuritySolutionResult {
    /**
     * List of additional workspaces
     * 
     */
    private final @Nullable List<AdditionalWorkspacesPropertiesResponse> additionalWorkspaces;
    /**
     * List of resources that were automatically discovered as relevant to the security solution.
     * 
     */
    private final List<String> autoDiscoveredResources;
    /**
     * Disabled data sources. Disabling these data sources compromises the system.
     * 
     */
    private final @Nullable List<String> disabledDataSources;
    /**
     * Resource display name.
     * 
     */
    private final String displayName;
    /**
     * List of additional options for exporting to workspace data.
     * 
     */
    private final @Nullable List<String> export;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * IoT Hub resource IDs
     * 
     */
    private final List<String> iotHubs;
    /**
     * The resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * List of the configuration status for each recommendation type.
     * 
     */
    private final @Nullable List<RecommendationConfigurationPropertiesResponse> recommendationsConfiguration;
    /**
     * Status of the IoT Security solution.
     * 
     */
    private final @Nullable String status;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * Unmasked IP address logging status
     * 
     */
    private final @Nullable String unmaskedIpLoggingStatus;
    /**
     * Properties of the IoT Security solution's user defined resources.
     * 
     */
    private final @Nullable UserDefinedResourcesPropertiesResponse userDefinedResources;
    /**
     * Workspace resource ID
     * 
     */
    private final @Nullable String workspace;

    @OutputCustomType.Constructor({"additionalWorkspaces","autoDiscoveredResources","disabledDataSources","displayName","export","id","iotHubs","location","name","recommendationsConfiguration","status","systemData","tags","type","unmaskedIpLoggingStatus","userDefinedResources","workspace"})
    private GetIotSecuritySolutionResult(
        @Nullable List<AdditionalWorkspacesPropertiesResponse> additionalWorkspaces,
        List<String> autoDiscoveredResources,
        @Nullable List<String> disabledDataSources,
        String displayName,
        @Nullable List<String> export,
        String id,
        List<String> iotHubs,
        @Nullable String location,
        String name,
        @Nullable List<RecommendationConfigurationPropertiesResponse> recommendationsConfiguration,
        @Nullable String status,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable String unmaskedIpLoggingStatus,
        @Nullable UserDefinedResourcesPropertiesResponse userDefinedResources,
        @Nullable String workspace) {
        this.additionalWorkspaces = additionalWorkspaces;
        this.autoDiscoveredResources = Objects.requireNonNull(autoDiscoveredResources);
        this.disabledDataSources = disabledDataSources;
        this.displayName = Objects.requireNonNull(displayName);
        this.export = export;
        this.id = Objects.requireNonNull(id);
        this.iotHubs = Objects.requireNonNull(iotHubs);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.recommendationsConfiguration = recommendationsConfiguration;
        this.status = status;
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.unmaskedIpLoggingStatus = unmaskedIpLoggingStatus;
        this.userDefinedResources = userDefinedResources;
        this.workspace = workspace;
    }

    /**
     * List of additional workspaces
     * 
     */
    public List<AdditionalWorkspacesPropertiesResponse> getAdditionalWorkspaces() {
        return this.additionalWorkspaces == null ? List.of() : this.additionalWorkspaces;
    }
    /**
     * List of resources that were automatically discovered as relevant to the security solution.
     * 
     */
    public List<String> getAutoDiscoveredResources() {
        return this.autoDiscoveredResources;
    }
    /**
     * Disabled data sources. Disabling these data sources compromises the system.
     * 
     */
    public List<String> getDisabledDataSources() {
        return this.disabledDataSources == null ? List.of() : this.disabledDataSources;
    }
    /**
     * Resource display name.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * List of additional options for exporting to workspace data.
     * 
     */
    public List<String> getExport() {
        return this.export == null ? List.of() : this.export;
    }
    /**
     * Resource Id
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * IoT Hub resource IDs
     * 
     */
    public List<String> getIotHubs() {
        return this.iotHubs;
    }
    /**
     * The resource location.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * List of the configuration status for each recommendation type.
     * 
     */
    public List<RecommendationConfigurationPropertiesResponse> getRecommendationsConfiguration() {
        return this.recommendationsConfiguration == null ? List.of() : this.recommendationsConfiguration;
    }
    /**
     * Status of the IoT Security solution.
     * 
     */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Unmasked IP address logging status
     * 
     */
    public Optional<String> getUnmaskedIpLoggingStatus() {
        return Optional.ofNullable(this.unmaskedIpLoggingStatus);
    }
    /**
     * Properties of the IoT Security solution's user defined resources.
     * 
     */
    public Optional<UserDefinedResourcesPropertiesResponse> getUserDefinedResources() {
        return Optional.ofNullable(this.userDefinedResources);
    }
    /**
     * Workspace resource ID
     * 
     */
    public Optional<String> getWorkspace() {
        return Optional.ofNullable(this.workspace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIotSecuritySolutionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AdditionalWorkspacesPropertiesResponse> additionalWorkspaces;
        private List<String> autoDiscoveredResources;
        private @Nullable List<String> disabledDataSources;
        private String displayName;
        private @Nullable List<String> export;
        private String id;
        private List<String> iotHubs;
        private @Nullable String location;
        private String name;
        private @Nullable List<RecommendationConfigurationPropertiesResponse> recommendationsConfiguration;
        private @Nullable String status;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String unmaskedIpLoggingStatus;
        private @Nullable UserDefinedResourcesPropertiesResponse userDefinedResources;
        private @Nullable String workspace;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIotSecuritySolutionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalWorkspaces = defaults.additionalWorkspaces;
    	      this.autoDiscoveredResources = defaults.autoDiscoveredResources;
    	      this.disabledDataSources = defaults.disabledDataSources;
    	      this.displayName = defaults.displayName;
    	      this.export = defaults.export;
    	      this.id = defaults.id;
    	      this.iotHubs = defaults.iotHubs;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.recommendationsConfiguration = defaults.recommendationsConfiguration;
    	      this.status = defaults.status;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.unmaskedIpLoggingStatus = defaults.unmaskedIpLoggingStatus;
    	      this.userDefinedResources = defaults.userDefinedResources;
    	      this.workspace = defaults.workspace;
        }

        public Builder setAdditionalWorkspaces(@Nullable List<AdditionalWorkspacesPropertiesResponse> additionalWorkspaces) {
            this.additionalWorkspaces = additionalWorkspaces;
            return this;
        }

        public Builder setAutoDiscoveredResources(List<String> autoDiscoveredResources) {
            this.autoDiscoveredResources = Objects.requireNonNull(autoDiscoveredResources);
            return this;
        }

        public Builder setDisabledDataSources(@Nullable List<String> disabledDataSources) {
            this.disabledDataSources = disabledDataSources;
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setExport(@Nullable List<String> export) {
            this.export = export;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIotHubs(List<String> iotHubs) {
            this.iotHubs = Objects.requireNonNull(iotHubs);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRecommendationsConfiguration(@Nullable List<RecommendationConfigurationPropertiesResponse> recommendationsConfiguration) {
            this.recommendationsConfiguration = recommendationsConfiguration;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUnmaskedIpLoggingStatus(@Nullable String unmaskedIpLoggingStatus) {
            this.unmaskedIpLoggingStatus = unmaskedIpLoggingStatus;
            return this;
        }

        public Builder setUserDefinedResources(@Nullable UserDefinedResourcesPropertiesResponse userDefinedResources) {
            this.userDefinedResources = userDefinedResources;
            return this;
        }

        public Builder setWorkspace(@Nullable String workspace) {
            this.workspace = workspace;
            return this;
        }

        public GetIotSecuritySolutionResult build() {
            return new GetIotSecuritySolutionResult(additionalWorkspaces, autoDiscoveredResources, disabledDataSources, displayName, export, id, iotHubs, location, name, recommendationsConfiguration, status, systemData, tags, type, unmaskedIpLoggingStatus, userDefinedResources, workspace);
        }
    }
}
