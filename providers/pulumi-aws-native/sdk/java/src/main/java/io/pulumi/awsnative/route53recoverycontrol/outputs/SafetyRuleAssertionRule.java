// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SafetyRuleAssertionRule {
    /**
     * The routing controls that are part of transactions that are evaluated to determine if a request to change a routing control state is allowed. For example, you might include three routing controls, one for each of three AWS Regions.
     * 
     */
    private final List<String> assertedControls;
    /**
     * An evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can choose a custom value.
     * 
     */
    private final Integer waitPeriodMs;

    @CustomType.Constructor
    private SafetyRuleAssertionRule(
        @CustomType.Parameter("assertedControls") List<String> assertedControls,
        @CustomType.Parameter("waitPeriodMs") Integer waitPeriodMs) {
        this.assertedControls = assertedControls;
        this.waitPeriodMs = waitPeriodMs;
    }

    /**
     * The routing controls that are part of transactions that are evaluated to determine if a request to change a routing control state is allowed. For example, you might include three routing controls, one for each of three AWS Regions.
     * 
    */
    public List<String> assertedControls() {
        return this.assertedControls;
    }
    /**
     * An evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can choose a custom value.
     * 
    */
    public Integer waitPeriodMs() {
        return this.waitPeriodMs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SafetyRuleAssertionRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> assertedControls;
        private Integer waitPeriodMs;

        public Builder() {
    	      // Empty
        }

        public Builder(SafetyRuleAssertionRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assertedControls = defaults.assertedControls;
    	      this.waitPeriodMs = defaults.waitPeriodMs;
        }

        public Builder assertedControls(List<String> assertedControls) {
            this.assertedControls = Objects.requireNonNull(assertedControls);
            return this;
        }
        public Builder assertedControls(String... assertedControls) {
            return assertedControls(List.of(assertedControls));
        }
        public Builder waitPeriodMs(Integer waitPeriodMs) {
            this.waitPeriodMs = Objects.requireNonNull(waitPeriodMs);
            return this;
        }        public SafetyRuleAssertionRule build() {
            return new SafetyRuleAssertionRule(assertedControls, waitPeriodMs);
        }
    }
}
