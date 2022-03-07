// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appconfiguration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetConfigurationStoreArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConfigurationStoreArgs Empty = new GetConfigurationStoreArgs();

    /**
     * The name of the configuration store.
     * 
     */
    @InputImport(name="configStoreName", required=true)
      private final String configStoreName;

    public String getConfigStoreName() {
        return this.configStoreName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetConfigurationStoreArgs(
        String configStoreName,
        String resourceGroupName) {
        this.configStoreName = Objects.requireNonNull(configStoreName, "expected parameter 'configStoreName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetConfigurationStoreArgs() {
        this.configStoreName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configStoreName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfigurationStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configStoreName = defaults.configStoreName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setConfigStoreName(String configStoreName) {
            this.configStoreName = Objects.requireNonNull(configStoreName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetConfigurationStoreArgs build() {
            return new GetConfigurationStoreArgs(configStoreName, resourceGroupName);
        }
    }
}