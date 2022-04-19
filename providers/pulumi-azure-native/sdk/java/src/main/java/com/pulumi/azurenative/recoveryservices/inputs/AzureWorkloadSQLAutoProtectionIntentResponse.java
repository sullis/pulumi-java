// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure Workload SQL Auto Protection intent item.
 * 
 */
public final class AzureWorkloadSQLAutoProtectionIntentResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureWorkloadSQLAutoProtectionIntentResponse Empty = new AzureWorkloadSQLAutoProtectionIntentResponse();

    /**
     * Type of backup management for the backed up item.
     * 
     */
    @Import(name="backupManagementType")
      private final @Nullable String backupManagementType;

    public Optional<String> backupManagementType() {
        return this.backupManagementType == null ? Optional.empty() : Optional.ofNullable(this.backupManagementType);
    }

    /**
     * ID of the item which is getting protected, In case of Azure Vm , it is ProtectedItemId
     * 
     */
    @Import(name="itemId")
      private final @Nullable String itemId;

    public Optional<String> itemId() {
        return this.itemId == null ? Optional.empty() : Optional.ofNullable(this.itemId);
    }

    /**
     * ID of the backup policy with which this item is backed up.
     * 
     */
    @Import(name="policyId")
      private final @Nullable String policyId;

    public Optional<String> policyId() {
        return this.policyId == null ? Optional.empty() : Optional.ofNullable(this.policyId);
    }

    /**
     * backup protectionIntent type.
     * Expected value is 'AzureWorkloadSQLAutoProtectionIntent'.
     * 
     */
    @Import(name="protectionIntentItemType", required=true)
      private final String protectionIntentItemType;

    public String protectionIntentItemType() {
        return this.protectionIntentItemType;
    }

    /**
     * Backup state of this backup item.
     * 
     */
    @Import(name="protectionState")
      private final @Nullable String protectionState;

    public Optional<String> protectionState() {
        return this.protectionState == null ? Optional.empty() : Optional.ofNullable(this.protectionState);
    }

    /**
     * ARM ID of the resource to be backed up.
     * 
     */
    @Import(name="sourceResourceId")
      private final @Nullable String sourceResourceId;

    public Optional<String> sourceResourceId() {
        return this.sourceResourceId == null ? Optional.empty() : Optional.ofNullable(this.sourceResourceId);
    }

    /**
     * Workload item type of the item for which intent is to be set
     * 
     */
    @Import(name="workloadItemType")
      private final @Nullable String workloadItemType;

    public Optional<String> workloadItemType() {
        return this.workloadItemType == null ? Optional.empty() : Optional.ofNullable(this.workloadItemType);
    }

    public AzureWorkloadSQLAutoProtectionIntentResponse(
        @Nullable String backupManagementType,
        @Nullable String itemId,
        @Nullable String policyId,
        String protectionIntentItemType,
        @Nullable String protectionState,
        @Nullable String sourceResourceId,
        @Nullable String workloadItemType) {
        this.backupManagementType = backupManagementType;
        this.itemId = itemId;
        this.policyId = policyId;
        this.protectionIntentItemType = Codegen.stringProp("protectionIntentItemType").arg(protectionIntentItemType).require();
        this.protectionState = protectionState;
        this.sourceResourceId = sourceResourceId;
        this.workloadItemType = workloadItemType;
    }

    private AzureWorkloadSQLAutoProtectionIntentResponse() {
        this.backupManagementType = null;
        this.itemId = null;
        this.policyId = null;
        this.protectionIntentItemType = null;
        this.protectionState = null;
        this.sourceResourceId = null;
        this.workloadItemType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureWorkloadSQLAutoProtectionIntentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private @Nullable String itemId;
        private @Nullable String policyId;
        private String protectionIntentItemType;
        private @Nullable String protectionState;
        private @Nullable String sourceResourceId;
        private @Nullable String workloadItemType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureWorkloadSQLAutoProtectionIntentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.itemId = defaults.itemId;
    	      this.policyId = defaults.policyId;
    	      this.protectionIntentItemType = defaults.protectionIntentItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.workloadItemType = defaults.workloadItemType;
        }

        public Builder backupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }
        public Builder itemId(@Nullable String itemId) {
            this.itemId = itemId;
            return this;
        }
        public Builder policyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }
        public Builder protectionIntentItemType(String protectionIntentItemType) {
            this.protectionIntentItemType = Objects.requireNonNull(protectionIntentItemType);
            return this;
        }
        public Builder protectionState(@Nullable String protectionState) {
            this.protectionState = protectionState;
            return this;
        }
        public Builder sourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }
        public Builder workloadItemType(@Nullable String workloadItemType) {
            this.workloadItemType = workloadItemType;
            return this;
        }        public AzureWorkloadSQLAutoProtectionIntentResponse build() {
            return new AzureWorkloadSQLAutoProtectionIntentResponse(backupManagementType, itemId, policyId, protectionIntentItemType, protectionState, sourceResourceId, workloadItemType);
        }
    }
}
