// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hanaonazure.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetProviderInstanceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetProviderInstanceArgs Empty = new GetProviderInstanceArgs();

    /**
     * Name of the provider instance.
     * 
     */
    @InputImport(name="providerInstanceName", required=true)
    private final String providerInstanceName;

    public String getProviderInstanceName() {
        return this.providerInstanceName;
    }

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

    public GetProviderInstanceArgs(
        String providerInstanceName,
        String resourceGroupName,
        String sapMonitorName) {
        this.providerInstanceName = Objects.requireNonNull(providerInstanceName, "expected parameter 'providerInstanceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sapMonitorName = Objects.requireNonNull(sapMonitorName, "expected parameter 'sapMonitorName' to be non-null");
    }

    private GetProviderInstanceArgs() {
        this.providerInstanceName = null;
        this.resourceGroupName = null;
        this.sapMonitorName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProviderInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String providerInstanceName;
        private String resourceGroupName;
        private String sapMonitorName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProviderInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.providerInstanceName = defaults.providerInstanceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sapMonitorName = defaults.sapMonitorName;
        }

        public Builder setProviderInstanceName(String providerInstanceName) {
            this.providerInstanceName = Objects.requireNonNull(providerInstanceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSapMonitorName(String sapMonitorName) {
            this.sapMonitorName = Objects.requireNonNull(sapMonitorName);
            return this;
        }

        public GetProviderInstanceArgs build() {
            return new GetProviderInstanceArgs(providerInstanceName, resourceGroupName, sapMonitorName);
        }
    }
}
