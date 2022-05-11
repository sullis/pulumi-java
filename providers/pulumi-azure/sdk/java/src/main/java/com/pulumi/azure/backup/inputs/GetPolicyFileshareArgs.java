// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.backup.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPolicyFileshareArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPolicyFileshareArgs Empty = new GetPolicyFileshareArgs();

    /**
     * Specifies the name of the File Share Backup Policy.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Specifies the name of the File Share Backup Policy.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Specifies the name of the Recovery Services Vault.
     * 
     */
    @Import(name="recoveryVaultName", required=true)
    private String recoveryVaultName;

    /**
     * @return Specifies the name of the Recovery Services Vault.
     * 
     */
    public String recoveryVaultName() {
        return this.recoveryVaultName;
    }

    /**
     * The name of the resource group in which the File Share Backup Policy resides.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group in which the File Share Backup Policy resides.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPolicyFileshareArgs() {}

    private GetPolicyFileshareArgs(GetPolicyFileshareArgs $) {
        this.name = $.name;
        this.recoveryVaultName = $.recoveryVaultName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicyFileshareArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicyFileshareArgs $;

        public Builder() {
            $ = new GetPolicyFileshareArgs();
        }

        public Builder(GetPolicyFileshareArgs defaults) {
            $ = new GetPolicyFileshareArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the File Share Backup Policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param recoveryVaultName Specifies the name of the Recovery Services Vault.
         * 
         * @return builder
         * 
         */
        public Builder recoveryVaultName(String recoveryVaultName) {
            $.recoveryVaultName = recoveryVaultName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the File Share Backup Policy resides.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetPolicyFileshareArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.recoveryVaultName = Objects.requireNonNull($.recoveryVaultName, "expected parameter 'recoveryVaultName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
