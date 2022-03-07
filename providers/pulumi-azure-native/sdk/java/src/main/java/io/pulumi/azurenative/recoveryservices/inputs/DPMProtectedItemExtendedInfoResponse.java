// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Additional information of DPM Protected item.
 * 
 */
public final class DPMProtectedItemExtendedInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final DPMProtectedItemExtendedInfoResponse Empty = new DPMProtectedItemExtendedInfoResponse();

    /**
     * Used Disk storage in bytes.
     * 
     */
    @InputImport(name="diskStorageUsedInBytes")
      private final @Nullable String diskStorageUsedInBytes;

    public Optional<String> getDiskStorageUsedInBytes() {
        return this.diskStorageUsedInBytes == null ? Optional.empty() : Optional.ofNullable(this.diskStorageUsedInBytes);
    }

    /**
     * To check if backup item is collocated.
     * 
     */
    @InputImport(name="isCollocated")
      private final @Nullable Boolean isCollocated;

    public Optional<Boolean> getIsCollocated() {
        return this.isCollocated == null ? Optional.empty() : Optional.ofNullable(this.isCollocated);
    }

    /**
     * To check if backup item is cloud protected.
     * 
     */
    @InputImport(name="isPresentOnCloud")
      private final @Nullable Boolean isPresentOnCloud;

    public Optional<Boolean> getIsPresentOnCloud() {
        return this.isPresentOnCloud == null ? Optional.empty() : Optional.ofNullable(this.isPresentOnCloud);
    }

    /**
     * Last backup status information on backup item.
     * 
     */
    @InputImport(name="lastBackupStatus")
      private final @Nullable String lastBackupStatus;

    public Optional<String> getLastBackupStatus() {
        return this.lastBackupStatus == null ? Optional.empty() : Optional.ofNullable(this.lastBackupStatus);
    }

    /**
     * Last refresh time on backup item.
     * 
     */
    @InputImport(name="lastRefreshedAt")
      private final @Nullable String lastRefreshedAt;

    public Optional<String> getLastRefreshedAt() {
        return this.lastRefreshedAt == null ? Optional.empty() : Optional.ofNullable(this.lastRefreshedAt);
    }

    /**
     * Oldest cloud recovery point time.
     * 
     */
    @InputImport(name="oldestRecoveryPoint")
      private final @Nullable String oldestRecoveryPoint;

    public Optional<String> getOldestRecoveryPoint() {
        return this.oldestRecoveryPoint == null ? Optional.empty() : Optional.ofNullable(this.oldestRecoveryPoint);
    }

    /**
     * latest disk recovery point time.
     * 
     */
    @InputImport(name="onPremiseLatestRecoveryPoint")
      private final @Nullable String onPremiseLatestRecoveryPoint;

    public Optional<String> getOnPremiseLatestRecoveryPoint() {
        return this.onPremiseLatestRecoveryPoint == null ? Optional.empty() : Optional.ofNullable(this.onPremiseLatestRecoveryPoint);
    }

    /**
     * Oldest disk recovery point time.
     * 
     */
    @InputImport(name="onPremiseOldestRecoveryPoint")
      private final @Nullable String onPremiseOldestRecoveryPoint;

    public Optional<String> getOnPremiseOldestRecoveryPoint() {
        return this.onPremiseOldestRecoveryPoint == null ? Optional.empty() : Optional.ofNullable(this.onPremiseOldestRecoveryPoint);
    }

    /**
     * disk recovery point count.
     * 
     */
    @InputImport(name="onPremiseRecoveryPointCount")
      private final @Nullable Integer onPremiseRecoveryPointCount;

    public Optional<Integer> getOnPremiseRecoveryPointCount() {
        return this.onPremiseRecoveryPointCount == null ? Optional.empty() : Optional.ofNullable(this.onPremiseRecoveryPointCount);
    }

    /**
     * Attribute to provide information on various DBs.
     * 
     */
    @InputImport(name="protectableObjectLoadPath")
      private final @Nullable Map<String,String> protectableObjectLoadPath;

    public Map<String,String> getProtectableObjectLoadPath() {
        return this.protectableObjectLoadPath == null ? Map.of() : this.protectableObjectLoadPath;
    }

    /**
     * To check if backup item is disk protected.
     * 
     */
    @InputImport(name="protected")
      private final @Nullable Boolean $protected;

    public Optional<Boolean> get$protected() {
        return this.$protected == null ? Optional.empty() : Optional.ofNullable(this.$protected);
    }

    /**
     * Protection group name of the backup item.
     * 
     */
    @InputImport(name="protectionGroupName")
      private final @Nullable String protectionGroupName;

    public Optional<String> getProtectionGroupName() {
        return this.protectionGroupName == null ? Optional.empty() : Optional.ofNullable(this.protectionGroupName);
    }

    /**
     * cloud recovery point count.
     * 
     */
    @InputImport(name="recoveryPointCount")
      private final @Nullable Integer recoveryPointCount;

    public Optional<Integer> getRecoveryPointCount() {
        return this.recoveryPointCount == null ? Optional.empty() : Optional.ofNullable(this.recoveryPointCount);
    }

    /**
     * total Disk storage in bytes.
     * 
     */
    @InputImport(name="totalDiskStorageSizeInBytes")
      private final @Nullable String totalDiskStorageSizeInBytes;

    public Optional<String> getTotalDiskStorageSizeInBytes() {
        return this.totalDiskStorageSizeInBytes == null ? Optional.empty() : Optional.ofNullable(this.totalDiskStorageSizeInBytes);
    }

    public DPMProtectedItemExtendedInfoResponse(
        @Nullable String diskStorageUsedInBytes,
        @Nullable Boolean isCollocated,
        @Nullable Boolean isPresentOnCloud,
        @Nullable String lastBackupStatus,
        @Nullable String lastRefreshedAt,
        @Nullable String oldestRecoveryPoint,
        @Nullable String onPremiseLatestRecoveryPoint,
        @Nullable String onPremiseOldestRecoveryPoint,
        @Nullable Integer onPremiseRecoveryPointCount,
        @Nullable Map<String,String> protectableObjectLoadPath,
        @Nullable Boolean $protected,
        @Nullable String protectionGroupName,
        @Nullable Integer recoveryPointCount,
        @Nullable String totalDiskStorageSizeInBytes) {
        this.diskStorageUsedInBytes = diskStorageUsedInBytes;
        this.isCollocated = isCollocated;
        this.isPresentOnCloud = isPresentOnCloud;
        this.lastBackupStatus = lastBackupStatus;
        this.lastRefreshedAt = lastRefreshedAt;
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        this.onPremiseLatestRecoveryPoint = onPremiseLatestRecoveryPoint;
        this.onPremiseOldestRecoveryPoint = onPremiseOldestRecoveryPoint;
        this.onPremiseRecoveryPointCount = onPremiseRecoveryPointCount;
        this.protectableObjectLoadPath = protectableObjectLoadPath;
        this.$protected = $protected;
        this.protectionGroupName = protectionGroupName;
        this.recoveryPointCount = recoveryPointCount;
        this.totalDiskStorageSizeInBytes = totalDiskStorageSizeInBytes;
    }

    private DPMProtectedItemExtendedInfoResponse() {
        this.diskStorageUsedInBytes = null;
        this.isCollocated = null;
        this.isPresentOnCloud = null;
        this.lastBackupStatus = null;
        this.lastRefreshedAt = null;
        this.oldestRecoveryPoint = null;
        this.onPremiseLatestRecoveryPoint = null;
        this.onPremiseOldestRecoveryPoint = null;
        this.onPremiseRecoveryPointCount = null;
        this.protectableObjectLoadPath = Map.of();
        this.$protected = null;
        this.protectionGroupName = null;
        this.recoveryPointCount = null;
        this.totalDiskStorageSizeInBytes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DPMProtectedItemExtendedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String diskStorageUsedInBytes;
        private @Nullable Boolean isCollocated;
        private @Nullable Boolean isPresentOnCloud;
        private @Nullable String lastBackupStatus;
        private @Nullable String lastRefreshedAt;
        private @Nullable String oldestRecoveryPoint;
        private @Nullable String onPremiseLatestRecoveryPoint;
        private @Nullable String onPremiseOldestRecoveryPoint;
        private @Nullable Integer onPremiseRecoveryPointCount;
        private @Nullable Map<String,String> protectableObjectLoadPath;
        private @Nullable Boolean $protected;
        private @Nullable String protectionGroupName;
        private @Nullable Integer recoveryPointCount;
        private @Nullable String totalDiskStorageSizeInBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(DPMProtectedItemExtendedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskStorageUsedInBytes = defaults.diskStorageUsedInBytes;
    	      this.isCollocated = defaults.isCollocated;
    	      this.isPresentOnCloud = defaults.isPresentOnCloud;
    	      this.lastBackupStatus = defaults.lastBackupStatus;
    	      this.lastRefreshedAt = defaults.lastRefreshedAt;
    	      this.oldestRecoveryPoint = defaults.oldestRecoveryPoint;
    	      this.onPremiseLatestRecoveryPoint = defaults.onPremiseLatestRecoveryPoint;
    	      this.onPremiseOldestRecoveryPoint = defaults.onPremiseOldestRecoveryPoint;
    	      this.onPremiseRecoveryPointCount = defaults.onPremiseRecoveryPointCount;
    	      this.protectableObjectLoadPath = defaults.protectableObjectLoadPath;
    	      this.$protected = defaults.$protected;
    	      this.protectionGroupName = defaults.protectionGroupName;
    	      this.recoveryPointCount = defaults.recoveryPointCount;
    	      this.totalDiskStorageSizeInBytes = defaults.totalDiskStorageSizeInBytes;
        }

        public Builder setDiskStorageUsedInBytes(@Nullable String diskStorageUsedInBytes) {
            this.diskStorageUsedInBytes = diskStorageUsedInBytes;
            return this;
        }

        public Builder setIsCollocated(@Nullable Boolean isCollocated) {
            this.isCollocated = isCollocated;
            return this;
        }

        public Builder setIsPresentOnCloud(@Nullable Boolean isPresentOnCloud) {
            this.isPresentOnCloud = isPresentOnCloud;
            return this;
        }

        public Builder setLastBackupStatus(@Nullable String lastBackupStatus) {
            this.lastBackupStatus = lastBackupStatus;
            return this;
        }

        public Builder setLastRefreshedAt(@Nullable String lastRefreshedAt) {
            this.lastRefreshedAt = lastRefreshedAt;
            return this;
        }

        public Builder setOldestRecoveryPoint(@Nullable String oldestRecoveryPoint) {
            this.oldestRecoveryPoint = oldestRecoveryPoint;
            return this;
        }

        public Builder setOnPremiseLatestRecoveryPoint(@Nullable String onPremiseLatestRecoveryPoint) {
            this.onPremiseLatestRecoveryPoint = onPremiseLatestRecoveryPoint;
            return this;
        }

        public Builder setOnPremiseOldestRecoveryPoint(@Nullable String onPremiseOldestRecoveryPoint) {
            this.onPremiseOldestRecoveryPoint = onPremiseOldestRecoveryPoint;
            return this;
        }

        public Builder setOnPremiseRecoveryPointCount(@Nullable Integer onPremiseRecoveryPointCount) {
            this.onPremiseRecoveryPointCount = onPremiseRecoveryPointCount;
            return this;
        }

        public Builder setProtectableObjectLoadPath(@Nullable Map<String,String> protectableObjectLoadPath) {
            this.protectableObjectLoadPath = protectableObjectLoadPath;
            return this;
        }

        public Builder set$protected(@Nullable Boolean $protected) {
            this.$protected = $protected;
            return this;
        }

        public Builder setProtectionGroupName(@Nullable String protectionGroupName) {
            this.protectionGroupName = protectionGroupName;
            return this;
        }

        public Builder setRecoveryPointCount(@Nullable Integer recoveryPointCount) {
            this.recoveryPointCount = recoveryPointCount;
            return this;
        }

        public Builder setTotalDiskStorageSizeInBytes(@Nullable String totalDiskStorageSizeInBytes) {
            this.totalDiskStorageSizeInBytes = totalDiskStorageSizeInBytes;
            return this;
        }
        public DPMProtectedItemExtendedInfoResponse build() {
            return new DPMProtectedItemExtendedInfoResponse(diskStorageUsedInBytes, isCollocated, isPresentOnCloud, lastBackupStatus, lastRefreshedAt, oldestRecoveryPoint, onPremiseLatestRecoveryPoint, onPremiseOldestRecoveryPoint, onPremiseRecoveryPointCount, protectableObjectLoadPath, $protected, protectionGroupName, recoveryPointCount, totalDiskStorageSizeInBytes);
        }
    }
}