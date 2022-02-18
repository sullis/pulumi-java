// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVirtualMachineExtensionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVirtualMachineExtensionArgs Empty = new GetVirtualMachineExtensionArgs();

    /**
     * The expand expression to apply on the operation.
     * 
     */
    @InputImport(name="expand")
    private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the virtual machine extension.
     * 
     */
    @InputImport(name="vmExtensionName", required=true)
    private final String vmExtensionName;

    public String getVmExtensionName() {
        return this.vmExtensionName;
    }

    /**
     * The name of the virtual machine containing the extension.
     * 
     */
    @InputImport(name="vmName", required=true)
    private final String vmName;

    public String getVmName() {
        return this.vmName;
    }

    public GetVirtualMachineExtensionArgs(
        @Nullable String expand,
        String resourceGroupName,
        String vmExtensionName,
        String vmName) {
        this.expand = expand;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vmExtensionName = Objects.requireNonNull(vmExtensionName, "expected parameter 'vmExtensionName' to be non-null");
        this.vmName = Objects.requireNonNull(vmName, "expected parameter 'vmName' to be non-null");
    }

    private GetVirtualMachineExtensionArgs() {
        this.expand = null;
        this.resourceGroupName = null;
        this.vmExtensionName = null;
        this.vmName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String resourceGroupName;
        private String vmExtensionName;
        private String vmName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualMachineExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vmExtensionName = defaults.vmExtensionName;
    	      this.vmName = defaults.vmName;
        }

        public Builder setExpand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setVmExtensionName(String vmExtensionName) {
            this.vmExtensionName = Objects.requireNonNull(vmExtensionName);
            return this;
        }

        public Builder setVmName(String vmName) {
            this.vmName = Objects.requireNonNull(vmName);
            return this;
        }

        public GetVirtualMachineExtensionArgs build() {
            return new GetVirtualMachineExtensionArgs(expand, resourceGroupName, vmExtensionName, vmName);
        }
    }
}
