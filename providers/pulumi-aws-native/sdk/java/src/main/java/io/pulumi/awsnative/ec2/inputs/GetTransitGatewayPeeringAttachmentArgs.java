// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetTransitGatewayPeeringAttachmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTransitGatewayPeeringAttachmentArgs Empty = new GetTransitGatewayPeeringAttachmentArgs();

    /**
     * The ID of the transit gateway peering attachment.
     * 
     */
    @InputImport(name="transitGatewayAttachmentId", required=true)
      private final String transitGatewayAttachmentId;

    public String getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }

    public GetTransitGatewayPeeringAttachmentArgs(String transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = Objects.requireNonNull(transitGatewayAttachmentId, "expected parameter 'transitGatewayAttachmentId' to be non-null");
    }

    private GetTransitGatewayPeeringAttachmentArgs() {
        this.transitGatewayAttachmentId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitGatewayPeeringAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String transitGatewayAttachmentId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransitGatewayPeeringAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transitGatewayAttachmentId = defaults.transitGatewayAttachmentId;
        }

        public Builder setTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = Objects.requireNonNull(transitGatewayAttachmentId);
            return this;
        }
        public GetTransitGatewayPeeringAttachmentArgs build() {
            return new GetTransitGatewayPeeringAttachmentArgs(transitGatewayAttachmentId);
        }
    }
}