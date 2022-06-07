// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dataprotection.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBackupVaultPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBackupVaultPlainArgs Empty = new GetBackupVaultPlainArgs();

    /**
     * Specifies the name of the Backup Vault.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Specifies the name of the Backup Vault.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the Resource Group where the Backup Vault exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Resource Group where the Backup Vault exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetBackupVaultPlainArgs() {}

    private GetBackupVaultPlainArgs(GetBackupVaultPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBackupVaultPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBackupVaultPlainArgs $;

        public Builder() {
            $ = new GetBackupVaultPlainArgs();
        }

        public Builder(GetBackupVaultPlainArgs defaults) {
            $ = new GetBackupVaultPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the Backup Vault.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Backup Vault exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetBackupVaultPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
