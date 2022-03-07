// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.PublicIPAddressResponse;
import io.pulumi.azurenative.network.inputs.SubnetResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IP configuration.
 * 
 */
public final class IPConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final IPConfigurationResponse Empty = new IPConfigurationResponse();

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
     * The private IP address of the IP configuration.
     * 
     */
    @InputImport(name="privateIPAddress")
      private final @Nullable String privateIPAddress;

    public Optional<String> getPrivateIPAddress() {
        return this.privateIPAddress == null ? Optional.empty() : Optional.ofNullable(this.privateIPAddress);
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
     * The provisioning state of the IP configuration resource.
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
      private final @Nullable PublicIPAddressResponse publicIPAddress;

    public Optional<PublicIPAddressResponse> getPublicIPAddress() {
        return this.publicIPAddress == null ? Optional.empty() : Optional.ofNullable(this.publicIPAddress);
    }

    /**
     * The reference to the subnet resource.
     * 
     */
    @InputImport(name="subnet")
      private final @Nullable SubnetResponse subnet;

    public Optional<SubnetResponse> getSubnet() {
        return this.subnet == null ? Optional.empty() : Optional.ofNullable(this.subnet);
    }

    public IPConfigurationResponse(
        String etag,
        @Nullable String id,
        @Nullable String name,
        @Nullable String privateIPAddress,
        @Nullable String privateIPAllocationMethod,
        String provisioningState,
        @Nullable PublicIPAddressResponse publicIPAddress,
        @Nullable SubnetResponse subnet) {
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.name = name;
        this.privateIPAddress = privateIPAddress;
        this.privateIPAllocationMethod = privateIPAllocationMethod == null ? "Dynamic" : privateIPAllocationMethod;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.publicIPAddress = publicIPAddress;
        this.subnet = subnet;
    }

    private IPConfigurationResponse() {
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