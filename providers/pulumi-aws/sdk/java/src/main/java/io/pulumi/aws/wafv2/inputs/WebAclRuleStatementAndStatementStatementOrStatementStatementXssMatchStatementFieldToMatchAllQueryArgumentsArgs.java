// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs Empty = new WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs();

    public WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs build() {
            return new WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs();
        }
    }
}