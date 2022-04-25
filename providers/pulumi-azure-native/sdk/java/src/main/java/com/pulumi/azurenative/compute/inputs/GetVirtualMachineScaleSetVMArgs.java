// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVirtualMachineScaleSetVMArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualMachineScaleSetVMArgs Empty = new GetVirtualMachineScaleSetVMArgs();

    /**
     * The expand expression to apply on the operation. &#39;InstanceView&#39; will retrieve the instance view of the virtual machine. &#39;UserData&#39; will retrieve the UserData of the virtual machine.
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    /**
     * @return The expand expression to apply on the operation. &#39;InstanceView&#39; will retrieve the instance view of the virtual machine. &#39;UserData&#39; will retrieve the UserData of the virtual machine.
     * 
     */
    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The instance ID of the virtual machine.
     * 
     */
    @Import(name="instanceId", required=true)
    private String instanceId;

    /**
     * @return The instance ID of the virtual machine.
     * 
     */
    public String instanceId() {
        return this.instanceId;
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
     * The name of the VM scale set.
     * 
     */
    @Import(name="vmScaleSetName", required=true)
    private String vmScaleSetName;

    /**
     * @return The name of the VM scale set.
     * 
     */
    public String vmScaleSetName() {
        return this.vmScaleSetName;
    }

    private GetVirtualMachineScaleSetVMArgs() {}

    private GetVirtualMachineScaleSetVMArgs(GetVirtualMachineScaleSetVMArgs $) {
        this.expand = $.expand;
        this.instanceId = $.instanceId;
        this.resourceGroupName = $.resourceGroupName;
        this.vmScaleSetName = $.vmScaleSetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualMachineScaleSetVMArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualMachineScaleSetVMArgs $;

        public Builder() {
            $ = new GetVirtualMachineScaleSetVMArgs();
        }

        public Builder(GetVirtualMachineScaleSetVMArgs defaults) {
            $ = new GetVirtualMachineScaleSetVMArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand The expand expression to apply on the operation. &#39;InstanceView&#39; will retrieve the instance view of the virtual machine. &#39;UserData&#39; will retrieve the UserData of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param instanceId The instance ID of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            $.instanceId = instanceId;
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
         * @param vmScaleSetName The name of the VM scale set.
         * 
         * @return builder
         * 
         */
        public Builder vmScaleSetName(String vmScaleSetName) {
            $.vmScaleSetName = vmScaleSetName;
            return this;
        }

        public GetVirtualMachineScaleSetVMArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vmScaleSetName = Objects.requireNonNull($.vmScaleSetName, "expected parameter 'vmScaleSetName' to be non-null");
            return $;
        }
    }

}
