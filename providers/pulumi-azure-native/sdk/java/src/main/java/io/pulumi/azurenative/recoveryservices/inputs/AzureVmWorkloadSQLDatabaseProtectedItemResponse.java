// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.AzureVmWorkloadProtectedItemExtendedInfoResponse;
import io.pulumi.azurenative.recoveryservices.inputs.ErrorDetailResponse;
import io.pulumi.azurenative.recoveryservices.inputs.KPIResourceHealthDetailsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure VM workload-specific protected item representing SQL Database.
 * 
 */
public final class AzureVmWorkloadSQLDatabaseProtectedItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureVmWorkloadSQLDatabaseProtectedItemResponse Empty = new AzureVmWorkloadSQLDatabaseProtectedItemResponse();

    /**
     * Type of backup management for the backed up item.
     * 
     */
    @InputImport(name="backupManagementType")
      private final @Nullable String backupManagementType;

    public Optional<String> getBackupManagementType() {
        return this.backupManagementType == null ? Optional.empty() : Optional.ofNullable(this.backupManagementType);
    }

    /**
     * Name of the backup set the backup item belongs to
     * 
     */
    @InputImport(name="backupSetName")
      private final @Nullable String backupSetName;

    public Optional<String> getBackupSetName() {
        return this.backupSetName == null ? Optional.empty() : Optional.ofNullable(this.backupSetName);
    }

    /**
     * Unique name of container
     * 
     */
    @InputImport(name="containerName")
      private final @Nullable String containerName;

    public Optional<String> getContainerName() {
        return this.containerName == null ? Optional.empty() : Optional.ofNullable(this.containerName);
    }

    /**
     * Create mode to indicate recovery of existing soft deleted data source or creation of new data source.
     * 
     */
    @InputImport(name="createMode")
      private final @Nullable String createMode;

    public Optional<String> getCreateMode() {
        return this.createMode == null ? Optional.empty() : Optional.ofNullable(this.createMode);
    }

    /**
     * Time for deferred deletion in UTC
     * 
     */
    @InputImport(name="deferredDeleteTimeInUTC")
      private final @Nullable String deferredDeleteTimeInUTC;

    public Optional<String> getDeferredDeleteTimeInUTC() {
        return this.deferredDeleteTimeInUTC == null ? Optional.empty() : Optional.ofNullable(this.deferredDeleteTimeInUTC);
    }

    /**
     * Time remaining before the DS marked for deferred delete is permanently deleted
     * 
     */
    @InputImport(name="deferredDeleteTimeRemaining")
      private final @Nullable String deferredDeleteTimeRemaining;

    public Optional<String> getDeferredDeleteTimeRemaining() {
        return this.deferredDeleteTimeRemaining == null ? Optional.empty() : Optional.ofNullable(this.deferredDeleteTimeRemaining);
    }

    /**
     * Additional information for this backup item.
     * 
     */
    @InputImport(name="extendedInfo")
      private final @Nullable AzureVmWorkloadProtectedItemExtendedInfoResponse extendedInfo;

    public Optional<AzureVmWorkloadProtectedItemExtendedInfoResponse> getExtendedInfo() {
        return this.extendedInfo == null ? Optional.empty() : Optional.ofNullable(this.extendedInfo);
    }

    /**
     * Friendly name of the DB represented by this backup item.
     * 
     */
    @InputImport(name="friendlyName")
      private final @Nullable String friendlyName;

    public Optional<String> getFriendlyName() {
        return this.friendlyName == null ? Optional.empty() : Optional.ofNullable(this.friendlyName);
    }

    /**
     * Flag to identify whether the deferred deleted DS is to be purged soon
     * 
     */
    @InputImport(name="isDeferredDeleteScheduleUpcoming")
      private final @Nullable Boolean isDeferredDeleteScheduleUpcoming;

    public Optional<Boolean> getIsDeferredDeleteScheduleUpcoming() {
        return this.isDeferredDeleteScheduleUpcoming == null ? Optional.empty() : Optional.ofNullable(this.isDeferredDeleteScheduleUpcoming);
    }

    /**
     * Flag to identify that deferred deleted DS is to be moved into Pause state
     * 
     */
    @InputImport(name="isRehydrate")
      private final @Nullable Boolean isRehydrate;

    public Optional<Boolean> getIsRehydrate() {
        return this.isRehydrate == null ? Optional.empty() : Optional.ofNullable(this.isRehydrate);
    }

    /**
     * Flag to identify whether the DS is scheduled for deferred delete
     * 
     */
    @InputImport(name="isScheduledForDeferredDelete")
      private final @Nullable Boolean isScheduledForDeferredDelete;

    public Optional<Boolean> getIsScheduledForDeferredDelete() {
        return this.isScheduledForDeferredDelete == null ? Optional.empty() : Optional.ofNullable(this.isScheduledForDeferredDelete);
    }

    /**
     * Health details of different KPIs
     * 
     */
    @InputImport(name="kpisHealths")
      private final @Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths;

    public Map<String,KPIResourceHealthDetailsResponse> getKpisHealths() {
        return this.kpisHealths == null ? Map.of() : this.kpisHealths;
    }

    /**
     * Error details in last backup
     * 
     */
    @InputImport(name="lastBackupErrorDetail")
      private final @Nullable ErrorDetailResponse lastBackupErrorDetail;

    public Optional<ErrorDetailResponse> getLastBackupErrorDetail() {
        return this.lastBackupErrorDetail == null ? Optional.empty() : Optional.ofNullable(this.lastBackupErrorDetail);
    }

    /**
     * Last backup operation status. Possible values: Healthy, Unhealthy.
     * 
     */
    @InputImport(name="lastBackupStatus")
      private final @Nullable String lastBackupStatus;

    public Optional<String> getLastBackupStatus() {
        return this.lastBackupStatus == null ? Optional.empty() : Optional.ofNullable(this.lastBackupStatus);
    }

    /**
     * Timestamp of the last backup operation on this backup item.
     * 
     */
    @InputImport(name="lastBackupTime")
      private final @Nullable String lastBackupTime;

    public Optional<String> getLastBackupTime() {
        return this.lastBackupTime == null ? Optional.empty() : Optional.ofNullable(this.lastBackupTime);
    }

    /**
     * Timestamp when the last (latest) backup copy was created for this backup item.
     * 
     */
    @InputImport(name="lastRecoveryPoint")
      private final @Nullable String lastRecoveryPoint;

    public Optional<String> getLastRecoveryPoint() {
        return this.lastRecoveryPoint == null ? Optional.empty() : Optional.ofNullable(this.lastRecoveryPoint);
    }

    /**
     * Parent name of the DB such as Instance or Availability Group.
     * 
     */
    @InputImport(name="parentName")
      private final @Nullable String parentName;

    public Optional<String> getParentName() {
        return this.parentName == null ? Optional.empty() : Optional.ofNullable(this.parentName);
    }

    /**
     * Parent type of protected item, example: for a DB, standalone server or distributed
     * 
     */
    @InputImport(name="parentType")
      private final @Nullable String parentType;

    public Optional<String> getParentType() {
        return this.parentType == null ? Optional.empty() : Optional.ofNullable(this.parentType);
    }

    /**
     * ID of the backup policy with which this item is backed up.
     * 
     */
    @InputImport(name="policyId")
      private final @Nullable String policyId;

    public Optional<String> getPolicyId() {
        return this.policyId == null ? Optional.empty() : Optional.ofNullable(this.policyId);
    }

    /**
     * Data ID of the protected item.
     * 
     */
    @InputImport(name="protectedItemDataSourceId")
      private final @Nullable String protectedItemDataSourceId;

    public Optional<String> getProtectedItemDataSourceId() {
        return this.protectedItemDataSourceId == null ? Optional.empty() : Optional.ofNullable(this.protectedItemDataSourceId);
    }

    /**
     * Health status of the backup item, evaluated based on last heartbeat received
     * 
     */
    @InputImport(name="protectedItemHealthStatus")
      private final @Nullable String protectedItemHealthStatus;

    public Optional<String> getProtectedItemHealthStatus() {
        return this.protectedItemHealthStatus == null ? Optional.empty() : Optional.ofNullable(this.protectedItemHealthStatus);
    }

    /**
     * backup item type.
     * Expected value is 'AzureVmWorkloadSQLDatabase'.
     * 
     */
    @InputImport(name="protectedItemType", required=true)
      private final String protectedItemType;

    public String getProtectedItemType() {
        return this.protectedItemType;
    }

    /**
     * Backup state of this backup item.
     * 
     */
    @InputImport(name="protectionState")
      private final @Nullable String protectionState;

    public Optional<String> getProtectionState() {
        return this.protectionState == null ? Optional.empty() : Optional.ofNullable(this.protectionState);
    }

    /**
     * Backup status of this backup item.
     * 
     */
    @InputImport(name="protectionStatus")
      private final @Nullable String protectionStatus;

    public Optional<String> getProtectionStatus() {
        return this.protectionStatus == null ? Optional.empty() : Optional.ofNullable(this.protectionStatus);
    }

    /**
     * Host/Cluster Name for instance or AG
     * 
     */
    @InputImport(name="serverName")
      private final @Nullable String serverName;

    public Optional<String> getServerName() {
        return this.serverName == null ? Optional.empty() : Optional.ofNullable(this.serverName);
    }

    /**
     * ARM ID of the resource to be backed up.
     * 
     */
    @InputImport(name="sourceResourceId")
      private final @Nullable String sourceResourceId;

    public Optional<String> getSourceResourceId() {
        return this.sourceResourceId == null ? Optional.empty() : Optional.ofNullable(this.sourceResourceId);
    }

    /**
     * Type of workload this item represents.
     * 
     */
    @InputImport(name="workloadType")
      private final @Nullable String workloadType;

    public Optional<String> getWorkloadType() {
        return this.workloadType == null ? Optional.empty() : Optional.ofNullable(this.workloadType);
    }

    public AzureVmWorkloadSQLDatabaseProtectedItemResponse(
        @Nullable String backupManagementType,
        @Nullable String backupSetName,
        @Nullable String containerName,
        @Nullable String createMode,
        @Nullable String deferredDeleteTimeInUTC,
        @Nullable String deferredDeleteTimeRemaining,
        @Nullable AzureVmWorkloadProtectedItemExtendedInfoResponse extendedInfo,
        @Nullable String friendlyName,
        @Nullable Boolean isDeferredDeleteScheduleUpcoming,
        @Nullable Boolean isRehydrate,
        @Nullable Boolean isScheduledForDeferredDelete,
        @Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths,
        @Nullable ErrorDetailResponse lastBackupErrorDetail,
        @Nullable String lastBackupStatus,
        @Nullable String lastBackupTime,
        @Nullable String lastRecoveryPoint,
        @Nullable String parentName,
        @Nullable String parentType,
        @Nullable String policyId,
        @Nullable String protectedItemDataSourceId,
        @Nullable String protectedItemHealthStatus,
        String protectedItemType,
        @Nullable String protectionState,
        @Nullable String protectionStatus,
        @Nullable String serverName,
        @Nullable String sourceResourceId,
        @Nullable String workloadType) {
        this.backupManagementType = backupManagementType;
        this.backupSetName = backupSetName;
        this.containerName = containerName;
        this.createMode = createMode;
        this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
        this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
        this.extendedInfo = extendedInfo;
        this.friendlyName = friendlyName;
        this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
        this.isRehydrate = isRehydrate;
        this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
        this.kpisHealths = kpisHealths;
        this.lastBackupErrorDetail = lastBackupErrorDetail;
        this.lastBackupStatus = lastBackupStatus;
        this.lastBackupTime = lastBackupTime;
        this.lastRecoveryPoint = lastRecoveryPoint;
        this.parentName = parentName;
        this.parentType = parentType;
        this.policyId = policyId;
        this.protectedItemDataSourceId = protectedItemDataSourceId;
        this.protectedItemHealthStatus = protectedItemHealthStatus;
        this.protectedItemType = Objects.requireNonNull(protectedItemType, "expected parameter 'protectedItemType' to be non-null");
        this.protectionState = protectionState;
        this.protectionStatus = protectionStatus;
        this.serverName = serverName;
        this.sourceResourceId = sourceResourceId;
        this.workloadType = workloadType;
    }

    private AzureVmWorkloadSQLDatabaseProtectedItemResponse() {
        this.backupManagementType = null;
        this.backupSetName = null;
        this.containerName = null;
        this.createMode = null;
        this.deferredDeleteTimeInUTC = null;
        this.deferredDeleteTimeRemaining = null;
        this.extendedInfo = null;
        this.friendlyName = null;
        this.isDeferredDeleteScheduleUpcoming = null;
        this.isRehydrate = null;
        this.isScheduledForDeferredDelete = null;
        this.kpisHealths = Map.of();
        this.lastBackupErrorDetail = null;
        this.lastBackupStatus = null;
        this.lastBackupTime = null;
        this.lastRecoveryPoint = null;
        this.parentName = null;
        this.parentType = null;
        this.policyId = null;
        this.protectedItemDataSourceId = null;
        this.protectedItemHealthStatus = null;
        this.protectedItemType = null;
        this.protectionState = null;
        this.protectionStatus = null;
        this.serverName = null;
        this.sourceResourceId = null;
        this.workloadType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureVmWorkloadSQLDatabaseProtectedItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private @Nullable String backupSetName;
        private @Nullable String containerName;
        private @Nullable String createMode;
        private @Nullable String deferredDeleteTimeInUTC;
        private @Nullable String deferredDeleteTimeRemaining;
        private @Nullable AzureVmWorkloadProtectedItemExtendedInfoResponse extendedInfo;
        private @Nullable String friendlyName;
        private @Nullable Boolean isDeferredDeleteScheduleUpcoming;
        private @Nullable Boolean isRehydrate;
        private @Nullable Boolean isScheduledForDeferredDelete;
        private @Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths;
        private @Nullable ErrorDetailResponse lastBackupErrorDetail;
        private @Nullable String lastBackupStatus;
        private @Nullable String lastBackupTime;
        private @Nullable String lastRecoveryPoint;
        private @Nullable String parentName;
        private @Nullable String parentType;
        private @Nullable String policyId;
        private @Nullable String protectedItemDataSourceId;
        private @Nullable String protectedItemHealthStatus;
        private String protectedItemType;
        private @Nullable String protectionState;
        private @Nullable String protectionStatus;
        private @Nullable String serverName;
        private @Nullable String sourceResourceId;
        private @Nullable String workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureVmWorkloadSQLDatabaseProtectedItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.backupSetName = defaults.backupSetName;
    	      this.containerName = defaults.containerName;
    	      this.createMode = defaults.createMode;
    	      this.deferredDeleteTimeInUTC = defaults.deferredDeleteTimeInUTC;
    	      this.deferredDeleteTimeRemaining = defaults.deferredDeleteTimeRemaining;
    	      this.extendedInfo = defaults.extendedInfo;
    	      this.friendlyName = defaults.friendlyName;
    	      this.isDeferredDeleteScheduleUpcoming = defaults.isDeferredDeleteScheduleUpcoming;
    	      this.isRehydrate = defaults.isRehydrate;
    	      this.isScheduledForDeferredDelete = defaults.isScheduledForDeferredDelete;
    	      this.kpisHealths = defaults.kpisHealths;
    	      this.lastBackupErrorDetail = defaults.lastBackupErrorDetail;
    	      this.lastBackupStatus = defaults.lastBackupStatus;
    	      this.lastBackupTime = defaults.lastBackupTime;
    	      this.lastRecoveryPoint = defaults.lastRecoveryPoint;
    	      this.parentName = defaults.parentName;
    	      this.parentType = defaults.parentType;
    	      this.policyId = defaults.policyId;
    	      this.protectedItemDataSourceId = defaults.protectedItemDataSourceId;
    	      this.protectedItemHealthStatus = defaults.protectedItemHealthStatus;
    	      this.protectedItemType = defaults.protectedItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.protectionStatus = defaults.protectionStatus;
    	      this.serverName = defaults.serverName;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.workloadType = defaults.workloadType;
        }

        public Builder setBackupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder setBackupSetName(@Nullable String backupSetName) {
            this.backupSetName = backupSetName;
            return this;
        }

        public Builder setContainerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder setCreateMode(@Nullable String createMode) {
            this.createMode = createMode;
            return this;
        }

        public Builder setDeferredDeleteTimeInUTC(@Nullable String deferredDeleteTimeInUTC) {
            this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
            return this;
        }

        public Builder setDeferredDeleteTimeRemaining(@Nullable String deferredDeleteTimeRemaining) {
            this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
            return this;
        }

        public Builder setExtendedInfo(@Nullable AzureVmWorkloadProtectedItemExtendedInfoResponse extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setIsDeferredDeleteScheduleUpcoming(@Nullable Boolean isDeferredDeleteScheduleUpcoming) {
            this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
            return this;
        }

        public Builder setIsRehydrate(@Nullable Boolean isRehydrate) {
            this.isRehydrate = isRehydrate;
            return this;
        }

        public Builder setIsScheduledForDeferredDelete(@Nullable Boolean isScheduledForDeferredDelete) {
            this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
            return this;
        }

        public Builder setKpisHealths(@Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths) {
            this.kpisHealths = kpisHealths;
            return this;
        }

        public Builder setLastBackupErrorDetail(@Nullable ErrorDetailResponse lastBackupErrorDetail) {
            this.lastBackupErrorDetail = lastBackupErrorDetail;
            return this;
        }

        public Builder setLastBackupStatus(@Nullable String lastBackupStatus) {
            this.lastBackupStatus = lastBackupStatus;
            return this;
        }

        public Builder setLastBackupTime(@Nullable String lastBackupTime) {
            this.lastBackupTime = lastBackupTime;
            return this;
        }

        public Builder setLastRecoveryPoint(@Nullable String lastRecoveryPoint) {
            this.lastRecoveryPoint = lastRecoveryPoint;
            return this;
        }

        public Builder setParentName(@Nullable String parentName) {
            this.parentName = parentName;
            return this;
        }

        public Builder setParentType(@Nullable String parentType) {
            this.parentType = parentType;
            return this;
        }

        public Builder setPolicyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder setProtectedItemDataSourceId(@Nullable String protectedItemDataSourceId) {
            this.protectedItemDataSourceId = protectedItemDataSourceId;
            return this;
        }

        public Builder setProtectedItemHealthStatus(@Nullable String protectedItemHealthStatus) {
            this.protectedItemHealthStatus = protectedItemHealthStatus;
            return this;
        }

        public Builder setProtectedItemType(String protectedItemType) {
            this.protectedItemType = Objects.requireNonNull(protectedItemType);
            return this;
        }

        public Builder setProtectionState(@Nullable String protectionState) {
            this.protectionState = protectionState;
            return this;
        }

        public Builder setProtectionStatus(@Nullable String protectionStatus) {
            this.protectionStatus = protectionStatus;
            return this;
        }

        public Builder setServerName(@Nullable String serverName) {
            this.serverName = serverName;
            return this;
        }

        public Builder setSourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }

        public Builder setWorkloadType(@Nullable String workloadType) {
            this.workloadType = workloadType;
            return this;
        }
        public AzureVmWorkloadSQLDatabaseProtectedItemResponse build() {
            return new AzureVmWorkloadSQLDatabaseProtectedItemResponse(backupManagementType, backupSetName, containerName, createMode, deferredDeleteTimeInUTC, deferredDeleteTimeRemaining, extendedInfo, friendlyName, isDeferredDeleteScheduleUpcoming, isRehydrate, isScheduledForDeferredDelete, kpisHealths, lastBackupErrorDetail, lastBackupStatus, lastBackupTime, lastRecoveryPoint, parentName, parentType, policyId, protectedItemDataSourceId, protectedItemHealthStatus, protectedItemType, protectionState, protectionStatus, serverName, sourceResourceId, workloadType);
        }
    }
}