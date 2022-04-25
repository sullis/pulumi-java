// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.azurenative.recoveryservices.outputs.VMwareCbtNicDetailsResponse;
import com.pulumi.azurenative.recoveryservices.outputs.VMwareCbtProtectedDiskDetailsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VMwareCbtMigrationDetailsResponse {
    /**
     * @return The data mover RunAs account Id.
     * 
     */
    private final String dataMoverRunAsAccountId;
    /**
     * @return Gets the instance type.
     * Expected value is &#39;VMwareCbt&#39;.
     * 
     */
    private final String instanceType;
    /**
     * @return The last recovery point received time.
     * 
     */
    private final String lastRecoveryPointReceived;
    /**
     * @return License Type of the VM to be used.
     * 
     */
    private final @Nullable String licenseType;
    /**
     * @return The recovery point Id to which the VM was migrated.
     * 
     */
    private final String migrationRecoveryPointId;
    /**
     * @return The type of the OS on the VM.
     * 
     */
    private final String osType;
    /**
     * @return The list of protected disks.
     * 
     */
    private final @Nullable List<VMwareCbtProtectedDiskDetailsResponse> protectedDisks;
    /**
     * @return The snapshot RunAs account Id.
     * 
     */
    private final String snapshotRunAsAccountId;
    /**
     * @return The target availability set Id.
     * 
     */
    private final @Nullable String targetAvailabilitySetId;
    /**
     * @return The target boot diagnostics storage account ARM Id.
     * 
     */
    private final @Nullable String targetBootDiagnosticsStorageAccountId;
    /**
     * @return The target location.
     * 
     */
    private final String targetLocation;
    /**
     * @return The target network Id.
     * 
     */
    private final @Nullable String targetNetworkId;
    /**
     * @return The target resource group Id.
     * 
     */
    private final @Nullable String targetResourceGroupId;
    /**
     * @return Target VM name.
     * 
     */
    private final @Nullable String targetVmName;
    /**
     * @return The target VM size.
     * 
     */
    private final @Nullable String targetVmSize;
    /**
     * @return The network details.
     * 
     */
    private final @Nullable List<VMwareCbtNicDetailsResponse> vmNics;
    /**
     * @return The ARM Id of the VM discovered in VMware.
     * 
     */
    private final String vmwareMachineId;

    @CustomType.Constructor
    private VMwareCbtMigrationDetailsResponse(
        @CustomType.Parameter("dataMoverRunAsAccountId") String dataMoverRunAsAccountId,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("lastRecoveryPointReceived") String lastRecoveryPointReceived,
        @CustomType.Parameter("licenseType") @Nullable String licenseType,
        @CustomType.Parameter("migrationRecoveryPointId") String migrationRecoveryPointId,
        @CustomType.Parameter("osType") String osType,
        @CustomType.Parameter("protectedDisks") @Nullable List<VMwareCbtProtectedDiskDetailsResponse> protectedDisks,
        @CustomType.Parameter("snapshotRunAsAccountId") String snapshotRunAsAccountId,
        @CustomType.Parameter("targetAvailabilitySetId") @Nullable String targetAvailabilitySetId,
        @CustomType.Parameter("targetBootDiagnosticsStorageAccountId") @Nullable String targetBootDiagnosticsStorageAccountId,
        @CustomType.Parameter("targetLocation") String targetLocation,
        @CustomType.Parameter("targetNetworkId") @Nullable String targetNetworkId,
        @CustomType.Parameter("targetResourceGroupId") @Nullable String targetResourceGroupId,
        @CustomType.Parameter("targetVmName") @Nullable String targetVmName,
        @CustomType.Parameter("targetVmSize") @Nullable String targetVmSize,
        @CustomType.Parameter("vmNics") @Nullable List<VMwareCbtNicDetailsResponse> vmNics,
        @CustomType.Parameter("vmwareMachineId") String vmwareMachineId) {
        this.dataMoverRunAsAccountId = dataMoverRunAsAccountId;
        this.instanceType = instanceType;
        this.lastRecoveryPointReceived = lastRecoveryPointReceived;
        this.licenseType = licenseType;
        this.migrationRecoveryPointId = migrationRecoveryPointId;
        this.osType = osType;
        this.protectedDisks = protectedDisks;
        this.snapshotRunAsAccountId = snapshotRunAsAccountId;
        this.targetAvailabilitySetId = targetAvailabilitySetId;
        this.targetBootDiagnosticsStorageAccountId = targetBootDiagnosticsStorageAccountId;
        this.targetLocation = targetLocation;
        this.targetNetworkId = targetNetworkId;
        this.targetResourceGroupId = targetResourceGroupId;
        this.targetVmName = targetVmName;
        this.targetVmSize = targetVmSize;
        this.vmNics = vmNics;
        this.vmwareMachineId = vmwareMachineId;
    }

    /**
     * @return The data mover RunAs account Id.
     * 
     */
    public String dataMoverRunAsAccountId() {
        return this.dataMoverRunAsAccountId;
    }
    /**
     * @return Gets the instance type.
     * Expected value is &#39;VMwareCbt&#39;.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return The last recovery point received time.
     * 
     */
    public String lastRecoveryPointReceived() {
        return this.lastRecoveryPointReceived;
    }
    /**
     * @return License Type of the VM to be used.
     * 
     */
    public Optional<String> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }
    /**
     * @return The recovery point Id to which the VM was migrated.
     * 
     */
    public String migrationRecoveryPointId() {
        return this.migrationRecoveryPointId;
    }
    /**
     * @return The type of the OS on the VM.
     * 
     */
    public String osType() {
        return this.osType;
    }
    /**
     * @return The list of protected disks.
     * 
     */
    public List<VMwareCbtProtectedDiskDetailsResponse> protectedDisks() {
        return this.protectedDisks == null ? List.of() : this.protectedDisks;
    }
    /**
     * @return The snapshot RunAs account Id.
     * 
     */
    public String snapshotRunAsAccountId() {
        return this.snapshotRunAsAccountId;
    }
    /**
     * @return The target availability set Id.
     * 
     */
    public Optional<String> targetAvailabilitySetId() {
        return Optional.ofNullable(this.targetAvailabilitySetId);
    }
    /**
     * @return The target boot diagnostics storage account ARM Id.
     * 
     */
    public Optional<String> targetBootDiagnosticsStorageAccountId() {
        return Optional.ofNullable(this.targetBootDiagnosticsStorageAccountId);
    }
    /**
     * @return The target location.
     * 
     */
    public String targetLocation() {
        return this.targetLocation;
    }
    /**
     * @return The target network Id.
     * 
     */
    public Optional<String> targetNetworkId() {
        return Optional.ofNullable(this.targetNetworkId);
    }
    /**
     * @return The target resource group Id.
     * 
     */
    public Optional<String> targetResourceGroupId() {
        return Optional.ofNullable(this.targetResourceGroupId);
    }
    /**
     * @return Target VM name.
     * 
     */
    public Optional<String> targetVmName() {
        return Optional.ofNullable(this.targetVmName);
    }
    /**
     * @return The target VM size.
     * 
     */
    public Optional<String> targetVmSize() {
        return Optional.ofNullable(this.targetVmSize);
    }
    /**
     * @return The network details.
     * 
     */
    public List<VMwareCbtNicDetailsResponse> vmNics() {
        return this.vmNics == null ? List.of() : this.vmNics;
    }
    /**
     * @return The ARM Id of the VM discovered in VMware.
     * 
     */
    public String vmwareMachineId() {
        return this.vmwareMachineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareCbtMigrationDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataMoverRunAsAccountId;
        private String instanceType;
        private String lastRecoveryPointReceived;
        private @Nullable String licenseType;
        private String migrationRecoveryPointId;
        private String osType;
        private @Nullable List<VMwareCbtProtectedDiskDetailsResponse> protectedDisks;
        private String snapshotRunAsAccountId;
        private @Nullable String targetAvailabilitySetId;
        private @Nullable String targetBootDiagnosticsStorageAccountId;
        private String targetLocation;
        private @Nullable String targetNetworkId;
        private @Nullable String targetResourceGroupId;
        private @Nullable String targetVmName;
        private @Nullable String targetVmSize;
        private @Nullable List<VMwareCbtNicDetailsResponse> vmNics;
        private String vmwareMachineId;

        public Builder() {
    	      // Empty
        }

        public Builder(VMwareCbtMigrationDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataMoverRunAsAccountId = defaults.dataMoverRunAsAccountId;
    	      this.instanceType = defaults.instanceType;
    	      this.lastRecoveryPointReceived = defaults.lastRecoveryPointReceived;
    	      this.licenseType = defaults.licenseType;
    	      this.migrationRecoveryPointId = defaults.migrationRecoveryPointId;
    	      this.osType = defaults.osType;
    	      this.protectedDisks = defaults.protectedDisks;
    	      this.snapshotRunAsAccountId = defaults.snapshotRunAsAccountId;
    	      this.targetAvailabilitySetId = defaults.targetAvailabilitySetId;
    	      this.targetBootDiagnosticsStorageAccountId = defaults.targetBootDiagnosticsStorageAccountId;
    	      this.targetLocation = defaults.targetLocation;
    	      this.targetNetworkId = defaults.targetNetworkId;
    	      this.targetResourceGroupId = defaults.targetResourceGroupId;
    	      this.targetVmName = defaults.targetVmName;
    	      this.targetVmSize = defaults.targetVmSize;
    	      this.vmNics = defaults.vmNics;
    	      this.vmwareMachineId = defaults.vmwareMachineId;
        }

        public Builder dataMoverRunAsAccountId(String dataMoverRunAsAccountId) {
            this.dataMoverRunAsAccountId = Objects.requireNonNull(dataMoverRunAsAccountId);
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder lastRecoveryPointReceived(String lastRecoveryPointReceived) {
            this.lastRecoveryPointReceived = Objects.requireNonNull(lastRecoveryPointReceived);
            return this;
        }
        public Builder licenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public Builder migrationRecoveryPointId(String migrationRecoveryPointId) {
            this.migrationRecoveryPointId = Objects.requireNonNull(migrationRecoveryPointId);
            return this;
        }
        public Builder osType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }
        public Builder protectedDisks(@Nullable List<VMwareCbtProtectedDiskDetailsResponse> protectedDisks) {
            this.protectedDisks = protectedDisks;
            return this;
        }
        public Builder protectedDisks(VMwareCbtProtectedDiskDetailsResponse... protectedDisks) {
            return protectedDisks(List.of(protectedDisks));
        }
        public Builder snapshotRunAsAccountId(String snapshotRunAsAccountId) {
            this.snapshotRunAsAccountId = Objects.requireNonNull(snapshotRunAsAccountId);
            return this;
        }
        public Builder targetAvailabilitySetId(@Nullable String targetAvailabilitySetId) {
            this.targetAvailabilitySetId = targetAvailabilitySetId;
            return this;
        }
        public Builder targetBootDiagnosticsStorageAccountId(@Nullable String targetBootDiagnosticsStorageAccountId) {
            this.targetBootDiagnosticsStorageAccountId = targetBootDiagnosticsStorageAccountId;
            return this;
        }
        public Builder targetLocation(String targetLocation) {
            this.targetLocation = Objects.requireNonNull(targetLocation);
            return this;
        }
        public Builder targetNetworkId(@Nullable String targetNetworkId) {
            this.targetNetworkId = targetNetworkId;
            return this;
        }
        public Builder targetResourceGroupId(@Nullable String targetResourceGroupId) {
            this.targetResourceGroupId = targetResourceGroupId;
            return this;
        }
        public Builder targetVmName(@Nullable String targetVmName) {
            this.targetVmName = targetVmName;
            return this;
        }
        public Builder targetVmSize(@Nullable String targetVmSize) {
            this.targetVmSize = targetVmSize;
            return this;
        }
        public Builder vmNics(@Nullable List<VMwareCbtNicDetailsResponse> vmNics) {
            this.vmNics = vmNics;
            return this;
        }
        public Builder vmNics(VMwareCbtNicDetailsResponse... vmNics) {
            return vmNics(List.of(vmNics));
        }
        public Builder vmwareMachineId(String vmwareMachineId) {
            this.vmwareMachineId = Objects.requireNonNull(vmwareMachineId);
            return this;
        }        public VMwareCbtMigrationDetailsResponse build() {
            return new VMwareCbtMigrationDetailsResponse(dataMoverRunAsAccountId, instanceType, lastRecoveryPointReceived, licenseType, migrationRecoveryPointId, osType, protectedDisks, snapshotRunAsAccountId, targetAvailabilitySetId, targetBootDiagnosticsStorageAccountId, targetLocation, targetNetworkId, targetResourceGroupId, targetVmName, targetVmSize, vmNics, vmwareMachineId);
        }
    }
}
