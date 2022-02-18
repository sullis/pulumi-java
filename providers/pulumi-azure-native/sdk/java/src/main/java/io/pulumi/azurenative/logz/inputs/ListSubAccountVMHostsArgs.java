// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListSubAccountVMHostsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListSubAccountVMHostsArgs Empty = new ListSubAccountVMHostsArgs();

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
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Sub Account resource name
     * 
     */
    @InputImport(name="subAccountName", required=true)
    private final String subAccountName;

    public String getSubAccountName() {
        return this.subAccountName;
    }

    public ListSubAccountVMHostsArgs(
        String monitorName,
        String resourceGroupName,
        String subAccountName) {
        this.monitorName = Objects.requireNonNull(monitorName, "expected parameter 'monitorName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.subAccountName = Objects.requireNonNull(subAccountName, "expected parameter 'subAccountName' to be non-null");
    }

    private ListSubAccountVMHostsArgs() {
        this.monitorName = null;
        this.resourceGroupName = null;
        this.subAccountName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListSubAccountVMHostsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String monitorName;
        private String resourceGroupName;
        private String subAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListSubAccountVMHostsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monitorName = defaults.monitorName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.subAccountName = defaults.subAccountName;
        }

        public Builder setMonitorName(String monitorName) {
            this.monitorName = Objects.requireNonNull(monitorName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSubAccountName(String subAccountName) {
            this.subAccountName = Objects.requireNonNull(subAccountName);
            return this;
        }

        public ListSubAccountVMHostsArgs build() {
            return new ListSubAccountVMHostsArgs(monitorName, resourceGroupName, subAccountName);
        }
    }
}
