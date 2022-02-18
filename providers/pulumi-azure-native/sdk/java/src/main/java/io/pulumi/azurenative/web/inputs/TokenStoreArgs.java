// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.BlobStorageTokenStoreArgs;
import io.pulumi.azurenative.web.inputs.FileSystemTokenStoreArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the token store.
 * 
 */
public final class TokenStoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final TokenStoreArgs Empty = new TokenStoreArgs();

    /**
     * The configuration settings of the storage of the tokens if blob storage is used.
     * 
     */
    @InputImport(name="azureBlobStorage")
    private final @Nullable Input<BlobStorageTokenStoreArgs> azureBlobStorage;

    public Input<BlobStorageTokenStoreArgs> getAzureBlobStorage() {
        return this.azureBlobStorage == null ? Input.empty() : this.azureBlobStorage;
    }

    /**
     * <code>true</code> to durably store platform-specific security tokens that are obtained during login flows; otherwise, <code>false</code>.
     *  The default is <code>false</code>.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The configuration settings of the storage of the tokens if a file system is used.
     * 
     */
    @InputImport(name="fileSystem")
    private final @Nullable Input<FileSystemTokenStoreArgs> fileSystem;

    public Input<FileSystemTokenStoreArgs> getFileSystem() {
        return this.fileSystem == null ? Input.empty() : this.fileSystem;
    }

    /**
     * The number of hours after session token expiration that a session token can be used to
     * call the token refresh API. The default is 72 hours.
     * 
     */
    @InputImport(name="tokenRefreshExtensionHours")
    private final @Nullable Input<Double> tokenRefreshExtensionHours;

    public Input<Double> getTokenRefreshExtensionHours() {
        return this.tokenRefreshExtensionHours == null ? Input.empty() : this.tokenRefreshExtensionHours;
    }

    public TokenStoreArgs(
        @Nullable Input<BlobStorageTokenStoreArgs> azureBlobStorage,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<FileSystemTokenStoreArgs> fileSystem,
        @Nullable Input<Double> tokenRefreshExtensionHours) {
        this.azureBlobStorage = azureBlobStorage;
        this.enabled = enabled;
        this.fileSystem = fileSystem;
        this.tokenRefreshExtensionHours = tokenRefreshExtensionHours;
    }

    private TokenStoreArgs() {
        this.azureBlobStorage = Input.empty();
        this.enabled = Input.empty();
        this.fileSystem = Input.empty();
        this.tokenRefreshExtensionHours = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BlobStorageTokenStoreArgs> azureBlobStorage;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<FileSystemTokenStoreArgs> fileSystem;
        private @Nullable Input<Double> tokenRefreshExtensionHours;

        public Builder() {
    	      // Empty
        }

        public Builder(TokenStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBlobStorage = defaults.azureBlobStorage;
    	      this.enabled = defaults.enabled;
    	      this.fileSystem = defaults.fileSystem;
    	      this.tokenRefreshExtensionHours = defaults.tokenRefreshExtensionHours;
        }

        public Builder setAzureBlobStorage(@Nullable Input<BlobStorageTokenStoreArgs> azureBlobStorage) {
            this.azureBlobStorage = azureBlobStorage;
            return this;
        }

        public Builder setAzureBlobStorage(@Nullable BlobStorageTokenStoreArgs azureBlobStorage) {
            this.azureBlobStorage = Input.ofNullable(azureBlobStorage);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setFileSystem(@Nullable Input<FileSystemTokenStoreArgs> fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }

        public Builder setFileSystem(@Nullable FileSystemTokenStoreArgs fileSystem) {
            this.fileSystem = Input.ofNullable(fileSystem);
            return this;
        }

        public Builder setTokenRefreshExtensionHours(@Nullable Input<Double> tokenRefreshExtensionHours) {
            this.tokenRefreshExtensionHours = tokenRefreshExtensionHours;
            return this;
        }

        public Builder setTokenRefreshExtensionHours(@Nullable Double tokenRefreshExtensionHours) {
            this.tokenRefreshExtensionHours = Input.ofNullable(tokenRefreshExtensionHours);
            return this;
        }

        public TokenStoreArgs build() {
            return new TokenStoreArgs(azureBlobStorage, enabled, fileSystem, tokenRefreshExtensionHours);
        }
    }
}
