// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.offazure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSiteArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSiteArgs Empty = new GetSiteArgs();

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

    /**
     * Site name.
     * 
     */
    @Import(name="siteName", required=true)
    private Output<String> siteName;

    /**
     * @return Site name.
     * 
     */
    public Output<String> siteName() {
        return this.siteName;
    }

    private GetSiteArgs() {}

    private GetSiteArgs(GetSiteArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.siteName = $.siteName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSiteArgs $;

        public Builder() {
            $ = new GetSiteArgs();
        }

        public Builder(GetSiteArgs defaults) {
            $ = new GetSiteArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param siteName Site name.
         * 
         * @return builder
         * 
         */
        public Builder siteName(Output<String> siteName) {
            $.siteName = siteName;
            return this;
        }

        /**
         * @param siteName Site name.
         * 
         * @return builder
         * 
         */
        public Builder siteName(String siteName) {
            return siteName(Output.of(siteName));
        }

        public GetSiteArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.siteName = Objects.requireNonNull($.siteName, "expected parameter 'siteName' to be non-null");
            return $;
        }
    }

}
