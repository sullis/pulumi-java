// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs Empty = new WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @InputImport(name="fieldToMatch")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs> fieldToMatch;

    public Input<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Input.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @InputImport(name="textTransformations", required=true)
      private final Input<List<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs>> textTransformations;

    public Input<List<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs(
        @Nullable Input<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs> fieldToMatch,
        Input<List<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs() {
        this.fieldToMatch = Input.empty();
        this.textTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs> fieldToMatch;
        private Input<List<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setFieldToMatch(@Nullable Input<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder setFieldToMatch(@Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs fieldToMatch) {
            this.fieldToMatch = Input.ofNullable(fieldToMatch);
            return this;
        }

        public Builder setTextTransformations(Input<List<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder setTextTransformations(List<WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs> textTransformations) {
            this.textTransformations = Input.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs build() {
            return new WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs(fieldToMatch, textTransformations);
        }
    }
}