// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice;

import io.pulumi.azurenative.containerservice.inputs.PrivateEndpointArgs;
import io.pulumi.azurenative.containerservice.inputs.PrivateLinkServiceConnectionStateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * The resource of private endpoint.
     * 
     */
    @InputImport(name="privateEndpoint")
      private final @Nullable Input<PrivateEndpointArgs> privateEndpoint;

    public Input<PrivateEndpointArgs> getPrivateEndpoint() {
        return this.privateEndpoint == null ? Input.empty() : this.privateEndpoint;
    }

    /**
     * The name of the private endpoint connection.
     * 
     */
    @InputImport(name="privateEndpointConnectionName")
      private final @Nullable Input<String> privateEndpointConnectionName;

    public Input<String> getPrivateEndpointConnectionName() {
        return this.privateEndpointConnectionName == null ? Input.empty() : this.privateEndpointConnectionName;
    }

    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @InputImport(name="privateLinkServiceConnectionState", required=true)
      private final Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    public Input<PrivateLinkServiceConnectionStateArgs> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
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
     * The name of the managed cluster resource.
     * 
     */
    @InputImport(name="resourceName", required=true)
      private final Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName;
    }

    public PrivateEndpointConnectionArgs(
        @Nullable Input<PrivateEndpointArgs> privateEndpoint,
        @Nullable Input<String> privateEndpointConnectionName,
        Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState,
        Input<String> resourceGroupName,
        Input<String> resourceName) {
        this.privateEndpoint = privateEndpoint;
        this.privateEndpointConnectionName = privateEndpointConnectionName;
        this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState, "expected parameter 'privateLinkServiceConnectionState' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private PrivateEndpointConnectionArgs() {
        this.privateEndpoint = Input.empty();
        this.privateEndpointConnectionName = Input.empty();
        this.privateLinkServiceConnectionState = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PrivateEndpointArgs> privateEndpoint;
        private @Nullable Input<String> privateEndpointConnectionName;
        private Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;
        private Input<String> resourceGroupName;
        private Input<String> resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder setPrivateEndpoint(@Nullable Input<PrivateEndpointArgs> privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateEndpoint(@Nullable PrivateEndpointArgs privateEndpoint) {
            this.privateEndpoint = Input.ofNullable(privateEndpoint);
            return this;
        }

        public Builder setPrivateEndpointConnectionName(@Nullable Input<String> privateEndpointConnectionName) {
            this.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        public Builder setPrivateEndpointConnectionName(@Nullable String privateEndpointConnectionName) {
            this.privateEndpointConnectionName = Input.ofNullable(privateEndpointConnectionName);
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState);
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionStateArgs privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Input.of(Objects.requireNonNull(privateLinkServiceConnectionState));
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

        public Builder setResourceName(Input<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Input.of(Objects.requireNonNull(resourceName));
            return this;
        }
        public PrivateEndpointConnectionArgs build() {
            return new PrivateEndpointConnectionArgs(privateEndpoint, privateEndpointConnectionName, privateLinkServiceConnectionState, resourceGroupName, resourceName);
        }
    }
}