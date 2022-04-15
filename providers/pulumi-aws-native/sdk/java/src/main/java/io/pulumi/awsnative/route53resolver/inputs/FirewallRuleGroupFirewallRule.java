// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver.inputs;

import io.pulumi.awsnative.route53resolver.enums.FirewallRuleGroupFirewallRuleAction;
import io.pulumi.awsnative.route53resolver.enums.FirewallRuleGroupFirewallRuleBlockOverrideDnsType;
import io.pulumi.awsnative.route53resolver.enums.FirewallRuleGroupFirewallRuleBlockResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Firewall Rule associating the Rule Group to a Domain List
 * 
 */
public final class FirewallRuleGroupFirewallRule extends io.pulumi.resources.InvokeArgs {

    public static final FirewallRuleGroupFirewallRule Empty = new FirewallRuleGroupFirewallRule();

    /**
     * Rule Action
     * 
     */
    @Import(name="action", required=true)
      private final FirewallRuleGroupFirewallRuleAction action;

    public FirewallRuleGroupFirewallRuleAction action() {
        return this.action;
    }

    /**
     * BlockOverrideDnsType
     * 
     */
    @Import(name="blockOverrideDnsType")
      private final @Nullable FirewallRuleGroupFirewallRuleBlockOverrideDnsType blockOverrideDnsType;

    public Optional<FirewallRuleGroupFirewallRuleBlockOverrideDnsType> blockOverrideDnsType() {
        return this.blockOverrideDnsType == null ? Optional.empty() : Optional.ofNullable(this.blockOverrideDnsType);
    }

    /**
     * BlockOverrideDomain
     * 
     */
    @Import(name="blockOverrideDomain")
      private final @Nullable String blockOverrideDomain;

    public Optional<String> blockOverrideDomain() {
        return this.blockOverrideDomain == null ? Optional.empty() : Optional.ofNullable(this.blockOverrideDomain);
    }

    /**
     * BlockOverrideTtl
     * 
     */
    @Import(name="blockOverrideTtl")
      private final @Nullable Integer blockOverrideTtl;

    public Optional<Integer> blockOverrideTtl() {
        return this.blockOverrideTtl == null ? Optional.empty() : Optional.ofNullable(this.blockOverrideTtl);
    }

    /**
     * BlockResponse
     * 
     */
    @Import(name="blockResponse")
      private final @Nullable FirewallRuleGroupFirewallRuleBlockResponse blockResponse;

    public Optional<FirewallRuleGroupFirewallRuleBlockResponse> blockResponse() {
        return this.blockResponse == null ? Optional.empty() : Optional.ofNullable(this.blockResponse);
    }

    /**
     * ResourceId
     * 
     */
    @Import(name="firewallDomainListId", required=true)
      private final String firewallDomainListId;

    public String firewallDomainListId() {
        return this.firewallDomainListId;
    }

    /**
     * Rule Priority
     * 
     */
    @Import(name="priority", required=true)
      private final Integer priority;

    public Integer priority() {
        return this.priority;
    }

    public FirewallRuleGroupFirewallRule(
        FirewallRuleGroupFirewallRuleAction action,
        @Nullable FirewallRuleGroupFirewallRuleBlockOverrideDnsType blockOverrideDnsType,
        @Nullable String blockOverrideDomain,
        @Nullable Integer blockOverrideTtl,
        @Nullable FirewallRuleGroupFirewallRuleBlockResponse blockResponse,
        String firewallDomainListId,
        Integer priority) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.blockOverrideDnsType = blockOverrideDnsType;
        this.blockOverrideDomain = blockOverrideDomain;
        this.blockOverrideTtl = blockOverrideTtl;
        this.blockResponse = blockResponse;
        this.firewallDomainListId = Objects.requireNonNull(firewallDomainListId, "expected parameter 'firewallDomainListId' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
    }

    private FirewallRuleGroupFirewallRule() {
        this.action = null;
        this.blockOverrideDnsType = null;
        this.blockOverrideDomain = null;
        this.blockOverrideTtl = null;
        this.blockResponse = null;
        this.firewallDomainListId = null;
        this.priority = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallRuleGroupFirewallRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallRuleGroupFirewallRuleAction action;
        private @Nullable FirewallRuleGroupFirewallRuleBlockOverrideDnsType blockOverrideDnsType;
        private @Nullable String blockOverrideDomain;
        private @Nullable Integer blockOverrideTtl;
        private @Nullable FirewallRuleGroupFirewallRuleBlockResponse blockResponse;
        private String firewallDomainListId;
        private Integer priority;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallRuleGroupFirewallRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.blockOverrideDnsType = defaults.blockOverrideDnsType;
    	      this.blockOverrideDomain = defaults.blockOverrideDomain;
    	      this.blockOverrideTtl = defaults.blockOverrideTtl;
    	      this.blockResponse = defaults.blockResponse;
    	      this.firewallDomainListId = defaults.firewallDomainListId;
    	      this.priority = defaults.priority;
        }

        public Builder action(FirewallRuleGroupFirewallRuleAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder blockOverrideDnsType(@Nullable FirewallRuleGroupFirewallRuleBlockOverrideDnsType blockOverrideDnsType) {
            this.blockOverrideDnsType = blockOverrideDnsType;
            return this;
        }
        public Builder blockOverrideDomain(@Nullable String blockOverrideDomain) {
            this.blockOverrideDomain = blockOverrideDomain;
            return this;
        }
        public Builder blockOverrideTtl(@Nullable Integer blockOverrideTtl) {
            this.blockOverrideTtl = blockOverrideTtl;
            return this;
        }
        public Builder blockResponse(@Nullable FirewallRuleGroupFirewallRuleBlockResponse blockResponse) {
            this.blockResponse = blockResponse;
            return this;
        }
        public Builder firewallDomainListId(String firewallDomainListId) {
            this.firewallDomainListId = Objects.requireNonNull(firewallDomainListId);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }        public FirewallRuleGroupFirewallRule build() {
            return new FirewallRuleGroupFirewallRule(action, blockOverrideDnsType, blockOverrideDomain, blockOverrideTtl, blockResponse, firewallDomainListId, priority);
        }
    }
}
