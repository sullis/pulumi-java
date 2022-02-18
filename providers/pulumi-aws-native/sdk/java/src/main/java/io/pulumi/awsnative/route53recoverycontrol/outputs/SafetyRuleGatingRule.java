// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SafetyRuleGatingRule {
    /**
     * The gating controls for the gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
     * 
     */
    private final List<String> gatingControls;
    /**
     * Routing controls that can only be set or unset if the specified RuleConfig evaluates to true for the specified GatingControls. For example, say you have three gating controls, one for each of three AWS Regions. Now you specify AtLeast 2 as your RuleConfig. With these settings, you can only change (set or unset) the routing controls that you have specified as TargetControls if that rule evaluates to true.
     * In other words, your ability to change the routing controls that you have specified as TargetControls is gated by the rule that you set for the routing controls in GatingControls.
     * 
     */
    private final List<String> targetControls;
    /**
     * An evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can choose a custom value.
     * 
     */
    private final Integer waitPeriodMs;

    @OutputCustomType.Constructor({"gatingControls","targetControls","waitPeriodMs"})
    private SafetyRuleGatingRule(
        List<String> gatingControls,
        List<String> targetControls,
        Integer waitPeriodMs) {
        this.gatingControls = Objects.requireNonNull(gatingControls);
        this.targetControls = Objects.requireNonNull(targetControls);
        this.waitPeriodMs = Objects.requireNonNull(waitPeriodMs);
    }

    /**
     * The gating controls for the gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
     * 
     */
    public List<String> getGatingControls() {
        return this.gatingControls;
    }
    /**
     * Routing controls that can only be set or unset if the specified RuleConfig evaluates to true for the specified GatingControls. For example, say you have three gating controls, one for each of three AWS Regions. Now you specify AtLeast 2 as your RuleConfig. With these settings, you can only change (set or unset) the routing controls that you have specified as TargetControls if that rule evaluates to true.
     * In other words, your ability to change the routing controls that you have specified as TargetControls is gated by the rule that you set for the routing controls in GatingControls.
     * 
     */
    public List<String> getTargetControls() {
        return this.targetControls;
    }
    /**
     * An evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can choose a custom value.
     * 
     */
    public Integer getWaitPeriodMs() {
        return this.waitPeriodMs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SafetyRuleGatingRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> gatingControls;
        private List<String> targetControls;
        private Integer waitPeriodMs;

        public Builder() {
    	      // Empty
        }

        public Builder(SafetyRuleGatingRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatingControls = defaults.gatingControls;
    	      this.targetControls = defaults.targetControls;
    	      this.waitPeriodMs = defaults.waitPeriodMs;
        }

        public Builder setGatingControls(List<String> gatingControls) {
            this.gatingControls = Objects.requireNonNull(gatingControls);
            return this;
        }

        public Builder setTargetControls(List<String> targetControls) {
            this.targetControls = Objects.requireNonNull(targetControls);
            return this;
        }

        public Builder setWaitPeriodMs(Integer waitPeriodMs) {
            this.waitPeriodMs = Objects.requireNonNull(waitPeriodMs);
            return this;
        }

        public SafetyRuleGatingRule build() {
            return new SafetyRuleGatingRule(gatingControls, targetControls, waitPeriodMs);
        }
    }
}
