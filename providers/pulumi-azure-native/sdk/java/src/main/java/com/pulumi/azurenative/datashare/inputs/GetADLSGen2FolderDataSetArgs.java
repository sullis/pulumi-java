// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetADLSGen2FolderDataSetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetADLSGen2FolderDataSetArgs Empty = new GetADLSGen2FolderDataSetArgs();

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
     * The name of the dataSet.
     * 
     */
    @Import(name="dataSetName", required=true)
    private Output<String> dataSetName;

    /**
     * @return The name of the dataSet.
     * 
     */
    public Output<String> dataSetName() {
        return this.dataSetName;
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
     * The name of the share.
     * 
     */
    @Import(name="shareName", required=true)
    private Output<String> shareName;

    /**
     * @return The name of the share.
     * 
     */
    public Output<String> shareName() {
        return this.shareName;
    }

    private GetADLSGen2FolderDataSetArgs() {}

    private GetADLSGen2FolderDataSetArgs(GetADLSGen2FolderDataSetArgs $) {
        this.accountName = $.accountName;
        this.dataSetName = $.dataSetName;
        this.resourceGroupName = $.resourceGroupName;
        this.shareName = $.shareName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetADLSGen2FolderDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetADLSGen2FolderDataSetArgs $;

        public Builder() {
            $ = new GetADLSGen2FolderDataSetArgs();
        }

        public Builder(GetADLSGen2FolderDataSetArgs defaults) {
            $ = new GetADLSGen2FolderDataSetArgs(Objects.requireNonNull(defaults));
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
         * @param dataSetName The name of the dataSet.
         * 
         * @return builder
         * 
         */
        public Builder dataSetName(Output<String> dataSetName) {
            $.dataSetName = dataSetName;
            return this;
        }

        /**
         * @param dataSetName The name of the dataSet.
         * 
         * @return builder
         * 
         */
        public Builder dataSetName(String dataSetName) {
            return dataSetName(Output.of(dataSetName));
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
         * @param shareName The name of the share.
         * 
         * @return builder
         * 
         */
        public Builder shareName(Output<String> shareName) {
            $.shareName = shareName;
            return this;
        }

        /**
         * @param shareName The name of the share.
         * 
         * @return builder
         * 
         */
        public Builder shareName(String shareName) {
            return shareName(Output.of(shareName));
        }

        public GetADLSGen2FolderDataSetArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.dataSetName = Objects.requireNonNull($.dataSetName, "expected parameter 'dataSetName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.shareName = Objects.requireNonNull($.shareName, "expected parameter 'shareName' to be non-null");
            return $;
        }
    }

}
