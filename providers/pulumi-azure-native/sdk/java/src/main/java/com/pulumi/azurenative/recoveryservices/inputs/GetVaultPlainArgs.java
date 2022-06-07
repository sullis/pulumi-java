// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVaultPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVaultPlainArgs Empty = new GetVaultPlainArgs();

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group where the recovery services vault is present.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="vaultName", required=true)
    private String vaultName;

    /**
     * @return The name of the recovery services vault.
     * 
     */
    public String vaultName() {
        return this.vaultName;
    }

    private GetVaultPlainArgs() {}

    private GetVaultPlainArgs(GetVaultPlainArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.vaultName = $.vaultName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVaultPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVaultPlainArgs $;

        public Builder() {
            $ = new GetVaultPlainArgs();
        }

        public Builder(GetVaultPlainArgs defaults) {
            $ = new GetVaultPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group where the recovery services vault is present.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param vaultName The name of the recovery services vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultName(String vaultName) {
            $.vaultName = vaultName;
            return this;
        }

        public GetVaultPlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vaultName = Objects.requireNonNull($.vaultName, "expected parameter 'vaultName' to be non-null");
            return $;
        }
    }

}
