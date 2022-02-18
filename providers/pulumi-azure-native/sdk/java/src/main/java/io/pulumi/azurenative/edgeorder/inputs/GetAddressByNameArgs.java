// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAddressByNameArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAddressByNameArgs Empty = new GetAddressByNameArgs();

    /**
     * The name of the address Resource within the specified resource group. address names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
     * 
     */
    @InputImport(name="addressName", required=true)
    private final String addressName;

    public String getAddressName() {
        return this.addressName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetAddressByNameArgs(
        String addressName,
        String resourceGroupName) {
        this.addressName = Objects.requireNonNull(addressName, "expected parameter 'addressName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetAddressByNameArgs() {
        this.addressName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAddressByNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String addressName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAddressByNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressName = defaults.addressName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAddressName(String addressName) {
            this.addressName = Objects.requireNonNull(addressName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetAddressByNameArgs build() {
            return new GetAddressByNameArgs(addressName, resourceGroupName);
        }
    }
}
