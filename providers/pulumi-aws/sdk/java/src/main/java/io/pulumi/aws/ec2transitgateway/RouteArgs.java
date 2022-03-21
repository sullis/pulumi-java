// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteArgs Empty = new RouteArgs();

    /**
     * Indicates whether to drop traffic that matches this route (default to `false`).
     * 
     */
    @Import(name="blackhole")
      private final @Nullable Output<Boolean> blackhole;

    public Output<Boolean> getBlackhole() {
        return this.blackhole == null ? Output.empty() : this.blackhole;
    }

    /**
     * IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
     * 
     */
    @Import(name="destinationCidrBlock", required=true)
      private final Output<String> destinationCidrBlock;

    public Output<String> getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
     * 
     */
    @Import(name="transitGatewayAttachmentId")
      private final @Nullable Output<String> transitGatewayAttachmentId;

    public Output<String> getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId == null ? Output.empty() : this.transitGatewayAttachmentId;
    }

    /**
     * Identifier of EC2 Transit Gateway Route Table.
     * 
     */
    @Import(name="transitGatewayRouteTableId", required=true)
      private final Output<String> transitGatewayRouteTableId;

    public Output<String> getTransitGatewayRouteTableId() {
        return this.transitGatewayRouteTableId;
    }

    public RouteArgs(
        @Nullable Output<Boolean> blackhole,
        Output<String> destinationCidrBlock,
        @Nullable Output<String> transitGatewayAttachmentId,
        Output<String> transitGatewayRouteTableId) {
        this.blackhole = blackhole;
        this.destinationCidrBlock = Objects.requireNonNull(destinationCidrBlock, "expected parameter 'destinationCidrBlock' to be non-null");
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
        this.transitGatewayRouteTableId = Objects.requireNonNull(transitGatewayRouteTableId, "expected parameter 'transitGatewayRouteTableId' to be non-null");
    }

    private RouteArgs() {
        this.blackhole = Output.empty();
        this.destinationCidrBlock = Output.empty();
        this.transitGatewayAttachmentId = Output.empty();
        this.transitGatewayRouteTableId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> blackhole;
        private Output<String> destinationCidrBlock;
        private @Nullable Output<String> transitGatewayAttachmentId;
        private Output<String> transitGatewayRouteTableId;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blackhole = defaults.blackhole;
    	      this.destinationCidrBlock = defaults.destinationCidrBlock;
    	      this.transitGatewayAttachmentId = defaults.transitGatewayAttachmentId;
    	      this.transitGatewayRouteTableId = defaults.transitGatewayRouteTableId;
        }

        public Builder blackhole(@Nullable Output<Boolean> blackhole) {
            this.blackhole = blackhole;
            return this;
        }
        public Builder blackhole(@Nullable Boolean blackhole) {
            this.blackhole = Output.ofNullable(blackhole);
            return this;
        }
        public Builder destinationCidrBlock(Output<String> destinationCidrBlock) {
            this.destinationCidrBlock = Objects.requireNonNull(destinationCidrBlock);
            return this;
        }
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = Output.of(Objects.requireNonNull(destinationCidrBlock));
            return this;
        }
        public Builder transitGatewayAttachmentId(@Nullable Output<String> transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = transitGatewayAttachmentId;
            return this;
        }
        public Builder transitGatewayAttachmentId(@Nullable String transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = Output.ofNullable(transitGatewayAttachmentId);
            return this;
        }
        public Builder transitGatewayRouteTableId(Output<String> transitGatewayRouteTableId) {
            this.transitGatewayRouteTableId = Objects.requireNonNull(transitGatewayRouteTableId);
            return this;
        }
        public Builder transitGatewayRouteTableId(String transitGatewayRouteTableId) {
            this.transitGatewayRouteTableId = Output.of(Objects.requireNonNull(transitGatewayRouteTableId));
            return this;
        }        public RouteArgs build() {
            return new RouteArgs(blackhole, destinationCidrBlock, transitGatewayAttachmentId, transitGatewayRouteTableId);
        }
    }
}
