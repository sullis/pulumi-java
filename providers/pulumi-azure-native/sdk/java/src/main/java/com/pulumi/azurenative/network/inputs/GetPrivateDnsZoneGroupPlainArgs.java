// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateDnsZoneGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateDnsZoneGroupPlainArgs Empty = new GetPrivateDnsZoneGroupPlainArgs();

    /**
     * The name of the private dns zone group.
     * 
     */
    @Import(name="privateDnsZoneGroupName", required=true)
    private String privateDnsZoneGroupName;

    /**
     * @return The name of the private dns zone group.
     * 
     */
    public String privateDnsZoneGroupName() {
        return this.privateDnsZoneGroupName;
    }

    /**
     * The name of the private endpoint.
     * 
     */
    @Import(name="privateEndpointName", required=true)
    private String privateEndpointName;

    /**
     * @return The name of the private endpoint.
     * 
     */
    public String privateEndpointName() {
        return this.privateEndpointName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPrivateDnsZoneGroupPlainArgs() {}

    private GetPrivateDnsZoneGroupPlainArgs(GetPrivateDnsZoneGroupPlainArgs $) {
        this.privateDnsZoneGroupName = $.privateDnsZoneGroupName;
        this.privateEndpointName = $.privateEndpointName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateDnsZoneGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateDnsZoneGroupPlainArgs $;

        public Builder() {
            $ = new GetPrivateDnsZoneGroupPlainArgs();
        }

        public Builder(GetPrivateDnsZoneGroupPlainArgs defaults) {
            $ = new GetPrivateDnsZoneGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateDnsZoneGroupName The name of the private dns zone group.
         * 
         * @return builder
         * 
         */
        public Builder privateDnsZoneGroupName(String privateDnsZoneGroupName) {
            $.privateDnsZoneGroupName = privateDnsZoneGroupName;
            return this;
        }

        /**
         * @param privateEndpointName The name of the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointName(String privateEndpointName) {
            $.privateEndpointName = privateEndpointName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetPrivateDnsZoneGroupPlainArgs build() {
            $.privateDnsZoneGroupName = Objects.requireNonNull($.privateDnsZoneGroupName, "expected parameter 'privateDnsZoneGroupName' to be non-null");
            $.privateEndpointName = Objects.requireNonNull($.privateEndpointName, "expected parameter 'privateEndpointName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
