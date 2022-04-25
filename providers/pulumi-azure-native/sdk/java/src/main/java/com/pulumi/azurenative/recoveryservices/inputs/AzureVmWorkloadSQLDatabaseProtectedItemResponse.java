// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.AzureVmWorkloadProtectedItemExtendedInfoResponse;
import com.pulumi.azurenative.recoveryservices.inputs.ErrorDetailResponse;
import com.pulumi.azurenative.recoveryservices.inputs.KPIResourceHealthDetailsResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
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
public final class AzureVmWorkloadSQLDatabaseProtectedItemResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureVmWorkloadSQLDatabaseProtectedItemResponse Empty = new AzureVmWorkloadSQLDatabaseProtectedItemResponse();

    /**
     * Type of backup management for the backed up item.
     * 
     */
    @Import(name="backupManagementType")
    private @Nullable String backupManagementType;

    /**
     * @return Type of backup management for the backed up item.
     * 
     */
    public Optional<String> backupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }

    /**
     * Name of the backup set the backup item belongs to
     * 
     */
    @Import(name="backupSetName")
    private @Nullable String backupSetName;

    /**
     * @return Name of the backup set the backup item belongs to
     * 
     */
    public Optional<String> backupSetName() {
        return Optional.ofNullable(this.backupSetName);
    }

    /**
     * Unique name of container
     * 
     */
    @Import(name="containerName")
    private @Nullable String containerName;

    /**
     * @return Unique name of container
     * 
     */
    public Optional<String> containerName() {
        return Optional.ofNullable(this.containerName);
    }

    /**
     * Create mode to indicate recovery of existing soft deleted data source or creation of new data source.
     * 
     */
    @Import(name="createMode")
    private @Nullable String createMode;

    /**
     * @return Create mode to indicate recovery of existing soft deleted data source or creation of new data source.
     * 
     */
    public Optional<String> createMode() {
        return Optional.ofNullable(this.createMode);
    }

    /**
     * Time for deferred deletion in UTC
     * 
     */
    @Import(name="deferredDeleteTimeInUTC")
    private @Nullable String deferredDeleteTimeInUTC;

    /**
     * @return Time for deferred deletion in UTC
     * 
     */
    public Optional<String> deferredDeleteTimeInUTC() {
        return Optional.ofNullable(this.deferredDeleteTimeInUTC);
    }

    /**
     * Time remaining before the DS marked for deferred delete is permanently deleted
     * 
     */
    @Import(name="deferredDeleteTimeRemaining")
    private @Nullable String deferredDeleteTimeRemaining;

    /**
     * @return Time remaining before the DS marked for deferred delete is permanently deleted
     * 
     */
    public Optional<String> deferredDeleteTimeRemaining() {
        return Optional.ofNullable(this.deferredDeleteTimeRemaining);
    }

    /**
     * Additional information for this backup item.
     * 
     */
    @Import(name="extendedInfo")
    private @Nullable AzureVmWorkloadProtectedItemExtendedInfoResponse extendedInfo;

    /**
     * @return Additional information for this backup item.
     * 
     */
    public Optional<AzureVmWorkloadProtectedItemExtendedInfoResponse> extendedInfo() {
        return Optional.ofNullable(this.extendedInfo);
    }

    /**
     * Friendly name of the DB represented by this backup item.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable String friendlyName;

    /**
     * @return Friendly name of the DB represented by this backup item.
     * 
     */
    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * Flag to identify whether the deferred deleted DS is to be purged soon
     * 
     */
    @Import(name="isDeferredDeleteScheduleUpcoming")
    private @Nullable Boolean isDeferredDeleteScheduleUpcoming;

    /**
     * @return Flag to identify whether the deferred deleted DS is to be purged soon
     * 
     */
    public Optional<Boolean> isDeferredDeleteScheduleUpcoming() {
        return Optional.ofNullable(this.isDeferredDeleteScheduleUpcoming);
    }

    /**
     * Flag to identify that deferred deleted DS is to be moved into Pause state
     * 
     */
    @Import(name="isRehydrate")
    private @Nullable Boolean isRehydrate;

    /**
     * @return Flag to identify that deferred deleted DS is to be moved into Pause state
     * 
     */
    public Optional<Boolean> isRehydrate() {
        return Optional.ofNullable(this.isRehydrate);
    }

    /**
     * Flag to identify whether the DS is scheduled for deferred delete
     * 
     */
    @Import(name="isScheduledForDeferredDelete")
    private @Nullable Boolean isScheduledForDeferredDelete;

    /**
     * @return Flag to identify whether the DS is scheduled for deferred delete
     * 
     */
    public Optional<Boolean> isScheduledForDeferredDelete() {
        return Optional.ofNullable(this.isScheduledForDeferredDelete);
    }

    /**
     * Health details of different KPIs
     * 
     */
    @Import(name="kpisHealths")
    private @Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths;

    /**
     * @return Health details of different KPIs
     * 
     */
    public Optional<Map<String,KPIResourceHealthDetailsResponse>> kpisHealths() {
        return Optional.ofNullable(this.kpisHealths);
    }

    /**
     * Error details in last backup
     * 
     */
    @Import(name="lastBackupErrorDetail")
    private @Nullable ErrorDetailResponse lastBackupErrorDetail;

    /**
     * @return Error details in last backup
     * 
     */
    public Optional<ErrorDetailResponse> lastBackupErrorDetail() {
        return Optional.ofNullable(this.lastBackupErrorDetail);
    }

    /**
     * Last backup operation status. Possible values: Healthy, Unhealthy.
     * 
     */
    @Import(name="lastBackupStatus")
    private @Nullable String lastBackupStatus;

    /**
     * @return Last backup operation status. Possible values: Healthy, Unhealthy.
     * 
     */
    public Optional<String> lastBackupStatus() {
        return Optional.ofNullable(this.lastBackupStatus);
    }

    /**
     * Timestamp of the last backup operation on this backup item.
     * 
     */
    @Import(name="lastBackupTime")
    private @Nullable String lastBackupTime;

    /**
     * @return Timestamp of the last backup operation on this backup item.
     * 
     */
    public Optional<String> lastBackupTime() {
        return Optional.ofNullable(this.lastBackupTime);
    }

    /**
     * Timestamp when the last (latest) backup copy was created for this backup item.
     * 
     */
    @Import(name="lastRecoveryPoint")
    private @Nullable String lastRecoveryPoint;

    /**
     * @return Timestamp when the last (latest) backup copy was created for this backup item.
     * 
     */
    public Optional<String> lastRecoveryPoint() {
        return Optional.ofNullable(this.lastRecoveryPoint);
    }

    /**
     * Parent name of the DB such as Instance or Availability Group.
     * 
     */
    @Import(name="parentName")
    private @Nullable String parentName;

    /**
     * @return Parent name of the DB such as Instance or Availability Group.
     * 
     */
    public Optional<String> parentName() {
        return Optional.ofNullable(this.parentName);
    }

    /**
     * Parent type of protected item, example: for a DB, standalone server or distributed
     * 
     */
    @Import(name="parentType")
    private @Nullable String parentType;

    /**
     * @return Parent type of protected item, example: for a DB, standalone server or distributed
     * 
     */
    public Optional<String> parentType() {
        return Optional.ofNullable(this.parentType);
    }

    /**
     * ID of the backup policy with which this item is backed up.
     * 
     */
    @Import(name="policyId")
    private @Nullable String policyId;

    /**
     * @return ID of the backup policy with which this item is backed up.
     * 
     */
    public Optional<String> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    /**
     * Data ID of the protected item.
     * 
     */
    @Import(name="protectedItemDataSourceId")
    private @Nullable String protectedItemDataSourceId;

    /**
     * @return Data ID of the protected item.
     * 
     */
    public Optional<String> protectedItemDataSourceId() {
        return Optional.ofNullable(this.protectedItemDataSourceId);
    }

    /**
     * Health status of the backup item, evaluated based on last heartbeat received
     * 
     */
    @Import(name="protectedItemHealthStatus")
    private @Nullable String protectedItemHealthStatus;

    /**
     * @return Health status of the backup item, evaluated based on last heartbeat received
     * 
     */
    public Optional<String> protectedItemHealthStatus() {
        return Optional.ofNullable(this.protectedItemHealthStatus);
    }

    /**
     * backup item type.
     * Expected value is &#39;AzureVmWorkloadSQLDatabase&#39;.
     * 
     */
    @Import(name="protectedItemType", required=true)
    private String protectedItemType;

    /**
     * @return backup item type.
     * Expected value is &#39;AzureVmWorkloadSQLDatabase&#39;.
     * 
     */
    public String protectedItemType() {
        return this.protectedItemType;
    }

    /**
     * Backup state of this backup item.
     * 
     */
    @Import(name="protectionState")
    private @Nullable String protectionState;

    /**
     * @return Backup state of this backup item.
     * 
     */
    public Optional<String> protectionState() {
        return Optional.ofNullable(this.protectionState);
    }

    /**
     * Backup status of this backup item.
     * 
     */
    @Import(name="protectionStatus")
    private @Nullable String protectionStatus;

    /**
     * @return Backup status of this backup item.
     * 
     */
    public Optional<String> protectionStatus() {
        return Optional.ofNullable(this.protectionStatus);
    }

    /**
     * Host/Cluster Name for instance or AG
     * 
     */
    @Import(name="serverName")
    private @Nullable String serverName;

    /**
     * @return Host/Cluster Name for instance or AG
     * 
     */
    public Optional<String> serverName() {
        return Optional.ofNullable(this.serverName);
    }

    /**
     * ARM ID of the resource to be backed up.
     * 
     */
    @Import(name="sourceResourceId")
    private @Nullable String sourceResourceId;

    /**
     * @return ARM ID of the resource to be backed up.
     * 
     */
    public Optional<String> sourceResourceId() {
        return Optional.ofNullable(this.sourceResourceId);
    }

    /**
     * Type of workload this item represents.
     * 
     */
    @Import(name="workloadType")
    private @Nullable String workloadType;

    /**
     * @return Type of workload this item represents.
     * 
     */
    public Optional<String> workloadType() {
        return Optional.ofNullable(this.workloadType);
    }

    private AzureVmWorkloadSQLDatabaseProtectedItemResponse() {}

    private AzureVmWorkloadSQLDatabaseProtectedItemResponse(AzureVmWorkloadSQLDatabaseProtectedItemResponse $) {
        this.backupManagementType = $.backupManagementType;
        this.backupSetName = $.backupSetName;
        this.containerName = $.containerName;
        this.createMode = $.createMode;
        this.deferredDeleteTimeInUTC = $.deferredDeleteTimeInUTC;
        this.deferredDeleteTimeRemaining = $.deferredDeleteTimeRemaining;
        this.extendedInfo = $.extendedInfo;
        this.friendlyName = $.friendlyName;
        this.isDeferredDeleteScheduleUpcoming = $.isDeferredDeleteScheduleUpcoming;
        this.isRehydrate = $.isRehydrate;
        this.isScheduledForDeferredDelete = $.isScheduledForDeferredDelete;
        this.kpisHealths = $.kpisHealths;
        this.lastBackupErrorDetail = $.lastBackupErrorDetail;
        this.lastBackupStatus = $.lastBackupStatus;
        this.lastBackupTime = $.lastBackupTime;
        this.lastRecoveryPoint = $.lastRecoveryPoint;
        this.parentName = $.parentName;
        this.parentType = $.parentType;
        this.policyId = $.policyId;
        this.protectedItemDataSourceId = $.protectedItemDataSourceId;
        this.protectedItemHealthStatus = $.protectedItemHealthStatus;
        this.protectedItemType = $.protectedItemType;
        this.protectionState = $.protectionState;
        this.protectionStatus = $.protectionStatus;
        this.serverName = $.serverName;
        this.sourceResourceId = $.sourceResourceId;
        this.workloadType = $.workloadType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureVmWorkloadSQLDatabaseProtectedItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureVmWorkloadSQLDatabaseProtectedItemResponse $;

        public Builder() {
            $ = new AzureVmWorkloadSQLDatabaseProtectedItemResponse();
        }

        public Builder(AzureVmWorkloadSQLDatabaseProtectedItemResponse defaults) {
            $ = new AzureVmWorkloadSQLDatabaseProtectedItemResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupManagementType Type of backup management for the backed up item.
         * 
         * @return builder
         * 
         */
        public Builder backupManagementType(@Nullable String backupManagementType) {
            $.backupManagementType = backupManagementType;
            return this;
        }

        /**
         * @param backupSetName Name of the backup set the backup item belongs to
         * 
         * @return builder
         * 
         */
        public Builder backupSetName(@Nullable String backupSetName) {
            $.backupSetName = backupSetName;
            return this;
        }

        /**
         * @param containerName Unique name of container
         * 
         * @return builder
         * 
         */
        public Builder containerName(@Nullable String containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param createMode Create mode to indicate recovery of existing soft deleted data source or creation of new data source.
         * 
         * @return builder
         * 
         */
        public Builder createMode(@Nullable String createMode) {
            $.createMode = createMode;
            return this;
        }

        /**
         * @param deferredDeleteTimeInUTC Time for deferred deletion in UTC
         * 
         * @return builder
         * 
         */
        public Builder deferredDeleteTimeInUTC(@Nullable String deferredDeleteTimeInUTC) {
            $.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
            return this;
        }

        /**
         * @param deferredDeleteTimeRemaining Time remaining before the DS marked for deferred delete is permanently deleted
         * 
         * @return builder
         * 
         */
        public Builder deferredDeleteTimeRemaining(@Nullable String deferredDeleteTimeRemaining) {
            $.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
            return this;
        }

        /**
         * @param extendedInfo Additional information for this backup item.
         * 
         * @return builder
         * 
         */
        public Builder extendedInfo(@Nullable AzureVmWorkloadProtectedItemExtendedInfoResponse extendedInfo) {
            $.extendedInfo = extendedInfo;
            return this;
        }

        /**
         * @param friendlyName Friendly name of the DB represented by this backup item.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(@Nullable String friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        /**
         * @param isDeferredDeleteScheduleUpcoming Flag to identify whether the deferred deleted DS is to be purged soon
         * 
         * @return builder
         * 
         */
        public Builder isDeferredDeleteScheduleUpcoming(@Nullable Boolean isDeferredDeleteScheduleUpcoming) {
            $.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
            return this;
        }

        /**
         * @param isRehydrate Flag to identify that deferred deleted DS is to be moved into Pause state
         * 
         * @return builder
         * 
         */
        public Builder isRehydrate(@Nullable Boolean isRehydrate) {
            $.isRehydrate = isRehydrate;
            return this;
        }

        /**
         * @param isScheduledForDeferredDelete Flag to identify whether the DS is scheduled for deferred delete
         * 
         * @return builder
         * 
         */
        public Builder isScheduledForDeferredDelete(@Nullable Boolean isScheduledForDeferredDelete) {
            $.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
            return this;
        }

        /**
         * @param kpisHealths Health details of different KPIs
         * 
         * @return builder
         * 
         */
        public Builder kpisHealths(@Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths) {
            $.kpisHealths = kpisHealths;
            return this;
        }

        /**
         * @param lastBackupErrorDetail Error details in last backup
         * 
         * @return builder
         * 
         */
        public Builder lastBackupErrorDetail(@Nullable ErrorDetailResponse lastBackupErrorDetail) {
            $.lastBackupErrorDetail = lastBackupErrorDetail;
            return this;
        }

        /**
         * @param lastBackupStatus Last backup operation status. Possible values: Healthy, Unhealthy.
         * 
         * @return builder
         * 
         */
        public Builder lastBackupStatus(@Nullable String lastBackupStatus) {
            $.lastBackupStatus = lastBackupStatus;
            return this;
        }

        /**
         * @param lastBackupTime Timestamp of the last backup operation on this backup item.
         * 
         * @return builder
         * 
         */
        public Builder lastBackupTime(@Nullable String lastBackupTime) {
            $.lastBackupTime = lastBackupTime;
            return this;
        }

        /**
         * @param lastRecoveryPoint Timestamp when the last (latest) backup copy was created for this backup item.
         * 
         * @return builder
         * 
         */
        public Builder lastRecoveryPoint(@Nullable String lastRecoveryPoint) {
            $.lastRecoveryPoint = lastRecoveryPoint;
            return this;
        }

        /**
         * @param parentName Parent name of the DB such as Instance or Availability Group.
         * 
         * @return builder
         * 
         */
        public Builder parentName(@Nullable String parentName) {
            $.parentName = parentName;
            return this;
        }

        /**
         * @param parentType Parent type of protected item, example: for a DB, standalone server or distributed
         * 
         * @return builder
         * 
         */
        public Builder parentType(@Nullable String parentType) {
            $.parentType = parentType;
            return this;
        }

        /**
         * @param policyId ID of the backup policy with which this item is backed up.
         * 
         * @return builder
         * 
         */
        public Builder policyId(@Nullable String policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param protectedItemDataSourceId Data ID of the protected item.
         * 
         * @return builder
         * 
         */
        public Builder protectedItemDataSourceId(@Nullable String protectedItemDataSourceId) {
            $.protectedItemDataSourceId = protectedItemDataSourceId;
            return this;
        }

        /**
         * @param protectedItemHealthStatus Health status of the backup item, evaluated based on last heartbeat received
         * 
         * @return builder
         * 
         */
        public Builder protectedItemHealthStatus(@Nullable String protectedItemHealthStatus) {
            $.protectedItemHealthStatus = protectedItemHealthStatus;
            return this;
        }

        /**
         * @param protectedItemType backup item type.
         * Expected value is &#39;AzureVmWorkloadSQLDatabase&#39;.
         * 
         * @return builder
         * 
         */
        public Builder protectedItemType(String protectedItemType) {
            $.protectedItemType = protectedItemType;
            return this;
        }

        /**
         * @param protectionState Backup state of this backup item.
         * 
         * @return builder
         * 
         */
        public Builder protectionState(@Nullable String protectionState) {
            $.protectionState = protectionState;
            return this;
        }

        /**
         * @param protectionStatus Backup status of this backup item.
         * 
         * @return builder
         * 
         */
        public Builder protectionStatus(@Nullable String protectionStatus) {
            $.protectionStatus = protectionStatus;
            return this;
        }

        /**
         * @param serverName Host/Cluster Name for instance or AG
         * 
         * @return builder
         * 
         */
        public Builder serverName(@Nullable String serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param sourceResourceId ARM ID of the resource to be backed up.
         * 
         * @return builder
         * 
         */
        public Builder sourceResourceId(@Nullable String sourceResourceId) {
            $.sourceResourceId = sourceResourceId;
            return this;
        }

        /**
         * @param workloadType Type of workload this item represents.
         * 
         * @return builder
         * 
         */
        public Builder workloadType(@Nullable String workloadType) {
            $.workloadType = workloadType;
            return this;
        }

        public AzureVmWorkloadSQLDatabaseProtectedItemResponse build() {
            $.protectedItemType = Codegen.stringProp("protectedItemType").arg($.protectedItemType).require();
            return $;
        }
    }

}
