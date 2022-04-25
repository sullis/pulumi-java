// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1.inputs.PrivateClusterMasterGlobalAccessConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration options for private clusters.
 * 
 */
public final class PrivateClusterConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateClusterConfigArgs Empty = new PrivateClusterConfigArgs();

    /**
     * Whether the master&#39;s internal IP address is used as the cluster endpoint.
     * 
     */
    @Import(name="enablePrivateEndpoint")
    private @Nullable Output<Boolean> enablePrivateEndpoint;

    /**
     * @return Whether the master&#39;s internal IP address is used as the cluster endpoint.
     * 
     */
    public Optional<Output<Boolean>> enablePrivateEndpoint() {
        return Optional.ofNullable(this.enablePrivateEndpoint);
    }

    /**
     * Whether nodes have internal IP addresses only. If enabled, all nodes are given only RFC 1918 private addresses and communicate with the master via private networking.
     * 
     */
    @Import(name="enablePrivateNodes")
    private @Nullable Output<Boolean> enablePrivateNodes;

    /**
     * @return Whether nodes have internal IP addresses only. If enabled, all nodes are given only RFC 1918 private addresses and communicate with the master via private networking.
     * 
     */
    public Optional<Output<Boolean>> enablePrivateNodes() {
        return Optional.ofNullable(this.enablePrivateNodes);
    }

    /**
     * Controls master global access settings.
     * 
     */
    @Import(name="masterGlobalAccessConfig")
    private @Nullable Output<PrivateClusterMasterGlobalAccessConfigArgs> masterGlobalAccessConfig;

    /**
     * @return Controls master global access settings.
     * 
     */
    public Optional<Output<PrivateClusterMasterGlobalAccessConfigArgs>> masterGlobalAccessConfig() {
        return Optional.ofNullable(this.masterGlobalAccessConfig);
    }

    /**
     * The IP range in CIDR notation to use for the hosted master network. This range will be used for assigning internal IP addresses to the master or set of masters, as well as the ILB VIP. This range must not overlap with any other ranges in use within the cluster&#39;s network.
     * 
     */
    @Import(name="masterIpv4CidrBlock")
    private @Nullable Output<String> masterIpv4CidrBlock;

    /**
     * @return The IP range in CIDR notation to use for the hosted master network. This range will be used for assigning internal IP addresses to the master or set of masters, as well as the ILB VIP. This range must not overlap with any other ranges in use within the cluster&#39;s network.
     * 
     */
    public Optional<Output<String>> masterIpv4CidrBlock() {
        return Optional.ofNullable(this.masterIpv4CidrBlock);
    }

    private PrivateClusterConfigArgs() {}

    private PrivateClusterConfigArgs(PrivateClusterConfigArgs $) {
        this.enablePrivateEndpoint = $.enablePrivateEndpoint;
        this.enablePrivateNodes = $.enablePrivateNodes;
        this.masterGlobalAccessConfig = $.masterGlobalAccessConfig;
        this.masterIpv4CidrBlock = $.masterIpv4CidrBlock;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateClusterConfigArgs $;

        public Builder() {
            $ = new PrivateClusterConfigArgs();
        }

        public Builder(PrivateClusterConfigArgs defaults) {
            $ = new PrivateClusterConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enablePrivateEndpoint Whether the master&#39;s internal IP address is used as the cluster endpoint.
         * 
         * @return builder
         * 
         */
        public Builder enablePrivateEndpoint(@Nullable Output<Boolean> enablePrivateEndpoint) {
            $.enablePrivateEndpoint = enablePrivateEndpoint;
            return this;
        }

        /**
         * @param enablePrivateEndpoint Whether the master&#39;s internal IP address is used as the cluster endpoint.
         * 
         * @return builder
         * 
         */
        public Builder enablePrivateEndpoint(Boolean enablePrivateEndpoint) {
            return enablePrivateEndpoint(Output.of(enablePrivateEndpoint));
        }

        /**
         * @param enablePrivateNodes Whether nodes have internal IP addresses only. If enabled, all nodes are given only RFC 1918 private addresses and communicate with the master via private networking.
         * 
         * @return builder
         * 
         */
        public Builder enablePrivateNodes(@Nullable Output<Boolean> enablePrivateNodes) {
            $.enablePrivateNodes = enablePrivateNodes;
            return this;
        }

        /**
         * @param enablePrivateNodes Whether nodes have internal IP addresses only. If enabled, all nodes are given only RFC 1918 private addresses and communicate with the master via private networking.
         * 
         * @return builder
         * 
         */
        public Builder enablePrivateNodes(Boolean enablePrivateNodes) {
            return enablePrivateNodes(Output.of(enablePrivateNodes));
        }

        /**
         * @param masterGlobalAccessConfig Controls master global access settings.
         * 
         * @return builder
         * 
         */
        public Builder masterGlobalAccessConfig(@Nullable Output<PrivateClusterMasterGlobalAccessConfigArgs> masterGlobalAccessConfig) {
            $.masterGlobalAccessConfig = masterGlobalAccessConfig;
            return this;
        }

        /**
         * @param masterGlobalAccessConfig Controls master global access settings.
         * 
         * @return builder
         * 
         */
        public Builder masterGlobalAccessConfig(PrivateClusterMasterGlobalAccessConfigArgs masterGlobalAccessConfig) {
            return masterGlobalAccessConfig(Output.of(masterGlobalAccessConfig));
        }

        /**
         * @param masterIpv4CidrBlock The IP range in CIDR notation to use for the hosted master network. This range will be used for assigning internal IP addresses to the master or set of masters, as well as the ILB VIP. This range must not overlap with any other ranges in use within the cluster&#39;s network.
         * 
         * @return builder
         * 
         */
        public Builder masterIpv4CidrBlock(@Nullable Output<String> masterIpv4CidrBlock) {
            $.masterIpv4CidrBlock = masterIpv4CidrBlock;
            return this;
        }

        /**
         * @param masterIpv4CidrBlock The IP range in CIDR notation to use for the hosted master network. This range will be used for assigning internal IP addresses to the master or set of masters, as well as the ILB VIP. This range must not overlap with any other ranges in use within the cluster&#39;s network.
         * 
         * @return builder
         * 
         */
        public Builder masterIpv4CidrBlock(String masterIpv4CidrBlock) {
            return masterIpv4CidrBlock(Output.of(masterIpv4CidrBlock));
        }

        public PrivateClusterConfigArgs build() {
            return $;
        }
    }

}
