// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KeyVaultPropertiesResponse {
    /**
     * The current key used to encrypt Video Analyzer account, including the key version.
     * 
     */
    private final String currentKeyIdentifier;
    /**
     * The URL of the Key Vault key used to encrypt the account. The key may either be versioned (for example https://vault/keys/mykey/version1) or reference a key without a version (for example https://vault/keys/mykey).
     * 
     */
    private final String keyIdentifier;

    @OutputCustomType.Constructor({"currentKeyIdentifier","keyIdentifier"})
    private KeyVaultPropertiesResponse(
        String currentKeyIdentifier,
        String keyIdentifier) {
        this.currentKeyIdentifier = Objects.requireNonNull(currentKeyIdentifier);
        this.keyIdentifier = Objects.requireNonNull(keyIdentifier);
    }

    /**
     * The current key used to encrypt Video Analyzer account, including the key version.
     * 
     */
    public String getCurrentKeyIdentifier() {
        return this.currentKeyIdentifier;
    }
    /**
     * The URL of the Key Vault key used to encrypt the account. The key may either be versioned (for example https://vault/keys/mykey/version1) or reference a key without a version (for example https://vault/keys/mykey).
     * 
     */
    public String getKeyIdentifier() {
        return this.keyIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String currentKeyIdentifier;
        private String keyIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentKeyIdentifier = defaults.currentKeyIdentifier;
    	      this.keyIdentifier = defaults.keyIdentifier;
        }

        public Builder setCurrentKeyIdentifier(String currentKeyIdentifier) {
            this.currentKeyIdentifier = Objects.requireNonNull(currentKeyIdentifier);
            return this;
        }

        public Builder setKeyIdentifier(String keyIdentifier) {
            this.keyIdentifier = Objects.requireNonNull(keyIdentifier);
            return this;
        }

        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(currentKeyIdentifier, keyIdentifier);
        }
    }
}
