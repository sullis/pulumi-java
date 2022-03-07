// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appconfiguration.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings concerning key vault encryption for a configuration store.
 * 
 */
public final class KeyVaultPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultPropertiesArgs Empty = new KeyVaultPropertiesArgs();

    /**
     * The client id of the identity which will be used to access key vault.
     * 
     */
    @InputImport(name="identityClientId")
      private final @Nullable Input<String> identityClientId;

    public Input<String> getIdentityClientId() {
        return this.identityClientId == null ? Input.empty() : this.identityClientId;
    }

    /**
     * The URI of the key vault key used to encrypt data.
     * 
     */
    @InputImport(name="keyIdentifier")
      private final @Nullable Input<String> keyIdentifier;

    public Input<String> getKeyIdentifier() {
        return this.keyIdentifier == null ? Input.empty() : this.keyIdentifier;
    }

    public KeyVaultPropertiesArgs(
        @Nullable Input<String> identityClientId,
        @Nullable Input<String> keyIdentifier) {
        this.identityClientId = identityClientId;
        this.keyIdentifier = keyIdentifier;
    }

    private KeyVaultPropertiesArgs() {
        this.identityClientId = Input.empty();
        this.keyIdentifier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> identityClientId;
        private @Nullable Input<String> keyIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityClientId = defaults.identityClientId;
    	      this.keyIdentifier = defaults.keyIdentifier;
        }

        public Builder setIdentityClientId(@Nullable Input<String> identityClientId) {
            this.identityClientId = identityClientId;
            return this;
        }

        public Builder setIdentityClientId(@Nullable String identityClientId) {
            this.identityClientId = Input.ofNullable(identityClientId);
            return this;
        }

        public Builder setKeyIdentifier(@Nullable Input<String> keyIdentifier) {
            this.keyIdentifier = keyIdentifier;
            return this;
        }

        public Builder setKeyIdentifier(@Nullable String keyIdentifier) {
            this.keyIdentifier = Input.ofNullable(keyIdentifier);
            return this;
        }
        public KeyVaultPropertiesArgs build() {
            return new KeyVaultPropertiesArgs(identityClientId, keyIdentifier);
        }
    }
}