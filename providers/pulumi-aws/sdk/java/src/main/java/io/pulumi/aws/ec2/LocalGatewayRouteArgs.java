// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class LocalGatewayRouteArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocalGatewayRouteArgs Empty = new LocalGatewayRouteArgs();

    /**
     * IPv4 CIDR range used for destination matches. Routing decisions are based on the most specific match.
     * 
     */
    @Import(name="destinationCidrBlock", required=true)
      private final Output<String> destinationCidrBlock;

    public Output<String> destinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * Identifier of EC2 Local Gateway Route Table.
     * 
     */
    @Import(name="localGatewayRouteTableId", required=true)
      private final Output<String> localGatewayRouteTableId;

    public Output<String> localGatewayRouteTableId() {
        return this.localGatewayRouteTableId;
    }

    /**
     * Identifier of EC2 Local Gateway Virtual Interface Group.
     * 
     */
    @Import(name="localGatewayVirtualInterfaceGroupId", required=true)
      private final Output<String> localGatewayVirtualInterfaceGroupId;

    public Output<String> localGatewayVirtualInterfaceGroupId() {
        return this.localGatewayVirtualInterfaceGroupId;
    }

    public LocalGatewayRouteArgs(
        Output<String> destinationCidrBlock,
        Output<String> localGatewayRouteTableId,
        Output<String> localGatewayVirtualInterfaceGroupId) {
        this.destinationCidrBlock = Objects.requireNonNull(destinationCidrBlock, "expected parameter 'destinationCidrBlock' to be non-null");
        this.localGatewayRouteTableId = Objects.requireNonNull(localGatewayRouteTableId, "expected parameter 'localGatewayRouteTableId' to be non-null");
        this.localGatewayVirtualInterfaceGroupId = Objects.requireNonNull(localGatewayVirtualInterfaceGroupId, "expected parameter 'localGatewayVirtualInterfaceGroupId' to be non-null");
    }

    private LocalGatewayRouteArgs() {
        this.destinationCidrBlock = Codegen.empty();
        this.localGatewayRouteTableId = Codegen.empty();
        this.localGatewayVirtualInterfaceGroupId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalGatewayRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> destinationCidrBlock;
        private Output<String> localGatewayRouteTableId;
        private Output<String> localGatewayVirtualInterfaceGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalGatewayRouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationCidrBlock = defaults.destinationCidrBlock;
    	      this.localGatewayRouteTableId = defaults.localGatewayRouteTableId;
    	      this.localGatewayVirtualInterfaceGroupId = defaults.localGatewayVirtualInterfaceGroupId;
        }

        public Builder destinationCidrBlock(Output<String> destinationCidrBlock) {
            this.destinationCidrBlock = Objects.requireNonNull(destinationCidrBlock);
            return this;
        }
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = Output.of(Objects.requireNonNull(destinationCidrBlock));
            return this;
        }
        public Builder localGatewayRouteTableId(Output<String> localGatewayRouteTableId) {
            this.localGatewayRouteTableId = Objects.requireNonNull(localGatewayRouteTableId);
            return this;
        }
        public Builder localGatewayRouteTableId(String localGatewayRouteTableId) {
            this.localGatewayRouteTableId = Output.of(Objects.requireNonNull(localGatewayRouteTableId));
            return this;
        }
        public Builder localGatewayVirtualInterfaceGroupId(Output<String> localGatewayVirtualInterfaceGroupId) {
            this.localGatewayVirtualInterfaceGroupId = Objects.requireNonNull(localGatewayVirtualInterfaceGroupId);
            return this;
        }
        public Builder localGatewayVirtualInterfaceGroupId(String localGatewayVirtualInterfaceGroupId) {
            this.localGatewayVirtualInterfaceGroupId = Output.of(Objects.requireNonNull(localGatewayVirtualInterfaceGroupId));
            return this;
        }        public LocalGatewayRouteArgs build() {
            return new LocalGatewayRouteArgs(destinationCidrBlock, localGatewayRouteTableId, localGatewayVirtualInterfaceGroupId);
        }
    }
}
