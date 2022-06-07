// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetADLSGen2FolderDataSetMappingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetADLSGen2FolderDataSetMappingArgs Empty = new GetADLSGen2FolderDataSetMappingArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the share account.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The name of the dataSetMapping.
     * 
     */
    @Import(name="dataSetMappingName", required=true)
    private Output<String> dataSetMappingName;

    /**
     * @return The name of the dataSetMapping.
     * 
     */
    public Output<String> dataSetMappingName() {
        return this.dataSetMappingName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the shareSubscription.
     * 
     */
    @Import(name="shareSubscriptionName", required=true)
    private Output<String> shareSubscriptionName;

    /**
     * @return The name of the shareSubscription.
     * 
     */
    public Output<String> shareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    private GetADLSGen2FolderDataSetMappingArgs() {}

    private GetADLSGen2FolderDataSetMappingArgs(GetADLSGen2FolderDataSetMappingArgs $) {
        this.accountName = $.accountName;
        this.dataSetMappingName = $.dataSetMappingName;
        this.resourceGroupName = $.resourceGroupName;
        this.shareSubscriptionName = $.shareSubscriptionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetADLSGen2FolderDataSetMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetADLSGen2FolderDataSetMappingArgs $;

        public Builder() {
            $ = new GetADLSGen2FolderDataSetMappingArgs();
        }

        public Builder(GetADLSGen2FolderDataSetMappingArgs defaults) {
            $ = new GetADLSGen2FolderDataSetMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the share account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the share account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param dataSetMappingName The name of the dataSetMapping.
         * 
         * @return builder
         * 
         */
        public Builder dataSetMappingName(Output<String> dataSetMappingName) {
            $.dataSetMappingName = dataSetMappingName;
            return this;
        }

        /**
         * @param dataSetMappingName The name of the dataSetMapping.
         * 
         * @return builder
         * 
         */
        public Builder dataSetMappingName(String dataSetMappingName) {
            return dataSetMappingName(Output.of(dataSetMappingName));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param shareSubscriptionName The name of the shareSubscription.
         * 
         * @return builder
         * 
         */
        public Builder shareSubscriptionName(Output<String> shareSubscriptionName) {
            $.shareSubscriptionName = shareSubscriptionName;
            return this;
        }

        /**
         * @param shareSubscriptionName The name of the shareSubscription.
         * 
         * @return builder
         * 
         */
        public Builder shareSubscriptionName(String shareSubscriptionName) {
            return shareSubscriptionName(Output.of(shareSubscriptionName));
        }

        public GetADLSGen2FolderDataSetMappingArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.dataSetMappingName = Objects.requireNonNull($.dataSetMappingName, "expected parameter 'dataSetMappingName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.shareSubscriptionName = Objects.requireNonNull($.shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
            return $;
        }
    }

}
