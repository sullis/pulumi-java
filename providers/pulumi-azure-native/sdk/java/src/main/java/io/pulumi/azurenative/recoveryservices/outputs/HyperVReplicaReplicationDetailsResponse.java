// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.DiskDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.InitialReplicationDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.VMNicDetailsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HyperVReplicaReplicationDetailsResponse {
    /**
     * Initial replication details.
     * 
     */
    private final @Nullable InitialReplicationDetailsResponse initialReplicationDetails;
    /**
     * Gets the Instance type.
     * Expected value is 'HyperVReplica2012'.
     * 
     */
    private final String instanceType;
    /**
     * The Last replication time.
     * 
     */
    private final @Nullable String lastReplicatedTime;
    /**
     * VM disk details.
     * 
     */
    private final @Nullable List<DiskDetailsResponse> vMDiskDetails;
    /**
     * The virtual machine Id.
     * 
     */
    private final @Nullable String vmId;
    /**
     * The PE Network details.
     * 
     */
    private final @Nullable List<VMNicDetailsResponse> vmNics;
    /**
     * The protection state for the vm.
     * 
     */
    private final @Nullable String vmProtectionState;
    /**
     * The protection state description for the vm.
     * 
     */
    private final @Nullable String vmProtectionStateDescription;

    @OutputCustomType.Constructor({"initialReplicationDetails","instanceType","lastReplicatedTime","vMDiskDetails","vmId","vmNics","vmProtectionState","vmProtectionStateDescription"})
    private HyperVReplicaReplicationDetailsResponse(
        @Nullable InitialReplicationDetailsResponse initialReplicationDetails,
        String instanceType,
        @Nullable String lastReplicatedTime,
        @Nullable List<DiskDetailsResponse> vMDiskDetails,
        @Nullable String vmId,
        @Nullable List<VMNicDetailsResponse> vmNics,
        @Nullable String vmProtectionState,
        @Nullable String vmProtectionStateDescription) {
        this.initialReplicationDetails = initialReplicationDetails;
        this.instanceType = Objects.requireNonNull(instanceType);
        this.lastReplicatedTime = lastReplicatedTime;
        this.vMDiskDetails = vMDiskDetails;
        this.vmId = vmId;
        this.vmNics = vmNics;
        this.vmProtectionState = vmProtectionState;
        this.vmProtectionStateDescription = vmProtectionStateDescription;
    }

    /**
     * Initial replication details.
     * 
     */
    public Optional<InitialReplicationDetailsResponse> getInitialReplicationDetails() {
        return Optional.ofNullable(this.initialReplicationDetails);
    }
    /**
     * Gets the Instance type.
     * Expected value is 'HyperVReplica2012'.
     * 
     */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * The Last replication time.
     * 
     */
    public Optional<String> getLastReplicatedTime() {
        return Optional.ofNullable(this.lastReplicatedTime);
    }
    /**
     * VM disk details.
     * 
     */
    public List<DiskDetailsResponse> getVMDiskDetails() {
        return this.vMDiskDetails == null ? List.of() : this.vMDiskDetails;
    }
    /**
     * The virtual machine Id.
     * 
     */
    public Optional<String> getVmId() {
        return Optional.ofNullable(this.vmId);
    }
    /**
     * The PE Network details.
     * 
     */
    public List<VMNicDetailsResponse> getVmNics() {
        return this.vmNics == null ? List.of() : this.vmNics;
    }
    /**
     * The protection state for the vm.
     * 
     */
    public Optional<String> getVmProtectionState() {
        return Optional.ofNullable(this.vmProtectionState);
    }
    /**
     * The protection state description for the vm.
     * 
     */
    public Optional<String> getVmProtectionStateDescription() {
        return Optional.ofNullable(this.vmProtectionStateDescription);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HyperVReplicaReplicationDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable InitialReplicationDetailsResponse initialReplicationDetails;
        private String instanceType;
        private @Nullable String lastReplicatedTime;
        private @Nullable List<DiskDetailsResponse> vMDiskDetails;
        private @Nullable String vmId;
        private @Nullable List<VMNicDetailsResponse> vmNics;
        private @Nullable String vmProtectionState;
        private @Nullable String vmProtectionStateDescription;

        public Builder() {
    	      // Empty
        }

        public Builder(HyperVReplicaReplicationDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.initialReplicationDetails = defaults.initialReplicationDetails;
    	      this.instanceType = defaults.instanceType;
    	      this.lastReplicatedTime = defaults.lastReplicatedTime;
    	      this.vMDiskDetails = defaults.vMDiskDetails;
    	      this.vmId = defaults.vmId;
    	      this.vmNics = defaults.vmNics;
    	      this.vmProtectionState = defaults.vmProtectionState;
    	      this.vmProtectionStateDescription = defaults.vmProtectionStateDescription;
        }

        public Builder setInitialReplicationDetails(@Nullable InitialReplicationDetailsResponse initialReplicationDetails) {
            this.initialReplicationDetails = initialReplicationDetails;
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setLastReplicatedTime(@Nullable String lastReplicatedTime) {
            this.lastReplicatedTime = lastReplicatedTime;
            return this;
        }

        public Builder setVMDiskDetails(@Nullable List<DiskDetailsResponse> vMDiskDetails) {
            this.vMDiskDetails = vMDiskDetails;
            return this;
        }

        public Builder setVmId(@Nullable String vmId) {
            this.vmId = vmId;
            return this;
        }

        public Builder setVmNics(@Nullable List<VMNicDetailsResponse> vmNics) {
            this.vmNics = vmNics;
            return this;
        }

        public Builder setVmProtectionState(@Nullable String vmProtectionState) {
            this.vmProtectionState = vmProtectionState;
            return this;
        }

        public Builder setVmProtectionStateDescription(@Nullable String vmProtectionStateDescription) {
            this.vmProtectionStateDescription = vmProtectionStateDescription;
            return this;
        }

        public HyperVReplicaReplicationDetailsResponse build() {
            return new HyperVReplicaReplicationDetailsResponse(initialReplicationDetails, instanceType, lastReplicatedTime, vMDiskDetails, vmId, vmNics, vmProtectionState, vmProtectionStateDescription);
        }
    }
}
