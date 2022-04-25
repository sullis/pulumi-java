// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatement {
    /**
     * @return The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    private final List<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatement> statements;

    @CustomType.Constructor
    private WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatement(@CustomType.Parameter("statements") List<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatement> statements) {
        this.statements = statements;
    }

    /**
     * @return The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    public List<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatement> statements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(List<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatement... statements) {
            return statements(List.of(statements));
        }        public WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatement build() {
            return new WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatement(statements);
        }
    }
}
