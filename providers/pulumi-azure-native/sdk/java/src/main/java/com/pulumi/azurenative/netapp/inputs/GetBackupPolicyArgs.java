// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBackupPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBackupPolicyArgs Empty = new GetBackupPolicyArgs();

    /**
     * The name of the NetApp account
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the NetApp account
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Backup policy Name which uniquely identify backup policy.
     * 
     */
    @Import(name="backupPolicyName", required=true)
    private Output<String> backupPolicyName;

    /**
     * @return Backup policy Name which uniquely identify backup policy.
     * 
     */
    public Output<String> backupPolicyName() {
        return this.backupPolicyName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetBackupPolicyArgs() {}

    private GetBackupPolicyArgs(GetBackupPolicyArgs $) {
        this.accountName = $.accountName;
        this.backupPolicyName = $.backupPolicyName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBackupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBackupPolicyArgs $;

        public Builder() {
            $ = new GetBackupPolicyArgs();
        }

        public Builder(GetBackupPolicyArgs defaults) {
            $ = new GetBackupPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the NetApp account
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the NetApp account
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param backupPolicyName Backup policy Name which uniquely identify backup policy.
         * 
         * @return builder
         * 
         */
        public Builder backupPolicyName(Output<String> backupPolicyName) {
            $.backupPolicyName = backupPolicyName;
            return this;
        }

        /**
         * @param backupPolicyName Backup policy Name which uniquely identify backup policy.
         * 
         * @return builder
         * 
         */
        public Builder backupPolicyName(String backupPolicyName) {
            return backupPolicyName(Output.of(backupPolicyName));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetBackupPolicyArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.backupPolicyName = Objects.requireNonNull($.backupPolicyName, "expected parameter 'backupPolicyName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
