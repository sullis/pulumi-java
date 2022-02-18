// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.LicenseType;
import io.pulumi.azurenative.recoveryservices.inputs.InMageRcmDiskInputArgs;
import io.pulumi.azurenative.recoveryservices.inputs.InMageRcmDisksDefaultInputArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * InMageRcm specific enable protection input.
 * 
 */
public final class InMageRcmEnableProtectionInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final InMageRcmEnableProtectionInputArgs Empty = new InMageRcmEnableProtectionInputArgs();

    /**
     * The default disk input.
     * 
     */
    @InputImport(name="disksDefault")
    private final @Nullable Input<InMageRcmDisksDefaultInputArgs> disksDefault;

    public Input<InMageRcmDisksDefaultInputArgs> getDisksDefault() {
        return this.disksDefault == null ? Input.empty() : this.disksDefault;
    }

    /**
     * The disks to include list.
     * 
     */
    @InputImport(name="disksToInclude")
    private final @Nullable Input<List<InMageRcmDiskInputArgs>> disksToInclude;

    public Input<List<InMageRcmDiskInputArgs>> getDisksToInclude() {
        return this.disksToInclude == null ? Input.empty() : this.disksToInclude;
    }

    /**
     * The ARM Id of discovered machine.
     * 
     */
    @InputImport(name="fabricDiscoveryMachineId")
    private final @Nullable Input<String> fabricDiscoveryMachineId;

    public Input<String> getFabricDiscoveryMachineId() {
        return this.fabricDiscoveryMachineId == null ? Input.empty() : this.fabricDiscoveryMachineId;
    }

    /**
     * The class type.
     * Expected value is 'InMageRcm'.
     * 
     */
    @InputImport(name="instanceType")
    private final @Nullable Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    /**
     * The license type.
     * 
     */
    @InputImport(name="licenseType")
    private final @Nullable Input<Either<String,LicenseType>> licenseType;

    public Input<Either<String,LicenseType>> getLicenseType() {
        return this.licenseType == null ? Input.empty() : this.licenseType;
    }

    /**
     * The multi VM group name.
     * 
     */
    @InputImport(name="multiVmGroupName")
    private final @Nullable Input<String> multiVmGroupName;

    public Input<String> getMultiVmGroupName() {
        return this.multiVmGroupName == null ? Input.empty() : this.multiVmGroupName;
    }

    /**
     * The process server Id.
     * 
     */
    @InputImport(name="processServerId")
    private final @Nullable Input<String> processServerId;

    public Input<String> getProcessServerId() {
        return this.processServerId == null ? Input.empty() : this.processServerId;
    }

    /**
     * The run-as account Id.
     * 
     */
    @InputImport(name="runAsAccountId")
    private final @Nullable Input<String> runAsAccountId;

    public Input<String> getRunAsAccountId() {
        return this.runAsAccountId == null ? Input.empty() : this.runAsAccountId;
    }

    /**
     * The target availability set ARM Id.
     * 
     */
    @InputImport(name="targetAvailabilitySetId")
    private final @Nullable Input<String> targetAvailabilitySetId;

    public Input<String> getTargetAvailabilitySetId() {
        return this.targetAvailabilitySetId == null ? Input.empty() : this.targetAvailabilitySetId;
    }

    /**
     * The target availability zone.
     * 
     */
    @InputImport(name="targetAvailabilityZone")
    private final @Nullable Input<String> targetAvailabilityZone;

    public Input<String> getTargetAvailabilityZone() {
        return this.targetAvailabilityZone == null ? Input.empty() : this.targetAvailabilityZone;
    }

    /**
     * The target boot diagnostics storage account ARM Id.
     * 
     */
    @InputImport(name="targetBootDiagnosticsStorageAccountId")
    private final @Nullable Input<String> targetBootDiagnosticsStorageAccountId;

    public Input<String> getTargetBootDiagnosticsStorageAccountId() {
        return this.targetBootDiagnosticsStorageAccountId == null ? Input.empty() : this.targetBootDiagnosticsStorageAccountId;
    }

    /**
     * The selected target network ARM Id.
     * 
     */
    @InputImport(name="targetNetworkId")
    private final @Nullable Input<String> targetNetworkId;

    public Input<String> getTargetNetworkId() {
        return this.targetNetworkId == null ? Input.empty() : this.targetNetworkId;
    }

    /**
     * The target proximity placement group Id.
     * 
     */
    @InputImport(name="targetProximityPlacementGroupId")
    private final @Nullable Input<String> targetProximityPlacementGroupId;

    public Input<String> getTargetProximityPlacementGroupId() {
        return this.targetProximityPlacementGroupId == null ? Input.empty() : this.targetProximityPlacementGroupId;
    }

    /**
     * The target resource group ARM Id.
     * 
     */
    @InputImport(name="targetResourceGroupId")
    private final @Nullable Input<String> targetResourceGroupId;

    public Input<String> getTargetResourceGroupId() {
        return this.targetResourceGroupId == null ? Input.empty() : this.targetResourceGroupId;
    }

    /**
     * The selected target subnet name.
     * 
     */
    @InputImport(name="targetSubnetName")
    private final @Nullable Input<String> targetSubnetName;

    public Input<String> getTargetSubnetName() {
        return this.targetSubnetName == null ? Input.empty() : this.targetSubnetName;
    }

    /**
     * The target VM name.
     * 
     */
    @InputImport(name="targetVmName")
    private final @Nullable Input<String> targetVmName;

    public Input<String> getTargetVmName() {
        return this.targetVmName == null ? Input.empty() : this.targetVmName;
    }

    /**
     * The target VM size.
     * 
     */
    @InputImport(name="targetVmSize")
    private final @Nullable Input<String> targetVmSize;

    public Input<String> getTargetVmSize() {
        return this.targetVmSize == null ? Input.empty() : this.targetVmSize;
    }

    /**
     * The selected test network ARM Id.
     * 
     */
    @InputImport(name="testNetworkId")
    private final @Nullable Input<String> testNetworkId;

    public Input<String> getTestNetworkId() {
        return this.testNetworkId == null ? Input.empty() : this.testNetworkId;
    }

    /**
     * The selected test subnet name.
     * 
     */
    @InputImport(name="testSubnetName")
    private final @Nullable Input<String> testSubnetName;

    public Input<String> getTestSubnetName() {
        return this.testSubnetName == null ? Input.empty() : this.testSubnetName;
    }

    public InMageRcmEnableProtectionInputArgs(
        @Nullable Input<InMageRcmDisksDefaultInputArgs> disksDefault,
        @Nullable Input<List<InMageRcmDiskInputArgs>> disksToInclude,
        @Nullable Input<String> fabricDiscoveryMachineId,
        @Nullable Input<String> instanceType,
        @Nullable Input<Either<String,LicenseType>> licenseType,
        @Nullable Input<String> multiVmGroupName,
        @Nullable Input<String> processServerId,
        @Nullable Input<String> runAsAccountId,
        @Nullable Input<String> targetAvailabilitySetId,
        @Nullable Input<String> targetAvailabilityZone,
        @Nullable Input<String> targetBootDiagnosticsStorageAccountId,
        @Nullable Input<String> targetNetworkId,
        @Nullable Input<String> targetProximityPlacementGroupId,
        @Nullable Input<String> targetResourceGroupId,
        @Nullable Input<String> targetSubnetName,
        @Nullable Input<String> targetVmName,
        @Nullable Input<String> targetVmSize,
        @Nullable Input<String> testNetworkId,
        @Nullable Input<String> testSubnetName) {
        this.disksDefault = disksDefault;
        this.disksToInclude = disksToInclude;
        this.fabricDiscoveryMachineId = fabricDiscoveryMachineId;
        this.instanceType = instanceType;
        this.licenseType = licenseType;
        this.multiVmGroupName = multiVmGroupName;
        this.processServerId = processServerId;
        this.runAsAccountId = runAsAccountId;
        this.targetAvailabilitySetId = targetAvailabilitySetId;
        this.targetAvailabilityZone = targetAvailabilityZone;
        this.targetBootDiagnosticsStorageAccountId = targetBootDiagnosticsStorageAccountId;
        this.targetNetworkId = targetNetworkId;
        this.targetProximityPlacementGroupId = targetProximityPlacementGroupId;
        this.targetResourceGroupId = targetResourceGroupId;
        this.targetSubnetName = targetSubnetName;
        this.targetVmName = targetVmName;
        this.targetVmSize = targetVmSize;
        this.testNetworkId = testNetworkId;
        this.testSubnetName = testSubnetName;
    }

    private InMageRcmEnableProtectionInputArgs() {
        this.disksDefault = Input.empty();
        this.disksToInclude = Input.empty();
        this.fabricDiscoveryMachineId = Input.empty();
        this.instanceType = Input.empty();
        this.licenseType = Input.empty();
        this.multiVmGroupName = Input.empty();
        this.processServerId = Input.empty();
        this.runAsAccountId = Input.empty();
        this.targetAvailabilitySetId = Input.empty();
        this.targetAvailabilityZone = Input.empty();
        this.targetBootDiagnosticsStorageAccountId = Input.empty();
        this.targetNetworkId = Input.empty();
        this.targetProximityPlacementGroupId = Input.empty();
        this.targetResourceGroupId = Input.empty();
        this.targetSubnetName = Input.empty();
        this.targetVmName = Input.empty();
        this.targetVmSize = Input.empty();
        this.testNetworkId = Input.empty();
        this.testSubnetName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageRcmEnableProtectionInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<InMageRcmDisksDefaultInputArgs> disksDefault;
        private @Nullable Input<List<InMageRcmDiskInputArgs>> disksToInclude;
        private @Nullable Input<String> fabricDiscoveryMachineId;
        private @Nullable Input<String> instanceType;
        private @Nullable Input<Either<String,LicenseType>> licenseType;
        private @Nullable Input<String> multiVmGroupName;
        private @Nullable Input<String> processServerId;
        private @Nullable Input<String> runAsAccountId;
        private @Nullable Input<String> targetAvailabilitySetId;
        private @Nullable Input<String> targetAvailabilityZone;
        private @Nullable Input<String> targetBootDiagnosticsStorageAccountId;
        private @Nullable Input<String> targetNetworkId;
        private @Nullable Input<String> targetProximityPlacementGroupId;
        private @Nullable Input<String> targetResourceGroupId;
        private @Nullable Input<String> targetSubnetName;
        private @Nullable Input<String> targetVmName;
        private @Nullable Input<String> targetVmSize;
        private @Nullable Input<String> testNetworkId;
        private @Nullable Input<String> testSubnetName;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageRcmEnableProtectionInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disksDefault = defaults.disksDefault;
    	      this.disksToInclude = defaults.disksToInclude;
    	      this.fabricDiscoveryMachineId = defaults.fabricDiscoveryMachineId;
    	      this.instanceType = defaults.instanceType;
    	      this.licenseType = defaults.licenseType;
    	      this.multiVmGroupName = defaults.multiVmGroupName;
    	      this.processServerId = defaults.processServerId;
    	      this.runAsAccountId = defaults.runAsAccountId;
    	      this.targetAvailabilitySetId = defaults.targetAvailabilitySetId;
    	      this.targetAvailabilityZone = defaults.targetAvailabilityZone;
    	      this.targetBootDiagnosticsStorageAccountId = defaults.targetBootDiagnosticsStorageAccountId;
    	      this.targetNetworkId = defaults.targetNetworkId;
    	      this.targetProximityPlacementGroupId = defaults.targetProximityPlacementGroupId;
    	      this.targetResourceGroupId = defaults.targetResourceGroupId;
    	      this.targetSubnetName = defaults.targetSubnetName;
    	      this.targetVmName = defaults.targetVmName;
    	      this.targetVmSize = defaults.targetVmSize;
    	      this.testNetworkId = defaults.testNetworkId;
    	      this.testSubnetName = defaults.testSubnetName;
        }

        public Builder setDisksDefault(@Nullable Input<InMageRcmDisksDefaultInputArgs> disksDefault) {
            this.disksDefault = disksDefault;
            return this;
        }

        public Builder setDisksDefault(@Nullable InMageRcmDisksDefaultInputArgs disksDefault) {
            this.disksDefault = Input.ofNullable(disksDefault);
            return this;
        }

        public Builder setDisksToInclude(@Nullable Input<List<InMageRcmDiskInputArgs>> disksToInclude) {
            this.disksToInclude = disksToInclude;
            return this;
        }

        public Builder setDisksToInclude(@Nullable List<InMageRcmDiskInputArgs> disksToInclude) {
            this.disksToInclude = Input.ofNullable(disksToInclude);
            return this;
        }

        public Builder setFabricDiscoveryMachineId(@Nullable Input<String> fabricDiscoveryMachineId) {
            this.fabricDiscoveryMachineId = fabricDiscoveryMachineId;
            return this;
        }

        public Builder setFabricDiscoveryMachineId(@Nullable String fabricDiscoveryMachineId) {
            this.fabricDiscoveryMachineId = Input.ofNullable(fabricDiscoveryMachineId);
            return this;
        }

        public Builder setInstanceType(@Nullable Input<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setInstanceType(@Nullable String instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }

        public Builder setLicenseType(@Nullable Input<Either<String,LicenseType>> licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public Builder setLicenseType(@Nullable Either<String,LicenseType> licenseType) {
            this.licenseType = Input.ofNullable(licenseType);
            return this;
        }

        public Builder setMultiVmGroupName(@Nullable Input<String> multiVmGroupName) {
            this.multiVmGroupName = multiVmGroupName;
            return this;
        }

        public Builder setMultiVmGroupName(@Nullable String multiVmGroupName) {
            this.multiVmGroupName = Input.ofNullable(multiVmGroupName);
            return this;
        }

        public Builder setProcessServerId(@Nullable Input<String> processServerId) {
            this.processServerId = processServerId;
            return this;
        }

        public Builder setProcessServerId(@Nullable String processServerId) {
            this.processServerId = Input.ofNullable(processServerId);
            return this;
        }

        public Builder setRunAsAccountId(@Nullable Input<String> runAsAccountId) {
            this.runAsAccountId = runAsAccountId;
            return this;
        }

        public Builder setRunAsAccountId(@Nullable String runAsAccountId) {
            this.runAsAccountId = Input.ofNullable(runAsAccountId);
            return this;
        }

        public Builder setTargetAvailabilitySetId(@Nullable Input<String> targetAvailabilitySetId) {
            this.targetAvailabilitySetId = targetAvailabilitySetId;
            return this;
        }

        public Builder setTargetAvailabilitySetId(@Nullable String targetAvailabilitySetId) {
            this.targetAvailabilitySetId = Input.ofNullable(targetAvailabilitySetId);
            return this;
        }

        public Builder setTargetAvailabilityZone(@Nullable Input<String> targetAvailabilityZone) {
            this.targetAvailabilityZone = targetAvailabilityZone;
            return this;
        }

        public Builder setTargetAvailabilityZone(@Nullable String targetAvailabilityZone) {
            this.targetAvailabilityZone = Input.ofNullable(targetAvailabilityZone);
            return this;
        }

        public Builder setTargetBootDiagnosticsStorageAccountId(@Nullable Input<String> targetBootDiagnosticsStorageAccountId) {
            this.targetBootDiagnosticsStorageAccountId = targetBootDiagnosticsStorageAccountId;
            return this;
        }

        public Builder setTargetBootDiagnosticsStorageAccountId(@Nullable String targetBootDiagnosticsStorageAccountId) {
            this.targetBootDiagnosticsStorageAccountId = Input.ofNullable(targetBootDiagnosticsStorageAccountId);
            return this;
        }

        public Builder setTargetNetworkId(@Nullable Input<String> targetNetworkId) {
            this.targetNetworkId = targetNetworkId;
            return this;
        }

        public Builder setTargetNetworkId(@Nullable String targetNetworkId) {
            this.targetNetworkId = Input.ofNullable(targetNetworkId);
            return this;
        }

        public Builder setTargetProximityPlacementGroupId(@Nullable Input<String> targetProximityPlacementGroupId) {
            this.targetProximityPlacementGroupId = targetProximityPlacementGroupId;
            return this;
        }

        public Builder setTargetProximityPlacementGroupId(@Nullable String targetProximityPlacementGroupId) {
            this.targetProximityPlacementGroupId = Input.ofNullable(targetProximityPlacementGroupId);
            return this;
        }

        public Builder setTargetResourceGroupId(@Nullable Input<String> targetResourceGroupId) {
            this.targetResourceGroupId = targetResourceGroupId;
            return this;
        }

        public Builder setTargetResourceGroupId(@Nullable String targetResourceGroupId) {
            this.targetResourceGroupId = Input.ofNullable(targetResourceGroupId);
            return this;
        }

        public Builder setTargetSubnetName(@Nullable Input<String> targetSubnetName) {
            this.targetSubnetName = targetSubnetName;
            return this;
        }

        public Builder setTargetSubnetName(@Nullable String targetSubnetName) {
            this.targetSubnetName = Input.ofNullable(targetSubnetName);
            return this;
        }

        public Builder setTargetVmName(@Nullable Input<String> targetVmName) {
            this.targetVmName = targetVmName;
            return this;
        }

        public Builder setTargetVmName(@Nullable String targetVmName) {
            this.targetVmName = Input.ofNullable(targetVmName);
            return this;
        }

        public Builder setTargetVmSize(@Nullable Input<String> targetVmSize) {
            this.targetVmSize = targetVmSize;
            return this;
        }

        public Builder setTargetVmSize(@Nullable String targetVmSize) {
            this.targetVmSize = Input.ofNullable(targetVmSize);
            return this;
        }

        public Builder setTestNetworkId(@Nullable Input<String> testNetworkId) {
            this.testNetworkId = testNetworkId;
            return this;
        }

        public Builder setTestNetworkId(@Nullable String testNetworkId) {
            this.testNetworkId = Input.ofNullable(testNetworkId);
            return this;
        }

        public Builder setTestSubnetName(@Nullable Input<String> testSubnetName) {
            this.testSubnetName = testSubnetName;
            return this;
        }

        public Builder setTestSubnetName(@Nullable String testSubnetName) {
            this.testSubnetName = Input.ofNullable(testSubnetName);
            return this;
        }

        public InMageRcmEnableProtectionInputArgs build() {
            return new InMageRcmEnableProtectionInputArgs(disksDefault, disksToInclude, fabricDiscoveryMachineId, instanceType, licenseType, multiVmGroupName, processServerId, runAsAccountId, targetAvailabilitySetId, targetAvailabilityZone, targetBootDiagnosticsStorageAccountId, targetNetworkId, targetProximityPlacementGroupId, targetResourceGroupId, targetSubnetName, targetVmName, targetVmSize, testNetworkId, testSubnetName);
        }
    }
}
