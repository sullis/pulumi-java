// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.offazure.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSitePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSitePlainArgs Empty = new GetSitePlainArgs();

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
     * Site name.
     * 
     */
    @Import(name="siteName", required=true)
    private String siteName;

    /**
     * @return Site name.
     * 
     */
    public String siteName() {
        return this.siteName;
    }

    private GetSitePlainArgs() {}

    private GetSitePlainArgs(GetSitePlainArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.siteName = $.siteName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSitePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSitePlainArgs $;

        public Builder() {
            $ = new GetSitePlainArgs();
        }

        public Builder(GetSitePlainArgs defaults) {
            $ = new GetSitePlainArgs(Objects.requireNonNull(defaults));
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
         * @param siteName Site name.
         * 
         * @return builder
         * 
         */
        public Builder siteName(String siteName) {
            $.siteName = siteName;
            return this;
        }

        public GetSitePlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.siteName = Objects.requireNonNull($.siteName, "expected parameter 'siteName' to be non-null");
            return $;
        }
    }

}
