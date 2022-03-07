// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Advance configuration for AKS networking
 * 
 */
public final class AksNetworkingConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final AksNetworkingConfigurationResponse Empty = new AksNetworkingConfigurationResponse();

    /**
     * An IP address assigned to the Kubernetes DNS service. It must be within the Kubernetes service address range specified in serviceCidr.
     * 
     */
    @InputImport(name="dnsServiceIP")
      private final @Nullable String dnsServiceIP;

    public Optional<String> getDnsServiceIP() {
        return this.dnsServiceIP == null ? Optional.empty() : Optional.ofNullable(this.dnsServiceIP);
    }

    /**
     * A CIDR notation IP range assigned to the Docker bridge network. It must not overlap with any Subnet IP ranges or the Kubernetes service address range.
     * 
     */
    @InputImport(name="dockerBridgeCidr")
      private final @Nullable String dockerBridgeCidr;

    public Optional<String> getDockerBridgeCidr() {
        return this.dockerBridgeCidr == null ? Optional.empty() : Optional.ofNullable(this.dockerBridgeCidr);
    }

    /**
     * A CIDR notation IP range from which to assign service cluster IPs. It must not overlap with any Subnet IP ranges.
     * 
     */
    @InputImport(name="serviceCidr")
      private final @Nullable String serviceCidr;

    public Optional<String> getServiceCidr() {
        return this.serviceCidr == null ? Optional.empty() : Optional.ofNullable(this.serviceCidr);
    }

    /**
     * Virtual network subnet resource ID the compute nodes belong to
     * 
     */
    @InputImport(name="subnetId")
      private final @Nullable String subnetId;

    public Optional<String> getSubnetId() {
        return this.subnetId == null ? Optional.empty() : Optional.ofNullable(this.subnetId);
    }

    public AksNetworkingConfigurationResponse(
        @Nullable String dnsServiceIP,
        @Nullable String dockerBridgeCidr,
        @Nullable String serviceCidr,
        @Nullable String subnetId) {
        this.dnsServiceIP = dnsServiceIP;
        this.dockerBridgeCidr = dockerBridgeCidr;
        this.serviceCidr = serviceCidr;
        this.subnetId = subnetId;
    }

    private AksNetworkingConfigurationResponse() {
        this.dnsServiceIP = null;
        this.dockerBridgeCidr = null;
        this.serviceCidr = null;
        this.subnetId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AksNetworkingConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dnsServiceIP;
        private @Nullable String dockerBridgeCidr;
        private @Nullable String serviceCidr;
        private @Nullable String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(AksNetworkingConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServiceIP = defaults.dnsServiceIP;
    	      this.dockerBridgeCidr = defaults.dockerBridgeCidr;
    	      this.serviceCidr = defaults.serviceCidr;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setDnsServiceIP(@Nullable String dnsServiceIP) {
            this.dnsServiceIP = dnsServiceIP;
            return this;
        }

        public Builder setDockerBridgeCidr(@Nullable String dockerBridgeCidr) {
            this.dockerBridgeCidr = dockerBridgeCidr;
            return this;
        }

        public Builder setServiceCidr(@Nullable String serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public AksNetworkingConfigurationResponse build() {
            return new AksNetworkingConfigurationResponse(dnsServiceIP, dockerBridgeCidr, serviceCidr, subnetId);
        }
    }
}