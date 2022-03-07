// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple;

import io.pulumi.azurenative.vmwarecloudsimple.inputs.SkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DedicatedCloudNodeArgs extends io.pulumi.resources.ResourceArgs {

    public static final DedicatedCloudNodeArgs Empty = new DedicatedCloudNodeArgs();

    /**
     * Availability Zone id, e.g. "az1"
     * 
     */
    @InputImport(name="availabilityZoneId", required=true)
      private final Input<String> availabilityZoneId;

    public Input<String> getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }

    /**
     * dedicated cloud node name
     * 
     */
    @InputImport(name="dedicatedCloudNodeName")
      private final @Nullable Input<String> dedicatedCloudNodeName;

    public Input<String> getDedicatedCloudNodeName() {
        return this.dedicatedCloudNodeName == null ? Input.empty() : this.dedicatedCloudNodeName;
    }

    /**
     * SKU's id
     * 
     */
    @InputImport(name="id", required=true)
      private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * Azure region
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * SKU's name
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * count of nodes to create
     * 
     */
    @InputImport(name="nodesCount", required=true)
      private final Input<Integer> nodesCount;

    public Input<Integer> getNodesCount() {
        return this.nodesCount;
    }

    /**
     * Placement Group id, e.g. "n1"
     * 
     */
    @InputImport(name="placementGroupId", required=true)
      private final Input<String> placementGroupId;

    public Input<String> getPlacementGroupId() {
        return this.placementGroupId;
    }

    /**
     * purchase id
     * 
     */
    @InputImport(name="purchaseId", required=true)
      private final Input<String> purchaseId;

    public Input<String> getPurchaseId() {
        return this.purchaseId;
    }

    /**
     * The name of the resource group
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Dedicated Cloud Nodes SKU
     * 
     */
    @InputImport(name="sku")
      private final @Nullable Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * Dedicated Cloud Nodes tags
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DedicatedCloudNodeArgs(
        Input<String> availabilityZoneId,
        @Nullable Input<String> dedicatedCloudNodeName,
        Input<String> id,
        @Nullable Input<String> location,
        Input<String> name,
        Input<Integer> nodesCount,
        Input<String> placementGroupId,
        Input<String> purchaseId,
        Input<String> resourceGroupName,
        @Nullable Input<SkuArgs> sku,
        @Nullable Input<Map<String,String>> tags) {
        this.availabilityZoneId = Objects.requireNonNull(availabilityZoneId, "expected parameter 'availabilityZoneId' to be non-null");
        this.dedicatedCloudNodeName = dedicatedCloudNodeName;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.location = location;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.nodesCount = Objects.requireNonNull(nodesCount, "expected parameter 'nodesCount' to be non-null");
        this.placementGroupId = Objects.requireNonNull(placementGroupId, "expected parameter 'placementGroupId' to be non-null");
        this.purchaseId = Objects.requireNonNull(purchaseId, "expected parameter 'purchaseId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
    }

    private DedicatedCloudNodeArgs() {
        this.availabilityZoneId = Input.empty();
        this.dedicatedCloudNodeName = Input.empty();
        this.id = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.nodesCount = Input.empty();
        this.placementGroupId = Input.empty();
        this.purchaseId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DedicatedCloudNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> availabilityZoneId;
        private @Nullable Input<String> dedicatedCloudNodeName;
        private Input<String> id;
        private @Nullable Input<String> location;
        private Input<String> name;
        private Input<Integer> nodesCount;
        private Input<String> placementGroupId;
        private Input<String> purchaseId;
        private Input<String> resourceGroupName;
        private @Nullable Input<SkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DedicatedCloudNodeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZoneId = defaults.availabilityZoneId;
    	      this.dedicatedCloudNodeName = defaults.dedicatedCloudNodeName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.nodesCount = defaults.nodesCount;
    	      this.placementGroupId = defaults.placementGroupId;
    	      this.purchaseId = defaults.purchaseId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder setAvailabilityZoneId(Input<String> availabilityZoneId) {
            this.availabilityZoneId = Objects.requireNonNull(availabilityZoneId);
            return this;
        }

        public Builder setAvailabilityZoneId(String availabilityZoneId) {
            this.availabilityZoneId = Input.of(Objects.requireNonNull(availabilityZoneId));
            return this;
        }

        public Builder setDedicatedCloudNodeName(@Nullable Input<String> dedicatedCloudNodeName) {
            this.dedicatedCloudNodeName = dedicatedCloudNodeName;
            return this;
        }

        public Builder setDedicatedCloudNodeName(@Nullable String dedicatedCloudNodeName) {
            this.dedicatedCloudNodeName = Input.ofNullable(dedicatedCloudNodeName);
            return this;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
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

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setNodesCount(Input<Integer> nodesCount) {
            this.nodesCount = Objects.requireNonNull(nodesCount);
            return this;
        }

        public Builder setNodesCount(Integer nodesCount) {
            this.nodesCount = Input.of(Objects.requireNonNull(nodesCount));
            return this;
        }

        public Builder setPlacementGroupId(Input<String> placementGroupId) {
            this.placementGroupId = Objects.requireNonNull(placementGroupId);
            return this;
        }

        public Builder setPlacementGroupId(String placementGroupId) {
            this.placementGroupId = Input.of(Objects.requireNonNull(placementGroupId));
            return this;
        }

        public Builder setPurchaseId(Input<String> purchaseId) {
            this.purchaseId = Objects.requireNonNull(purchaseId);
            return this;
        }

        public Builder setPurchaseId(String purchaseId) {
            this.purchaseId = Input.of(Objects.requireNonNull(purchaseId));
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
        public DedicatedCloudNodeArgs build() {
            return new DedicatedCloudNodeArgs(availabilityZoneId, dedicatedCloudNodeName, id, location, name, nodesCount, placementGroupId, purchaseId, resourceGroupName, sku, tags);
        }
    }
}