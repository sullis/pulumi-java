// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.storsimple.inputs.ManagerIntrinsicSettingsArgs;
import io.pulumi.azurenative.storsimple.inputs.ManagerSkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagerArgs Empty = new ManagerArgs();

    /**
     * Represents the type of StorSimple Manager.
     * 
     */
    @InputImport(name="cisIntrinsicSettings")
    private final @Nullable Input<ManagerIntrinsicSettingsArgs> cisIntrinsicSettings;

    public Input<ManagerIntrinsicSettingsArgs> getCisIntrinsicSettings() {
        return this.cisIntrinsicSettings == null ? Input.empty() : this.cisIntrinsicSettings;
    }

    /**
     * The geo location of the resource.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The manager name
     * 
     */
    @InputImport(name="managerName")
    private final @Nullable Input<String> managerName;

    public Input<String> getManagerName() {
        return this.managerName == null ? Input.empty() : this.managerName;
    }

    /**
     * Specifies the state of the resource as it is getting provisioned. Value of "Succeeded" means the Manager was successfully created.
     * 
     */
    @InputImport(name="provisioningState")
    private final @Nullable Input<String> provisioningState;

    public Input<String> getProvisioningState() {
        return this.provisioningState == null ? Input.empty() : this.provisioningState;
    }

    /**
     * The resource group name
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies the Sku.
     * 
     */
    @InputImport(name="sku")
    private final @Nullable Input<ManagerSkuArgs> sku;

    public Input<ManagerSkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * The tags attached to the resource.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ManagerArgs(
        @Nullable Input<ManagerIntrinsicSettingsArgs> cisIntrinsicSettings,
        @Nullable Input<String> location,
        @Nullable Input<String> managerName,
        @Nullable Input<String> provisioningState,
        Input<String> resourceGroupName,
        @Nullable Input<ManagerSkuArgs> sku,
        @Nullable Input<Map<String,String>> tags) {
        this.cisIntrinsicSettings = cisIntrinsicSettings;
        this.location = location;
        this.managerName = managerName;
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
    }

    private ManagerArgs() {
        this.cisIntrinsicSettings = Input.empty();
        this.location = Input.empty();
        this.managerName = Input.empty();
        this.provisioningState = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ManagerIntrinsicSettingsArgs> cisIntrinsicSettings;
        private @Nullable Input<String> location;
        private @Nullable Input<String> managerName;
        private @Nullable Input<String> provisioningState;
        private Input<String> resourceGroupName;
        private @Nullable Input<ManagerSkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cisIntrinsicSettings = defaults.cisIntrinsicSettings;
    	      this.location = defaults.location;
    	      this.managerName = defaults.managerName;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder setCisIntrinsicSettings(@Nullable Input<ManagerIntrinsicSettingsArgs> cisIntrinsicSettings) {
            this.cisIntrinsicSettings = cisIntrinsicSettings;
            return this;
        }

        public Builder setCisIntrinsicSettings(@Nullable ManagerIntrinsicSettingsArgs cisIntrinsicSettings) {
            this.cisIntrinsicSettings = Input.ofNullable(cisIntrinsicSettings);
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

        public Builder setManagerName(@Nullable Input<String> managerName) {
            this.managerName = managerName;
            return this;
        }

        public Builder setManagerName(@Nullable String managerName) {
            this.managerName = Input.ofNullable(managerName);
            return this;
        }

        public Builder setProvisioningState(@Nullable Input<String> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = Input.ofNullable(provisioningState);
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

        public Builder setSku(@Nullable Input<ManagerSkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable ManagerSkuArgs sku) {
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

        public ManagerArgs build() {
            return new ManagerArgs(cisIntrinsicSettings, location, managerName, provisioningState, resourceGroupName, sku, tags);
        }
    }
}
