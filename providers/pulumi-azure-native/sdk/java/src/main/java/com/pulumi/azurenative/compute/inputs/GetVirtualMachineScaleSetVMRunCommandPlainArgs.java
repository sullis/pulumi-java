// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVirtualMachineScaleSetVMRunCommandPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualMachineScaleSetVMRunCommandPlainArgs Empty = new GetVirtualMachineScaleSetVMRunCommandPlainArgs();

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
     * The name of the virtual machine run command.
     * 
     */
    @Import(name="runCommandName", required=true)
    private String runCommandName;

    /**
     * @return The name of the virtual machine run command.
     * 
     */
    public String runCommandName() {
        return this.runCommandName;
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

    private GetVirtualMachineScaleSetVMRunCommandPlainArgs() {}

    private GetVirtualMachineScaleSetVMRunCommandPlainArgs(GetVirtualMachineScaleSetVMRunCommandPlainArgs $) {
        this.expand = $.expand;
        this.instanceId = $.instanceId;
        this.resourceGroupName = $.resourceGroupName;
        this.runCommandName = $.runCommandName;
        this.vmScaleSetName = $.vmScaleSetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualMachineScaleSetVMRunCommandPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualMachineScaleSetVMRunCommandPlainArgs $;

        public Builder() {
            $ = new GetVirtualMachineScaleSetVMRunCommandPlainArgs();
        }

        public Builder(GetVirtualMachineScaleSetVMRunCommandPlainArgs defaults) {
            $ = new GetVirtualMachineScaleSetVMRunCommandPlainArgs(Objects.requireNonNull(defaults));
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
         * @param runCommandName The name of the virtual machine run command.
         * 
         * @return builder
         * 
         */
        public Builder runCommandName(String runCommandName) {
            $.runCommandName = runCommandName;
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

        public GetVirtualMachineScaleSetVMRunCommandPlainArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.runCommandName = Objects.requireNonNull($.runCommandName, "expected parameter 'runCommandName' to be non-null");
            $.vmScaleSetName = Objects.requireNonNull($.vmScaleSetName, "expected parameter 'vmScaleSetName' to be non-null");
            return $;
        }
    }

}
