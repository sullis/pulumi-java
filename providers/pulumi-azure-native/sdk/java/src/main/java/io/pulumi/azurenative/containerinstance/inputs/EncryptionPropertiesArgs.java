// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The container group encryption properties.
 * 
 */
public final class EncryptionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionPropertiesArgs Empty = new EncryptionPropertiesArgs();

    /**
     * The encryption key name.
     * 
     */
    @InputImport(name="keyName", required=true)
      private final Input<String> keyName;

    public Input<String> getKeyName() {
        return this.keyName;
    }

    /**
     * The encryption key version.
     * 
     */
    @InputImport(name="keyVersion", required=true)
      private final Input<String> keyVersion;

    public Input<String> getKeyVersion() {
        return this.keyVersion;
    }

    /**
     * The keyvault base url.
     * 
     */
    @InputImport(name="vaultBaseUrl", required=true)
      private final Input<String> vaultBaseUrl;

    public Input<String> getVaultBaseUrl() {
        return this.vaultBaseUrl;
    }

    public EncryptionPropertiesArgs(
        Input<String> keyName,
        Input<String> keyVersion,
        Input<String> vaultBaseUrl) {
        this.keyName = Objects.requireNonNull(keyName, "expected parameter 'keyName' to be non-null");
        this.keyVersion = Objects.requireNonNull(keyVersion, "expected parameter 'keyVersion' to be non-null");
        this.vaultBaseUrl = Objects.requireNonNull(vaultBaseUrl, "expected parameter 'vaultBaseUrl' to be non-null");
    }

    private EncryptionPropertiesArgs() {
        this.keyName = Input.empty();
        this.keyVersion = Input.empty();
        this.vaultBaseUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> keyName;
        private Input<String> keyVersion;
        private Input<String> vaultBaseUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyVersion = defaults.keyVersion;
    	      this.vaultBaseUrl = defaults.vaultBaseUrl;
        }

        public Builder setKeyName(Input<String> keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder setKeyName(String keyName) {
            this.keyName = Input.of(Objects.requireNonNull(keyName));
            return this;
        }

        public Builder setKeyVersion(Input<String> keyVersion) {
            this.keyVersion = Objects.requireNonNull(keyVersion);
            return this;
        }

        public Builder setKeyVersion(String keyVersion) {
            this.keyVersion = Input.of(Objects.requireNonNull(keyVersion));
            return this;
        }

        public Builder setVaultBaseUrl(Input<String> vaultBaseUrl) {
            this.vaultBaseUrl = Objects.requireNonNull(vaultBaseUrl);
            return this;
        }

        public Builder setVaultBaseUrl(String vaultBaseUrl) {
            this.vaultBaseUrl = Input.of(Objects.requireNonNull(vaultBaseUrl));
            return this;
        }
        public EncryptionPropertiesArgs build() {
            return new EncryptionPropertiesArgs(keyName, keyVersion, vaultBaseUrl);
        }
    }
}