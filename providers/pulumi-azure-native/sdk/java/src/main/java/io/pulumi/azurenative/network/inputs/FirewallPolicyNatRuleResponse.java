// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ApplicationRuleConditionResponse;
import io.pulumi.azurenative.network.inputs.FirewallPolicyNatRuleActionResponse;
import io.pulumi.azurenative.network.inputs.NatRuleConditionResponse;
import io.pulumi.azurenative.network.inputs.NetworkRuleConditionResponse;
import io.pulumi.core.internal.annotations.InputImport;
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
public final class FirewallPolicyNatRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyNatRuleResponse Empty = new FirewallPolicyNatRuleResponse();

    /**
     * The action type of a Nat rule.
     * 
     */
    @InputImport(name="action")
    private final @Nullable FirewallPolicyNatRuleActionResponse action;

    public Optional<FirewallPolicyNatRuleActionResponse> getAction() {
        return this.action == null ? Optional.empty() : Optional.ofNullable(this.action);
    }

    /**
     * The name of the rule.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Priority of the Firewall Policy Rule resource.
     * 
     */
    @InputImport(name="priority")
    private final @Nullable Integer priority;

    public Optional<Integer> getPriority() {
        return this.priority == null ? Optional.empty() : Optional.ofNullable(this.priority);
    }

    /**
     * The match conditions for incoming traffic.
     * 
     */
    @InputImport(name="ruleCondition")
    private final @Nullable Object ruleCondition;

    public Object getRuleCondition() {
        return this.ruleCondition == null ? null : this.ruleCondition;
    }

    /**
     * The type of the rule.
     * Expected value is 'FirewallPolicyNatRule'.
     * 
     */
    @InputImport(name="ruleType", required=true)
    private final String ruleType;

    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * The translated address for this NAT rule.
     * 
     */
    @InputImport(name="translatedAddress")
    private final @Nullable String translatedAddress;

    public Optional<String> getTranslatedAddress() {
        return this.translatedAddress == null ? Optional.empty() : Optional.ofNullable(this.translatedAddress);
    }

    /**
     * The translated port for this NAT rule.
     * 
     */
    @InputImport(name="translatedPort")
    private final @Nullable String translatedPort;

    public Optional<String> getTranslatedPort() {
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
        this.ruleType = Objects.requireNonNull(ruleType, "expected parameter 'ruleType' to be non-null");
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

        public Builder setAction(@Nullable FirewallPolicyNatRuleActionResponse action) {
            this.action = action;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setRuleCondition(@Nullable Object ruleCondition) {
            this.ruleCondition = ruleCondition;
            return this;
        }

        public Builder setRuleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }

        public Builder setTranslatedAddress(@Nullable String translatedAddress) {
            this.translatedAddress = translatedAddress;
            return this;
        }

        public Builder setTranslatedPort(@Nullable String translatedPort) {
            this.translatedPort = translatedPort;
            return this;
        }

        public FirewallPolicyNatRuleResponse build() {
            return new FirewallPolicyNatRuleResponse(action, name, priority, ruleCondition, ruleType, translatedAddress, translatedPort);
        }
    }
}
