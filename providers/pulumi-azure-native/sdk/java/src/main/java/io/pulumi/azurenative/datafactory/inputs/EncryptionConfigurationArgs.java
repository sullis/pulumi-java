// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.CMKIdentityDefinitionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Definition of CMK for the factory.
 * 
 */
public final class EncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionConfigurationArgs Empty = new EncryptionConfigurationArgs();

    /**
     * User assigned identity to use to authenticate to customer's key vault. If not provided Managed Service Identity will be used.
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Input<CMKIdentityDefinitionArgs> identity;

    public Input<CMKIdentityDefinitionArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * The name of the key in Azure Key Vault to use as Customer Managed Key.
     * 
     */
    @InputImport(name="keyName", required=true)
      private final Input<String> keyName;

    public Input<String> getKeyName() {
        return this.keyName;
    }

    /**
     * The version of the key used for CMK. If not provided, latest version will be used.
     * 
     */
    @InputImport(name="keyVersion")
      private final @Nullable Input<String> keyVersion;

    public Input<String> getKeyVersion() {
        return this.keyVersion == null ? Input.empty() : this.keyVersion;
    }

    /**
     * The url of the Azure Key Vault used for CMK.
     * 
     */
    @InputImport(name="vaultBaseUrl", required=true)
      private final Input<String> vaultBaseUrl;

    public Input<String> getVaultBaseUrl() {
        return this.vaultBaseUrl;
    }

    public EncryptionConfigurationArgs(
        @Nullable Input<CMKIdentityDefinitionArgs> identity,
        Input<String> keyName,
        @Nullable Input<String> keyVersion,
        Input<String> vaultBaseUrl) {
        this.identity = identity;
        this.keyName = Objects.requireNonNull(keyName, "expected parameter 'keyName' to be non-null");
        this.keyVersion = keyVersion;
        this.vaultBaseUrl = Objects.requireNonNull(vaultBaseUrl, "expected parameter 'vaultBaseUrl' to be non-null");
    }

    private EncryptionConfigurationArgs() {
        this.identity = Input.empty();
        this.keyName = Input.empty();
        this.keyVersion = Input.empty();
        this.vaultBaseUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CMKIdentityDefinitionArgs> identity;
        private Input<String> keyName;
        private @Nullable Input<String> keyVersion;
        private Input<String> vaultBaseUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.keyName = defaults.keyName;
    	      this.keyVersion = defaults.keyVersion;
    	      this.vaultBaseUrl = defaults.vaultBaseUrl;
        }

        public Builder setIdentity(@Nullable Input<CMKIdentityDefinitionArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable CMKIdentityDefinitionArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setKeyName(Input<String> keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder setKeyName(String keyName) {
            this.keyName = Input.of(Objects.requireNonNull(keyName));
            return this;
        }

        public Builder setKeyVersion(@Nullable Input<String> keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }

        public Builder setKeyVersion(@Nullable String keyVersion) {
            this.keyVersion = Input.ofNullable(keyVersion);
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
        public EncryptionConfigurationArgs build() {
            return new EncryptionConfigurationArgs(identity, keyName, keyVersion, vaultBaseUrl);
        }
    }
}