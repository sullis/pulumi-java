// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentRolloutDisruptionBudgetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentRolloutDisruptionBudgetArgs Empty = new PatchDeploymentRolloutDisruptionBudgetArgs();

    /**
     * Specifies a fixed value.
     * 
     */
    @InputImport(name="fixed")
      private final @Nullable Input<Integer> fixed;

    public Input<Integer> getFixed() {
        return this.fixed == null ? Input.empty() : this.fixed;
    }

    /**
     * Specifies the relative value defined as a percentage, which will be multiplied by a reference value.
     * 
     */
    @InputImport(name="percentage")
      private final @Nullable Input<Integer> percentage;

    public Input<Integer> getPercentage() {
        return this.percentage == null ? Input.empty() : this.percentage;
    }

    public PatchDeploymentRolloutDisruptionBudgetArgs(
        @Nullable Input<Integer> fixed,
        @Nullable Input<Integer> percentage) {
        this.fixed = fixed;
        this.percentage = percentage;
    }

    private PatchDeploymentRolloutDisruptionBudgetArgs() {
        this.fixed = Input.empty();
        this.percentage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentRolloutDisruptionBudgetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> fixed;
        private @Nullable Input<Integer> percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentRolloutDisruptionBudgetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixed = defaults.fixed;
    	      this.percentage = defaults.percentage;
        }

        public Builder setFixed(@Nullable Input<Integer> fixed) {
            this.fixed = fixed;
            return this;
        }

        public Builder setFixed(@Nullable Integer fixed) {
            this.fixed = Input.ofNullable(fixed);
            return this;
        }

        public Builder setPercentage(@Nullable Input<Integer> percentage) {
            this.percentage = percentage;
            return this;
        }

        public Builder setPercentage(@Nullable Integer percentage) {
            this.percentage = Input.ofNullable(percentage);
            return this;
        }
        public PatchDeploymentRolloutDisruptionBudgetArgs build() {
            return new PatchDeploymentRolloutDisruptionBudgetArgs(fixed, percentage);
        }
    }
}