// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.ConfigurationType;
import io.pulumi.azurenative.network.inputs.NetworkManagerPropertiesNetworkManagerScopesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkManagerArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkManagerArgs Empty = new NetworkManagerArgs();

    /**
     * A description of the network manager.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A friendly name for the network manager.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the network manager.
     * 
     */
    @InputImport(name="networkManagerName")
      private final @Nullable Input<String> networkManagerName;

    public Input<String> getNetworkManagerName() {
        return this.networkManagerName == null ? Input.empty() : this.networkManagerName;
    }

    /**
     * Scope Access.
     * 
     */
    @InputImport(name="networkManagerScopeAccesses")
      private final @Nullable Input<List<Either<String,ConfigurationType>>> networkManagerScopeAccesses;

    public Input<List<Either<String,ConfigurationType>>> getNetworkManagerScopeAccesses() {
        return this.networkManagerScopeAccesses == null ? Input.empty() : this.networkManagerScopeAccesses;
    }

    /**
     * Scope of Network Manager.
     * 
     */
    @InputImport(name="networkManagerScopes")
      private final @Nullable Input<NetworkManagerPropertiesNetworkManagerScopesArgs> networkManagerScopes;

    public Input<NetworkManagerPropertiesNetworkManagerScopesArgs> getNetworkManagerScopes() {
        return this.networkManagerScopes == null ? Input.empty() : this.networkManagerScopes;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
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

    public NetworkManagerArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<String> id,
        @Nullable Input<String> location,
        @Nullable Input<String> networkManagerName,
        @Nullable Input<List<Either<String,ConfigurationType>>> networkManagerScopeAccesses,
        @Nullable Input<NetworkManagerPropertiesNetworkManagerScopesArgs> networkManagerScopes,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.description = description;
        this.displayName = displayName;
        this.id = id;
        this.location = location;
        this.networkManagerName = networkManagerName;
        this.networkManagerScopeAccesses = networkManagerScopeAccesses;
        this.networkManagerScopes = networkManagerScopes;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private NetworkManagerArgs() {
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.id = Input.empty();
        this.location = Input.empty();
        this.networkManagerName = Input.empty();
        this.networkManagerScopeAccesses = Input.empty();
        this.networkManagerScopes = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkManagerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> id;
        private @Nullable Input<String> location;
        private @Nullable Input<String> networkManagerName;
        private @Nullable Input<List<Either<String,ConfigurationType>>> networkManagerScopeAccesses;
        private @Nullable Input<NetworkManagerPropertiesNetworkManagerScopesArgs> networkManagerScopes;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkManagerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.networkManagerName = defaults.networkManagerName;
    	      this.networkManagerScopeAccesses = defaults.networkManagerScopeAccesses;
    	      this.networkManagerScopes = defaults.networkManagerScopes;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
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

        public Builder setNetworkManagerName(@Nullable Input<String> networkManagerName) {
            this.networkManagerName = networkManagerName;
            return this;
        }

        public Builder setNetworkManagerName(@Nullable String networkManagerName) {
            this.networkManagerName = Input.ofNullable(networkManagerName);
            return this;
        }

        public Builder setNetworkManagerScopeAccesses(@Nullable Input<List<Either<String,ConfigurationType>>> networkManagerScopeAccesses) {
            this.networkManagerScopeAccesses = networkManagerScopeAccesses;
            return this;
        }

        public Builder setNetworkManagerScopeAccesses(@Nullable List<Either<String,ConfigurationType>> networkManagerScopeAccesses) {
            this.networkManagerScopeAccesses = Input.ofNullable(networkManagerScopeAccesses);
            return this;
        }

        public Builder setNetworkManagerScopes(@Nullable Input<NetworkManagerPropertiesNetworkManagerScopesArgs> networkManagerScopes) {
            this.networkManagerScopes = networkManagerScopes;
            return this;
        }

        public Builder setNetworkManagerScopes(@Nullable NetworkManagerPropertiesNetworkManagerScopesArgs networkManagerScopes) {
            this.networkManagerScopes = Input.ofNullable(networkManagerScopes);
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public NetworkManagerArgs build() {
            return new NetworkManagerArgs(description, displayName, id, location, networkManagerName, networkManagerScopeAccesses, networkManagerScopes, resourceGroupName, tags);
        }
    }
}