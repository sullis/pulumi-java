// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.inputs.AcceleratorConfigArgs;
import com.pulumi.googlenative.compute_v1.inputs.AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the SKU instances being reserved. Next ID: 9
 * 
 */
public final class AllocationSpecificSKUAllocationReservedInstancePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final AllocationSpecificSKUAllocationReservedInstancePropertiesArgs Empty = new AllocationSpecificSKUAllocationReservedInstancePropertiesArgs();

    /**
     * Specifies accelerator type and count.
     * 
     */
    @Import(name="guestAccelerators")
    private @Nullable Output<List<AcceleratorConfigArgs>> guestAccelerators;

    /**
     * @return Specifies accelerator type and count.
     * 
     */
    public Optional<Output<List<AcceleratorConfigArgs>>> guestAccelerators() {
        return Optional.ofNullable(this.guestAccelerators);
    }

    /**
     * Specifies amount of local ssd to reserve with each instance. The type of disk is local-ssd.
     * 
     */
    @Import(name="localSsds")
    private @Nullable Output<List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs>> localSsds;

    /**
     * @return Specifies amount of local ssd to reserve with each instance. The type of disk is local-ssd.
     * 
     */
    public Optional<Output<List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs>>> localSsds() {
        return Optional.ofNullable(this.localSsds);
    }

    /**
     * An opaque location hint used to place the allocation close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    @Import(name="locationHint")
    private @Nullable Output<String> locationHint;

    /**
     * @return An opaque location hint used to place the allocation close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    public Optional<Output<String>> locationHint() {
        return Optional.ofNullable(this.locationHint);
    }

    /**
     * Specifies type of machine (name only) which has fixed number of vCPUs and fixed amount of memory. This also includes specifying custom machine type following custom-NUMBER_OF_CPUS-AMOUNT_OF_MEMORY pattern.
     * 
     */
    @Import(name="machineType")
    private @Nullable Output<String> machineType;

    /**
     * @return Specifies type of machine (name only) which has fixed number of vCPUs and fixed amount of memory. This also includes specifying custom machine type following custom-NUMBER_OF_CPUS-AMOUNT_OF_MEMORY pattern.
     * 
     */
    public Optional<Output<String>> machineType() {
        return Optional.ofNullable(this.machineType);
    }

    /**
     * Minimum cpu platform the reservation.
     * 
     */
    @Import(name="minCpuPlatform")
    private @Nullable Output<String> minCpuPlatform;

    /**
     * @return Minimum cpu platform the reservation.
     * 
     */
    public Optional<Output<String>> minCpuPlatform() {
        return Optional.ofNullable(this.minCpuPlatform);
    }

    private AllocationSpecificSKUAllocationReservedInstancePropertiesArgs() {}

    private AllocationSpecificSKUAllocationReservedInstancePropertiesArgs(AllocationSpecificSKUAllocationReservedInstancePropertiesArgs $) {
        this.guestAccelerators = $.guestAccelerators;
        this.localSsds = $.localSsds;
        this.locationHint = $.locationHint;
        this.machineType = $.machineType;
        this.minCpuPlatform = $.minCpuPlatform;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AllocationSpecificSKUAllocationReservedInstancePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AllocationSpecificSKUAllocationReservedInstancePropertiesArgs $;

        public Builder() {
            $ = new AllocationSpecificSKUAllocationReservedInstancePropertiesArgs();
        }

        public Builder(AllocationSpecificSKUAllocationReservedInstancePropertiesArgs defaults) {
            $ = new AllocationSpecificSKUAllocationReservedInstancePropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param guestAccelerators Specifies accelerator type and count.
         * 
         * @return builder
         * 
         */
        public Builder guestAccelerators(@Nullable Output<List<AcceleratorConfigArgs>> guestAccelerators) {
            $.guestAccelerators = guestAccelerators;
            return this;
        }

        /**
         * @param guestAccelerators Specifies accelerator type and count.
         * 
         * @return builder
         * 
         */
        public Builder guestAccelerators(List<AcceleratorConfigArgs> guestAccelerators) {
            return guestAccelerators(Output.of(guestAccelerators));
        }

        /**
         * @param guestAccelerators Specifies accelerator type and count.
         * 
         * @return builder
         * 
         */
        public Builder guestAccelerators(AcceleratorConfigArgs... guestAccelerators) {
            return guestAccelerators(List.of(guestAccelerators));
        }

        /**
         * @param localSsds Specifies amount of local ssd to reserve with each instance. The type of disk is local-ssd.
         * 
         * @return builder
         * 
         */
        public Builder localSsds(@Nullable Output<List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs>> localSsds) {
            $.localSsds = localSsds;
            return this;
        }

        /**
         * @param localSsds Specifies amount of local ssd to reserve with each instance. The type of disk is local-ssd.
         * 
         * @return builder
         * 
         */
        public Builder localSsds(List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs> localSsds) {
            return localSsds(Output.of(localSsds));
        }

        /**
         * @param localSsds Specifies amount of local ssd to reserve with each instance. The type of disk is local-ssd.
         * 
         * @return builder
         * 
         */
        public Builder localSsds(AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs... localSsds) {
            return localSsds(List.of(localSsds));
        }

        /**
         * @param locationHint An opaque location hint used to place the allocation close to other resources. This field is for use by internal tools that use the public API.
         * 
         * @return builder
         * 
         */
        public Builder locationHint(@Nullable Output<String> locationHint) {
            $.locationHint = locationHint;
            return this;
        }

        /**
         * @param locationHint An opaque location hint used to place the allocation close to other resources. This field is for use by internal tools that use the public API.
         * 
         * @return builder
         * 
         */
        public Builder locationHint(String locationHint) {
            return locationHint(Output.of(locationHint));
        }

        /**
         * @param machineType Specifies type of machine (name only) which has fixed number of vCPUs and fixed amount of memory. This also includes specifying custom machine type following custom-NUMBER_OF_CPUS-AMOUNT_OF_MEMORY pattern.
         * 
         * @return builder
         * 
         */
        public Builder machineType(@Nullable Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        /**
         * @param machineType Specifies type of machine (name only) which has fixed number of vCPUs and fixed amount of memory. This also includes specifying custom machine type following custom-NUMBER_OF_CPUS-AMOUNT_OF_MEMORY pattern.
         * 
         * @return builder
         * 
         */
        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        /**
         * @param minCpuPlatform Minimum cpu platform the reservation.
         * 
         * @return builder
         * 
         */
        public Builder minCpuPlatform(@Nullable Output<String> minCpuPlatform) {
            $.minCpuPlatform = minCpuPlatform;
            return this;
        }

        /**
         * @param minCpuPlatform Minimum cpu platform the reservation.
         * 
         * @return builder
         * 
         */
        public Builder minCpuPlatform(String minCpuPlatform) {
            return minCpuPlatform(Output.of(minCpuPlatform));
        }

        public AllocationSpecificSKUAllocationReservedInstancePropertiesArgs build() {
            return $;
        }
    }

}
