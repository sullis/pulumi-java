// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import io.pulumi.azurenative.recoveryservices.enums.CreateMode;
import io.pulumi.azurenative.recoveryservices.enums.DataSourceType;
import io.pulumi.azurenative.recoveryservices.enums.HealthStatus;
import io.pulumi.azurenative.recoveryservices.enums.ProtectionState;
import io.pulumi.azurenative.recoveryservices.inputs.AzureIaaSVMProtectedItemExtendedInfoArgs;
import io.pulumi.azurenative.recoveryservices.inputs.ExtendedPropertiesArgs;
import io.pulumi.azurenative.recoveryservices.inputs.KPIResourceHealthDetailsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IaaS VM workload-specific backup item representing the Azure Resource Manager VM.
 * 
 */
public final class AzureIaaSComputeVMProtectedItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureIaaSComputeVMProtectedItemArgs Empty = new AzureIaaSComputeVMProtectedItemArgs();

    /**
     * Type of backup management for the backed up item.
     * 
     */
    @InputImport(name="backupManagementType")
    private final @Nullable Input<Either<String,BackupManagementType>> backupManagementType;

    public Input<Either<String,BackupManagementType>> getBackupManagementType() {
        return this.backupManagementType == null ? Input.empty() : this.backupManagementType;
    }

    /**
     * Name of the backup set the backup item belongs to
     * 
     */
    @InputImport(name="backupSetName")
    private final @Nullable Input<String> backupSetName;

    public Input<String> getBackupSetName() {
        return this.backupSetName == null ? Input.empty() : this.backupSetName;
    }

    /**
     * Unique name of container
     * 
     */
    @InputImport(name="containerName")
    private final @Nullable Input<String> containerName;

    public Input<String> getContainerName() {
        return this.containerName == null ? Input.empty() : this.containerName;
    }

    /**
     * Create mode to indicate recovery of existing soft deleted data source or creation of new data source.
     * 
     */
    @InputImport(name="createMode")
    private final @Nullable Input<Either<String,CreateMode>> createMode;

    public Input<Either<String,CreateMode>> getCreateMode() {
        return this.createMode == null ? Input.empty() : this.createMode;
    }

    /**
     * Time for deferred deletion in UTC
     * 
     */
    @InputImport(name="deferredDeleteTimeInUTC")
    private final @Nullable Input<String> deferredDeleteTimeInUTC;

    public Input<String> getDeferredDeleteTimeInUTC() {
        return this.deferredDeleteTimeInUTC == null ? Input.empty() : this.deferredDeleteTimeInUTC;
    }

    /**
     * Time remaining before the DS marked for deferred delete is permanently deleted
     * 
     */
    @InputImport(name="deferredDeleteTimeRemaining")
    private final @Nullable Input<String> deferredDeleteTimeRemaining;

    public Input<String> getDeferredDeleteTimeRemaining() {
        return this.deferredDeleteTimeRemaining == null ? Input.empty() : this.deferredDeleteTimeRemaining;
    }

    /**
     * Additional information for this backup item.
     * 
     */
    @InputImport(name="extendedInfo")
    private final @Nullable Input<AzureIaaSVMProtectedItemExtendedInfoArgs> extendedInfo;

    public Input<AzureIaaSVMProtectedItemExtendedInfoArgs> getExtendedInfo() {
        return this.extendedInfo == null ? Input.empty() : this.extendedInfo;
    }

    /**
     * Extended Properties for Azure IaasVM Backup.
     * 
     */
    @InputImport(name="extendedProperties")
    private final @Nullable Input<ExtendedPropertiesArgs> extendedProperties;

    public Input<ExtendedPropertiesArgs> getExtendedProperties() {
        return this.extendedProperties == null ? Input.empty() : this.extendedProperties;
    }

    /**
     * Friendly name of the VM represented by this backup item.
     * 
     */
    @InputImport(name="friendlyName")
    private final @Nullable Input<String> friendlyName;

    public Input<String> getFriendlyName() {
        return this.friendlyName == null ? Input.empty() : this.friendlyName;
    }

    /**
     * Health status of protected item.
     * 
     */
    @InputImport(name="healthStatus")
    private final @Nullable Input<Either<String,HealthStatus>> healthStatus;

    public Input<Either<String,HealthStatus>> getHealthStatus() {
        return this.healthStatus == null ? Input.empty() : this.healthStatus;
    }

    /**
     * Flag to identify whether the deferred deleted DS is to be purged soon
     * 
     */
    @InputImport(name="isDeferredDeleteScheduleUpcoming")
    private final @Nullable Input<Boolean> isDeferredDeleteScheduleUpcoming;

    public Input<Boolean> getIsDeferredDeleteScheduleUpcoming() {
        return this.isDeferredDeleteScheduleUpcoming == null ? Input.empty() : this.isDeferredDeleteScheduleUpcoming;
    }

    /**
     * Flag to identify that deferred deleted DS is to be moved into Pause state
     * 
     */
    @InputImport(name="isRehydrate")
    private final @Nullable Input<Boolean> isRehydrate;

    public Input<Boolean> getIsRehydrate() {
        return this.isRehydrate == null ? Input.empty() : this.isRehydrate;
    }

    /**
     * Flag to identify whether the DS is scheduled for deferred delete
     * 
     */
    @InputImport(name="isScheduledForDeferredDelete")
    private final @Nullable Input<Boolean> isScheduledForDeferredDelete;

    public Input<Boolean> getIsScheduledForDeferredDelete() {
        return this.isScheduledForDeferredDelete == null ? Input.empty() : this.isScheduledForDeferredDelete;
    }

    /**
     * Health details of different KPIs
     * 
     */
    @InputImport(name="kpisHealths")
    private final @Nullable Input<Map<String,KPIResourceHealthDetailsArgs>> kpisHealths;

    public Input<Map<String,KPIResourceHealthDetailsArgs>> getKpisHealths() {
        return this.kpisHealths == null ? Input.empty() : this.kpisHealths;
    }

    /**
     * Last backup operation status.
     * 
     */
    @InputImport(name="lastBackupStatus")
    private final @Nullable Input<String> lastBackupStatus;

    public Input<String> getLastBackupStatus() {
        return this.lastBackupStatus == null ? Input.empty() : this.lastBackupStatus;
    }

    /**
     * Timestamp of the last backup operation on this backup item.
     * 
     */
    @InputImport(name="lastBackupTime")
    private final @Nullable Input<String> lastBackupTime;

    public Input<String> getLastBackupTime() {
        return this.lastBackupTime == null ? Input.empty() : this.lastBackupTime;
    }

    /**
     * Timestamp when the last (latest) backup copy was created for this backup item.
     * 
     */
    @InputImport(name="lastRecoveryPoint")
    private final @Nullable Input<String> lastRecoveryPoint;

    public Input<String> getLastRecoveryPoint() {
        return this.lastRecoveryPoint == null ? Input.empty() : this.lastRecoveryPoint;
    }

    /**
     * ID of the backup policy with which this item is backed up.
     * 
     */
    @InputImport(name="policyId")
    private final @Nullable Input<String> policyId;

    public Input<String> getPolicyId() {
        return this.policyId == null ? Input.empty() : this.policyId;
    }

    /**
     * Data ID of the protected item.
     * 
     */
    @InputImport(name="protectedItemDataId")
    private final @Nullable Input<String> protectedItemDataId;

    public Input<String> getProtectedItemDataId() {
        return this.protectedItemDataId == null ? Input.empty() : this.protectedItemDataId;
    }

    /**
     * backup item type.
     * Expected value is 'Microsoft.Compute/virtualMachines'.
     * 
     */
    @InputImport(name="protectedItemType", required=true)
    private final Input<String> protectedItemType;

    public Input<String> getProtectedItemType() {
        return this.protectedItemType;
    }

    /**
     * Backup state of this backup item.
     * 
     */
    @InputImport(name="protectionState")
    private final @Nullable Input<Either<String,ProtectionState>> protectionState;

    public Input<Either<String,ProtectionState>> getProtectionState() {
        return this.protectionState == null ? Input.empty() : this.protectionState;
    }

    /**
     * Backup status of this backup item.
     * 
     */
    @InputImport(name="protectionStatus")
    private final @Nullable Input<String> protectionStatus;

    public Input<String> getProtectionStatus() {
        return this.protectionStatus == null ? Input.empty() : this.protectionStatus;
    }

    /**
     * ARM ID of the resource to be backed up.
     * 
     */
    @InputImport(name="sourceResourceId")
    private final @Nullable Input<String> sourceResourceId;

    public Input<String> getSourceResourceId() {
        return this.sourceResourceId == null ? Input.empty() : this.sourceResourceId;
    }

    /**
     * Fully qualified ARM ID of the virtual machine represented by this item.
     * 
     */
    @InputImport(name="virtualMachineId")
    private final @Nullable Input<String> virtualMachineId;

    public Input<String> getVirtualMachineId() {
        return this.virtualMachineId == null ? Input.empty() : this.virtualMachineId;
    }

    /**
     * Type of workload this item represents.
     * 
     */
    @InputImport(name="workloadType")
    private final @Nullable Input<Either<String,DataSourceType>> workloadType;

    public Input<Either<String,DataSourceType>> getWorkloadType() {
        return this.workloadType == null ? Input.empty() : this.workloadType;
    }

    public AzureIaaSComputeVMProtectedItemArgs(
        @Nullable Input<Either<String,BackupManagementType>> backupManagementType,
        @Nullable Input<String> backupSetName,
        @Nullable Input<String> containerName,
        @Nullable Input<Either<String,CreateMode>> createMode,
        @Nullable Input<String> deferredDeleteTimeInUTC,
        @Nullable Input<String> deferredDeleteTimeRemaining,
        @Nullable Input<AzureIaaSVMProtectedItemExtendedInfoArgs> extendedInfo,
        @Nullable Input<ExtendedPropertiesArgs> extendedProperties,
        @Nullable Input<String> friendlyName,
        @Nullable Input<Either<String,HealthStatus>> healthStatus,
        @Nullable Input<Boolean> isDeferredDeleteScheduleUpcoming,
        @Nullable Input<Boolean> isRehydrate,
        @Nullable Input<Boolean> isScheduledForDeferredDelete,
        @Nullable Input<Map<String,KPIResourceHealthDetailsArgs>> kpisHealths,
        @Nullable Input<String> lastBackupStatus,
        @Nullable Input<String> lastBackupTime,
        @Nullable Input<String> lastRecoveryPoint,
        @Nullable Input<String> policyId,
        @Nullable Input<String> protectedItemDataId,
        Input<String> protectedItemType,
        @Nullable Input<Either<String,ProtectionState>> protectionState,
        @Nullable Input<String> protectionStatus,
        @Nullable Input<String> sourceResourceId,
        @Nullable Input<String> virtualMachineId,
        @Nullable Input<Either<String,DataSourceType>> workloadType) {
        this.backupManagementType = backupManagementType;
        this.backupSetName = backupSetName;
        this.containerName = containerName;
        this.createMode = createMode;
        this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
        this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
        this.extendedInfo = extendedInfo;
        this.extendedProperties = extendedProperties;
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
        this.isRehydrate = isRehydrate;
        this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
        this.kpisHealths = kpisHealths;
        this.lastBackupStatus = lastBackupStatus;
        this.lastBackupTime = lastBackupTime;
        this.lastRecoveryPoint = lastRecoveryPoint;
        this.policyId = policyId;
        this.protectedItemDataId = protectedItemDataId;
        this.protectedItemType = Objects.requireNonNull(protectedItemType, "expected parameter 'protectedItemType' to be non-null");
        this.protectionState = protectionState;
        this.protectionStatus = protectionStatus;
        this.sourceResourceId = sourceResourceId;
        this.virtualMachineId = virtualMachineId;
        this.workloadType = workloadType;
    }

    private AzureIaaSComputeVMProtectedItemArgs() {
        this.backupManagementType = Input.empty();
        this.backupSetName = Input.empty();
        this.containerName = Input.empty();
        this.createMode = Input.empty();
        this.deferredDeleteTimeInUTC = Input.empty();
        this.deferredDeleteTimeRemaining = Input.empty();
        this.extendedInfo = Input.empty();
        this.extendedProperties = Input.empty();
        this.friendlyName = Input.empty();
        this.healthStatus = Input.empty();
        this.isDeferredDeleteScheduleUpcoming = Input.empty();
        this.isRehydrate = Input.empty();
        this.isScheduledForDeferredDelete = Input.empty();
        this.kpisHealths = Input.empty();
        this.lastBackupStatus = Input.empty();
        this.lastBackupTime = Input.empty();
        this.lastRecoveryPoint = Input.empty();
        this.policyId = Input.empty();
        this.protectedItemDataId = Input.empty();
        this.protectedItemType = Input.empty();
        this.protectionState = Input.empty();
        this.protectionStatus = Input.empty();
        this.sourceResourceId = Input.empty();
        this.virtualMachineId = Input.empty();
        this.workloadType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureIaaSComputeVMProtectedItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,BackupManagementType>> backupManagementType;
        private @Nullable Input<String> backupSetName;
        private @Nullable Input<String> containerName;
        private @Nullable Input<Either<String,CreateMode>> createMode;
        private @Nullable Input<String> deferredDeleteTimeInUTC;
        private @Nullable Input<String> deferredDeleteTimeRemaining;
        private @Nullable Input<AzureIaaSVMProtectedItemExtendedInfoArgs> extendedInfo;
        private @Nullable Input<ExtendedPropertiesArgs> extendedProperties;
        private @Nullable Input<String> friendlyName;
        private @Nullable Input<Either<String,HealthStatus>> healthStatus;
        private @Nullable Input<Boolean> isDeferredDeleteScheduleUpcoming;
        private @Nullable Input<Boolean> isRehydrate;
        private @Nullable Input<Boolean> isScheduledForDeferredDelete;
        private @Nullable Input<Map<String,KPIResourceHealthDetailsArgs>> kpisHealths;
        private @Nullable Input<String> lastBackupStatus;
        private @Nullable Input<String> lastBackupTime;
        private @Nullable Input<String> lastRecoveryPoint;
        private @Nullable Input<String> policyId;
        private @Nullable Input<String> protectedItemDataId;
        private Input<String> protectedItemType;
        private @Nullable Input<Either<String,ProtectionState>> protectionState;
        private @Nullable Input<String> protectionStatus;
        private @Nullable Input<String> sourceResourceId;
        private @Nullable Input<String> virtualMachineId;
        private @Nullable Input<Either<String,DataSourceType>> workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureIaaSComputeVMProtectedItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.backupSetName = defaults.backupSetName;
    	      this.containerName = defaults.containerName;
    	      this.createMode = defaults.createMode;
    	      this.deferredDeleteTimeInUTC = defaults.deferredDeleteTimeInUTC;
    	      this.deferredDeleteTimeRemaining = defaults.deferredDeleteTimeRemaining;
    	      this.extendedInfo = defaults.extendedInfo;
    	      this.extendedProperties = defaults.extendedProperties;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthStatus = defaults.healthStatus;
    	      this.isDeferredDeleteScheduleUpcoming = defaults.isDeferredDeleteScheduleUpcoming;
    	      this.isRehydrate = defaults.isRehydrate;
    	      this.isScheduledForDeferredDelete = defaults.isScheduledForDeferredDelete;
    	      this.kpisHealths = defaults.kpisHealths;
    	      this.lastBackupStatus = defaults.lastBackupStatus;
    	      this.lastBackupTime = defaults.lastBackupTime;
    	      this.lastRecoveryPoint = defaults.lastRecoveryPoint;
    	      this.policyId = defaults.policyId;
    	      this.protectedItemDataId = defaults.protectedItemDataId;
    	      this.protectedItemType = defaults.protectedItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.protectionStatus = defaults.protectionStatus;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.virtualMachineId = defaults.virtualMachineId;
    	      this.workloadType = defaults.workloadType;
        }

        public Builder setBackupManagementType(@Nullable Input<Either<String,BackupManagementType>> backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder setBackupManagementType(@Nullable Either<String,BackupManagementType> backupManagementType) {
            this.backupManagementType = Input.ofNullable(backupManagementType);
            return this;
        }

        public Builder setBackupSetName(@Nullable Input<String> backupSetName) {
            this.backupSetName = backupSetName;
            return this;
        }

        public Builder setBackupSetName(@Nullable String backupSetName) {
            this.backupSetName = Input.ofNullable(backupSetName);
            return this;
        }

        public Builder setContainerName(@Nullable Input<String> containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder setContainerName(@Nullable String containerName) {
            this.containerName = Input.ofNullable(containerName);
            return this;
        }

        public Builder setCreateMode(@Nullable Input<Either<String,CreateMode>> createMode) {
            this.createMode = createMode;
            return this;
        }

        public Builder setCreateMode(@Nullable Either<String,CreateMode> createMode) {
            this.createMode = Input.ofNullable(createMode);
            return this;
        }

        public Builder setDeferredDeleteTimeInUTC(@Nullable Input<String> deferredDeleteTimeInUTC) {
            this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
            return this;
        }

        public Builder setDeferredDeleteTimeInUTC(@Nullable String deferredDeleteTimeInUTC) {
            this.deferredDeleteTimeInUTC = Input.ofNullable(deferredDeleteTimeInUTC);
            return this;
        }

        public Builder setDeferredDeleteTimeRemaining(@Nullable Input<String> deferredDeleteTimeRemaining) {
            this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
            return this;
        }

        public Builder setDeferredDeleteTimeRemaining(@Nullable String deferredDeleteTimeRemaining) {
            this.deferredDeleteTimeRemaining = Input.ofNullable(deferredDeleteTimeRemaining);
            return this;
        }

        public Builder setExtendedInfo(@Nullable Input<AzureIaaSVMProtectedItemExtendedInfoArgs> extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }

        public Builder setExtendedInfo(@Nullable AzureIaaSVMProtectedItemExtendedInfoArgs extendedInfo) {
            this.extendedInfo = Input.ofNullable(extendedInfo);
            return this;
        }

        public Builder setExtendedProperties(@Nullable Input<ExtendedPropertiesArgs> extendedProperties) {
            this.extendedProperties = extendedProperties;
            return this;
        }

        public Builder setExtendedProperties(@Nullable ExtendedPropertiesArgs extendedProperties) {
            this.extendedProperties = Input.ofNullable(extendedProperties);
            return this;
        }

        public Builder setFriendlyName(@Nullable Input<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = Input.ofNullable(friendlyName);
            return this;
        }

        public Builder setHealthStatus(@Nullable Input<Either<String,HealthStatus>> healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        public Builder setHealthStatus(@Nullable Either<String,HealthStatus> healthStatus) {
            this.healthStatus = Input.ofNullable(healthStatus);
            return this;
        }

        public Builder setIsDeferredDeleteScheduleUpcoming(@Nullable Input<Boolean> isDeferredDeleteScheduleUpcoming) {
            this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
            return this;
        }

        public Builder setIsDeferredDeleteScheduleUpcoming(@Nullable Boolean isDeferredDeleteScheduleUpcoming) {
            this.isDeferredDeleteScheduleUpcoming = Input.ofNullable(isDeferredDeleteScheduleUpcoming);
            return this;
        }

        public Builder setIsRehydrate(@Nullable Input<Boolean> isRehydrate) {
            this.isRehydrate = isRehydrate;
            return this;
        }

        public Builder setIsRehydrate(@Nullable Boolean isRehydrate) {
            this.isRehydrate = Input.ofNullable(isRehydrate);
            return this;
        }

        public Builder setIsScheduledForDeferredDelete(@Nullable Input<Boolean> isScheduledForDeferredDelete) {
            this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
            return this;
        }

        public Builder setIsScheduledForDeferredDelete(@Nullable Boolean isScheduledForDeferredDelete) {
            this.isScheduledForDeferredDelete = Input.ofNullable(isScheduledForDeferredDelete);
            return this;
        }

        public Builder setKpisHealths(@Nullable Input<Map<String,KPIResourceHealthDetailsArgs>> kpisHealths) {
            this.kpisHealths = kpisHealths;
            return this;
        }

        public Builder setKpisHealths(@Nullable Map<String,KPIResourceHealthDetailsArgs> kpisHealths) {
            this.kpisHealths = Input.ofNullable(kpisHealths);
            return this;
        }

        public Builder setLastBackupStatus(@Nullable Input<String> lastBackupStatus) {
            this.lastBackupStatus = lastBackupStatus;
            return this;
        }

        public Builder setLastBackupStatus(@Nullable String lastBackupStatus) {
            this.lastBackupStatus = Input.ofNullable(lastBackupStatus);
            return this;
        }

        public Builder setLastBackupTime(@Nullable Input<String> lastBackupTime) {
            this.lastBackupTime = lastBackupTime;
            return this;
        }

        public Builder setLastBackupTime(@Nullable String lastBackupTime) {
            this.lastBackupTime = Input.ofNullable(lastBackupTime);
            return this;
        }

        public Builder setLastRecoveryPoint(@Nullable Input<String> lastRecoveryPoint) {
            this.lastRecoveryPoint = lastRecoveryPoint;
            return this;
        }

        public Builder setLastRecoveryPoint(@Nullable String lastRecoveryPoint) {
            this.lastRecoveryPoint = Input.ofNullable(lastRecoveryPoint);
            return this;
        }

        public Builder setPolicyId(@Nullable Input<String> policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder setPolicyId(@Nullable String policyId) {
            this.policyId = Input.ofNullable(policyId);
            return this;
        }

        public Builder setProtectedItemDataId(@Nullable Input<String> protectedItemDataId) {
            this.protectedItemDataId = protectedItemDataId;
            return this;
        }

        public Builder setProtectedItemDataId(@Nullable String protectedItemDataId) {
            this.protectedItemDataId = Input.ofNullable(protectedItemDataId);
            return this;
        }

        public Builder setProtectedItemType(Input<String> protectedItemType) {
            this.protectedItemType = Objects.requireNonNull(protectedItemType);
            return this;
        }

        public Builder setProtectedItemType(String protectedItemType) {
            this.protectedItemType = Input.of(Objects.requireNonNull(protectedItemType));
            return this;
        }

        public Builder setProtectionState(@Nullable Input<Either<String,ProtectionState>> protectionState) {
            this.protectionState = protectionState;
            return this;
        }

        public Builder setProtectionState(@Nullable Either<String,ProtectionState> protectionState) {
            this.protectionState = Input.ofNullable(protectionState);
            return this;
        }

        public Builder setProtectionStatus(@Nullable Input<String> protectionStatus) {
            this.protectionStatus = protectionStatus;
            return this;
        }

        public Builder setProtectionStatus(@Nullable String protectionStatus) {
            this.protectionStatus = Input.ofNullable(protectionStatus);
            return this;
        }

        public Builder setSourceResourceId(@Nullable Input<String> sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }

        public Builder setSourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = Input.ofNullable(sourceResourceId);
            return this;
        }

        public Builder setVirtualMachineId(@Nullable Input<String> virtualMachineId) {
            this.virtualMachineId = virtualMachineId;
            return this;
        }

        public Builder setVirtualMachineId(@Nullable String virtualMachineId) {
            this.virtualMachineId = Input.ofNullable(virtualMachineId);
            return this;
        }

        public Builder setWorkloadType(@Nullable Input<Either<String,DataSourceType>> workloadType) {
            this.workloadType = workloadType;
            return this;
        }

        public Builder setWorkloadType(@Nullable Either<String,DataSourceType> workloadType) {
            this.workloadType = Input.ofNullable(workloadType);
            return this;
        }

        public AzureIaaSComputeVMProtectedItemArgs build() {
            return new AzureIaaSComputeVMProtectedItemArgs(backupManagementType, backupSetName, containerName, createMode, deferredDeleteTimeInUTC, deferredDeleteTimeRemaining, extendedInfo, extendedProperties, friendlyName, healthStatus, isDeferredDeleteScheduleUpcoming, isRehydrate, isScheduledForDeferredDelete, kpisHealths, lastBackupStatus, lastBackupTime, lastRecoveryPoint, policyId, protectedItemDataId, protectedItemType, protectionState, protectionStatus, sourceResourceId, virtualMachineId, workloadType);
        }
    }
}
