// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blockchain.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListTransactionNodeApiKeysArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListTransactionNodeApiKeysArgs Empty = new ListTransactionNodeApiKeysArgs();

    /**
     * Blockchain member name.
     * 
     */
    @Import(name="blockchainMemberName", required=true)
    private Output<String> blockchainMemberName;

    /**
     * @return Blockchain member name.
     * 
     */
    public Output<String> blockchainMemberName() {
        return this.blockchainMemberName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Transaction node name.
     * 
     */
    @Import(name="transactionNodeName", required=true)
    private Output<String> transactionNodeName;

    /**
     * @return Transaction node name.
     * 
     */
    public Output<String> transactionNodeName() {
        return this.transactionNodeName;
    }

    private ListTransactionNodeApiKeysArgs() {}

    private ListTransactionNodeApiKeysArgs(ListTransactionNodeApiKeysArgs $) {
        this.blockchainMemberName = $.blockchainMemberName;
        this.resourceGroupName = $.resourceGroupName;
        this.transactionNodeName = $.transactionNodeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListTransactionNodeApiKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListTransactionNodeApiKeysArgs $;

        public Builder() {
            $ = new ListTransactionNodeApiKeysArgs();
        }

        public Builder(ListTransactionNodeApiKeysArgs defaults) {
            $ = new ListTransactionNodeApiKeysArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blockchainMemberName Blockchain member name.
         * 
         * @return builder
         * 
         */
        public Builder blockchainMemberName(Output<String> blockchainMemberName) {
            $.blockchainMemberName = blockchainMemberName;
            return this;
        }

        /**
         * @param blockchainMemberName Blockchain member name.
         * 
         * @return builder
         * 
         */
        public Builder blockchainMemberName(String blockchainMemberName) {
            return blockchainMemberName(Output.of(blockchainMemberName));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param transactionNodeName Transaction node name.
         * 
         * @return builder
         * 
         */
        public Builder transactionNodeName(Output<String> transactionNodeName) {
            $.transactionNodeName = transactionNodeName;
            return this;
        }

        /**
         * @param transactionNodeName Transaction node name.
         * 
         * @return builder
         * 
         */
        public Builder transactionNodeName(String transactionNodeName) {
            return transactionNodeName(Output.of(transactionNodeName));
        }

        public ListTransactionNodeApiKeysArgs build() {
            $.blockchainMemberName = Objects.requireNonNull($.blockchainMemberName, "expected parameter 'blockchainMemberName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.transactionNodeName = Objects.requireNonNull($.transactionNodeName, "expected parameter 'transactionNodeName' to be non-null");
            return $;
        }
    }

}
