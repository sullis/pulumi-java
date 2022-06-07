// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWorkloadNetworkDhcpPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkloadNetworkDhcpPlainArgs Empty = new GetWorkloadNetworkDhcpPlainArgs();

    /**
     * NSX DHCP identifier. Generally the same as the DHCP display name
     * 
     */
    @Import(name="dhcpId", required=true)
    private String dhcpId;

    /**
     * @return NSX DHCP identifier. Generally the same as the DHCP display name
     * 
     */
    public String dhcpId() {
        return this.dhcpId;
    }

    /**
     * Name of the private cloud
     * 
     */
    @Import(name="privateCloudName", required=true)
    private String privateCloudName;

    /**
     * @return Name of the private cloud
     * 
     */
    public String privateCloudName() {
        return this.privateCloudName;
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

    private GetWorkloadNetworkDhcpPlainArgs() {}

    private GetWorkloadNetworkDhcpPlainArgs(GetWorkloadNetworkDhcpPlainArgs $) {
        this.dhcpId = $.dhcpId;
        this.privateCloudName = $.privateCloudName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkloadNetworkDhcpPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkloadNetworkDhcpPlainArgs $;

        public Builder() {
            $ = new GetWorkloadNetworkDhcpPlainArgs();
        }

        public Builder(GetWorkloadNetworkDhcpPlainArgs defaults) {
            $ = new GetWorkloadNetworkDhcpPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dhcpId NSX DHCP identifier. Generally the same as the DHCP display name
         * 
         * @return builder
         * 
         */
        public Builder dhcpId(String dhcpId) {
            $.dhcpId = dhcpId;
            return this;
        }

        /**
         * @param privateCloudName Name of the private cloud
         * 
         * @return builder
         * 
         */
        public Builder privateCloudName(String privateCloudName) {
            $.privateCloudName = privateCloudName;
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

        public GetWorkloadNetworkDhcpPlainArgs build() {
            $.dhcpId = Objects.requireNonNull($.dhcpId, "expected parameter 'dhcpId' to be non-null");
            $.privateCloudName = Objects.requireNonNull($.privateCloudName, "expected parameter 'privateCloudName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
