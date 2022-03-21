// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maintenance;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationAssignmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationAssignmentArgs Empty = new ConfigurationAssignmentArgs();

    /**
     * Configuration assignment name
     * 
     */
    @Import(name="configurationAssignmentName")
      private final @Nullable Output<String> configurationAssignmentName;

    public Output<String> getConfigurationAssignmentName() {
        return this.configurationAssignmentName == null ? Output.empty() : this.configurationAssignmentName;
    }

    /**
     * Location of the resource
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The maintenance configuration Id
     * 
     */
    @Import(name="maintenanceConfigurationId")
      private final @Nullable Output<String> maintenanceConfigurationId;

    public Output<String> getMaintenanceConfigurationId() {
        return this.maintenanceConfigurationId == null ? Output.empty() : this.maintenanceConfigurationId;
    }

    /**
     * Resource provider name
     * 
     */
    @Import(name="providerName", required=true)
      private final Output<String> providerName;

    public Output<String> getProviderName() {
        return this.providerName;
    }

    /**
     * Resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The unique resourceId
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId == null ? Output.empty() : this.resourceId;
    }

    /**
     * Resource identifier
     * 
     */
    @Import(name="resourceName", required=true)
      private final Output<String> resourceName;

    public Output<String> getPropResourceName() {
        return this.resourceName;
    }

    /**
     * Resource type
     * 
     */
    @Import(name="resourceType", required=true)
      private final Output<String> resourceType;

    public Output<String> getPropResourceType() {
        return this.resourceType;
    }

    public ConfigurationAssignmentArgs(
        @Nullable Output<String> configurationAssignmentName,
        @Nullable Output<String> location,
        @Nullable Output<String> maintenanceConfigurationId,
        Output<String> providerName,
        Output<String> resourceGroupName,
        @Nullable Output<String> resourceId,
        Output<String> resourceName,
        Output<String> resourceType) {
        this.configurationAssignmentName = configurationAssignmentName;
        this.location = location;
        this.maintenanceConfigurationId = maintenanceConfigurationId;
        this.providerName = Objects.requireNonNull(providerName, "expected parameter 'providerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceId = resourceId;
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
    }

    private ConfigurationAssignmentArgs() {
        this.configurationAssignmentName = Output.empty();
        this.location = Output.empty();
        this.maintenanceConfigurationId = Output.empty();
        this.providerName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.resourceId = Output.empty();
        this.resourceName = Output.empty();
        this.resourceType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> configurationAssignmentName;
        private @Nullable Output<String> location;
        private @Nullable Output<String> maintenanceConfigurationId;
        private Output<String> providerName;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> resourceId;
        private Output<String> resourceName;
        private Output<String> resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationAssignmentName = defaults.configurationAssignmentName;
    	      this.location = defaults.location;
    	      this.maintenanceConfigurationId = defaults.maintenanceConfigurationId;
    	      this.providerName = defaults.providerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceName = defaults.resourceName;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder configurationAssignmentName(@Nullable Output<String> configurationAssignmentName) {
            this.configurationAssignmentName = configurationAssignmentName;
            return this;
        }
        public Builder configurationAssignmentName(@Nullable String configurationAssignmentName) {
            this.configurationAssignmentName = Output.ofNullable(configurationAssignmentName);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder maintenanceConfigurationId(@Nullable Output<String> maintenanceConfigurationId) {
            this.maintenanceConfigurationId = maintenanceConfigurationId;
            return this;
        }
        public Builder maintenanceConfigurationId(@Nullable String maintenanceConfigurationId) {
            this.maintenanceConfigurationId = Output.ofNullable(maintenanceConfigurationId);
            return this;
        }
        public Builder providerName(Output<String> providerName) {
            this.providerName = Objects.requireNonNull(providerName);
            return this;
        }
        public Builder providerName(String providerName) {
            this.providerName = Output.of(Objects.requireNonNull(providerName));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Output.ofNullable(resourceId);
            return this;
        }
        public Builder resourceName(Output<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Output.of(Objects.requireNonNull(resourceName));
            return this;
        }
        public Builder resourceType(Output<String> resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Output.of(Objects.requireNonNull(resourceType));
            return this;
        }        public ConfigurationAssignmentArgs build() {
            return new ConfigurationAssignmentArgs(configurationAssignmentName, location, maintenanceConfigurationId, providerName, resourceGroupName, resourceId, resourceName, resourceType);
        }
    }
}
