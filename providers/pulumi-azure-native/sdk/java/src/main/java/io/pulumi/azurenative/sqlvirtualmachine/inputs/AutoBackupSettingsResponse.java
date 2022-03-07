// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configure backups for databases in your SQL virtual machine.
 * 
 */
public final class AutoBackupSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoBackupSettingsResponse Empty = new AutoBackupSettingsResponse();

    /**
     * Backup schedule type.
     * 
     */
    @InputImport(name="backupScheduleType")
      private final @Nullable String backupScheduleType;

    public Optional<String> getBackupScheduleType() {
        return this.backupScheduleType == null ? Optional.empty() : Optional.ofNullable(this.backupScheduleType);
    }

    /**
     * Include or exclude system databases from auto backup.
     * 
     */
    @InputImport(name="backupSystemDbs")
      private final @Nullable Boolean backupSystemDbs;

    public Optional<Boolean> getBackupSystemDbs() {
        return this.backupSystemDbs == null ? Optional.empty() : Optional.ofNullable(this.backupSystemDbs);
    }

    /**
     * Enable or disable autobackup on SQL virtual machine.
     * 
     */
    @InputImport(name="enable")
      private final @Nullable Boolean enable;

    public Optional<Boolean> getEnable() {
        return this.enable == null ? Optional.empty() : Optional.ofNullable(this.enable);
    }

    /**
     * Enable or disable encryption for backup on SQL virtual machine.
     * 
     */
    @InputImport(name="enableEncryption")
      private final @Nullable Boolean enableEncryption;

    public Optional<Boolean> getEnableEncryption() {
        return this.enableEncryption == null ? Optional.empty() : Optional.ofNullable(this.enableEncryption);
    }

    /**
     * Frequency of full backups. In both cases, full backups begin during the next scheduled time window.
     * 
     */
    @InputImport(name="fullBackupFrequency")
      private final @Nullable String fullBackupFrequency;

    public Optional<String> getFullBackupFrequency() {
        return this.fullBackupFrequency == null ? Optional.empty() : Optional.ofNullable(this.fullBackupFrequency);
    }

    /**
     * Start time of a given day during which full backups can take place. 0-23 hours.
     * 
     */
    @InputImport(name="fullBackupStartTime")
      private final @Nullable Integer fullBackupStartTime;

    public Optional<Integer> getFullBackupStartTime() {
        return this.fullBackupStartTime == null ? Optional.empty() : Optional.ofNullable(this.fullBackupStartTime);
    }

    /**
     * Duration of the time window of a given day during which full backups can take place. 1-23 hours.
     * 
     */
    @InputImport(name="fullBackupWindowHours")
      private final @Nullable Integer fullBackupWindowHours;

    public Optional<Integer> getFullBackupWindowHours() {
        return this.fullBackupWindowHours == null ? Optional.empty() : Optional.ofNullable(this.fullBackupWindowHours);
    }

    /**
     * Frequency of log backups. 5-60 minutes.
     * 
     */
    @InputImport(name="logBackupFrequency")
      private final @Nullable Integer logBackupFrequency;

    public Optional<Integer> getLogBackupFrequency() {
        return this.logBackupFrequency == null ? Optional.empty() : Optional.ofNullable(this.logBackupFrequency);
    }

    /**
     * Retention period of backup: 1-30 days.
     * 
     */
    @InputImport(name="retentionPeriod")
      private final @Nullable Integer retentionPeriod;

    public Optional<Integer> getRetentionPeriod() {
        return this.retentionPeriod == null ? Optional.empty() : Optional.ofNullable(this.retentionPeriod);
    }

    /**
     * Storage account url where backup will be taken to.
     * 
     */
    @InputImport(name="storageAccountUrl")
      private final @Nullable String storageAccountUrl;

    public Optional<String> getStorageAccountUrl() {
        return this.storageAccountUrl == null ? Optional.empty() : Optional.ofNullable(this.storageAccountUrl);
    }

    public AutoBackupSettingsResponse(
        @Nullable String backupScheduleType,
        @Nullable Boolean backupSystemDbs,
        @Nullable Boolean enable,
        @Nullable Boolean enableEncryption,
        @Nullable String fullBackupFrequency,
        @Nullable Integer fullBackupStartTime,
        @Nullable Integer fullBackupWindowHours,
        @Nullable Integer logBackupFrequency,
        @Nullable Integer retentionPeriod,
        @Nullable String storageAccountUrl) {
        this.backupScheduleType = backupScheduleType;
        this.backupSystemDbs = backupSystemDbs;
        this.enable = enable;
        this.enableEncryption = enableEncryption;
        this.fullBackupFrequency = fullBackupFrequency;
        this.fullBackupStartTime = fullBackupStartTime;
        this.fullBackupWindowHours = fullBackupWindowHours;
        this.logBackupFrequency = logBackupFrequency;
        this.retentionPeriod = retentionPeriod;
        this.storageAccountUrl = storageAccountUrl;
    }

    private AutoBackupSettingsResponse() {
        this.backupScheduleType = null;
        this.backupSystemDbs = null;
        this.enable = null;
        this.enableEncryption = null;
        this.fullBackupFrequency = null;
        this.fullBackupStartTime = null;
        this.fullBackupWindowHours = null;
        this.logBackupFrequency = null;
        this.retentionPeriod = null;
        this.storageAccountUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoBackupSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupScheduleType;
        private @Nullable Boolean backupSystemDbs;
        private @Nullable Boolean enable;
        private @Nullable Boolean enableEncryption;
        private @Nullable String fullBackupFrequency;
        private @Nullable Integer fullBackupStartTime;
        private @Nullable Integer fullBackupWindowHours;
        private @Nullable Integer logBackupFrequency;
        private @Nullable Integer retentionPeriod;
        private @Nullable String storageAccountUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoBackupSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupScheduleType = defaults.backupScheduleType;
    	      this.backupSystemDbs = defaults.backupSystemDbs;
    	      this.enable = defaults.enable;
    	      this.enableEncryption = defaults.enableEncryption;
    	      this.fullBackupFrequency = defaults.fullBackupFrequency;
    	      this.fullBackupStartTime = defaults.fullBackupStartTime;
    	      this.fullBackupWindowHours = defaults.fullBackupWindowHours;
    	      this.logBackupFrequency = defaults.logBackupFrequency;
    	      this.retentionPeriod = defaults.retentionPeriod;
    	      this.storageAccountUrl = defaults.storageAccountUrl;
        }

        public Builder setBackupScheduleType(@Nullable String backupScheduleType) {
            this.backupScheduleType = backupScheduleType;
            return this;
        }

        public Builder setBackupSystemDbs(@Nullable Boolean backupSystemDbs) {
            this.backupSystemDbs = backupSystemDbs;
            return this;
        }

        public Builder setEnable(@Nullable Boolean enable) {
            this.enable = enable;
            return this;
        }

        public Builder setEnableEncryption(@Nullable Boolean enableEncryption) {
            this.enableEncryption = enableEncryption;
            return this;
        }

        public Builder setFullBackupFrequency(@Nullable String fullBackupFrequency) {
            this.fullBackupFrequency = fullBackupFrequency;
            return this;
        }

        public Builder setFullBackupStartTime(@Nullable Integer fullBackupStartTime) {
            this.fullBackupStartTime = fullBackupStartTime;
            return this;
        }

        public Builder setFullBackupWindowHours(@Nullable Integer fullBackupWindowHours) {
            this.fullBackupWindowHours = fullBackupWindowHours;
            return this;
        }

        public Builder setLogBackupFrequency(@Nullable Integer logBackupFrequency) {
            this.logBackupFrequency = logBackupFrequency;
            return this;
        }

        public Builder setRetentionPeriod(@Nullable Integer retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            return this;
        }

        public Builder setStorageAccountUrl(@Nullable String storageAccountUrl) {
            this.storageAccountUrl = storageAccountUrl;
            return this;
        }
        public AutoBackupSettingsResponse build() {
            return new AutoBackupSettingsResponse(backupScheduleType, backupSystemDbs, enable, enableEncryption, fullBackupFrequency, fullBackupStartTime, fullBackupWindowHours, logBackupFrequency, retentionPeriod, storageAccountUrl);
        }
    }
}