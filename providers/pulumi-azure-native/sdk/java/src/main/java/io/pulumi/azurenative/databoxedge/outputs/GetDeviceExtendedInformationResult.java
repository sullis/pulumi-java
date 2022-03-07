// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.DeviceSecretsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDeviceExtendedInformationResult {
    /**
     * The name of Channel Integrity Key stored in the Client Key Vault
     * 
     */
    private final @Nullable String channelIntegrityKeyName;
    /**
     * The version of Channel Integrity Key stored in the Client Key Vault
     * 
     */
    private final @Nullable String channelIntegrityKeyVersion;
    /**
     * The Key Vault ARM Id for client secrets
     * 
     */
    private final @Nullable String clientSecretStoreId;
    /**
     * The url to access the Client Key Vault
     * 
     */
    private final @Nullable String clientSecretStoreUrl;
    /**
     * Device secrets, will be returned only with ODataFilter $expand=deviceSecrets
     * 
     */
    private final DeviceSecretsResponse deviceSecrets;
    /**
     * The public part of the encryption certificate. Client uses this to encrypt any secret.
     * 
     */
    private final @Nullable String encryptionKey;
    /**
     * The digital signature of encrypted certificate.
     * 
     */
    private final @Nullable String encryptionKeyThumbprint;
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * Key vault sync status
     * 
     */
    private final @Nullable String keyVaultSyncStatus;
    /**
     * The object name.
     * 
     */
    private final String name;
    /**
     * The Resource ID of the Resource.
     * 
     */
    private final String resourceKey;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"channelIntegrityKeyName","channelIntegrityKeyVersion","clientSecretStoreId","clientSecretStoreUrl","deviceSecrets","encryptionKey","encryptionKeyThumbprint","id","keyVaultSyncStatus","name","resourceKey","type"})
    private GetDeviceExtendedInformationResult(
        @Nullable String channelIntegrityKeyName,
        @Nullable String channelIntegrityKeyVersion,
        @Nullable String clientSecretStoreId,
        @Nullable String clientSecretStoreUrl,
        DeviceSecretsResponse deviceSecrets,
        @Nullable String encryptionKey,
        @Nullable String encryptionKeyThumbprint,
        String id,
        @Nullable String keyVaultSyncStatus,
        String name,
        String resourceKey,
        String type) {
        this.channelIntegrityKeyName = channelIntegrityKeyName;
        this.channelIntegrityKeyVersion = channelIntegrityKeyVersion;
        this.clientSecretStoreId = clientSecretStoreId;
        this.clientSecretStoreUrl = clientSecretStoreUrl;
        this.deviceSecrets = Objects.requireNonNull(deviceSecrets);
        this.encryptionKey = encryptionKey;
        this.encryptionKeyThumbprint = encryptionKeyThumbprint;
        this.id = Objects.requireNonNull(id);
        this.keyVaultSyncStatus = keyVaultSyncStatus;
        this.name = Objects.requireNonNull(name);
        this.resourceKey = Objects.requireNonNull(resourceKey);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The name of Channel Integrity Key stored in the Client Key Vault
     * 
    */
    public Optional<String> getChannelIntegrityKeyName() {
        return Optional.ofNullable(this.channelIntegrityKeyName);
    }
    /**
     * The version of Channel Integrity Key stored in the Client Key Vault
     * 
    */
    public Optional<String> getChannelIntegrityKeyVersion() {
        return Optional.ofNullable(this.channelIntegrityKeyVersion);
    }
    /**
     * The Key Vault ARM Id for client secrets
     * 
    */
    public Optional<String> getClientSecretStoreId() {
        return Optional.ofNullable(this.clientSecretStoreId);
    }
    /**
     * The url to access the Client Key Vault
     * 
    */
    public Optional<String> getClientSecretStoreUrl() {
        return Optional.ofNullable(this.clientSecretStoreUrl);
    }
    /**
     * Device secrets, will be returned only with ODataFilter $expand=deviceSecrets
     * 
    */
    public DeviceSecretsResponse getDeviceSecrets() {
        return this.deviceSecrets;
    }
    /**
     * The public part of the encryption certificate. Client uses this to encrypt any secret.
     * 
    */
    public Optional<String> getEncryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }
    /**
     * The digital signature of encrypted certificate.
     * 
    */
    public Optional<String> getEncryptionKeyThumbprint() {
        return Optional.ofNullable(this.encryptionKeyThumbprint);
    }
    /**
     * The path ID that uniquely identifies the object.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Key vault sync status
     * 
    */
    public Optional<String> getKeyVaultSyncStatus() {
        return Optional.ofNullable(this.keyVaultSyncStatus);
    }
    /**
     * The object name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The Resource ID of the Resource.
     * 
    */
    public String getResourceKey() {
        return this.resourceKey;
    }
    /**
     * The hierarchical type of the object.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceExtendedInformationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String channelIntegrityKeyName;
        private @Nullable String channelIntegrityKeyVersion;
        private @Nullable String clientSecretStoreId;
        private @Nullable String clientSecretStoreUrl;
        private DeviceSecretsResponse deviceSecrets;
        private @Nullable String encryptionKey;
        private @Nullable String encryptionKeyThumbprint;
        private String id;
        private @Nullable String keyVaultSyncStatus;
        private String name;
        private String resourceKey;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeviceExtendedInformationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelIntegrityKeyName = defaults.channelIntegrityKeyName;
    	      this.channelIntegrityKeyVersion = defaults.channelIntegrityKeyVersion;
    	      this.clientSecretStoreId = defaults.clientSecretStoreId;
    	      this.clientSecretStoreUrl = defaults.clientSecretStoreUrl;
    	      this.deviceSecrets = defaults.deviceSecrets;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.encryptionKeyThumbprint = defaults.encryptionKeyThumbprint;
    	      this.id = defaults.id;
    	      this.keyVaultSyncStatus = defaults.keyVaultSyncStatus;
    	      this.name = defaults.name;
    	      this.resourceKey = defaults.resourceKey;
    	      this.type = defaults.type;
        }

        public Builder setChannelIntegrityKeyName(@Nullable String channelIntegrityKeyName) {
            this.channelIntegrityKeyName = channelIntegrityKeyName;
            return this;
        }

        public Builder setChannelIntegrityKeyVersion(@Nullable String channelIntegrityKeyVersion) {
            this.channelIntegrityKeyVersion = channelIntegrityKeyVersion;
            return this;
        }

        public Builder setClientSecretStoreId(@Nullable String clientSecretStoreId) {
            this.clientSecretStoreId = clientSecretStoreId;
            return this;
        }

        public Builder setClientSecretStoreUrl(@Nullable String clientSecretStoreUrl) {
            this.clientSecretStoreUrl = clientSecretStoreUrl;
            return this;
        }

        public Builder setDeviceSecrets(DeviceSecretsResponse deviceSecrets) {
            this.deviceSecrets = Objects.requireNonNull(deviceSecrets);
            return this;
        }

        public Builder setEncryptionKey(@Nullable String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        public Builder setEncryptionKeyThumbprint(@Nullable String encryptionKeyThumbprint) {
            this.encryptionKeyThumbprint = encryptionKeyThumbprint;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKeyVaultSyncStatus(@Nullable String keyVaultSyncStatus) {
            this.keyVaultSyncStatus = keyVaultSyncStatus;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceKey(String resourceKey) {
            this.resourceKey = Objects.requireNonNull(resourceKey);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDeviceExtendedInformationResult build() {
            return new GetDeviceExtendedInformationResult(channelIntegrityKeyName, channelIntegrityKeyVersion, clientSecretStoreId, clientSecretStoreUrl, deviceSecrets, encryptionKey, encryptionKeyThumbprint, id, keyVaultSyncStatus, name, resourceKey, type);
        }
    }
}