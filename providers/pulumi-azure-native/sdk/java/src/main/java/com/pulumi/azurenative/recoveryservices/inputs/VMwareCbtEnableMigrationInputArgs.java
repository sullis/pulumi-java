// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.LicenseType;
import com.pulumi.azurenative.recoveryservices.inputs.VMwareCbtDiskInputArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VMwareCbt specific enable migration input.
 * 
 */
public final class VMwareCbtEnableMigrationInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final VMwareCbtEnableMigrationInputArgs Empty = new VMwareCbtEnableMigrationInputArgs();

    /**
     * The data mover RunAs account Id.
     * 
     */
    @Import(name="dataMoverRunAsAccountId", required=true)
      private final Output<String> dataMoverRunAsAccountId;

    public Output<String> dataMoverRunAsAccountId() {
        return this.dataMoverRunAsAccountId;
    }

    /**
     * The disks to include list.
     * 
     */
    @Import(name="disksToInclude", required=true)
      private final Output<List<VMwareCbtDiskInputArgs>> disksToInclude;

    public Output<List<VMwareCbtDiskInputArgs>> disksToInclude() {
        return this.disksToInclude;
    }

    /**
     * The class type.
     * Expected value is 'VMwareCbt'.
     * 
     */
    @Import(name="instanceType", required=true)
      private final Output<String> instanceType;

    public Output<String> instanceType() {
        return this.instanceType;
    }

    /**
     * License type.
     * 
     */
    @Import(name="licenseType")
      private final @Nullable Output<Either<String,LicenseType>> licenseType;

    public Output<Either<String,LicenseType>> licenseType() {
        return this.licenseType == null ? Codegen.empty() : this.licenseType;
    }

    /**
     * The snapshot RunAs account Id.
     * 
     */
    @Import(name="snapshotRunAsAccountId", required=true)
      private final Output<String> snapshotRunAsAccountId;

    public Output<String> snapshotRunAsAccountId() {
        return this.snapshotRunAsAccountId;
    }

    /**
     * The target availability set ARM Id.
     * 
     */
    @Import(name="targetAvailabilitySetId")
      private final @Nullable Output<String> targetAvailabilitySetId;

    public Output<String> targetAvailabilitySetId() {
        return this.targetAvailabilitySetId == null ? Codegen.empty() : this.targetAvailabilitySetId;
    }

    /**
     * The target boot diagnostics storage account ARM Id.
     * 
     */
    @Import(name="targetBootDiagnosticsStorageAccountId")
      private final @Nullable Output<String> targetBootDiagnosticsStorageAccountId;

    public Output<String> targetBootDiagnosticsStorageAccountId() {
        return this.targetBootDiagnosticsStorageAccountId == null ? Codegen.empty() : this.targetBootDiagnosticsStorageAccountId;
    }

    /**
     * The target network ARM Id.
     * 
     */
    @Import(name="targetNetworkId", required=true)
      private final Output<String> targetNetworkId;

    public Output<String> targetNetworkId() {
        return this.targetNetworkId;
    }

    /**
     * The target resource group ARM Id.
     * 
     */
    @Import(name="targetResourceGroupId", required=true)
      private final Output<String> targetResourceGroupId;

    public Output<String> targetResourceGroupId() {
        return this.targetResourceGroupId;
    }

    /**
     * The target subnet name.
     * 
     */
    @Import(name="targetSubnetName")
      private final @Nullable Output<String> targetSubnetName;

    public Output<String> targetSubnetName() {
        return this.targetSubnetName == null ? Codegen.empty() : this.targetSubnetName;
    }

    /**
     * The target VM name.
     * 
     */
    @Import(name="targetVmName")
      private final @Nullable Output<String> targetVmName;

    public Output<String> targetVmName() {
        return this.targetVmName == null ? Codegen.empty() : this.targetVmName;
    }

    /**
     * The target VM size.
     * 
     */
    @Import(name="targetVmSize")
      private final @Nullable Output<String> targetVmSize;

    public Output<String> targetVmSize() {
        return this.targetVmSize == null ? Codegen.empty() : this.targetVmSize;
    }

    /**
     * The ARM Id of the VM discovered in VMware.
     * 
     */
    @Import(name="vmwareMachineId", required=true)
      private final Output<String> vmwareMachineId;

    public Output<String> vmwareMachineId() {
        return this.vmwareMachineId;
    }

    public VMwareCbtEnableMigrationInputArgs(
        Output<String> dataMoverRunAsAccountId,
        Output<List<VMwareCbtDiskInputArgs>> disksToInclude,
        Output<String> instanceType,
        @Nullable Output<Either<String,LicenseType>> licenseType,
        Output<String> snapshotRunAsAccountId,
        @Nullable Output<String> targetAvailabilitySetId,
        @Nullable Output<String> targetBootDiagnosticsStorageAccountId,
        Output<String> targetNetworkId,
        Output<String> targetResourceGroupId,
        @Nullable Output<String> targetSubnetName,
        @Nullable Output<String> targetVmName,
        @Nullable Output<String> targetVmSize,
        Output<String> vmwareMachineId) {
        this.dataMoverRunAsAccountId = Objects.requireNonNull(dataMoverRunAsAccountId, "expected parameter 'dataMoverRunAsAccountId' to be non-null");
        this.disksToInclude = Objects.requireNonNull(disksToInclude, "expected parameter 'disksToInclude' to be non-null");
        this.instanceType = Codegen.stringProp("instanceType").output().arg(instanceType).require();
        this.licenseType = licenseType;
        this.snapshotRunAsAccountId = Objects.requireNonNull(snapshotRunAsAccountId, "expected parameter 'snapshotRunAsAccountId' to be non-null");
        this.targetAvailabilitySetId = targetAvailabilitySetId;
        this.targetBootDiagnosticsStorageAccountId = targetBootDiagnosticsStorageAccountId;
        this.targetNetworkId = Objects.requireNonNull(targetNetworkId, "expected parameter 'targetNetworkId' to be non-null");
        this.targetResourceGroupId = Objects.requireNonNull(targetResourceGroupId, "expected parameter 'targetResourceGroupId' to be non-null");
        this.targetSubnetName = targetSubnetName;
        this.targetVmName = targetVmName;
        this.targetVmSize = targetVmSize;
        this.vmwareMachineId = Objects.requireNonNull(vmwareMachineId, "expected parameter 'vmwareMachineId' to be non-null");
    }

    private VMwareCbtEnableMigrationInputArgs() {
        this.dataMoverRunAsAccountId = Codegen.empty();
        this.disksToInclude = Codegen.empty();
        this.instanceType = Codegen.empty();
        this.licenseType = Codegen.empty();
        this.snapshotRunAsAccountId = Codegen.empty();
        this.targetAvailabilitySetId = Codegen.empty();
        this.targetBootDiagnosticsStorageAccountId = Codegen.empty();
        this.targetNetworkId = Codegen.empty();
        this.targetResourceGroupId = Codegen.empty();
        this.targetSubnetName = Codegen.empty();
        this.targetVmName = Codegen.empty();
        this.targetVmSize = Codegen.empty();
        this.vmwareMachineId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareCbtEnableMigrationInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dataMoverRunAsAccountId;
        private Output<List<VMwareCbtDiskInputArgs>> disksToInclude;
        private Output<String> instanceType;
        private @Nullable Output<Either<String,LicenseType>> licenseType;
        private Output<String> snapshotRunAsAccountId;
        private @Nullable Output<String> targetAvailabilitySetId;
        private @Nullable Output<String> targetBootDiagnosticsStorageAccountId;
        private Output<String> targetNetworkId;
        private Output<String> targetResourceGroupId;
        private @Nullable Output<String> targetSubnetName;
        private @Nullable Output<String> targetVmName;
        private @Nullable Output<String> targetVmSize;
        private Output<String> vmwareMachineId;

        public Builder() {
    	      // Empty
        }

        public Builder(VMwareCbtEnableMigrationInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataMoverRunAsAccountId = defaults.dataMoverRunAsAccountId;
    	      this.disksToInclude = defaults.disksToInclude;
    	      this.instanceType = defaults.instanceType;
    	      this.licenseType = defaults.licenseType;
    	      this.snapshotRunAsAccountId = defaults.snapshotRunAsAccountId;
    	      this.targetAvailabilitySetId = defaults.targetAvailabilitySetId;
    	      this.targetBootDiagnosticsStorageAccountId = defaults.targetBootDiagnosticsStorageAccountId;
    	      this.targetNetworkId = defaults.targetNetworkId;
    	      this.targetResourceGroupId = defaults.targetResourceGroupId;
    	      this.targetSubnetName = defaults.targetSubnetName;
    	      this.targetVmName = defaults.targetVmName;
    	      this.targetVmSize = defaults.targetVmSize;
    	      this.vmwareMachineId = defaults.vmwareMachineId;
        }

        public Builder dataMoverRunAsAccountId(Output<String> dataMoverRunAsAccountId) {
            this.dataMoverRunAsAccountId = Objects.requireNonNull(dataMoverRunAsAccountId);
            return this;
        }
        public Builder dataMoverRunAsAccountId(String dataMoverRunAsAccountId) {
            this.dataMoverRunAsAccountId = Output.of(Objects.requireNonNull(dataMoverRunAsAccountId));
            return this;
        }
        public Builder disksToInclude(Output<List<VMwareCbtDiskInputArgs>> disksToInclude) {
            this.disksToInclude = Objects.requireNonNull(disksToInclude);
            return this;
        }
        public Builder disksToInclude(List<VMwareCbtDiskInputArgs> disksToInclude) {
            this.disksToInclude = Output.of(Objects.requireNonNull(disksToInclude));
            return this;
        }
        public Builder disksToInclude(VMwareCbtDiskInputArgs... disksToInclude) {
            return disksToInclude(List.of(disksToInclude));
        }
        public Builder instanceType(Output<String> instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Output.of(Objects.requireNonNull(instanceType));
            return this;
        }
        public Builder licenseType(@Nullable Output<Either<String,LicenseType>> licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public Builder licenseType(@Nullable Either<String,LicenseType> licenseType) {
            this.licenseType = Codegen.ofNullable(licenseType);
            return this;
        }
        public Builder snapshotRunAsAccountId(Output<String> snapshotRunAsAccountId) {
            this.snapshotRunAsAccountId = Objects.requireNonNull(snapshotRunAsAccountId);
            return this;
        }
        public Builder snapshotRunAsAccountId(String snapshotRunAsAccountId) {
            this.snapshotRunAsAccountId = Output.of(Objects.requireNonNull(snapshotRunAsAccountId));
            return this;
        }
        public Builder targetAvailabilitySetId(@Nullable Output<String> targetAvailabilitySetId) {
            this.targetAvailabilitySetId = targetAvailabilitySetId;
            return this;
        }
        public Builder targetAvailabilitySetId(@Nullable String targetAvailabilitySetId) {
            this.targetAvailabilitySetId = Codegen.ofNullable(targetAvailabilitySetId);
            return this;
        }
        public Builder targetBootDiagnosticsStorageAccountId(@Nullable Output<String> targetBootDiagnosticsStorageAccountId) {
            this.targetBootDiagnosticsStorageAccountId = targetBootDiagnosticsStorageAccountId;
            return this;
        }
        public Builder targetBootDiagnosticsStorageAccountId(@Nullable String targetBootDiagnosticsStorageAccountId) {
            this.targetBootDiagnosticsStorageAccountId = Codegen.ofNullable(targetBootDiagnosticsStorageAccountId);
            return this;
        }
        public Builder targetNetworkId(Output<String> targetNetworkId) {
            this.targetNetworkId = Objects.requireNonNull(targetNetworkId);
            return this;
        }
        public Builder targetNetworkId(String targetNetworkId) {
            this.targetNetworkId = Output.of(Objects.requireNonNull(targetNetworkId));
            return this;
        }
        public Builder targetResourceGroupId(Output<String> targetResourceGroupId) {
            this.targetResourceGroupId = Objects.requireNonNull(targetResourceGroupId);
            return this;
        }
        public Builder targetResourceGroupId(String targetResourceGroupId) {
            this.targetResourceGroupId = Output.of(Objects.requireNonNull(targetResourceGroupId));
            return this;
        }
        public Builder targetSubnetName(@Nullable Output<String> targetSubnetName) {
            this.targetSubnetName = targetSubnetName;
            return this;
        }
        public Builder targetSubnetName(@Nullable String targetSubnetName) {
            this.targetSubnetName = Codegen.ofNullable(targetSubnetName);
            return this;
        }
        public Builder targetVmName(@Nullable Output<String> targetVmName) {
            this.targetVmName = targetVmName;
            return this;
        }
        public Builder targetVmName(@Nullable String targetVmName) {
            this.targetVmName = Codegen.ofNullable(targetVmName);
            return this;
        }
        public Builder targetVmSize(@Nullable Output<String> targetVmSize) {
            this.targetVmSize = targetVmSize;
            return this;
        }
        public Builder targetVmSize(@Nullable String targetVmSize) {
            this.targetVmSize = Codegen.ofNullable(targetVmSize);
            return this;
        }
        public Builder vmwareMachineId(Output<String> vmwareMachineId) {
            this.vmwareMachineId = Objects.requireNonNull(vmwareMachineId);
            return this;
        }
        public Builder vmwareMachineId(String vmwareMachineId) {
            this.vmwareMachineId = Output.of(Objects.requireNonNull(vmwareMachineId));
            return this;
        }        public VMwareCbtEnableMigrationInputArgs build() {
            return new VMwareCbtEnableMigrationInputArgs(dataMoverRunAsAccountId, disksToInclude, instanceType, licenseType, snapshotRunAsAccountId, targetAvailabilitySetId, targetBootDiagnosticsStorageAccountId, targetNetworkId, targetResourceGroupId, targetSubnetName, targetVmName, targetVmSize, vmwareMachineId);
        }
    }
}
