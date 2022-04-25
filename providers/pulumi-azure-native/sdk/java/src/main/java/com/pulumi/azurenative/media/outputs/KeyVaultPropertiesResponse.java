// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KeyVaultPropertiesResponse {
    /**
     * @return The current key used to encrypt the Media Services account, including the key version.
     * 
     */
    private final String currentKeyIdentifier;
    /**
     * @return The URL of the Key Vault key used to encrypt the account. The key may either be versioned (for example https://vault/keys/mykey/version1) or reference a key without a version (for example https://vault/keys/mykey).
     * 
     */
    private final @Nullable String keyIdentifier;

    @CustomType.Constructor
    private KeyVaultPropertiesResponse(
        @CustomType.Parameter("currentKeyIdentifier") String currentKeyIdentifier,
        @CustomType.Parameter("keyIdentifier") @Nullable String keyIdentifier) {
        this.currentKeyIdentifier = currentKeyIdentifier;
        this.keyIdentifier = keyIdentifier;
    }

    /**
     * @return The current key used to encrypt the Media Services account, including the key version.
     * 
     */
    public String currentKeyIdentifier() {
        return this.currentKeyIdentifier;
    }
    /**
     * @return The URL of the Key Vault key used to encrypt the account. The key may either be versioned (for example https://vault/keys/mykey/version1) or reference a key without a version (for example https://vault/keys/mykey).
     * 
     */
    public Optional<String> keyIdentifier() {
        return Optional.ofNullable(this.keyIdentifier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String currentKeyIdentifier;
        private @Nullable String keyIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentKeyIdentifier = defaults.currentKeyIdentifier;
    	      this.keyIdentifier = defaults.keyIdentifier;
        }

        public Builder currentKeyIdentifier(String currentKeyIdentifier) {
            this.currentKeyIdentifier = Objects.requireNonNull(currentKeyIdentifier);
            return this;
        }
        public Builder keyIdentifier(@Nullable String keyIdentifier) {
            this.keyIdentifier = keyIdentifier;
            return this;
        }        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(currentKeyIdentifier, keyIdentifier);
        }
    }
}
