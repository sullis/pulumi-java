// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementArgs Empty = new WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementArgs();

    /**
     * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
    private Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementArgs>> statements;

    /**
     * @return The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    public Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementArgs>> statements() {
        return this.statements;
    }

    private WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementArgs() {}

    private WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementArgs(WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementArgs();
        }

        public Builder(WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementArgs defaults) {
            $ = new WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param statements The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementArgs>> statements) {
            $.statements = statements;
            return this;
        }

        /**
         * @param statements The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(List<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementArgs> statements) {
            return statements(Output.of(statements));
        }

        /**
         * @param statements The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementArgs... statements) {
            return statements(List.of(statements));
        }

        public WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementArgs build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}
