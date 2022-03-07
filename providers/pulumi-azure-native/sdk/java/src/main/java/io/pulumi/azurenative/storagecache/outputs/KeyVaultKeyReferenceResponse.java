// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.outputs;

import io.pulumi.azurenative.storagecache.outputs.KeyVaultKeyReferenceResponseSourceVault;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KeyVaultKeyReferenceResponse {
    /**
     * The URL referencing a key encryption key in Key Vault.
     * 
     */
    private final String keyUrl;
    /**
     * Describes a resource Id to source Key Vault.
     * 
     */
    private final KeyVaultKeyReferenceResponseSourceVault sourceVault;

    @OutputCustomType.Constructor({"keyUrl","sourceVault"})
    private KeyVaultKeyReferenceResponse(
        String keyUrl,
        KeyVaultKeyReferenceResponseSourceVault sourceVault) {
        this.keyUrl = Objects.requireNonNull(keyUrl);
        this.sourceVault = Objects.requireNonNull(sourceVault);
    }

    /**
     * The URL referencing a key encryption key in Key Vault.
     * 
    */
    public String getKeyUrl() {
        return this.keyUrl;
    }
    /**
     * Describes a resource Id to source Key Vault.
     * 
    */
    public KeyVaultKeyReferenceResponseSourceVault getSourceVault() {
        return this.sourceVault;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultKeyReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyUrl;
        private KeyVaultKeyReferenceResponseSourceVault sourceVault;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultKeyReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUrl = defaults.keyUrl;
    	      this.sourceVault = defaults.sourceVault;
        }

        public Builder setKeyUrl(String keyUrl) {
            this.keyUrl = Objects.requireNonNull(keyUrl);
            return this;
        }

        public Builder setSourceVault(KeyVaultKeyReferenceResponseSourceVault sourceVault) {
            this.sourceVault = Objects.requireNonNull(sourceVault);
            return this;
        }
        public KeyVaultKeyReferenceResponse build() {
            return new KeyVaultKeyReferenceResponse(keyUrl, sourceVault);
        }
    }
}