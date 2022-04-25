// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.azurenative.batch.inputs.KeyVaultPropertiesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configures how customer data is encrypted inside the Batch account. By default, accounts are encrypted using a Microsoft managed key. For additional control, a customer-managed key can be used instead.
 * 
 */
public final class EncryptionPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final EncryptionPropertiesResponse Empty = new EncryptionPropertiesResponse();

    /**
     * Type of the key source.
     * 
     */
    @Import(name="keySource")
    private @Nullable String keySource;

    /**
     * @return Type of the key source.
     * 
     */
    public Optional<String> keySource() {
        return Optional.ofNullable(this.keySource);
    }

    /**
     * Additional details when using Microsoft.KeyVault
     * 
     */
    @Import(name="keyVaultProperties")
    private @Nullable KeyVaultPropertiesResponse keyVaultProperties;

    /**
     * @return Additional details when using Microsoft.KeyVault
     * 
     */
    public Optional<KeyVaultPropertiesResponse> keyVaultProperties() {
        return Optional.ofNullable(this.keyVaultProperties);
    }

    private EncryptionPropertiesResponse() {}

    private EncryptionPropertiesResponse(EncryptionPropertiesResponse $) {
        this.keySource = $.keySource;
        this.keyVaultProperties = $.keyVaultProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionPropertiesResponse $;

        public Builder() {
            $ = new EncryptionPropertiesResponse();
        }

        public Builder(EncryptionPropertiesResponse defaults) {
            $ = new EncryptionPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param keySource Type of the key source.
         * 
         * @return builder
         * 
         */
        public Builder keySource(@Nullable String keySource) {
            $.keySource = keySource;
            return this;
        }

        /**
         * @param keyVaultProperties Additional details when using Microsoft.KeyVault
         * 
         * @return builder
         * 
         */
        public Builder keyVaultProperties(@Nullable KeyVaultPropertiesResponse keyVaultProperties) {
            $.keyVaultProperties = keyVaultProperties;
            return this;
        }

        public EncryptionPropertiesResponse build() {
            return $;
        }
    }

}
