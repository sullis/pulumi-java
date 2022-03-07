// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.outputs;

import io.pulumi.azurenative.cognitiveservices.outputs.KeyVaultPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EncryptionResponse {
    /**
     * Enumerates the possible value of keySource for Encryption
     * 
     */
    private final @Nullable String keySource;
    /**
     * Properties of KeyVault
     * 
     */
    private final @Nullable KeyVaultPropertiesResponse keyVaultProperties;

    @OutputCustomType.Constructor({"keySource","keyVaultProperties"})
    private EncryptionResponse(
        @Nullable String keySource,
        @Nullable KeyVaultPropertiesResponse keyVaultProperties) {
        this.keySource = keySource;
        this.keyVaultProperties = keyVaultProperties;
    }

    /**
     * Enumerates the possible value of keySource for Encryption
     * 
    */
    public Optional<String> getKeySource() {
        return Optional.ofNullable(this.keySource);
    }
    /**
     * Properties of KeyVault
     * 
    */
    public Optional<KeyVaultPropertiesResponse> getKeyVaultProperties() {
        return Optional.ofNullable(this.keyVaultProperties);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keySource;
        private @Nullable KeyVaultPropertiesResponse keyVaultProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keySource = defaults.keySource;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
        }

        public Builder setKeySource(@Nullable String keySource) {
            this.keySource = keySource;
            return this;
        }

        public Builder setKeyVaultProperties(@Nullable KeyVaultPropertiesResponse keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }
        public EncryptionResponse build() {
            return new EncryptionResponse(keySource, keyVaultProperties);
        }
    }
}