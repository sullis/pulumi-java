// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.ResourcePolicyGroupPlacementPolicyCollocation;
import com.pulumi.googlenative.compute_alpha.enums.ResourcePolicyGroupPlacementPolicyLocality;
import com.pulumi.googlenative.compute_alpha.enums.ResourcePolicyGroupPlacementPolicyScope;
import com.pulumi.googlenative.compute_alpha.enums.ResourcePolicyGroupPlacementPolicyStyle;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A GroupPlacementPolicy specifies resource placement configuration. It specifies the failure bucket separation as well as network locality
 * 
 */
public final class ResourcePolicyGroupPlacementPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyGroupPlacementPolicyArgs Empty = new ResourcePolicyGroupPlacementPolicyArgs();

    /**
     * The number of availability domains instances will be spread across. If two instances are in different availability domain, they will not be put in the same low latency network
     * 
     */
    @Import(name="availabilityDomainCount")
    private @Nullable Output<Integer> availabilityDomainCount;

    /**
     * @return The number of availability domains instances will be spread across. If two instances are in different availability domain, they will not be put in the same low latency network
     * 
     */
    public Optional<Output<Integer>> availabilityDomainCount() {
        return Optional.ofNullable(this.availabilityDomainCount);
    }

    /**
     * Specifies network collocation
     * 
     */
    @Import(name="collocation")
    private @Nullable Output<ResourcePolicyGroupPlacementPolicyCollocation> collocation;

    /**
     * @return Specifies network collocation
     * 
     */
    public Optional<Output<ResourcePolicyGroupPlacementPolicyCollocation>> collocation() {
        return Optional.ofNullable(this.collocation);
    }

    /**
     * Specifies network locality
     * 
     */
    @Import(name="locality")
    private @Nullable Output<ResourcePolicyGroupPlacementPolicyLocality> locality;

    /**
     * @return Specifies network locality
     * 
     */
    public Optional<Output<ResourcePolicyGroupPlacementPolicyLocality>> locality() {
        return Optional.ofNullable(this.locality);
    }

    /**
     * Scope specifies the availability domain to which the VMs should be spread.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<ResourcePolicyGroupPlacementPolicyScope> scope;

    /**
     * @return Scope specifies the availability domain to which the VMs should be spread.
     * 
     */
    public Optional<Output<ResourcePolicyGroupPlacementPolicyScope>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * Specifies instances to hosts placement relationship
     * 
     */
    @Import(name="style")
    private @Nullable Output<ResourcePolicyGroupPlacementPolicyStyle> style;

    /**
     * @return Specifies instances to hosts placement relationship
     * 
     */
    public Optional<Output<ResourcePolicyGroupPlacementPolicyStyle>> style() {
        return Optional.ofNullable(this.style);
    }

    /**
     * Number of vms in this placement group
     * 
     */
    @Import(name="vmCount")
    private @Nullable Output<Integer> vmCount;

    /**
     * @return Number of vms in this placement group
     * 
     */
    public Optional<Output<Integer>> vmCount() {
        return Optional.ofNullable(this.vmCount);
    }

    private ResourcePolicyGroupPlacementPolicyArgs() {}

    private ResourcePolicyGroupPlacementPolicyArgs(ResourcePolicyGroupPlacementPolicyArgs $) {
        this.availabilityDomainCount = $.availabilityDomainCount;
        this.collocation = $.collocation;
        this.locality = $.locality;
        this.scope = $.scope;
        this.style = $.style;
        this.vmCount = $.vmCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicyGroupPlacementPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyGroupPlacementPolicyArgs $;

        public Builder() {
            $ = new ResourcePolicyGroupPlacementPolicyArgs();
        }

        public Builder(ResourcePolicyGroupPlacementPolicyArgs defaults) {
            $ = new ResourcePolicyGroupPlacementPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityDomainCount The number of availability domains instances will be spread across. If two instances are in different availability domain, they will not be put in the same low latency network
         * 
         * @return builder
         * 
         */
        public Builder availabilityDomainCount(@Nullable Output<Integer> availabilityDomainCount) {
            $.availabilityDomainCount = availabilityDomainCount;
            return this;
        }

        /**
         * @param availabilityDomainCount The number of availability domains instances will be spread across. If two instances are in different availability domain, they will not be put in the same low latency network
         * 
         * @return builder
         * 
         */
        public Builder availabilityDomainCount(Integer availabilityDomainCount) {
            return availabilityDomainCount(Output.of(availabilityDomainCount));
        }

        /**
         * @param collocation Specifies network collocation
         * 
         * @return builder
         * 
         */
        public Builder collocation(@Nullable Output<ResourcePolicyGroupPlacementPolicyCollocation> collocation) {
            $.collocation = collocation;
            return this;
        }

        /**
         * @param collocation Specifies network collocation
         * 
         * @return builder
         * 
         */
        public Builder collocation(ResourcePolicyGroupPlacementPolicyCollocation collocation) {
            return collocation(Output.of(collocation));
        }

        /**
         * @param locality Specifies network locality
         * 
         * @return builder
         * 
         */
        public Builder locality(@Nullable Output<ResourcePolicyGroupPlacementPolicyLocality> locality) {
            $.locality = locality;
            return this;
        }

        /**
         * @param locality Specifies network locality
         * 
         * @return builder
         * 
         */
        public Builder locality(ResourcePolicyGroupPlacementPolicyLocality locality) {
            return locality(Output.of(locality));
        }

        /**
         * @param scope Scope specifies the availability domain to which the VMs should be spread.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<ResourcePolicyGroupPlacementPolicyScope> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Scope specifies the availability domain to which the VMs should be spread.
         * 
         * @return builder
         * 
         */
        public Builder scope(ResourcePolicyGroupPlacementPolicyScope scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param style Specifies instances to hosts placement relationship
         * 
         * @return builder
         * 
         */
        public Builder style(@Nullable Output<ResourcePolicyGroupPlacementPolicyStyle> style) {
            $.style = style;
            return this;
        }

        /**
         * @param style Specifies instances to hosts placement relationship
         * 
         * @return builder
         * 
         */
        public Builder style(ResourcePolicyGroupPlacementPolicyStyle style) {
            return style(Output.of(style));
        }

        /**
         * @param vmCount Number of vms in this placement group
         * 
         * @return builder
         * 
         */
        public Builder vmCount(@Nullable Output<Integer> vmCount) {
            $.vmCount = vmCount;
            return this;
        }

        /**
         * @param vmCount Number of vms in this placement group
         * 
         * @return builder
         * 
         */
        public Builder vmCount(Integer vmCount) {
            return vmCount(Output.of(vmCount));
        }

        public ResourcePolicyGroupPlacementPolicyArgs build() {
            return $;
        }
    }

}
