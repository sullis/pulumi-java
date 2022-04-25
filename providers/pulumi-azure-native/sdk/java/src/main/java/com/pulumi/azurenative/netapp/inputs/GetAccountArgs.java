// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAccountArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountArgs Empty = new GetAccountArgs();

    /**
     * The name of the NetApp account
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The name of the NetApp account
     * 
     */
    public String accountName() {
        return this.accountName;
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

    private GetAccountArgs() {}

    private GetAccountArgs(GetAccountArgs $) {
        this.accountName = $.accountName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountArgs $;

        public Builder() {
            $ = new GetAccountArgs();
        }

        public Builder(GetAccountArgs defaults) {
            $ = new GetAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the NetApp account
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
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

        public GetAccountArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
