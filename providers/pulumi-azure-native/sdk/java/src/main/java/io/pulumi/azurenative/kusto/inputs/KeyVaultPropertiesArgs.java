// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of the key vault.
 * 
 */
public final class KeyVaultPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultPropertiesArgs Empty = new KeyVaultPropertiesArgs();

    /**
     * The name of the key vault key.
     * 
     */
    @InputImport(name="keyName", required=true)
    private final Input<String> keyName;

    public Input<String> getKeyName() {
        return this.keyName;
    }

    /**
     * The Uri of the key vault.
     * 
     */
    @InputImport(name="keyVaultUri", required=true)
    private final Input<String> keyVaultUri;

    public Input<String> getKeyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * The version of the key vault key.
     * 
     */
    @InputImport(name="keyVersion")
    private final @Nullable Input<String> keyVersion;

    public Input<String> getKeyVersion() {
        return this.keyVersion == null ? Input.empty() : this.keyVersion;
    }

    /**
     * The user assigned identity (ARM resource id) that has access to the key.
     * 
     */
    @InputImport(name="userIdentity")
    private final @Nullable Input<String> userIdentity;

    public Input<String> getUserIdentity() {
        return this.userIdentity == null ? Input.empty() : this.userIdentity;
    }

    public KeyVaultPropertiesArgs(
        Input<String> keyName,
        Input<String> keyVaultUri,
        @Nullable Input<String> keyVersion,
        @Nullable Input<String> userIdentity) {
        this.keyName = Objects.requireNonNull(keyName, "expected parameter 'keyName' to be non-null");
        this.keyVaultUri = Objects.requireNonNull(keyVaultUri, "expected parameter 'keyVaultUri' to be non-null");
        this.keyVersion = keyVersion;
        this.userIdentity = userIdentity;
    }

    private KeyVaultPropertiesArgs() {
        this.keyName = Input.empty();
        this.keyVaultUri = Input.empty();
        this.keyVersion = Input.empty();
        this.userIdentity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> keyName;
        private Input<String> keyVaultUri;
        private @Nullable Input<String> keyVersion;
        private @Nullable Input<String> userIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.keyVersion = defaults.keyVersion;
    	      this.userIdentity = defaults.userIdentity;
        }

        public Builder setKeyName(Input<String> keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder setKeyName(String keyName) {
            this.keyName = Input.of(Objects.requireNonNull(keyName));
            return this;
        }

        public Builder setKeyVaultUri(Input<String> keyVaultUri) {
            this.keyVaultUri = Objects.requireNonNull(keyVaultUri);
            return this;
        }

        public Builder setKeyVaultUri(String keyVaultUri) {
            this.keyVaultUri = Input.of(Objects.requireNonNull(keyVaultUri));
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

        public Builder setUserIdentity(@Nullable Input<String> userIdentity) {
            this.userIdentity = userIdentity;
            return this;
        }

        public Builder setUserIdentity(@Nullable String userIdentity) {
            this.userIdentity = Input.ofNullable(userIdentity);
            return this;
        }

        public KeyVaultPropertiesArgs build() {
            return new KeyVaultPropertiesArgs(keyName, keyVaultUri, keyVersion, userIdentity);
        }
    }
}
