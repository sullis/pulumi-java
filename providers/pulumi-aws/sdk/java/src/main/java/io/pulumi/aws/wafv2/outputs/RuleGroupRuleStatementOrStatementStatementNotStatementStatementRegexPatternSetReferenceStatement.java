// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement {
    /**
     * The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
     * 
     */
    private final String arn;
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch;
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private final List<RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations;

    @OutputCustomType.Constructor({"arn","fieldToMatch","textTransformations"})
    private RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement(
        String arn,
        @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch,
        List<RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations) {
        this.arn = Objects.requireNonNull(arn);
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations);
    }

    /**
     * The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch> getFieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
    */
    public List<RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch;
        private List<RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setFieldToMatch(@Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder setTextTransformations(List<RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement build() {
            return new RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement(arn, fieldToMatch, textTransformations);
        }
    }
}