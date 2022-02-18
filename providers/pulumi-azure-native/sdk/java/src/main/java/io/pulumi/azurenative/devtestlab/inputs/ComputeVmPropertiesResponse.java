// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.inputs.ComputeDataDiskResponse;
import io.pulumi.azurenative.devtestlab.inputs.ComputeVmInstanceViewStatusResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a virtual machine returned by the Microsoft.Compute API.
 * 
 */
public final class ComputeVmPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComputeVmPropertiesResponse Empty = new ComputeVmPropertiesResponse();

    /**
     * Gets data disks blob uri for the virtual machine.
     * 
     */
    @InputImport(name="dataDiskIds")
    private final @Nullable List<String> dataDiskIds;

    public List<String> getDataDiskIds() {
        return this.dataDiskIds == null ? List.of() : this.dataDiskIds;
    }

    /**
     * Gets all data disks attached to the virtual machine.
     * 
     */
    @InputImport(name="dataDisks")
    private final @Nullable List<ComputeDataDiskResponse> dataDisks;

    public List<ComputeDataDiskResponse> getDataDisks() {
        return this.dataDisks == null ? List.of() : this.dataDisks;
    }

    /**
     * Gets the network interface ID of the virtual machine.
     * 
     */
    @InputImport(name="networkInterfaceId")
    private final @Nullable String networkInterfaceId;

    public Optional<String> getNetworkInterfaceId() {
        return this.networkInterfaceId == null ? Optional.empty() : Optional.ofNullable(this.networkInterfaceId);
    }

    /**
     * Gets OS disk blob uri for the virtual machine.
     * 
     */
    @InputImport(name="osDiskId")
    private final @Nullable String osDiskId;

    public Optional<String> getOsDiskId() {
        return this.osDiskId == null ? Optional.empty() : Optional.ofNullable(this.osDiskId);
    }

    /**
     * Gets the OS type of the virtual machine.
     * 
     */
    @InputImport(name="osType")
    private final @Nullable String osType;

    public Optional<String> getOsType() {
        return this.osType == null ? Optional.empty() : Optional.ofNullable(this.osType);
    }

    /**
     * Gets the statuses of the virtual machine.
     * 
     */
    @InputImport(name="statuses")
    private final @Nullable List<ComputeVmInstanceViewStatusResponse> statuses;

    public List<ComputeVmInstanceViewStatusResponse> getStatuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }

    /**
     * Gets the size of the virtual machine.
     * 
     */
    @InputImport(name="vmSize")
    private final @Nullable String vmSize;

    public Optional<String> getVmSize() {
        return this.vmSize == null ? Optional.empty() : Optional.ofNullable(this.vmSize);
    }

    public ComputeVmPropertiesResponse(
        @Nullable List<String> dataDiskIds,
        @Nullable List<ComputeDataDiskResponse> dataDisks,
        @Nullable String networkInterfaceId,
        @Nullable String osDiskId,
        @Nullable String osType,
        @Nullable List<ComputeVmInstanceViewStatusResponse> statuses,
        @Nullable String vmSize) {
        this.dataDiskIds = dataDiskIds;
        this.dataDisks = dataDisks;
        this.networkInterfaceId = networkInterfaceId;
        this.osDiskId = osDiskId;
        this.osType = osType;
        this.statuses = statuses;
        this.vmSize = vmSize;
    }

    private ComputeVmPropertiesResponse() {
        this.dataDiskIds = List.of();
        this.dataDisks = List.of();
        this.networkInterfaceId = null;
        this.osDiskId = null;
        this.osType = null;
        this.statuses = List.of();
        this.vmSize = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeVmPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dataDiskIds;
        private @Nullable List<ComputeDataDiskResponse> dataDisks;
        private @Nullable String networkInterfaceId;
        private @Nullable String osDiskId;
        private @Nullable String osType;
        private @Nullable List<ComputeVmInstanceViewStatusResponse> statuses;
        private @Nullable String vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeVmPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDiskIds = defaults.dataDiskIds;
    	      this.dataDisks = defaults.dataDisks;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.osDiskId = defaults.osDiskId;
    	      this.osType = defaults.osType;
    	      this.statuses = defaults.statuses;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder setDataDiskIds(@Nullable List<String> dataDiskIds) {
            this.dataDiskIds = dataDiskIds;
            return this;
        }

        public Builder setDataDisks(@Nullable List<ComputeDataDiskResponse> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }

        public Builder setNetworkInterfaceId(@Nullable String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        public Builder setOsDiskId(@Nullable String osDiskId) {
            this.osDiskId = osDiskId;
            return this;
        }

        public Builder setOsType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public Builder setStatuses(@Nullable List<ComputeVmInstanceViewStatusResponse> statuses) {
            this.statuses = statuses;
            return this;
        }

        public Builder setVmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }

        public ComputeVmPropertiesResponse build() {
            return new ComputeVmPropertiesResponse(dataDiskIds, dataDisks, networkInterfaceId, osDiskId, osType, statuses, vmSize);
        }
    }
}
