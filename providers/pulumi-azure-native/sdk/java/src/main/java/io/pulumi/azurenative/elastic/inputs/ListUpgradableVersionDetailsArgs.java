// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListUpgradableVersionDetailsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListUpgradableVersionDetailsArgs Empty = new ListUpgradableVersionDetailsArgs();

    /**
     * Monitor resource name
     * 
     */
    @InputImport(name="monitorName", required=true)
      private final String monitorName;

    public String getMonitorName() {
        return this.monitorName;
    }

    /**
     * The name of the resource group to which the Elastic resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListUpgradableVersionDetailsArgs(
        String monitorName,
        String resourceGroupName) {
        this.monitorName = Objects.requireNonNull(monitorName, "expected parameter 'monitorName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListUpgradableVersionDetailsArgs() {
        this.monitorName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListUpgradableVersionDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String monitorName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListUpgradableVersionDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monitorName = defaults.monitorName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setMonitorName(String monitorName) {
            this.monitorName = Objects.requireNonNull(monitorName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public ListUpgradableVersionDetailsArgs build() {
            return new ListUpgradableVersionDetailsArgs(monitorName, resourceGroupName);
        }
    }
}