// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementGetArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementGetArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Output.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
      private final Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations;

    public Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementGetArgs(
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch,
        Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementGetArgs() {
        this.fieldToMatch = Output.empty();
        this.textTransformations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch;
        private Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder fieldToMatch(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs fieldToMatch) {
            this.fieldToMatch = Output.ofNullable(fieldToMatch);
            return this;
        }
        public Builder textTransformations(Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementGetArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementXssMatchStatementGetArgs(fieldToMatch, textTransformations);
        }
    }
}
