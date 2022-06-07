// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBlobContainerDataSetPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBlobContainerDataSetPlainArgs Empty = new GetBlobContainerDataSetPlainArgs();

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
     * The name of the dataSet.
     * 
     */
    @Import(name="dataSetName", required=true)
    private String dataSetName;

    /**
     * @return The name of the dataSet.
     * 
     */
    public String dataSetName() {
        return this.dataSetName;
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
     * The name of the share.
     * 
     */
    @Import(name="shareName", required=true)
    private String shareName;

    /**
     * @return The name of the share.
     * 
     */
    public String shareName() {
        return this.shareName;
    }

    private GetBlobContainerDataSetPlainArgs() {}

    private GetBlobContainerDataSetPlainArgs(GetBlobContainerDataSetPlainArgs $) {
        this.accountName = $.accountName;
        this.dataSetName = $.dataSetName;
        this.resourceGroupName = $.resourceGroupName;
        this.shareName = $.shareName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBlobContainerDataSetPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBlobContainerDataSetPlainArgs $;

        public Builder() {
            $ = new GetBlobContainerDataSetPlainArgs();
        }

        public Builder(GetBlobContainerDataSetPlainArgs defaults) {
            $ = new GetBlobContainerDataSetPlainArgs(Objects.requireNonNull(defaults));
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
         * @param dataSetName The name of the dataSet.
         * 
         * @return builder
         * 
         */
        public Builder dataSetName(String dataSetName) {
            $.dataSetName = dataSetName;
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
         * @param shareName The name of the share.
         * 
         * @return builder
         * 
         */
        public Builder shareName(String shareName) {
            $.shareName = shareName;
            return this;
        }

        public GetBlobContainerDataSetPlainArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.dataSetName = Objects.requireNonNull($.dataSetName, "expected parameter 'dataSetName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.shareName = Objects.requireNonNull($.shareName, "expected parameter 'shareName' to be non-null");
            return $;
        }
    }

}
