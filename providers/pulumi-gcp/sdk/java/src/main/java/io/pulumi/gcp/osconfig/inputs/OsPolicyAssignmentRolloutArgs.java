// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentRolloutDisruptionBudgetArgs;
import java.lang.String;
import java.util.Objects;


public final class OsPolicyAssignmentRolloutArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentRolloutArgs Empty = new OsPolicyAssignmentRolloutArgs();

    /**
     * Required. The maximum number (or percentage) of VMs per zone to disrupt at any given moment.
     * 
     */
    @InputImport(name="disruptionBudget", required=true)
    private final Input<OsPolicyAssignmentRolloutDisruptionBudgetArgs> disruptionBudget;

    public Input<OsPolicyAssignmentRolloutDisruptionBudgetArgs> getDisruptionBudget() {
        return this.disruptionBudget;
    }

    /**
     * Required. This determines the minimum duration of time to wait after the configuration changes are applied through the current rollout. A VM continues to count towards the `disruption_budget` at least until this duration of time has passed after configuration changes are applied.
     * 
     */
    @InputImport(name="minWaitDuration", required=true)
    private final Input<String> minWaitDuration;

    public Input<String> getMinWaitDuration() {
        return this.minWaitDuration;
    }

    public OsPolicyAssignmentRolloutArgs(
        Input<OsPolicyAssignmentRolloutDisruptionBudgetArgs> disruptionBudget,
        Input<String> minWaitDuration) {
        this.disruptionBudget = Objects.requireNonNull(disruptionBudget, "expected parameter 'disruptionBudget' to be non-null");
        this.minWaitDuration = Objects.requireNonNull(minWaitDuration, "expected parameter 'minWaitDuration' to be non-null");
    }

    private OsPolicyAssignmentRolloutArgs() {
        this.disruptionBudget = Input.empty();
        this.minWaitDuration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentRolloutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<OsPolicyAssignmentRolloutDisruptionBudgetArgs> disruptionBudget;
        private Input<String> minWaitDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentRolloutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disruptionBudget = defaults.disruptionBudget;
    	      this.minWaitDuration = defaults.minWaitDuration;
        }

        public Builder setDisruptionBudget(Input<OsPolicyAssignmentRolloutDisruptionBudgetArgs> disruptionBudget) {
            this.disruptionBudget = Objects.requireNonNull(disruptionBudget);
            return this;
        }

        public Builder setDisruptionBudget(OsPolicyAssignmentRolloutDisruptionBudgetArgs disruptionBudget) {
            this.disruptionBudget = Input.of(Objects.requireNonNull(disruptionBudget));
            return this;
        }

        public Builder setMinWaitDuration(Input<String> minWaitDuration) {
            this.minWaitDuration = Objects.requireNonNull(minWaitDuration);
            return this;
        }

        public Builder setMinWaitDuration(String minWaitDuration) {
            this.minWaitDuration = Input.of(Objects.requireNonNull(minWaitDuration));
            return this;
        }

        public OsPolicyAssignmentRolloutArgs build() {
            return new OsPolicyAssignmentRolloutArgs(disruptionBudget, minWaitDuration);
        }
    }
}
