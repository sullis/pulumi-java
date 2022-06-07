// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetesconfiguration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateEndpointConnectionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateEndpointConnectionPlainArgs Empty = new GetPrivateEndpointConnectionPlainArgs();

    /**
     * The name of the private endpoint connection associated with the Azure resource
     * 
     */
    @Import(name="privateEndpointConnectionName", required=true)
    private String privateEndpointConnectionName;

    /**
     * @return The name of the private endpoint connection associated with the Azure resource
     * 
     */
    public String privateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Azure Arc PrivateLinkScope resource.
     * 
     */
    @Import(name="scopeName", required=true)
    private String scopeName;

    /**
     * @return The name of the Azure Arc PrivateLinkScope resource.
     * 
     */
    public String scopeName() {
        return this.scopeName;
    }

    private GetPrivateEndpointConnectionPlainArgs() {}

    private GetPrivateEndpointConnectionPlainArgs(GetPrivateEndpointConnectionPlainArgs $) {
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.resourceGroupName = $.resourceGroupName;
        this.scopeName = $.scopeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateEndpointConnectionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateEndpointConnectionPlainArgs $;

        public Builder() {
            $ = new GetPrivateEndpointConnectionPlainArgs();
        }

        public Builder(GetPrivateEndpointConnectionPlainArgs defaults) {
            $ = new GetPrivateEndpointConnectionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure resource
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param scopeName The name of the Azure Arc PrivateLinkScope resource.
         * 
         * @return builder
         * 
         */
        public Builder scopeName(String scopeName) {
            $.scopeName = scopeName;
            return this;
        }

        public GetPrivateEndpointConnectionPlainArgs build() {
            $.privateEndpointConnectionName = Objects.requireNonNull($.privateEndpointConnectionName, "expected parameter 'privateEndpointConnectionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.scopeName = Objects.requireNonNull($.scopeName, "expected parameter 'scopeName' to be non-null");
            return $;
        }
    }

}
