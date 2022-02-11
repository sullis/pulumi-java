// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class SafetyRuleGatingRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final SafetyRuleGatingRuleArgs Empty = new SafetyRuleGatingRuleArgs();

    @InputImport(name="gatingControls", required=true)
    private final Input<List<String>> gatingControls;

    public Input<List<String>> getGatingControls() {
        return this.gatingControls;
    }

    @InputImport(name="targetControls", required=true)
    private final Input<List<String>> targetControls;

    public Input<List<String>> getTargetControls() {
        return this.targetControls;
    }

    @InputImport(name="waitPeriodMs", required=true)
    private final Input<Integer> waitPeriodMs;

    public Input<Integer> getWaitPeriodMs() {
        return this.waitPeriodMs;
    }

    public SafetyRuleGatingRuleArgs(
        Input<List<String>> gatingControls,
        Input<List<String>> targetControls,
        Input<Integer> waitPeriodMs) {
        this.gatingControls = Objects.requireNonNull(gatingControls, "expected parameter 'gatingControls' to be non-null");
        this.targetControls = Objects.requireNonNull(targetControls, "expected parameter 'targetControls' to be non-null");
        this.waitPeriodMs = Objects.requireNonNull(waitPeriodMs, "expected parameter 'waitPeriodMs' to be non-null");
    }

    private SafetyRuleGatingRuleArgs() {
        this.gatingControls = Input.empty();
        this.targetControls = Input.empty();
        this.waitPeriodMs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SafetyRuleGatingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> gatingControls;
        private Input<List<String>> targetControls;
        private Input<Integer> waitPeriodMs;

        public Builder() {
    	      // Empty
        }

        public Builder(SafetyRuleGatingRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatingControls = defaults.gatingControls;
    	      this.targetControls = defaults.targetControls;
    	      this.waitPeriodMs = defaults.waitPeriodMs;
        }

        public Builder setGatingControls(Input<List<String>> gatingControls) {
            this.gatingControls = Objects.requireNonNull(gatingControls);
            return this;
        }

        public Builder setGatingControls(List<String> gatingControls) {
            this.gatingControls = Input.of(Objects.requireNonNull(gatingControls));
            return this;
        }

        public Builder setTargetControls(Input<List<String>> targetControls) {
            this.targetControls = Objects.requireNonNull(targetControls);
            return this;
        }

        public Builder setTargetControls(List<String> targetControls) {
            this.targetControls = Input.of(Objects.requireNonNull(targetControls));
            return this;
        }

        public Builder setWaitPeriodMs(Input<Integer> waitPeriodMs) {
            this.waitPeriodMs = Objects.requireNonNull(waitPeriodMs);
            return this;
        }

        public Builder setWaitPeriodMs(Integer waitPeriodMs) {
            this.waitPeriodMs = Input.of(Objects.requireNonNull(waitPeriodMs));
            return this;
        }

        public SafetyRuleGatingRuleArgs build() {
            return new SafetyRuleGatingRuleArgs(gatingControls, targetControls, waitPeriodMs);
        }
    }
}
