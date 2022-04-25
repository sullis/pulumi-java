// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A GroupPlacementPolicy specifies resource placement configuration. It specifies the failure bucket separation as well as network locality
 * 
 */
public final class ResourcePolicyGroupPlacementPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourcePolicyGroupPlacementPolicyResponse Empty = new ResourcePolicyGroupPlacementPolicyResponse();

    /**
     * The number of availability domains instances will be spread across. If two instances are in different availability domain, they will not be put in the same low latency network
     * 
     */
    @Import(name="availabilityDomainCount", required=true)
    private Integer availabilityDomainCount;

    /**
     * @return The number of availability domains instances will be spread across. If two instances are in different availability domain, they will not be put in the same low latency network
     * 
     */
    public Integer availabilityDomainCount() {
        return this.availabilityDomainCount;
    }

    /**
     * Specifies network collocation
     * 
     */
    @Import(name="collocation", required=true)
    private String collocation;

    /**
     * @return Specifies network collocation
     * 
     */
    public String collocation() {
        return this.collocation;
    }

    /**
     * Specifies network locality
     * 
     */
    @Import(name="locality", required=true)
    private String locality;

    /**
     * @return Specifies network locality
     * 
     */
    public String locality() {
        return this.locality;
    }

    /**
     * Scope specifies the availability domain to which the VMs should be spread.
     * 
     */
    @Import(name="scope", required=true)
    private String scope;

    /**
     * @return Scope specifies the availability domain to which the VMs should be spread.
     * 
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Specifies instances to hosts placement relationship
     * 
     */
    @Import(name="style", required=true)
    private String style;

    /**
     * @return Specifies instances to hosts placement relationship
     * 
     */
    public String style() {
        return this.style;
    }

    /**
     * Number of vms in this placement group
     * 
     */
    @Import(name="vmCount", required=true)
    private Integer vmCount;

    /**
     * @return Number of vms in this placement group
     * 
     */
    public Integer vmCount() {
        return this.vmCount;
    }

    private ResourcePolicyGroupPlacementPolicyResponse() {}

    private ResourcePolicyGroupPlacementPolicyResponse(ResourcePolicyGroupPlacementPolicyResponse $) {
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
    public static Builder builder(ResourcePolicyGroupPlacementPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyGroupPlacementPolicyResponse $;

        public Builder() {
            $ = new ResourcePolicyGroupPlacementPolicyResponse();
        }

        public Builder(ResourcePolicyGroupPlacementPolicyResponse defaults) {
            $ = new ResourcePolicyGroupPlacementPolicyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityDomainCount The number of availability domains instances will be spread across. If two instances are in different availability domain, they will not be put in the same low latency network
         * 
         * @return builder
         * 
         */
        public Builder availabilityDomainCount(Integer availabilityDomainCount) {
            $.availabilityDomainCount = availabilityDomainCount;
            return this;
        }

        /**
         * @param collocation Specifies network collocation
         * 
         * @return builder
         * 
         */
        public Builder collocation(String collocation) {
            $.collocation = collocation;
            return this;
        }

        /**
         * @param locality Specifies network locality
         * 
         * @return builder
         * 
         */
        public Builder locality(String locality) {
            $.locality = locality;
            return this;
        }

        /**
         * @param scope Scope specifies the availability domain to which the VMs should be spread.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param style Specifies instances to hosts placement relationship
         * 
         * @return builder
         * 
         */
        public Builder style(String style) {
            $.style = style;
            return this;
        }

        /**
         * @param vmCount Number of vms in this placement group
         * 
         * @return builder
         * 
         */
        public Builder vmCount(Integer vmCount) {
            $.vmCount = vmCount;
            return this;
        }

        public ResourcePolicyGroupPlacementPolicyResponse build() {
            $.availabilityDomainCount = Objects.requireNonNull($.availabilityDomainCount, "expected parameter 'availabilityDomainCount' to be non-null");
            $.collocation = Objects.requireNonNull($.collocation, "expected parameter 'collocation' to be non-null");
            $.locality = Objects.requireNonNull($.locality, "expected parameter 'locality' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            $.style = Objects.requireNonNull($.style, "expected parameter 'style' to be non-null");
            $.vmCount = Objects.requireNonNull($.vmCount, "expected parameter 'vmCount' to be non-null");
            return $;
        }
    }

}
