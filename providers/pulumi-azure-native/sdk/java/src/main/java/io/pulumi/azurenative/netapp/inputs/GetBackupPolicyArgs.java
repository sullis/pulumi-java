// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetBackupPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBackupPolicyArgs Empty = new GetBackupPolicyArgs();

    /**
     * The name of the NetApp account
     * 
     */
    @InputImport(name="accountName", required=true)
    private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * Backup policy Name which uniquely identify backup policy.
     * 
     */
    @InputImport(name="backupPolicyName", required=true)
    private final String backupPolicyName;

    public String getBackupPolicyName() {
        return this.backupPolicyName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetBackupPolicyArgs(
        String accountName,
        String backupPolicyName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.backupPolicyName = Objects.requireNonNull(backupPolicyName, "expected parameter 'backupPolicyName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetBackupPolicyArgs() {
        this.accountName = null;
        this.backupPolicyName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String backupPolicyName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.backupPolicyName = defaults.backupPolicyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setBackupPolicyName(String backupPolicyName) {
            this.backupPolicyName = Objects.requireNonNull(backupPolicyName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetBackupPolicyArgs build() {
            return new GetBackupPolicyArgs(accountName, backupPolicyName, resourceGroupName);
        }
    }
}
