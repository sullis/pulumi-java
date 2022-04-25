// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DefaultVpcDhcpOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DefaultVpcDhcpOptionsArgs Empty = new DefaultVpcDhcpOptionsArgs();

    /**
     * List of NETBIOS name servers.
     * 
     */
    @Import(name="netbiosNameServers")
    private @Nullable Output<List<String>> netbiosNameServers;

    /**
     * @return List of NETBIOS name servers.
     * 
     */
    public Optional<Output<List<String>>> netbiosNameServers() {
        return Optional.ofNullable(this.netbiosNameServers);
    }

    /**
     * The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
     * 
     */
    @Import(name="netbiosNodeType")
    private @Nullable Output<String> netbiosNodeType;

    /**
     * @return The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
     * 
     */
    public Optional<Output<String>> netbiosNodeType() {
        return Optional.ofNullable(this.netbiosNodeType);
    }

    /**
     * The ID of the AWS account that owns the DHCP options set.
     * 
     */
    @Import(name="ownerId")
    private @Nullable Output<String> ownerId;

    /**
     * @return The ID of the AWS account that owns the DHCP options set.
     * 
     */
    public Optional<Output<String>> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }

    /**
     * A map of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DefaultVpcDhcpOptionsArgs() {}

    private DefaultVpcDhcpOptionsArgs(DefaultVpcDhcpOptionsArgs $) {
        this.netbiosNameServers = $.netbiosNameServers;
        this.netbiosNodeType = $.netbiosNodeType;
        this.ownerId = $.ownerId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefaultVpcDhcpOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefaultVpcDhcpOptionsArgs $;

        public Builder() {
            $ = new DefaultVpcDhcpOptionsArgs();
        }

        public Builder(DefaultVpcDhcpOptionsArgs defaults) {
            $ = new DefaultVpcDhcpOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param netbiosNameServers List of NETBIOS name servers.
         * 
         * @return builder
         * 
         */
        public Builder netbiosNameServers(@Nullable Output<List<String>> netbiosNameServers) {
            $.netbiosNameServers = netbiosNameServers;
            return this;
        }

        /**
         * @param netbiosNameServers List of NETBIOS name servers.
         * 
         * @return builder
         * 
         */
        public Builder netbiosNameServers(List<String> netbiosNameServers) {
            return netbiosNameServers(Output.of(netbiosNameServers));
        }

        /**
         * @param netbiosNameServers List of NETBIOS name servers.
         * 
         * @return builder
         * 
         */
        public Builder netbiosNameServers(String... netbiosNameServers) {
            return netbiosNameServers(List.of(netbiosNameServers));
        }

        /**
         * @param netbiosNodeType The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
         * 
         * @return builder
         * 
         */
        public Builder netbiosNodeType(@Nullable Output<String> netbiosNodeType) {
            $.netbiosNodeType = netbiosNodeType;
            return this;
        }

        /**
         * @param netbiosNodeType The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
         * 
         * @return builder
         * 
         */
        public Builder netbiosNodeType(String netbiosNodeType) {
            return netbiosNodeType(Output.of(netbiosNodeType));
        }

        /**
         * @param ownerId The ID of the AWS account that owns the DHCP options set.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(@Nullable Output<String> ownerId) {
            $.ownerId = ownerId;
            return this;
        }

        /**
         * @param ownerId The ID of the AWS account that owns the DHCP options set.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(String ownerId) {
            return ownerId(Output.of(ownerId));
        }

        /**
         * @param tags A map of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public DefaultVpcDhcpOptionsArgs build() {
            return $;
        }
    }

}
