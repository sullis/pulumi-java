// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.enums.KeySource;
import io.pulumi.azurenative.batch.inputs.KeyVaultPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configures how customer data is encrypted inside the Batch account. By default, accounts are encrypted using a Microsoft managed key. For additional control, a customer-managed key can be used instead.
 * 
 */
public final class EncryptionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionPropertiesArgs Empty = new EncryptionPropertiesArgs();

    /**
     * Type of the key source.
     * 
     */
    @InputImport(name="keySource")
    private final @Nullable Input<KeySource> keySource;

    public Input<KeySource> getKeySource() {
        return this.keySource == null ? Input.empty() : this.keySource;
    }

    /**
     * Additional details when using Microsoft.KeyVault
     * 
     */
    @InputImport(name="keyVaultProperties")
    private final @Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties;

    public Input<KeyVaultPropertiesArgs> getKeyVaultProperties() {
        return this.keyVaultProperties == null ? Input.empty() : this.keyVaultProperties;
    }

    public EncryptionPropertiesArgs(
        @Nullable Input<KeySource> keySource,
        @Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties) {
        this.keySource = keySource;
        this.keyVaultProperties = keyVaultProperties;
    }

    private EncryptionPropertiesArgs() {
        this.keySource = Input.empty();
        this.keyVaultProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<KeySource> keySource;
        private @Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keySource = defaults.keySource;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
        }

        public Builder setKeySource(@Nullable Input<KeySource> keySource) {
            this.keySource = keySource;
            return this;
        }

        public Builder setKeySource(@Nullable KeySource keySource) {
            this.keySource = Input.ofNullable(keySource);
            return this;
        }

        public Builder setKeyVaultProperties(@Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }

        public Builder setKeyVaultProperties(@Nullable KeyVaultPropertiesArgs keyVaultProperties) {
            this.keyVaultProperties = Input.ofNullable(keyVaultProperties);
            return this;
        }

        public EncryptionPropertiesArgs build() {
            return new EncryptionPropertiesArgs(keySource, keyVaultProperties);
        }
    }
}
