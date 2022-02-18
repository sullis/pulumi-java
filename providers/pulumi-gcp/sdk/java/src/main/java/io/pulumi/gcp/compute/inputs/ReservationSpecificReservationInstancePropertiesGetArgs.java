// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.ReservationSpecificReservationInstancePropertiesGuestAcceleratorGetArgs;
import io.pulumi.gcp.compute.inputs.ReservationSpecificReservationInstancePropertiesLocalSsdGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReservationSpecificReservationInstancePropertiesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReservationSpecificReservationInstancePropertiesGetArgs Empty = new ReservationSpecificReservationInstancePropertiesGetArgs();

    /**
     * Guest accelerator type and count.
     * Structure is documented below.
     * 
     */
    @InputImport(name="guestAccelerators")
    private final @Nullable Input<List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorGetArgs>> guestAccelerators;

    public Input<List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorGetArgs>> getGuestAccelerators() {
        return this.guestAccelerators == null ? Input.empty() : this.guestAccelerators;
    }

    /**
     * The amount of local ssd to reserve with each instance. This
     * reserves disks of type `local-ssd`.
     * Structure is documented below.
     * 
     */
    @InputImport(name="localSsds")
    private final @Nullable Input<List<ReservationSpecificReservationInstancePropertiesLocalSsdGetArgs>> localSsds;

    public Input<List<ReservationSpecificReservationInstancePropertiesLocalSsdGetArgs>> getLocalSsds() {
        return this.localSsds == null ? Input.empty() : this.localSsds;
    }

    /**
     * The name of the machine type to reserve.
     * 
     */
    @InputImport(name="machineType", required=true)
    private final Input<String> machineType;

    public Input<String> getMachineType() {
        return this.machineType;
    }

    /**
     * The minimum CPU platform for the reservation. For example,
     * `"Intel Skylake"`. See
     * the CPU platform availability reference](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform#availablezones)
     * for information on available CPU platforms.
     * 
     */
    @InputImport(name="minCpuPlatform")
    private final @Nullable Input<String> minCpuPlatform;

    public Input<String> getMinCpuPlatform() {
        return this.minCpuPlatform == null ? Input.empty() : this.minCpuPlatform;
    }

    public ReservationSpecificReservationInstancePropertiesGetArgs(
        @Nullable Input<List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorGetArgs>> guestAccelerators,
        @Nullable Input<List<ReservationSpecificReservationInstancePropertiesLocalSsdGetArgs>> localSsds,
        Input<String> machineType,
        @Nullable Input<String> minCpuPlatform) {
        this.guestAccelerators = guestAccelerators;
        this.localSsds = localSsds;
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.minCpuPlatform = minCpuPlatform;
    }

    private ReservationSpecificReservationInstancePropertiesGetArgs() {
        this.guestAccelerators = Input.empty();
        this.localSsds = Input.empty();
        this.machineType = Input.empty();
        this.minCpuPlatform = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationSpecificReservationInstancePropertiesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorGetArgs>> guestAccelerators;
        private @Nullable Input<List<ReservationSpecificReservationInstancePropertiesLocalSsdGetArgs>> localSsds;
        private Input<String> machineType;
        private @Nullable Input<String> minCpuPlatform;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationSpecificReservationInstancePropertiesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.localSsds = defaults.localSsds;
    	      this.machineType = defaults.machineType;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
        }

        public Builder setGuestAccelerators(@Nullable Input<List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorGetArgs>> guestAccelerators) {
            this.guestAccelerators = guestAccelerators;
            return this;
        }

        public Builder setGuestAccelerators(@Nullable List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorGetArgs> guestAccelerators) {
            this.guestAccelerators = Input.ofNullable(guestAccelerators);
            return this;
        }

        public Builder setLocalSsds(@Nullable Input<List<ReservationSpecificReservationInstancePropertiesLocalSsdGetArgs>> localSsds) {
            this.localSsds = localSsds;
            return this;
        }

        public Builder setLocalSsds(@Nullable List<ReservationSpecificReservationInstancePropertiesLocalSsdGetArgs> localSsds) {
            this.localSsds = Input.ofNullable(localSsds);
            return this;
        }

        public Builder setMachineType(Input<String> machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Input.of(Objects.requireNonNull(machineType));
            return this;
        }

        public Builder setMinCpuPlatform(@Nullable Input<String> minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }

        public Builder setMinCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = Input.ofNullable(minCpuPlatform);
            return this;
        }

        public ReservationSpecificReservationInstancePropertiesGetArgs build() {
            return new ReservationSpecificReservationInstancePropertiesGetArgs(guestAccelerators, localSsds, machineType, minCpuPlatform);
        }
    }
}
