// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.agfoodplatform.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFarmBeatsModelArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFarmBeatsModelArgs Empty = new GetFarmBeatsModelArgs();

    /**
     * FarmBeats resource name.
     * 
     */
    @InputImport(name="farmBeatsResourceName", required=true)
    private final String farmBeatsResourceName;

    public String getFarmBeatsResourceName() {
        return this.farmBeatsResourceName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetFarmBeatsModelArgs(
        String farmBeatsResourceName,
        String resourceGroupName) {
        this.farmBeatsResourceName = Objects.requireNonNull(farmBeatsResourceName, "expected parameter 'farmBeatsResourceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetFarmBeatsModelArgs() {
        this.farmBeatsResourceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFarmBeatsModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String farmBeatsResourceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFarmBeatsModelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.farmBeatsResourceName = defaults.farmBeatsResourceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setFarmBeatsResourceName(String farmBeatsResourceName) {
            this.farmBeatsResourceName = Objects.requireNonNull(farmBeatsResourceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetFarmBeatsModelArgs build() {
            return new GetFarmBeatsModelArgs(farmBeatsResourceName, resourceGroupName);
        }
    }
}
