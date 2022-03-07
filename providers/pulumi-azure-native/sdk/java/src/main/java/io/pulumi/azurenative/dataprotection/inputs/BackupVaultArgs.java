// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.StorageSettingArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


/**
 * Backup Vault
 * 
 */
public final class BackupVaultArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupVaultArgs Empty = new BackupVaultArgs();

    /**
     * Storage Settings
     * 
     */
    @InputImport(name="storageSettings", required=true)
      private final Input<List<StorageSettingArgs>> storageSettings;

    public Input<List<StorageSettingArgs>> getStorageSettings() {
        return this.storageSettings;
    }

    public BackupVaultArgs(Input<List<StorageSettingArgs>> storageSettings) {
        this.storageSettings = Objects.requireNonNull(storageSettings, "expected parameter 'storageSettings' to be non-null");
    }

    private BackupVaultArgs() {
        this.storageSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupVaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<StorageSettingArgs>> storageSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupVaultArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageSettings = defaults.storageSettings;
        }

        public Builder setStorageSettings(Input<List<StorageSettingArgs>> storageSettings) {
            this.storageSettings = Objects.requireNonNull(storageSettings);
            return this;
        }

        public Builder setStorageSettings(List<StorageSettingArgs> storageSettings) {
            this.storageSettings = Input.of(Objects.requireNonNull(storageSettings));
            return this;
        }
        public BackupVaultArgs build() {
            return new BackupVaultArgs(storageSettings);
        }
    }
}