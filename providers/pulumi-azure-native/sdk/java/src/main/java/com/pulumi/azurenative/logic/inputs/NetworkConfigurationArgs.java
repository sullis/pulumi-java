// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.inputs.IntegrationServiceEnvironmentAccessEndpointArgs;
import com.pulumi.azurenative.logic.inputs.ResourceReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The network configuration.
 * 
 */
public final class NetworkConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkConfigurationArgs Empty = new NetworkConfigurationArgs();

    /**
     * The access endpoint.
     * 
     */
    @Import(name="accessEndpoint")
    private @Nullable Output<IntegrationServiceEnvironmentAccessEndpointArgs> accessEndpoint;

    /**
     * @return The access endpoint.
     * 
     */
    public Optional<Output<IntegrationServiceEnvironmentAccessEndpointArgs>> accessEndpoint() {
        return Optional.ofNullable(this.accessEndpoint);
    }

    /**
     * The subnets.
     * 
     */
    @Import(name="subnets")
    private @Nullable Output<List<ResourceReferenceArgs>> subnets;

    /**
     * @return The subnets.
     * 
     */
    public Optional<Output<List<ResourceReferenceArgs>>> subnets() {
        return Optional.ofNullable(this.subnets);
    }

    /**
     * Gets the virtual network address space.
     * 
     */
    @Import(name="virtualNetworkAddressSpace")
    private @Nullable Output<String> virtualNetworkAddressSpace;

    /**
     * @return Gets the virtual network address space.
     * 
     */
    public Optional<Output<String>> virtualNetworkAddressSpace() {
        return Optional.ofNullable(this.virtualNetworkAddressSpace);
    }

    private NetworkConfigurationArgs() {}

    private NetworkConfigurationArgs(NetworkConfigurationArgs $) {
        this.accessEndpoint = $.accessEndpoint;
        this.subnets = $.subnets;
        this.virtualNetworkAddressSpace = $.virtualNetworkAddressSpace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkConfigurationArgs $;

        public Builder() {
            $ = new NetworkConfigurationArgs();
        }

        public Builder(NetworkConfigurationArgs defaults) {
            $ = new NetworkConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessEndpoint The access endpoint.
         * 
         * @return builder
         * 
         */
        public Builder accessEndpoint(@Nullable Output<IntegrationServiceEnvironmentAccessEndpointArgs> accessEndpoint) {
            $.accessEndpoint = accessEndpoint;
            return this;
        }

        /**
         * @param accessEndpoint The access endpoint.
         * 
         * @return builder
         * 
         */
        public Builder accessEndpoint(IntegrationServiceEnvironmentAccessEndpointArgs accessEndpoint) {
            return accessEndpoint(Output.of(accessEndpoint));
        }

        /**
         * @param subnets The subnets.
         * 
         * @return builder
         * 
         */
        public Builder subnets(@Nullable Output<List<ResourceReferenceArgs>> subnets) {
            $.subnets = subnets;
            return this;
        }

        /**
         * @param subnets The subnets.
         * 
         * @return builder
         * 
         */
        public Builder subnets(List<ResourceReferenceArgs> subnets) {
            return subnets(Output.of(subnets));
        }

        /**
         * @param subnets The subnets.
         * 
         * @return builder
         * 
         */
        public Builder subnets(ResourceReferenceArgs... subnets) {
            return subnets(List.of(subnets));
        }

        /**
         * @param virtualNetworkAddressSpace Gets the virtual network address space.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkAddressSpace(@Nullable Output<String> virtualNetworkAddressSpace) {
            $.virtualNetworkAddressSpace = virtualNetworkAddressSpace;
            return this;
        }

        /**
         * @param virtualNetworkAddressSpace Gets the virtual network address space.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkAddressSpace(String virtualNetworkAddressSpace) {
            return virtualNetworkAddressSpace(Output.of(virtualNetworkAddressSpace));
        }

        public NetworkConfigurationArgs build() {
            return $;
        }
    }

}
