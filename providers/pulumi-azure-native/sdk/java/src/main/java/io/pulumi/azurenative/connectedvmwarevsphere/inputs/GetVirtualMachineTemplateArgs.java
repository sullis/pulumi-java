// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualMachineTemplateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVirtualMachineTemplateArgs Empty = new GetVirtualMachineTemplateArgs();

    /**
     * The Resource Group Name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the virtual machine template resource.
     * 
     */
    @InputImport(name="virtualMachineTemplateName", required=true)
    private final String virtualMachineTemplateName;

    public String getVirtualMachineTemplateName() {
        return this.virtualMachineTemplateName;
    }

    public GetVirtualMachineTemplateArgs(
        String resourceGroupName,
        String virtualMachineTemplateName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualMachineTemplateName = Objects.requireNonNull(virtualMachineTemplateName, "expected parameter 'virtualMachineTemplateName' to be non-null");
    }

    private GetVirtualMachineTemplateArgs() {
        this.resourceGroupName = null;
        this.virtualMachineTemplateName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String virtualMachineTemplateName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualMachineTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualMachineTemplateName = defaults.virtualMachineTemplateName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setVirtualMachineTemplateName(String virtualMachineTemplateName) {
            this.virtualMachineTemplateName = Objects.requireNonNull(virtualMachineTemplateName);
            return this;
        }

        public GetVirtualMachineTemplateArgs build() {
            return new GetVirtualMachineTemplateArgs(resourceGroupName, virtualMachineTemplateName);
        }
    }
}
