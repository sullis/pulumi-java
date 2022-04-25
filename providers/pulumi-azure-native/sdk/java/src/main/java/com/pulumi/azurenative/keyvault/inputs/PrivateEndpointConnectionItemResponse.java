// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault.inputs;

import com.pulumi.azurenative.keyvault.inputs.PrivateEndpointResponse;
import com.pulumi.azurenative.keyvault.inputs.PrivateLinkServiceConnectionStateResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Private endpoint connection item.
 * 
 */
public final class PrivateEndpointConnectionItemResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointConnectionItemResponse Empty = new PrivateEndpointConnectionItemResponse();

    /**
     * Modified whenever there is a change in the state of private endpoint connection.
     * 
     */
    @Import(name="etag")
    private @Nullable String etag;

    /**
     * @return Modified whenever there is a change in the state of private endpoint connection.
     * 
     */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Id of private endpoint connection.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Id of private endpoint connection.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Properties of the private endpoint object.
     * 
     */
    @Import(name="privateEndpoint")
    private @Nullable PrivateEndpointResponse privateEndpoint;

    /**
     * @return Properties of the private endpoint object.
     * 
     */
    public Optional<PrivateEndpointResponse> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }

    /**
     * Approval state of the private link connection.
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
    private @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;

    /**
     * @return Approval state of the private link connection.
     * 
     */
    public Optional<PrivateLinkServiceConnectionStateResponse> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    /**
     * Provisioning state of the private endpoint connection.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return Provisioning state of the private endpoint connection.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    private PrivateEndpointConnectionItemResponse() {}

    private PrivateEndpointConnectionItemResponse(PrivateEndpointConnectionItemResponse $) {
        this.etag = $.etag;
        this.id = $.id;
        this.privateEndpoint = $.privateEndpoint;
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
        this.provisioningState = $.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointConnectionItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointConnectionItemResponse $;

        public Builder() {
            $ = new PrivateEndpointConnectionItemResponse();
        }

        public Builder(PrivateEndpointConnectionItemResponse defaults) {
            $ = new PrivateEndpointConnectionItemResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param etag Modified whenever there is a change in the state of private endpoint connection.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable String etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param id Id of private endpoint connection.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param privateEndpoint Properties of the private endpoint object.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoint(@Nullable PrivateEndpointResponse privateEndpoint) {
            $.privateEndpoint = privateEndpoint;
            return this;
        }

        /**
         * @param privateLinkServiceConnectionState Approval state of the private link connection.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        /**
         * @param provisioningState Provisioning state of the private endpoint connection.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public PrivateEndpointConnectionItemResponse build() {
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            return $;
        }
    }

}
