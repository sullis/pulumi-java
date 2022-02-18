// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourcePolicyGroupPlacementPolicy {
    /**
     * The number of availability domains instances will be spread across. If two instances are in different
     * availability domain, they will not be put in the same low latency network
     * 
     */
    private final @Nullable Integer availabilityDomainCount;
    /**
     * Collocation specifies whether to place VMs inside the same availability domain on the same low-latency network.
     * Specify `COLLOCATED` to enable collocation. Can only be specified with `vm_count`. If compute instances are created
     * with a COLLOCATED policy, then exactly `vm_count` instances must be created at the same time with the resource policy
     * attached.
     * Possible values are `COLLOCATED`.
     * 
     */
    private final @Nullable String collocation;
    /**
     * Number of vms in this placement group.
     * 
     */
    private final @Nullable Integer vmCount;

    @OutputCustomType.Constructor({"availabilityDomainCount","collocation","vmCount"})
    private ResourcePolicyGroupPlacementPolicy(
        @Nullable Integer availabilityDomainCount,
        @Nullable String collocation,
        @Nullable Integer vmCount) {
        this.availabilityDomainCount = availabilityDomainCount;
        this.collocation = collocation;
        this.vmCount = vmCount;
    }

    /**
     * The number of availability domains instances will be spread across. If two instances are in different
     * availability domain, they will not be put in the same low latency network
     * 
     */
    public Optional<Integer> getAvailabilityDomainCount() {
        return Optional.ofNullable(this.availabilityDomainCount);
    }
    /**
     * Collocation specifies whether to place VMs inside the same availability domain on the same low-latency network.
     * Specify `COLLOCATED` to enable collocation. Can only be specified with `vm_count`. If compute instances are created
     * with a COLLOCATED policy, then exactly `vm_count` instances must be created at the same time with the resource policy
     * attached.
     * Possible values are `COLLOCATED`.
     * 
     */
    public Optional<String> getCollocation() {
        return Optional.ofNullable(this.collocation);
    }
    /**
     * Number of vms in this placement group.
     * 
     */
    public Optional<Integer> getVmCount() {
        return Optional.ofNullable(this.vmCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyGroupPlacementPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer availabilityDomainCount;
        private @Nullable String collocation;
        private @Nullable Integer vmCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyGroupPlacementPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityDomainCount = defaults.availabilityDomainCount;
    	      this.collocation = defaults.collocation;
    	      this.vmCount = defaults.vmCount;
        }

        public Builder setAvailabilityDomainCount(@Nullable Integer availabilityDomainCount) {
            this.availabilityDomainCount = availabilityDomainCount;
            return this;
        }

        public Builder setCollocation(@Nullable String collocation) {
            this.collocation = collocation;
            return this;
        }

        public Builder setVmCount(@Nullable Integer vmCount) {
            this.vmCount = vmCount;
            return this;
        }

        public ResourcePolicyGroupPlacementPolicy build() {
            return new ResourcePolicyGroupPlacementPolicy(availabilityDomainCount, collocation, vmCount);
        }
    }
}
