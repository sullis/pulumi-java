// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.inputs;

import io.pulumi.aws.batch.inputs.GetSchedulingPolicyFairSharePolicyShareDistribution;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class GetSchedulingPolicyFairSharePolicy extends io.pulumi.resources.InvokeArgs {

    public static final GetSchedulingPolicyFairSharePolicy Empty = new GetSchedulingPolicyFairSharePolicy();

    /**
     * A value used to reserve some of the available maximum vCPU for fair share identifiers that have not yet been used. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html).
     * 
     */
    @Import(name="computeReservation", required=true)
      private final Integer computeReservation;

    public Integer computeReservation() {
        return this.computeReservation;
    }

    @Import(name="shareDecaySeconds", required=true)
      private final Integer shareDecaySeconds;

    public Integer shareDecaySeconds() {
        return this.shareDecaySeconds;
    }

    /**
     * One or more share distribution blocks which define the weights for the fair share identifiers for the fair share policy. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html). The `share_distribution` block is documented below.
     * 
     */
    @Import(name="shareDistributions", required=true)
      private final List<GetSchedulingPolicyFairSharePolicyShareDistribution> shareDistributions;

    public List<GetSchedulingPolicyFairSharePolicyShareDistribution> shareDistributions() {
        return this.shareDistributions;
    }

    public GetSchedulingPolicyFairSharePolicy(
        Integer computeReservation,
        Integer shareDecaySeconds,
        List<GetSchedulingPolicyFairSharePolicyShareDistribution> shareDistributions) {
        this.computeReservation = Objects.requireNonNull(computeReservation, "expected parameter 'computeReservation' to be non-null");
        this.shareDecaySeconds = Objects.requireNonNull(shareDecaySeconds, "expected parameter 'shareDecaySeconds' to be non-null");
        this.shareDistributions = Objects.requireNonNull(shareDistributions, "expected parameter 'shareDistributions' to be non-null");
    }

    private GetSchedulingPolicyFairSharePolicy() {
        this.computeReservation = null;
        this.shareDecaySeconds = null;
        this.shareDistributions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchedulingPolicyFairSharePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer computeReservation;
        private Integer shareDecaySeconds;
        private List<GetSchedulingPolicyFairSharePolicyShareDistribution> shareDistributions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSchedulingPolicyFairSharePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeReservation = defaults.computeReservation;
    	      this.shareDecaySeconds = defaults.shareDecaySeconds;
    	      this.shareDistributions = defaults.shareDistributions;
        }

        public Builder computeReservation(Integer computeReservation) {
            this.computeReservation = Objects.requireNonNull(computeReservation);
            return this;
        }
        public Builder shareDecaySeconds(Integer shareDecaySeconds) {
            this.shareDecaySeconds = Objects.requireNonNull(shareDecaySeconds);
            return this;
        }
        public Builder shareDistributions(List<GetSchedulingPolicyFairSharePolicyShareDistribution> shareDistributions) {
            this.shareDistributions = Objects.requireNonNull(shareDistributions);
            return this;
        }
        public Builder shareDistributions(GetSchedulingPolicyFairSharePolicyShareDistribution... shareDistributions) {
            return shareDistributions(List.of(shareDistributions));
        }        public GetSchedulingPolicyFairSharePolicy build() {
            return new GetSchedulingPolicyFairSharePolicy(computeReservation, shareDecaySeconds, shareDistributions);
        }
    }
}
