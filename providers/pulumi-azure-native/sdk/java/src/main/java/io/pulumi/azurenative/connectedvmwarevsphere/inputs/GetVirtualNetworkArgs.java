// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualNetworkArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVirtualNetworkArgs Empty = new GetVirtualNetworkArgs();

    /**
     * The Resource Group Name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the virtual network resource.
     * 
     */
    @InputImport(name="virtualNetworkName", required=true)
    private final String virtualNetworkName;

    public String getVirtualNetworkName() {
        return this.virtualNetworkName;
    }

    public GetVirtualNetworkArgs(
        String resourceGroupName,
        String virtualNetworkName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualNetworkName = Objects.requireNonNull(virtualNetworkName, "expected parameter 'virtualNetworkName' to be non-null");
    }

    private GetVirtualNetworkArgs() {
        this.resourceGroupName = null;
        this.virtualNetworkName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String virtualNetworkName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualNetworkName = defaults.virtualNetworkName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setVirtualNetworkName(String virtualNetworkName) {
            this.virtualNetworkName = Objects.requireNonNull(virtualNetworkName);
            return this;
        }

        public GetVirtualNetworkArgs build() {
            return new GetVirtualNetworkArgs(resourceGroupName, virtualNetworkName);
        }
    }
}
