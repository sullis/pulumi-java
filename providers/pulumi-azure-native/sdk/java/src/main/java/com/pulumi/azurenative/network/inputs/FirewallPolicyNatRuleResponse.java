// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.ApplicationRuleConditionResponse;
import com.pulumi.azurenative.network.inputs.FirewallPolicyNatRuleActionResponse;
import com.pulumi.azurenative.network.inputs.NatRuleConditionResponse;
import com.pulumi.azurenative.network.inputs.NetworkRuleConditionResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Firewall Policy NAT Rule.
 * 
 */
public final class FirewallPolicyNatRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyNatRuleResponse Empty = new FirewallPolicyNatRuleResponse();

    /**
     * The action type of a Nat rule.
     * 
     */
    @Import(name="action")
      private final @Nullable FirewallPolicyNatRuleActionResponse action;

    public Optional<FirewallPolicyNatRuleActionResponse> action() {
        return this.action == null ? Optional.empty() : Optional.ofNullable(this.action);
    }

    /**
     * The name of the rule.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Priority of the Firewall Policy Rule resource.
     * 
     */
    @Import(name="priority")
      private final @Nullable Integer priority;

    public Optional<Integer> priority() {
        return this.priority == null ? Optional.empty() : Optional.ofNullable(this.priority);
    }

    /**
     * The match conditions for incoming traffic.
     * 
     */
    @Import(name="ruleCondition")
      private final @Nullable Object ruleCondition;

    public Object ruleCondition() {
        return this.ruleCondition == null ? null : this.ruleCondition;
    }

    /**
     * The type of the rule.
     * Expected value is 'FirewallPolicyNatRule'.
     * 
     */
    @Import(name="ruleType", required=true)
      private final String ruleType;

    public String ruleType() {
        return this.ruleType;
    }

    /**
     * The translated address for this NAT rule.
     * 
     */
    @Import(name="translatedAddress")
      private final @Nullable String translatedAddress;

    public Optional<String> translatedAddress() {
        return this.translatedAddress == null ? Optional.empty() : Optional.ofNullable(this.translatedAddress);
    }

    /**
     * The translated port for this NAT rule.
     * 
     */
    @Import(name="translatedPort")
      private final @Nullable String translatedPort;

    public Optional<String> translatedPort() {
        return this.translatedPort == null ? Optional.empty() : Optional.ofNullable(this.translatedPort);
    }

    public FirewallPolicyNatRuleResponse(
        @Nullable FirewallPolicyNatRuleActionResponse action,
        @Nullable String name,
        @Nullable Integer priority,
        @Nullable Object ruleCondition,
        String ruleType,
        @Nullable String translatedAddress,
        @Nullable String translatedPort) {
        this.action = action;
        this.name = name;
        this.priority = priority;
        this.ruleCondition = ruleCondition;
        this.ruleType = Codegen.stringProp("ruleType").arg(ruleType).require();
        this.translatedAddress = translatedAddress;
        this.translatedPort = translatedPort;
    }

    private FirewallPolicyNatRuleResponse() {
        this.action = null;
        this.name = null;
        this.priority = null;
        this.ruleCondition = null;
        this.ruleType = null;
        this.translatedAddress = null;
        this.translatedPort = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyNatRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FirewallPolicyNatRuleActionResponse action;
        private @Nullable String name;
        private @Nullable Integer priority;
        private @Nullable Object ruleCondition;
        private String ruleType;
        private @Nullable String translatedAddress;
        private @Nullable String translatedPort;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyNatRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleCondition = defaults.ruleCondition;
    	      this.ruleType = defaults.ruleType;
    	      this.translatedAddress = defaults.translatedAddress;
    	      this.translatedPort = defaults.translatedPort;
        }

        public Builder action(@Nullable FirewallPolicyNatRuleActionResponse action) {
            this.action = action;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        public Builder ruleCondition(@Nullable Object ruleCondition) {
            this.ruleCondition = ruleCondition;
            return this;
        }
        public Builder ruleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }
        public Builder translatedAddress(@Nullable String translatedAddress) {
            this.translatedAddress = translatedAddress;
            return this;
        }
        public Builder translatedPort(@Nullable String translatedPort) {
            this.translatedPort = translatedPort;
            return this;
        }        public FirewallPolicyNatRuleResponse build() {
            return new FirewallPolicyNatRuleResponse(action, name, priority, ruleCondition, ruleType, translatedAddress, translatedPort);
        }
    }
}
