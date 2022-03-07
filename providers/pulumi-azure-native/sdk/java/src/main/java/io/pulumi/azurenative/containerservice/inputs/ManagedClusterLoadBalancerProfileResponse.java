// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.inputs.ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs;
import io.pulumi.azurenative.containerservice.inputs.ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes;
import io.pulumi.azurenative.containerservice.inputs.ManagedClusterLoadBalancerProfileResponseOutboundIPs;
import io.pulumi.azurenative.containerservice.inputs.ResourceReferenceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Profile of the managed cluster load balancer.
 * 
 */
public final class ManagedClusterLoadBalancerProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedClusterLoadBalancerProfileResponse Empty = new ManagedClusterLoadBalancerProfileResponse();

    /**
     * Desired number of allocated SNAT ports per VM. Allowed values must be in the range of 0 to 64000 (inclusive). The default value is 0 which results in Azure dynamically allocating ports.
     * 
     */
    @InputImport(name="allocatedOutboundPorts")
      private final @Nullable Integer allocatedOutboundPorts;

    public Optional<Integer> getAllocatedOutboundPorts() {
        return this.allocatedOutboundPorts == null ? Optional.empty() : Optional.ofNullable(this.allocatedOutboundPorts);
    }

    /**
     * The effective outbound IP resources of the cluster load balancer.
     * 
     */
    @InputImport(name="effectiveOutboundIPs")
      private final @Nullable List<ResourceReferenceResponse> effectiveOutboundIPs;

    public List<ResourceReferenceResponse> getEffectiveOutboundIPs() {
        return this.effectiveOutboundIPs == null ? List.of() : this.effectiveOutboundIPs;
    }

    /**
     * Desired outbound flow idle timeout in minutes. Allowed values must be in the range of 4 to 120 (inclusive). The default value is 30 minutes.
     * 
     */
    @InputImport(name="idleTimeoutInMinutes")
      private final @Nullable Integer idleTimeoutInMinutes;

    public Optional<Integer> getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes == null ? Optional.empty() : Optional.ofNullable(this.idleTimeoutInMinutes);
    }

    /**
     * Desired managed outbound IPs for the cluster load balancer.
     * 
     */
    @InputImport(name="managedOutboundIPs")
      private final @Nullable ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs managedOutboundIPs;

    public Optional<ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs> getManagedOutboundIPs() {
        return this.managedOutboundIPs == null ? Optional.empty() : Optional.ofNullable(this.managedOutboundIPs);
    }

    /**
     * Desired outbound IP Prefix resources for the cluster load balancer.
     * 
     */
    @InputImport(name="outboundIPPrefixes")
      private final @Nullable ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes outboundIPPrefixes;

    public Optional<ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes> getOutboundIPPrefixes() {
        return this.outboundIPPrefixes == null ? Optional.empty() : Optional.ofNullable(this.outboundIPPrefixes);
    }

    /**
     * Desired outbound IP resources for the cluster load balancer.
     * 
     */
    @InputImport(name="outboundIPs")
      private final @Nullable ManagedClusterLoadBalancerProfileResponseOutboundIPs outboundIPs;

    public Optional<ManagedClusterLoadBalancerProfileResponseOutboundIPs> getOutboundIPs() {
        return this.outboundIPs == null ? Optional.empty() : Optional.ofNullable(this.outboundIPs);
    }

    public ManagedClusterLoadBalancerProfileResponse(
        @Nullable Integer allocatedOutboundPorts,
        @Nullable List<ResourceReferenceResponse> effectiveOutboundIPs,
        @Nullable Integer idleTimeoutInMinutes,
        @Nullable ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs managedOutboundIPs,
        @Nullable ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes outboundIPPrefixes,
        @Nullable ManagedClusterLoadBalancerProfileResponseOutboundIPs outboundIPs) {
        this.allocatedOutboundPorts = allocatedOutboundPorts == null ? 0 : allocatedOutboundPorts;
        this.effectiveOutboundIPs = effectiveOutboundIPs;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes == null ? 30 : idleTimeoutInMinutes;
        this.managedOutboundIPs = managedOutboundIPs;
        this.outboundIPPrefixes = outboundIPPrefixes;
        this.outboundIPs = outboundIPs;
    }

    private ManagedClusterLoadBalancerProfileResponse() {
        this.allocatedOutboundPorts = null;
        this.effectiveOutboundIPs = List.of();
        this.idleTimeoutInMinutes = null;
        this.managedOutboundIPs = null;
        this.outboundIPPrefixes = null;
        this.outboundIPs = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterLoadBalancerProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer allocatedOutboundPorts;
        private @Nullable List<ResourceReferenceResponse> effectiveOutboundIPs;
        private @Nullable Integer idleTimeoutInMinutes;
        private @Nullable ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs managedOutboundIPs;
        private @Nullable ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes outboundIPPrefixes;
        private @Nullable ManagedClusterLoadBalancerProfileResponseOutboundIPs outboundIPs;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterLoadBalancerProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedOutboundPorts = defaults.allocatedOutboundPorts;
    	      this.effectiveOutboundIPs = defaults.effectiveOutboundIPs;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.managedOutboundIPs = defaults.managedOutboundIPs;
    	      this.outboundIPPrefixes = defaults.outboundIPPrefixes;
    	      this.outboundIPs = defaults.outboundIPs;
        }

        public Builder setAllocatedOutboundPorts(@Nullable Integer allocatedOutboundPorts) {
            this.allocatedOutboundPorts = allocatedOutboundPorts;
            return this;
        }

        public Builder setEffectiveOutboundIPs(@Nullable List<ResourceReferenceResponse> effectiveOutboundIPs) {
            this.effectiveOutboundIPs = effectiveOutboundIPs;
            return this;
        }

        public Builder setIdleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        public Builder setManagedOutboundIPs(@Nullable ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs managedOutboundIPs) {
            this.managedOutboundIPs = managedOutboundIPs;
            return this;
        }

        public Builder setOutboundIPPrefixes(@Nullable ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes outboundIPPrefixes) {
            this.outboundIPPrefixes = outboundIPPrefixes;
            return this;
        }

        public Builder setOutboundIPs(@Nullable ManagedClusterLoadBalancerProfileResponseOutboundIPs outboundIPs) {
            this.outboundIPs = outboundIPs;
            return this;
        }
        public ManagedClusterLoadBalancerProfileResponse build() {
            return new ManagedClusterLoadBalancerProfileResponse(allocatedOutboundPorts, effectiveOutboundIPs, idleTimeoutInMinutes, managedOutboundIPs, outboundIPPrefixes, outboundIPs);
        }
    }
}