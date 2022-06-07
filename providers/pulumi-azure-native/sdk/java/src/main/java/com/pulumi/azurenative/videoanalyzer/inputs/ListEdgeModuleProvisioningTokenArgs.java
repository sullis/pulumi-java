// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListEdgeModuleProvisioningTokenArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListEdgeModuleProvisioningTokenArgs Empty = new ListEdgeModuleProvisioningTokenArgs();

    /**
     * The Azure Video Analyzer account name.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The Azure Video Analyzer account name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The name of the edge module used to create a new provisioning token.
     * 
     */
    @Import(name="edgeModuleName", required=true)
    private Output<String> edgeModuleName;

    /**
     * @return The name of the edge module used to create a new provisioning token.
     * 
     */
    public Output<String> edgeModuleName() {
        return this.edgeModuleName;
    }

    /**
     * The desired expiration date of the registration token. The Azure Video Analyzer IoT edge module must be initialized and connected to the Internet prior to the token expiration date.
     * 
     */
    @Import(name="expirationDate", required=true)
    private Output<String> expirationDate;

    /**
     * @return The desired expiration date of the registration token. The Azure Video Analyzer IoT edge module must be initialized and connected to the Internet prior to the token expiration date.
     * 
     */
    public Output<String> expirationDate() {
        return this.expirationDate;
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

    private ListEdgeModuleProvisioningTokenArgs() {}

    private ListEdgeModuleProvisioningTokenArgs(ListEdgeModuleProvisioningTokenArgs $) {
        this.accountName = $.accountName;
        this.edgeModuleName = $.edgeModuleName;
        this.expirationDate = $.expirationDate;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListEdgeModuleProvisioningTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListEdgeModuleProvisioningTokenArgs $;

        public Builder() {
            $ = new ListEdgeModuleProvisioningTokenArgs();
        }

        public Builder(ListEdgeModuleProvisioningTokenArgs defaults) {
            $ = new ListEdgeModuleProvisioningTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The Azure Video Analyzer account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The Azure Video Analyzer account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param edgeModuleName The name of the edge module used to create a new provisioning token.
         * 
         * @return builder
         * 
         */
        public Builder edgeModuleName(Output<String> edgeModuleName) {
            $.edgeModuleName = edgeModuleName;
            return this;
        }

        /**
         * @param edgeModuleName The name of the edge module used to create a new provisioning token.
         * 
         * @return builder
         * 
         */
        public Builder edgeModuleName(String edgeModuleName) {
            return edgeModuleName(Output.of(edgeModuleName));
        }

        /**
         * @param expirationDate The desired expiration date of the registration token. The Azure Video Analyzer IoT edge module must be initialized and connected to the Internet prior to the token expiration date.
         * 
         * @return builder
         * 
         */
        public Builder expirationDate(Output<String> expirationDate) {
            $.expirationDate = expirationDate;
            return this;
        }

        /**
         * @param expirationDate The desired expiration date of the registration token. The Azure Video Analyzer IoT edge module must be initialized and connected to the Internet prior to the token expiration date.
         * 
         * @return builder
         * 
         */
        public Builder expirationDate(String expirationDate) {
            return expirationDate(Output.of(expirationDate));
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

        public ListEdgeModuleProvisioningTokenArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.edgeModuleName = Objects.requireNonNull($.edgeModuleName, "expected parameter 'edgeModuleName' to be non-null");
            $.expirationDate = Objects.requireNonNull($.expirationDate, "expected parameter 'expirationDate' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
