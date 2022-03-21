// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Advance configuration for AKS networking
 * 
 */
public final class AksNetworkingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AksNetworkingConfigurationArgs Empty = new AksNetworkingConfigurationArgs();

    /**
     * An IP address assigned to the Kubernetes DNS service. It must be within the Kubernetes service address range specified in serviceCidr.
     * 
     */
    @Import(name="dnsServiceIP")
      private final @Nullable Output<String> dnsServiceIP;

    public Output<String> getDnsServiceIP() {
        return this.dnsServiceIP == null ? Output.empty() : this.dnsServiceIP;
    }

    /**
     * A CIDR notation IP range assigned to the Docker bridge network. It must not overlap with any Subnet IP ranges or the Kubernetes service address range.
     * 
     */
    @Import(name="dockerBridgeCidr")
      private final @Nullable Output<String> dockerBridgeCidr;

    public Output<String> getDockerBridgeCidr() {
        return this.dockerBridgeCidr == null ? Output.empty() : this.dockerBridgeCidr;
    }

    /**
     * A CIDR notation IP range from which to assign service cluster IPs. It must not overlap with any Subnet IP ranges.
     * 
     */
    @Import(name="serviceCidr")
      private final @Nullable Output<String> serviceCidr;

    public Output<String> getServiceCidr() {
        return this.serviceCidr == null ? Output.empty() : this.serviceCidr;
    }

    /**
     * Virtual network subnet resource ID the compute nodes belong to
     * 
     */
    @Import(name="subnetId")
      private final @Nullable Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId == null ? Output.empty() : this.subnetId;
    }

    public AksNetworkingConfigurationArgs(
        @Nullable Output<String> dnsServiceIP,
        @Nullable Output<String> dockerBridgeCidr,
        @Nullable Output<String> serviceCidr,
        @Nullable Output<String> subnetId) {
        this.dnsServiceIP = dnsServiceIP;
        this.dockerBridgeCidr = dockerBridgeCidr;
        this.serviceCidr = serviceCidr;
        this.subnetId = subnetId;
    }

    private AksNetworkingConfigurationArgs() {
        this.dnsServiceIP = Output.empty();
        this.dockerBridgeCidr = Output.empty();
        this.serviceCidr = Output.empty();
        this.subnetId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AksNetworkingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dnsServiceIP;
        private @Nullable Output<String> dockerBridgeCidr;
        private @Nullable Output<String> serviceCidr;
        private @Nullable Output<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(AksNetworkingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServiceIP = defaults.dnsServiceIP;
    	      this.dockerBridgeCidr = defaults.dockerBridgeCidr;
    	      this.serviceCidr = defaults.serviceCidr;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder dnsServiceIP(@Nullable Output<String> dnsServiceIP) {
            this.dnsServiceIP = dnsServiceIP;
            return this;
        }
        public Builder dnsServiceIP(@Nullable String dnsServiceIP) {
            this.dnsServiceIP = Output.ofNullable(dnsServiceIP);
            return this;
        }
        public Builder dockerBridgeCidr(@Nullable Output<String> dockerBridgeCidr) {
            this.dockerBridgeCidr = dockerBridgeCidr;
            return this;
        }
        public Builder dockerBridgeCidr(@Nullable String dockerBridgeCidr) {
            this.dockerBridgeCidr = Output.ofNullable(dockerBridgeCidr);
            return this;
        }
        public Builder serviceCidr(@Nullable Output<String> serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }
        public Builder serviceCidr(@Nullable String serviceCidr) {
            this.serviceCidr = Output.ofNullable(serviceCidr);
            return this;
        }
        public Builder subnetId(@Nullable Output<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Output.ofNullable(subnetId);
            return this;
        }        public AksNetworkingConfigurationArgs build() {
            return new AksNetworkingConfigurationArgs(dnsServiceIP, dockerBridgeCidr, serviceCidr, subnetId);
        }
    }
}
