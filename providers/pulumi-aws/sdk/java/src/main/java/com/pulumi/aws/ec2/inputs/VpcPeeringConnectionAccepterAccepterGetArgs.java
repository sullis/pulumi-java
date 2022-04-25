// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcPeeringConnectionAccepterAccepterGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcPeeringConnectionAccepterAccepterGetArgs Empty = new VpcPeeringConnectionAccepterAccepterGetArgs();

    /**
     * Indicates whether a local ClassicLink connection can communicate
     * with the peer VPC over the VPC Peering Connection.
     * 
     */
    @Import(name="allowClassicLinkToRemoteVpc")
    private @Nullable Output<Boolean> allowClassicLinkToRemoteVpc;

    /**
     * @return Indicates whether a local ClassicLink connection can communicate
     * with the peer VPC over the VPC Peering Connection.
     * 
     */
    public Optional<Output<Boolean>> allowClassicLinkToRemoteVpc() {
        return Optional.ofNullable(this.allowClassicLinkToRemoteVpc);
    }

    /**
     * Indicates whether a local VPC can resolve public DNS hostnames to
     * private IP addresses when queried from instances in a peer VPC.
     * 
     */
    @Import(name="allowRemoteVpcDnsResolution")
    private @Nullable Output<Boolean> allowRemoteVpcDnsResolution;

    /**
     * @return Indicates whether a local VPC can resolve public DNS hostnames to
     * private IP addresses when queried from instances in a peer VPC.
     * 
     */
    public Optional<Output<Boolean>> allowRemoteVpcDnsResolution() {
        return Optional.ofNullable(this.allowRemoteVpcDnsResolution);
    }

    /**
     * Indicates whether a local VPC can communicate with a ClassicLink
     * connection in the peer VPC over the VPC Peering Connection.
     * 
     */
    @Import(name="allowVpcToRemoteClassicLink")
    private @Nullable Output<Boolean> allowVpcToRemoteClassicLink;

    /**
     * @return Indicates whether a local VPC can communicate with a ClassicLink
     * connection in the peer VPC over the VPC Peering Connection.
     * 
     */
    public Optional<Output<Boolean>> allowVpcToRemoteClassicLink() {
        return Optional.ofNullable(this.allowVpcToRemoteClassicLink);
    }

    private VpcPeeringConnectionAccepterAccepterGetArgs() {}

    private VpcPeeringConnectionAccepterAccepterGetArgs(VpcPeeringConnectionAccepterAccepterGetArgs $) {
        this.allowClassicLinkToRemoteVpc = $.allowClassicLinkToRemoteVpc;
        this.allowRemoteVpcDnsResolution = $.allowRemoteVpcDnsResolution;
        this.allowVpcToRemoteClassicLink = $.allowVpcToRemoteClassicLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcPeeringConnectionAccepterAccepterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcPeeringConnectionAccepterAccepterGetArgs $;

        public Builder() {
            $ = new VpcPeeringConnectionAccepterAccepterGetArgs();
        }

        public Builder(VpcPeeringConnectionAccepterAccepterGetArgs defaults) {
            $ = new VpcPeeringConnectionAccepterAccepterGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowClassicLinkToRemoteVpc Indicates whether a local ClassicLink connection can communicate
         * with the peer VPC over the VPC Peering Connection.
         * 
         * @return builder
         * 
         */
        public Builder allowClassicLinkToRemoteVpc(@Nullable Output<Boolean> allowClassicLinkToRemoteVpc) {
            $.allowClassicLinkToRemoteVpc = allowClassicLinkToRemoteVpc;
            return this;
        }

        /**
         * @param allowClassicLinkToRemoteVpc Indicates whether a local ClassicLink connection can communicate
         * with the peer VPC over the VPC Peering Connection.
         * 
         * @return builder
         * 
         */
        public Builder allowClassicLinkToRemoteVpc(Boolean allowClassicLinkToRemoteVpc) {
            return allowClassicLinkToRemoteVpc(Output.of(allowClassicLinkToRemoteVpc));
        }

        /**
         * @param allowRemoteVpcDnsResolution Indicates whether a local VPC can resolve public DNS hostnames to
         * private IP addresses when queried from instances in a peer VPC.
         * 
         * @return builder
         * 
         */
        public Builder allowRemoteVpcDnsResolution(@Nullable Output<Boolean> allowRemoteVpcDnsResolution) {
            $.allowRemoteVpcDnsResolution = allowRemoteVpcDnsResolution;
            return this;
        }

        /**
         * @param allowRemoteVpcDnsResolution Indicates whether a local VPC can resolve public DNS hostnames to
         * private IP addresses when queried from instances in a peer VPC.
         * 
         * @return builder
         * 
         */
        public Builder allowRemoteVpcDnsResolution(Boolean allowRemoteVpcDnsResolution) {
            return allowRemoteVpcDnsResolution(Output.of(allowRemoteVpcDnsResolution));
        }

        /**
         * @param allowVpcToRemoteClassicLink Indicates whether a local VPC can communicate with a ClassicLink
         * connection in the peer VPC over the VPC Peering Connection.
         * 
         * @return builder
         * 
         */
        public Builder allowVpcToRemoteClassicLink(@Nullable Output<Boolean> allowVpcToRemoteClassicLink) {
            $.allowVpcToRemoteClassicLink = allowVpcToRemoteClassicLink;
            return this;
        }

        /**
         * @param allowVpcToRemoteClassicLink Indicates whether a local VPC can communicate with a ClassicLink
         * connection in the peer VPC over the VPC Peering Connection.
         * 
         * @return builder
         * 
         */
        public Builder allowVpcToRemoteClassicLink(Boolean allowVpcToRemoteClassicLink) {
            return allowVpcToRemoteClassicLink(Output.of(allowVpcToRemoteClassicLink));
        }

        public VpcPeeringConnectionAccepterAccepterGetArgs build() {
            return $;
        }
    }

}
