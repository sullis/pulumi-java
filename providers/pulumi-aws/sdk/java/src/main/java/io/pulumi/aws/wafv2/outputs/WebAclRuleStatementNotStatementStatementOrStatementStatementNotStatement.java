// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatement;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement {
    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    private final List<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatement> statements;

    @CustomType.Constructor
    private WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement(@CustomType.Parameter("statements") List<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatement> statements) {
        this.statements = statements;
    }

    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
    */
    public List<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatement> statements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(List<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatementStatement... statements) {
            return statements(List.of(statements));
        }        public WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement build() {
            return new WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement(statements);
        }
    }
}
