// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AzureClusterControlPlaneDatabaseEncryption {
    /**
     * @return The ARM ID of the Azure Key Vault key to encrypt / decrypt data. For example: `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-id&gt;/providers/Microsoft.KeyVault/vaults/&lt;key-vault-id&gt;/keys/&lt;key-name&gt;` Encryption will always take the latest version of the key and hence specific version is not supported.
     * 
     */
    private final String keyId;

    @CustomType.Constructor
    private AzureClusterControlPlaneDatabaseEncryption(@CustomType.Parameter("keyId") String keyId) {
        this.keyId = keyId;
    }

    /**
     * @return The ARM ID of the Azure Key Vault key to encrypt / decrypt data. For example: `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-id&gt;/providers/Microsoft.KeyVault/vaults/&lt;key-vault-id&gt;/keys/&lt;key-name&gt;` Encryption will always take the latest version of the key and hence specific version is not supported.
     * 
     */
    public String keyId() {
        return this.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterControlPlaneDatabaseEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterControlPlaneDatabaseEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
        }

        public Builder keyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }        public AzureClusterControlPlaneDatabaseEncryption build() {
            return new AzureClusterControlPlaneDatabaseEncryption(keyId);
        }
    }
}
