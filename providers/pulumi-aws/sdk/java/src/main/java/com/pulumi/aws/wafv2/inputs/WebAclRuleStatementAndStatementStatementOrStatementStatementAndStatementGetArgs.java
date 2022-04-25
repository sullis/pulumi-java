// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs Empty = new WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs();

    /**
     * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
    private Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementGetArgs>> statements;

    /**
     * @return The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    public Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementGetArgs>> statements() {
        return this.statements;
    }

    private WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs() {}

    private WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs(WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs $;

        public Builder() {
            $ = new WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs();
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs defaults) {
            $ = new WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param statements The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementGetArgs>> statements) {
            $.statements = statements;
            return this;
        }

        /**
         * @param statements The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(List<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementGetArgs> statements) {
            return statements(Output.of(statements));
        }

        /**
         * @param statements The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementGetArgs... statements) {
            return statements(List.of(statements));
        }

        public WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}
