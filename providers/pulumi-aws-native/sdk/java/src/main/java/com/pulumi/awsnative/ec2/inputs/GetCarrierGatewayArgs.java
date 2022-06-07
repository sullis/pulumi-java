// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCarrierGatewayArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCarrierGatewayArgs Empty = new GetCarrierGatewayArgs();

    /**
     * The ID of the carrier gateway.
     * 
     */
    @Import(name="carrierGatewayId", required=true)
    private Output<String> carrierGatewayId;

    /**
     * @return The ID of the carrier gateway.
     * 
     */
    public Output<String> carrierGatewayId() {
        return this.carrierGatewayId;
    }

    private GetCarrierGatewayArgs() {}

    private GetCarrierGatewayArgs(GetCarrierGatewayArgs $) {
        this.carrierGatewayId = $.carrierGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCarrierGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCarrierGatewayArgs $;

        public Builder() {
            $ = new GetCarrierGatewayArgs();
        }

        public Builder(GetCarrierGatewayArgs defaults) {
            $ = new GetCarrierGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param carrierGatewayId The ID of the carrier gateway.
         * 
         * @return builder
         * 
         */
        public Builder carrierGatewayId(Output<String> carrierGatewayId) {
            $.carrierGatewayId = carrierGatewayId;
            return this;
        }

        /**
         * @param carrierGatewayId The ID of the carrier gateway.
         * 
         * @return builder
         * 
         */
        public Builder carrierGatewayId(String carrierGatewayId) {
            return carrierGatewayId(Output.of(carrierGatewayId));
        }

        public GetCarrierGatewayArgs build() {
            $.carrierGatewayId = Objects.requireNonNull($.carrierGatewayId, "expected parameter 'carrierGatewayId' to be non-null");
            return $;
        }
    }

}
