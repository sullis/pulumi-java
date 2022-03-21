// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleStatementAndStatementStatementNotStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementAndStatementStatementNotStatementGetArgs Empty = new RuleGroupRuleStatementAndStatementStatementNotStatementGetArgs();

    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
      private final Output<List<RuleGroupRuleStatementAndStatementStatementNotStatementStatementGetArgs>> statements;

    public Output<List<RuleGroupRuleStatementAndStatementStatementNotStatementStatementGetArgs>> getStatements() {
        return this.statements;
    }

    public RuleGroupRuleStatementAndStatementStatementNotStatementGetArgs(Output<List<RuleGroupRuleStatementAndStatementStatementNotStatementStatementGetArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private RuleGroupRuleStatementAndStatementStatementNotStatementGetArgs() {
        this.statements = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementNotStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<RuleGroupRuleStatementAndStatementStatementNotStatementStatementGetArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementNotStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(Output<List<RuleGroupRuleStatementAndStatementStatementNotStatementStatementGetArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(List<RuleGroupRuleStatementAndStatementStatementNotStatementStatementGetArgs> statements) {
            this.statements = Output.of(Objects.requireNonNull(statements));
            return this;
        }
        public Builder statements(RuleGroupRuleStatementAndStatementStatementNotStatementStatementGetArgs... statements) {
            return statements(List.of(statements));
        }        public RuleGroupRuleStatementAndStatementStatementNotStatementGetArgs build() {
            return new RuleGroupRuleStatementAndStatementStatementNotStatementGetArgs(statements);
        }
    }
}
