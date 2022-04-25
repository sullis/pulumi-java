// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration for controlling how IPs are allocated in the cluster.
 * 
 */
public final class IPAllocationPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final IPAllocationPolicyResponse Empty = new IPAllocationPolicyResponse();

    /**
     * The IP address range for the cluster pod IPs. If this field is set, then `cluster.cluster_ipv4_cidr` must be left blank. This field is only applicable when `use_ip_aliases` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    @Import(name="clusterIpv4CidrBlock", required=true)
    private String clusterIpv4CidrBlock;

    /**
     * @return The IP address range for the cluster pod IPs. If this field is set, then `cluster.cluster_ipv4_cidr` must be left blank. This field is only applicable when `use_ip_aliases` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    public String clusterIpv4CidrBlock() {
        return this.clusterIpv4CidrBlock;
    }

    /**
     * The name of the secondary range to be used for the cluster CIDR block. The secondary range will be used for pod IP addresses. This must be an existing secondary range associated with the cluster subnetwork. This field is only applicable with use_ip_aliases is true and create_subnetwork is false.
     * 
     */
    @Import(name="clusterSecondaryRangeName", required=true)
    private String clusterSecondaryRangeName;

    /**
     * @return The name of the secondary range to be used for the cluster CIDR block. The secondary range will be used for pod IP addresses. This must be an existing secondary range associated with the cluster subnetwork. This field is only applicable with use_ip_aliases is true and create_subnetwork is false.
     * 
     */
    public String clusterSecondaryRangeName() {
        return this.clusterSecondaryRangeName;
    }

    /**
     * Whether a new subnetwork will be created automatically for the cluster. This field is only applicable when `use_ip_aliases` is true.
     * 
     */
    @Import(name="createSubnetwork", required=true)
    private Boolean createSubnetwork;

    /**
     * @return Whether a new subnetwork will be created automatically for the cluster. This field is only applicable when `use_ip_aliases` is true.
     * 
     */
    public Boolean createSubnetwork() {
        return this.createSubnetwork;
    }

    /**
     * The IP address range of the instance IPs in this cluster. This is applicable only if `create_subnetwork` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    @Import(name="nodeIpv4CidrBlock", required=true)
    private String nodeIpv4CidrBlock;

    /**
     * @return The IP address range of the instance IPs in this cluster. This is applicable only if `create_subnetwork` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    public String nodeIpv4CidrBlock() {
        return this.nodeIpv4CidrBlock;
    }

    /**
     * The IP address range of the services IPs in this cluster. If blank, a range will be automatically chosen with the default size. This field is only applicable when `use_ip_aliases` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    @Import(name="servicesIpv4CidrBlock", required=true)
    private String servicesIpv4CidrBlock;

    /**
     * @return The IP address range of the services IPs in this cluster. If blank, a range will be automatically chosen with the default size. This field is only applicable when `use_ip_aliases` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    public String servicesIpv4CidrBlock() {
        return this.servicesIpv4CidrBlock;
    }

    /**
     * The name of the secondary range to be used as for the services CIDR block. The secondary range will be used for service ClusterIPs. This must be an existing secondary range associated with the cluster subnetwork. This field is only applicable with use_ip_aliases is true and create_subnetwork is false.
     * 
     */
    @Import(name="servicesSecondaryRangeName", required=true)
    private String servicesSecondaryRangeName;

    /**
     * @return The name of the secondary range to be used as for the services CIDR block. The secondary range will be used for service ClusterIPs. This must be an existing secondary range associated with the cluster subnetwork. This field is only applicable with use_ip_aliases is true and create_subnetwork is false.
     * 
     */
    public String servicesSecondaryRangeName() {
        return this.servicesSecondaryRangeName;
    }

    /**
     * A custom subnetwork name to be used if `create_subnetwork` is true. If this field is empty, then an automatic name will be chosen for the new subnetwork.
     * 
     */
    @Import(name="subnetworkName", required=true)
    private String subnetworkName;

    /**
     * @return A custom subnetwork name to be used if `create_subnetwork` is true. If this field is empty, then an automatic name will be chosen for the new subnetwork.
     * 
     */
    public String subnetworkName() {
        return this.subnetworkName;
    }

    /**
     * The IP address range of the Cloud TPUs in this cluster. If unspecified, a range will be automatically chosen with the default size. This field is only applicable when `use_ip_aliases` is true. If unspecified, the range will use the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    @Import(name="tpuIpv4CidrBlock", required=true)
    private String tpuIpv4CidrBlock;

    /**
     * @return The IP address range of the Cloud TPUs in this cluster. If unspecified, a range will be automatically chosen with the default size. This field is only applicable when `use_ip_aliases` is true. If unspecified, the range will use the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    public String tpuIpv4CidrBlock() {
        return this.tpuIpv4CidrBlock;
    }

    /**
     * Whether alias IPs will be used for pod IPs in the cluster. This is used in conjunction with use_routes. It cannot be true if use_routes is true. If both use_ip_aliases and use_routes are false, then the server picks the default IP allocation mode
     * 
     */
    @Import(name="useIpAliases", required=true)
    private Boolean useIpAliases;

    /**
     * @return Whether alias IPs will be used for pod IPs in the cluster. This is used in conjunction with use_routes. It cannot be true if use_routes is true. If both use_ip_aliases and use_routes are false, then the server picks the default IP allocation mode
     * 
     */
    public Boolean useIpAliases() {
        return this.useIpAliases;
    }

    /**
     * Whether routes will be used for pod IPs in the cluster. This is used in conjunction with use_ip_aliases. It cannot be true if use_ip_aliases is true. If both use_ip_aliases and use_routes are false, then the server picks the default IP allocation mode
     * 
     */
    @Import(name="useRoutes", required=true)
    private Boolean useRoutes;

    /**
     * @return Whether routes will be used for pod IPs in the cluster. This is used in conjunction with use_ip_aliases. It cannot be true if use_ip_aliases is true. If both use_ip_aliases and use_routes are false, then the server picks the default IP allocation mode
     * 
     */
    public Boolean useRoutes() {
        return this.useRoutes;
    }

    private IPAllocationPolicyResponse() {}

    private IPAllocationPolicyResponse(IPAllocationPolicyResponse $) {
        this.clusterIpv4CidrBlock = $.clusterIpv4CidrBlock;
        this.clusterSecondaryRangeName = $.clusterSecondaryRangeName;
        this.createSubnetwork = $.createSubnetwork;
        this.nodeIpv4CidrBlock = $.nodeIpv4CidrBlock;
        this.servicesIpv4CidrBlock = $.servicesIpv4CidrBlock;
        this.servicesSecondaryRangeName = $.servicesSecondaryRangeName;
        this.subnetworkName = $.subnetworkName;
        this.tpuIpv4CidrBlock = $.tpuIpv4CidrBlock;
        this.useIpAliases = $.useIpAliases;
        this.useRoutes = $.useRoutes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IPAllocationPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IPAllocationPolicyResponse $;

        public Builder() {
            $ = new IPAllocationPolicyResponse();
        }

        public Builder(IPAllocationPolicyResponse defaults) {
            $ = new IPAllocationPolicyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterIpv4CidrBlock The IP address range for the cluster pod IPs. If this field is set, then `cluster.cluster_ipv4_cidr` must be left blank. This field is only applicable when `use_ip_aliases` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
         * 
         * @return builder
         * 
         */
        public Builder clusterIpv4CidrBlock(String clusterIpv4CidrBlock) {
            $.clusterIpv4CidrBlock = clusterIpv4CidrBlock;
            return this;
        }

        /**
         * @param clusterSecondaryRangeName The name of the secondary range to be used for the cluster CIDR block. The secondary range will be used for pod IP addresses. This must be an existing secondary range associated with the cluster subnetwork. This field is only applicable with use_ip_aliases is true and create_subnetwork is false.
         * 
         * @return builder
         * 
         */
        public Builder clusterSecondaryRangeName(String clusterSecondaryRangeName) {
            $.clusterSecondaryRangeName = clusterSecondaryRangeName;
            return this;
        }

        /**
         * @param createSubnetwork Whether a new subnetwork will be created automatically for the cluster. This field is only applicable when `use_ip_aliases` is true.
         * 
         * @return builder
         * 
         */
        public Builder createSubnetwork(Boolean createSubnetwork) {
            $.createSubnetwork = createSubnetwork;
            return this;
        }

        /**
         * @param nodeIpv4CidrBlock The IP address range of the instance IPs in this cluster. This is applicable only if `create_subnetwork` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
         * 
         * @return builder
         * 
         */
        public Builder nodeIpv4CidrBlock(String nodeIpv4CidrBlock) {
            $.nodeIpv4CidrBlock = nodeIpv4CidrBlock;
            return this;
        }

        /**
         * @param servicesIpv4CidrBlock The IP address range of the services IPs in this cluster. If blank, a range will be automatically chosen with the default size. This field is only applicable when `use_ip_aliases` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
         * 
         * @return builder
         * 
         */
        public Builder servicesIpv4CidrBlock(String servicesIpv4CidrBlock) {
            $.servicesIpv4CidrBlock = servicesIpv4CidrBlock;
            return this;
        }

        /**
         * @param servicesSecondaryRangeName The name of the secondary range to be used as for the services CIDR block. The secondary range will be used for service ClusterIPs. This must be an existing secondary range associated with the cluster subnetwork. This field is only applicable with use_ip_aliases is true and create_subnetwork is false.
         * 
         * @return builder
         * 
         */
        public Builder servicesSecondaryRangeName(String servicesSecondaryRangeName) {
            $.servicesSecondaryRangeName = servicesSecondaryRangeName;
            return this;
        }

        /**
         * @param subnetworkName A custom subnetwork name to be used if `create_subnetwork` is true. If this field is empty, then an automatic name will be chosen for the new subnetwork.
         * 
         * @return builder
         * 
         */
        public Builder subnetworkName(String subnetworkName) {
            $.subnetworkName = subnetworkName;
            return this;
        }

        /**
         * @param tpuIpv4CidrBlock The IP address range of the Cloud TPUs in this cluster. If unspecified, a range will be automatically chosen with the default size. This field is only applicable when `use_ip_aliases` is true. If unspecified, the range will use the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
         * 
         * @return builder
         * 
         */
        public Builder tpuIpv4CidrBlock(String tpuIpv4CidrBlock) {
            $.tpuIpv4CidrBlock = tpuIpv4CidrBlock;
            return this;
        }

        /**
         * @param useIpAliases Whether alias IPs will be used for pod IPs in the cluster. This is used in conjunction with use_routes. It cannot be true if use_routes is true. If both use_ip_aliases and use_routes are false, then the server picks the default IP allocation mode
         * 
         * @return builder
         * 
         */
        public Builder useIpAliases(Boolean useIpAliases) {
            $.useIpAliases = useIpAliases;
            return this;
        }

        /**
         * @param useRoutes Whether routes will be used for pod IPs in the cluster. This is used in conjunction with use_ip_aliases. It cannot be true if use_ip_aliases is true. If both use_ip_aliases and use_routes are false, then the server picks the default IP allocation mode
         * 
         * @return builder
         * 
         */
        public Builder useRoutes(Boolean useRoutes) {
            $.useRoutes = useRoutes;
            return this;
        }

        public IPAllocationPolicyResponse build() {
            $.clusterIpv4CidrBlock = Objects.requireNonNull($.clusterIpv4CidrBlock, "expected parameter 'clusterIpv4CidrBlock' to be non-null");
            $.clusterSecondaryRangeName = Objects.requireNonNull($.clusterSecondaryRangeName, "expected parameter 'clusterSecondaryRangeName' to be non-null");
            $.createSubnetwork = Objects.requireNonNull($.createSubnetwork, "expected parameter 'createSubnetwork' to be non-null");
            $.nodeIpv4CidrBlock = Objects.requireNonNull($.nodeIpv4CidrBlock, "expected parameter 'nodeIpv4CidrBlock' to be non-null");
            $.servicesIpv4CidrBlock = Objects.requireNonNull($.servicesIpv4CidrBlock, "expected parameter 'servicesIpv4CidrBlock' to be non-null");
            $.servicesSecondaryRangeName = Objects.requireNonNull($.servicesSecondaryRangeName, "expected parameter 'servicesSecondaryRangeName' to be non-null");
            $.subnetworkName = Objects.requireNonNull($.subnetworkName, "expected parameter 'subnetworkName' to be non-null");
            $.tpuIpv4CidrBlock = Objects.requireNonNull($.tpuIpv4CidrBlock, "expected parameter 'tpuIpv4CidrBlock' to be non-null");
            $.useIpAliases = Objects.requireNonNull($.useIpAliases, "expected parameter 'useIpAliases' to be non-null");
            $.useRoutes = Objects.requireNonNull($.useRoutes, "expected parameter 'useRoutes' to be non-null");
            return $;
        }
    }

}
