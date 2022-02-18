// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.enums.RuleGroupSizeConstraintStatementComparisonOperator;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupFieldToMatch;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupTextTransformation;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupSizeConstraintStatement {
    private final RuleGroupSizeConstraintStatementComparisonOperator comparisonOperator;
    private final RuleGroupFieldToMatch fieldToMatch;
    private final Double size;
    private final List<RuleGroupTextTransformation> textTransformations;

    @OutputCustomType.Constructor({"comparisonOperator","fieldToMatch","size","textTransformations"})
    private RuleGroupSizeConstraintStatement(
        RuleGroupSizeConstraintStatementComparisonOperator comparisonOperator,
        RuleGroupFieldToMatch fieldToMatch,
        Double size,
        List<RuleGroupTextTransformation> textTransformations) {
        this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
        this.size = Objects.requireNonNull(size);
        this.textTransformations = Objects.requireNonNull(textTransformations);
    }

    public RuleGroupSizeConstraintStatementComparisonOperator getComparisonOperator() {
        return this.comparisonOperator;
    }
    public RuleGroupFieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }
    public Double getSize() {
        return this.size;
    }
    public List<RuleGroupTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupSizeConstraintStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupSizeConstraintStatementComparisonOperator comparisonOperator;
        private RuleGroupFieldToMatch fieldToMatch;
        private Double size;
        private List<RuleGroupTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupSizeConstraintStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.size = defaults.size;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setComparisonOperator(RuleGroupSizeConstraintStatementComparisonOperator comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }

        public Builder setFieldToMatch(RuleGroupFieldToMatch fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder setSize(Double size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder setTextTransformations(List<RuleGroupTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public RuleGroupSizeConstraintStatement build() {
            return new RuleGroupSizeConstraintStatement(comparisonOperator, fieldToMatch, size, textTransformations);
        }
    }
}
