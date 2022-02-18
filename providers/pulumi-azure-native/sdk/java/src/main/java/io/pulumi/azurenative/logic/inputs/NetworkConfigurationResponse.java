// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.IntegrationServiceEnvironmentAccessEndpointResponse;
import io.pulumi.azurenative.logic.inputs.ResourceReferenceResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The network configuration.
 * 
 */
public final class NetworkConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkConfigurationResponse Empty = new NetworkConfigurationResponse();

    /**
     * The access endpoint.
     * 
     */
    @InputImport(name="accessEndpoint")
    private final @Nullable IntegrationServiceEnvironmentAccessEndpointResponse accessEndpoint;

    public Optional<IntegrationServiceEnvironmentAccessEndpointResponse> getAccessEndpoint() {
        return this.accessEndpoint == null ? Optional.empty() : Optional.ofNullable(this.accessEndpoint);
    }

    /**
     * The subnets.
     * 
     */
    @InputImport(name="subnets")
    private final @Nullable List<ResourceReferenceResponse> subnets;

    public List<ResourceReferenceResponse> getSubnets() {
        return this.subnets == null ? List.of() : this.subnets;
    }

    /**
     * Gets the virtual network address space.
     * 
     */
    @InputImport(name="virtualNetworkAddressSpace")
    private final @Nullable String virtualNetworkAddressSpace;

    public Optional<String> getVirtualNetworkAddressSpace() {
        return this.virtualNetworkAddressSpace == null ? Optional.empty() : Optional.ofNullable(this.virtualNetworkAddressSpace);
    }

    public NetworkConfigurationResponse(
        @Nullable IntegrationServiceEnvironmentAccessEndpointResponse accessEndpoint,
        @Nullable List<ResourceReferenceResponse> subnets,
        @Nullable String virtualNetworkAddressSpace) {
        this.accessEndpoint = accessEndpoint;
        this.subnets = subnets;
        this.virtualNetworkAddressSpace = virtualNetworkAddressSpace;
    }

    private NetworkConfigurationResponse() {
        this.accessEndpoint = null;
        this.subnets = List.of();
        this.virtualNetworkAddressSpace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IntegrationServiceEnvironmentAccessEndpointResponse accessEndpoint;
        private @Nullable List<ResourceReferenceResponse> subnets;
        private @Nullable String virtualNetworkAddressSpace;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessEndpoint = defaults.accessEndpoint;
    	      this.subnets = defaults.subnets;
    	      this.virtualNetworkAddressSpace = defaults.virtualNetworkAddressSpace;
        }

        public Builder setAccessEndpoint(@Nullable IntegrationServiceEnvironmentAccessEndpointResponse accessEndpoint) {
            this.accessEndpoint = accessEndpoint;
            return this;
        }

        public Builder setSubnets(@Nullable List<ResourceReferenceResponse> subnets) {
            this.subnets = subnets;
            return this;
        }

        public Builder setVirtualNetworkAddressSpace(@Nullable String virtualNetworkAddressSpace) {
            this.virtualNetworkAddressSpace = virtualNetworkAddressSpace;
            return this;
        }

        public NetworkConfigurationResponse build() {
            return new NetworkConfigurationResponse(accessEndpoint, subnets, virtualNetworkAddressSpace);
        }
    }
}
