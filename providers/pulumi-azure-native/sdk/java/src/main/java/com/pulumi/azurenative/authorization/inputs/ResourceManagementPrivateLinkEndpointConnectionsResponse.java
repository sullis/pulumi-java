// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceManagementPrivateLinkEndpointConnectionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourceManagementPrivateLinkEndpointConnectionsResponse Empty = new ResourceManagementPrivateLinkEndpointConnectionsResponse();

    /**
     * The private endpoint connections.
     * 
     */
    @Import(name="privateEndpointConnections")
    private @Nullable List<String> privateEndpointConnections;

    /**
     * @return The private endpoint connections.
     * 
     */
    public Optional<List<String>> privateEndpointConnections() {
        return Optional.ofNullable(this.privateEndpointConnections);
    }

    private ResourceManagementPrivateLinkEndpointConnectionsResponse() {}

    private ResourceManagementPrivateLinkEndpointConnectionsResponse(ResourceManagementPrivateLinkEndpointConnectionsResponse $) {
        this.privateEndpointConnections = $.privateEndpointConnections;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceManagementPrivateLinkEndpointConnectionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceManagementPrivateLinkEndpointConnectionsResponse $;

        public Builder() {
            $ = new ResourceManagementPrivateLinkEndpointConnectionsResponse();
        }

        public Builder(ResourceManagementPrivateLinkEndpointConnectionsResponse defaults) {
            $ = new ResourceManagementPrivateLinkEndpointConnectionsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateEndpointConnections The private endpoint connections.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnections(@Nullable List<String> privateEndpointConnections) {
            $.privateEndpointConnections = privateEndpointConnections;
            return this;
        }

        /**
         * @param privateEndpointConnections The private endpoint connections.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnections(String... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }

        public ResourceManagementPrivateLinkEndpointConnectionsResponse build() {
            return $;
        }
    }

}
