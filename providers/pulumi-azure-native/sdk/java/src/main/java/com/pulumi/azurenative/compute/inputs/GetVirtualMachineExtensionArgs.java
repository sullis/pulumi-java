// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVirtualMachineExtensionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualMachineExtensionArgs Empty = new GetVirtualMachineExtensionArgs();

    /**
     * The expand expression to apply on the operation.
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    /**
     * @return The expand expression to apply on the operation.
     * 
     */
    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the virtual machine extension.
     * 
     */
    @Import(name="vmExtensionName", required=true)
    private String vmExtensionName;

    /**
     * @return The name of the virtual machine extension.
     * 
     */
    public String vmExtensionName() {
        return this.vmExtensionName;
    }

    /**
     * The name of the virtual machine containing the extension.
     * 
     */
    @Import(name="vmName", required=true)
    private String vmName;

    /**
     * @return The name of the virtual machine containing the extension.
     * 
     */
    public String vmName() {
        return this.vmName;
    }

    private GetVirtualMachineExtensionArgs() {}

    private GetVirtualMachineExtensionArgs(GetVirtualMachineExtensionArgs $) {
        this.expand = $.expand;
        this.resourceGroupName = $.resourceGroupName;
        this.vmExtensionName = $.vmExtensionName;
        this.vmName = $.vmName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualMachineExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualMachineExtensionArgs $;

        public Builder() {
            $ = new GetVirtualMachineExtensionArgs();
        }

        public Builder(GetVirtualMachineExtensionArgs defaults) {
            $ = new GetVirtualMachineExtensionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand The expand expression to apply on the operation.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param vmExtensionName The name of the virtual machine extension.
         * 
         * @return builder
         * 
         */
        public Builder vmExtensionName(String vmExtensionName) {
            $.vmExtensionName = vmExtensionName;
            return this;
        }

        /**
         * @param vmName The name of the virtual machine containing the extension.
         * 
         * @return builder
         * 
         */
        public Builder vmName(String vmName) {
            $.vmName = vmName;
            return this;
        }

        public GetVirtualMachineExtensionArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vmExtensionName = Objects.requireNonNull($.vmExtensionName, "expected parameter 'vmExtensionName' to be non-null");
            $.vmName = Objects.requireNonNull($.vmName, "expected parameter 'vmName' to be non-null");
            return $;
        }
    }

}
