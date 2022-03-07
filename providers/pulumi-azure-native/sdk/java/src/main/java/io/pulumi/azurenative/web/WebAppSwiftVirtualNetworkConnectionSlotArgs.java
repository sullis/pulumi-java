// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppSwiftVirtualNetworkConnectionSlotArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppSwiftVirtualNetworkConnectionSlotArgs Empty = new WebAppSwiftVirtualNetworkConnectionSlotArgs();

    /**
     * Kind of resource.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Name of the app.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API will add or update connections for the production slot.
     * 
     */
    @InputImport(name="slot", required=true)
      private final Input<String> slot;

    public Input<String> getSlot() {
        return this.slot;
    }

    /**
     * The Virtual Network subnet's resource ID. This is the subnet that this Web App will join. This subnet must have a delegation to Microsoft.Web/serverFarms defined first.
     * 
     */
    @InputImport(name="subnetResourceId")
      private final @Nullable Input<String> subnetResourceId;

    public Input<String> getSubnetResourceId() {
        return this.subnetResourceId == null ? Input.empty() : this.subnetResourceId;
    }

    /**
     * A flag that specifies if the scale unit this Web App is on supports Swift integration.
     * 
     */
    @InputImport(name="swiftSupported")
      private final @Nullable Input<Boolean> swiftSupported;

    public Input<Boolean> getSwiftSupported() {
        return this.swiftSupported == null ? Input.empty() : this.swiftSupported;
    }

    public WebAppSwiftVirtualNetworkConnectionSlotArgs(
        @Nullable Input<String> kind,
        Input<String> name,
        Input<String> resourceGroupName,
        Input<String> slot,
        @Nullable Input<String> subnetResourceId,
        @Nullable Input<Boolean> swiftSupported) {
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
        this.subnetResourceId = subnetResourceId;
        this.swiftSupported = swiftSupported;
    }

    private WebAppSwiftVirtualNetworkConnectionSlotArgs() {
        this.kind = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.slot = Input.empty();
        this.subnetResourceId = Input.empty();
        this.swiftSupported = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppSwiftVirtualNetworkConnectionSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kind;
        private Input<String> name;
        private Input<String> resourceGroupName;
        private Input<String> slot;
        private @Nullable Input<String> subnetResourceId;
        private @Nullable Input<Boolean> swiftSupported;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppSwiftVirtualNetworkConnectionSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.slot = defaults.slot;
    	      this.subnetResourceId = defaults.subnetResourceId;
    	      this.swiftSupported = defaults.swiftSupported;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSlot(Input<String> slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }

        public Builder setSlot(String slot) {
            this.slot = Input.of(Objects.requireNonNull(slot));
            return this;
        }

        public Builder setSubnetResourceId(@Nullable Input<String> subnetResourceId) {
            this.subnetResourceId = subnetResourceId;
            return this;
        }

        public Builder setSubnetResourceId(@Nullable String subnetResourceId) {
            this.subnetResourceId = Input.ofNullable(subnetResourceId);
            return this;
        }

        public Builder setSwiftSupported(@Nullable Input<Boolean> swiftSupported) {
            this.swiftSupported = swiftSupported;
            return this;
        }

        public Builder setSwiftSupported(@Nullable Boolean swiftSupported) {
            this.swiftSupported = Input.ofNullable(swiftSupported);
            return this;
        }
        public WebAppSwiftVirtualNetworkConnectionSlotArgs build() {
            return new WebAppSwiftVirtualNetworkConnectionSlotArgs(kind, name, resourceGroupName, slot, subnetResourceId, swiftSupported);
        }
    }
}