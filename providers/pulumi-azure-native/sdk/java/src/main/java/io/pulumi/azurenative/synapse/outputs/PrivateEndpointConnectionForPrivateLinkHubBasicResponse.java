// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.azurenative.synapse.outputs.PrivateEndpointResponse;
import io.pulumi.azurenative.synapse.outputs.PrivateLinkServiceConnectionStateResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PrivateEndpointConnectionForPrivateLinkHubBasicResponse {
    /**
     * identifier
     * 
     */
    private final String id;
    /**
     * The private endpoint which the connection belongs to.
     * 
     */
    private final @Nullable PrivateEndpointResponse privateEndpoint;
    /**
     * Connection state of the private endpoint connection.
     * 
     */
    private final @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
    /**
     * Provisioning state of the private endpoint connection.
     * 
     */
    private final String provisioningState;

    @OutputCustomType.Constructor({"id","privateEndpoint","privateLinkServiceConnectionState","provisioningState"})
    private PrivateEndpointConnectionForPrivateLinkHubBasicResponse(
        String id,
        @Nullable PrivateEndpointResponse privateEndpoint,
        @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState,
        String provisioningState) {
        this.id = Objects.requireNonNull(id);
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = Objects.requireNonNull(provisioningState);
    }

    /**
     * identifier
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The private endpoint which the connection belongs to.
     * 
    */
    public Optional<PrivateEndpointResponse> getPrivateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * Connection state of the private endpoint connection.
     * 
    */
    public Optional<PrivateLinkServiceConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    /**
     * Provisioning state of the private endpoint connection.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionForPrivateLinkHubBasicResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable PrivateEndpointResponse privateEndpoint;
        private @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionForPrivateLinkHubBasicResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setPrivateEndpoint(@Nullable PrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public PrivateEndpointConnectionForPrivateLinkHubBasicResponse build() {
            return new PrivateEndpointConnectionForPrivateLinkHubBasicResponse(id, privateEndpoint, privateLinkServiceConnectionState, provisioningState);
        }
    }
}