// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementGetArgs Empty = new WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementGetArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
    private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch;

    /**
     * @return The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs>> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
    private Output<List<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations;

    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    public Output<List<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations() {
        return this.textTransformations;
    }

    private WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementGetArgs() {}

    private WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementGetArgs(WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementGetArgs $) {
        this.fieldToMatch = $.fieldToMatch;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementGetArgs $;

        public Builder() {
            $ = new WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementGetArgs();
        }

        public Builder(WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementGetArgs defaults) {
            $ = new WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
         * 
         * @return builder
         * 
         */
        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        /**
         * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
         * 
         * @return builder
         * 
         */
        public Builder fieldToMatch(WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(Output<List<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(List<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformationGetArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformationGetArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementXssMatchStatementGetArgs build() {
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}
