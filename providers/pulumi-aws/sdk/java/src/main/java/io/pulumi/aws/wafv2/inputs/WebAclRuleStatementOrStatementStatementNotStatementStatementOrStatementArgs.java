// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementArgs Empty = new WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementArgs();

    /**
     * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
      private final Output<List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementArgs>> statements;

    public Output<List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementArgs>> statements() {
        return this.statements;
    }

    public WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementArgs(Output<List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementArgs() {
        this.statements = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(Output<List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementArgs> statements) {
            this.statements = Output.of(Objects.requireNonNull(statements));
            return this;
        }
        public Builder statements(WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementArgs... statements) {
            return statements(List.of(statements));
        }        public WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementArgs build() {
            return new WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementArgs(statements);
        }
    }
}
