// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementTextTransformation;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatement {
    /**
     * @return The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch fieldToMatch;
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private final List<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementTextTransformation> textTransformations;

    @CustomType.Constructor
    private WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatement(
        @CustomType.Parameter("fieldToMatch") @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch fieldToMatch,
        @CustomType.Parameter("textTransformations") List<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementTextTransformation> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = textTransformations;
    }

    /**
     * @return The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    public Optional<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    public List<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementTextTransformation> textTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch fieldToMatch;
        private List<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder textTransformations(List<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatement build() {
            return new WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatement(fieldToMatch, textTransformations);
        }
    }
}
