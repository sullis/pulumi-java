// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.batch.inputs;

import com.pulumi.aws.batch.inputs.GetSchedulingPolicyFairSharePolicyShareDistribution;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class GetSchedulingPolicyFairSharePolicy extends com.pulumi.resources.InvokeArgs {

    public static final GetSchedulingPolicyFairSharePolicy Empty = new GetSchedulingPolicyFairSharePolicy();

    /**
     * A value used to reserve some of the available maximum vCPU for fair share identifiers that have not yet been used. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html).
     * 
     */
    @Import(name="computeReservation", required=true)
    private Integer computeReservation;

    /**
     * @return A value used to reserve some of the available maximum vCPU for fair share identifiers that have not yet been used. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html).
     * 
     */
    public Integer computeReservation() {
        return this.computeReservation;
    }

    @Import(name="shareDecaySeconds", required=true)
    private Integer shareDecaySeconds;

    public Integer shareDecaySeconds() {
        return this.shareDecaySeconds;
    }

    /**
     * One or more share distribution blocks which define the weights for the fair share identifiers for the fair share policy. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html). The `share_distribution` block is documented below.
     * 
     */
    @Import(name="shareDistributions", required=true)
    private List<GetSchedulingPolicyFairSharePolicyShareDistribution> shareDistributions;

    /**
     * @return One or more share distribution blocks which define the weights for the fair share identifiers for the fair share policy. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html). The `share_distribution` block is documented below.
     * 
     */
    public List<GetSchedulingPolicyFairSharePolicyShareDistribution> shareDistributions() {
        return this.shareDistributions;
    }

    private GetSchedulingPolicyFairSharePolicy() {}

    private GetSchedulingPolicyFairSharePolicy(GetSchedulingPolicyFairSharePolicy $) {
        this.computeReservation = $.computeReservation;
        this.shareDecaySeconds = $.shareDecaySeconds;
        this.shareDistributions = $.shareDistributions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchedulingPolicyFairSharePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchedulingPolicyFairSharePolicy $;

        public Builder() {
            $ = new GetSchedulingPolicyFairSharePolicy();
        }

        public Builder(GetSchedulingPolicyFairSharePolicy defaults) {
            $ = new GetSchedulingPolicyFairSharePolicy(Objects.requireNonNull(defaults));
        }

        /**
         * @param computeReservation A value used to reserve some of the available maximum vCPU for fair share identifiers that have not yet been used. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html).
         * 
         * @return builder
         * 
         */
        public Builder computeReservation(Integer computeReservation) {
            $.computeReservation = computeReservation;
            return this;
        }

        public Builder shareDecaySeconds(Integer shareDecaySeconds) {
            $.shareDecaySeconds = shareDecaySeconds;
            return this;
        }

        /**
         * @param shareDistributions One or more share distribution blocks which define the weights for the fair share identifiers for the fair share policy. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html). The `share_distribution` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder shareDistributions(List<GetSchedulingPolicyFairSharePolicyShareDistribution> shareDistributions) {
            $.shareDistributions = shareDistributions;
            return this;
        }

        /**
         * @param shareDistributions One or more share distribution blocks which define the weights for the fair share identifiers for the fair share policy. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html). The `share_distribution` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder shareDistributions(GetSchedulingPolicyFairSharePolicyShareDistribution... shareDistributions) {
            return shareDistributions(List.of(shareDistributions));
        }

        public GetSchedulingPolicyFairSharePolicy build() {
            $.computeReservation = Objects.requireNonNull($.computeReservation, "expected parameter 'computeReservation' to be non-null");
            $.shareDecaySeconds = Objects.requireNonNull($.shareDecaySeconds, "expected parameter 'shareDecaySeconds' to be non-null");
            $.shareDistributions = Objects.requireNonNull($.shareDistributions, "expected parameter 'shareDistributions' to be non-null");
            return $;
        }
    }

}
