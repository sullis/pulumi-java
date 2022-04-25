// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.powerbi.inputs;

import com.pulumi.azurenative.powerbi.enums.ResourceProvisioningState;
import com.pulumi.azurenative.powerbi.inputs.ConnectionStateArgs;
import com.pulumi.azurenative.powerbi.inputs.PrivateEndpointArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * Specifies the private endpoint.
     * 
     */
    @Import(name="privateEndpoint")
    private @Nullable Output<PrivateEndpointArgs> privateEndpoint;

    /**
     * @return Specifies the private endpoint.
     * 
     */
    public Optional<Output<PrivateEndpointArgs>> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }

    /**
     * Specifies the connection state.
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
    private @Nullable Output<ConnectionStateArgs> privateLinkServiceConnectionState;

    /**
     * @return Specifies the connection state.
     * 
     */
    public Optional<Output<ConnectionStateArgs>> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    /**
     * Provisioning state of the Private Endpoint Connection.
     * 
     */
    @Import(name="provisioningState")
    private @Nullable Output<Either<String,ResourceProvisioningState>> provisioningState;

    /**
     * @return Provisioning state of the Private Endpoint Connection.
     * 
     */
    public Optional<Output<Either<String,ResourceProvisioningState>>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    private PrivateEndpointConnectionArgs() {}

    private PrivateEndpointConnectionArgs(PrivateEndpointConnectionArgs $) {
        this.privateEndpoint = $.privateEndpoint;
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
        this.provisioningState = $.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointConnectionArgs $;

        public Builder() {
            $ = new PrivateEndpointConnectionArgs();
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
            $ = new PrivateEndpointConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateEndpoint Specifies the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoint(@Nullable Output<PrivateEndpointArgs> privateEndpoint) {
            $.privateEndpoint = privateEndpoint;
            return this;
        }

        /**
         * @param privateEndpoint Specifies the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoint(PrivateEndpointArgs privateEndpoint) {
            return privateEndpoint(Output.of(privateEndpoint));
        }

        /**
         * @param privateLinkServiceConnectionState Specifies the connection state.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(@Nullable Output<ConnectionStateArgs> privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        /**
         * @param privateLinkServiceConnectionState Specifies the connection state.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(ConnectionStateArgs privateLinkServiceConnectionState) {
            return privateLinkServiceConnectionState(Output.of(privateLinkServiceConnectionState));
        }

        /**
         * @param provisioningState Provisioning state of the Private Endpoint Connection.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(@Nullable Output<Either<String,ResourceProvisioningState>> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param provisioningState Provisioning state of the Private Endpoint Connection.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(Either<String,ResourceProvisioningState> provisioningState) {
            return provisioningState(Output.of(provisioningState));
        }

        /**
         * @param provisioningState Provisioning state of the Private Endpoint Connection.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            return provisioningState(Either.ofLeft(provisioningState));
        }

        /**
         * @param provisioningState Provisioning state of the Private Endpoint Connection.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(ResourceProvisioningState provisioningState) {
            return provisioningState(Either.ofRight(provisioningState));
        }

        public PrivateEndpointConnectionArgs build() {
            return $;
        }
    }

}
