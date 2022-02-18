// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IP configuration for virtual network gateway.
 * 
 */
public final class VirtualNetworkGatewayIPConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkGatewayIPConfigurationResponse Empty = new VirtualNetworkGatewayIPConfigurationResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Private IP Address for this gateway.
     * 
     */
    @InputImport(name="privateIPAddress", required=true)
    private final String privateIPAddress;

    public String getPrivateIPAddress() {
        return this.privateIPAddress;
    }

    /**
     * The private IP address allocation method.
     * 
     */
    @InputImport(name="privateIPAllocationMethod")
    private final @Nullable String privateIPAllocationMethod;

    public Optional<String> getPrivateIPAllocationMethod() {
        return this.privateIPAllocationMethod == null ? Optional.empty() : Optional.ofNullable(this.privateIPAllocationMethod);
    }

    /**
     * The provisioning state of the virtual network gateway IP configuration resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * The reference to the public IP resource.
     * 
     */
    @InputImport(name="publicIPAddress")
    private final @Nullable SubResourceResponse publicIPAddress;

    public Optional<SubResourceResponse> getPublicIPAddress() {
        return this.publicIPAddress == null ? Optional.empty() : Optional.ofNullable(this.publicIPAddress);
    }

    /**
     * The reference to the subnet resource.
     * 
     */
    @InputImport(name="subnet")
    private final @Nullable SubResourceResponse subnet;

    public Optional<SubResourceResponse> getSubnet() {
        return this.subnet == null ? Optional.empty() : Optional.ofNullable(this.subnet);
    }

    public VirtualNetworkGatewayIPConfigurationResponse(
        String etag,
        @Nullable String id,
        @Nullable String name,
        String privateIPAddress,
        @Nullable String privateIPAllocationMethod,
        String provisioningState,
        @Nullable SubResourceResponse publicIPAddress,
        @Nullable SubResourceResponse subnet) {
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.name = name;
        this.privateIPAddress = Objects.requireNonNull(privateIPAddress, "expected parameter 'privateIPAddress' to be non-null");
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.publicIPAddress = publicIPAddress;
        this.subnet = subnet;
    }

    private VirtualNetworkGatewayIPConfigurationResponse() {
        this.etag = null;
        this.id = null;
        this.name = null;
        this.privateIPAddress = null;
        this.privateIPAllocationMethod = null;
        this.provisioningState = null;
        this.publicIPAddress = null;
        this.subnet = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkGatewayIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String privateIPAddress;
        private @Nullable String privateIPAllocationMethod;
        private String provisioningState;
        private @Nullable SubResourceResponse publicIPAddress;
        private @Nullable SubResourceResponse subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkGatewayIPConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.privateIPAllocationMethod = defaults.privateIPAllocationMethod;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicIPAddress = defaults.publicIPAddress;
    	      this.subnet = defaults.subnet;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPrivateIPAddress(String privateIPAddress) {
            this.privateIPAddress = Objects.requireNonNull(privateIPAddress);
            return this;
        }

        public Builder setPrivateIPAllocationMethod(@Nullable String privateIPAllocationMethod) {
            this.privateIPAllocationMethod = privateIPAllocationMethod;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicIPAddress(@Nullable SubResourceResponse publicIPAddress) {
            this.publicIPAddress = publicIPAddress;
            return this;
        }

        public Builder setSubnet(@Nullable SubResourceResponse subnet) {
            this.subnet = subnet;
            return this;
        }

        public VirtualNetworkGatewayIPConfigurationResponse build() {
            return new VirtualNetworkGatewayIPConfigurationResponse(etag, id, name, privateIPAddress, privateIPAllocationMethod, provisioningState, publicIPAddress, subnet);
        }
    }
}
