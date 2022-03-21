// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.container_v1.inputs.DNSConfigResponse;
import io.pulumi.googlenative.container_v1.inputs.DefaultSnatStatusResponse;
import io.pulumi.googlenative.container_v1.inputs.ServiceExternalIPsConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * NetworkConfig reports the relative names of network & subnetwork.
 * 
 */
public final class NetworkConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkConfigResponse Empty = new NetworkConfigResponse();

    /**
     * The desired datapath provider for this cluster. By default, uses the IPTables-based kube-proxy implementation.
     * 
     */
    @Import(name="datapathProvider", required=true)
      private final String datapathProvider;

    public String getDatapathProvider() {
        return this.datapathProvider;
    }

    /**
     * Whether the cluster disables default in-node sNAT rules. In-node sNAT rules will be disabled when default_snat_status is disabled. When disabled is set to false, default IP masquerade rules will be applied to the nodes to prevent sNAT on cluster internal traffic.
     * 
     */
    @Import(name="defaultSnatStatus", required=true)
      private final DefaultSnatStatusResponse defaultSnatStatus;

    public DefaultSnatStatusResponse getDefaultSnatStatus() {
        return this.defaultSnatStatus;
    }

    /**
     * DNSConfig contains clusterDNS config for this cluster.
     * 
     */
    @Import(name="dnsConfig", required=true)
      private final DNSConfigResponse dnsConfig;

    public DNSConfigResponse getDnsConfig() {
        return this.dnsConfig;
    }

    /**
     * Whether Intra-node visibility is enabled for this cluster. This makes same node pod to pod traffic visible for VPC network.
     * 
     */
    @Import(name="enableIntraNodeVisibility", required=true)
      private final Boolean enableIntraNodeVisibility;

    public Boolean getEnableIntraNodeVisibility() {
        return this.enableIntraNodeVisibility;
    }

    /**
     * Whether L4ILB Subsetting is enabled for this cluster.
     * 
     */
    @Import(name="enableL4ilbSubsetting", required=true)
      private final Boolean enableL4ilbSubsetting;

    public Boolean getEnableL4ilbSubsetting() {
        return this.enableL4ilbSubsetting;
    }

    /**
     * The relative name of the Google Compute Engine network(https://cloud.google.com/compute/docs/networks-and-firewalls#networks) to which the cluster is connected. Example: projects/my-project/global/networks/my-network
     * 
     */
    @Import(name="network", required=true)
      private final String network;

    public String getNetwork() {
        return this.network;
    }

    /**
     * The desired state of IPv6 connectivity to Google Services. By default, no private IPv6 access to or from Google Services (all access will be via IPv4)
     * 
     */
    @Import(name="privateIpv6GoogleAccess", required=true)
      private final String privateIpv6GoogleAccess;

    public String getPrivateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess;
    }

    /**
     * ServiceExternalIPsConfig specifies if services with externalIPs field are blocked or not.
     * 
     */
    @Import(name="serviceExternalIpsConfig", required=true)
      private final ServiceExternalIPsConfigResponse serviceExternalIpsConfig;

    public ServiceExternalIPsConfigResponse getServiceExternalIpsConfig() {
        return this.serviceExternalIpsConfig;
    }

    /**
     * The relative name of the Google Compute Engine [subnetwork](https://cloud.google.com/compute/docs/vpc) to which the cluster is connected. Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
     * 
     */
    @Import(name="subnetwork", required=true)
      private final String subnetwork;

    public String getSubnetwork() {
        return this.subnetwork;
    }

    public NetworkConfigResponse(
        String datapathProvider,
        DefaultSnatStatusResponse defaultSnatStatus,
        DNSConfigResponse dnsConfig,
        Boolean enableIntraNodeVisibility,
        Boolean enableL4ilbSubsetting,
        String network,
        String privateIpv6GoogleAccess,
        ServiceExternalIPsConfigResponse serviceExternalIpsConfig,
        String subnetwork) {
        this.datapathProvider = Objects.requireNonNull(datapathProvider, "expected parameter 'datapathProvider' to be non-null");
        this.defaultSnatStatus = Objects.requireNonNull(defaultSnatStatus, "expected parameter 'defaultSnatStatus' to be non-null");
        this.dnsConfig = Objects.requireNonNull(dnsConfig, "expected parameter 'dnsConfig' to be non-null");
        this.enableIntraNodeVisibility = Objects.requireNonNull(enableIntraNodeVisibility, "expected parameter 'enableIntraNodeVisibility' to be non-null");
        this.enableL4ilbSubsetting = Objects.requireNonNull(enableL4ilbSubsetting, "expected parameter 'enableL4ilbSubsetting' to be non-null");
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.privateIpv6GoogleAccess = Objects.requireNonNull(privateIpv6GoogleAccess, "expected parameter 'privateIpv6GoogleAccess' to be non-null");
        this.serviceExternalIpsConfig = Objects.requireNonNull(serviceExternalIpsConfig, "expected parameter 'serviceExternalIpsConfig' to be non-null");
        this.subnetwork = Objects.requireNonNull(subnetwork, "expected parameter 'subnetwork' to be non-null");
    }

    private NetworkConfigResponse() {
        this.datapathProvider = null;
        this.defaultSnatStatus = null;
        this.dnsConfig = null;
        this.enableIntraNodeVisibility = null;
        this.enableL4ilbSubsetting = null;
        this.network = null;
        this.privateIpv6GoogleAccess = null;
        this.serviceExternalIpsConfig = null;
        this.subnetwork = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datapathProvider;
        private DefaultSnatStatusResponse defaultSnatStatus;
        private DNSConfigResponse dnsConfig;
        private Boolean enableIntraNodeVisibility;
        private Boolean enableL4ilbSubsetting;
        private String network;
        private String privateIpv6GoogleAccess;
        private ServiceExternalIPsConfigResponse serviceExternalIpsConfig;
        private String subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datapathProvider = defaults.datapathProvider;
    	      this.defaultSnatStatus = defaults.defaultSnatStatus;
    	      this.dnsConfig = defaults.dnsConfig;
    	      this.enableIntraNodeVisibility = defaults.enableIntraNodeVisibility;
    	      this.enableL4ilbSubsetting = defaults.enableL4ilbSubsetting;
    	      this.network = defaults.network;
    	      this.privateIpv6GoogleAccess = defaults.privateIpv6GoogleAccess;
    	      this.serviceExternalIpsConfig = defaults.serviceExternalIpsConfig;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder datapathProvider(String datapathProvider) {
            this.datapathProvider = Objects.requireNonNull(datapathProvider);
            return this;
        }
        public Builder defaultSnatStatus(DefaultSnatStatusResponse defaultSnatStatus) {
            this.defaultSnatStatus = Objects.requireNonNull(defaultSnatStatus);
            return this;
        }
        public Builder dnsConfig(DNSConfigResponse dnsConfig) {
            this.dnsConfig = Objects.requireNonNull(dnsConfig);
            return this;
        }
        public Builder enableIntraNodeVisibility(Boolean enableIntraNodeVisibility) {
            this.enableIntraNodeVisibility = Objects.requireNonNull(enableIntraNodeVisibility);
            return this;
        }
        public Builder enableL4ilbSubsetting(Boolean enableL4ilbSubsetting) {
            this.enableL4ilbSubsetting = Objects.requireNonNull(enableL4ilbSubsetting);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder privateIpv6GoogleAccess(String privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = Objects.requireNonNull(privateIpv6GoogleAccess);
            return this;
        }
        public Builder serviceExternalIpsConfig(ServiceExternalIPsConfigResponse serviceExternalIpsConfig) {
            this.serviceExternalIpsConfig = Objects.requireNonNull(serviceExternalIpsConfig);
            return this;
        }
        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }        public NetworkConfigResponse build() {
            return new NetworkConfigResponse(datapathProvider, defaultSnatStatus, dnsConfig, enableIntraNodeVisibility, enableL4ilbSubsetting, network, privateIpv6GoogleAccess, serviceExternalIpsConfig, subnetwork);
        }
    }
}
