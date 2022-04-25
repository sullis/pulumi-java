// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNatGatewayArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNatGatewayArgs Empty = new GetNatGatewayArgs();

    /**
     * Expands referenced resources.
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    /**
     * @return Expands referenced resources.
     * 
     */
    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The name of the nat gateway.
     * 
     */
    @Import(name="natGatewayName", required=true)
    private String natGatewayName;

    /**
     * @return The name of the nat gateway.
     * 
     */
    public String natGatewayName() {
        return this.natGatewayName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetNatGatewayArgs() {}

    private GetNatGatewayArgs(GetNatGatewayArgs $) {
        this.expand = $.expand;
        this.natGatewayName = $.natGatewayName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNatGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNatGatewayArgs $;

        public Builder() {
            $ = new GetNatGatewayArgs();
        }

        public Builder(GetNatGatewayArgs defaults) {
            $ = new GetNatGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand Expands referenced resources.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param natGatewayName The name of the nat gateway.
         * 
         * @return builder
         * 
         */
        public Builder natGatewayName(String natGatewayName) {
            $.natGatewayName = natGatewayName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetNatGatewayArgs build() {
            $.natGatewayName = Objects.requireNonNull($.natGatewayName, "expected parameter 'natGatewayName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
