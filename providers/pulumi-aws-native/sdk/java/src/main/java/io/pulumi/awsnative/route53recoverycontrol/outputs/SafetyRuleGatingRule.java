// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SafetyRuleGatingRule {
    private final List<String> gatingControls;
    private final List<String> targetControls;
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

    public List<String> getGatingControls() {
        return this.gatingControls;
    }
    public List<String> getTargetControls() {
        return this.targetControls;
    }
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
