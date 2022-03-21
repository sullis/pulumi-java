// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupFieldToMatch;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupTextTransformation;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


/**
 * Sqli Match Statement.
 * 
 */
public final class RuleGroupSqliMatchStatement extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupSqliMatchStatement Empty = new RuleGroupSqliMatchStatement();

    @Import(name="fieldToMatch", required=true)
      private final RuleGroupFieldToMatch fieldToMatch;

    public RuleGroupFieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }

    @Import(name="textTransformations", required=true)
      private final List<RuleGroupTextTransformation> textTransformations;

    public List<RuleGroupTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public RuleGroupSqliMatchStatement(
        RuleGroupFieldToMatch fieldToMatch,
        List<RuleGroupTextTransformation> textTransformations) {
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private RuleGroupSqliMatchStatement() {
        this.fieldToMatch = null;
        this.textTransformations = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupSqliMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupFieldToMatch fieldToMatch;
        private List<RuleGroupTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupSqliMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(RuleGroupFieldToMatch fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }
        public Builder textTransformations(List<RuleGroupTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(RuleGroupTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public RuleGroupSqliMatchStatement build() {
            return new RuleGroupSqliMatchStatement(fieldToMatch, textTransformations);
        }
    }
}
