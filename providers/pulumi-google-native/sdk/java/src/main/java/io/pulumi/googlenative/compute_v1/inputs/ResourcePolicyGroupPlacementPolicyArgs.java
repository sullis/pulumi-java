// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.enums.ResourcePolicyGroupPlacementPolicyCollocation;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A GroupPlacementPolicy specifies resource placement configuration. It specifies the failure bucket separation as well as network locality
 * 
 */
public final class ResourcePolicyGroupPlacementPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyGroupPlacementPolicyArgs Empty = new ResourcePolicyGroupPlacementPolicyArgs();

    /**
     * The number of availability domains instances will be spread across. If two instances are in different availability domain, they will not be put in the same low latency network
     * 
     */
    @Import(name="availabilityDomainCount")
      private final @Nullable Output<Integer> availabilityDomainCount;

    public Output<Integer> getAvailabilityDomainCount() {
        return this.availabilityDomainCount == null ? Output.empty() : this.availabilityDomainCount;
    }

    /**
     * Specifies network collocation
     * 
     */
    @Import(name="collocation")
      private final @Nullable Output<ResourcePolicyGroupPlacementPolicyCollocation> collocation;

    public Output<ResourcePolicyGroupPlacementPolicyCollocation> getCollocation() {
        return this.collocation == null ? Output.empty() : this.collocation;
    }

    /**
     * Number of vms in this placement group
     * 
     */
    @Import(name="vmCount")
      private final @Nullable Output<Integer> vmCount;

    public Output<Integer> getVmCount() {
        return this.vmCount == null ? Output.empty() : this.vmCount;
    }

    public ResourcePolicyGroupPlacementPolicyArgs(
        @Nullable Output<Integer> availabilityDomainCount,
        @Nullable Output<ResourcePolicyGroupPlacementPolicyCollocation> collocation,
        @Nullable Output<Integer> vmCount) {
        this.availabilityDomainCount = availabilityDomainCount;
        this.collocation = collocation;
        this.vmCount = vmCount;
    }

    private ResourcePolicyGroupPlacementPolicyArgs() {
        this.availabilityDomainCount = Output.empty();
        this.collocation = Output.empty();
        this.vmCount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyGroupPlacementPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> availabilityDomainCount;
        private @Nullable Output<ResourcePolicyGroupPlacementPolicyCollocation> collocation;
        private @Nullable Output<Integer> vmCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyGroupPlacementPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityDomainCount = defaults.availabilityDomainCount;
    	      this.collocation = defaults.collocation;
    	      this.vmCount = defaults.vmCount;
        }

        public Builder availabilityDomainCount(@Nullable Output<Integer> availabilityDomainCount) {
            this.availabilityDomainCount = availabilityDomainCount;
            return this;
        }
        public Builder availabilityDomainCount(@Nullable Integer availabilityDomainCount) {
            this.availabilityDomainCount = Output.ofNullable(availabilityDomainCount);
            return this;
        }
        public Builder collocation(@Nullable Output<ResourcePolicyGroupPlacementPolicyCollocation> collocation) {
            this.collocation = collocation;
            return this;
        }
        public Builder collocation(@Nullable ResourcePolicyGroupPlacementPolicyCollocation collocation) {
            this.collocation = Output.ofNullable(collocation);
            return this;
        }
        public Builder vmCount(@Nullable Output<Integer> vmCount) {
            this.vmCount = vmCount;
            return this;
        }
        public Builder vmCount(@Nullable Integer vmCount) {
            this.vmCount = Output.ofNullable(vmCount);
            return this;
        }        public ResourcePolicyGroupPlacementPolicyArgs build() {
            return new ResourcePolicyGroupPlacementPolicyArgs(availabilityDomainCount, collocation, vmCount);
        }
    }
}
