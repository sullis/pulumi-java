// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetBackupVaultArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBackupVaultArgs Empty = new GetBackupVaultArgs();

    /**
     * The name of the resource group where the backup vault is present.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the backup vault.
     * 
     */
    @InputImport(name="vaultName", required=true)
      private final String vaultName;

    public String getVaultName() {
        return this.vaultName;
    }

    public GetBackupVaultArgs(
        String resourceGroupName,
        String vaultName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vaultName = Objects.requireNonNull(vaultName, "expected parameter 'vaultName' to be non-null");
    }

    private GetBackupVaultArgs() {
        this.resourceGroupName = null;
        this.vaultName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupVaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupVaultArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setVaultName(String vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }
        public GetBackupVaultArgs build() {
            return new GetBackupVaultArgs(resourceGroupName, vaultName);
        }
    }
}