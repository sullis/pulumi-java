// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs;
import com.pulumi.gcp.compute.inputs.ReservationSpecificReservationInstancePropertiesLocalSsdArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReservationSpecificReservationInstancePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReservationSpecificReservationInstancePropertiesArgs Empty = new ReservationSpecificReservationInstancePropertiesArgs();

    /**
     * Guest accelerator type and count.
     * Structure is documented below.
     * 
     */
    @Import(name="guestAccelerators")
    private @Nullable Output<List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs>> guestAccelerators;

    /**
     * @return Guest accelerator type and count.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs>>> guestAccelerators() {
        return Optional.ofNullable(this.guestAccelerators);
    }

    /**
     * The amount of local ssd to reserve with each instance. This
     * reserves disks of type `local-ssd`.
     * Structure is documented below.
     * 
     */
    @Import(name="localSsds")
    private @Nullable Output<List<ReservationSpecificReservationInstancePropertiesLocalSsdArgs>> localSsds;

    /**
     * @return The amount of local ssd to reserve with each instance. This
     * reserves disks of type `local-ssd`.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ReservationSpecificReservationInstancePropertiesLocalSsdArgs>>> localSsds() {
        return Optional.ofNullable(this.localSsds);
    }

    /**
     * The name of the machine type to reserve.
     * 
     */
    @Import(name="machineType", required=true)
    private Output<String> machineType;

    /**
     * @return The name of the machine type to reserve.
     * 
     */
    public Output<String> machineType() {
        return this.machineType;
    }

    /**
     * The minimum CPU platform for the reservation. For example,
     * `&#34;Intel Skylake&#34;`. See
     * the CPU platform availability reference](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform#availablezones)
     * for information on available CPU platforms.
     * 
     */
    @Import(name="minCpuPlatform")
    private @Nullable Output<String> minCpuPlatform;

    /**
     * @return The minimum CPU platform for the reservation. For example,
     * `&#34;Intel Skylake&#34;`. See
     * the CPU platform availability reference](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform#availablezones)
     * for information on available CPU platforms.
     * 
     */
    public Optional<Output<String>> minCpuPlatform() {
        return Optional.ofNullable(this.minCpuPlatform);
    }

    private ReservationSpecificReservationInstancePropertiesArgs() {}

    private ReservationSpecificReservationInstancePropertiesArgs(ReservationSpecificReservationInstancePropertiesArgs $) {
        this.guestAccelerators = $.guestAccelerators;
        this.localSsds = $.localSsds;
        this.machineType = $.machineType;
        this.minCpuPlatform = $.minCpuPlatform;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReservationSpecificReservationInstancePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReservationSpecificReservationInstancePropertiesArgs $;

        public Builder() {
            $ = new ReservationSpecificReservationInstancePropertiesArgs();
        }

        public Builder(ReservationSpecificReservationInstancePropertiesArgs defaults) {
            $ = new ReservationSpecificReservationInstancePropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param guestAccelerators Guest accelerator type and count.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder guestAccelerators(@Nullable Output<List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs>> guestAccelerators) {
            $.guestAccelerators = guestAccelerators;
            return this;
        }

        /**
         * @param guestAccelerators Guest accelerator type and count.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder guestAccelerators(List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs> guestAccelerators) {
            return guestAccelerators(Output.of(guestAccelerators));
        }

        /**
         * @param guestAccelerators Guest accelerator type and count.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder guestAccelerators(ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs... guestAccelerators) {
            return guestAccelerators(List.of(guestAccelerators));
        }

        /**
         * @param localSsds The amount of local ssd to reserve with each instance. This
         * reserves disks of type `local-ssd`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder localSsds(@Nullable Output<List<ReservationSpecificReservationInstancePropertiesLocalSsdArgs>> localSsds) {
            $.localSsds = localSsds;
            return this;
        }

        /**
         * @param localSsds The amount of local ssd to reserve with each instance. This
         * reserves disks of type `local-ssd`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder localSsds(List<ReservationSpecificReservationInstancePropertiesLocalSsdArgs> localSsds) {
            return localSsds(Output.of(localSsds));
        }

        /**
         * @param localSsds The amount of local ssd to reserve with each instance. This
         * reserves disks of type `local-ssd`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder localSsds(ReservationSpecificReservationInstancePropertiesLocalSsdArgs... localSsds) {
            return localSsds(List.of(localSsds));
        }

        /**
         * @param machineType The name of the machine type to reserve.
         * 
         * @return builder
         * 
         */
        public Builder machineType(Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        /**
         * @param machineType The name of the machine type to reserve.
         * 
         * @return builder
         * 
         */
        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        /**
         * @param minCpuPlatform The minimum CPU platform for the reservation. For example,
         * `&#34;Intel Skylake&#34;`. See
         * the CPU platform availability reference](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform#availablezones)
         * for information on available CPU platforms.
         * 
         * @return builder
         * 
         */
        public Builder minCpuPlatform(@Nullable Output<String> minCpuPlatform) {
            $.minCpuPlatform = minCpuPlatform;
            return this;
        }

        /**
         * @param minCpuPlatform The minimum CPU platform for the reservation. For example,
         * `&#34;Intel Skylake&#34;`. See
         * the CPU platform availability reference](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform#availablezones)
         * for information on available CPU platforms.
         * 
         * @return builder
         * 
         */
        public Builder minCpuPlatform(String minCpuPlatform) {
            return minCpuPlatform(Output.of(minCpuPlatform));
        }

        public ReservationSpecificReservationInstancePropertiesArgs build() {
            $.machineType = Objects.requireNonNull($.machineType, "expected parameter 'machineType' to be non-null");
            return $;
        }
    }

}
