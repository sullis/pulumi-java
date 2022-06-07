// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLocalGatewayRouteArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLocalGatewayRouteArgs Empty = new GetLocalGatewayRouteArgs();

    /**
     * The CIDR block used for destination matches.
     * 
     */
    @Import(name="destinationCidrBlock", required=true)
    private Output<String> destinationCidrBlock;

    /**
     * @return The CIDR block used for destination matches.
     * 
     */
    public Output<String> destinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * The ID of the local gateway route table.
     * 
     */
    @Import(name="localGatewayRouteTableId", required=true)
    private Output<String> localGatewayRouteTableId;

    /**
     * @return The ID of the local gateway route table.
     * 
     */
    public Output<String> localGatewayRouteTableId() {
        return this.localGatewayRouteTableId;
    }

    private GetLocalGatewayRouteArgs() {}

    private GetLocalGatewayRouteArgs(GetLocalGatewayRouteArgs $) {
        this.destinationCidrBlock = $.destinationCidrBlock;
        this.localGatewayRouteTableId = $.localGatewayRouteTableId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLocalGatewayRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLocalGatewayRouteArgs $;

        public Builder() {
            $ = new GetLocalGatewayRouteArgs();
        }

        public Builder(GetLocalGatewayRouteArgs defaults) {
            $ = new GetLocalGatewayRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationCidrBlock The CIDR block used for destination matches.
         * 
         * @return builder
         * 
         */
        public Builder destinationCidrBlock(Output<String> destinationCidrBlock) {
            $.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * @param destinationCidrBlock The CIDR block used for destination matches.
         * 
         * @return builder
         * 
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            return destinationCidrBlock(Output.of(destinationCidrBlock));
        }

        /**
         * @param localGatewayRouteTableId The ID of the local gateway route table.
         * 
         * @return builder
         * 
         */
        public Builder localGatewayRouteTableId(Output<String> localGatewayRouteTableId) {
            $.localGatewayRouteTableId = localGatewayRouteTableId;
            return this;
        }

        /**
         * @param localGatewayRouteTableId The ID of the local gateway route table.
         * 
         * @return builder
         * 
         */
        public Builder localGatewayRouteTableId(String localGatewayRouteTableId) {
            return localGatewayRouteTableId(Output.of(localGatewayRouteTableId));
        }

        public GetLocalGatewayRouteArgs build() {
            $.destinationCidrBlock = Objects.requireNonNull($.destinationCidrBlock, "expected parameter 'destinationCidrBlock' to be non-null");
            $.localGatewayRouteTableId = Objects.requireNonNull($.localGatewayRouteTableId, "expected parameter 'localGatewayRouteTableId' to be non-null");
            return $;
        }
    }

}
