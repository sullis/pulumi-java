// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetInventoryItemArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInventoryItemArgs Empty = new GetInventoryItemArgs();

    /**
     * Name of the inventoryItem.
     * 
     */
    @InputImport(name="inventoryItemName", required=true)
    private final String inventoryItemName;

    public String getInventoryItemName() {
        return this.inventoryItemName;
    }

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
     * Name of the vCenter.
     * 
     */
    @InputImport(name="vcenterName", required=true)
    private final String vcenterName;

    public String getVcenterName() {
        return this.vcenterName;
    }

    public GetInventoryItemArgs(
        String inventoryItemName,
        String resourceGroupName,
        String vcenterName) {
        this.inventoryItemName = Objects.requireNonNull(inventoryItemName, "expected parameter 'inventoryItemName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vcenterName = Objects.requireNonNull(vcenterName, "expected parameter 'vcenterName' to be non-null");
    }

    private GetInventoryItemArgs() {
        this.inventoryItemName = null;
        this.resourceGroupName = null;
        this.vcenterName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInventoryItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String inventoryItemName;
        private String resourceGroupName;
        private String vcenterName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInventoryItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inventoryItemName = defaults.inventoryItemName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vcenterName = defaults.vcenterName;
        }

        public Builder setInventoryItemName(String inventoryItemName) {
            this.inventoryItemName = Objects.requireNonNull(inventoryItemName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setVcenterName(String vcenterName) {
            this.vcenterName = Objects.requireNonNull(vcenterName);
            return this;
        }

        public GetInventoryItemArgs build() {
            return new GetInventoryItemArgs(inventoryItemName, resourceGroupName, vcenterName);
        }
    }
}
