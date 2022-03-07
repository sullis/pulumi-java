// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListEffectiveVirtualNetworkByNetworkGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListEffectiveVirtualNetworkByNetworkGroupArgs Empty = new ListEffectiveVirtualNetworkByNetworkGroupArgs();

    /**
     * The name of the network group to get.
     * 
     */
    @InputImport(name="networkGroupName", required=true)
      private final String networkGroupName;

    public String getNetworkGroupName() {
        return this.networkGroupName;
    }

    /**
     * The name of the network manager.
     * 
     */
    @InputImport(name="networkManagerName", required=true)
      private final String networkManagerName;

    public String getNetworkManagerName() {
        return this.networkManagerName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * When present, the value can be passed to a subsequent query call (together with the same query and scopes used in the current request) to retrieve the next page of data.
     * 
     */
    @InputImport(name="skipToken")
      private final @Nullable String skipToken;

    public Optional<String> getSkipToken() {
        return this.skipToken == null ? Optional.empty() : Optional.ofNullable(this.skipToken);
    }

    public ListEffectiveVirtualNetworkByNetworkGroupArgs(
        String networkGroupName,
        String networkManagerName,
        String resourceGroupName,
        @Nullable String skipToken) {
        this.networkGroupName = Objects.requireNonNull(networkGroupName, "expected parameter 'networkGroupName' to be non-null");
        this.networkManagerName = Objects.requireNonNull(networkManagerName, "expected parameter 'networkManagerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.skipToken = skipToken;
    }

    private ListEffectiveVirtualNetworkByNetworkGroupArgs() {
        this.networkGroupName = null;
        this.networkManagerName = null;
        this.resourceGroupName = null;
        this.skipToken = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListEffectiveVirtualNetworkByNetworkGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String networkGroupName;
        private String networkManagerName;
        private String resourceGroupName;
        private @Nullable String skipToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ListEffectiveVirtualNetworkByNetworkGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkGroupName = defaults.networkGroupName;
    	      this.networkManagerName = defaults.networkManagerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.skipToken = defaults.skipToken;
        }

        public Builder setNetworkGroupName(String networkGroupName) {
            this.networkGroupName = Objects.requireNonNull(networkGroupName);
            return this;
        }

        public Builder setNetworkManagerName(String networkManagerName) {
            this.networkManagerName = Objects.requireNonNull(networkManagerName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSkipToken(@Nullable String skipToken) {
            this.skipToken = skipToken;
            return this;
        }
        public ListEffectiveVirtualNetworkByNetworkGroupArgs build() {
            return new ListEffectiveVirtualNetworkByNetworkGroupArgs(networkGroupName, networkManagerName, resourceGroupName, skipToken);
        }
    }
}