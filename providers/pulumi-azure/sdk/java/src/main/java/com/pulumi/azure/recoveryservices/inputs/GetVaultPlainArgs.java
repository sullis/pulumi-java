// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVaultPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVaultPlainArgs Empty = new GetVaultPlainArgs();

    /**
     * Specifies the name of the Recovery Services Vault.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Specifies the name of the Recovery Services Vault.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the resource group in which the Recovery Services Vault resides.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group in which the Recovery Services Vault resides.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetVaultPlainArgs() {}

    private GetVaultPlainArgs(GetVaultPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
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
         * @param name Specifies the name of the Recovery Services Vault.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Recovery Services Vault resides.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetVaultPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
