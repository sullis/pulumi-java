// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.enums.RuleGroupStatefulRuleAction;
import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupHeader;
import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupRuleOption;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class RuleGroupStatefulRule extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupStatefulRule Empty = new RuleGroupStatefulRule();

    @InputImport(name="action", required=true)
    private final RuleGroupStatefulRuleAction action;

    public RuleGroupStatefulRuleAction getAction() {
        return this.action;
    }

    @InputImport(name="header", required=true)
    private final RuleGroupHeader header;

    public RuleGroupHeader getHeader() {
        return this.header;
    }

    @InputImport(name="ruleOptions", required=true)
    private final List<RuleGroupRuleOption> ruleOptions;

    public List<RuleGroupRuleOption> getRuleOptions() {
        return this.ruleOptions;
    }

    public RuleGroupStatefulRule(
        RuleGroupStatefulRuleAction action,
        RuleGroupHeader header,
        List<RuleGroupRuleOption> ruleOptions) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.header = Objects.requireNonNull(header, "expected parameter 'header' to be non-null");
        this.ruleOptions = Objects.requireNonNull(ruleOptions, "expected parameter 'ruleOptions' to be non-null");
    }

    private RuleGroupStatefulRule() {
        this.action = null;
        this.header = null;
        this.ruleOptions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupStatefulRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupStatefulRuleAction action;
        private RuleGroupHeader header;
        private List<RuleGroupRuleOption> ruleOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupStatefulRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.header = defaults.header;
    	      this.ruleOptions = defaults.ruleOptions;
        }

        public Builder setAction(RuleGroupStatefulRuleAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setHeader(RuleGroupHeader header) {
            this.header = Objects.requireNonNull(header);
            return this;
        }

        public Builder setRuleOptions(List<RuleGroupRuleOption> ruleOptions) {
            this.ruleOptions = Objects.requireNonNull(ruleOptions);
            return this;
        }

        public RuleGroupStatefulRule build() {
            return new RuleGroupStatefulRule(action, header, ruleOptions);
        }
    }
}
