// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkmanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCustomerGatewayAssociationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCustomerGatewayAssociationPlainArgs Empty = new GetCustomerGatewayAssociationPlainArgs();

    /**
     * The Amazon Resource Name (ARN) of the customer gateway.
     * 
     */
    @Import(name="customerGatewayArn", required=true)
    private String customerGatewayArn;

    /**
     * @return The Amazon Resource Name (ARN) of the customer gateway.
     * 
     */
    public String customerGatewayArn() {
        return this.customerGatewayArn;
    }

    /**
     * The ID of the global network.
     * 
     */
    @Import(name="globalNetworkId", required=true)
    private String globalNetworkId;

    /**
     * @return The ID of the global network.
     * 
     */
    public String globalNetworkId() {
        return this.globalNetworkId;
    }

    private GetCustomerGatewayAssociationPlainArgs() {}

    private GetCustomerGatewayAssociationPlainArgs(GetCustomerGatewayAssociationPlainArgs $) {
        this.customerGatewayArn = $.customerGatewayArn;
        this.globalNetworkId = $.globalNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCustomerGatewayAssociationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCustomerGatewayAssociationPlainArgs $;

        public Builder() {
            $ = new GetCustomerGatewayAssociationPlainArgs();
        }

        public Builder(GetCustomerGatewayAssociationPlainArgs defaults) {
            $ = new GetCustomerGatewayAssociationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customerGatewayArn The Amazon Resource Name (ARN) of the customer gateway.
         * 
         * @return builder
         * 
         */
        public Builder customerGatewayArn(String customerGatewayArn) {
            $.customerGatewayArn = customerGatewayArn;
            return this;
        }

        /**
         * @param globalNetworkId The ID of the global network.
         * 
         * @return builder
         * 
         */
        public Builder globalNetworkId(String globalNetworkId) {
            $.globalNetworkId = globalNetworkId;
            return this;
        }

        public GetCustomerGatewayAssociationPlainArgs build() {
            $.customerGatewayArn = Objects.requireNonNull($.customerGatewayArn, "expected parameter 'customerGatewayArn' to be non-null");
            $.globalNetworkId = Objects.requireNonNull($.globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
            return $;
        }
    }

}
