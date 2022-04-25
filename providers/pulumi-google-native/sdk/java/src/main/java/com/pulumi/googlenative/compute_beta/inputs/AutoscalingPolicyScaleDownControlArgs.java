// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.inputs.FixedOrPercentArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration that allows for slower scale in so that even if Autoscaler recommends an abrupt scale in of a MIG, it will be throttled as specified by the parameters below.
 * 
 */
public final class AutoscalingPolicyScaleDownControlArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoscalingPolicyScaleDownControlArgs Empty = new AutoscalingPolicyScaleDownControlArgs();

    /**
     * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * 
     */
    @Import(name="maxScaledDownReplicas")
    private @Nullable Output<FixedOrPercentArgs> maxScaledDownReplicas;

    /**
     * @return Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * 
     */
    public Optional<Output<FixedOrPercentArgs>> maxScaledDownReplicas() {
        return Optional.ofNullable(this.maxScaledDownReplicas);
    }

    /**
     * How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
     * 
     */
    @Import(name="timeWindowSec")
    private @Nullable Output<Integer> timeWindowSec;

    /**
     * @return How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
     * 
     */
    public Optional<Output<Integer>> timeWindowSec() {
        return Optional.ofNullable(this.timeWindowSec);
    }

    private AutoscalingPolicyScaleDownControlArgs() {}

    private AutoscalingPolicyScaleDownControlArgs(AutoscalingPolicyScaleDownControlArgs $) {
        this.maxScaledDownReplicas = $.maxScaledDownReplicas;
        this.timeWindowSec = $.timeWindowSec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscalingPolicyScaleDownControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalingPolicyScaleDownControlArgs $;

        public Builder() {
            $ = new AutoscalingPolicyScaleDownControlArgs();
        }

        public Builder(AutoscalingPolicyScaleDownControlArgs defaults) {
            $ = new AutoscalingPolicyScaleDownControlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxScaledDownReplicas Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
         * 
         * @return builder
         * 
         */
        public Builder maxScaledDownReplicas(@Nullable Output<FixedOrPercentArgs> maxScaledDownReplicas) {
            $.maxScaledDownReplicas = maxScaledDownReplicas;
            return this;
        }

        /**
         * @param maxScaledDownReplicas Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
         * 
         * @return builder
         * 
         */
        public Builder maxScaledDownReplicas(FixedOrPercentArgs maxScaledDownReplicas) {
            return maxScaledDownReplicas(Output.of(maxScaledDownReplicas));
        }

        /**
         * @param timeWindowSec How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
         * 
         * @return builder
         * 
         */
        public Builder timeWindowSec(@Nullable Output<Integer> timeWindowSec) {
            $.timeWindowSec = timeWindowSec;
            return this;
        }

        /**
         * @param timeWindowSec How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
         * 
         * @return builder
         * 
         */
        public Builder timeWindowSec(Integer timeWindowSec) {
            return timeWindowSec(Output.of(timeWindowSec));
        }

        public AutoscalingPolicyScaleDownControlArgs build() {
            return $;
        }
    }

}
