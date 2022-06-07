// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVaultArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVaultArgs Empty = new GetVaultArgs();

    /**
     * The name of the Resource Group to which the vault belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group to which the vault belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the vault.
     * 
     */
    @Import(name="vaultName", required=true)
    private Output<String> vaultName;

    /**
     * @return The name of the vault.
     * 
     */
    public Output<String> vaultName() {
        return this.vaultName;
    }

    private GetVaultArgs() {}

    private GetVaultArgs(GetVaultArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.vaultName = $.vaultName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVaultArgs $;

        public Builder() {
            $ = new GetVaultArgs();
        }

        public Builder(GetVaultArgs defaults) {
            $ = new GetVaultArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the Resource Group to which the vault belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group to which the vault belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param vaultName The name of the vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultName(Output<String> vaultName) {
            $.vaultName = vaultName;
            return this;
        }

        /**
         * @param vaultName The name of the vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultName(String vaultName) {
            return vaultName(Output.of(vaultName));
        }

        public GetVaultArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vaultName = Objects.requireNonNull($.vaultName, "expected parameter 'vaultName' to be non-null");
            return $;
        }
    }

}
