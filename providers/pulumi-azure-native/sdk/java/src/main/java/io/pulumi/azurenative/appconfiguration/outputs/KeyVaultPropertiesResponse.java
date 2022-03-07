// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appconfiguration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KeyVaultPropertiesResponse {
    /**
     * The client id of the identity which will be used to access key vault.
     * 
     */
    private final @Nullable String identityClientId;
    /**
     * The URI of the key vault key used to encrypt data.
     * 
     */
    private final @Nullable String keyIdentifier;

    @OutputCustomType.Constructor({"identityClientId","keyIdentifier"})
    private KeyVaultPropertiesResponse(
        @Nullable String identityClientId,
        @Nullable String keyIdentifier) {
        this.identityClientId = identityClientId;
        this.keyIdentifier = keyIdentifier;
    }

    /**
     * The client id of the identity which will be used to access key vault.
     * 
    */
    public Optional<String> getIdentityClientId() {
        return Optional.ofNullable(this.identityClientId);
    }
    /**
     * The URI of the key vault key used to encrypt data.
     * 
    */
    public Optional<String> getKeyIdentifier() {
        return Optional.ofNullable(this.keyIdentifier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String identityClientId;
        private @Nullable String keyIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityClientId = defaults.identityClientId;
    	      this.keyIdentifier = defaults.keyIdentifier;
        }

        public Builder setIdentityClientId(@Nullable String identityClientId) {
            this.identityClientId = identityClientId;
            return this;
        }

        public Builder setKeyIdentifier(@Nullable String keyIdentifier) {
            this.keyIdentifier = keyIdentifier;
            return this;
        }
        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(identityClientId, keyIdentifier);
        }
    }
}