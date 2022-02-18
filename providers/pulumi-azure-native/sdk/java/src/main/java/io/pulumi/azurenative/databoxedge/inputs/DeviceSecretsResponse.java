// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.SecretResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Device Secrets
 * 
 */
public final class DeviceSecretsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeviceSecretsResponse Empty = new DeviceSecretsResponse();

    /**
     * Keyvault Id of BMCDefaultUserPassword
     * 
     */
    @InputImport(name="bmcDefaultUserPassword")
    private final @Nullable SecretResponse bmcDefaultUserPassword;

    public Optional<SecretResponse> getBmcDefaultUserPassword() {
        return this.bmcDefaultUserPassword == null ? Optional.empty() : Optional.ofNullable(this.bmcDefaultUserPassword);
    }

    /**
     * Keyvault Id of HcsDataVolumeBitLockerExternalKey
     * 
     */
    @InputImport(name="hcsDataVolumeBitLockerExternalKey")
    private final @Nullable SecretResponse hcsDataVolumeBitLockerExternalKey;

    public Optional<SecretResponse> getHcsDataVolumeBitLockerExternalKey() {
        return this.hcsDataVolumeBitLockerExternalKey == null ? Optional.empty() : Optional.ofNullable(this.hcsDataVolumeBitLockerExternalKey);
    }

    /**
     * Keyvault Id of HcsInternalVolumeBitLockerExternalKey
     * 
     */
    @InputImport(name="hcsInternalVolumeBitLockerExternalKey")
    private final @Nullable SecretResponse hcsInternalVolumeBitLockerExternalKey;

    public Optional<SecretResponse> getHcsInternalVolumeBitLockerExternalKey() {
        return this.hcsInternalVolumeBitLockerExternalKey == null ? Optional.empty() : Optional.ofNullable(this.hcsInternalVolumeBitLockerExternalKey);
    }

    /**
     * Keyvault Id of RotateKeyForDataVolumeBitlocker
     * 
     */
    @InputImport(name="rotateKeyForDataVolumeBitlocker")
    private final @Nullable SecretResponse rotateKeyForDataVolumeBitlocker;

    public Optional<SecretResponse> getRotateKeyForDataVolumeBitlocker() {
        return this.rotateKeyForDataVolumeBitlocker == null ? Optional.empty() : Optional.ofNullable(this.rotateKeyForDataVolumeBitlocker);
    }

    /**
     * Keyvault Id of RotateKeysForSedDrivesSerialized
     * 
     */
    @InputImport(name="rotateKeysForSedDrivesSerialized")
    private final @Nullable SecretResponse rotateKeysForSedDrivesSerialized;

    public Optional<SecretResponse> getRotateKeysForSedDrivesSerialized() {
        return this.rotateKeysForSedDrivesSerialized == null ? Optional.empty() : Optional.ofNullable(this.rotateKeysForSedDrivesSerialized);
    }

    /**
     * Keyvault Id of SEDEncryptionExternalKey
     * 
     */
    @InputImport(name="sedEncryptionExternalKey")
    private final @Nullable SecretResponse sedEncryptionExternalKey;

    public Optional<SecretResponse> getSedEncryptionExternalKey() {
        return this.sedEncryptionExternalKey == null ? Optional.empty() : Optional.ofNullable(this.sedEncryptionExternalKey);
    }

    /**
     * Keyvault Id of SEDEncryptionExternalKeyId
     * 
     */
    @InputImport(name="sedEncryptionExternalKeyId")
    private final @Nullable SecretResponse sedEncryptionExternalKeyId;

    public Optional<SecretResponse> getSedEncryptionExternalKeyId() {
        return this.sedEncryptionExternalKeyId == null ? Optional.empty() : Optional.ofNullable(this.sedEncryptionExternalKeyId);
    }

    /**
     * Keyvault Id of SystemVolumeBitLockerRecoveryKey
     * 
     */
    @InputImport(name="systemVolumeBitLockerRecoveryKey")
    private final @Nullable SecretResponse systemVolumeBitLockerRecoveryKey;

    public Optional<SecretResponse> getSystemVolumeBitLockerRecoveryKey() {
        return this.systemVolumeBitLockerRecoveryKey == null ? Optional.empty() : Optional.ofNullable(this.systemVolumeBitLockerRecoveryKey);
    }

    public DeviceSecretsResponse(
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

    private DeviceSecretsResponse() {
        this.bmcDefaultUserPassword = null;
        this.hcsDataVolumeBitLockerExternalKey = null;
        this.hcsInternalVolumeBitLockerExternalKey = null;
        this.rotateKeyForDataVolumeBitlocker = null;
        this.rotateKeysForSedDrivesSerialized = null;
        this.sedEncryptionExternalKey = null;
        this.sedEncryptionExternalKeyId = null;
        this.systemVolumeBitLockerRecoveryKey = null;
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
