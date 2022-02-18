// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.SecretResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeviceSecretsResponse {
    /**
     * Keyvault Id of BMCDefaultUserPassword
     * 
     */
    private final @Nullable SecretResponse bmcDefaultUserPassword;
    /**
     * Keyvault Id of HcsDataVolumeBitLockerExternalKey
     * 
     */
    private final @Nullable SecretResponse hcsDataVolumeBitLockerExternalKey;
    /**
     * Keyvault Id of HcsInternalVolumeBitLockerExternalKey
     * 
     */
    private final @Nullable SecretResponse hcsInternalVolumeBitLockerExternalKey;
    /**
     * Keyvault Id of RotateKeyForDataVolumeBitlocker
     * 
     */
    private final @Nullable SecretResponse rotateKeyForDataVolumeBitlocker;
    /**
     * Keyvault Id of RotateKeysForSedDrivesSerialized
     * 
     */
    private final @Nullable SecretResponse rotateKeysForSedDrivesSerialized;
    /**
     * Keyvault Id of SEDEncryptionExternalKey
     * 
     */
    private final @Nullable SecretResponse sedEncryptionExternalKey;
    /**
     * Keyvault Id of SEDEncryptionExternalKeyId
     * 
     */
    private final @Nullable SecretResponse sedEncryptionExternalKeyId;
    /**
     * Keyvault Id of SystemVolumeBitLockerRecoveryKey
     * 
     */
    private final @Nullable SecretResponse systemVolumeBitLockerRecoveryKey;

    @OutputCustomType.Constructor({"bmcDefaultUserPassword","hcsDataVolumeBitLockerExternalKey","hcsInternalVolumeBitLockerExternalKey","rotateKeyForDataVolumeBitlocker","rotateKeysForSedDrivesSerialized","sedEncryptionExternalKey","sedEncryptionExternalKeyId","systemVolumeBitLockerRecoveryKey"})
    private DeviceSecretsResponse(
        @Nullable SecretResponse bmcDefaultUserPassword,
        @Nullable SecretResponse hcsDataVolumeBitLockerExternalKey,
        @Nullable SecretResponse hcsInternalVolumeBitLockerExternalKey,
        @Nullable SecretResponse rotateKeyForDataVolumeBitlocker,
        @Nullable SecretResponse rotateKeysForSedDrivesSerialized,
        @Nullable SecretResponse sedEncryptionExternalKey,
        @Nullable SecretResponse sedEncryptionExternalKeyId,
        @Nullable SecretResponse systemVolumeBitLockerRecoveryKey) {
        this.bmcDefaultUserPassword = bmcDefaultUserPassword;
        this.hcsDataVolumeBitLockerExternalKey = hcsDataVolumeBitLockerExternalKey;
        this.hcsInternalVolumeBitLockerExternalKey = hcsInternalVolumeBitLockerExternalKey;
        this.rotateKeyForDataVolumeBitlocker = rotateKeyForDataVolumeBitlocker;
        this.rotateKeysForSedDrivesSerialized = rotateKeysForSedDrivesSerialized;
        this.sedEncryptionExternalKey = sedEncryptionExternalKey;
        this.sedEncryptionExternalKeyId = sedEncryptionExternalKeyId;
        this.systemVolumeBitLockerRecoveryKey = systemVolumeBitLockerRecoveryKey;
    }

    /**
     * Keyvault Id of BMCDefaultUserPassword
     * 
     */
    public Optional<SecretResponse> getBmcDefaultUserPassword() {
        return Optional.ofNullable(this.bmcDefaultUserPassword);
    }
    /**
     * Keyvault Id of HcsDataVolumeBitLockerExternalKey
     * 
     */
    public Optional<SecretResponse> getHcsDataVolumeBitLockerExternalKey() {
        return Optional.ofNullable(this.hcsDataVolumeBitLockerExternalKey);
    }
    /**
     * Keyvault Id of HcsInternalVolumeBitLockerExternalKey
     * 
     */
    public Optional<SecretResponse> getHcsInternalVolumeBitLockerExternalKey() {
        return Optional.ofNullable(this.hcsInternalVolumeBitLockerExternalKey);
    }
    /**
     * Keyvault Id of RotateKeyForDataVolumeBitlocker
     * 
     */
    public Optional<SecretResponse> getRotateKeyForDataVolumeBitlocker() {
        return Optional.ofNullable(this.rotateKeyForDataVolumeBitlocker);
    }
    /**
     * Keyvault Id of RotateKeysForSedDrivesSerialized
     * 
     */
    public Optional<SecretResponse> getRotateKeysForSedDrivesSerialized() {
        return Optional.ofNullable(this.rotateKeysForSedDrivesSerialized);
    }
    /**
     * Keyvault Id of SEDEncryptionExternalKey
     * 
     */
    public Optional<SecretResponse> getSedEncryptionExternalKey() {
        return Optional.ofNullable(this.sedEncryptionExternalKey);
    }
    /**
     * Keyvault Id of SEDEncryptionExternalKeyId
     * 
     */
    public Optional<SecretResponse> getSedEncryptionExternalKeyId() {
        return Optional.ofNullable(this.sedEncryptionExternalKeyId);
    }
    /**
     * Keyvault Id of SystemVolumeBitLockerRecoveryKey
     * 
     */
    public Optional<SecretResponse> getSystemVolumeBitLockerRecoveryKey() {
        return Optional.ofNullable(this.systemVolumeBitLockerRecoveryKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceSecretsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SecretResponse bmcDefaultUserPassword;
        private @Nullable SecretResponse hcsDataVolumeBitLockerExternalKey;
        private @Nullable SecretResponse hcsInternalVolumeBitLockerExternalKey;
        private @Nullable SecretResponse rotateKeyForDataVolumeBitlocker;
        private @Nullable SecretResponse rotateKeysForSedDrivesSerialized;
        private @Nullable SecretResponse sedEncryptionExternalKey;
        private @Nullable SecretResponse sedEncryptionExternalKeyId;
        private @Nullable SecretResponse systemVolumeBitLockerRecoveryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceSecretsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bmcDefaultUserPassword = defaults.bmcDefaultUserPassword;
    	      this.hcsDataVolumeBitLockerExternalKey = defaults.hcsDataVolumeBitLockerExternalKey;
    	      this.hcsInternalVolumeBitLockerExternalKey = defaults.hcsInternalVolumeBitLockerExternalKey;
    	      this.rotateKeyForDataVolumeBitlocker = defaults.rotateKeyForDataVolumeBitlocker;
    	      this.rotateKeysForSedDrivesSerialized = defaults.rotateKeysForSedDrivesSerialized;
    	      this.sedEncryptionExternalKey = defaults.sedEncryptionExternalKey;
    	      this.sedEncryptionExternalKeyId = defaults.sedEncryptionExternalKeyId;
    	      this.systemVolumeBitLockerRecoveryKey = defaults.systemVolumeBitLockerRecoveryKey;
        }

        public Builder setBmcDefaultUserPassword(@Nullable SecretResponse bmcDefaultUserPassword) {
            this.bmcDefaultUserPassword = bmcDefaultUserPassword;
            return this;
        }

        public Builder setHcsDataVolumeBitLockerExternalKey(@Nullable SecretResponse hcsDataVolumeBitLockerExternalKey) {
            this.hcsDataVolumeBitLockerExternalKey = hcsDataVolumeBitLockerExternalKey;
            return this;
        }

        public Builder setHcsInternalVolumeBitLockerExternalKey(@Nullable SecretResponse hcsInternalVolumeBitLockerExternalKey) {
            this.hcsInternalVolumeBitLockerExternalKey = hcsInternalVolumeBitLockerExternalKey;
            return this;
        }

        public Builder setRotateKeyForDataVolumeBitlocker(@Nullable SecretResponse rotateKeyForDataVolumeBitlocker) {
            this.rotateKeyForDataVolumeBitlocker = rotateKeyForDataVolumeBitlocker;
            return this;
        }

        public Builder setRotateKeysForSedDrivesSerialized(@Nullable SecretResponse rotateKeysForSedDrivesSerialized) {
            this.rotateKeysForSedDrivesSerialized = rotateKeysForSedDrivesSerialized;
            return this;
        }

        public Builder setSedEncryptionExternalKey(@Nullable SecretResponse sedEncryptionExternalKey) {
            this.sedEncryptionExternalKey = sedEncryptionExternalKey;
            return this;
        }

        public Builder setSedEncryptionExternalKeyId(@Nullable SecretResponse sedEncryptionExternalKeyId) {
            this.sedEncryptionExternalKeyId = sedEncryptionExternalKeyId;
            return this;
        }

        public Builder setSystemVolumeBitLockerRecoveryKey(@Nullable SecretResponse systemVolumeBitLockerRecoveryKey) {
            this.systemVolumeBitLockerRecoveryKey = systemVolumeBitLockerRecoveryKey;
            return this;
        }

        public DeviceSecretsResponse build() {
            return new DeviceSecretsResponse(bmcDefaultUserPassword, hcsDataVolumeBitLockerExternalKey, hcsInternalVolumeBitLockerExternalKey, rotateKeyForDataVolumeBitlocker, rotateKeysForSedDrivesSerialized, sedEncryptionExternalKey, sedEncryptionExternalKeyId, systemVolumeBitLockerRecoveryKey);
        }
    }
}
