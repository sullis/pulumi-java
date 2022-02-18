// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.inputs.BackupScheduleArgs;
import io.pulumi.azurenative.web.inputs.DatabaseBackupSettingArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppBackupConfigurationSlotArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppBackupConfigurationSlotArgs Empty = new WebAppBackupConfigurationSlotArgs();

    /**
     * Name of the backup.
     * 
     */
    @InputImport(name="backupName")
    private final @Nullable Input<String> backupName;

    public Input<String> getBackupName() {
        return this.backupName == null ? Input.empty() : this.backupName;
    }

    /**
     * Schedule for the backup if it is executed periodically.
     * 
     */
    @InputImport(name="backupSchedule")
    private final @Nullable Input<BackupScheduleArgs> backupSchedule;

    public Input<BackupScheduleArgs> getBackupSchedule() {
        return this.backupSchedule == null ? Input.empty() : this.backupSchedule;
    }

    /**
     * Databases included in the backup.
     * 
     */
    @InputImport(name="databases")
    private final @Nullable Input<List<DatabaseBackupSettingArgs>> databases;

    public Input<List<DatabaseBackupSettingArgs>> getDatabases() {
        return this.databases == null ? Input.empty() : this.databases;
    }

    /**
     * True if the backup schedule is enabled (must be included in that case), false if the backup schedule should be disabled.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Kind of resource.
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Name of the app.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API will update the backup configuration for the production slot.
     * 
     */
    @InputImport(name="slot", required=true)
    private final Input<String> slot;

    public Input<String> getSlot() {
        return this.slot;
    }

    /**
     * SAS URL to the container.
     * 
     */
    @InputImport(name="storageAccountUrl", required=true)
    private final Input<String> storageAccountUrl;

    public Input<String> getStorageAccountUrl() {
        return this.storageAccountUrl;
    }

    public WebAppBackupConfigurationSlotArgs(
        @Nullable Input<String> backupName,
        @Nullable Input<BackupScheduleArgs> backupSchedule,
        @Nullable Input<List<DatabaseBackupSettingArgs>> databases,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> kind,
        Input<String> name,
        Input<String> resourceGroupName,
        Input<String> slot,
        Input<String> storageAccountUrl) {
        this.backupName = backupName;
        this.backupSchedule = backupSchedule;
        this.databases = databases;
        this.enabled = enabled;
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
        this.storageAccountUrl = Objects.requireNonNull(storageAccountUrl, "expected parameter 'storageAccountUrl' to be non-null");
    }

    private WebAppBackupConfigurationSlotArgs() {
        this.backupName = Input.empty();
        this.backupSchedule = Input.empty();
        this.databases = Input.empty();
        this.enabled = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.slot = Input.empty();
        this.storageAccountUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppBackupConfigurationSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> backupName;
        private @Nullable Input<BackupScheduleArgs> backupSchedule;
        private @Nullable Input<List<DatabaseBackupSettingArgs>> databases;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> kind;
        private Input<String> name;
        private Input<String> resourceGroupName;
        private Input<String> slot;
        private Input<String> storageAccountUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppBackupConfigurationSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupName = defaults.backupName;
    	      this.backupSchedule = defaults.backupSchedule;
    	      this.databases = defaults.databases;
    	      this.enabled = defaults.enabled;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.slot = defaults.slot;
    	      this.storageAccountUrl = defaults.storageAccountUrl;
        }

        public Builder setBackupName(@Nullable Input<String> backupName) {
            this.backupName = backupName;
            return this;
        }

        public Builder setBackupName(@Nullable String backupName) {
            this.backupName = Input.ofNullable(backupName);
            return this;
        }

        public Builder setBackupSchedule(@Nullable Input<BackupScheduleArgs> backupSchedule) {
            this.backupSchedule = backupSchedule;
            return this;
        }

        public Builder setBackupSchedule(@Nullable BackupScheduleArgs backupSchedule) {
            this.backupSchedule = Input.ofNullable(backupSchedule);
            return this;
        }

        public Builder setDatabases(@Nullable Input<List<DatabaseBackupSettingArgs>> databases) {
            this.databases = databases;
            return this;
        }

        public Builder setDatabases(@Nullable List<DatabaseBackupSettingArgs> databases) {
            this.databases = Input.ofNullable(databases);
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

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSlot(Input<String> slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }

        public Builder setSlot(String slot) {
            this.slot = Input.of(Objects.requireNonNull(slot));
            return this;
        }

        public Builder setStorageAccountUrl(Input<String> storageAccountUrl) {
            this.storageAccountUrl = Objects.requireNonNull(storageAccountUrl);
            return this;
        }

        public Builder setStorageAccountUrl(String storageAccountUrl) {
            this.storageAccountUrl = Input.of(Objects.requireNonNull(storageAccountUrl));
            return this;
        }

        public WebAppBackupConfigurationSlotArgs build() {
            return new WebAppBackupConfigurationSlotArgs(backupName, backupSchedule, databases, enabled, kind, name, resourceGroupName, slot, storageAccountUrl);
        }
    }
}
