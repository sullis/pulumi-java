// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWorkloadNetworkPublicIPArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkloadNetworkPublicIPArgs Empty = new GetWorkloadNetworkPublicIPArgs();

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
     * NSX Public IP Block identifier. Generally the same as the Public IP Block&#39;s display name
     * 
     */
    @Import(name="publicIPId", required=true)
    private String publicIPId;

    /**
     * @return NSX Public IP Block identifier. Generally the same as the Public IP Block&#39;s display name
     * 
     */
    public String publicIPId() {
        return this.publicIPId;
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

    private GetWorkloadNetworkPublicIPArgs() {}

    private GetWorkloadNetworkPublicIPArgs(GetWorkloadNetworkPublicIPArgs $) {
        this.privateCloudName = $.privateCloudName;
        this.publicIPId = $.publicIPId;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkloadNetworkPublicIPArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkloadNetworkPublicIPArgs $;

        public Builder() {
            $ = new GetWorkloadNetworkPublicIPArgs();
        }

        public Builder(GetWorkloadNetworkPublicIPArgs defaults) {
            $ = new GetWorkloadNetworkPublicIPArgs(Objects.requireNonNull(defaults));
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
         * @param publicIPId NSX Public IP Block identifier. Generally the same as the Public IP Block&#39;s display name
         * 
         * @return builder
         * 
         */
        public Builder publicIPId(String publicIPId) {
            $.publicIPId = publicIPId;
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

        public GetWorkloadNetworkPublicIPArgs build() {
            $.privateCloudName = Objects.requireNonNull($.privateCloudName, "expected parameter 'privateCloudName' to be non-null");
            $.publicIPId = Objects.requireNonNull($.publicIPId, "expected parameter 'publicIPId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
