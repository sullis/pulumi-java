// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetADLSGen2FolderDataSetMappingPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetADLSGen2FolderDataSetMappingPlainArgs Empty = new GetADLSGen2FolderDataSetMappingPlainArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The name of the share account.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the dataSetMapping.
     * 
     */
    @Import(name="dataSetMappingName", required=true)
    private String dataSetMappingName;

    /**
     * @return The name of the dataSetMapping.
     * 
     */
    public String dataSetMappingName() {
        return this.dataSetMappingName;
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

    /**
     * The name of the shareSubscription.
     * 
     */
    @Import(name="shareSubscriptionName", required=true)
    private String shareSubscriptionName;

    /**
     * @return The name of the shareSubscription.
     * 
     */
    public String shareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    private GetADLSGen2FolderDataSetMappingPlainArgs() {}

    private GetADLSGen2FolderDataSetMappingPlainArgs(GetADLSGen2FolderDataSetMappingPlainArgs $) {
        this.accountName = $.accountName;
        this.dataSetMappingName = $.dataSetMappingName;
        this.resourceGroupName = $.resourceGroupName;
        this.shareSubscriptionName = $.shareSubscriptionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetADLSGen2FolderDataSetMappingPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetADLSGen2FolderDataSetMappingPlainArgs $;

        public Builder() {
            $ = new GetADLSGen2FolderDataSetMappingPlainArgs();
        }

        public Builder(GetADLSGen2FolderDataSetMappingPlainArgs defaults) {
            $ = new GetADLSGen2FolderDataSetMappingPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the share account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param dataSetMappingName The name of the dataSetMapping.
         * 
         * @return builder
         * 
         */
        public Builder dataSetMappingName(String dataSetMappingName) {
            $.dataSetMappingName = dataSetMappingName;
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

        /**
         * @param shareSubscriptionName The name of the shareSubscription.
         * 
         * @return builder
         * 
         */
        public Builder shareSubscriptionName(String shareSubscriptionName) {
            $.shareSubscriptionName = shareSubscriptionName;
            return this;
        }

        public GetADLSGen2FolderDataSetMappingPlainArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.dataSetMappingName = Objects.requireNonNull($.dataSetMappingName, "expected parameter 'dataSetMappingName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.shareSubscriptionName = Objects.requireNonNull($.shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
            return $;
        }
    }

}
