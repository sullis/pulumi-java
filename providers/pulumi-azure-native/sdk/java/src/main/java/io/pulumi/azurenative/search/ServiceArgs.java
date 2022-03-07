// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search;

import io.pulumi.azurenative.search.enums.HostingMode;
import io.pulumi.azurenative.search.enums.PublicNetworkAccess;
import io.pulumi.azurenative.search.inputs.IdentityArgs;
import io.pulumi.azurenative.search.inputs.NetworkRuleSetArgs;
import io.pulumi.azurenative.search.inputs.SkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * Applicable only for the standard3 SKU. You can set this property to enable up to 3 high density partitions that allow up to 1000 indexes, which is much higher than the maximum indexes allowed for any other SKU. For the standard3 SKU, the value is either 'default' or 'highDensity'. For all other SKUs, this value must be 'default'.
     * 
     */
    @InputImport(name="hostingMode")
      private final @Nullable Input<HostingMode> hostingMode;

    public Input<HostingMode> getHostingMode() {
        return this.hostingMode == null ? Input.empty() : this.hostingMode;
    }

    /**
     * The identity of the resource.
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Input<IdentityArgs> identity;

    public Input<IdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Network specific rules that determine how the Azure Cognitive Search service may be reached.
     * 
     */
    @InputImport(name="networkRuleSet")
      private final @Nullable Input<NetworkRuleSetArgs> networkRuleSet;

    public Input<NetworkRuleSetArgs> getNetworkRuleSet() {
        return this.networkRuleSet == null ? Input.empty() : this.networkRuleSet;
    }

    /**
     * The number of partitions in the search service; if specified, it can be 1, 2, 3, 4, 6, or 12. Values greater than 1 are only valid for standard SKUs. For 'standard3' services with hostingMode set to 'highDensity', the allowed values are between 1 and 3.
     * 
     */
    @InputImport(name="partitionCount")
      private final @Nullable Input<Integer> partitionCount;

    public Input<Integer> getPartitionCount() {
        return this.partitionCount == null ? Input.empty() : this.partitionCount;
    }

    /**
     * This value can be set to 'enabled' to avoid breaking changes on existing customer resources and templates. If set to 'disabled', traffic over public interface is not allowed, and private endpoint connections would be the exclusive access method.
     * 
     */
    @InputImport(name="publicNetworkAccess")
      private final @Nullable Input<PublicNetworkAccess> publicNetworkAccess;

    public Input<PublicNetworkAccess> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Input.empty() : this.publicNetworkAccess;
    }

    /**
     * The number of replicas in the search service. If specified, it must be a value between 1 and 12 inclusive for standard SKUs or between 1 and 3 inclusive for basic SKU.
     * 
     */
    @InputImport(name="replicaCount")
      private final @Nullable Input<Integer> replicaCount;

    public Input<Integer> getReplicaCount() {
        return this.replicaCount == null ? Input.empty() : this.replicaCount;
    }

    /**
     * The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Azure Cognitive Search service to create or update. Search service names must only contain lowercase letters, digits or dashes, cannot use dash as the first two or last one characters, cannot contain consecutive dashes, and must be between 2 and 60 characters in length. Search service names must be globally unique since they are part of the service URI (https://<name>.search.windows.net). You cannot change the service name after the service is created.
     * 
     */
    @InputImport(name="searchServiceName")
      private final @Nullable Input<String> searchServiceName;

    public Input<String> getSearchServiceName() {
        return this.searchServiceName == null ? Input.empty() : this.searchServiceName;
    }

    /**
     * The SKU of the Search Service, which determines price tier and capacity limits. This property is required when creating a new Search Service.
     * 
     */
    @InputImport(name="sku")
      private final @Nullable Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ServiceArgs(
        @Nullable Input<HostingMode> hostingMode,
        @Nullable Input<IdentityArgs> identity,
        @Nullable Input<String> location,
        @Nullable Input<NetworkRuleSetArgs> networkRuleSet,
        @Nullable Input<Integer> partitionCount,
        @Nullable Input<PublicNetworkAccess> publicNetworkAccess,
        @Nullable Input<Integer> replicaCount,
        Input<String> resourceGroupName,
        @Nullable Input<String> searchServiceName,
        @Nullable Input<SkuArgs> sku,
        @Nullable Input<Map<String,String>> tags) {
        this.hostingMode = hostingMode == null ? Input.ofNullable(io.pulumi.azurenative.search.enums.HostingMode.$Default) : hostingMode;
        this.identity = identity;
        this.location = location;
        this.networkRuleSet = networkRuleSet;
        this.partitionCount = partitionCount == null ? Input.ofNullable(1) : partitionCount;
        this.publicNetworkAccess = publicNetworkAccess == null ? Input.ofNullable(io.pulumi.azurenative.search.enums.PublicNetworkAccess.Enabled) : publicNetworkAccess;
        this.replicaCount = replicaCount == null ? Input.ofNullable(1) : replicaCount;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.searchServiceName = searchServiceName;
        this.sku = sku;
        this.tags = tags;
    }

    private ServiceArgs() {
        this.hostingMode = Input.empty();
        this.identity = Input.empty();
        this.location = Input.empty();
        this.networkRuleSet = Input.empty();
        this.partitionCount = Input.empty();
        this.publicNetworkAccess = Input.empty();
        this.replicaCount = Input.empty();
        this.resourceGroupName = Input.empty();
        this.searchServiceName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<HostingMode> hostingMode;
        private @Nullable Input<IdentityArgs> identity;
        private @Nullable Input<String> location;
        private @Nullable Input<NetworkRuleSetArgs> networkRuleSet;
        private @Nullable Input<Integer> partitionCount;
        private @Nullable Input<PublicNetworkAccess> publicNetworkAccess;
        private @Nullable Input<Integer> replicaCount;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> searchServiceName;
        private @Nullable Input<SkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostingMode = defaults.hostingMode;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.networkRuleSet = defaults.networkRuleSet;
    	      this.partitionCount = defaults.partitionCount;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.replicaCount = defaults.replicaCount;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.searchServiceName = defaults.searchServiceName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder setHostingMode(@Nullable Input<HostingMode> hostingMode) {
            this.hostingMode = hostingMode;
            return this;
        }

        public Builder setHostingMode(@Nullable HostingMode hostingMode) {
            this.hostingMode = Input.ofNullable(hostingMode);
            return this;
        }

        public Builder setIdentity(@Nullable Input<IdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable IdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setNetworkRuleSet(@Nullable Input<NetworkRuleSetArgs> networkRuleSet) {
            this.networkRuleSet = networkRuleSet;
            return this;
        }

        public Builder setNetworkRuleSet(@Nullable NetworkRuleSetArgs networkRuleSet) {
            this.networkRuleSet = Input.ofNullable(networkRuleSet);
            return this;
        }

        public Builder setPartitionCount(@Nullable Input<Integer> partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }

        public Builder setPartitionCount(@Nullable Integer partitionCount) {
            this.partitionCount = Input.ofNullable(partitionCount);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Input<PublicNetworkAccess> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable PublicNetworkAccess publicNetworkAccess) {
            this.publicNetworkAccess = Input.ofNullable(publicNetworkAccess);
            return this;
        }

        public Builder setReplicaCount(@Nullable Input<Integer> replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }

        public Builder setReplicaCount(@Nullable Integer replicaCount) {
            this.replicaCount = Input.ofNullable(replicaCount);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSearchServiceName(@Nullable Input<String> searchServiceName) {
            this.searchServiceName = searchServiceName;
            return this;
        }

        public Builder setSearchServiceName(@Nullable String searchServiceName) {
            this.searchServiceName = Input.ofNullable(searchServiceName);
            return this;
        }

        public Builder setSku(@Nullable Input<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable SkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ServiceArgs build() {
            return new ServiceArgs(hostingMode, identity, location, networkRuleSet, partitionCount, publicNetworkAccess, replicaCount, resourceGroupName, searchServiceName, sku, tags);
        }
    }
}