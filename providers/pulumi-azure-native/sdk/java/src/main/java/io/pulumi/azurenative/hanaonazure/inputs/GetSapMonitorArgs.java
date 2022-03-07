// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hanaonazure.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSapMonitorArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSapMonitorArgs Empty = new GetSapMonitorArgs();

    /**
     * Name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the SAP monitor resource.
     * 
     */
    @InputImport(name="sapMonitorName", required=true)
      private final String sapMonitorName;

    public String getSapMonitorName() {
        return this.sapMonitorName;
    }

    public GetSapMonitorArgs(
        String resourceGroupName,
        String sapMonitorName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sapMonitorName = Objects.requireNonNull(sapMonitorName, "expected parameter 'sapMonitorName' to be non-null");
    }

    private GetSapMonitorArgs() {
        this.resourceGroupName = null;
        this.sapMonitorName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSapMonitorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String sapMonitorName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSapMonitorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sapMonitorName = defaults.sapMonitorName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSapMonitorName(String sapMonitorName) {
            this.sapMonitorName = Objects.requireNonNull(sapMonitorName);
            return this;
        }
        public GetSapMonitorArgs build() {
            return new GetSapMonitorArgs(resourceGroupName, sapMonitorName);
        }
    }
}