// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.extendedlocation;

import io.pulumi.azurenative.extendedlocation.enums.HostType;
import io.pulumi.azurenative.extendedlocation.inputs.CustomLocationPropertiesAuthenticationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomLocationArgs Empty = new CustomLocationArgs();

    /**
     * This is optional input that contains the authentication that should be used to generate the namespace.
     * 
     */
    @InputImport(name="authentication")
      private final @Nullable Input<CustomLocationPropertiesAuthenticationArgs> authentication;

    public Input<CustomLocationPropertiesAuthenticationArgs> getAuthentication() {
        return this.authentication == null ? Input.empty() : this.authentication;
    }

    /**
     * Contains the reference to the add-on that contains charts to deploy CRDs and operators.
     * 
     */
    @InputImport(name="clusterExtensionIds")
      private final @Nullable Input<List<String>> clusterExtensionIds;

    public Input<List<String>> getClusterExtensionIds() {
        return this.clusterExtensionIds == null ? Input.empty() : this.clusterExtensionIds;
    }

    /**
     * Display name for the Custom Locations location.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Connected Cluster or AKS Cluster. The Custom Locations RP will perform a checkAccess API for listAdminCredentials permissions.
     * 
     */
    @InputImport(name="hostResourceId")
      private final @Nullable Input<String> hostResourceId;

    public Input<String> getHostResourceId() {
        return this.hostResourceId == null ? Input.empty() : this.hostResourceId;
    }

    /**
     * Type of host the Custom Locations is referencing (Kubernetes, etc...).
     * 
     */
    @InputImport(name="hostType")
      private final @Nullable Input<Either<String,HostType>> hostType;

    public Input<Either<String,HostType>> getHostType() {
        return this.hostType == null ? Input.empty() : this.hostType;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Kubernetes namespace that will be created on the specified cluster.
     * 
     */
    @InputImport(name="namespace")
      private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    /**
     * Provisioning State for the Custom Location.
     * 
     */
    @InputImport(name="provisioningState")
      private final @Nullable Input<String> provisioningState;

    public Input<String> getProvisioningState() {
        return this.provisioningState == null ? Input.empty() : this.provisioningState;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Custom Locations name.
     * 
     */
    @InputImport(name="resourceName")
      private final @Nullable Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName == null ? Input.empty() : this.resourceName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public CustomLocationArgs(
        @Nullable Input<CustomLocationPropertiesAuthenticationArgs> authentication,
        @Nullable Input<List<String>> clusterExtensionIds,
        @Nullable Input<String> displayName,
        @Nullable Input<String> hostResourceId,
        @Nullable Input<Either<String,HostType>> hostType,
        @Nullable Input<String> location,
        @Nullable Input<String> namespace,
        @Nullable Input<String> provisioningState,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceName,
        @Nullable Input<Map<String,String>> tags) {
        this.authentication = authentication;
        this.clusterExtensionIds = clusterExtensionIds;
        this.displayName = displayName;
        this.hostResourceId = hostResourceId;
        this.hostType = hostType;
        this.location = location;
        this.namespace = namespace;
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.tags = tags;
    }

    private CustomLocationArgs() {
        this.authentication = Input.empty();
        this.clusterExtensionIds = Input.empty();
        this.displayName = Input.empty();
        this.hostResourceId = Input.empty();
        this.hostType = Input.empty();
        this.location = Input.empty();
        this.namespace = Input.empty();
        this.provisioningState = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CustomLocationPropertiesAuthenticationArgs> authentication;
        private @Nullable Input<List<String>> clusterExtensionIds;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> hostResourceId;
        private @Nullable Input<Either<String,HostType>> hostType;
        private @Nullable Input<String> location;
        private @Nullable Input<String> namespace;
        private @Nullable Input<String> provisioningState;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.clusterExtensionIds = defaults.clusterExtensionIds;
    	      this.displayName = defaults.displayName;
    	      this.hostResourceId = defaults.hostResourceId;
    	      this.hostType = defaults.hostType;
    	      this.location = defaults.location;
    	      this.namespace = defaults.namespace;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.tags = defaults.tags;
        }

        public Builder setAuthentication(@Nullable Input<CustomLocationPropertiesAuthenticationArgs> authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder setAuthentication(@Nullable CustomLocationPropertiesAuthenticationArgs authentication) {
            this.authentication = Input.ofNullable(authentication);
            return this;
        }

        public Builder setClusterExtensionIds(@Nullable Input<List<String>> clusterExtensionIds) {
            this.clusterExtensionIds = clusterExtensionIds;
            return this;
        }

        public Builder setClusterExtensionIds(@Nullable List<String> clusterExtensionIds) {
            this.clusterExtensionIds = Input.ofNullable(clusterExtensionIds);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setHostResourceId(@Nullable Input<String> hostResourceId) {
            this.hostResourceId = hostResourceId;
            return this;
        }

        public Builder setHostResourceId(@Nullable String hostResourceId) {
            this.hostResourceId = Input.ofNullable(hostResourceId);
            return this;
        }

        public Builder setHostType(@Nullable Input<Either<String,HostType>> hostType) {
            this.hostType = hostType;
            return this;
        }

        public Builder setHostType(@Nullable Either<String,HostType> hostType) {
            this.hostType = Input.ofNullable(hostType);
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

        public Builder setNamespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }

        public Builder setProvisioningState(@Nullable Input<String> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = Input.ofNullable(provisioningState);
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

        public Builder setResourceName(@Nullable Input<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder setResourceName(@Nullable String resourceName) {
            this.resourceName = Input.ofNullable(resourceName);
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
        public CustomLocationArgs build() {
            return new CustomLocationArgs(authentication, clusterExtensionIds, displayName, hostResourceId, hostType, location, namespace, provisioningState, resourceGroupName, resourceName, tags);
        }
    }
}