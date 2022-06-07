// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOrderItemByNamePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrderItemByNamePlainArgs Empty = new GetOrderItemByNamePlainArgs();

    /**
     * $expand is supported on device details, forward shipping details and reverse shipping details parameters. Each of these can be provided as a comma separated list. Device Details for order item provides details on the devices of the product, Forward and Reverse Shipping details provide forward and reverse shipping details respectively.
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    /**
     * @return $expand is supported on device details, forward shipping details and reverse shipping details parameters. Each of these can be provided as a comma separated list. Device Details for order item provides details on the devices of the product, Forward and Reverse Shipping details provide forward and reverse shipping details respectively.
     * 
     */
    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The name of the order item
     * 
     */
    @Import(name="orderItemName", required=true)
    private String orderItemName;

    /**
     * @return The name of the order item
     * 
     */
    public String orderItemName() {
        return this.orderItemName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetOrderItemByNamePlainArgs() {}

    private GetOrderItemByNamePlainArgs(GetOrderItemByNamePlainArgs $) {
        this.expand = $.expand;
        this.orderItemName = $.orderItemName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrderItemByNamePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrderItemByNamePlainArgs $;

        public Builder() {
            $ = new GetOrderItemByNamePlainArgs();
        }

        public Builder(GetOrderItemByNamePlainArgs defaults) {
            $ = new GetOrderItemByNamePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand $expand is supported on device details, forward shipping details and reverse shipping details parameters. Each of these can be provided as a comma separated list. Device Details for order item provides details on the devices of the product, Forward and Reverse Shipping details provide forward and reverse shipping details respectively.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param orderItemName The name of the order item
         * 
         * @return builder
         * 
         */
        public Builder orderItemName(String orderItemName) {
            $.orderItemName = orderItemName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetOrderItemByNamePlainArgs build() {
            $.orderItemName = Objects.requireNonNull($.orderItemName, "expected parameter 'orderItemName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
