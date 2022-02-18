// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AzureClusterControlPlaneDatabaseEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureClusterControlPlaneDatabaseEncryptionArgs Empty = new AzureClusterControlPlaneDatabaseEncryptionArgs();

    /**
     * The ARM ID of the Azure Key Vault key to encrypt / decrypt data. For example: `/subscriptions/<subscription-id>/resourceGroups/<resource-group-id>/providers/Microsoft.KeyVault/vaults/<key-vault-id>/keys/<key-name>` Encryption will always take the latest version of the key and hence specific version is not supported.
     * 
     */
    @InputImport(name="keyId", required=true)
    private final Input<String> keyId;

    public Input<String> getKeyId() {
        return this.keyId;
    }

    public AzureClusterControlPlaneDatabaseEncryptionArgs(Input<String> keyId) {
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
    }

    private AzureClusterControlPlaneDatabaseEncryptionArgs() {
        this.keyId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterControlPlaneDatabaseEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> keyId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterControlPlaneDatabaseEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
        }

        public Builder setKeyId(Input<String> keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }

        public Builder setKeyId(String keyId) {
            this.keyId = Input.of(Objects.requireNonNull(keyId));
            return this;
        }

        public AzureClusterControlPlaneDatabaseEncryptionArgs build() {
            return new AzureClusterControlPlaneDatabaseEncryptionArgs(keyId);
        }
    }
}
