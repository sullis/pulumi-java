// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
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
     * The name of key used to encrypt data.
     * 
     */
    @InputImport(name="keyName")
    private final @Nullable Input<String> keyName;

    public Input<String> getKeyName() {
        return this.keyName == null ? Input.empty() : this.keyName;
    }

    /**
     * The key version of the key used to encrypt data.
     * 
     */
    @InputImport(name="keyVersion")
    private final @Nullable Input<String> keyVersion;

    public Input<String> getKeyVersion() {
        return this.keyVersion == null ? Input.empty() : this.keyVersion;
    }

    /**
     * The URI of the key vault key used to encrypt data.
     * 
     */
    @InputImport(name="keyvaultUri")
    private final @Nullable Input<String> keyvaultUri;

    public Input<String> getKeyvaultUri() {
        return this.keyvaultUri == null ? Input.empty() : this.keyvaultUri;
    }

    public KeyVaultPropertiesArgs(
        @Nullable Input<String> keyName,
        @Nullable Input<String> keyVersion,
        @Nullable Input<String> keyvaultUri) {
        this.keyName = keyName;
        this.keyVersion = keyVersion;
        this.keyvaultUri = keyvaultUri;
    }

    private KeyVaultPropertiesArgs() {
        this.keyName = Input.empty();
        this.keyVersion = Input.empty();
        this.keyvaultUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyName;
        private @Nullable Input<String> keyVersion;
        private @Nullable Input<String> keyvaultUri;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyVersion = defaults.keyVersion;
    	      this.keyvaultUri = defaults.keyvaultUri;
        }

        public Builder setKeyName(@Nullable Input<String> keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder setKeyName(@Nullable String keyName) {
            this.keyName = Input.ofNullable(keyName);
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

        public Builder setKeyvaultUri(@Nullable Input<String> keyvaultUri) {
            this.keyvaultUri = keyvaultUri;
            return this;
        }

        public Builder setKeyvaultUri(@Nullable String keyvaultUri) {
            this.keyvaultUri = Input.ofNullable(keyvaultUri);
            return this;
        }

        public KeyVaultPropertiesArgs build() {
            return new KeyVaultPropertiesArgs(keyName, keyVersion, keyvaultUri);
        }
    }
}
