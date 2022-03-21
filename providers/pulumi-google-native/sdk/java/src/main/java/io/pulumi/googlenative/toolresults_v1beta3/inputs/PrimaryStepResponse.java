// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.IndividualOutcomeResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Stores rollup test status of multiple steps that were run as a group and outcome of each individual step.
 * 
 */
public final class PrimaryStepResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrimaryStepResponse Empty = new PrimaryStepResponse();

    /**
     * Step Id and outcome of each individual step.
     * 
     */
    @Import(name="individualOutcome", required=true)
      private final List<IndividualOutcomeResponse> individualOutcome;

    public List<IndividualOutcomeResponse> getIndividualOutcome() {
        return this.individualOutcome;
    }

    /**
     * Rollup test status of multiple steps that were run with the same configuration as a group.
     * 
     */
    @Import(name="rollUp", required=true)
      private final String rollUp;

    public String getRollUp() {
        return this.rollUp;
    }

    public PrimaryStepResponse(
        List<IndividualOutcomeResponse> individualOutcome,
        String rollUp) {
        this.individualOutcome = Objects.requireNonNull(individualOutcome, "expected parameter 'individualOutcome' to be non-null");
        this.rollUp = Objects.requireNonNull(rollUp, "expected parameter 'rollUp' to be non-null");
    }

    private PrimaryStepResponse() {
        this.individualOutcome = List.of();
        this.rollUp = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrimaryStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<IndividualOutcomeResponse> individualOutcome;
        private String rollUp;

        public Builder() {
    	      // Empty
        }

        public Builder(PrimaryStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.individualOutcome = defaults.individualOutcome;
    	      this.rollUp = defaults.rollUp;
        }

        public Builder individualOutcome(List<IndividualOutcomeResponse> individualOutcome) {
            this.individualOutcome = Objects.requireNonNull(individualOutcome);
            return this;
        }
        public Builder individualOutcome(IndividualOutcomeResponse... individualOutcome) {
            return individualOutcome(List.of(individualOutcome));
        }
        public Builder rollUp(String rollUp) {
            this.rollUp = Objects.requireNonNull(rollUp);
            return this;
        }        public PrimaryStepResponse build() {
            return new PrimaryStepResponse(individualOutcome, rollUp);
        }
    }
}
