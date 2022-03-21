// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppPremierAddOnSlotArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebAppPremierAddOnSlotArgs Empty = new GetWebAppPremierAddOnSlotArgs();

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Add-on name.
     * 
     */
    @Import(name="premierAddOnName", required=true)
      private final String premierAddOnName;

    public String getPremierAddOnName() {
        return this.premierAddOnName;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API will get the named add-on for the production slot.
     * 
     */
    @Import(name="slot", required=true)
      private final String slot;

    public String getSlot() {
        return this.slot;
    }

    public GetWebAppPremierAddOnSlotArgs(
        String name,
        String premierAddOnName,
        String resourceGroupName,
        String slot) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.premierAddOnName = Objects.requireNonNull(premierAddOnName, "expected parameter 'premierAddOnName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
    }

    private GetWebAppPremierAddOnSlotArgs() {
        this.name = null;
        this.premierAddOnName = null;
        this.resourceGroupName = null;
        this.slot = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppPremierAddOnSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String premierAddOnName;
        private String resourceGroupName;
        private String slot;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppPremierAddOnSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.premierAddOnName = defaults.premierAddOnName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.slot = defaults.slot;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder premierAddOnName(String premierAddOnName) {
            this.premierAddOnName = Objects.requireNonNull(premierAddOnName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder slot(String slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }        public GetWebAppPremierAddOnSlotArgs build() {
            return new GetWebAppPremierAddOnSlotArgs(name, premierAddOnName, resourceGroupName, slot);
        }
    }
}
