// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs Empty = new WebAclRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs();

    public WebAclRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs build() {
            return new WebAclRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs();
        }
    }
}