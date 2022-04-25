// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.azurenative.apimanagement.inputs.ApiManagementServiceSkuPropertiesArgs;
import com.pulumi.azurenative.apimanagement.inputs.VirtualNetworkConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of an additional API Management resource location.
 * 
 */
public final class AdditionalLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AdditionalLocationArgs Empty = new AdditionalLocationArgs();

    /**
     * Property only valid for an Api Management service deployed in multiple locations. This can be used to disable the gateway in this additional location.
     * 
     */
    @Import(name="disableGateway")
    private @Nullable Output<Boolean> disableGateway;

    /**
     * @return Property only valid for an Api Management service deployed in multiple locations. This can be used to disable the gateway in this additional location.
     * 
     */
    public Optional<Output<Boolean>> disableGateway() {
        return Optional.ofNullable(this.disableGateway);
    }

    /**
     * The location name of the additional region among Azure Data center regions.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The location name of the additional region among Azure Data center regions.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * SKU properties of the API Management service.
     * 
     */
    @Import(name="sku", required=true)
    private Output<ApiManagementServiceSkuPropertiesArgs> sku;

    /**
     * @return SKU properties of the API Management service.
     * 
     */
    public Output<ApiManagementServiceSkuPropertiesArgs> sku() {
        return this.sku;
    }

    /**
     * Virtual network configuration for the location.
     * 
     */
    @Import(name="virtualNetworkConfiguration")
    private @Nullable Output<VirtualNetworkConfigurationArgs> virtualNetworkConfiguration;

    /**
     * @return Virtual network configuration for the location.
     * 
     */
    public Optional<Output<VirtualNetworkConfigurationArgs>> virtualNetworkConfiguration() {
        return Optional.ofNullable(this.virtualNetworkConfiguration);
    }

    /**
     * A list of availability zones denoting where the resource needs to come from.
     * 
     */
    @Import(name="zones")
    private @Nullable Output<List<String>> zones;

    /**
     * @return A list of availability zones denoting where the resource needs to come from.
     * 
     */
    public Optional<Output<List<String>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private AdditionalLocationArgs() {}

    private AdditionalLocationArgs(AdditionalLocationArgs $) {
        this.disableGateway = $.disableGateway;
        this.location = $.location;
        this.sku = $.sku;
        this.virtualNetworkConfiguration = $.virtualNetworkConfiguration;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdditionalLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdditionalLocationArgs $;

        public Builder() {
            $ = new AdditionalLocationArgs();
        }

        public Builder(AdditionalLocationArgs defaults) {
            $ = new AdditionalLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disableGateway Property only valid for an Api Management service deployed in multiple locations. This can be used to disable the gateway in this additional location.
         * 
         * @return builder
         * 
         */
        public Builder disableGateway(@Nullable Output<Boolean> disableGateway) {
            $.disableGateway = disableGateway;
            return this;
        }

        /**
         * @param disableGateway Property only valid for an Api Management service deployed in multiple locations. This can be used to disable the gateway in this additional location.
         * 
         * @return builder
         * 
         */
        public Builder disableGateway(Boolean disableGateway) {
            return disableGateway(Output.of(disableGateway));
        }

        /**
         * @param location The location name of the additional region among Azure Data center regions.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location name of the additional region among Azure Data center regions.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param sku SKU properties of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<ApiManagementServiceSkuPropertiesArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku SKU properties of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder sku(ApiManagementServiceSkuPropertiesArgs sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param virtualNetworkConfiguration Virtual network configuration for the location.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkConfiguration(@Nullable Output<VirtualNetworkConfigurationArgs> virtualNetworkConfiguration) {
            $.virtualNetworkConfiguration = virtualNetworkConfiguration;
            return this;
        }

        /**
         * @param virtualNetworkConfiguration Virtual network configuration for the location.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkConfiguration(VirtualNetworkConfigurationArgs virtualNetworkConfiguration) {
            return virtualNetworkConfiguration(Output.of(virtualNetworkConfiguration));
        }

        /**
         * @param zones A list of availability zones denoting where the resource needs to come from.
         * 
         * @return builder
         * 
         */
        public Builder zones(@Nullable Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones A list of availability zones denoting where the resource needs to come from.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        /**
         * @param zones A list of availability zones denoting where the resource needs to come from.
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public AdditionalLocationArgs build() {
            $.disableGateway = Codegen.booleanProp("disableGateway").output().arg($.disableGateway).def(false).getNullable();
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}
