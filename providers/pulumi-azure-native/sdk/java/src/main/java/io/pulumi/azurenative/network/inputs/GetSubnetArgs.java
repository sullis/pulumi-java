// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubnetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSubnetArgs Empty = new GetSubnetArgs();

    /**
     * Expands referenced resources.
     * 
     */
    @Import(name="expand")
      private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the subnet.
     * 
     */
    @Import(name="subnetName", required=true)
      private final String subnetName;

    public String getSubnetName() {
        return this.subnetName;
    }

    /**
     * The name of the virtual network.
     * 
     */
    @Import(name="virtualNetworkName", required=true)
      private final String virtualNetworkName;

    public String getVirtualNetworkName() {
        return this.virtualNetworkName;
    }

    public GetSubnetArgs(
        @Nullable String expand,
        String resourceGroupName,
        String subnetName,
        String virtualNetworkName) {
        this.expand = expand;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.subnetName = Objects.requireNonNull(subnetName, "expected parameter 'subnetName' to be non-null");
        this.virtualNetworkName = Objects.requireNonNull(virtualNetworkName, "expected parameter 'virtualNetworkName' to be non-null");
    }

    private GetSubnetArgs() {
        this.expand = null;
        this.resourceGroupName = null;
        this.subnetName = null;
        this.virtualNetworkName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String resourceGroupName;
        private String subnetName;
        private String virtualNetworkName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubnetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.subnetName = defaults.subnetName;
    	      this.virtualNetworkName = defaults.virtualNetworkName;
        }

        public Builder expand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder subnetName(String subnetName) {
            this.subnetName = Objects.requireNonNull(subnetName);
            return this;
        }
        public Builder virtualNetworkName(String virtualNetworkName) {
            this.virtualNetworkName = Objects.requireNonNull(virtualNetworkName);
            return this;
        }        public GetSubnetArgs build() {
            return new GetSubnetArgs(expand, resourceGroupName, subnetName, virtualNetworkName);
        }
    }
}
