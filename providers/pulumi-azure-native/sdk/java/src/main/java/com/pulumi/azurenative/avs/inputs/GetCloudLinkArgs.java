// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCloudLinkArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudLinkArgs Empty = new GetCloudLinkArgs();

    /**
     * Name of the cloud link resource
     * 
     */
    @Import(name="cloudLinkName", required=true)
    private Output<String> cloudLinkName;

    /**
     * @return Name of the cloud link resource
     * 
     */
    public Output<String> cloudLinkName() {
        return this.cloudLinkName;
    }

    /**
     * Name of the private cloud
     * 
     */
    @Import(name="privateCloudName", required=true)
    private Output<String> privateCloudName;

    /**
     * @return Name of the private cloud
     * 
     */
    public Output<String> privateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetCloudLinkArgs() {}

    private GetCloudLinkArgs(GetCloudLinkArgs $) {
        this.cloudLinkName = $.cloudLinkName;
        this.privateCloudName = $.privateCloudName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudLinkArgs $;

        public Builder() {
            $ = new GetCloudLinkArgs();
        }

        public Builder(GetCloudLinkArgs defaults) {
            $ = new GetCloudLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudLinkName Name of the cloud link resource
         * 
         * @return builder
         * 
         */
        public Builder cloudLinkName(Output<String> cloudLinkName) {
            $.cloudLinkName = cloudLinkName;
            return this;
        }

        /**
         * @param cloudLinkName Name of the cloud link resource
         * 
         * @return builder
         * 
         */
        public Builder cloudLinkName(String cloudLinkName) {
            return cloudLinkName(Output.of(cloudLinkName));
        }

        /**
         * @param privateCloudName Name of the private cloud
         * 
         * @return builder
         * 
         */
        public Builder privateCloudName(Output<String> privateCloudName) {
            $.privateCloudName = privateCloudName;
            return this;
        }

        /**
         * @param privateCloudName Name of the private cloud
         * 
         * @return builder
         * 
         */
        public Builder privateCloudName(String privateCloudName) {
            return privateCloudName(Output.of(privateCloudName));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetCloudLinkArgs build() {
            $.cloudLinkName = Objects.requireNonNull($.cloudLinkName, "expected parameter 'cloudLinkName' to be non-null");
            $.privateCloudName = Objects.requireNonNull($.privateCloudName, "expected parameter 'privateCloudName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
