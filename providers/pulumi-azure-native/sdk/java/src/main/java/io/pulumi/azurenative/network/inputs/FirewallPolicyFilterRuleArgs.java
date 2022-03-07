// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ApplicationRuleConditionArgs;
import io.pulumi.azurenative.network.inputs.FirewallPolicyFilterRuleActionArgs;
import io.pulumi.azurenative.network.inputs.NatRuleConditionArgs;
import io.pulumi.azurenative.network.inputs.NetworkRuleConditionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Firewall Policy Filter Rule.
 * 
 */
public final class FirewallPolicyFilterRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyFilterRuleArgs Empty = new FirewallPolicyFilterRuleArgs();

    /**
     * The action type of a Filter rule.
     * 
     */
    @InputImport(name="action")
      private final @Nullable Input<FirewallPolicyFilterRuleActionArgs> action;

    public Input<FirewallPolicyFilterRuleActionArgs> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * The name of the rule.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Priority of the Firewall Policy Rule resource.
     * 
     */
    @InputImport(name="priority")
      private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * Collection of rule conditions used by a rule.
     * 
     */
    @InputImport(name="ruleConditions")
      private final @Nullable Input<List<Object>> ruleConditions;

    public Input<List<Object>> getRuleConditions() {
        return this.ruleConditions == null ? Input.empty() : this.ruleConditions;
    }

    /**
     * The type of the rule.
     * Expected value is 'FirewallPolicyFilterRule'.
     * 
     */
    @InputImport(name="ruleType", required=true)
      private final Input<String> ruleType;

    public Input<String> getRuleType() {
        return this.ruleType;
    }

    public FirewallPolicyFilterRuleArgs(
        @Nullable Input<FirewallPolicyFilterRuleActionArgs> action,
        @Nullable Input<String> name,
        @Nullable Input<Integer> priority,
        @Nullable Input<List<Object>> ruleConditions,
        Input<String> ruleType) {
        this.action = action;
        this.name = name;
        this.priority = priority;
        this.ruleConditions = ruleConditions;
        this.ruleType = Objects.requireNonNull(ruleType, "expected parameter 'ruleType' to be non-null");
    }

    private FirewallPolicyFilterRuleArgs() {
        this.action = Input.empty();
        this.name = Input.empty();
        this.priority = Input.empty();
        this.ruleConditions = Input.empty();
        this.ruleType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFilterRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FirewallPolicyFilterRuleActionArgs> action;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<List<Object>> ruleConditions;
        private Input<String> ruleType;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFilterRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleConditions = defaults.ruleConditions;
    	      this.ruleType = defaults.ruleType;
        }

        public Builder setAction(@Nullable Input<FirewallPolicyFilterRuleActionArgs> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable FirewallPolicyFilterRuleActionArgs action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setRuleConditions(@Nullable Input<List<Object>> ruleConditions) {
            this.ruleConditions = ruleConditions;
            return this;
        }

        public Builder setRuleConditions(@Nullable List<Object> ruleConditions) {
            this.ruleConditions = Input.ofNullable(ruleConditions);
            return this;
        }

        public Builder setRuleType(Input<String> ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }

        public Builder setRuleType(String ruleType) {
            this.ruleType = Input.of(Objects.requireNonNull(ruleType));
            return this;
        }
        public FirewallPolicyFilterRuleArgs build() {
            return new FirewallPolicyFilterRuleArgs(action, name, priority, ruleConditions, ruleType);
        }
    }
}