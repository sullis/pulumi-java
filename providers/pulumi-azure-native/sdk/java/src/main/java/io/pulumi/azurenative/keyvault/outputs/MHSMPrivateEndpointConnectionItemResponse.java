// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.outputs;

import io.pulumi.azurenative.keyvault.outputs.MHSMPrivateEndpointResponse;
import io.pulumi.azurenative.keyvault.outputs.MHSMPrivateLinkServiceConnectionStateResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MHSMPrivateEndpointConnectionItemResponse {
    /**
     * Properties of the private endpoint object.
     * 
     */
    private final @Nullable MHSMPrivateEndpointResponse privateEndpoint;
    /**
     * Approval state of the private link connection.
     * 
     */
    private final @Nullable MHSMPrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
    /**
     * Provisioning state of the private endpoint connection.
     * 
     */
    private final String provisioningState;

    @OutputCustomType.Constructor({"privateEndpoint","privateLinkServiceConnectionState","provisioningState"})
    private MHSMPrivateEndpointConnectionItemResponse(
        @Nullable MHSMPrivateEndpointResponse privateEndpoint,
        @Nullable MHSMPrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState,
        String provisioningState) {
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = Objects.requireNonNull(provisioningState);
    }

    /**
     * Properties of the private endpoint object.
     * 
     */
    public Optional<MHSMPrivateEndpointResponse> getPrivateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * Approval state of the private link connection.
     * 
     */
    public Optional<MHSMPrivateLinkServiceConnectionStateResponse> getPrivateLinkServiceConnectionState() {
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

    public static Builder builder(MHSMPrivateEndpointConnectionItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MHSMPrivateEndpointResponse privateEndpoint;
        private @Nullable MHSMPrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(MHSMPrivateEndpointConnectionItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setPrivateEndpoint(@Nullable MHSMPrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable MHSMPrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public MHSMPrivateEndpointConnectionItemResponse build() {
            return new MHSMPrivateEndpointConnectionItemResponse(privateEndpoint, privateLinkServiceConnectionState, provisioningState);
        }
    }
}
