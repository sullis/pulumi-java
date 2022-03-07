// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbi.inputs;

import io.pulumi.azurenative.powerbi.enums.ResourceProvisioningState;
import io.pulumi.azurenative.powerbi.inputs.ConnectionStateArgs;
import io.pulumi.azurenative.powerbi.inputs.PrivateEndpointArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * Specifies the private endpoint.
     * 
     */
    @InputImport(name="privateEndpoint")
      private final @Nullable Input<PrivateEndpointArgs> privateEndpoint;

    public Input<PrivateEndpointArgs> getPrivateEndpoint() {
        return this.privateEndpoint == null ? Input.empty() : this.privateEndpoint;
    }

    /**
     * Specifies the connection state.
     * 
     */
    @InputImport(name="privateLinkServiceConnectionState")
      private final @Nullable Input<ConnectionStateArgs> privateLinkServiceConnectionState;

    public Input<ConnectionStateArgs> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Input.empty() : this.privateLinkServiceConnectionState;
    }

    /**
     * Provisioning state of the Private Endpoint Connection.
     * 
     */
    @InputImport(name="provisioningState")
      private final @Nullable Input<Either<String,ResourceProvisioningState>> provisioningState;

    public Input<Either<String,ResourceProvisioningState>> getProvisioningState() {
        return this.provisioningState == null ? Input.empty() : this.provisioningState;
    }

    public PrivateEndpointConnectionArgs(
        @Nullable Input<PrivateEndpointArgs> privateEndpoint,
        @Nullable Input<ConnectionStateArgs> privateLinkServiceConnectionState,
        @Nullable Input<Either<String,ResourceProvisioningState>> provisioningState) {
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
    }

    private PrivateEndpointConnectionArgs() {
        this.privateEndpoint = Input.empty();
        this.privateLinkServiceConnectionState = Input.empty();
        this.provisioningState = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PrivateEndpointArgs> privateEndpoint;
        private @Nullable Input<ConnectionStateArgs> privateLinkServiceConnectionState;
        private @Nullable Input<Either<String,ResourceProvisioningState>> provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setPrivateEndpoint(@Nullable Input<PrivateEndpointArgs> privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateEndpoint(@Nullable PrivateEndpointArgs privateEndpoint) {
            this.privateEndpoint = Input.ofNullable(privateEndpoint);
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable Input<ConnectionStateArgs> privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable ConnectionStateArgs privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Input.ofNullable(privateLinkServiceConnectionState);
            return this;
        }

        public Builder setProvisioningState(@Nullable Input<Either<String,ResourceProvisioningState>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setProvisioningState(@Nullable Either<String,ResourceProvisioningState> provisioningState) {
            this.provisioningState = Input.ofNullable(provisioningState);
            return this;
        }
        public PrivateEndpointConnectionArgs build() {
            return new PrivateEndpointConnectionArgs(privateEndpoint, privateLinkServiceConnectionState, provisioningState);
        }
    }
}