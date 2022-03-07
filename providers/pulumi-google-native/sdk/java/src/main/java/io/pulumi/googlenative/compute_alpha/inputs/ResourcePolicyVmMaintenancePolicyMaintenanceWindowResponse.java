// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.ResourcePolicyDailyCycleResponse;
import java.util.Objects;


/**
 * A maintenance window for VMs. When set, we restrict our maintenance operations to this window.
 * 
 */
public final class ResourcePolicyVmMaintenancePolicyMaintenanceWindowResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourcePolicyVmMaintenancePolicyMaintenanceWindowResponse Empty = new ResourcePolicyVmMaintenancePolicyMaintenanceWindowResponse();

    @InputImport(name="dailyMaintenanceWindow", required=true)
      private final ResourcePolicyDailyCycleResponse dailyMaintenanceWindow;

    public ResourcePolicyDailyCycleResponse getDailyMaintenanceWindow() {
        return this.dailyMaintenanceWindow;
    }

    public ResourcePolicyVmMaintenancePolicyMaintenanceWindowResponse(ResourcePolicyDailyCycleResponse dailyMaintenanceWindow) {
        this.dailyMaintenanceWindow = Objects.requireNonNull(dailyMaintenanceWindow, "expected parameter 'dailyMaintenanceWindow' to be non-null");
    }

    private ResourcePolicyVmMaintenancePolicyMaintenanceWindowResponse() {
        this.dailyMaintenanceWindow = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyVmMaintenancePolicyMaintenanceWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyDailyCycleResponse dailyMaintenanceWindow;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyVmMaintenancePolicyMaintenanceWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyMaintenanceWindow = defaults.dailyMaintenanceWindow;
        }

        public Builder setDailyMaintenanceWindow(ResourcePolicyDailyCycleResponse dailyMaintenanceWindow) {
            this.dailyMaintenanceWindow = Objects.requireNonNull(dailyMaintenanceWindow);
            return this;
        }
        public ResourcePolicyVmMaintenancePolicyMaintenanceWindowResponse build() {
            return new ResourcePolicyVmMaintenancePolicyMaintenanceWindowResponse(dailyMaintenanceWindow);
        }
    }
}