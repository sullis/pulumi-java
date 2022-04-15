// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol.inputs;

import io.pulumi.awsnative.route53recoverycontrol.enums.SafetyRuleRuleType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


/**
 * The rule configuration for an assertion rule or gating rule. This is the criteria that you set for specific assertion controls (routing controls) or gating controls. This configuration specifies how many controls must be enabled after a transaction completes.
 * 
 */
public final class SafetyRuleRuleConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SafetyRuleRuleConfigArgs Empty = new SafetyRuleRuleConfigArgs();

    /**
     * Logical negation of the rule. If the rule would usually evaluate true, it's evaluated as false, and vice versa.
     * 
     */
    @Import(name="inverted", required=true)
      private final Output<Boolean> inverted;

    public Output<Boolean> inverted() {
        return this.inverted;
    }

    /**
     * The value of N, when you specify an ATLEAST rule type. That is, Threshold is the number of controls that must be set when you specify an ATLEAST type.
     * 
     */
    @Import(name="threshold", required=true)
      private final Output<Integer> threshold;

    public Output<Integer> threshold() {
        return this.threshold;
    }

    @Import(name="type", required=true)
      private final Output<SafetyRuleRuleType> type;

    public Output<SafetyRuleRuleType> type() {
        return this.type;
    }

    public SafetyRuleRuleConfigArgs(
        Output<Boolean> inverted,
        Output<Integer> threshold,
        Output<SafetyRuleRuleType> type) {
        this.inverted = Objects.requireNonNull(inverted, "expected parameter 'inverted' to be non-null");
        this.threshold = Objects.requireNonNull(threshold, "expected parameter 'threshold' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SafetyRuleRuleConfigArgs() {
        this.inverted = Codegen.empty();
        this.threshold = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SafetyRuleRuleConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> inverted;
        private Output<Integer> threshold;
        private Output<SafetyRuleRuleType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SafetyRuleRuleConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inverted = defaults.inverted;
    	      this.threshold = defaults.threshold;
    	      this.type = defaults.type;
        }

        public Builder inverted(Output<Boolean> inverted) {
            this.inverted = Objects.requireNonNull(inverted);
            return this;
        }
        public Builder inverted(Boolean inverted) {
            this.inverted = Output.of(Objects.requireNonNull(inverted));
            return this;
        }
        public Builder threshold(Output<Integer> threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        public Builder threshold(Integer threshold) {
            this.threshold = Output.of(Objects.requireNonNull(threshold));
            return this;
        }
        public Builder type(Output<SafetyRuleRuleType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(SafetyRuleRuleType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public SafetyRuleRuleConfigArgs build() {
            return new SafetyRuleRuleConfigArgs(inverted, threshold, type);
        }
    }
}
