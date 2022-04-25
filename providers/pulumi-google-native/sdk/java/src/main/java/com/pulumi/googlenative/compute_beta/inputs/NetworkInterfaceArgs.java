// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.NetworkInterfaceNicType;
import com.pulumi.googlenative.compute_beta.enums.NetworkInterfaceStackType;
import com.pulumi.googlenative.compute_beta.inputs.AccessConfigArgs;
import com.pulumi.googlenative.compute_beta.inputs.AliasIpRangeArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A network interface resource attached to an instance.
 * 
 */
public final class NetworkInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceArgs Empty = new NetworkInterfaceArgs();

    /**
     * An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
     * 
     */
    @Import(name="accessConfigs")
    private @Nullable Output<List<AccessConfigArgs>> accessConfigs;

    /**
     * @return An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
     * 
     */
    public Optional<Output<List<AccessConfigArgs>>> accessConfigs() {
        return Optional.ofNullable(this.accessConfigs);
    }

    /**
     * An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
     * 
     */
    @Import(name="aliasIpRanges")
    private @Nullable Output<List<AliasIpRangeArgs>> aliasIpRanges;

    /**
     * @return An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
     * 
     */
    public Optional<Output<List<AliasIpRangeArgs>>> aliasIpRanges() {
        return Optional.ofNullable(this.aliasIpRanges);
    }

    /**
     * An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
     * 
     */
    @Import(name="ipv6AccessConfigs")
    private @Nullable Output<List<AccessConfigArgs>> ipv6AccessConfigs;

    /**
     * @return An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
     * 
     */
    public Optional<Output<List<AccessConfigArgs>>> ipv6AccessConfigs() {
        return Optional.ofNullable(this.ipv6AccessConfigs);
    }

    /**
     * An IPv6 internal network address for this network interface.
     * 
     */
    @Import(name="ipv6Address")
    private @Nullable Output<String> ipv6Address;

    /**
     * @return An IPv6 internal network address for this network interface.
     * 
     */
    public Optional<Output<String>> ipv6Address() {
        return Optional.ofNullable(this.ipv6Address);
    }

    /**
     * URL of the VPC network resource for this instance. When creating an instance, if neither the network nor the subnetwork is specified, the default network global/networks/default is used. If the selected project doesn&#39;t have the default network, you must specify a network or subnet. If the network is not specified but the subnetwork is specified, the network is inferred. If you specify this property, you can specify the network as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/global/networks/ network - projects/project/global/networks/network - global/networks/default
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return URL of the VPC network resource for this instance. When creating an instance, if neither the network nor the subnetwork is specified, the default network global/networks/default is used. If the selected project doesn&#39;t have the default network, you must specify a network or subnet. If the network is not specified but the subnetwork is specified, the network is inferred. If you specify this property, you can specify the network as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/global/networks/ network - projects/project/global/networks/network - global/networks/default
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * An IPv4 internal IP address to assign to the instance for this network interface. If not specified by the user, an unused internal IP is assigned by the system.
     * 
     */
    @Import(name="networkIP")
    private @Nullable Output<String> networkIP;

    /**
     * @return An IPv4 internal IP address to assign to the instance for this network interface. If not specified by the user, an unused internal IP is assigned by the system.
     * 
     */
    public Optional<Output<String>> networkIP() {
        return Optional.ofNullable(this.networkIP);
    }

    /**
     * The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
     * 
     */
    @Import(name="nicType")
    private @Nullable Output<NetworkInterfaceNicType> nicType;

    /**
     * @return The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
     * 
     */
    public Optional<Output<NetworkInterfaceNicType>> nicType() {
        return Optional.ofNullable(this.nicType);
    }

    /**
     * The networking queue count that&#39;s specified by users for the network interface. Both Rx and Tx queues will be set to this number. It&#39;ll be empty if not specified by the users.
     * 
     */
    @Import(name="queueCount")
    private @Nullable Output<Integer> queueCount;

    /**
     * @return The networking queue count that&#39;s specified by users for the network interface. Both Rx and Tx queues will be set to this number. It&#39;ll be empty if not specified by the users.
     * 
     */
    public Optional<Output<Integer>> queueCount() {
        return Optional.ofNullable(this.queueCount);
    }

    /**
     * The stack type for this network interface to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used. This field can be both set at instance creation and update network interface operations.
     * 
     */
    @Import(name="stackType")
    private @Nullable Output<NetworkInterfaceStackType> stackType;

    /**
     * @return The stack type for this network interface to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used. This field can be both set at instance creation and update network interface operations.
     * 
     */
    public Optional<Output<NetworkInterfaceStackType>> stackType() {
        return Optional.ofNullable(this.stackType);
    }

    /**
     * The URL of the Subnetwork resource for this instance. If the network resource is in legacy mode, do not specify this field. If the network is in auto subnet mode, specifying the subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is required. If you specify this field, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork - regions/region/subnetworks/subnetwork
     * 
     */
    @Import(name="subnetwork")
    private @Nullable Output<String> subnetwork;

    /**
     * @return The URL of the Subnetwork resource for this instance. If the network resource is in legacy mode, do not specify this field. If the network is in auto subnet mode, specifying the subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is required. If you specify this field, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork - regions/region/subnetworks/subnetwork
     * 
     */
    public Optional<Output<String>> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    private NetworkInterfaceArgs() {}

    private NetworkInterfaceArgs(NetworkInterfaceArgs $) {
        this.accessConfigs = $.accessConfigs;
        this.aliasIpRanges = $.aliasIpRanges;
        this.ipv6AccessConfigs = $.ipv6AccessConfigs;
        this.ipv6Address = $.ipv6Address;
        this.network = $.network;
        this.networkIP = $.networkIP;
        this.nicType = $.nicType;
        this.queueCount = $.queueCount;
        this.stackType = $.stackType;
        this.subnetwork = $.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInterfaceArgs $;

        public Builder() {
            $ = new NetworkInterfaceArgs();
        }

        public Builder(NetworkInterfaceArgs defaults) {
            $ = new NetworkInterfaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessConfigs An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
         * 
         * @return builder
         * 
         */
        public Builder accessConfigs(@Nullable Output<List<AccessConfigArgs>> accessConfigs) {
            $.accessConfigs = accessConfigs;
            return this;
        }

        /**
         * @param accessConfigs An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
         * 
         * @return builder
         * 
         */
        public Builder accessConfigs(List<AccessConfigArgs> accessConfigs) {
            return accessConfigs(Output.of(accessConfigs));
        }

        /**
         * @param accessConfigs An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
         * 
         * @return builder
         * 
         */
        public Builder accessConfigs(AccessConfigArgs... accessConfigs) {
            return accessConfigs(List.of(accessConfigs));
        }

        /**
         * @param aliasIpRanges An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
         * 
         * @return builder
         * 
         */
        public Builder aliasIpRanges(@Nullable Output<List<AliasIpRangeArgs>> aliasIpRanges) {
            $.aliasIpRanges = aliasIpRanges;
            return this;
        }

        /**
         * @param aliasIpRanges An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
         * 
         * @return builder
         * 
         */
        public Builder aliasIpRanges(List<AliasIpRangeArgs> aliasIpRanges) {
            return aliasIpRanges(Output.of(aliasIpRanges));
        }

        /**
         * @param aliasIpRanges An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
         * 
         * @return builder
         * 
         */
        public Builder aliasIpRanges(AliasIpRangeArgs... aliasIpRanges) {
            return aliasIpRanges(List.of(aliasIpRanges));
        }

        /**
         * @param ipv6AccessConfigs An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
         * 
         * @return builder
         * 
         */
        public Builder ipv6AccessConfigs(@Nullable Output<List<AccessConfigArgs>> ipv6AccessConfigs) {
            $.ipv6AccessConfigs = ipv6AccessConfigs;
            return this;
        }

        /**
         * @param ipv6AccessConfigs An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
         * 
         * @return builder
         * 
         */
        public Builder ipv6AccessConfigs(List<AccessConfigArgs> ipv6AccessConfigs) {
            return ipv6AccessConfigs(Output.of(ipv6AccessConfigs));
        }

        /**
         * @param ipv6AccessConfigs An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
         * 
         * @return builder
         * 
         */
        public Builder ipv6AccessConfigs(AccessConfigArgs... ipv6AccessConfigs) {
            return ipv6AccessConfigs(List.of(ipv6AccessConfigs));
        }

        /**
         * @param ipv6Address An IPv6 internal network address for this network interface.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Address(@Nullable Output<String> ipv6Address) {
            $.ipv6Address = ipv6Address;
            return this;
        }

        /**
         * @param ipv6Address An IPv6 internal network address for this network interface.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Address(String ipv6Address) {
            return ipv6Address(Output.of(ipv6Address));
        }

        /**
         * @param network URL of the VPC network resource for this instance. When creating an instance, if neither the network nor the subnetwork is specified, the default network global/networks/default is used. If the selected project doesn&#39;t have the default network, you must specify a network or subnet. If the network is not specified but the subnetwork is specified, the network is inferred. If you specify this property, you can specify the network as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/global/networks/ network - projects/project/global/networks/network - global/networks/default
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network URL of the VPC network resource for this instance. When creating an instance, if neither the network nor the subnetwork is specified, the default network global/networks/default is used. If the selected project doesn&#39;t have the default network, you must specify a network or subnet. If the network is not specified but the subnetwork is specified, the network is inferred. If you specify this property, you can specify the network as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/global/networks/ network - projects/project/global/networks/network - global/networks/default
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param networkIP An IPv4 internal IP address to assign to the instance for this network interface. If not specified by the user, an unused internal IP is assigned by the system.
         * 
         * @return builder
         * 
         */
        public Builder networkIP(@Nullable Output<String> networkIP) {
            $.networkIP = networkIP;
            return this;
        }

        /**
         * @param networkIP An IPv4 internal IP address to assign to the instance for this network interface. If not specified by the user, an unused internal IP is assigned by the system.
         * 
         * @return builder
         * 
         */
        public Builder networkIP(String networkIP) {
            return networkIP(Output.of(networkIP));
        }

        /**
         * @param nicType The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
         * 
         * @return builder
         * 
         */
        public Builder nicType(@Nullable Output<NetworkInterfaceNicType> nicType) {
            $.nicType = nicType;
            return this;
        }

        /**
         * @param nicType The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
         * 
         * @return builder
         * 
         */
        public Builder nicType(NetworkInterfaceNicType nicType) {
            return nicType(Output.of(nicType));
        }

        /**
         * @param queueCount The networking queue count that&#39;s specified by users for the network interface. Both Rx and Tx queues will be set to this number. It&#39;ll be empty if not specified by the users.
         * 
         * @return builder
         * 
         */
        public Builder queueCount(@Nullable Output<Integer> queueCount) {
            $.queueCount = queueCount;
            return this;
        }

        /**
         * @param queueCount The networking queue count that&#39;s specified by users for the network interface. Both Rx and Tx queues will be set to this number. It&#39;ll be empty if not specified by the users.
         * 
         * @return builder
         * 
         */
        public Builder queueCount(Integer queueCount) {
            return queueCount(Output.of(queueCount));
        }

        /**
         * @param stackType The stack type for this network interface to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used. This field can be both set at instance creation and update network interface operations.
         * 
         * @return builder
         * 
         */
        public Builder stackType(@Nullable Output<NetworkInterfaceStackType> stackType) {
            $.stackType = stackType;
            return this;
        }

        /**
         * @param stackType The stack type for this network interface to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used. This field can be both set at instance creation and update network interface operations.
         * 
         * @return builder
         * 
         */
        public Builder stackType(NetworkInterfaceStackType stackType) {
            return stackType(Output.of(stackType));
        }

        /**
         * @param subnetwork The URL of the Subnetwork resource for this instance. If the network resource is in legacy mode, do not specify this field. If the network is in auto subnet mode, specifying the subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is required. If you specify this field, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork - regions/region/subnetworks/subnetwork
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        /**
         * @param subnetwork The URL of the Subnetwork resource for this instance. If the network resource is in legacy mode, do not specify this field. If the network is in auto subnet mode, specifying the subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is required. If you specify this field, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork - regions/region/subnetworks/subnetwork
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(String subnetwork) {
            return subnetwork(Output.of(subnetwork));
        }

        public NetworkInterfaceArgs build() {
            return $;
        }
    }

}
