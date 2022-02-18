// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import io.pulumi.azurenative.recoveryservices.enums.ProtectionStatus;
import io.pulumi.azurenative.recoveryservices.enums.WorkloadItemType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure Workload SQL Auto Protection intent item.
 * 
 */
public final class AzureWorkloadSQLAutoProtectionIntentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureWorkloadSQLAutoProtectionIntentArgs Empty = new AzureWorkloadSQLAutoProtectionIntentArgs();

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
     * ID of the item which is getting protected, In case of Azure Vm , it is ProtectedItemId
     * 
     */
    @InputImport(name="itemId")
    private final @Nullable Input<String> itemId;

    public Input<String> getItemId() {
        return this.itemId == null ? Input.empty() : this.itemId;
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
     * backup protectionIntent type.
     * Expected value is 'AzureWorkloadSQLAutoProtectionIntent'.
     * 
     */
    @InputImport(name="protectionIntentItemType", required=true)
    private final Input<String> protectionIntentItemType;

    public Input<String> getProtectionIntentItemType() {
        return this.protectionIntentItemType;
    }

    /**
     * Backup state of this backup item.
     * 
     */
    @InputImport(name="protectionState")
    private final @Nullable Input<Either<String,ProtectionStatus>> protectionState;

    public Input<Either<String,ProtectionStatus>> getProtectionState() {
        return this.protectionState == null ? Input.empty() : this.protectionState;
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
     * Workload item type of the item for which intent is to be set
     * 
     */
    @InputImport(name="workloadItemType")
    private final @Nullable Input<Either<String,WorkloadItemType>> workloadItemType;

    public Input<Either<String,WorkloadItemType>> getWorkloadItemType() {
        return this.workloadItemType == null ? Input.empty() : this.workloadItemType;
    }

    public AzureWorkloadSQLAutoProtectionIntentArgs(
        @Nullable Input<Either<String,BackupManagementType>> backupManagementType,
        @Nullable Input<String> itemId,
        @Nullable Input<String> policyId,
        Input<String> protectionIntentItemType,
        @Nullable Input<Either<String,ProtectionStatus>> protectionState,
        @Nullable Input<String> sourceResourceId,
        @Nullable Input<Either<String,WorkloadItemType>> workloadItemType) {
        this.backupManagementType = backupManagementType;
        this.itemId = itemId;
        this.policyId = policyId;
        this.protectionIntentItemType = Objects.requireNonNull(protectionIntentItemType, "expected parameter 'protectionIntentItemType' to be non-null");
        this.protectionState = protectionState;
        this.sourceResourceId = sourceResourceId;
        this.workloadItemType = workloadItemType;
    }

    private AzureWorkloadSQLAutoProtectionIntentArgs() {
        this.backupManagementType = Input.empty();
        this.itemId = Input.empty();
        this.policyId = Input.empty();
        this.protectionIntentItemType = Input.empty();
        this.protectionState = Input.empty();
        this.sourceResourceId = Input.empty();
        this.workloadItemType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureWorkloadSQLAutoProtectionIntentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,BackupManagementType>> backupManagementType;
        private @Nullable Input<String> itemId;
        private @Nullable Input<String> policyId;
        private Input<String> protectionIntentItemType;
        private @Nullable Input<Either<String,ProtectionStatus>> protectionState;
        private @Nullable Input<String> sourceResourceId;
        private @Nullable Input<Either<String,WorkloadItemType>> workloadItemType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureWorkloadSQLAutoProtectionIntentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.itemId = defaults.itemId;
    	      this.policyId = defaults.policyId;
    	      this.protectionIntentItemType = defaults.protectionIntentItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.workloadItemType = defaults.workloadItemType;
        }

        public Builder setBackupManagementType(@Nullable Input<Either<String,BackupManagementType>> backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder setBackupManagementType(@Nullable Either<String,BackupManagementType> backupManagementType) {
            this.backupManagementType = Input.ofNullable(backupManagementType);
            return this;
        }

        public Builder setItemId(@Nullable Input<String> itemId) {
            this.itemId = itemId;
            return this;
        }

        public Builder setItemId(@Nullable String itemId) {
            this.itemId = Input.ofNullable(itemId);
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

        public Builder setProtectionIntentItemType(Input<String> protectionIntentItemType) {
            this.protectionIntentItemType = Objects.requireNonNull(protectionIntentItemType);
            return this;
        }

        public Builder setProtectionIntentItemType(String protectionIntentItemType) {
            this.protectionIntentItemType = Input.of(Objects.requireNonNull(protectionIntentItemType));
            return this;
        }

        public Builder setProtectionState(@Nullable Input<Either<String,ProtectionStatus>> protectionState) {
            this.protectionState = protectionState;
            return this;
        }

        public Builder setProtectionState(@Nullable Either<String,ProtectionStatus> protectionState) {
            this.protectionState = Input.ofNullable(protectionState);
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

        public Builder setWorkloadItemType(@Nullable Input<Either<String,WorkloadItemType>> workloadItemType) {
            this.workloadItemType = workloadItemType;
            return this;
        }

        public Builder setWorkloadItemType(@Nullable Either<String,WorkloadItemType> workloadItemType) {
            this.workloadItemType = Input.ofNullable(workloadItemType);
            return this;
        }

        public AzureWorkloadSQLAutoProtectionIntentArgs build() {
            return new AzureWorkloadSQLAutoProtectionIntentArgs(backupManagementType, itemId, policyId, protectionIntentItemType, protectionState, sourceResourceId, workloadItemType);
        }
    }
}
