// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.search.inputs;

import com.pulumi.azurenative.search.inputs.PrivateEndpointConnectionPropertiesResponsePrivateEndpoint;
import com.pulumi.azurenative.search.inputs.PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the properties of an existing Private Endpoint connection to the Azure Cognitive Search service.
 * 
 */
public final class PrivateEndpointConnectionPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointConnectionPropertiesResponse Empty = new PrivateEndpointConnectionPropertiesResponse();

    /**
     * The private endpoint resource from Microsoft.Network provider.
     * 
     */
    @Import(name="privateEndpoint")
    private @Nullable PrivateEndpointConnectionPropertiesResponsePrivateEndpoint privateEndpoint;

    /**
     * @return The private endpoint resource from Microsoft.Network provider.
     * 
     */
    public Optional<PrivateEndpointConnectionPropertiesResponsePrivateEndpoint> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }

    /**
     * Describes the current state of an existing Private Link Service connection to the Azure Private Endpoint.
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
    private @Nullable PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState privateLinkServiceConnectionState;

    /**
     * @return Describes the current state of an existing Private Link Service connection to the Azure Private Endpoint.
     * 
     */
    public Optional<PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    private PrivateEndpointConnectionPropertiesResponse() {}

    private PrivateEndpointConnectionPropertiesResponse(PrivateEndpointConnectionPropertiesResponse $) {
        this.privateEndpoint = $.privateEndpoint;
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointConnectionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointConnectionPropertiesResponse $;

        public Builder() {
            $ = new PrivateEndpointConnectionPropertiesResponse();
        }

        public Builder(PrivateEndpointConnectionPropertiesResponse defaults) {
            $ = new PrivateEndpointConnectionPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateEndpoint The private endpoint resource from Microsoft.Network provider.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoint(@Nullable PrivateEndpointConnectionPropertiesResponsePrivateEndpoint privateEndpoint) {
            $.privateEndpoint = privateEndpoint;
            return this;
        }

        /**
         * @param privateLinkServiceConnectionState Describes the current state of an existing Private Link Service connection to the Azure Private Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(@Nullable PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public PrivateEndpointConnectionPropertiesResponse build() {
            return $;
        }
    }

}
