// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListBotConnectionWithSecretsArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListBotConnectionWithSecretsArgs Empty = new ListBotConnectionWithSecretsArgs();

    /**
     * The name of the Bot Service Connection Setting resource.
     * 
     */
    @Import(name="connectionName", required=true)
    private Output<String> connectionName;

    /**
     * @return The name of the Bot Service Connection Setting resource.
     * 
     */
    public Output<String> connectionName() {
        return this.connectionName;
    }

    /**
     * The name of the Bot resource group in the user subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Bot resource group in the user subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Bot resource.
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    /**
     * @return The name of the Bot resource.
     * 
     */
    public Output<String> resourceName() {
        return this.resourceName;
    }

    private ListBotConnectionWithSecretsArgs() {}

    private ListBotConnectionWithSecretsArgs(ListBotConnectionWithSecretsArgs $) {
        this.connectionName = $.connectionName;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListBotConnectionWithSecretsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListBotConnectionWithSecretsArgs $;

        public Builder() {
            $ = new ListBotConnectionWithSecretsArgs();
        }

        public Builder(ListBotConnectionWithSecretsArgs defaults) {
            $ = new ListBotConnectionWithSecretsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionName The name of the Bot Service Connection Setting resource.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(Output<String> connectionName) {
            $.connectionName = connectionName;
            return this;
        }

        /**
         * @param connectionName The name of the Bot Service Connection Setting resource.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(String connectionName) {
            return connectionName(Output.of(connectionName));
        }

        /**
         * @param resourceGroupName The name of the Bot resource group in the user subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Bot resource group in the user subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceName The name of the Bot resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The name of the Bot resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        public ListBotConnectionWithSecretsArgs build() {
            $.connectionName = Objects.requireNonNull($.connectionName, "expected parameter 'connectionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
