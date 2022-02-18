// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppSiteExtensionSlotArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebAppSiteExtensionSlotArgs Empty = new GetWebAppSiteExtensionSlotArgs();

    /**
     * Site name.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Site extension name.
     * 
     */
    @InputImport(name="siteExtensionId", required=true)
    private final String siteExtensionId;

    public String getSiteExtensionId() {
        return this.siteExtensionId;
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API uses the production slot.
     * 
     */
    @InputImport(name="slot", required=true)
    private final String slot;

    public String getSlot() {
        return this.slot;
    }

    public GetWebAppSiteExtensionSlotArgs(
        String name,
        String resourceGroupName,
        String siteExtensionId,
        String slot) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.siteExtensionId = Objects.requireNonNull(siteExtensionId, "expected parameter 'siteExtensionId' to be non-null");
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
    }

    private GetWebAppSiteExtensionSlotArgs() {
        this.name = null;
        this.resourceGroupName = null;
        this.siteExtensionId = null;
        this.slot = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppSiteExtensionSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String resourceGroupName;
        private String siteExtensionId;
        private String slot;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppSiteExtensionSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.siteExtensionId = defaults.siteExtensionId;
    	      this.slot = defaults.slot;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSiteExtensionId(String siteExtensionId) {
            this.siteExtensionId = Objects.requireNonNull(siteExtensionId);
            return this;
        }

        public Builder setSlot(String slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }

        public GetWebAppSiteExtensionSlotArgs build() {
            return new GetWebAppSiteExtensionSlotArgs(name, resourceGroupName, siteExtensionId, slot);
        }
    }
}
