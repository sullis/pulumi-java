// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementGetArgs Empty = new WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementGetArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch() {
        return this.fieldToMatch == null ? Codegen.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
      private final Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations;

    public Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementGetArgs(
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch,
        Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementGetArgs() {
        this.fieldToMatch = Codegen.empty();
        this.textTransformations = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch;
        private Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder fieldToMatch(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs fieldToMatch) {
            this.fieldToMatch = Codegen.ofNullable(fieldToMatch);
            return this;
        }
        public Builder textTransformations(Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(List<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformationGetArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformationGetArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementGetArgs build() {
            return new WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementGetArgs(fieldToMatch, textTransformations);
        }
    }
}
