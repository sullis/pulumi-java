// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.powerbi;

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
     * The name of the Azure resource.
     * 
     */
    @Import(name="azureResourceName", required=true)
    private Output<String> azureResourceName;

    /**
     * @return The name of the Azure resource.
     * 
     */
    public Output<String> azureResourceName() {
        return this.azureResourceName;
    }

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
     * The name of the private endpoint.
     * 
     */
    @Import(name="privateEndpointName")
    private @Nullable Output<String> privateEndpointName;

    /**
     * @return The name of the private endpoint.
     * 
     */
    public Optional<Output<String>> privateEndpointName() {
        return Optional.ofNullable(this.privateEndpointName);
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

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private PrivateEndpointConnectionArgs() {}

    private PrivateEndpointConnectionArgs(PrivateEndpointConnectionArgs $) {
        this.azureResourceName = $.azureResourceName;
        this.privateEndpoint = $.privateEndpoint;
        this.privateEndpointName = $.privateEndpointName;
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
        this.provisioningState = $.provisioningState;
        this.resourceGroupName = $.resourceGroupName;
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
         * @param azureResourceName The name of the Azure resource.
         * 
         * @return builder
         * 
         */
        public Builder azureResourceName(Output<String> azureResourceName) {
            $.azureResourceName = azureResourceName;
            return this;
        }

        /**
         * @param azureResourceName The name of the Azure resource.
         * 
         * @return builder
         * 
         */
        public Builder azureResourceName(String azureResourceName) {
            return azureResourceName(Output.of(azureResourceName));
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
         * @param privateEndpointName The name of the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointName(@Nullable Output<String> privateEndpointName) {
            $.privateEndpointName = privateEndpointName;
            return this;
        }

        /**
         * @param privateEndpointName The name of the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointName(String privateEndpointName) {
            return privateEndpointName(Output.of(privateEndpointName));
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

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public PrivateEndpointConnectionArgs build() {
            $.azureResourceName = Objects.requireNonNull($.azureResourceName, "expected parameter 'azureResourceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
