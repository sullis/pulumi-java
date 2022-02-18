// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver;

import io.pulumi.awsnative.route53resolver.inputs.FirewallRuleGroupFirewallRuleArgs;
import io.pulumi.awsnative.route53resolver.inputs.FirewallRuleGroupTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallRuleGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallRuleGroupArgs Empty = new FirewallRuleGroupArgs();

    /**
     * FirewallRules
     * 
     */
    @InputImport(name="firewallRules")
    private final @Nullable Input<List<FirewallRuleGroupFirewallRuleArgs>> firewallRules;

    public Input<List<FirewallRuleGroupFirewallRuleArgs>> getFirewallRules() {
        return this.firewallRules == null ? Input.empty() : this.firewallRules;
    }

    /**
     * FirewallRuleGroupName
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Tags
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<FirewallRuleGroupTagArgs>> tags;

    public Input<List<FirewallRuleGroupTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public FirewallRuleGroupArgs(
        @Nullable Input<List<FirewallRuleGroupFirewallRuleArgs>> firewallRules,
        @Nullable Input<String> name,
        @Nullable Input<List<FirewallRuleGroupTagArgs>> tags) {
        this.firewallRules = firewallRules;
        this.name = name;
        this.tags = tags;
    }

    private FirewallRuleGroupArgs() {
        this.firewallRules = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallRuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<FirewallRuleGroupFirewallRuleArgs>> firewallRules;
        private @Nullable Input<String> name;
        private @Nullable Input<List<FirewallRuleGroupTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallRuleGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewallRules = defaults.firewallRules;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setFirewallRules(@Nullable Input<List<FirewallRuleGroupFirewallRuleArgs>> firewallRules) {
            this.firewallRules = firewallRules;
            return this;
        }

        public Builder setFirewallRules(@Nullable List<FirewallRuleGroupFirewallRuleArgs> firewallRules) {
            this.firewallRules = Input.ofNullable(firewallRules);
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

        public Builder setTags(@Nullable Input<List<FirewallRuleGroupTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<FirewallRuleGroupTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public FirewallRuleGroupArgs build() {
            return new FirewallRuleGroupArgs(firewallRules, name, tags);
        }
    }
}
