// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.security.enums.DataSource;
import io.pulumi.azurenative.security.enums.ExportData;
import io.pulumi.azurenative.security.enums.SecuritySolutionStatus;
import io.pulumi.azurenative.security.enums.UnmaskedIpLoggingStatus;
import io.pulumi.azurenative.security.inputs.AdditionalWorkspacesPropertiesArgs;
import io.pulumi.azurenative.security.inputs.RecommendationConfigurationPropertiesArgs;
import io.pulumi.azurenative.security.inputs.UserDefinedResourcesPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IotSecuritySolutionArgs extends io.pulumi.resources.ResourceArgs {

    public static final IotSecuritySolutionArgs Empty = new IotSecuritySolutionArgs();

    /**
     * List of additional workspaces
     * 
     */
    @Import(name="additionalWorkspaces")
      private final @Nullable Output<List<AdditionalWorkspacesPropertiesArgs>> additionalWorkspaces;

    public Output<List<AdditionalWorkspacesPropertiesArgs>> getAdditionalWorkspaces() {
        return this.additionalWorkspaces == null ? Output.empty() : this.additionalWorkspaces;
    }

    /**
     * Disabled data sources. Disabling these data sources compromises the system.
     * 
     */
    @Import(name="disabledDataSources")
      private final @Nullable Output<List<Either<String,DataSource>>> disabledDataSources;

    public Output<List<Either<String,DataSource>>> getDisabledDataSources() {
        return this.disabledDataSources == null ? Output.empty() : this.disabledDataSources;
    }

    /**
     * Resource display name.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * List of additional options for exporting to workspace data.
     * 
     */
    @Import(name="export")
      private final @Nullable Output<List<Either<String,ExportData>>> export;

    public Output<List<Either<String,ExportData>>> getExport() {
        return this.export == null ? Output.empty() : this.export;
    }

    /**
     * IoT Hub resource IDs
     * 
     */
    @Import(name="iotHubs", required=true)
      private final Output<List<String>> iotHubs;

    public Output<List<String>> getIotHubs() {
        return this.iotHubs;
    }

    /**
     * The resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * List of the configuration status for each recommendation type.
     * 
     */
    @Import(name="recommendationsConfiguration")
      private final @Nullable Output<List<RecommendationConfigurationPropertiesArgs>> recommendationsConfiguration;

    public Output<List<RecommendationConfigurationPropertiesArgs>> getRecommendationsConfiguration() {
        return this.recommendationsConfiguration == null ? Output.empty() : this.recommendationsConfiguration;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the IoT Security solution.
     * 
     */
    @Import(name="solutionName")
      private final @Nullable Output<String> solutionName;

    public Output<String> getSolutionName() {
        return this.solutionName == null ? Output.empty() : this.solutionName;
    }

    /**
     * Status of the IoT Security solution.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<Either<String,SecuritySolutionStatus>> status;

    public Output<Either<String,SecuritySolutionStatus>> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Unmasked IP address logging status
     * 
     */
    @Import(name="unmaskedIpLoggingStatus")
      private final @Nullable Output<Either<String,UnmaskedIpLoggingStatus>> unmaskedIpLoggingStatus;

    public Output<Either<String,UnmaskedIpLoggingStatus>> getUnmaskedIpLoggingStatus() {
        return this.unmaskedIpLoggingStatus == null ? Output.empty() : this.unmaskedIpLoggingStatus;
    }

    /**
     * Properties of the IoT Security solution's user defined resources.
     * 
     */
    @Import(name="userDefinedResources")
      private final @Nullable Output<UserDefinedResourcesPropertiesArgs> userDefinedResources;

    public Output<UserDefinedResourcesPropertiesArgs> getUserDefinedResources() {
        return this.userDefinedResources == null ? Output.empty() : this.userDefinedResources;
    }

    /**
     * Workspace resource ID
     * 
     */
    @Import(name="workspace")
      private final @Nullable Output<String> workspace;

    public Output<String> getWorkspace() {
        return this.workspace == null ? Output.empty() : this.workspace;
    }

    public IotSecuritySolutionArgs(
        @Nullable Output<List<AdditionalWorkspacesPropertiesArgs>> additionalWorkspaces,
        @Nullable Output<List<Either<String,DataSource>>> disabledDataSources,
        Output<String> displayName,
        @Nullable Output<List<Either<String,ExportData>>> export,
        Output<List<String>> iotHubs,
        @Nullable Output<String> location,
        @Nullable Output<List<RecommendationConfigurationPropertiesArgs>> recommendationsConfiguration,
        Output<String> resourceGroupName,
        @Nullable Output<String> solutionName,
        @Nullable Output<Either<String,SecuritySolutionStatus>> status,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Either<String,UnmaskedIpLoggingStatus>> unmaskedIpLoggingStatus,
        @Nullable Output<UserDefinedResourcesPropertiesArgs> userDefinedResources,
        @Nullable Output<String> workspace) {
        this.additionalWorkspaces = additionalWorkspaces;
        this.disabledDataSources = disabledDataSources;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.export = export;
        this.iotHubs = Objects.requireNonNull(iotHubs, "expected parameter 'iotHubs' to be non-null");
        this.location = location;
        this.recommendationsConfiguration = recommendationsConfiguration;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.solutionName = solutionName;
        this.status = status == null ? Output.ofLeft("Enabled") : status;
        this.tags = tags;
        this.unmaskedIpLoggingStatus = unmaskedIpLoggingStatus == null ? Output.ofLeft("Disabled") : unmaskedIpLoggingStatus;
        this.userDefinedResources = userDefinedResources;
        this.workspace = workspace;
    }

    private IotSecuritySolutionArgs() {
        this.additionalWorkspaces = Output.empty();
        this.disabledDataSources = Output.empty();
        this.displayName = Output.empty();
        this.export = Output.empty();
        this.iotHubs = Output.empty();
        this.location = Output.empty();
        this.recommendationsConfiguration = Output.empty();
        this.resourceGroupName = Output.empty();
        this.solutionName = Output.empty();
        this.status = Output.empty();
        this.tags = Output.empty();
        this.unmaskedIpLoggingStatus = Output.empty();
        this.userDefinedResources = Output.empty();
        this.workspace = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotSecuritySolutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AdditionalWorkspacesPropertiesArgs>> additionalWorkspaces;
        private @Nullable Output<List<Either<String,DataSource>>> disabledDataSources;
        private Output<String> displayName;
        private @Nullable Output<List<Either<String,ExportData>>> export;
        private Output<List<String>> iotHubs;
        private @Nullable Output<String> location;
        private @Nullable Output<List<RecommendationConfigurationPropertiesArgs>> recommendationsConfiguration;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> solutionName;
        private @Nullable Output<Either<String,SecuritySolutionStatus>> status;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Either<String,UnmaskedIpLoggingStatus>> unmaskedIpLoggingStatus;
        private @Nullable Output<UserDefinedResourcesPropertiesArgs> userDefinedResources;
        private @Nullable Output<String> workspace;

        public Builder() {
    	      // Empty
        }

        public Builder(IotSecuritySolutionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalWorkspaces = defaults.additionalWorkspaces;
    	      this.disabledDataSources = defaults.disabledDataSources;
    	      this.displayName = defaults.displayName;
    	      this.export = defaults.export;
    	      this.iotHubs = defaults.iotHubs;
    	      this.location = defaults.location;
    	      this.recommendationsConfiguration = defaults.recommendationsConfiguration;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.solutionName = defaults.solutionName;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.unmaskedIpLoggingStatus = defaults.unmaskedIpLoggingStatus;
    	      this.userDefinedResources = defaults.userDefinedResources;
    	      this.workspace = defaults.workspace;
        }

        public Builder additionalWorkspaces(@Nullable Output<List<AdditionalWorkspacesPropertiesArgs>> additionalWorkspaces) {
            this.additionalWorkspaces = additionalWorkspaces;
            return this;
        }
        public Builder additionalWorkspaces(@Nullable List<AdditionalWorkspacesPropertiesArgs> additionalWorkspaces) {
            this.additionalWorkspaces = Output.ofNullable(additionalWorkspaces);
            return this;
        }
        public Builder additionalWorkspaces(AdditionalWorkspacesPropertiesArgs... additionalWorkspaces) {
            return additionalWorkspaces(List.of(additionalWorkspaces));
        }
        public Builder disabledDataSources(@Nullable Output<List<Either<String,DataSource>>> disabledDataSources) {
            this.disabledDataSources = disabledDataSources;
            return this;
        }
        public Builder disabledDataSources(@Nullable List<Either<String,DataSource>> disabledDataSources) {
            this.disabledDataSources = Output.ofNullable(disabledDataSources);
            return this;
        }
        public Builder disabledDataSources(Either<String,DataSource>... disabledDataSources) {
            return disabledDataSources(List.of(disabledDataSources));
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder export(@Nullable Output<List<Either<String,ExportData>>> export) {
            this.export = export;
            return this;
        }
        public Builder export(@Nullable List<Either<String,ExportData>> export) {
            this.export = Output.ofNullable(export);
            return this;
        }
        public Builder export(Either<String,ExportData>... export) {
            return export(List.of(export));
        }
        public Builder iotHubs(Output<List<String>> iotHubs) {
            this.iotHubs = Objects.requireNonNull(iotHubs);
            return this;
        }
        public Builder iotHubs(List<String> iotHubs) {
            this.iotHubs = Output.of(Objects.requireNonNull(iotHubs));
            return this;
        }
        public Builder iotHubs(String... iotHubs) {
            return iotHubs(List.of(iotHubs));
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder recommendationsConfiguration(@Nullable Output<List<RecommendationConfigurationPropertiesArgs>> recommendationsConfiguration) {
            this.recommendationsConfiguration = recommendationsConfiguration;
            return this;
        }
        public Builder recommendationsConfiguration(@Nullable List<RecommendationConfigurationPropertiesArgs> recommendationsConfiguration) {
            this.recommendationsConfiguration = Output.ofNullable(recommendationsConfiguration);
            return this;
        }
        public Builder recommendationsConfiguration(RecommendationConfigurationPropertiesArgs... recommendationsConfiguration) {
            return recommendationsConfiguration(List.of(recommendationsConfiguration));
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder solutionName(@Nullable Output<String> solutionName) {
            this.solutionName = solutionName;
            return this;
        }
        public Builder solutionName(@Nullable String solutionName) {
            this.solutionName = Output.ofNullable(solutionName);
            return this;
        }
        public Builder status(@Nullable Output<Either<String,SecuritySolutionStatus>> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable Either<String,SecuritySolutionStatus> status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder unmaskedIpLoggingStatus(@Nullable Output<Either<String,UnmaskedIpLoggingStatus>> unmaskedIpLoggingStatus) {
            this.unmaskedIpLoggingStatus = unmaskedIpLoggingStatus;
            return this;
        }
        public Builder unmaskedIpLoggingStatus(@Nullable Either<String,UnmaskedIpLoggingStatus> unmaskedIpLoggingStatus) {
            this.unmaskedIpLoggingStatus = Output.ofNullable(unmaskedIpLoggingStatus);
            return this;
        }
        public Builder userDefinedResources(@Nullable Output<UserDefinedResourcesPropertiesArgs> userDefinedResources) {
            this.userDefinedResources = userDefinedResources;
            return this;
        }
        public Builder userDefinedResources(@Nullable UserDefinedResourcesPropertiesArgs userDefinedResources) {
            this.userDefinedResources = Output.ofNullable(userDefinedResources);
            return this;
        }
        public Builder workspace(@Nullable Output<String> workspace) {
            this.workspace = workspace;
            return this;
        }
        public Builder workspace(@Nullable String workspace) {
            this.workspace = Output.ofNullable(workspace);
            return this;
        }        public IotSecuritySolutionArgs build() {
            return new IotSecuritySolutionArgs(additionalWorkspaces, disabledDataSources, displayName, export, iotHubs, location, recommendationsConfiguration, resourceGroupName, solutionName, status, tags, unmaskedIpLoggingStatus, userDefinedResources, workspace);
        }
    }
}
