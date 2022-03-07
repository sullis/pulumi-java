// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.PrivateEndpointPropertyResponse;
import io.pulumi.azurenative.documentdb.outputs.PrivateLinkServiceConnectionStatePropertyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PrivateEndpointConnectionResponse {
    /**
     * Group id of the private endpoint.
     * 
     */
    private final @Nullable String groupId;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Private endpoint which the connection belongs to.
     * 
     */
    private final @Nullable PrivateEndpointPropertyResponse privateEndpoint;
    /**
     * Connection State of the Private Endpoint Connection.
     * 
     */
    private final @Nullable PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState;
    /**
     * Provisioning state of the private endpoint.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"groupId","id","name","privateEndpoint","privateLinkServiceConnectionState","provisioningState","type"})
    private PrivateEndpointConnectionResponse(
        @Nullable String groupId,
        String id,
        String name,
        @Nullable PrivateEndpointPropertyResponse privateEndpoint,
        @Nullable PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState,
        @Nullable String provisioningState,
        String type) {
        this.groupId = groupId;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Group id of the private endpoint.
     * 
    */
    public Optional<String> getGroupId() {
        return Optional.ofNullable(this.groupId);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Private endpoint which the connection belongs to.
     * 
    */
    public Optional<PrivateEndpointPropertyResponse> getPrivateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * Connection State of the Private Endpoint Connection.
     * 
    */
    public Optional<PrivateLinkServiceConnectionStatePropertyResponse> getPrivateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    /**
     * Provisioning state of the private endpoint.
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String groupId;
        private String id;
        private String name;
        private @Nullable PrivateEndpointPropertyResponse privateEndpoint;
        private @Nullable PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState;
        private @Nullable String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setGroupId(@Nullable String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateEndpoint(@Nullable PrivateEndpointPropertyResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public PrivateEndpointConnectionResponse build() {
            return new PrivateEndpointConnectionResponse(groupId, id, name, privateEndpoint, privateLinkServiceConnectionState, provisioningState, type);
        }
    }
}