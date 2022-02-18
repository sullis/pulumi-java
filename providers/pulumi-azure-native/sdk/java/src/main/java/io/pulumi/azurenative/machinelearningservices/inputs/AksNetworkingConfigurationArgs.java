// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
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
    @InputImport(name="dnsServiceIP")
    private final @Nullable Input<String> dnsServiceIP;

    public Input<String> getDnsServiceIP() {
        return this.dnsServiceIP == null ? Input.empty() : this.dnsServiceIP;
    }

    /**
     * A CIDR notation IP range assigned to the Docker bridge network. It must not overlap with any Subnet IP ranges or the Kubernetes service address range.
     * 
     */
    @InputImport(name="dockerBridgeCidr")
    private final @Nullable Input<String> dockerBridgeCidr;

    public Input<String> getDockerBridgeCidr() {
        return this.dockerBridgeCidr == null ? Input.empty() : this.dockerBridgeCidr;
    }

    /**
     * A CIDR notation IP range from which to assign service cluster IPs. It must not overlap with any Subnet IP ranges.
     * 
     */
    @InputImport(name="serviceCidr")
    private final @Nullable Input<String> serviceCidr;

    public Input<String> getServiceCidr() {
        return this.serviceCidr == null ? Input.empty() : this.serviceCidr;
    }

    /**
     * Virtual network subnet resource ID the compute nodes belong to
     * 
     */
    @InputImport(name="subnetId")
    private final @Nullable Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId == null ? Input.empty() : this.subnetId;
    }

    public AksNetworkingConfigurationArgs(
        @Nullable Input<String> dnsServiceIP,
        @Nullable Input<String> dockerBridgeCidr,
        @Nullable Input<String> serviceCidr,
        @Nullable Input<String> subnetId) {
        this.dnsServiceIP = dnsServiceIP;
        this.dockerBridgeCidr = dockerBridgeCidr;
        this.serviceCidr = serviceCidr;
        this.subnetId = subnetId;
    }

    private AksNetworkingConfigurationArgs() {
        this.dnsServiceIP = Input.empty();
        this.dockerBridgeCidr = Input.empty();
        this.serviceCidr = Input.empty();
        this.subnetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AksNetworkingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dnsServiceIP;
        private @Nullable Input<String> dockerBridgeCidr;
        private @Nullable Input<String> serviceCidr;
        private @Nullable Input<String> subnetId;

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

        public Builder setDnsServiceIP(@Nullable Input<String> dnsServiceIP) {
            this.dnsServiceIP = dnsServiceIP;
            return this;
        }

        public Builder setDnsServiceIP(@Nullable String dnsServiceIP) {
            this.dnsServiceIP = Input.ofNullable(dnsServiceIP);
            return this;
        }

        public Builder setDockerBridgeCidr(@Nullable Input<String> dockerBridgeCidr) {
            this.dockerBridgeCidr = dockerBridgeCidr;
            return this;
        }

        public Builder setDockerBridgeCidr(@Nullable String dockerBridgeCidr) {
            this.dockerBridgeCidr = Input.ofNullable(dockerBridgeCidr);
            return this;
        }

        public Builder setServiceCidr(@Nullable Input<String> serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }

        public Builder setServiceCidr(@Nullable String serviceCidr) {
            this.serviceCidr = Input.ofNullable(serviceCidr);
            return this;
        }

        public Builder setSubnetId(@Nullable Input<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = Input.ofNullable(subnetId);
            return this;
        }

        public AksNetworkingConfigurationArgs build() {
            return new AksNetworkingConfigurationArgs(dnsServiceIP, dockerBridgeCidr, serviceCidr, subnetId);
        }
    }
}
