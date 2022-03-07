// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.KeyVaultKeyReferenceArgs;
import io.pulumi.azurenative.compute.inputs.KeyVaultSecretReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a Encryption Settings for a Disk
 * 
 */
public final class DiskEncryptionSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskEncryptionSettingsArgs Empty = new DiskEncryptionSettingsArgs();

    /**
     * Specifies the location of the disk encryption key, which is a Key Vault Secret.
     * 
     */
    @InputImport(name="diskEncryptionKey")
      private final @Nullable Input<KeyVaultSecretReferenceArgs> diskEncryptionKey;

    public Input<KeyVaultSecretReferenceArgs> getDiskEncryptionKey() {
        return this.diskEncryptionKey == null ? Input.empty() : this.diskEncryptionKey;
    }

    /**
     * Specifies whether disk encryption should be enabled on the virtual machine.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Specifies the location of the key encryption key in Key Vault.
     * 
     */
    @InputImport(name="keyEncryptionKey")
      private final @Nullable Input<KeyVaultKeyReferenceArgs> keyEncryptionKey;

    public Input<KeyVaultKeyReferenceArgs> getKeyEncryptionKey() {
        return this.keyEncryptionKey == null ? Input.empty() : this.keyEncryptionKey;
    }

    public DiskEncryptionSettingsArgs(
        @Nullable Input<KeyVaultSecretReferenceArgs> diskEncryptionKey,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<KeyVaultKeyReferenceArgs> keyEncryptionKey) {
        this.diskEncryptionKey = diskEncryptionKey;
        this.enabled = enabled;
        this.keyEncryptionKey = keyEncryptionKey;
    }

    private DiskEncryptionSettingsArgs() {
        this.diskEncryptionKey = Input.empty();
        this.enabled = Input.empty();
        this.keyEncryptionKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskEncryptionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<KeyVaultSecretReferenceArgs> diskEncryptionKey;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<KeyVaultKeyReferenceArgs> keyEncryptionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskEncryptionSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.enabled = defaults.enabled;
    	      this.keyEncryptionKey = defaults.keyEncryptionKey;
        }

        public Builder setDiskEncryptionKey(@Nullable Input<KeyVaultSecretReferenceArgs> diskEncryptionKey) {
            this.diskEncryptionKey = diskEncryptionKey;
            return this;
        }

        public Builder setDiskEncryptionKey(@Nullable KeyVaultSecretReferenceArgs diskEncryptionKey) {
            this.diskEncryptionKey = Input.ofNullable(diskEncryptionKey);
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

        public Builder setKeyEncryptionKey(@Nullable Input<KeyVaultKeyReferenceArgs> keyEncryptionKey) {
            this.keyEncryptionKey = keyEncryptionKey;
            return this;
        }

        public Builder setKeyEncryptionKey(@Nullable KeyVaultKeyReferenceArgs keyEncryptionKey) {
            this.keyEncryptionKey = Input.ofNullable(keyEncryptionKey);
            return this;
        }
        public DiskEncryptionSettingsArgs build() {
            return new DiskEncryptionSettingsArgs(diskEncryptionKey, enabled, keyEncryptionKey);
        }
    }
}