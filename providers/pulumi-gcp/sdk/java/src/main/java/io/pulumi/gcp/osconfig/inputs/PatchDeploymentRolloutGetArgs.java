// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentRolloutDisruptionBudgetGetArgs;
import java.lang.String;
import java.util.Objects;


public final class PatchDeploymentRolloutGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentRolloutGetArgs Empty = new PatchDeploymentRolloutGetArgs();

    /**
     * The maximum number (or percentage) of VMs per zone to disrupt at any given moment. The number of VMs calculated from multiplying the percentage by the total number of VMs in a zone is rounded up.
     * During patching, a VM is considered disrupted from the time the agent is notified to begin until patching has completed. This disruption time includes the time to complete reboot and any post-patch steps.
     * A VM contributes to the disruption budget if its patching operation fails either when applying the patches, running pre or post patch steps, or if it fails to respond with a success notification before timing out. VMs that are not running or do not have an active agent do not count toward this disruption budget.
     * For zone-by-zone rollouts, if the disruption budget in a zone is exceeded, the patch job stops, because continuing to the next zone requires completion of the patch process in the previous zone.
     * For example, if the disruption budget has a fixed value of 10, and 8 VMs fail to patch in the current zone, the patch job continues to patch 2 VMs at a time until the zone is completed. When that zone is completed successfully, patching begins with 10 VMs at a time in the next zone. If 10 VMs in the next zone fail to patch, the patch job stops.
     * Structure is documented below.
     * 
     */
    @InputImport(name="disruptionBudget", required=true)
      private final Input<PatchDeploymentRolloutDisruptionBudgetGetArgs> disruptionBudget;

    public Input<PatchDeploymentRolloutDisruptionBudgetGetArgs> getDisruptionBudget() {
        return this.disruptionBudget;
    }

    /**
     * Mode of the patch rollout.
     * Possible values are `ZONE_BY_ZONE` and `CONCURRENT_ZONES`.
     * 
     */
    @InputImport(name="mode", required=true)
      private final Input<String> mode;

    public Input<String> getMode() {
        return this.mode;
    }

    public PatchDeploymentRolloutGetArgs(
        Input<PatchDeploymentRolloutDisruptionBudgetGetArgs> disruptionBudget,
        Input<String> mode) {
        this.disruptionBudget = Objects.requireNonNull(disruptionBudget, "expected parameter 'disruptionBudget' to be non-null");
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
    }

    private PatchDeploymentRolloutGetArgs() {
        this.disruptionBudget = Input.empty();
        this.mode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentRolloutGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<PatchDeploymentRolloutDisruptionBudgetGetArgs> disruptionBudget;
        private Input<String> mode;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentRolloutGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disruptionBudget = defaults.disruptionBudget;
    	      this.mode = defaults.mode;
        }

        public Builder setDisruptionBudget(Input<PatchDeploymentRolloutDisruptionBudgetGetArgs> disruptionBudget) {
            this.disruptionBudget = Objects.requireNonNull(disruptionBudget);
            return this;
        }

        public Builder setDisruptionBudget(PatchDeploymentRolloutDisruptionBudgetGetArgs disruptionBudget) {
            this.disruptionBudget = Input.of(Objects.requireNonNull(disruptionBudget));
            return this;
        }

        public Builder setMode(Input<String> mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = Input.of(Objects.requireNonNull(mode));
            return this;
        }
        public PatchDeploymentRolloutGetArgs build() {
            return new PatchDeploymentRolloutGetArgs(disruptionBudget, mode);
        }
    }
}