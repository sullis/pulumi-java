// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.toolresults_v1beta3.enums.PrimaryStepRollUp;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.IndividualOutcomeArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Stores rollup test status of multiple steps that were run as a group and outcome of each individual step.
 * 
 */
public final class PrimaryStepArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrimaryStepArgs Empty = new PrimaryStepArgs();

    /**
     * Step Id and outcome of each individual step.
     * 
     */
    @InputImport(name="individualOutcome")
      private final @Nullable Input<List<IndividualOutcomeArgs>> individualOutcome;

    public Input<List<IndividualOutcomeArgs>> getIndividualOutcome() {
        return this.individualOutcome == null ? Input.empty() : this.individualOutcome;
    }

    /**
     * Rollup test status of multiple steps that were run with the same configuration as a group.
     * 
     */
    @InputImport(name="rollUp")
      private final @Nullable Input<PrimaryStepRollUp> rollUp;

    public Input<PrimaryStepRollUp> getRollUp() {
        return this.rollUp == null ? Input.empty() : this.rollUp;
    }

    public PrimaryStepArgs(
        @Nullable Input<List<IndividualOutcomeArgs>> individualOutcome,
        @Nullable Input<PrimaryStepRollUp> rollUp) {
        this.individualOutcome = individualOutcome;
        this.rollUp = rollUp;
    }

    private PrimaryStepArgs() {
        this.individualOutcome = Input.empty();
        this.rollUp = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrimaryStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<IndividualOutcomeArgs>> individualOutcome;
        private @Nullable Input<PrimaryStepRollUp> rollUp;

        public Builder() {
    	      // Empty
        }

        public Builder(PrimaryStepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.individualOutcome = defaults.individualOutcome;
    	      this.rollUp = defaults.rollUp;
        }

        public Builder setIndividualOutcome(@Nullable Input<List<IndividualOutcomeArgs>> individualOutcome) {
            this.individualOutcome = individualOutcome;
            return this;
        }

        public Builder setIndividualOutcome(@Nullable List<IndividualOutcomeArgs> individualOutcome) {
            this.individualOutcome = Input.ofNullable(individualOutcome);
            return this;
        }

        public Builder setRollUp(@Nullable Input<PrimaryStepRollUp> rollUp) {
            this.rollUp = rollUp;
            return this;
        }

        public Builder setRollUp(@Nullable PrimaryStepRollUp rollUp) {
            this.rollUp = Input.ofNullable(rollUp);
            return this;
        }
        public PrimaryStepArgs build() {
            return new PrimaryStepArgs(individualOutcome, rollUp);
        }
    }
}