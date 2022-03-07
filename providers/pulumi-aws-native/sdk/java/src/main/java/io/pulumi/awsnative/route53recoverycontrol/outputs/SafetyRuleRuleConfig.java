// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol.outputs;

import io.pulumi.awsnative.route53recoverycontrol.enums.SafetyRuleRuleType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class SafetyRuleRuleConfig {
    /**
     * Logical negation of the rule. If the rule would usually evaluate true, it's evaluated as false, and vice versa.
     * 
     */
    private final Boolean inverted;
    /**
     * The value of N, when you specify an ATLEAST rule type. That is, Threshold is the number of controls that must be set when you specify an ATLEAST type.
     * 
     */
    private final Integer threshold;
    private final SafetyRuleRuleType type;

    @OutputCustomType.Constructor({"inverted","threshold","type"})
    private SafetyRuleRuleConfig(
        Boolean inverted,
        Integer threshold,
        SafetyRuleRuleType type) {
        this.inverted = Objects.requireNonNull(inverted);
        this.threshold = Objects.requireNonNull(threshold);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Logical negation of the rule. If the rule would usually evaluate true, it's evaluated as false, and vice versa.
     * 
    */
    public Boolean getInverted() {
        return this.inverted;
    }
    /**
     * The value of N, when you specify an ATLEAST rule type. That is, Threshold is the number of controls that must be set when you specify an ATLEAST type.
     * 
    */
    public Integer getThreshold() {
        return this.threshold;
    }
    public SafetyRuleRuleType getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SafetyRuleRuleConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean inverted;
        private Integer threshold;
        private SafetyRuleRuleType type;

        public Builder() {
    	      // Empty
        }

        public Builder(SafetyRuleRuleConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inverted = defaults.inverted;
    	      this.threshold = defaults.threshold;
    	      this.type = defaults.type;
        }

        public Builder setInverted(Boolean inverted) {
            this.inverted = Objects.requireNonNull(inverted);
            return this;
        }

        public Builder setThreshold(Integer threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }

        public Builder setType(SafetyRuleRuleType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SafetyRuleRuleConfig build() {
            return new SafetyRuleRuleConfig(inverted, threshold, type);
        }
    }
}