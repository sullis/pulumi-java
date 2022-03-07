// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.azurenative.containerservice.outputs.ManagedClusterLoadBalancerProfileResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerServiceNetworkProfileResponse {
    /**
     * An IP address assigned to the Kubernetes DNS service. It must be within the Kubernetes service address range specified in serviceCidr.
     * 
     */
    private final @Nullable String dnsServiceIP;
    /**
     * A CIDR notation IP range assigned to the Docker bridge network. It must not overlap with any Subnet IP ranges or the Kubernetes service address range.
     * 
     */
    private final @Nullable String dockerBridgeCidr;
    /**
     * Profile of the cluster load balancer.
     * 
     */
    private final @Nullable ManagedClusterLoadBalancerProfileResponse loadBalancerProfile;
    /**
     * The load balancer sku for the managed cluster.
     * 
     */
    private final @Nullable String loadBalancerSku;
    /**
     * Network mode used for building Kubernetes network.
     * 
     */
    private final @Nullable String networkMode;
    /**
     * Network plugin used for building Kubernetes network.
     * 
     */
    private final @Nullable String networkPlugin;
    /**
     * Network policy used for building Kubernetes network.
     * 
     */
    private final @Nullable String networkPolicy;
    /**
     * The outbound (egress) routing method.
     * 
     */
    private final @Nullable String outboundType;
    /**
     * A CIDR notation IP range from which to assign pod IPs when kubenet is used.
     * 
     */
    private final @Nullable String podCidr;
    /**
     * A CIDR notation IP range from which to assign service cluster IPs. It must not overlap with any Subnet IP ranges.
     * 
     */
    private final @Nullable String serviceCidr;

    @OutputCustomType.Constructor({"dnsServiceIP","dockerBridgeCidr","loadBalancerProfile","loadBalancerSku","networkMode","networkPlugin","networkPolicy","outboundType","podCidr","serviceCidr"})
    private ContainerServiceNetworkProfileResponse(
        @Nullable String dnsServiceIP,
        @Nullable String dockerBridgeCidr,
        @Nullable ManagedClusterLoadBalancerProfileResponse loadBalancerProfile,
        @Nullable String loadBalancerSku,
        @Nullable String networkMode,
        @Nullable String networkPlugin,
        @Nullable String networkPolicy,
        @Nullable String outboundType,
        @Nullable String podCidr,
        @Nullable String serviceCidr) {
        this.dnsServiceIP = dnsServiceIP;
        this.dockerBridgeCidr = dockerBridgeCidr;
        this.loadBalancerProfile = loadBalancerProfile;
        this.loadBalancerSku = loadBalancerSku;
        this.networkMode = networkMode;
        this.networkPlugin = networkPlugin;
        this.networkPolicy = networkPolicy;
        this.outboundType = outboundType;
        this.podCidr = podCidr;
        this.serviceCidr = serviceCidr;
    }

    /**
     * An IP address assigned to the Kubernetes DNS service. It must be within the Kubernetes service address range specified in serviceCidr.
     * 
    */
    public Optional<String> getDnsServiceIP() {
        return Optional.ofNullable(this.dnsServiceIP);
    }
    /**
     * A CIDR notation IP range assigned to the Docker bridge network. It must not overlap with any Subnet IP ranges or the Kubernetes service address range.
     * 
    */
    public Optional<String> getDockerBridgeCidr() {
        return Optional.ofNullable(this.dockerBridgeCidr);
    }
    /**
     * Profile of the cluster load balancer.
     * 
    */
    public Optional<ManagedClusterLoadBalancerProfileResponse> getLoadBalancerProfile() {
        return Optional.ofNullable(this.loadBalancerProfile);
    }
    /**
     * The load balancer sku for the managed cluster.
     * 
    */
    public Optional<String> getLoadBalancerSku() {
        return Optional.ofNullable(this.loadBalancerSku);
    }
    /**
     * Network mode used for building Kubernetes network.
     * 
    */
    public Optional<String> getNetworkMode() {
        return Optional.ofNullable(this.networkMode);
    }
    /**
     * Network plugin used for building Kubernetes network.
     * 
    */
    public Optional<String> getNetworkPlugin() {
        return Optional.ofNullable(this.networkPlugin);
    }
    /**
     * Network policy used for building Kubernetes network.
     * 
    */
    public Optional<String> getNetworkPolicy() {
        return Optional.ofNullable(this.networkPolicy);
    }
    /**
     * The outbound (egress) routing method.
     * 
    */
    public Optional<String> getOutboundType() {
        return Optional.ofNullable(this.outboundType);
    }
    /**
     * A CIDR notation IP range from which to assign pod IPs when kubenet is used.
     * 
    */
    public Optional<String> getPodCidr() {
        return Optional.ofNullable(this.podCidr);
    }
    /**
     * A CIDR notation IP range from which to assign service cluster IPs. It must not overlap with any Subnet IP ranges.
     * 
    */
    public Optional<String> getServiceCidr() {
        return Optional.ofNullable(this.serviceCidr);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerServiceNetworkProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dnsServiceIP;
        private @Nullable String dockerBridgeCidr;
        private @Nullable ManagedClusterLoadBalancerProfileResponse loadBalancerProfile;
        private @Nullable String loadBalancerSku;
        private @Nullable String networkMode;
        private @Nullable String networkPlugin;
        private @Nullable String networkPolicy;
        private @Nullable String outboundType;
        private @Nullable String podCidr;
        private @Nullable String serviceCidr;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerServiceNetworkProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServiceIP = defaults.dnsServiceIP;
    	      this.dockerBridgeCidr = defaults.dockerBridgeCidr;
    	      this.loadBalancerProfile = defaults.loadBalancerProfile;
    	      this.loadBalancerSku = defaults.loadBalancerSku;
    	      this.networkMode = defaults.networkMode;
    	      this.networkPlugin = defaults.networkPlugin;
    	      this.networkPolicy = defaults.networkPolicy;
    	      this.outboundType = defaults.outboundType;
    	      this.podCidr = defaults.podCidr;
    	      this.serviceCidr = defaults.serviceCidr;
        }

        public Builder setDnsServiceIP(@Nullable String dnsServiceIP) {
            this.dnsServiceIP = dnsServiceIP;
            return this;
        }

        public Builder setDockerBridgeCidr(@Nullable String dockerBridgeCidr) {
            this.dockerBridgeCidr = dockerBridgeCidr;
            return this;
        }

        public Builder setLoadBalancerProfile(@Nullable ManagedClusterLoadBalancerProfileResponse loadBalancerProfile) {
            this.loadBalancerProfile = loadBalancerProfile;
            return this;
        }

        public Builder setLoadBalancerSku(@Nullable String loadBalancerSku) {
            this.loadBalancerSku = loadBalancerSku;
            return this;
        }

        public Builder setNetworkMode(@Nullable String networkMode) {
            this.networkMode = networkMode;
            return this;
        }

        public Builder setNetworkPlugin(@Nullable String networkPlugin) {
            this.networkPlugin = networkPlugin;
            return this;
        }

        public Builder setNetworkPolicy(@Nullable String networkPolicy) {
            this.networkPolicy = networkPolicy;
            return this;
        }

        public Builder setOutboundType(@Nullable String outboundType) {
            this.outboundType = outboundType;
            return this;
        }

        public Builder setPodCidr(@Nullable String podCidr) {
            this.podCidr = podCidr;
            return this;
        }

        public Builder setServiceCidr(@Nullable String serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }
        public ContainerServiceNetworkProfileResponse build() {
            return new ContainerServiceNetworkProfileResponse(dnsServiceIP, dockerBridgeCidr, loadBalancerProfile, loadBalancerSku, networkMode, networkPlugin, networkPolicy, outboundType, podCidr, serviceCidr);
        }
    }
}