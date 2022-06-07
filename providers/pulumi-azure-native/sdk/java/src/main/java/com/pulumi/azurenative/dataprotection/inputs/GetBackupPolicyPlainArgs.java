// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBackupPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBackupPolicyPlainArgs Empty = new GetBackupPolicyPlainArgs();

    @Import(name="backupPolicyName", required=true)
    private String backupPolicyName;

    public String backupPolicyName() {
        return this.backupPolicyName;
    }

    /**
     * The name of the resource group where the backup vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group where the backup vault is present.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the backup vault.
     * 
     */
    @Import(name="vaultName", required=true)
    private String vaultName;

    /**
     * @return The name of the backup vault.
     * 
     */
    public String vaultName() {
        return this.vaultName;
    }

    private GetBackupPolicyPlainArgs() {}

    private GetBackupPolicyPlainArgs(GetBackupPolicyPlainArgs $) {
        this.backupPolicyName = $.backupPolicyName;
        this.resourceGroupName = $.resourceGroupName;
        this.vaultName = $.vaultName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBackupPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBackupPolicyPlainArgs $;

        public Builder() {
            $ = new GetBackupPolicyPlainArgs();
        }

        public Builder(GetBackupPolicyPlainArgs defaults) {
            $ = new GetBackupPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupPolicyName(String backupPolicyName) {
            $.backupPolicyName = backupPolicyName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group where the backup vault is present.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param vaultName The name of the backup vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultName(String vaultName) {
            $.vaultName = vaultName;
            return this;
        }

        public GetBackupPolicyPlainArgs build() {
            $.backupPolicyName = Objects.requireNonNull($.backupPolicyName, "expected parameter 'backupPolicyName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vaultName = Objects.requireNonNull($.vaultName, "expected parameter 'vaultName' to be non-null");
            return $;
        }
    }

}
