// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs;
import com.pulumi.googlenative.compute_alpha.inputs.ResourcePolicyVmMaintenancePolicyMaintenanceWindowArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourcePolicyVmMaintenancePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyVmMaintenancePolicyArgs Empty = new ResourcePolicyVmMaintenancePolicyArgs();

    @Import(name="concurrencyControlGroup")
    private @Nullable Output<ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs> concurrencyControlGroup;

    public Optional<Output<ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs>> concurrencyControlGroup() {
        return Optional.ofNullable(this.concurrencyControlGroup);
    }

    /**
     * Maintenance windows that are applied to VMs covered by this policy.
     * 
     */
    @Import(name="maintenanceWindow")
    private @Nullable Output<ResourcePolicyVmMaintenancePolicyMaintenanceWindowArgs> maintenanceWindow;

    /**
     * @return Maintenance windows that are applied to VMs covered by this policy.
     * 
     */
    public Optional<Output<ResourcePolicyVmMaintenancePolicyMaintenanceWindowArgs>> maintenanceWindow() {
        return Optional.ofNullable(this.maintenanceWindow);
    }

    private ResourcePolicyVmMaintenancePolicyArgs() {}

    private ResourcePolicyVmMaintenancePolicyArgs(ResourcePolicyVmMaintenancePolicyArgs $) {
        this.concurrencyControlGroup = $.concurrencyControlGroup;
        this.maintenanceWindow = $.maintenanceWindow;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicyVmMaintenancePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyVmMaintenancePolicyArgs $;

        public Builder() {
            $ = new ResourcePolicyVmMaintenancePolicyArgs();
        }

        public Builder(ResourcePolicyVmMaintenancePolicyArgs defaults) {
            $ = new ResourcePolicyVmMaintenancePolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder concurrencyControlGroup(@Nullable Output<ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs> concurrencyControlGroup) {
            $.concurrencyControlGroup = concurrencyControlGroup;
            return this;
        }

        public Builder concurrencyControlGroup(ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs concurrencyControlGroup) {
            return concurrencyControlGroup(Output.of(concurrencyControlGroup));
        }

        /**
         * @param maintenanceWindow Maintenance windows that are applied to VMs covered by this policy.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindow(@Nullable Output<ResourcePolicyVmMaintenancePolicyMaintenanceWindowArgs> maintenanceWindow) {
            $.maintenanceWindow = maintenanceWindow;
            return this;
        }

        /**
         * @param maintenanceWindow Maintenance windows that are applied to VMs covered by this policy.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindow(ResourcePolicyVmMaintenancePolicyMaintenanceWindowArgs maintenanceWindow) {
            return maintenanceWindow(Output.of(maintenanceWindow));
        }

        public ResourcePolicyVmMaintenancePolicyArgs build() {
            return $;
        }
    }

}
