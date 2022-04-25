// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.FixedOrPercentResponse;
import java.lang.Integer;
import java.util.Objects;


/**
 * Configuration that allows for slower scale in so that even if Autoscaler recommends an abrupt scale in of a MIG, it will be throttled as specified by the parameters below.
 * 
 */
public final class AutoscalingPolicyScaleDownControlResponse extends com.pulumi.resources.InvokeArgs {

    public static final AutoscalingPolicyScaleDownControlResponse Empty = new AutoscalingPolicyScaleDownControlResponse();

    /**
     * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * 
     */
    @Import(name="maxScaledDownReplicas", required=true)
    private FixedOrPercentResponse maxScaledDownReplicas;

    /**
     * @return Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * 
     */
    public FixedOrPercentResponse maxScaledDownReplicas() {
        return this.maxScaledDownReplicas;
    }

    /**
     * How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
     * 
     */
    @Import(name="timeWindowSec", required=true)
    private Integer timeWindowSec;

    /**
     * @return How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
     * 
     */
    public Integer timeWindowSec() {
        return this.timeWindowSec;
    }

    private AutoscalingPolicyScaleDownControlResponse() {}

    private AutoscalingPolicyScaleDownControlResponse(AutoscalingPolicyScaleDownControlResponse $) {
        this.maxScaledDownReplicas = $.maxScaledDownReplicas;
        this.timeWindowSec = $.timeWindowSec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscalingPolicyScaleDownControlResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalingPolicyScaleDownControlResponse $;

        public Builder() {
            $ = new AutoscalingPolicyScaleDownControlResponse();
        }

        public Builder(AutoscalingPolicyScaleDownControlResponse defaults) {
            $ = new AutoscalingPolicyScaleDownControlResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxScaledDownReplicas Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
         * 
         * @return builder
         * 
         */
        public Builder maxScaledDownReplicas(FixedOrPercentResponse maxScaledDownReplicas) {
            $.maxScaledDownReplicas = maxScaledDownReplicas;
            return this;
        }

        /**
         * @param timeWindowSec How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
         * 
         * @return builder
         * 
         */
        public Builder timeWindowSec(Integer timeWindowSec) {
            $.timeWindowSec = timeWindowSec;
            return this;
        }

        public AutoscalingPolicyScaleDownControlResponse build() {
            $.maxScaledDownReplicas = Objects.requireNonNull($.maxScaledDownReplicas, "expected parameter 'maxScaledDownReplicas' to be non-null");
            $.timeWindowSec = Objects.requireNonNull($.timeWindowSec, "expected parameter 'timeWindowSec' to be non-null");
            return $;
        }
    }

}
