// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KeyVaultMetaInfoResponse {
    /**
     * The name of the user managed encryption key.
     * 
     */
    private final String encryptionKeyName;
    /**
     * The version of the user managed encryption key.
     * 
     */
    private final String encryptionKeyVersion;
    /**
     * The resource identifier for the user managed Key Vault being used to encrypt.
     * 
     */
    private final String keyVaultResourceId;

    @OutputCustomType.Constructor({"encryptionKeyName","encryptionKeyVersion","keyVaultResourceId"})
    private KeyVaultMetaInfoResponse(
        String encryptionKeyName,
        String encryptionKeyVersion,
        String keyVaultResourceId) {
        this.encryptionKeyName = Objects.requireNonNull(encryptionKeyName);
        this.encryptionKeyVersion = Objects.requireNonNull(encryptionKeyVersion);
        this.keyVaultResourceId = Objects.requireNonNull(keyVaultResourceId);
    }

    /**
     * The name of the user managed encryption key.
     * 
    */
    public String getEncryptionKeyName() {
        return this.encryptionKeyName;
    }
    /**
     * The version of the user managed encryption key.
     * 
    */
    public String getEncryptionKeyVersion() {
        return this.encryptionKeyVersion;
    }
    /**
     * The resource identifier for the user managed Key Vault being used to encrypt.
     * 
    */
    public String getKeyVaultResourceId() {
        return this.keyVaultResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultMetaInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String encryptionKeyName;
        private String encryptionKeyVersion;
        private String keyVaultResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultMetaInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionKeyName = defaults.encryptionKeyName;
    	      this.encryptionKeyVersion = defaults.encryptionKeyVersion;
    	      this.keyVaultResourceId = defaults.keyVaultResourceId;
        }

        public Builder setEncryptionKeyName(String encryptionKeyName) {
            this.encryptionKeyName = Objects.requireNonNull(encryptionKeyName);
            return this;
        }

        public Builder setEncryptionKeyVersion(String encryptionKeyVersion) {
            this.encryptionKeyVersion = Objects.requireNonNull(encryptionKeyVersion);
            return this;
        }

        public Builder setKeyVaultResourceId(String keyVaultResourceId) {
            this.keyVaultResourceId = Objects.requireNonNull(keyVaultResourceId);
            return this;
        }
        public KeyVaultMetaInfoResponse build() {
            return new KeyVaultMetaInfoResponse(encryptionKeyName, encryptionKeyVersion, keyVaultResourceId);
        }
    }
}