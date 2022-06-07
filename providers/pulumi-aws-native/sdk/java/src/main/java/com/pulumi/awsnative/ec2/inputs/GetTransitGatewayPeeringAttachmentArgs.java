// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTransitGatewayPeeringAttachmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransitGatewayPeeringAttachmentArgs Empty = new GetTransitGatewayPeeringAttachmentArgs();

    /**
     * The ID of the transit gateway peering attachment.
     * 
     */
    @Import(name="transitGatewayAttachmentId", required=true)
    private Output<String> transitGatewayAttachmentId;

    /**
     * @return The ID of the transit gateway peering attachment.
     * 
     */
    public Output<String> transitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }

    private GetTransitGatewayPeeringAttachmentArgs() {}

    private GetTransitGatewayPeeringAttachmentArgs(GetTransitGatewayPeeringAttachmentArgs $) {
        this.transitGatewayAttachmentId = $.transitGatewayAttachmentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransitGatewayPeeringAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransitGatewayPeeringAttachmentArgs $;

        public Builder() {
            $ = new GetTransitGatewayPeeringAttachmentArgs();
        }

        public Builder(GetTransitGatewayPeeringAttachmentArgs defaults) {
            $ = new GetTransitGatewayPeeringAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param transitGatewayAttachmentId The ID of the transit gateway peering attachment.
         * 
         * @return builder
         * 
         */
        public Builder transitGatewayAttachmentId(Output<String> transitGatewayAttachmentId) {
            $.transitGatewayAttachmentId = transitGatewayAttachmentId;
            return this;
        }

        /**
         * @param transitGatewayAttachmentId The ID of the transit gateway peering attachment.
         * 
         * @return builder
         * 
         */
        public Builder transitGatewayAttachmentId(String transitGatewayAttachmentId) {
            return transitGatewayAttachmentId(Output.of(transitGatewayAttachmentId));
        }

        public GetTransitGatewayPeeringAttachmentArgs build() {
            $.transitGatewayAttachmentId = Objects.requireNonNull($.transitGatewayAttachmentId, "expected parameter 'transitGatewayAttachmentId' to be non-null");
            return $;
        }
    }

}
