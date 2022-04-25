// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.azurenative.recoveryservices.outputs.HealthErrorResponse;
import com.pulumi.azurenative.recoveryservices.outputs.InMageAgentDetailsResponse;
import com.pulumi.azurenative.recoveryservices.outputs.InMageProtectedDiskDetailsResponse;
import com.pulumi.azurenative.recoveryservices.outputs.InitialReplicationDetailsResponse;
import com.pulumi.azurenative.recoveryservices.outputs.OSDiskDetailsResponse;
import com.pulumi.azurenative.recoveryservices.outputs.VMNicDetailsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InMageReplicationDetailsResponse {
    /**
     * @return The active location of the VM. If the VM is being protected from Azure, this field will take values from { Azure, OnPrem }. If the VM is being protected between two data-centers, this field will be OnPrem always.
     * 
     */
    private final @Nullable String activeSiteType;
    /**
     * @return The agent details.
     * 
     */
    private final @Nullable InMageAgentDetailsResponse agentDetails;
    /**
     * @return A value indicating the underlying Azure storage account. If the VM is not running in Azure, this value shall be set to null.
     * 
     */
    private final @Nullable String azureStorageAccountId;
    /**
     * @return The compressed data change rate in MB.
     * 
     */
    private final @Nullable Double compressedDataRateInMB;
    /**
     * @return The collection of Consistency points.
     * 
     */
    private final @Nullable Map<String,String> consistencyPoints;
    /**
     * @return The data stores of the on-premise machine Value can be list of strings that contain data store names
     * 
     */
    private final @Nullable List<String> datastores;
    /**
     * @return A value indicating the discovery type of the machine.
     * 
     */
    private final @Nullable String discoveryType;
    /**
     * @return A value indicating whether any disk is resized for this VM.
     * 
     */
    private final @Nullable String diskResized;
    /**
     * @return The infrastructure VM Id.
     * 
     */
    private final @Nullable String infrastructureVmId;
    /**
     * @return Gets the Instance type.
     * Expected value is &#39;InMage&#39;.
     * 
     */
    private final String instanceType;
    /**
     * @return The source IP address.
     * 
     */
    private final @Nullable String ipAddress;
    /**
     * @return The last heartbeat received from the source server.
     * 
     */
    private final @Nullable String lastHeartbeat;
    /**
     * @return The last RPO calculated time.
     * 
     */
    private final @Nullable String lastRpoCalculatedTime;
    /**
     * @return The last update time received from on-prem components.
     * 
     */
    private final @Nullable String lastUpdateReceivedTime;
    /**
     * @return The master target Id.
     * 
     */
    private final @Nullable String masterTargetId;
    /**
     * @return The multi vm group Id, if any.
     * 
     */
    private final @Nullable String multiVmGroupId;
    /**
     * @return The multi vm group name, if any.
     * 
     */
    private final @Nullable String multiVmGroupName;
    /**
     * @return A value indicating whether the multi vm sync is enabled or disabled.
     * 
     */
    private final @Nullable String multiVmSyncStatus;
    /**
     * @return The OS details.
     * 
     */
    private final @Nullable OSDiskDetailsResponse osDetails;
    /**
     * @return The OS Version of the protected item.
     * 
     */
    private final @Nullable String osVersion;
    /**
     * @return The process server Id.
     * 
     */
    private final @Nullable String processServerId;
    /**
     * @return The list of protected disks.
     * 
     */
    private final @Nullable List<InMageProtectedDiskDetailsResponse> protectedDisks;
    /**
     * @return The protection stage.
     * 
     */
    private final @Nullable String protectionStage;
    /**
     * @return A value indicating whether the source server requires a restart after update.
     * 
     */
    private final @Nullable String rebootAfterUpdateStatus;
    /**
     * @return The replica id of the protected item.
     * 
     */
    private final @Nullable String replicaId;
    /**
     * @return The resync details of the machine
     * 
     */
    private final @Nullable InitialReplicationDetailsResponse resyncDetails;
    /**
     * @return The retention window end time.
     * 
     */
    private final @Nullable String retentionWindowEnd;
    /**
     * @return The retention window start time.
     * 
     */
    private final @Nullable String retentionWindowStart;
    /**
     * @return The RPO in seconds.
     * 
     */
    private final @Nullable Double rpoInSeconds;
    /**
     * @return The CPU count of the VM on the primary side.
     * 
     */
    private final @Nullable Integer sourceVmCpuCount;
    /**
     * @return The RAM size of the VM on the primary side.
     * 
     */
    private final @Nullable Integer sourceVmRamSizeInMB;
    /**
     * @return The uncompressed data change rate in MB.
     * 
     */
    private final @Nullable Double uncompressedDataRateInMB;
    /**
     * @return The vCenter infrastructure Id.
     * 
     */
    private final @Nullable String vCenterInfrastructureId;
    /**
     * @return The validation errors of the on-premise machine Value can be list of validation errors
     * 
     */
    private final @Nullable List<HealthErrorResponse> validationErrors;
    /**
     * @return The virtual machine Id.
     * 
     */
    private final @Nullable String vmId;
    /**
     * @return The PE Network details.
     * 
     */
    private final @Nullable List<VMNicDetailsResponse> vmNics;
    /**
     * @return The protection state for the vm.
     * 
     */
    private final @Nullable String vmProtectionState;
    /**
     * @return The protection state description for the vm.
     * 
     */
    private final @Nullable String vmProtectionStateDescription;

    @CustomType.Constructor
    private InMageReplicationDetailsResponse(
        @CustomType.Parameter("activeSiteType") @Nullable String activeSiteType,
        @CustomType.Parameter("agentDetails") @Nullable InMageAgentDetailsResponse agentDetails,
        @CustomType.Parameter("azureStorageAccountId") @Nullable String azureStorageAccountId,
        @CustomType.Parameter("compressedDataRateInMB") @Nullable Double compressedDataRateInMB,
        @CustomType.Parameter("consistencyPoints") @Nullable Map<String,String> consistencyPoints,
        @CustomType.Parameter("datastores") @Nullable List<String> datastores,
        @CustomType.Parameter("discoveryType") @Nullable String discoveryType,
        @CustomType.Parameter("diskResized") @Nullable String diskResized,
        @CustomType.Parameter("infrastructureVmId") @Nullable String infrastructureVmId,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("ipAddress") @Nullable String ipAddress,
        @CustomType.Parameter("lastHeartbeat") @Nullable String lastHeartbeat,
        @CustomType.Parameter("lastRpoCalculatedTime") @Nullable String lastRpoCalculatedTime,
        @CustomType.Parameter("lastUpdateReceivedTime") @Nullable String lastUpdateReceivedTime,
        @CustomType.Parameter("masterTargetId") @Nullable String masterTargetId,
        @CustomType.Parameter("multiVmGroupId") @Nullable String multiVmGroupId,
        @CustomType.Parameter("multiVmGroupName") @Nullable String multiVmGroupName,
        @CustomType.Parameter("multiVmSyncStatus") @Nullable String multiVmSyncStatus,
        @CustomType.Parameter("osDetails") @Nullable OSDiskDetailsResponse osDetails,
        @CustomType.Parameter("osVersion") @Nullable String osVersion,
        @CustomType.Parameter("processServerId") @Nullable String processServerId,
        @CustomType.Parameter("protectedDisks") @Nullable List<InMageProtectedDiskDetailsResponse> protectedDisks,
        @CustomType.Parameter("protectionStage") @Nullable String protectionStage,
        @CustomType.Parameter("rebootAfterUpdateStatus") @Nullable String rebootAfterUpdateStatus,
        @CustomType.Parameter("replicaId") @Nullable String replicaId,
        @CustomType.Parameter("resyncDetails") @Nullable InitialReplicationDetailsResponse resyncDetails,
        @CustomType.Parameter("retentionWindowEnd") @Nullable String retentionWindowEnd,
        @CustomType.Parameter("retentionWindowStart") @Nullable String retentionWindowStart,
        @CustomType.Parameter("rpoInSeconds") @Nullable Double rpoInSeconds,
        @CustomType.Parameter("sourceVmCpuCount") @Nullable Integer sourceVmCpuCount,
        @CustomType.Parameter("sourceVmRamSizeInMB") @Nullable Integer sourceVmRamSizeInMB,
        @CustomType.Parameter("uncompressedDataRateInMB") @Nullable Double uncompressedDataRateInMB,
        @CustomType.Parameter("vCenterInfrastructureId") @Nullable String vCenterInfrastructureId,
        @CustomType.Parameter("validationErrors") @Nullable List<HealthErrorResponse> validationErrors,
        @CustomType.Parameter("vmId") @Nullable String vmId,
        @CustomType.Parameter("vmNics") @Nullable List<VMNicDetailsResponse> vmNics,
        @CustomType.Parameter("vmProtectionState") @Nullable String vmProtectionState,
        @CustomType.Parameter("vmProtectionStateDescription") @Nullable String vmProtectionStateDescription) {
        this.activeSiteType = activeSiteType;
        this.agentDetails = agentDetails;
        this.azureStorageAccountId = azureStorageAccountId;
        this.compressedDataRateInMB = compressedDataRateInMB;
        this.consistencyPoints = consistencyPoints;
        this.datastores = datastores;
        this.discoveryType = discoveryType;
        this.diskResized = diskResized;
        this.infrastructureVmId = infrastructureVmId;
        this.instanceType = instanceType;
        this.ipAddress = ipAddress;
        this.lastHeartbeat = lastHeartbeat;
        this.lastRpoCalculatedTime = lastRpoCalculatedTime;
        this.lastUpdateReceivedTime = lastUpdateReceivedTime;
        this.masterTargetId = masterTargetId;
        this.multiVmGroupId = multiVmGroupId;
        this.multiVmGroupName = multiVmGroupName;
        this.multiVmSyncStatus = multiVmSyncStatus;
        this.osDetails = osDetails;
        this.osVersion = osVersion;
        this.processServerId = processServerId;
        this.protectedDisks = protectedDisks;
        this.protectionStage = protectionStage;
        this.rebootAfterUpdateStatus = rebootAfterUpdateStatus;
        this.replicaId = replicaId;
        this.resyncDetails = resyncDetails;
        this.retentionWindowEnd = retentionWindowEnd;
        this.retentionWindowStart = retentionWindowStart;
        this.rpoInSeconds = rpoInSeconds;
        this.sourceVmCpuCount = sourceVmCpuCount;
        this.sourceVmRamSizeInMB = sourceVmRamSizeInMB;
        this.uncompressedDataRateInMB = uncompressedDataRateInMB;
        this.vCenterInfrastructureId = vCenterInfrastructureId;
        this.validationErrors = validationErrors;
        this.vmId = vmId;
        this.vmNics = vmNics;
        this.vmProtectionState = vmProtectionState;
        this.vmProtectionStateDescription = vmProtectionStateDescription;
    }

    /**
     * @return The active location of the VM. If the VM is being protected from Azure, this field will take values from { Azure, OnPrem }. If the VM is being protected between two data-centers, this field will be OnPrem always.
     * 
     */
    public Optional<String> activeSiteType() {
        return Optional.ofNullable(this.activeSiteType);
    }
    /**
     * @return The agent details.
     * 
     */
    public Optional<InMageAgentDetailsResponse> agentDetails() {
        return Optional.ofNullable(this.agentDetails);
    }
    /**
     * @return A value indicating the underlying Azure storage account. If the VM is not running in Azure, this value shall be set to null.
     * 
     */
    public Optional<String> azureStorageAccountId() {
        return Optional.ofNullable(this.azureStorageAccountId);
    }
    /**
     * @return The compressed data change rate in MB.
     * 
     */
    public Optional<Double> compressedDataRateInMB() {
        return Optional.ofNullable(this.compressedDataRateInMB);
    }
    /**
     * @return The collection of Consistency points.
     * 
     */
    public Map<String,String> consistencyPoints() {
        return this.consistencyPoints == null ? Map.of() : this.consistencyPoints;
    }
    /**
     * @return The data stores of the on-premise machine Value can be list of strings that contain data store names
     * 
     */
    public List<String> datastores() {
        return this.datastores == null ? List.of() : this.datastores;
    }
    /**
     * @return A value indicating the discovery type of the machine.
     * 
     */
    public Optional<String> discoveryType() {
        return Optional.ofNullable(this.discoveryType);
    }
    /**
     * @return A value indicating whether any disk is resized for this VM.
     * 
     */
    public Optional<String> diskResized() {
        return Optional.ofNullable(this.diskResized);
    }
    /**
     * @return The infrastructure VM Id.
     * 
     */
    public Optional<String> infrastructureVmId() {
        return Optional.ofNullable(this.infrastructureVmId);
    }
    /**
     * @return Gets the Instance type.
     * Expected value is &#39;InMage&#39;.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return The source IP address.
     * 
     */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * @return The last heartbeat received from the source server.
     * 
     */
    public Optional<String> lastHeartbeat() {
        return Optional.ofNullable(this.lastHeartbeat);
    }
    /**
     * @return The last RPO calculated time.
     * 
     */
    public Optional<String> lastRpoCalculatedTime() {
        return Optional.ofNullable(this.lastRpoCalculatedTime);
    }
    /**
     * @return The last update time received from on-prem components.
     * 
     */
    public Optional<String> lastUpdateReceivedTime() {
        return Optional.ofNullable(this.lastUpdateReceivedTime);
    }
    /**
     * @return The master target Id.
     * 
     */
    public Optional<String> masterTargetId() {
        return Optional.ofNullable(this.masterTargetId);
    }
    /**
     * @return The multi vm group Id, if any.
     * 
     */
    public Optional<String> multiVmGroupId() {
        return Optional.ofNullable(this.multiVmGroupId);
    }
    /**
     * @return The multi vm group name, if any.
     * 
     */
    public Optional<String> multiVmGroupName() {
        return Optional.ofNullable(this.multiVmGroupName);
    }
    /**
     * @return A value indicating whether the multi vm sync is enabled or disabled.
     * 
     */
    public Optional<String> multiVmSyncStatus() {
        return Optional.ofNullable(this.multiVmSyncStatus);
    }
    /**
     * @return The OS details.
     * 
     */
    public Optional<OSDiskDetailsResponse> osDetails() {
        return Optional.ofNullable(this.osDetails);
    }
    /**
     * @return The OS Version of the protected item.
     * 
     */
    public Optional<String> osVersion() {
        return Optional.ofNullable(this.osVersion);
    }
    /**
     * @return The process server Id.
     * 
     */
    public Optional<String> processServerId() {
        return Optional.ofNullable(this.processServerId);
    }
    /**
     * @return The list of protected disks.
     * 
     */
    public List<InMageProtectedDiskDetailsResponse> protectedDisks() {
        return this.protectedDisks == null ? List.of() : this.protectedDisks;
    }
    /**
     * @return The protection stage.
     * 
     */
    public Optional<String> protectionStage() {
        return Optional.ofNullable(this.protectionStage);
    }
    /**
     * @return A value indicating whether the source server requires a restart after update.
     * 
     */
    public Optional<String> rebootAfterUpdateStatus() {
        return Optional.ofNullable(this.rebootAfterUpdateStatus);
    }
    /**
     * @return The replica id of the protected item.
     * 
     */
    public Optional<String> replicaId() {
        return Optional.ofNullable(this.replicaId);
    }
    /**
     * @return The resync details of the machine
     * 
     */
    public Optional<InitialReplicationDetailsResponse> resyncDetails() {
        return Optional.ofNullable(this.resyncDetails);
    }
    /**
     * @return The retention window end time.
     * 
     */
    public Optional<String> retentionWindowEnd() {
        return Optional.ofNullable(this.retentionWindowEnd);
    }
    /**
     * @return The retention window start time.
     * 
     */
    public Optional<String> retentionWindowStart() {
        return Optional.ofNullable(this.retentionWindowStart);
    }
    /**
     * @return The RPO in seconds.
     * 
     */
    public Optional<Double> rpoInSeconds() {
        return Optional.ofNullable(this.rpoInSeconds);
    }
    /**
     * @return The CPU count of the VM on the primary side.
     * 
     */
    public Optional<Integer> sourceVmCpuCount() {
        return Optional.ofNullable(this.sourceVmCpuCount);
    }
    /**
     * @return The RAM size of the VM on the primary side.
     * 
     */
    public Optional<Integer> sourceVmRamSizeInMB() {
        return Optional.ofNullable(this.sourceVmRamSizeInMB);
    }
    /**
     * @return The uncompressed data change rate in MB.
     * 
     */
    public Optional<Double> uncompressedDataRateInMB() {
        return Optional.ofNullable(this.uncompressedDataRateInMB);
    }
    /**
     * @return The vCenter infrastructure Id.
     * 
     */
    public Optional<String> vCenterInfrastructureId() {
        return Optional.ofNullable(this.vCenterInfrastructureId);
    }
    /**
     * @return The validation errors of the on-premise machine Value can be list of validation errors
     * 
     */
    public List<HealthErrorResponse> validationErrors() {
        return this.validationErrors == null ? List.of() : this.validationErrors;
    }
    /**
     * @return The virtual machine Id.
     * 
     */
    public Optional<String> vmId() {
        return Optional.ofNullable(this.vmId);
    }
    /**
     * @return The PE Network details.
     * 
     */
    public List<VMNicDetailsResponse> vmNics() {
        return this.vmNics == null ? List.of() : this.vmNics;
    }
    /**
     * @return The protection state for the vm.
     * 
     */
    public Optional<String> vmProtectionState() {
        return Optional.ofNullable(this.vmProtectionState);
    }
    /**
     * @return The protection state description for the vm.
     * 
     */
    public Optional<String> vmProtectionStateDescription() {
        return Optional.ofNullable(this.vmProtectionStateDescription);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageReplicationDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String activeSiteType;
        private @Nullable InMageAgentDetailsResponse agentDetails;
        private @Nullable String azureStorageAccountId;
        private @Nullable Double compressedDataRateInMB;
        private @Nullable Map<String,String> consistencyPoints;
        private @Nullable List<String> datastores;
        private @Nullable String discoveryType;
        private @Nullable String diskResized;
        private @Nullable String infrastructureVmId;
        private String instanceType;
        private @Nullable String ipAddress;
        private @Nullable String lastHeartbeat;
        private @Nullable String lastRpoCalculatedTime;
        private @Nullable String lastUpdateReceivedTime;
        private @Nullable String masterTargetId;
        private @Nullable String multiVmGroupId;
        private @Nullable String multiVmGroupName;
        private @Nullable String multiVmSyncStatus;
        private @Nullable OSDiskDetailsResponse osDetails;
        private @Nullable String osVersion;
        private @Nullable String processServerId;
        private @Nullable List<InMageProtectedDiskDetailsResponse> protectedDisks;
        private @Nullable String protectionStage;
        private @Nullable String rebootAfterUpdateStatus;
        private @Nullable String replicaId;
        private @Nullable InitialReplicationDetailsResponse resyncDetails;
        private @Nullable String retentionWindowEnd;
        private @Nullable String retentionWindowStart;
        private @Nullable Double rpoInSeconds;
        private @Nullable Integer sourceVmCpuCount;
        private @Nullable Integer sourceVmRamSizeInMB;
        private @Nullable Double uncompressedDataRateInMB;
        private @Nullable String vCenterInfrastructureId;
        private @Nullable List<HealthErrorResponse> validationErrors;
        private @Nullable String vmId;
        private @Nullable List<VMNicDetailsResponse> vmNics;
        private @Nullable String vmProtectionState;
        private @Nullable String vmProtectionStateDescription;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageReplicationDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeSiteType = defaults.activeSiteType;
    	      this.agentDetails = defaults.agentDetails;
    	      this.azureStorageAccountId = defaults.azureStorageAccountId;
    	      this.compressedDataRateInMB = defaults.compressedDataRateInMB;
    	      this.consistencyPoints = defaults.consistencyPoints;
    	      this.datastores = defaults.datastores;
    	      this.discoveryType = defaults.discoveryType;
    	      this.diskResized = defaults.diskResized;
    	      this.infrastructureVmId = defaults.infrastructureVmId;
    	      this.instanceType = defaults.instanceType;
    	      this.ipAddress = defaults.ipAddress;
    	      this.lastHeartbeat = defaults.lastHeartbeat;
    	      this.lastRpoCalculatedTime = defaults.lastRpoCalculatedTime;
    	      this.lastUpdateReceivedTime = defaults.lastUpdateReceivedTime;
    	      this.masterTargetId = defaults.masterTargetId;
    	      this.multiVmGroupId = defaults.multiVmGroupId;
    	      this.multiVmGroupName = defaults.multiVmGroupName;
    	      this.multiVmSyncStatus = defaults.multiVmSyncStatus;
    	      this.osDetails = defaults.osDetails;
    	      this.osVersion = defaults.osVersion;
    	      this.processServerId = defaults.processServerId;
    	      this.protectedDisks = defaults.protectedDisks;
    	      this.protectionStage = defaults.protectionStage;
    	      this.rebootAfterUpdateStatus = defaults.rebootAfterUpdateStatus;
    	      this.replicaId = defaults.replicaId;
    	      this.resyncDetails = defaults.resyncDetails;
    	      this.retentionWindowEnd = defaults.retentionWindowEnd;
    	      this.retentionWindowStart = defaults.retentionWindowStart;
    	      this.rpoInSeconds = defaults.rpoInSeconds;
    	      this.sourceVmCpuCount = defaults.sourceVmCpuCount;
    	      this.sourceVmRamSizeInMB = defaults.sourceVmRamSizeInMB;
    	      this.uncompressedDataRateInMB = defaults.uncompressedDataRateInMB;
    	      this.vCenterInfrastructureId = defaults.vCenterInfrastructureId;
    	      this.validationErrors = defaults.validationErrors;
    	      this.vmId = defaults.vmId;
    	      this.vmNics = defaults.vmNics;
    	      this.vmProtectionState = defaults.vmProtectionState;
    	      this.vmProtectionStateDescription = defaults.vmProtectionStateDescription;
        }

        public Builder activeSiteType(@Nullable String activeSiteType) {
            this.activeSiteType = activeSiteType;
            return this;
        }
        public Builder agentDetails(@Nullable InMageAgentDetailsResponse agentDetails) {
            this.agentDetails = agentDetails;
            return this;
        }
        public Builder azureStorageAccountId(@Nullable String azureStorageAccountId) {
            this.azureStorageAccountId = azureStorageAccountId;
            return this;
        }
        public Builder compressedDataRateInMB(@Nullable Double compressedDataRateInMB) {
            this.compressedDataRateInMB = compressedDataRateInMB;
            return this;
        }
        public Builder consistencyPoints(@Nullable Map<String,String> consistencyPoints) {
            this.consistencyPoints = consistencyPoints;
            return this;
        }
        public Builder datastores(@Nullable List<String> datastores) {
            this.datastores = datastores;
            return this;
        }
        public Builder datastores(String... datastores) {
            return datastores(List.of(datastores));
        }
        public Builder discoveryType(@Nullable String discoveryType) {
            this.discoveryType = discoveryType;
            return this;
        }
        public Builder diskResized(@Nullable String diskResized) {
            this.diskResized = diskResized;
            return this;
        }
        public Builder infrastructureVmId(@Nullable String infrastructureVmId) {
            this.infrastructureVmId = infrastructureVmId;
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder lastHeartbeat(@Nullable String lastHeartbeat) {
            this.lastHeartbeat = lastHeartbeat;
            return this;
        }
        public Builder lastRpoCalculatedTime(@Nullable String lastRpoCalculatedTime) {
            this.lastRpoCalculatedTime = lastRpoCalculatedTime;
            return this;
        }
        public Builder lastUpdateReceivedTime(@Nullable String lastUpdateReceivedTime) {
            this.lastUpdateReceivedTime = lastUpdateReceivedTime;
            return this;
        }
        public Builder masterTargetId(@Nullable String masterTargetId) {
            this.masterTargetId = masterTargetId;
            return this;
        }
        public Builder multiVmGroupId(@Nullable String multiVmGroupId) {
            this.multiVmGroupId = multiVmGroupId;
            return this;
        }
        public Builder multiVmGroupName(@Nullable String multiVmGroupName) {
            this.multiVmGroupName = multiVmGroupName;
            return this;
        }
        public Builder multiVmSyncStatus(@Nullable String multiVmSyncStatus) {
            this.multiVmSyncStatus = multiVmSyncStatus;
            return this;
        }
        public Builder osDetails(@Nullable OSDiskDetailsResponse osDetails) {
            this.osDetails = osDetails;
            return this;
        }
        public Builder osVersion(@Nullable String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public Builder processServerId(@Nullable String processServerId) {
            this.processServerId = processServerId;
            return this;
        }
        public Builder protectedDisks(@Nullable List<InMageProtectedDiskDetailsResponse> protectedDisks) {
            this.protectedDisks = protectedDisks;
            return this;
        }
        public Builder protectedDisks(InMageProtectedDiskDetailsResponse... protectedDisks) {
            return protectedDisks(List.of(protectedDisks));
        }
        public Builder protectionStage(@Nullable String protectionStage) {
            this.protectionStage = protectionStage;
            return this;
        }
        public Builder rebootAfterUpdateStatus(@Nullable String rebootAfterUpdateStatus) {
            this.rebootAfterUpdateStatus = rebootAfterUpdateStatus;
            return this;
        }
        public Builder replicaId(@Nullable String replicaId) {
            this.replicaId = replicaId;
            return this;
        }
        public Builder resyncDetails(@Nullable InitialReplicationDetailsResponse resyncDetails) {
            this.resyncDetails = resyncDetails;
            return this;
        }
        public Builder retentionWindowEnd(@Nullable String retentionWindowEnd) {
            this.retentionWindowEnd = retentionWindowEnd;
            return this;
        }
        public Builder retentionWindowStart(@Nullable String retentionWindowStart) {
            this.retentionWindowStart = retentionWindowStart;
            return this;
        }
        public Builder rpoInSeconds(@Nullable Double rpoInSeconds) {
            this.rpoInSeconds = rpoInSeconds;
            return this;
        }
        public Builder sourceVmCpuCount(@Nullable Integer sourceVmCpuCount) {
            this.sourceVmCpuCount = sourceVmCpuCount;
            return this;
        }
        public Builder sourceVmRamSizeInMB(@Nullable Integer sourceVmRamSizeInMB) {
            this.sourceVmRamSizeInMB = sourceVmRamSizeInMB;
            return this;
        }
        public Builder uncompressedDataRateInMB(@Nullable Double uncompressedDataRateInMB) {
            this.uncompressedDataRateInMB = uncompressedDataRateInMB;
            return this;
        }
        public Builder vCenterInfrastructureId(@Nullable String vCenterInfrastructureId) {
            this.vCenterInfrastructureId = vCenterInfrastructureId;
            return this;
        }
        public Builder validationErrors(@Nullable List<HealthErrorResponse> validationErrors) {
            this.validationErrors = validationErrors;
            return this;
        }
        public Builder validationErrors(HealthErrorResponse... validationErrors) {
            return validationErrors(List.of(validationErrors));
        }
        public Builder vmId(@Nullable String vmId) {
            this.vmId = vmId;
            return this;
        }
        public Builder vmNics(@Nullable List<VMNicDetailsResponse> vmNics) {
            this.vmNics = vmNics;
            return this;
        }
        public Builder vmNics(VMNicDetailsResponse... vmNics) {
            return vmNics(List.of(vmNics));
        }
        public Builder vmProtectionState(@Nullable String vmProtectionState) {
            this.vmProtectionState = vmProtectionState;
            return this;
        }
        public Builder vmProtectionStateDescription(@Nullable String vmProtectionStateDescription) {
            this.vmProtectionStateDescription = vmProtectionStateDescription;
            return this;
        }        public InMageReplicationDetailsResponse build() {
            return new InMageReplicationDetailsResponse(activeSiteType, agentDetails, azureStorageAccountId, compressedDataRateInMB, consistencyPoints, datastores, discoveryType, diskResized, infrastructureVmId, instanceType, ipAddress, lastHeartbeat, lastRpoCalculatedTime, lastUpdateReceivedTime, masterTargetId, multiVmGroupId, multiVmGroupName, multiVmSyncStatus, osDetails, osVersion, processServerId, protectedDisks, protectionStage, rebootAfterUpdateStatus, replicaId, resyncDetails, retentionWindowEnd, retentionWindowStart, rpoInSeconds, sourceVmCpuCount, sourceVmRamSizeInMB, uncompressedDataRateInMB, vCenterInfrastructureId, validationErrors, vmId, vmNics, vmProtectionState, vmProtectionStateDescription);
        }
    }
}
