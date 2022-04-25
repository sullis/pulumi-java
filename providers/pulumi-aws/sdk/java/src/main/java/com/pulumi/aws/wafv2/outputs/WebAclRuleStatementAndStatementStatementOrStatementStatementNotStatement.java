// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatement {
    /**
     * @return The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    private final List<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatement> statements;

    @CustomType.Constructor
    private WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatement(@CustomType.Parameter("statements") List<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatement> statements) {
        this.statements = statements;
    }

    /**
     * @return The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    public List<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatement> statements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(List<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatement... statements) {
            return statements(List.of(statements));
        }        public WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatement build() {
            return new WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatement(statements);
        }
    }
}
