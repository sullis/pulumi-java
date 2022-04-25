// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.mixedreality.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSpatialAnchorsAccountArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSpatialAnchorsAccountArgs Empty = new GetSpatialAnchorsAccountArgs();

    /**
     * Name of an Mixed Reality Account.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return Name of an Mixed Reality Account.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Name of an Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of an Azure resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetSpatialAnchorsAccountArgs() {}

    private GetSpatialAnchorsAccountArgs(GetSpatialAnchorsAccountArgs $) {
        this.accountName = $.accountName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSpatialAnchorsAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSpatialAnchorsAccountArgs $;

        public Builder() {
            $ = new GetSpatialAnchorsAccountArgs();
        }

        public Builder(GetSpatialAnchorsAccountArgs defaults) {
            $ = new GetSpatialAnchorsAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Name of an Mixed Reality Account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param resourceGroupName Name of an Azure resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetSpatialAnchorsAccountArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
