// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of a user's secret store.
 * 
 */
public final class UserSecretStoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserSecretStoreArgs Empty = new UserSecretStoreArgs();

    /**
     * The ID of the user's Key vault.
     * 
     */
    @InputImport(name="keyVaultId")
    private final @Nullable Input<String> keyVaultId;

    public Input<String> getKeyVaultId() {
        return this.keyVaultId == null ? Input.empty() : this.keyVaultId;
    }

    /**
     * The URI of the user's Key vault.
     * 
     */
    @InputImport(name="keyVaultUri")
    private final @Nullable Input<String> keyVaultUri;

    public Input<String> getKeyVaultUri() {
        return this.keyVaultUri == null ? Input.empty() : this.keyVaultUri;
    }

    public UserSecretStoreArgs(
        @Nullable Input<String> keyVaultId,
        @Nullable Input<String> keyVaultUri) {
        this.keyVaultId = keyVaultId;
        this.keyVaultUri = keyVaultUri;
    }

    private UserSecretStoreArgs() {
        this.keyVaultId = Input.empty();
        this.keyVaultUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserSecretStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyVaultId;
        private @Nullable Input<String> keyVaultUri;

        public Builder() {
    	      // Empty
        }

        public Builder(UserSecretStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.keyVaultUri = defaults.keyVaultUri;
        }

        public Builder setKeyVaultId(@Nullable Input<String> keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }

        public Builder setKeyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = Input.ofNullable(keyVaultId);
            return this;
        }

        public Builder setKeyVaultUri(@Nullable Input<String> keyVaultUri) {
            this.keyVaultUri = keyVaultUri;
            return this;
        }

        public Builder setKeyVaultUri(@Nullable String keyVaultUri) {
            this.keyVaultUri = Input.ofNullable(keyVaultUri);
            return this;
        }

        public UserSecretStoreArgs build() {
            return new UserSecretStoreArgs(keyVaultId, keyVaultUri);
        }
    }
}
