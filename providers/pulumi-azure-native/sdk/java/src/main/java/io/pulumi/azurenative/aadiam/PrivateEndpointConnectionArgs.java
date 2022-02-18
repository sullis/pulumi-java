// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aadiam;

import io.pulumi.azurenative.aadiam.inputs.PrivateEndpointArgs;
import io.pulumi.azurenative.aadiam.inputs.PrivateLinkServiceConnectionStateArgs;
import io.pulumi.azurenative.aadiam.inputs.TagsResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * The name of the private link policy in Azure AD.
     * 
     */
    @InputImport(name="policyName", required=true)
    private final Input<String> policyName;

    public Input<String> getPolicyName() {
        return this.policyName;
    }

    /**
     * Properties of the private endpoint object.
     * 
     */
    @InputImport(name="privateEndpoint")
    private final @Nullable Input<PrivateEndpointArgs> privateEndpoint;

    public Input<PrivateEndpointArgs> getPrivateEndpoint() {
        return this.privateEndpoint == null ? Input.empty() : this.privateEndpoint;
    }

    /**
     * The PrivateEndpointConnection name.
     * 
     */
    @InputImport(name="privateEndpointConnectionName")
    private final @Nullable Input<String> privateEndpointConnectionName;

    public Input<String> getPrivateEndpointConnectionName() {
        return this.privateEndpointConnectionName == null ? Input.empty() : this.privateEndpointConnectionName;
    }

    /**
     * Updated tag information to set into the PrivateLinkConnection instance.
     * 
     */
    @InputImport(name="privateLinkConnectionTags")
    private final @Nullable Input<TagsResourceArgs> privateLinkConnectionTags;

    public Input<TagsResourceArgs> getPrivateLinkConnectionTags() {
        return this.privateLinkConnectionTags == null ? Input.empty() : this.privateLinkConnectionTags;
    }

    /**
     * Approval state of the private link connection.
     * 
     */
    @InputImport(name="privateLinkServiceConnectionState")
    private final @Nullable Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    public Input<PrivateLinkServiceConnectionStateArgs> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Input.empty() : this.privateLinkServiceConnectionState;
    }

    /**
     * Name of an Azure resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public PrivateEndpointConnectionArgs(
        Input<String> policyName,
        @Nullable Input<PrivateEndpointArgs> privateEndpoint,
        @Nullable Input<String> privateEndpointConnectionName,
        @Nullable Input<TagsResourceArgs> privateLinkConnectionTags,
        @Nullable Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState,
        Input<String> resourceGroupName) {
        this.policyName = Objects.requireNonNull(policyName, "expected parameter 'policyName' to be non-null");
        this.privateEndpoint = privateEndpoint;
        this.privateEndpointConnectionName = privateEndpointConnectionName;
        this.privateLinkConnectionTags = privateLinkConnectionTags;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private PrivateEndpointConnectionArgs() {
        this.policyName = Input.empty();
        this.privateEndpoint = Input.empty();
        this.privateEndpointConnectionName = Input.empty();
        this.privateLinkConnectionTags = Input.empty();
        this.privateLinkServiceConnectionState = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> policyName;
        private @Nullable Input<PrivateEndpointArgs> privateEndpoint;
        private @Nullable Input<String> privateEndpointConnectionName;
        private @Nullable Input<TagsResourceArgs> privateLinkConnectionTags;
        private @Nullable Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyName = defaults.policyName;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.privateLinkConnectionTags = defaults.privateLinkConnectionTags;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setPolicyName(Input<String> policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }

        public Builder setPolicyName(String policyName) {
            this.policyName = Input.of(Objects.requireNonNull(policyName));
            return this;
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

        public Builder setPrivateLinkConnectionTags(@Nullable Input<TagsResourceArgs> privateLinkConnectionTags) {
            this.privateLinkConnectionTags = privateLinkConnectionTags;
            return this;
        }

        public Builder setPrivateLinkConnectionTags(@Nullable TagsResourceArgs privateLinkConnectionTags) {
            this.privateLinkConnectionTags = Input.ofNullable(privateLinkConnectionTags);
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateArgs privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Input.ofNullable(privateLinkServiceConnectionState);
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

        public PrivateEndpointConnectionArgs build() {
            return new PrivateEndpointConnectionArgs(policyName, privateEndpoint, privateEndpointConnectionName, privateLinkConnectionTags, privateLinkServiceConnectionState, resourceGroupName);
        }
    }
}
