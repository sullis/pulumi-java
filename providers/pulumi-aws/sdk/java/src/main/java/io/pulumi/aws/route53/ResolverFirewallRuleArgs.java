// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverFirewallRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverFirewallRuleArgs Empty = new ResolverFirewallRuleArgs();

    /**
     * The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain list. Valid values: `ALLOW`, `BLOCK`, `ALERT`.
     * 
     */
    @Import(name="action", required=true)
      private final Output<String> action;

    public Output<String> action() {
        return this.action;
    }

    /**
     * The DNS record's type. This determines the format of the record value that you provided in BlockOverrideDomain. Value values: `CNAME`.
     * 
     */
    @Import(name="blockOverrideDnsType")
      private final @Nullable Output<String> blockOverrideDnsType;

    public Output<String> blockOverrideDnsType() {
        return this.blockOverrideDnsType == null ? Codegen.empty() : this.blockOverrideDnsType;
    }

    /**
     * The custom DNS record to send back in response to the query.
     * 
     */
    @Import(name="blockOverrideDomain")
      private final @Nullable Output<String> blockOverrideDomain;

    public Output<String> blockOverrideDomain() {
        return this.blockOverrideDomain == null ? Codegen.empty() : this.blockOverrideDomain;
    }

    /**
     * The recommended amount of time, in seconds, for the DNS resolver or web browser to cache the provided override record. Minimum value of 0. Maximum value of 604800.
     * 
     */
    @Import(name="blockOverrideTtl")
      private final @Nullable Output<Integer> blockOverrideTtl;

    public Output<Integer> blockOverrideTtl() {
        return this.blockOverrideTtl == null ? Codegen.empty() : this.blockOverrideTtl;
    }

    /**
     * The way that you want DNS Firewall to block the request. Valid values: `NODATA`, `NXDOMAIN`, `OVERRIDE`.
     * 
     */
    @Import(name="blockResponse")
      private final @Nullable Output<String> blockResponse;

    public Output<String> blockResponse() {
        return this.blockResponse == null ? Codegen.empty() : this.blockResponse;
    }

    /**
     * The ID of the domain list that you want to use in the rule.
     * 
     */
    @Import(name="firewallDomainListId", required=true)
      private final Output<String> firewallDomainListId;

    public Output<String> firewallDomainListId() {
        return this.firewallDomainListId;
    }

    /**
     * The unique identifier of the firewall rule group where you want to create the rule.
     * 
     */
    @Import(name="firewallRuleGroupId", required=true)
      private final Output<String> firewallRuleGroupId;

    public Output<String> firewallRuleGroupId() {
        return this.firewallRuleGroupId;
    }

    /**
     * A name that lets you identify the rule, to manage and use it.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The setting that determines the processing order of the rule in the rule group. DNS Firewall processes the rules in a rule group by order of priority, starting from the lowest setting.
     * 
     */
    @Import(name="priority", required=true)
      private final Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority;
    }

    public ResolverFirewallRuleArgs(
        Output<String> action,
        @Nullable Output<String> blockOverrideDnsType,
        @Nullable Output<String> blockOverrideDomain,
        @Nullable Output<Integer> blockOverrideTtl,
        @Nullable Output<String> blockResponse,
        Output<String> firewallDomainListId,
        Output<String> firewallRuleGroupId,
        @Nullable Output<String> name,
        Output<Integer> priority) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.blockOverrideDnsType = blockOverrideDnsType;
        this.blockOverrideDomain = blockOverrideDomain;
        this.blockOverrideTtl = blockOverrideTtl;
        this.blockResponse = blockResponse;
        this.firewallDomainListId = Objects.requireNonNull(firewallDomainListId, "expected parameter 'firewallDomainListId' to be non-null");
        this.firewallRuleGroupId = Objects.requireNonNull(firewallRuleGroupId, "expected parameter 'firewallRuleGroupId' to be non-null");
        this.name = name;
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
    }

    private ResolverFirewallRuleArgs() {
        this.action = Codegen.empty();
        this.blockOverrideDnsType = Codegen.empty();
        this.blockOverrideDomain = Codegen.empty();
        this.blockOverrideTtl = Codegen.empty();
        this.blockResponse = Codegen.empty();
        this.firewallDomainListId = Codegen.empty();
        this.firewallRuleGroupId = Codegen.empty();
        this.name = Codegen.empty();
        this.priority = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverFirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> action;
        private @Nullable Output<String> blockOverrideDnsType;
        private @Nullable Output<String> blockOverrideDomain;
        private @Nullable Output<Integer> blockOverrideTtl;
        private @Nullable Output<String> blockResponse;
        private Output<String> firewallDomainListId;
        private Output<String> firewallRuleGroupId;
        private @Nullable Output<String> name;
        private Output<Integer> priority;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverFirewallRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.blockOverrideDnsType = defaults.blockOverrideDnsType;
    	      this.blockOverrideDomain = defaults.blockOverrideDomain;
    	      this.blockOverrideTtl = defaults.blockOverrideTtl;
    	      this.blockResponse = defaults.blockResponse;
    	      this.firewallDomainListId = defaults.firewallDomainListId;
    	      this.firewallRuleGroupId = defaults.firewallRuleGroupId;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
        }

        public Builder action(Output<String> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(String action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder blockOverrideDnsType(@Nullable Output<String> blockOverrideDnsType) {
            this.blockOverrideDnsType = blockOverrideDnsType;
            return this;
        }
        public Builder blockOverrideDnsType(@Nullable String blockOverrideDnsType) {
            this.blockOverrideDnsType = Codegen.ofNullable(blockOverrideDnsType);
            return this;
        }
        public Builder blockOverrideDomain(@Nullable Output<String> blockOverrideDomain) {
            this.blockOverrideDomain = blockOverrideDomain;
            return this;
        }
        public Builder blockOverrideDomain(@Nullable String blockOverrideDomain) {
            this.blockOverrideDomain = Codegen.ofNullable(blockOverrideDomain);
            return this;
        }
        public Builder blockOverrideTtl(@Nullable Output<Integer> blockOverrideTtl) {
            this.blockOverrideTtl = blockOverrideTtl;
            return this;
        }
        public Builder blockOverrideTtl(@Nullable Integer blockOverrideTtl) {
            this.blockOverrideTtl = Codegen.ofNullable(blockOverrideTtl);
            return this;
        }
        public Builder blockResponse(@Nullable Output<String> blockResponse) {
            this.blockResponse = blockResponse;
            return this;
        }
        public Builder blockResponse(@Nullable String blockResponse) {
            this.blockResponse = Codegen.ofNullable(blockResponse);
            return this;
        }
        public Builder firewallDomainListId(Output<String> firewallDomainListId) {
            this.firewallDomainListId = Objects.requireNonNull(firewallDomainListId);
            return this;
        }
        public Builder firewallDomainListId(String firewallDomainListId) {
            this.firewallDomainListId = Output.of(Objects.requireNonNull(firewallDomainListId));
            return this;
        }
        public Builder firewallRuleGroupId(Output<String> firewallRuleGroupId) {
            this.firewallRuleGroupId = Objects.requireNonNull(firewallRuleGroupId);
            return this;
        }
        public Builder firewallRuleGroupId(String firewallRuleGroupId) {
            this.firewallRuleGroupId = Output.of(Objects.requireNonNull(firewallRuleGroupId));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder priority(Output<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Output.of(Objects.requireNonNull(priority));
            return this;
        }        public ResolverFirewallRuleArgs build() {
            return new ResolverFirewallRuleArgs(action, blockOverrideDnsType, blockOverrideDomain, blockOverrideTtl, blockResponse, firewallDomainListId, firewallRuleGroupId, name, priority);
        }
    }
}
