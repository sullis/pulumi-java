// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration of a virtual network to which API Management service is deployed.
 * 
 */
public final class VirtualNetworkConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkConfigurationArgs Empty = new VirtualNetworkConfigurationArgs();

    /**
     * The full resource ID of a subnet in a virtual network to deploy the API Management service in.
     * 
     */
    @Import(name="subnetResourceId")
    private @Nullable Output<String> subnetResourceId;

    /**
     * @return The full resource ID of a subnet in a virtual network to deploy the API Management service in.
     * 
     */
    public Optional<Output<String>> subnetResourceId() {
        return Optional.ofNullable(this.subnetResourceId);
    }

    private VirtualNetworkConfigurationArgs() {}

    private VirtualNetworkConfigurationArgs(VirtualNetworkConfigurationArgs $) {
        this.subnetResourceId = $.subnetResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkConfigurationArgs $;

        public Builder() {
            $ = new VirtualNetworkConfigurationArgs();
        }

        public Builder(VirtualNetworkConfigurationArgs defaults) {
            $ = new VirtualNetworkConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param subnetResourceId The full resource ID of a subnet in a virtual network to deploy the API Management service in.
         * 
         * @return builder
         * 
         */
        public Builder subnetResourceId(@Nullable Output<String> subnetResourceId) {
            $.subnetResourceId = subnetResourceId;
            return this;
        }

        /**
         * @param subnetResourceId The full resource ID of a subnet in a virtual network to deploy the API Management service in.
         * 
         * @return builder
         * 
         */
        public Builder subnetResourceId(String subnetResourceId) {
            return subnetResourceId(Output.of(subnetResourceId));
        }

        public VirtualNetworkConfigurationArgs build() {
            return $;
        }
    }

}
