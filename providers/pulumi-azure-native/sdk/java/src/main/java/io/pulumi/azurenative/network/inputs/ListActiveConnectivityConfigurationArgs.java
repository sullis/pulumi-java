// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListActiveConnectivityConfigurationArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListActiveConnectivityConfigurationArgs Empty = new ListActiveConnectivityConfigurationArgs();

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
     * List of regions.
     * 
     */
    @InputImport(name="regions")
      private final @Nullable List<String> regions;

    public List<String> getRegions() {
        return this.regions == null ? List.of() : this.regions;
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

    public ListActiveConnectivityConfigurationArgs(
        String networkManagerName,
        @Nullable List<String> regions,
        String resourceGroupName,
        @Nullable String skipToken) {
        this.networkManagerName = Objects.requireNonNull(networkManagerName, "expected parameter 'networkManagerName' to be non-null");
        this.regions = regions;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.skipToken = skipToken;
    }

    private ListActiveConnectivityConfigurationArgs() {
        this.networkManagerName = null;
        this.regions = List.of();
        this.resourceGroupName = null;
        this.skipToken = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListActiveConnectivityConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String networkManagerName;
        private @Nullable List<String> regions;
        private String resourceGroupName;
        private @Nullable String skipToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ListActiveConnectivityConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkManagerName = defaults.networkManagerName;
    	      this.regions = defaults.regions;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.skipToken = defaults.skipToken;
        }

        public Builder setNetworkManagerName(String networkManagerName) {
            this.networkManagerName = Objects.requireNonNull(networkManagerName);
            return this;
        }

        public Builder setRegions(@Nullable List<String> regions) {
            this.regions = regions;
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
        public ListActiveConnectivityConfigurationArgs build() {
            return new ListActiveConnectivityConfigurationArgs(networkManagerName, regions, resourceGroupName, skipToken);
        }
    }
}