// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.PublicIPAddressResponse;
import io.pulumi.azurenative.network.outputs.SubnetResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IPConfigurationResponse {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The private IP address of the IP configuration.
     * 
     */
    private final @Nullable String privateIPAddress;
    /**
     * The private IP address allocation method.
     * 
     */
    private final @Nullable String privateIPAllocationMethod;
    /**
     * The provisioning state of the IP configuration resource.
     * 
     */
    private final String provisioningState;
    /**
     * The reference to the public IP resource.
     * 
     */
    private final @Nullable PublicIPAddressResponse publicIPAddress;
    /**
     * The reference to the subnet resource.
     * 
     */
    private final @Nullable SubnetResponse subnet;

    @OutputCustomType.Constructor({"etag","id","name","privateIPAddress","privateIPAllocationMethod","provisioningState","publicIPAddress","subnet"})
    private IPConfigurationResponse(
        String etag,
        @Nullable String id,
        @Nullable String name,
        @Nullable String privateIPAddress,
        @Nullable String privateIPAllocationMethod,
        String provisioningState,
        @Nullable PublicIPAddressResponse publicIPAddress,
        @Nullable SubnetResponse subnet) {
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.name = name;
        this.privateIPAddress = privateIPAddress;
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publicIPAddress = publicIPAddress;
        this.subnet = subnet;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The private IP address of the IP configuration.
     * 
     */
    public Optional<String> getPrivateIPAddress() {
        return Optional.ofNullable(this.privateIPAddress);
    }
    /**
     * The private IP address allocation method.
     * 
     */
    public Optional<String> getPrivateIPAllocationMethod() {
        return Optional.ofNullable(this.privateIPAllocationMethod);
    }
    /**
     * The provisioning state of the IP configuration resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The reference to the public IP resource.
     * 
     */
    public Optional<PublicIPAddressResponse> getPublicIPAddress() {
        return Optional.ofNullable(this.publicIPAddress);
    }
    /**
     * The reference to the subnet resource.
     * 
     */
    public Optional<SubnetResponse> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String privateIPAddress;
        private @Nullable String privateIPAllocationMethod;
        private String provisioningState;
        private @Nullable PublicIPAddressResponse publicIPAddress;
        private @Nullable SubnetResponse subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(IPConfigurationResponse defaults) {
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

        public Builder setPrivateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
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

        public Builder setPublicIPAddress(@Nullable PublicIPAddressResponse publicIPAddress) {
            this.publicIPAddress = publicIPAddress;
            return this;
        }

        public Builder setSubnet(@Nullable SubnetResponse subnet) {
            this.subnet = subnet;
            return this;
        }

        public IPConfigurationResponse build() {
            return new IPConfigurationResponse(etag, id, name, privateIPAddress, privateIPAllocationMethod, provisioningState, publicIPAddress, subnet);
        }
    }
}
