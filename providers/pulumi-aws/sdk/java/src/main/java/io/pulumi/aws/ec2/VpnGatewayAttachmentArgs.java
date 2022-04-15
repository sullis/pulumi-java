// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class VpnGatewayAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnGatewayAttachmentArgs Empty = new VpnGatewayAttachmentArgs();

    /**
     * The ID of the VPC.
     * 
     */
    @Import(name="vpcId", required=true)
      private final Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     * The ID of the Virtual Private Gateway.
     * 
     */
    @Import(name="vpnGatewayId", required=true)
      private final Output<String> vpnGatewayId;

    public Output<String> vpnGatewayId() {
        return this.vpnGatewayId;
    }

    public VpnGatewayAttachmentArgs(
        Output<String> vpcId,
        Output<String> vpnGatewayId) {
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
        this.vpnGatewayId = Objects.requireNonNull(vpnGatewayId, "expected parameter 'vpnGatewayId' to be non-null");
    }

    private VpnGatewayAttachmentArgs() {
        this.vpcId = Codegen.empty();
        this.vpnGatewayId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnGatewayAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> vpcId;
        private Output<String> vpnGatewayId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnGatewayAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpcId = defaults.vpcId;
    	      this.vpnGatewayId = defaults.vpnGatewayId;
        }

        public Builder vpcId(Output<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Output.of(Objects.requireNonNull(vpcId));
            return this;
        }
        public Builder vpnGatewayId(Output<String> vpnGatewayId) {
            this.vpnGatewayId = Objects.requireNonNull(vpnGatewayId);
            return this;
        }
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = Output.of(Objects.requireNonNull(vpnGatewayId));
            return this;
        }        public VpnGatewayAttachmentArgs build() {
            return new VpnGatewayAttachmentArgs(vpcId, vpnGatewayId);
        }
    }
}
