// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcArgs Empty = new VpcArgs();

    /**
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of IP addresses, or the size of the CIDR block. Default is `false`. Conflicts with `ipv6_ipam_pool_id`
     * 
     */
    @Import(name="assignGeneratedIpv6CidrBlock")
    private @Nullable Output<Boolean> assignGeneratedIpv6CidrBlock;

    /**
     * @return Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of IP addresses, or the size of the CIDR block. Default is `false`. Conflicts with `ipv6_ipam_pool_id`
     * 
     */
    public Optional<Output<Boolean>> assignGeneratedIpv6CidrBlock() {
        return Optional.ofNullable(this.assignGeneratedIpv6CidrBlock);
    }

    /**
     * The IPv4 CIDR block for the VPC. CIDR can be explicitly set or it can be derived from IPAM using `ipv4_netmask_length`.
     * 
     */
    @Import(name="cidrBlock")
    private @Nullable Output<String> cidrBlock;

    /**
     * @return The IPv4 CIDR block for the VPC. CIDR can be explicitly set or it can be derived from IPAM using `ipv4_netmask_length`.
     * 
     */
    public Optional<Output<String>> cidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }

    /**
     * A boolean flag to enable/disable ClassicLink
     * for the VPC. Only valid in regions and accounts that support EC2 Classic.
     * See the [ClassicLink documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html) for more information. Defaults false.
     * 
     */
    @Import(name="enableClassiclink")
    private @Nullable Output<Boolean> enableClassiclink;

    /**
     * @return A boolean flag to enable/disable ClassicLink
     * for the VPC. Only valid in regions and accounts that support EC2 Classic.
     * See the [ClassicLink documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html) for more information. Defaults false.
     * 
     */
    public Optional<Output<Boolean>> enableClassiclink() {
        return Optional.ofNullable(this.enableClassiclink);
    }

    /**
     * A boolean flag to enable/disable ClassicLink DNS Support for the VPC.
     * Only valid in regions and accounts that support EC2 Classic.
     * 
     */
    @Import(name="enableClassiclinkDnsSupport")
    private @Nullable Output<Boolean> enableClassiclinkDnsSupport;

    /**
     * @return A boolean flag to enable/disable ClassicLink DNS Support for the VPC.
     * Only valid in regions and accounts that support EC2 Classic.
     * 
     */
    public Optional<Output<Boolean>> enableClassiclinkDnsSupport() {
        return Optional.ofNullable(this.enableClassiclinkDnsSupport);
    }

    /**
     * A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
     * 
     */
    @Import(name="enableDnsHostnames")
    private @Nullable Output<Boolean> enableDnsHostnames;

    /**
     * @return A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
     * 
     */
    public Optional<Output<Boolean>> enableDnsHostnames() {
        return Optional.ofNullable(this.enableDnsHostnames);
    }

    /**
     * A boolean flag to enable/disable DNS support in the VPC. Defaults true.
     * 
     */
    @Import(name="enableDnsSupport")
    private @Nullable Output<Boolean> enableDnsSupport;

    /**
     * @return A boolean flag to enable/disable DNS support in the VPC. Defaults true.
     * 
     */
    public Optional<Output<Boolean>> enableDnsSupport() {
        return Optional.ofNullable(this.enableDnsSupport);
    }

    /**
     * A tenancy option for instances launched into the VPC. Default is `default`, which makes your instances shared on the host. Using either of the other options (`dedicated` or `host`) costs at least $2/hr.
     * 
     */
    @Import(name="instanceTenancy")
    private @Nullable Output<String> instanceTenancy;

    /**
     * @return A tenancy option for instances launched into the VPC. Default is `default`, which makes your instances shared on the host. Using either of the other options (`dedicated` or `host`) costs at least $2/hr.
     * 
     */
    public Optional<Output<String>> instanceTenancy() {
        return Optional.ofNullable(this.instanceTenancy);
    }

    /**
     * The ID of an IPv4 IPAM pool you want to use for allocating this VPC&#39;s CIDR. IPAM is a VPC feature that you can use to automate your IP address management workflows including assigning, tracking, troubleshooting, and auditing IP addresses across AWS Regions and accounts. Using IPAM you can monitor IP address usage throughout your AWS Organization.
     * 
     */
    @Import(name="ipv4IpamPoolId")
    private @Nullable Output<String> ipv4IpamPoolId;

    /**
     * @return The ID of an IPv4 IPAM pool you want to use for allocating this VPC&#39;s CIDR. IPAM is a VPC feature that you can use to automate your IP address management workflows including assigning, tracking, troubleshooting, and auditing IP addresses across AWS Regions and accounts. Using IPAM you can monitor IP address usage throughout your AWS Organization.
     * 
     */
    public Optional<Output<String>> ipv4IpamPoolId() {
        return Optional.ofNullable(this.ipv4IpamPoolId);
    }

    /**
     * The netmask length of the IPv4 CIDR you want to allocate to this VPC. Requires specifying a `ipv4_ipam_pool_id`.
     * 
     */
    @Import(name="ipv4NetmaskLength")
    private @Nullable Output<Integer> ipv4NetmaskLength;

    /**
     * @return The netmask length of the IPv4 CIDR you want to allocate to this VPC. Requires specifying a `ipv4_ipam_pool_id`.
     * 
     */
    public Optional<Output<Integer>> ipv4NetmaskLength() {
        return Optional.ofNullable(this.ipv4NetmaskLength);
    }

    /**
     * IPv6 CIDR block to request from an IPAM Pool. Can be set explicitly or derived from IPAM using `ipv6_netmask_length`.
     * 
     */
    @Import(name="ipv6CidrBlock")
    private @Nullable Output<String> ipv6CidrBlock;

    /**
     * @return IPv6 CIDR block to request from an IPAM Pool. Can be set explicitly or derived from IPAM using `ipv6_netmask_length`.
     * 
     */
    public Optional<Output<String>> ipv6CidrBlock() {
        return Optional.ofNullable(this.ipv6CidrBlock);
    }

    /**
     * By default when an IPv6 CIDR is assigned to a VPC a default ipv6_cidr_block_network_border_group will be set to the region of the VPC. This can be changed to restrict advertisement of public addresses to specific Network Border Groups such as LocalZones.
     * 
     */
    @Import(name="ipv6CidrBlockNetworkBorderGroup")
    private @Nullable Output<String> ipv6CidrBlockNetworkBorderGroup;

    /**
     * @return By default when an IPv6 CIDR is assigned to a VPC a default ipv6_cidr_block_network_border_group will be set to the region of the VPC. This can be changed to restrict advertisement of public addresses to specific Network Border Groups such as LocalZones.
     * 
     */
    public Optional<Output<String>> ipv6CidrBlockNetworkBorderGroup() {
        return Optional.ofNullable(this.ipv6CidrBlockNetworkBorderGroup);
    }

    /**
     * IPAM Pool ID for a IPv6 pool. Conflicts with `assign_generated_ipv6_cidr_block`.
     * 
     */
    @Import(name="ipv6IpamPoolId")
    private @Nullable Output<String> ipv6IpamPoolId;

    /**
     * @return IPAM Pool ID for a IPv6 pool. Conflicts with `assign_generated_ipv6_cidr_block`.
     * 
     */
    public Optional<Output<String>> ipv6IpamPoolId() {
        return Optional.ofNullable(this.ipv6IpamPoolId);
    }

    /**
     * Netmask length to request from IPAM Pool. Conflicts with `ipv6_cidr_block`. This can be omitted if IPAM pool as a `allocation_default_netmask_length` set. Valid values: `56`.
     * 
     */
    @Import(name="ipv6NetmaskLength")
    private @Nullable Output<Integer> ipv6NetmaskLength;

    /**
     * @return Netmask length to request from IPAM Pool. Conflicts with `ipv6_cidr_block`. This can be omitted if IPAM pool as a `allocation_default_netmask_length` set. Valid values: `56`.
     * 
     */
    public Optional<Output<Integer>> ipv6NetmaskLength() {
        return Optional.ofNullable(this.ipv6NetmaskLength);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private VpcArgs() {}

    private VpcArgs(VpcArgs $) {
        this.assignGeneratedIpv6CidrBlock = $.assignGeneratedIpv6CidrBlock;
        this.cidrBlock = $.cidrBlock;
        this.enableClassiclink = $.enableClassiclink;
        this.enableClassiclinkDnsSupport = $.enableClassiclinkDnsSupport;
        this.enableDnsHostnames = $.enableDnsHostnames;
        this.enableDnsSupport = $.enableDnsSupport;
        this.instanceTenancy = $.instanceTenancy;
        this.ipv4IpamPoolId = $.ipv4IpamPoolId;
        this.ipv4NetmaskLength = $.ipv4NetmaskLength;
        this.ipv6CidrBlock = $.ipv6CidrBlock;
        this.ipv6CidrBlockNetworkBorderGroup = $.ipv6CidrBlockNetworkBorderGroup;
        this.ipv6IpamPoolId = $.ipv6IpamPoolId;
        this.ipv6NetmaskLength = $.ipv6NetmaskLength;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcArgs $;

        public Builder() {
            $ = new VpcArgs();
        }

        public Builder(VpcArgs defaults) {
            $ = new VpcArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assignGeneratedIpv6CidrBlock Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of IP addresses, or the size of the CIDR block. Default is `false`. Conflicts with `ipv6_ipam_pool_id`
         * 
         * @return builder
         * 
         */
        public Builder assignGeneratedIpv6CidrBlock(@Nullable Output<Boolean> assignGeneratedIpv6CidrBlock) {
            $.assignGeneratedIpv6CidrBlock = assignGeneratedIpv6CidrBlock;
            return this;
        }

        /**
         * @param assignGeneratedIpv6CidrBlock Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of IP addresses, or the size of the CIDR block. Default is `false`. Conflicts with `ipv6_ipam_pool_id`
         * 
         * @return builder
         * 
         */
        public Builder assignGeneratedIpv6CidrBlock(Boolean assignGeneratedIpv6CidrBlock) {
            return assignGeneratedIpv6CidrBlock(Output.of(assignGeneratedIpv6CidrBlock));
        }

        /**
         * @param cidrBlock The IPv4 CIDR block for the VPC. CIDR can be explicitly set or it can be derived from IPAM using `ipv4_netmask_length`.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(@Nullable Output<String> cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * @param cidrBlock The IPv4 CIDR block for the VPC. CIDR can be explicitly set or it can be derived from IPAM using `ipv4_netmask_length`.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(String cidrBlock) {
            return cidrBlock(Output.of(cidrBlock));
        }

        /**
         * @param enableClassiclink A boolean flag to enable/disable ClassicLink
         * for the VPC. Only valid in regions and accounts that support EC2 Classic.
         * See the [ClassicLink documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html) for more information. Defaults false.
         * 
         * @return builder
         * 
         */
        public Builder enableClassiclink(@Nullable Output<Boolean> enableClassiclink) {
            $.enableClassiclink = enableClassiclink;
            return this;
        }

        /**
         * @param enableClassiclink A boolean flag to enable/disable ClassicLink
         * for the VPC. Only valid in regions and accounts that support EC2 Classic.
         * See the [ClassicLink documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html) for more information. Defaults false.
         * 
         * @return builder
         * 
         */
        public Builder enableClassiclink(Boolean enableClassiclink) {
            return enableClassiclink(Output.of(enableClassiclink));
        }

        /**
         * @param enableClassiclinkDnsSupport A boolean flag to enable/disable ClassicLink DNS Support for the VPC.
         * Only valid in regions and accounts that support EC2 Classic.
         * 
         * @return builder
         * 
         */
        public Builder enableClassiclinkDnsSupport(@Nullable Output<Boolean> enableClassiclinkDnsSupport) {
            $.enableClassiclinkDnsSupport = enableClassiclinkDnsSupport;
            return this;
        }

        /**
         * @param enableClassiclinkDnsSupport A boolean flag to enable/disable ClassicLink DNS Support for the VPC.
         * Only valid in regions and accounts that support EC2 Classic.
         * 
         * @return builder
         * 
         */
        public Builder enableClassiclinkDnsSupport(Boolean enableClassiclinkDnsSupport) {
            return enableClassiclinkDnsSupport(Output.of(enableClassiclinkDnsSupport));
        }

        /**
         * @param enableDnsHostnames A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
         * 
         * @return builder
         * 
         */
        public Builder enableDnsHostnames(@Nullable Output<Boolean> enableDnsHostnames) {
            $.enableDnsHostnames = enableDnsHostnames;
            return this;
        }

        /**
         * @param enableDnsHostnames A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
         * 
         * @return builder
         * 
         */
        public Builder enableDnsHostnames(Boolean enableDnsHostnames) {
            return enableDnsHostnames(Output.of(enableDnsHostnames));
        }

        /**
         * @param enableDnsSupport A boolean flag to enable/disable DNS support in the VPC. Defaults true.
         * 
         * @return builder
         * 
         */
        public Builder enableDnsSupport(@Nullable Output<Boolean> enableDnsSupport) {
            $.enableDnsSupport = enableDnsSupport;
            return this;
        }

        /**
         * @param enableDnsSupport A boolean flag to enable/disable DNS support in the VPC. Defaults true.
         * 
         * @return builder
         * 
         */
        public Builder enableDnsSupport(Boolean enableDnsSupport) {
            return enableDnsSupport(Output.of(enableDnsSupport));
        }

        /**
         * @param instanceTenancy A tenancy option for instances launched into the VPC. Default is `default`, which makes your instances shared on the host. Using either of the other options (`dedicated` or `host`) costs at least $2/hr.
         * 
         * @return builder
         * 
         */
        public Builder instanceTenancy(@Nullable Output<String> instanceTenancy) {
            $.instanceTenancy = instanceTenancy;
            return this;
        }

        /**
         * @param instanceTenancy A tenancy option for instances launched into the VPC. Default is `default`, which makes your instances shared on the host. Using either of the other options (`dedicated` or `host`) costs at least $2/hr.
         * 
         * @return builder
         * 
         */
        public Builder instanceTenancy(String instanceTenancy) {
            return instanceTenancy(Output.of(instanceTenancy));
        }

        /**
         * @param ipv4IpamPoolId The ID of an IPv4 IPAM pool you want to use for allocating this VPC&#39;s CIDR. IPAM is a VPC feature that you can use to automate your IP address management workflows including assigning, tracking, troubleshooting, and auditing IP addresses across AWS Regions and accounts. Using IPAM you can monitor IP address usage throughout your AWS Organization.
         * 
         * @return builder
         * 
         */
        public Builder ipv4IpamPoolId(@Nullable Output<String> ipv4IpamPoolId) {
            $.ipv4IpamPoolId = ipv4IpamPoolId;
            return this;
        }

        /**
         * @param ipv4IpamPoolId The ID of an IPv4 IPAM pool you want to use for allocating this VPC&#39;s CIDR. IPAM is a VPC feature that you can use to automate your IP address management workflows including assigning, tracking, troubleshooting, and auditing IP addresses across AWS Regions and accounts. Using IPAM you can monitor IP address usage throughout your AWS Organization.
         * 
         * @return builder
         * 
         */
        public Builder ipv4IpamPoolId(String ipv4IpamPoolId) {
            return ipv4IpamPoolId(Output.of(ipv4IpamPoolId));
        }

        /**
         * @param ipv4NetmaskLength The netmask length of the IPv4 CIDR you want to allocate to this VPC. Requires specifying a `ipv4_ipam_pool_id`.
         * 
         * @return builder
         * 
         */
        public Builder ipv4NetmaskLength(@Nullable Output<Integer> ipv4NetmaskLength) {
            $.ipv4NetmaskLength = ipv4NetmaskLength;
            return this;
        }

        /**
         * @param ipv4NetmaskLength The netmask length of the IPv4 CIDR you want to allocate to this VPC. Requires specifying a `ipv4_ipam_pool_id`.
         * 
         * @return builder
         * 
         */
        public Builder ipv4NetmaskLength(Integer ipv4NetmaskLength) {
            return ipv4NetmaskLength(Output.of(ipv4NetmaskLength));
        }

        /**
         * @param ipv6CidrBlock IPv6 CIDR block to request from an IPAM Pool. Can be set explicitly or derived from IPAM using `ipv6_netmask_length`.
         * 
         * @return builder
         * 
         */
        public Builder ipv6CidrBlock(@Nullable Output<String> ipv6CidrBlock) {
            $.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        /**
         * @param ipv6CidrBlock IPv6 CIDR block to request from an IPAM Pool. Can be set explicitly or derived from IPAM using `ipv6_netmask_length`.
         * 
         * @return builder
         * 
         */
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            return ipv6CidrBlock(Output.of(ipv6CidrBlock));
        }

        /**
         * @param ipv6CidrBlockNetworkBorderGroup By default when an IPv6 CIDR is assigned to a VPC a default ipv6_cidr_block_network_border_group will be set to the region of the VPC. This can be changed to restrict advertisement of public addresses to specific Network Border Groups such as LocalZones.
         * 
         * @return builder
         * 
         */
        public Builder ipv6CidrBlockNetworkBorderGroup(@Nullable Output<String> ipv6CidrBlockNetworkBorderGroup) {
            $.ipv6CidrBlockNetworkBorderGroup = ipv6CidrBlockNetworkBorderGroup;
            return this;
        }

        /**
         * @param ipv6CidrBlockNetworkBorderGroup By default when an IPv6 CIDR is assigned to a VPC a default ipv6_cidr_block_network_border_group will be set to the region of the VPC. This can be changed to restrict advertisement of public addresses to specific Network Border Groups such as LocalZones.
         * 
         * @return builder
         * 
         */
        public Builder ipv6CidrBlockNetworkBorderGroup(String ipv6CidrBlockNetworkBorderGroup) {
            return ipv6CidrBlockNetworkBorderGroup(Output.of(ipv6CidrBlockNetworkBorderGroup));
        }

        /**
         * @param ipv6IpamPoolId IPAM Pool ID for a IPv6 pool. Conflicts with `assign_generated_ipv6_cidr_block`.
         * 
         * @return builder
         * 
         */
        public Builder ipv6IpamPoolId(@Nullable Output<String> ipv6IpamPoolId) {
            $.ipv6IpamPoolId = ipv6IpamPoolId;
            return this;
        }

        /**
         * @param ipv6IpamPoolId IPAM Pool ID for a IPv6 pool. Conflicts with `assign_generated_ipv6_cidr_block`.
         * 
         * @return builder
         * 
         */
        public Builder ipv6IpamPoolId(String ipv6IpamPoolId) {
            return ipv6IpamPoolId(Output.of(ipv6IpamPoolId));
        }

        /**
         * @param ipv6NetmaskLength Netmask length to request from IPAM Pool. Conflicts with `ipv6_cidr_block`. This can be omitted if IPAM pool as a `allocation_default_netmask_length` set. Valid values: `56`.
         * 
         * @return builder
         * 
         */
        public Builder ipv6NetmaskLength(@Nullable Output<Integer> ipv6NetmaskLength) {
            $.ipv6NetmaskLength = ipv6NetmaskLength;
            return this;
        }

        /**
         * @param ipv6NetmaskLength Netmask length to request from IPAM Pool. Conflicts with `ipv6_cidr_block`. This can be omitted if IPAM pool as a `allocation_default_netmask_length` set. Valid values: `56`.
         * 
         * @return builder
         * 
         */
        public Builder ipv6NetmaskLength(Integer ipv6NetmaskLength) {
            return ipv6NetmaskLength(Output.of(ipv6NetmaskLength));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public VpcArgs build() {
            return $;
        }
    }

}
