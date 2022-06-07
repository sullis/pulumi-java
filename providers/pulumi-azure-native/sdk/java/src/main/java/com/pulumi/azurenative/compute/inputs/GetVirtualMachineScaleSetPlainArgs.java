// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVirtualMachineScaleSetPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualMachineScaleSetPlainArgs Empty = new GetVirtualMachineScaleSetPlainArgs();

    /**
     * The expand expression to apply on the operation. &#39;UserData&#39; retrieves the UserData property of the VM scale set that was provided by the user during the VM scale set Create/Update operation
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    /**
     * @return The expand expression to apply on the operation. &#39;UserData&#39; retrieves the UserData property of the VM scale set that was provided by the user during the VM scale set Create/Update operation
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

    private GetVirtualMachineScaleSetPlainArgs() {}

    private GetVirtualMachineScaleSetPlainArgs(GetVirtualMachineScaleSetPlainArgs $) {
        this.expand = $.expand;
        this.resourceGroupName = $.resourceGroupName;
        this.vmScaleSetName = $.vmScaleSetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualMachineScaleSetPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualMachineScaleSetPlainArgs $;

        public Builder() {
            $ = new GetVirtualMachineScaleSetPlainArgs();
        }

        public Builder(GetVirtualMachineScaleSetPlainArgs defaults) {
            $ = new GetVirtualMachineScaleSetPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand The expand expression to apply on the operation. &#39;UserData&#39; retrieves the UserData property of the VM scale set that was provided by the user during the VM scale set Create/Update operation
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
         * @param vmScaleSetName The name of the VM scale set.
         * 
         * @return builder
         * 
         */
        public Builder vmScaleSetName(String vmScaleSetName) {
            $.vmScaleSetName = vmScaleSetName;
            return this;
        }

        public GetVirtualMachineScaleSetPlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vmScaleSetName = Objects.requireNonNull($.vmScaleSetName, "expected parameter 'vmScaleSetName' to be non-null");
            return $;
        }
    }

}
