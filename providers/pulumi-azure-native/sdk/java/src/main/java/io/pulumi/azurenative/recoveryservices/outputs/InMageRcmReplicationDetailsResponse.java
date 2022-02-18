// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.InMageRcmAgentUpgradeBlockingErrorDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.InMageRcmLastAgentUpgradeErrorDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.InMageRcmMobilityAgentDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.InMageRcmNicDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.InMageRcmProtectedDiskDetailsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class InMageRcmReplicationDetailsResponse {
    /**
     * The agent upgrade blocking error information.
     * 
     */
    private final List<InMageRcmAgentUpgradeBlockingErrorDetailsResponse> agentUpgradeBlockingErrorDetails;
    /**
     * The agent auto upgrade state.
     * 
     */
    private final String agentUpgradeState;
    /**
     * The allocated memory in MB.
     * 
     */
    private final Double allocatedMemoryInMB;
    /**
     * The type of the discovered VM.
     * 
     */
    private final String discoveryType;
    /**
     * The ARM Id of the discovered VM.
     * 
     */
    private final String fabricDiscoveryMachineId;
    /**
     * The recovery point Id to which the VM was failed over.
     * 
     */
    private final String failoverRecoveryPointId;
    /**
     * The firmware type.
     * 
     */
    private final String firmwareType;
    /**
     * The initial replication processed bytes. This includes sum of total bytes transferred and matched bytes on all selected disks in source VM.
     * 
     */
    private final Double initialReplicationProcessedBytes;
    /**
     * The initial replication progress percentage. This is calculated based on total bytes processed for all disks in the source VM.
     * 
     */
    private final Integer initialReplicationProgressPercentage;
    /**
     * The initial replication transferred bytes from source VM to azure for all selected disks on source VM.
     * 
     */
    private final Double initialReplicationTransferredBytes;
    /**
     * Gets the Instance type.
     * Expected value is 'InMageRcm'.
     * 
     */
    private final String instanceType;
    /**
     * The virtual machine internal identifier.
     * 
     */
    private final String internalIdentifier;
    /**
     * A value indicating whether last agent upgrade was successful or not.
     * 
     */
    private final String isLastUpgradeSuccessful;
    /**
     * The last agent upgrade error information.
     * 
     */
    private final List<InMageRcmLastAgentUpgradeErrorDetailsResponse> lastAgentUpgradeErrorDetails;
    /**
     * The last agent upgrade failed or cancelled job Id.
     * 
     */
    private final String lastAgentUpgradeFailedJobId;
    /**
     * The last agent upgrade type.
     * 
     */
    private final String lastAgentUpgradeType;
    /**
     * The last recovery point Id.
     * 
     */
    private final String lastRecoveryPointId;
    /**
     * The last recovery point received time.
     * 
     */
    private final String lastRecoveryPointReceived;
    /**
     * The last recovery point objective calculated time.
     * 
     */
    private final String lastRpoCalculatedTime;
    /**
     * The last recovery point objective value.
     * 
     */
    private final Double lastRpoInSeconds;
    /**
     * License Type of the VM to be used.
     * 
     */
    private final String licenseType;
    /**
     * The mobility agent information.
     * 
     */
    private final InMageRcmMobilityAgentDetailsResponse mobilityAgentDetails;
    /**
     * The multi VM group name.
     * 
     */
    private final String multiVmGroupName;
    /**
     * The type of the OS on the VM.
     * 
     */
    private final String osType;
    /**
     * The process server Id.
     * 
     */
    private final String processServerId;
    /**
     * The process server name.
     * 
     */
    private final String processServerName;
    /**
     * The processor core count.
     * 
     */
    private final Integer processorCoreCount;
    /**
     * The list of protected disks.
     * 
     */
    private final List<InMageRcmProtectedDiskDetailsResponse> protectedDisks;
    /**
     * The resync processed bytes. This includes sum of total bytes transferred and matched bytes on all selected disks in source VM.
     * 
     */
    private final Double resyncProcessedBytes;
    /**
     * The resync progress percentage. This is calculated based on total bytes processed for all disks in the source VM.
     * 
     */
    private final Integer resyncProgressPercentage;
    /**
     * A value indicating whether resync is required.
     * 
     */
    private final String resyncRequired;
    /**
     * The resync state.
     * 
     */
    private final String resyncState;
    /**
     * The resync transferred bytes from source VM to azure for all selected disks on source VM.
     * 
     */
    private final Double resyncTransferredBytes;
    /**
     * The run-as account Id.
     * 
     */
    private final String runAsAccountId;
    /**
     * The target availability set Id.
     * 
     */
    private final String targetAvailabilitySetId;
    /**
     * The target availability zone.
     * 
     */
    private final String targetAvailabilityZone;
    /**
     * The target boot diagnostics storage account ARM Id.
     * 
     */
    private final String targetBootDiagnosticsStorageAccountId;
    /**
     * The target generation.
     * 
     */
    private final String targetGeneration;
    /**
     * The target network Id.
     * 
     */
    private final String targetNetworkId;
    /**
     * The target proximity placement group Id.
     * 
     */
    private final String targetProximityPlacementGroupId;
    /**
     * The target resource group Id.
     * 
     */
    private final String targetResourceGroupId;
    /**
     * Target VM name.
     * 
     */
    private final String targetVmName;
    /**
     * The target VM size.
     * 
     */
    private final String targetVmSize;
    /**
     * The test network Id.
     * 
     */
    private final String testNetworkId;
    /**
     * The network details.
     * 
     */
    private final List<InMageRcmNicDetailsResponse> vmNics;

    @OutputCustomType.Constructor({"agentUpgradeBlockingErrorDetails","agentUpgradeState","allocatedMemoryInMB","discoveryType","fabricDiscoveryMachineId","failoverRecoveryPointId","firmwareType","initialReplicationProcessedBytes","initialReplicationProgressPercentage","initialReplicationTransferredBytes","instanceType","internalIdentifier","isLastUpgradeSuccessful","lastAgentUpgradeErrorDetails","lastAgentUpgradeFailedJobId","lastAgentUpgradeType","lastRecoveryPointId","lastRecoveryPointReceived","lastRpoCalculatedTime","lastRpoInSeconds","licenseType","mobilityAgentDetails","multiVmGroupName","osType","processServerId","processServerName","processorCoreCount","protectedDisks","resyncProcessedBytes","resyncProgressPercentage","resyncRequired","resyncState","resyncTransferredBytes","runAsAccountId","targetAvailabilitySetId","targetAvailabilityZone","targetBootDiagnosticsStorageAccountId","targetGeneration","targetNetworkId","targetProximityPlacementGroupId","targetResourceGroupId","targetVmName","targetVmSize","testNetworkId","vmNics"})
    private InMageRcmReplicationDetailsResponse(
        List<InMageRcmAgentUpgradeBlockingErrorDetailsResponse> agentUpgradeBlockingErrorDetails,
        String agentUpgradeState,
        Double allocatedMemoryInMB,
        String discoveryType,
        String fabricDiscoveryMachineId,
        String failoverRecoveryPointId,
        String firmwareType,
        Double initialReplicationProcessedBytes,
        Integer initialReplicationProgressPercentage,
        Double initialReplicationTransferredBytes,
        String instanceType,
        String internalIdentifier,
        String isLastUpgradeSuccessful,
        List<InMageRcmLastAgentUpgradeErrorDetailsResponse> lastAgentUpgradeErrorDetails,
        String lastAgentUpgradeFailedJobId,
        String lastAgentUpgradeType,
        String lastRecoveryPointId,
        String lastRecoveryPointReceived,
        String lastRpoCalculatedTime,
        Double lastRpoInSeconds,
        String licenseType,
        InMageRcmMobilityAgentDetailsResponse mobilityAgentDetails,
        String multiVmGroupName,
        String osType,
        String processServerId,
        String processServerName,
        Integer processorCoreCount,
        List<InMageRcmProtectedDiskDetailsResponse> protectedDisks,
        Double resyncProcessedBytes,
        Integer resyncProgressPercentage,
        String resyncRequired,
        String resyncState,
        Double resyncTransferredBytes,
        String runAsAccountId,
        String targetAvailabilitySetId,
        String targetAvailabilityZone,
        String targetBootDiagnosticsStorageAccountId,
        String targetGeneration,
        String targetNetworkId,
        String targetProximityPlacementGroupId,
        String targetResourceGroupId,
        String targetVmName,
        String targetVmSize,
        String testNetworkId,
        List<InMageRcmNicDetailsResponse> vmNics) {
        this.agentUpgradeBlockingErrorDetails = Objects.requireNonNull(agentUpgradeBlockingErrorDetails);
        this.agentUpgradeState = Objects.requireNonNull(agentUpgradeState);
        this.allocatedMemoryInMB = Objects.requireNonNull(allocatedMemoryInMB);
        this.discoveryType = Objects.requireNonNull(discoveryType);
        this.fabricDiscoveryMachineId = Objects.requireNonNull(fabricDiscoveryMachineId);
        this.failoverRecoveryPointId = Objects.requireNonNull(failoverRecoveryPointId);
        this.firmwareType = Objects.requireNonNull(firmwareType);
        this.initialReplicationProcessedBytes = Objects.requireNonNull(initialReplicationProcessedBytes);
        this.initialReplicationProgressPercentage = Objects.requireNonNull(initialReplicationProgressPercentage);
        this.initialReplicationTransferredBytes = Objects.requireNonNull(initialReplicationTransferredBytes);
        this.instanceType = Objects.requireNonNull(instanceType);
        this.internalIdentifier = Objects.requireNonNull(internalIdentifier);
        this.isLastUpgradeSuccessful = Objects.requireNonNull(isLastUpgradeSuccessful);
        this.lastAgentUpgradeErrorDetails = Objects.requireNonNull(lastAgentUpgradeErrorDetails);
        this.lastAgentUpgradeFailedJobId = Objects.requireNonNull(lastAgentUpgradeFailedJobId);
        this.lastAgentUpgradeType = Objects.requireNonNull(lastAgentUpgradeType);
        this.lastRecoveryPointId = Objects.requireNonNull(lastRecoveryPointId);
        this.lastRecoveryPointReceived = Objects.requireNonNull(lastRecoveryPointReceived);
        this.lastRpoCalculatedTime = Objects.requireNonNull(lastRpoCalculatedTime);
        this.lastRpoInSeconds = Objects.requireNonNull(lastRpoInSeconds);
        this.licenseType = Objects.requireNonNull(licenseType);
        this.mobilityAgentDetails = Objects.requireNonNull(mobilityAgentDetails);
        this.multiVmGroupName = Objects.requireNonNull(multiVmGroupName);
        this.osType = Objects.requireNonNull(osType);
        this.processServerId = Objects.requireNonNull(processServerId);
        this.processServerName = Objects.requireNonNull(processServerName);
        this.processorCoreCount = Objects.requireNonNull(processorCoreCount);
        this.protectedDisks = Objects.requireNonNull(protectedDisks);
        this.resyncProcessedBytes = Objects.requireNonNull(resyncProcessedBytes);
        this.resyncProgressPercentage = Objects.requireNonNull(resyncProgressPercentage);
        this.resyncRequired = Objects.requireNonNull(resyncRequired);
        this.resyncState = Objects.requireNonNull(resyncState);
        this.resyncTransferredBytes = Objects.requireNonNull(resyncTransferredBytes);
        this.runAsAccountId = Objects.requireNonNull(runAsAccountId);
        this.targetAvailabilitySetId = Objects.requireNonNull(targetAvailabilitySetId);
        this.targetAvailabilityZone = Objects.requireNonNull(targetAvailabilityZone);
        this.targetBootDiagnosticsStorageAccountId = Objects.requireNonNull(targetBootDiagnosticsStorageAccountId);
        this.targetGeneration = Objects.requireNonNull(targetGeneration);
        this.targetNetworkId = Objects.requireNonNull(targetNetworkId);
        this.targetProximityPlacementGroupId = Objects.requireNonNull(targetProximityPlacementGroupId);
        this.targetResourceGroupId = Objects.requireNonNull(targetResourceGroupId);
        this.targetVmName = Objects.requireNonNull(targetVmName);
        this.targetVmSize = Objects.requireNonNull(targetVmSize);
        this.testNetworkId = Objects.requireNonNull(testNetworkId);
        this.vmNics = Objects.requireNonNull(vmNics);
    }

    /**
     * The agent upgrade blocking error information.
     * 
     */
    public List<InMageRcmAgentUpgradeBlockingErrorDetailsResponse> getAgentUpgradeBlockingErrorDetails() {
        return this.agentUpgradeBlockingErrorDetails;
    }
    /**
     * The agent auto upgrade state.
     * 
     */
    public String getAgentUpgradeState() {
        return this.agentUpgradeState;
    }
    /**
     * The allocated memory in MB.
     * 
     */
    public Double getAllocatedMemoryInMB() {
        return this.allocatedMemoryInMB;
    }
    /**
     * The type of the discovered VM.
     * 
     */
    public String getDiscoveryType() {
        return this.discoveryType;
    }
    /**
     * The ARM Id of the discovered VM.
     * 
     */
    public String getFabricDiscoveryMachineId() {
        return this.fabricDiscoveryMachineId;
    }
    /**
     * The recovery point Id to which the VM was failed over.
     * 
     */
    public String getFailoverRecoveryPointId() {
        return this.failoverRecoveryPointId;
    }
    /**
     * The firmware type.
     * 
     */
    public String getFirmwareType() {
        return this.firmwareType;
    }
    /**
     * The initial replication processed bytes. This includes sum of total bytes transferred and matched bytes on all selected disks in source VM.
     * 
     */
    public Double getInitialReplicationProcessedBytes() {
        return this.initialReplicationProcessedBytes;
    }
    /**
     * The initial replication progress percentage. This is calculated based on total bytes processed for all disks in the source VM.
     * 
     */
    public Integer getInitialReplicationProgressPercentage() {
        return this.initialReplicationProgressPercentage;
    }
    /**
     * The initial replication transferred bytes from source VM to azure for all selected disks on source VM.
     * 
     */
    public Double getInitialReplicationTransferredBytes() {
        return this.initialReplicationTransferredBytes;
    }
    /**
     * Gets the Instance type.
     * Expected value is 'InMageRcm'.
     * 
     */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * The virtual machine internal identifier.
     * 
     */
    public String getInternalIdentifier() {
        return this.internalIdentifier;
    }
    /**
     * A value indicating whether last agent upgrade was successful or not.
     * 
     */
    public String getIsLastUpgradeSuccessful() {
        return this.isLastUpgradeSuccessful;
    }
    /**
     * The last agent upgrade error information.
     * 
     */
    public List<InMageRcmLastAgentUpgradeErrorDetailsResponse> getLastAgentUpgradeErrorDetails() {
        return this.lastAgentUpgradeErrorDetails;
    }
    /**
     * The last agent upgrade failed or cancelled job Id.
     * 
     */
    public String getLastAgentUpgradeFailedJobId() {
        return this.lastAgentUpgradeFailedJobId;
    }
    /**
     * The last agent upgrade type.
     * 
     */
    public String getLastAgentUpgradeType() {
        return this.lastAgentUpgradeType;
    }
    /**
     * The last recovery point Id.
     * 
     */
    public String getLastRecoveryPointId() {
        return this.lastRecoveryPointId;
    }
    /**
     * The last recovery point received time.
     * 
     */
    public String getLastRecoveryPointReceived() {
        return this.lastRecoveryPointReceived;
    }
    /**
     * The last recovery point objective calculated time.
     * 
     */
    public String getLastRpoCalculatedTime() {
        return this.lastRpoCalculatedTime;
    }
    /**
     * The last recovery point objective value.
     * 
     */
    public Double getLastRpoInSeconds() {
        return this.lastRpoInSeconds;
    }
    /**
     * License Type of the VM to be used.
     * 
     */
    public String getLicenseType() {
        return this.licenseType;
    }
    /**
     * The mobility agent information.
     * 
     */
    public InMageRcmMobilityAgentDetailsResponse getMobilityAgentDetails() {
        return this.mobilityAgentDetails;
    }
    /**
     * The multi VM group name.
     * 
     */
    public String getMultiVmGroupName() {
        return this.multiVmGroupName;
    }
    /**
     * The type of the OS on the VM.
     * 
     */
    public String getOsType() {
        return this.osType;
    }
    /**
     * The process server Id.
     * 
     */
    public String getProcessServerId() {
        return this.processServerId;
    }
    /**
     * The process server name.
     * 
     */
    public String getProcessServerName() {
        return this.processServerName;
    }
    /**
     * The processor core count.
     * 
     */
    public Integer getProcessorCoreCount() {
        return this.processorCoreCount;
    }
    /**
     * The list of protected disks.
     * 
     */
    public List<InMageRcmProtectedDiskDetailsResponse> getProtectedDisks() {
        return this.protectedDisks;
    }
    /**
     * The resync processed bytes. This includes sum of total bytes transferred and matched bytes on all selected disks in source VM.
     * 
     */
    public Double getResyncProcessedBytes() {
        return this.resyncProcessedBytes;
    }
    /**
     * The resync progress percentage. This is calculated based on total bytes processed for all disks in the source VM.
     * 
     */
    public Integer getResyncProgressPercentage() {
        return this.resyncProgressPercentage;
    }
    /**
     * A value indicating whether resync is required.
     * 
     */
    public String getResyncRequired() {
        return this.resyncRequired;
    }
    /**
     * The resync state.
     * 
     */
    public String getResyncState() {
        return this.resyncState;
    }
    /**
     * The resync transferred bytes from source VM to azure for all selected disks on source VM.
     * 
     */
    public Double getResyncTransferredBytes() {
        return this.resyncTransferredBytes;
    }
    /**
     * The run-as account Id.
     * 
     */
    public String getRunAsAccountId() {
        return this.runAsAccountId;
    }
    /**
     * The target availability set Id.
     * 
     */
    public String getTargetAvailabilitySetId() {
        return this.targetAvailabilitySetId;
    }
    /**
     * The target availability zone.
     * 
     */
    public String getTargetAvailabilityZone() {
        return this.targetAvailabilityZone;
    }
    /**
     * The target boot diagnostics storage account ARM Id.
     * 
     */
    public String getTargetBootDiagnosticsStorageAccountId() {
        return this.targetBootDiagnosticsStorageAccountId;
    }
    /**
     * The target generation.
     * 
     */
    public String getTargetGeneration() {
        return this.targetGeneration;
    }
    /**
     * The target network Id.
     * 
     */
    public String getTargetNetworkId() {
        return this.targetNetworkId;
    }
    /**
     * The target proximity placement group Id.
     * 
     */
    public String getTargetProximityPlacementGroupId() {
        return this.targetProximityPlacementGroupId;
    }
    /**
     * The target resource group Id.
     * 
     */
    public String getTargetResourceGroupId() {
        return this.targetResourceGroupId;
    }
    /**
     * Target VM name.
     * 
     */
    public String getTargetVmName() {
        return this.targetVmName;
    }
    /**
     * The target VM size.
     * 
     */
    public String getTargetVmSize() {
        return this.targetVmSize;
    }
    /**
     * The test network Id.
     * 
     */
    public String getTestNetworkId() {
        return this.testNetworkId;
    }
    /**
     * The network details.
     * 
     */
    public List<InMageRcmNicDetailsResponse> getVmNics() {
        return this.vmNics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageRcmReplicationDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<InMageRcmAgentUpgradeBlockingErrorDetailsResponse> agentUpgradeBlockingErrorDetails;
        private String agentUpgradeState;
        private Double allocatedMemoryInMB;
        private String discoveryType;
        private String fabricDiscoveryMachineId;
        private String failoverRecoveryPointId;
        private String firmwareType;
        private Double initialReplicationProcessedBytes;
        private Integer initialReplicationProgressPercentage;
        private Double initialReplicationTransferredBytes;
        private String instanceType;
        private String internalIdentifier;
        private String isLastUpgradeSuccessful;
        private List<InMageRcmLastAgentUpgradeErrorDetailsResponse> lastAgentUpgradeErrorDetails;
        private String lastAgentUpgradeFailedJobId;
        private String lastAgentUpgradeType;
        private String lastRecoveryPointId;
        private String lastRecoveryPointReceived;
        private String lastRpoCalculatedTime;
        private Double lastRpoInSeconds;
        private String licenseType;
        private InMageRcmMobilityAgentDetailsResponse mobilityAgentDetails;
        private String multiVmGroupName;
        private String osType;
        private String processServerId;
        private String processServerName;
        private Integer processorCoreCount;
        private List<InMageRcmProtectedDiskDetailsResponse> protectedDisks;
        private Double resyncProcessedBytes;
        private Integer resyncProgressPercentage;
        private String resyncRequired;
        private String resyncState;
        private Double resyncTransferredBytes;
        private String runAsAccountId;
        private String targetAvailabilitySetId;
        private String targetAvailabilityZone;
        private String targetBootDiagnosticsStorageAccountId;
        private String targetGeneration;
        private String targetNetworkId;
        private String targetProximityPlacementGroupId;
        private String targetResourceGroupId;
        private String targetVmName;
        private String targetVmSize;
        private String testNetworkId;
        private List<InMageRcmNicDetailsResponse> vmNics;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageRcmReplicationDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentUpgradeBlockingErrorDetails = defaults.agentUpgradeBlockingErrorDetails;
    	      this.agentUpgradeState = defaults.agentUpgradeState;
    	      this.allocatedMemoryInMB = defaults.allocatedMemoryInMB;
    	      this.discoveryType = defaults.discoveryType;
    	      this.fabricDiscoveryMachineId = defaults.fabricDiscoveryMachineId;
    	      this.failoverRecoveryPointId = defaults.failoverRecoveryPointId;
    	      this.firmwareType = defaults.firmwareType;
    	      this.initialReplicationProcessedBytes = defaults.initialReplicationProcessedBytes;
    	      this.initialReplicationProgressPercentage = defaults.initialReplicationProgressPercentage;
    	      this.initialReplicationTransferredBytes = defaults.initialReplicationTransferredBytes;
    	      this.instanceType = defaults.instanceType;
    	      this.internalIdentifier = defaults.internalIdentifier;
    	      this.isLastUpgradeSuccessful = defaults.isLastUpgradeSuccessful;
    	      this.lastAgentUpgradeErrorDetails = defaults.lastAgentUpgradeErrorDetails;
    	      this.lastAgentUpgradeFailedJobId = defaults.lastAgentUpgradeFailedJobId;
    	      this.lastAgentUpgradeType = defaults.lastAgentUpgradeType;
    	      this.lastRecoveryPointId = defaults.lastRecoveryPointId;
    	      this.lastRecoveryPointReceived = defaults.lastRecoveryPointReceived;
    	      this.lastRpoCalculatedTime = defaults.lastRpoCalculatedTime;
    	      this.lastRpoInSeconds = defaults.lastRpoInSeconds;
    	      this.licenseType = defaults.licenseType;
    	      this.mobilityAgentDetails = defaults.mobilityAgentDetails;
    	      this.multiVmGroupName = defaults.multiVmGroupName;
    	      this.osType = defaults.osType;
    	      this.processServerId = defaults.processServerId;
    	      this.processServerName = defaults.processServerName;
    	      this.processorCoreCount = defaults.processorCoreCount;
    	      this.protectedDisks = defaults.protectedDisks;
    	      this.resyncProcessedBytes = defaults.resyncProcessedBytes;
    	      this.resyncProgressPercentage = defaults.resyncProgressPercentage;
    	      this.resyncRequired = defaults.resyncRequired;
    	      this.resyncState = defaults.resyncState;
    	      this.resyncTransferredBytes = defaults.resyncTransferredBytes;
    	      this.runAsAccountId = defaults.runAsAccountId;
    	      this.targetAvailabilitySetId = defaults.targetAvailabilitySetId;
    	      this.targetAvailabilityZone = defaults.targetAvailabilityZone;
    	      this.targetBootDiagnosticsStorageAccountId = defaults.targetBootDiagnosticsStorageAccountId;
    	      this.targetGeneration = defaults.targetGeneration;
    	      this.targetNetworkId = defaults.targetNetworkId;
    	      this.targetProximityPlacementGroupId = defaults.targetProximityPlacementGroupId;
    	      this.targetResourceGroupId = defaults.targetResourceGroupId;
    	      this.targetVmName = defaults.targetVmName;
    	      this.targetVmSize = defaults.targetVmSize;
    	      this.testNetworkId = defaults.testNetworkId;
    	      this.vmNics = defaults.vmNics;
        }

        public Builder setAgentUpgradeBlockingErrorDetails(List<InMageRcmAgentUpgradeBlockingErrorDetailsResponse> agentUpgradeBlockingErrorDetails) {
            this.agentUpgradeBlockingErrorDetails = Objects.requireNonNull(agentUpgradeBlockingErrorDetails);
            return this;
        }

        public Builder setAgentUpgradeState(String agentUpgradeState) {
            this.agentUpgradeState = Objects.requireNonNull(agentUpgradeState);
            return this;
        }

        public Builder setAllocatedMemoryInMB(Double allocatedMemoryInMB) {
            this.allocatedMemoryInMB = Objects.requireNonNull(allocatedMemoryInMB);
            return this;
        }

        public Builder setDiscoveryType(String discoveryType) {
            this.discoveryType = Objects.requireNonNull(discoveryType);
            return this;
        }

        public Builder setFabricDiscoveryMachineId(String fabricDiscoveryMachineId) {
            this.fabricDiscoveryMachineId = Objects.requireNonNull(fabricDiscoveryMachineId);
            return this;
        }

        public Builder setFailoverRecoveryPointId(String failoverRecoveryPointId) {
            this.failoverRecoveryPointId = Objects.requireNonNull(failoverRecoveryPointId);
            return this;
        }

        public Builder setFirmwareType(String firmwareType) {
            this.firmwareType = Objects.requireNonNull(firmwareType);
            return this;
        }

        public Builder setInitialReplicationProcessedBytes(Double initialReplicationProcessedBytes) {
            this.initialReplicationProcessedBytes = Objects.requireNonNull(initialReplicationProcessedBytes);
            return this;
        }

        public Builder setInitialReplicationProgressPercentage(Integer initialReplicationProgressPercentage) {
            this.initialReplicationProgressPercentage = Objects.requireNonNull(initialReplicationProgressPercentage);
            return this;
        }

        public Builder setInitialReplicationTransferredBytes(Double initialReplicationTransferredBytes) {
            this.initialReplicationTransferredBytes = Objects.requireNonNull(initialReplicationTransferredBytes);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setInternalIdentifier(String internalIdentifier) {
            this.internalIdentifier = Objects.requireNonNull(internalIdentifier);
            return this;
        }

        public Builder setIsLastUpgradeSuccessful(String isLastUpgradeSuccessful) {
            this.isLastUpgradeSuccessful = Objects.requireNonNull(isLastUpgradeSuccessful);
            return this;
        }

        public Builder setLastAgentUpgradeErrorDetails(List<InMageRcmLastAgentUpgradeErrorDetailsResponse> lastAgentUpgradeErrorDetails) {
            this.lastAgentUpgradeErrorDetails = Objects.requireNonNull(lastAgentUpgradeErrorDetails);
            return this;
        }

        public Builder setLastAgentUpgradeFailedJobId(String lastAgentUpgradeFailedJobId) {
            this.lastAgentUpgradeFailedJobId = Objects.requireNonNull(lastAgentUpgradeFailedJobId);
            return this;
        }

        public Builder setLastAgentUpgradeType(String lastAgentUpgradeType) {
            this.lastAgentUpgradeType = Objects.requireNonNull(lastAgentUpgradeType);
            return this;
        }

        public Builder setLastRecoveryPointId(String lastRecoveryPointId) {
            this.lastRecoveryPointId = Objects.requireNonNull(lastRecoveryPointId);
            return this;
        }

        public Builder setLastRecoveryPointReceived(String lastRecoveryPointReceived) {
            this.lastRecoveryPointReceived = Objects.requireNonNull(lastRecoveryPointReceived);
            return this;
        }

        public Builder setLastRpoCalculatedTime(String lastRpoCalculatedTime) {
            this.lastRpoCalculatedTime = Objects.requireNonNull(lastRpoCalculatedTime);
            return this;
        }

        public Builder setLastRpoInSeconds(Double lastRpoInSeconds) {
            this.lastRpoInSeconds = Objects.requireNonNull(lastRpoInSeconds);
            return this;
        }

        public Builder setLicenseType(String licenseType) {
            this.licenseType = Objects.requireNonNull(licenseType);
            return this;
        }

        public Builder setMobilityAgentDetails(InMageRcmMobilityAgentDetailsResponse mobilityAgentDetails) {
            this.mobilityAgentDetails = Objects.requireNonNull(mobilityAgentDetails);
            return this;
        }

        public Builder setMultiVmGroupName(String multiVmGroupName) {
            this.multiVmGroupName = Objects.requireNonNull(multiVmGroupName);
            return this;
        }

        public Builder setOsType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }

        public Builder setProcessServerId(String processServerId) {
            this.processServerId = Objects.requireNonNull(processServerId);
            return this;
        }

        public Builder setProcessServerName(String processServerName) {
            this.processServerName = Objects.requireNonNull(processServerName);
            return this;
        }

        public Builder setProcessorCoreCount(Integer processorCoreCount) {
            this.processorCoreCount = Objects.requireNonNull(processorCoreCount);
            return this;
        }

        public Builder setProtectedDisks(List<InMageRcmProtectedDiskDetailsResponse> protectedDisks) {
            this.protectedDisks = Objects.requireNonNull(protectedDisks);
            return this;
        }

        public Builder setResyncProcessedBytes(Double resyncProcessedBytes) {
            this.resyncProcessedBytes = Objects.requireNonNull(resyncProcessedBytes);
            return this;
        }

        public Builder setResyncProgressPercentage(Integer resyncProgressPercentage) {
            this.resyncProgressPercentage = Objects.requireNonNull(resyncProgressPercentage);
            return this;
        }

        public Builder setResyncRequired(String resyncRequired) {
            this.resyncRequired = Objects.requireNonNull(resyncRequired);
            return this;
        }

        public Builder setResyncState(String resyncState) {
            this.resyncState = Objects.requireNonNull(resyncState);
            return this;
        }

        public Builder setResyncTransferredBytes(Double resyncTransferredBytes) {
            this.resyncTransferredBytes = Objects.requireNonNull(resyncTransferredBytes);
            return this;
        }

        public Builder setRunAsAccountId(String runAsAccountId) {
            this.runAsAccountId = Objects.requireNonNull(runAsAccountId);
            return this;
        }

        public Builder setTargetAvailabilitySetId(String targetAvailabilitySetId) {
            this.targetAvailabilitySetId = Objects.requireNonNull(targetAvailabilitySetId);
            return this;
        }

        public Builder setTargetAvailabilityZone(String targetAvailabilityZone) {
            this.targetAvailabilityZone = Objects.requireNonNull(targetAvailabilityZone);
            return this;
        }

        public Builder setTargetBootDiagnosticsStorageAccountId(String targetBootDiagnosticsStorageAccountId) {
            this.targetBootDiagnosticsStorageAccountId = Objects.requireNonNull(targetBootDiagnosticsStorageAccountId);
            return this;
        }

        public Builder setTargetGeneration(String targetGeneration) {
            this.targetGeneration = Objects.requireNonNull(targetGeneration);
            return this;
        }

        public Builder setTargetNetworkId(String targetNetworkId) {
            this.targetNetworkId = Objects.requireNonNull(targetNetworkId);
            return this;
        }

        public Builder setTargetProximityPlacementGroupId(String targetProximityPlacementGroupId) {
            this.targetProximityPlacementGroupId = Objects.requireNonNull(targetProximityPlacementGroupId);
            return this;
        }

        public Builder setTargetResourceGroupId(String targetResourceGroupId) {
            this.targetResourceGroupId = Objects.requireNonNull(targetResourceGroupId);
            return this;
        }

        public Builder setTargetVmName(String targetVmName) {
            this.targetVmName = Objects.requireNonNull(targetVmName);
            return this;
        }

        public Builder setTargetVmSize(String targetVmSize) {
            this.targetVmSize = Objects.requireNonNull(targetVmSize);
            return this;
        }

        public Builder setTestNetworkId(String testNetworkId) {
            this.testNetworkId = Objects.requireNonNull(testNetworkId);
            return this;
        }

        public Builder setVmNics(List<InMageRcmNicDetailsResponse> vmNics) {
            this.vmNics = Objects.requireNonNull(vmNics);
            return this;
        }

        public InMageRcmReplicationDetailsResponse build() {
            return new InMageRcmReplicationDetailsResponse(agentUpgradeBlockingErrorDetails, agentUpgradeState, allocatedMemoryInMB, discoveryType, fabricDiscoveryMachineId, failoverRecoveryPointId, firmwareType, initialReplicationProcessedBytes, initialReplicationProgressPercentage, initialReplicationTransferredBytes, instanceType, internalIdentifier, isLastUpgradeSuccessful, lastAgentUpgradeErrorDetails, lastAgentUpgradeFailedJobId, lastAgentUpgradeType, lastRecoveryPointId, lastRecoveryPointReceived, lastRpoCalculatedTime, lastRpoInSeconds, licenseType, mobilityAgentDetails, multiVmGroupName, osType, processServerId, processServerName, processorCoreCount, protectedDisks, resyncProcessedBytes, resyncProgressPercentage, resyncRequired, resyncState, resyncTransferredBytes, runAsAccountId, targetAvailabilitySetId, targetAvailabilityZone, targetBootDiagnosticsStorageAccountId, targetGeneration, targetNetworkId, targetProximityPlacementGroupId, targetResourceGroupId, targetVmName, targetVmSize, testNetworkId, vmNics);
        }
    }
}
