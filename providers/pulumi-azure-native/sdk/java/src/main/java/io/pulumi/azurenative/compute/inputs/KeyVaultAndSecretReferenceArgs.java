// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.SourceVaultArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Key Vault Secret Url and vault id of the encryption key
 * 
 */
public final class KeyVaultAndSecretReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultAndSecretReferenceArgs Empty = new KeyVaultAndSecretReferenceArgs();

    /**
     * Url pointing to a key or secret in KeyVault
     * 
     */
    @InputImport(name="secretUrl", required=true)
      private final Input<String> secretUrl;

    public Input<String> getSecretUrl() {
        return this.secretUrl;
    }

    /**
     * Resource id of the KeyVault containing the key or secret
     * 
     */
    @InputImport(name="sourceVault", required=true)
      private final Input<SourceVaultArgs> sourceVault;

    public Input<SourceVaultArgs> getSourceVault() {
        return this.sourceVault;
    }

    public KeyVaultAndSecretReferenceArgs(
        Input<String> secretUrl,
        Input<SourceVaultArgs> sourceVault) {
        this.secretUrl = Objects.requireNonNull(secretUrl, "expected parameter 'secretUrl' to be non-null");
        this.sourceVault = Objects.requireNonNull(sourceVault, "expected parameter 'sourceVault' to be non-null");
    }

    private KeyVaultAndSecretReferenceArgs() {
        this.secretUrl = Input.empty();
        this.sourceVault = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultAndSecretReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> secretUrl;
        private Input<SourceVaultArgs> sourceVault;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultAndSecretReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretUrl = defaults.secretUrl;
    	      this.sourceVault = defaults.sourceVault;
        }

        public Builder setSecretUrl(Input<String> secretUrl) {
            this.secretUrl = Objects.requireNonNull(secretUrl);
            return this;
        }

        public Builder setSecretUrl(String secretUrl) {
            this.secretUrl = Input.of(Objects.requireNonNull(secretUrl));
            return this;
        }

        public Builder setSourceVault(Input<SourceVaultArgs> sourceVault) {
            this.sourceVault = Objects.requireNonNull(sourceVault);
            return this;
        }

        public Builder setSourceVault(SourceVaultArgs sourceVault) {
            this.sourceVault = Input.of(Objects.requireNonNull(sourceVault));
            return this;
        }
        public KeyVaultAndSecretReferenceArgs build() {
            return new KeyVaultAndSecretReferenceArgs(secretUrl, sourceVault);
        }
    }
}