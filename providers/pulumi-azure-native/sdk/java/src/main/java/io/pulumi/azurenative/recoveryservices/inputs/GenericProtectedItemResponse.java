// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Base class for backup items.
 * 
 */
public final class GenericProtectedItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final GenericProtectedItemResponse Empty = new GenericProtectedItemResponse();

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
     * Name of this backup item's fabric.
     * 
     */
    @InputImport(name="fabricName")
    private final @Nullable String fabricName;

    public Optional<String> getFabricName() {
        return this.fabricName == null ? Optional.empty() : Optional.ofNullable(this.fabricName);
    }

    /**
     * Friendly name of the container.
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
     * Timestamp when the last (latest) backup copy was created for this backup item.
     * 
     */
    @InputImport(name="lastRecoveryPoint")
    private final @Nullable String lastRecoveryPoint;

    public Optional<String> getLastRecoveryPoint() {
        return this.lastRecoveryPoint == null ? Optional.empty() : Optional.ofNullable(this.lastRecoveryPoint);
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
     * Indicates consistency of policy object and policy applied to this backup item.
     * 
     */
    @InputImport(name="policyState")
    private final @Nullable String policyState;

    public Optional<String> getPolicyState() {
        return this.policyState == null ? Optional.empty() : Optional.ofNullable(this.policyState);
    }

    /**
     * Data Plane Service ID of the protected item.
     * 
     */
    @InputImport(name="protectedItemId")
    private final @Nullable Double protectedItemId;

    public Optional<Double> getProtectedItemId() {
        return this.protectedItemId == null ? Optional.empty() : Optional.ofNullable(this.protectedItemId);
    }

    /**
     * backup item type.
     * Expected value is 'GenericProtectedItem'.
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
     * Loosely coupled (type, value) associations (example - parent of a protected item)
     * 
     */
    @InputImport(name="sourceAssociations")
    private final @Nullable Map<String,String> sourceAssociations;

    public Map<String,String> getSourceAssociations() {
        return this.sourceAssociations == null ? Map.of() : this.sourceAssociations;
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

    public GenericProtectedItemResponse(
        @Nullable String backupManagementType,
        @Nullable String backupSetName,
        @Nullable String containerName,
        @Nullable String createMode,
        @Nullable String deferredDeleteTimeInUTC,
        @Nullable String deferredDeleteTimeRemaining,
        @Nullable String fabricName,
        @Nullable String friendlyName,
        @Nullable Boolean isDeferredDeleteScheduleUpcoming,
        @Nullable Boolean isRehydrate,
        @Nullable Boolean isScheduledForDeferredDelete,
        @Nullable String lastRecoveryPoint,
        @Nullable String policyId,
        @Nullable String policyState,
        @Nullable Double protectedItemId,
        String protectedItemType,
        @Nullable String protectionState,
        @Nullable Map<String,String> sourceAssociations,
        @Nullable String sourceResourceId,
        @Nullable String workloadType) {
        this.backupManagementType = backupManagementType;
        this.backupSetName = backupSetName;
        this.containerName = containerName;
        this.createMode = createMode;
        this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
        this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
        this.fabricName = fabricName;
        this.friendlyName = friendlyName;
        this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
        this.isRehydrate = isRehydrate;
        this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
        this.lastRecoveryPoint = lastRecoveryPoint;
        this.policyId = policyId;
        this.policyState = policyState;
        this.protectedItemId = protectedItemId;
        this.protectedItemType = Objects.requireNonNull(protectedItemType, "expected parameter 'protectedItemType' to be non-null");
        this.protectionState = protectionState;
        this.sourceAssociations = sourceAssociations;
        this.sourceResourceId = sourceResourceId;
        this.workloadType = workloadType;
    }

    private GenericProtectedItemResponse() {
        this.backupManagementType = null;
        this.backupSetName = null;
        this.containerName = null;
        this.createMode = null;
        this.deferredDeleteTimeInUTC = null;
        this.deferredDeleteTimeRemaining = null;
        this.fabricName = null;
        this.friendlyName = null;
        this.isDeferredDeleteScheduleUpcoming = null;
        this.isRehydrate = null;
        this.isScheduledForDeferredDelete = null;
        this.lastRecoveryPoint = null;
        this.policyId = null;
        this.policyState = null;
        this.protectedItemId = null;
        this.protectedItemType = null;
        this.protectionState = null;
        this.sourceAssociations = Map.of();
        this.sourceResourceId = null;
        this.workloadType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GenericProtectedItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private @Nullable String backupSetName;
        private @Nullable String containerName;
        private @Nullable String createMode;
        private @Nullable String deferredDeleteTimeInUTC;
        private @Nullable String deferredDeleteTimeRemaining;
        private @Nullable String fabricName;
        private @Nullable String friendlyName;
        private @Nullable Boolean isDeferredDeleteScheduleUpcoming;
        private @Nullable Boolean isRehydrate;
        private @Nullable Boolean isScheduledForDeferredDelete;
        private @Nullable String lastRecoveryPoint;
        private @Nullable String policyId;
        private @Nullable String policyState;
        private @Nullable Double protectedItemId;
        private String protectedItemType;
        private @Nullable String protectionState;
        private @Nullable Map<String,String> sourceAssociations;
        private @Nullable String sourceResourceId;
        private @Nullable String workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(GenericProtectedItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.backupSetName = defaults.backupSetName;
    	      this.containerName = defaults.containerName;
    	      this.createMode = defaults.createMode;
    	      this.deferredDeleteTimeInUTC = defaults.deferredDeleteTimeInUTC;
    	      this.deferredDeleteTimeRemaining = defaults.deferredDeleteTimeRemaining;
    	      this.fabricName = defaults.fabricName;
    	      this.friendlyName = defaults.friendlyName;
    	      this.isDeferredDeleteScheduleUpcoming = defaults.isDeferredDeleteScheduleUpcoming;
    	      this.isRehydrate = defaults.isRehydrate;
    	      this.isScheduledForDeferredDelete = defaults.isScheduledForDeferredDelete;
    	      this.lastRecoveryPoint = defaults.lastRecoveryPoint;
    	      this.policyId = defaults.policyId;
    	      this.policyState = defaults.policyState;
    	      this.protectedItemId = defaults.protectedItemId;
    	      this.protectedItemType = defaults.protectedItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.sourceAssociations = defaults.sourceAssociations;
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

        public Builder setFabricName(@Nullable String fabricName) {
            this.fabricName = fabricName;
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

        public Builder setLastRecoveryPoint(@Nullable String lastRecoveryPoint) {
            this.lastRecoveryPoint = lastRecoveryPoint;
            return this;
        }

        public Builder setPolicyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder setPolicyState(@Nullable String policyState) {
            this.policyState = policyState;
            return this;
        }

        public Builder setProtectedItemId(@Nullable Double protectedItemId) {
            this.protectedItemId = protectedItemId;
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

        public Builder setSourceAssociations(@Nullable Map<String,String> sourceAssociations) {
            this.sourceAssociations = sourceAssociations;
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

        public GenericProtectedItemResponse build() {
            return new GenericProtectedItemResponse(backupManagementType, backupSetName, containerName, createMode, deferredDeleteTimeInUTC, deferredDeleteTimeRemaining, fabricName, friendlyName, isDeferredDeleteScheduleUpcoming, isRehydrate, isScheduledForDeferredDelete, lastRecoveryPoint, policyId, policyState, protectedItemId, protectedItemType, protectionState, sourceAssociations, sourceResourceId, workloadType);
        }
    }
}
