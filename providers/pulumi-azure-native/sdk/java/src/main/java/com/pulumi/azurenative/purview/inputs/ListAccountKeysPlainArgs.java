// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.purview.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListAccountKeysPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListAccountKeysPlainArgs Empty = new ListAccountKeysPlainArgs();

    /**
     * The name of the account.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The name of the account.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListAccountKeysPlainArgs() {}

    private ListAccountKeysPlainArgs(ListAccountKeysPlainArgs $) {
        this.accountName = $.accountName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListAccountKeysPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListAccountKeysPlainArgs $;

        public Builder() {
            $ = new ListAccountKeysPlainArgs();
        }

        public Builder(ListAccountKeysPlainArgs defaults) {
            $ = new ListAccountKeysPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListAccountKeysPlainArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
