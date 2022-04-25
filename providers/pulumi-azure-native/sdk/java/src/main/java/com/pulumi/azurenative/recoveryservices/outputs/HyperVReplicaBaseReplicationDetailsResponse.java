// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.azurenative.recoveryservices.outputs.DiskDetailsResponse;
import com.pulumi.azurenative.recoveryservices.outputs.InitialReplicationDetailsResponse;
import com.pulumi.azurenative.recoveryservices.outputs.VMNicDetailsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HyperVReplicaBaseReplicationDetailsResponse {
    /**
     * @return Initial replication details.
     * 
     */
    private final @Nullable InitialReplicationDetailsResponse initialReplicationDetails;
    /**
     * @return Gets the Instance type.
     * Expected value is &#39;HyperVReplicaBaseReplicationDetails&#39;.
     * 
     */
    private final String instanceType;
    /**
     * @return The Last replication time.
     * 
     */
    private final @Nullable String lastReplicatedTime;
    /**
     * @return VM disk details.
     * 
     */
    private final @Nullable List<DiskDetailsResponse> vMDiskDetails;
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
    private HyperVReplicaBaseReplicationDetailsResponse(
        @CustomType.Parameter("initialReplicationDetails") @Nullable InitialReplicationDetailsResponse initialReplicationDetails,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("lastReplicatedTime") @Nullable String lastReplicatedTime,
        @CustomType.Parameter("vMDiskDetails") @Nullable List<DiskDetailsResponse> vMDiskDetails,
        @CustomType.Parameter("vmId") @Nullable String vmId,
        @CustomType.Parameter("vmNics") @Nullable List<VMNicDetailsResponse> vmNics,
        @CustomType.Parameter("vmProtectionState") @Nullable String vmProtectionState,
        @CustomType.Parameter("vmProtectionStateDescription") @Nullable String vmProtectionStateDescription) {
        this.initialReplicationDetails = initialReplicationDetails;
        this.instanceType = instanceType;
        this.lastReplicatedTime = lastReplicatedTime;
        this.vMDiskDetails = vMDiskDetails;
        this.vmId = vmId;
        this.vmNics = vmNics;
        this.vmProtectionState = vmProtectionState;
        this.vmProtectionStateDescription = vmProtectionStateDescription;
    }

    /**
     * @return Initial replication details.
     * 
     */
    public Optional<InitialReplicationDetailsResponse> initialReplicationDetails() {
        return Optional.ofNullable(this.initialReplicationDetails);
    }
    /**
     * @return Gets the Instance type.
     * Expected value is &#39;HyperVReplicaBaseReplicationDetails&#39;.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return The Last replication time.
     * 
     */
    public Optional<String> lastReplicatedTime() {
        return Optional.ofNullable(this.lastReplicatedTime);
    }
    /**
     * @return VM disk details.
     * 
     */
    public List<DiskDetailsResponse> vMDiskDetails() {
        return this.vMDiskDetails == null ? List.of() : this.vMDiskDetails;
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

    public static Builder builder(HyperVReplicaBaseReplicationDetailsResponse defaults) {
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

        public Builder(HyperVReplicaBaseReplicationDetailsResponse defaults) {
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

        public Builder initialReplicationDetails(@Nullable InitialReplicationDetailsResponse initialReplicationDetails) {
            this.initialReplicationDetails = initialReplicationDetails;
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder lastReplicatedTime(@Nullable String lastReplicatedTime) {
            this.lastReplicatedTime = lastReplicatedTime;
            return this;
        }
        public Builder vMDiskDetails(@Nullable List<DiskDetailsResponse> vMDiskDetails) {
            this.vMDiskDetails = vMDiskDetails;
            return this;
        }
        public Builder vMDiskDetails(DiskDetailsResponse... vMDiskDetails) {
            return vMDiskDetails(List.of(vMDiskDetails));
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
        }        public HyperVReplicaBaseReplicationDetailsResponse build() {
            return new HyperVReplicaBaseReplicationDetailsResponse(initialReplicationDetails, instanceType, lastReplicatedTime, vMDiskDetails, vmId, vmNics, vmProtectionState, vmProtectionStateDescription);
        }
    }
}
