// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for controlling how IPs are allocated in the GKE cluster running the Apache Airflow software.
 * 
 */
public final class IPAllocationPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final IPAllocationPolicyArgs Empty = new IPAllocationPolicyArgs();

    /**
     * Optional. The IP address range used to allocate IP addresses to pods in the GKE cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true. Set to blank to have GKE choose a range with the default size. Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    @Import(name="clusterIpv4CidrBlock")
    private @Nullable Output<String> clusterIpv4CidrBlock;

    /**
     * @return Optional. The IP address range used to allocate IP addresses to pods in the GKE cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true. Set to blank to have GKE choose a range with the default size. Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    public Optional<Output<String>> clusterIpv4CidrBlock() {
        return Optional.ofNullable(this.clusterIpv4CidrBlock);
    }

    /**
     * Optional. The name of the GKE cluster&#39;s secondary range used to allocate IP addresses to pods. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true.
     * 
     */
    @Import(name="clusterSecondaryRangeName")
    private @Nullable Output<String> clusterSecondaryRangeName;

    /**
     * @return Optional. The name of the GKE cluster&#39;s secondary range used to allocate IP addresses to pods. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true.
     * 
     */
    public Optional<Output<String>> clusterSecondaryRangeName() {
        return Optional.ofNullable(this.clusterSecondaryRangeName);
    }

    /**
     * Optional. The IP address range of the services IP addresses in this GKE cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true. Set to blank to have GKE choose a range with the default size. Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    @Import(name="servicesIpv4CidrBlock")
    private @Nullable Output<String> servicesIpv4CidrBlock;

    /**
     * @return Optional. The IP address range of the services IP addresses in this GKE cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true. Set to blank to have GKE choose a range with the default size. Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    public Optional<Output<String>> servicesIpv4CidrBlock() {
        return Optional.ofNullable(this.servicesIpv4CidrBlock);
    }

    /**
     * Optional. The name of the services&#39; secondary range used to allocate IP addresses to the GKE cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true.
     * 
     */
    @Import(name="servicesSecondaryRangeName")
    private @Nullable Output<String> servicesSecondaryRangeName;

    /**
     * @return Optional. The name of the services&#39; secondary range used to allocate IP addresses to the GKE cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true.
     * 
     */
    public Optional<Output<String>> servicesSecondaryRangeName() {
        return Optional.ofNullable(this.servicesSecondaryRangeName);
    }

    /**
     * Optional. Whether or not to enable Alias IPs in the GKE cluster. If `true`, a VPC-native cluster is created. This field is only supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*. Environments in newer versions always use VPC-native GKE clusters.
     * 
     */
    @Import(name="useIpAliases")
    private @Nullable Output<Boolean> useIpAliases;

    /**
     * @return Optional. Whether or not to enable Alias IPs in the GKE cluster. If `true`, a VPC-native cluster is created. This field is only supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*. Environments in newer versions always use VPC-native GKE clusters.
     * 
     */
    public Optional<Output<Boolean>> useIpAliases() {
        return Optional.ofNullable(this.useIpAliases);
    }

    private IPAllocationPolicyArgs() {}

    private IPAllocationPolicyArgs(IPAllocationPolicyArgs $) {
        this.clusterIpv4CidrBlock = $.clusterIpv4CidrBlock;
        this.clusterSecondaryRangeName = $.clusterSecondaryRangeName;
        this.servicesIpv4CidrBlock = $.servicesIpv4CidrBlock;
        this.servicesSecondaryRangeName = $.servicesSecondaryRangeName;
        this.useIpAliases = $.useIpAliases;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IPAllocationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IPAllocationPolicyArgs $;

        public Builder() {
            $ = new IPAllocationPolicyArgs();
        }

        public Builder(IPAllocationPolicyArgs defaults) {
            $ = new IPAllocationPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterIpv4CidrBlock Optional. The IP address range used to allocate IP addresses to pods in the GKE cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true. Set to blank to have GKE choose a range with the default size. Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
         * 
         * @return builder
         * 
         */
        public Builder clusterIpv4CidrBlock(@Nullable Output<String> clusterIpv4CidrBlock) {
            $.clusterIpv4CidrBlock = clusterIpv4CidrBlock;
            return this;
        }

        /**
         * @param clusterIpv4CidrBlock Optional. The IP address range used to allocate IP addresses to pods in the GKE cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true. Set to blank to have GKE choose a range with the default size. Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
         * 
         * @return builder
         * 
         */
        public Builder clusterIpv4CidrBlock(String clusterIpv4CidrBlock) {
            return clusterIpv4CidrBlock(Output.of(clusterIpv4CidrBlock));
        }

        /**
         * @param clusterSecondaryRangeName Optional. The name of the GKE cluster&#39;s secondary range used to allocate IP addresses to pods. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true.
         * 
         * @return builder
         * 
         */
        public Builder clusterSecondaryRangeName(@Nullable Output<String> clusterSecondaryRangeName) {
            $.clusterSecondaryRangeName = clusterSecondaryRangeName;
            return this;
        }

        /**
         * @param clusterSecondaryRangeName Optional. The name of the GKE cluster&#39;s secondary range used to allocate IP addresses to pods. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true.
         * 
         * @return builder
         * 
         */
        public Builder clusterSecondaryRangeName(String clusterSecondaryRangeName) {
            return clusterSecondaryRangeName(Output.of(clusterSecondaryRangeName));
        }

        /**
         * @param servicesIpv4CidrBlock Optional. The IP address range of the services IP addresses in this GKE cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true. Set to blank to have GKE choose a range with the default size. Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
         * 
         * @return builder
         * 
         */
        public Builder servicesIpv4CidrBlock(@Nullable Output<String> servicesIpv4CidrBlock) {
            $.servicesIpv4CidrBlock = servicesIpv4CidrBlock;
            return this;
        }

        /**
         * @param servicesIpv4CidrBlock Optional. The IP address range of the services IP addresses in this GKE cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true. Set to blank to have GKE choose a range with the default size. Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
         * 
         * @return builder
         * 
         */
        public Builder servicesIpv4CidrBlock(String servicesIpv4CidrBlock) {
            return servicesIpv4CidrBlock(Output.of(servicesIpv4CidrBlock));
        }

        /**
         * @param servicesSecondaryRangeName Optional. The name of the services&#39; secondary range used to allocate IP addresses to the GKE cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true.
         * 
         * @return builder
         * 
         */
        public Builder servicesSecondaryRangeName(@Nullable Output<String> servicesSecondaryRangeName) {
            $.servicesSecondaryRangeName = servicesSecondaryRangeName;
            return this;
        }

        /**
         * @param servicesSecondaryRangeName Optional. The name of the services&#39; secondary range used to allocate IP addresses to the GKE cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true.
         * 
         * @return builder
         * 
         */
        public Builder servicesSecondaryRangeName(String servicesSecondaryRangeName) {
            return servicesSecondaryRangeName(Output.of(servicesSecondaryRangeName));
        }

        /**
         * @param useIpAliases Optional. Whether or not to enable Alias IPs in the GKE cluster. If `true`, a VPC-native cluster is created. This field is only supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*. Environments in newer versions always use VPC-native GKE clusters.
         * 
         * @return builder
         * 
         */
        public Builder useIpAliases(@Nullable Output<Boolean> useIpAliases) {
            $.useIpAliases = useIpAliases;
            return this;
        }

        /**
         * @param useIpAliases Optional. Whether or not to enable Alias IPs in the GKE cluster. If `true`, a VPC-native cluster is created. This field is only supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*. Environments in newer versions always use VPC-native GKE clusters.
         * 
         * @return builder
         * 
         */
        public Builder useIpAliases(Boolean useIpAliases) {
            return useIpAliases(Output.of(useIpAliases));
        }

        public IPAllocationPolicyArgs build() {
            return $;
        }
    }

}
