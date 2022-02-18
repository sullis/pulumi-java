// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.PrivateEndpointResponse;
import io.pulumi.azurenative.recoveryservices.inputs.VaultPrivateLinkServiceConnectionStateResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Private Endpoint Connection Response Properties.
 * 
 */
public final class VaultPrivateEndpointConnectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final VaultPrivateEndpointConnectionResponse Empty = new VaultPrivateEndpointConnectionResponse();

    /**
     * The Private Endpoint network resource that is linked to the Private Endpoint connection.
     * 
     */
    @InputImport(name="privateEndpoint", required=true)
    private final PrivateEndpointResponse privateEndpoint;

    public PrivateEndpointResponse getPrivateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Gets or sets private link service connection state.
     * 
     */
    @InputImport(name="privateLinkServiceConnectionState", required=true)
    private final VaultPrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;

    public VaultPrivateLinkServiceConnectionStateResponse getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Gets or sets provisioning state of the private endpoint connection.
     * 
     */
    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    public VaultPrivateEndpointConnectionResponse(
        PrivateEndpointResponse privateEndpoint,
        VaultPrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState,
        String provisioningState) {
        this.privateEndpoint = Objects.requireNonNull(privateEndpoint, "expected parameter 'privateEndpoint' to be non-null");
        this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState, "expected parameter 'privateLinkServiceConnectionState' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private VaultPrivateEndpointConnectionResponse() {
        this.privateEndpoint = null;
        this.privateLinkServiceConnectionState = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultPrivateEndpointConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointResponse privateEndpoint;
        private VaultPrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultPrivateEndpointConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setPrivateEndpoint(PrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = Objects.requireNonNull(privateEndpoint);
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(VaultPrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public VaultPrivateEndpointConnectionResponse build() {
            return new VaultPrivateEndpointConnectionResponse(privateEndpoint, privateLinkServiceConnectionState, provisioningState);
        }
    }
}
