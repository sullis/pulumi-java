// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleStatementAndStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementAndStatementGetArgs Empty = new RuleGroupRuleStatementAndStatementGetArgs();

    /**
     * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
    private Output<List<RuleGroupRuleStatementAndStatementStatementGetArgs>> statements;

    /**
     * @return The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    public Output<List<RuleGroupRuleStatementAndStatementStatementGetArgs>> statements() {
        return this.statements;
    }

    private RuleGroupRuleStatementAndStatementGetArgs() {}

    private RuleGroupRuleStatementAndStatementGetArgs(RuleGroupRuleStatementAndStatementGetArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleStatementAndStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleStatementAndStatementGetArgs $;

        public Builder() {
            $ = new RuleGroupRuleStatementAndStatementGetArgs();
        }

        public Builder(RuleGroupRuleStatementAndStatementGetArgs defaults) {
            $ = new RuleGroupRuleStatementAndStatementGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param statements The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(Output<List<RuleGroupRuleStatementAndStatementStatementGetArgs>> statements) {
            $.statements = statements;
            return this;
        }

        /**
         * @param statements The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(List<RuleGroupRuleStatementAndStatementStatementGetArgs> statements) {
            return statements(Output.of(statements));
        }

        /**
         * @param statements The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(RuleGroupRuleStatementAndStatementStatementGetArgs... statements) {
            return statements(List.of(statements));
        }

        public RuleGroupRuleStatementAndStatementGetArgs build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}
