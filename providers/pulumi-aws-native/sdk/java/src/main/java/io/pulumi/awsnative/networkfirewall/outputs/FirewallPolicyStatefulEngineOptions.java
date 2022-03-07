// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.awsnative.networkfirewall.enums.FirewallPolicyRuleOrder;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirewallPolicyStatefulEngineOptions {
    private final @Nullable FirewallPolicyRuleOrder ruleOrder;

    @OutputCustomType.Constructor({"ruleOrder"})
    private FirewallPolicyStatefulEngineOptions(@Nullable FirewallPolicyRuleOrder ruleOrder) {
        this.ruleOrder = ruleOrder;
    }

    public Optional<FirewallPolicyRuleOrder> getRuleOrder() {
        return Optional.ofNullable(this.ruleOrder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyStatefulEngineOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FirewallPolicyRuleOrder ruleOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyStatefulEngineOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleOrder = defaults.ruleOrder;
        }

        public Builder setRuleOrder(@Nullable FirewallPolicyRuleOrder ruleOrder) {
            this.ruleOrder = ruleOrder;
            return this;
        }
        public FirewallPolicyStatefulEngineOptions build() {
            return new FirewallPolicyStatefulEngineOptions(ruleOrder);
        }
    }
}