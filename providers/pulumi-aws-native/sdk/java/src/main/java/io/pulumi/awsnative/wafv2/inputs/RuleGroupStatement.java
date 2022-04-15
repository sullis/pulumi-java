// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupAndStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupByteMatchStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupGeoMatchStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupIPSetReferenceStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupLabelMatchStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupNotStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupOrStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupRateBasedStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupRegexMatchStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupRegexPatternSetReferenceStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupSizeConstraintStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupSqliMatchStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupXssMatchStatement;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * First level statement that contains conditions, such as ByteMatch, SizeConstraint, etc
 * 
 */
public final class RuleGroupStatement extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupStatement Empty = new RuleGroupStatement();

    @Import(name="andStatement")
      private final @Nullable RuleGroupAndStatement andStatement;

    public Optional<RuleGroupAndStatement> andStatement() {
        return this.andStatement == null ? Optional.empty() : Optional.ofNullable(this.andStatement);
    }

    @Import(name="byteMatchStatement")
      private final @Nullable RuleGroupByteMatchStatement byteMatchStatement;

    public Optional<RuleGroupByteMatchStatement> byteMatchStatement() {
        return this.byteMatchStatement == null ? Optional.empty() : Optional.ofNullable(this.byteMatchStatement);
    }

    @Import(name="geoMatchStatement")
      private final @Nullable RuleGroupGeoMatchStatement geoMatchStatement;

    public Optional<RuleGroupGeoMatchStatement> geoMatchStatement() {
        return this.geoMatchStatement == null ? Optional.empty() : Optional.ofNullable(this.geoMatchStatement);
    }

    @Import(name="iPSetReferenceStatement")
      private final @Nullable RuleGroupIPSetReferenceStatement iPSetReferenceStatement;

    public Optional<RuleGroupIPSetReferenceStatement> iPSetReferenceStatement() {
        return this.iPSetReferenceStatement == null ? Optional.empty() : Optional.ofNullable(this.iPSetReferenceStatement);
    }

    @Import(name="labelMatchStatement")
      private final @Nullable RuleGroupLabelMatchStatement labelMatchStatement;

    public Optional<RuleGroupLabelMatchStatement> labelMatchStatement() {
        return this.labelMatchStatement == null ? Optional.empty() : Optional.ofNullable(this.labelMatchStatement);
    }

    @Import(name="notStatement")
      private final @Nullable RuleGroupNotStatement notStatement;

    public Optional<RuleGroupNotStatement> notStatement() {
        return this.notStatement == null ? Optional.empty() : Optional.ofNullable(this.notStatement);
    }

    @Import(name="orStatement")
      private final @Nullable RuleGroupOrStatement orStatement;

    public Optional<RuleGroupOrStatement> orStatement() {
        return this.orStatement == null ? Optional.empty() : Optional.ofNullable(this.orStatement);
    }

    @Import(name="rateBasedStatement")
      private final @Nullable RuleGroupRateBasedStatement rateBasedStatement;

    public Optional<RuleGroupRateBasedStatement> rateBasedStatement() {
        return this.rateBasedStatement == null ? Optional.empty() : Optional.ofNullable(this.rateBasedStatement);
    }

    @Import(name="regexMatchStatement")
      private final @Nullable RuleGroupRegexMatchStatement regexMatchStatement;

    public Optional<RuleGroupRegexMatchStatement> regexMatchStatement() {
        return this.regexMatchStatement == null ? Optional.empty() : Optional.ofNullable(this.regexMatchStatement);
    }

    @Import(name="regexPatternSetReferenceStatement")
      private final @Nullable RuleGroupRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;

    public Optional<RuleGroupRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Optional.empty() : Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }

    @Import(name="sizeConstraintStatement")
      private final @Nullable RuleGroupSizeConstraintStatement sizeConstraintStatement;

    public Optional<RuleGroupSizeConstraintStatement> sizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Optional.empty() : Optional.ofNullable(this.sizeConstraintStatement);
    }

    @Import(name="sqliMatchStatement")
      private final @Nullable RuleGroupSqliMatchStatement sqliMatchStatement;

    public Optional<RuleGroupSqliMatchStatement> sqliMatchStatement() {
        return this.sqliMatchStatement == null ? Optional.empty() : Optional.ofNullable(this.sqliMatchStatement);
    }

    @Import(name="xssMatchStatement")
      private final @Nullable RuleGroupXssMatchStatement xssMatchStatement;

    public Optional<RuleGroupXssMatchStatement> xssMatchStatement() {
        return this.xssMatchStatement == null ? Optional.empty() : Optional.ofNullable(this.xssMatchStatement);
    }

    public RuleGroupStatement(
        @Nullable RuleGroupAndStatement andStatement,
        @Nullable RuleGroupByteMatchStatement byteMatchStatement,
        @Nullable RuleGroupGeoMatchStatement geoMatchStatement,
        @Nullable RuleGroupIPSetReferenceStatement iPSetReferenceStatement,
        @Nullable RuleGroupLabelMatchStatement labelMatchStatement,
        @Nullable RuleGroupNotStatement notStatement,
        @Nullable RuleGroupOrStatement orStatement,
        @Nullable RuleGroupRateBasedStatement rateBasedStatement,
        @Nullable RuleGroupRegexMatchStatement regexMatchStatement,
        @Nullable RuleGroupRegexPatternSetReferenceStatement regexPatternSetReferenceStatement,
        @Nullable RuleGroupSizeConstraintStatement sizeConstraintStatement,
        @Nullable RuleGroupSqliMatchStatement sqliMatchStatement,
        @Nullable RuleGroupXssMatchStatement xssMatchStatement) {
        this.andStatement = andStatement;
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.iPSetReferenceStatement = iPSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.notStatement = notStatement;
        this.orStatement = orStatement;
        this.rateBasedStatement = rateBasedStatement;
        this.regexMatchStatement = regexMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    private RuleGroupStatement() {
        this.andStatement = null;
        this.byteMatchStatement = null;
        this.geoMatchStatement = null;
        this.iPSetReferenceStatement = null;
        this.labelMatchStatement = null;
        this.notStatement = null;
        this.orStatement = null;
        this.rateBasedStatement = null;
        this.regexMatchStatement = null;
        this.regexPatternSetReferenceStatement = null;
        this.sizeConstraintStatement = null;
        this.sqliMatchStatement = null;
        this.xssMatchStatement = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupAndStatement andStatement;
        private @Nullable RuleGroupByteMatchStatement byteMatchStatement;
        private @Nullable RuleGroupGeoMatchStatement geoMatchStatement;
        private @Nullable RuleGroupIPSetReferenceStatement iPSetReferenceStatement;
        private @Nullable RuleGroupLabelMatchStatement labelMatchStatement;
        private @Nullable RuleGroupNotStatement notStatement;
        private @Nullable RuleGroupOrStatement orStatement;
        private @Nullable RuleGroupRateBasedStatement rateBasedStatement;
        private @Nullable RuleGroupRegexMatchStatement regexMatchStatement;
        private @Nullable RuleGroupRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private @Nullable RuleGroupSizeConstraintStatement sizeConstraintStatement;
        private @Nullable RuleGroupSqliMatchStatement sqliMatchStatement;
        private @Nullable RuleGroupXssMatchStatement xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.andStatement = defaults.andStatement;
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.iPSetReferenceStatement = defaults.iPSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.notStatement = defaults.notStatement;
    	      this.orStatement = defaults.orStatement;
    	      this.rateBasedStatement = defaults.rateBasedStatement;
    	      this.regexMatchStatement = defaults.regexMatchStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        public Builder andStatement(@Nullable RuleGroupAndStatement andStatement) {
            this.andStatement = andStatement;
            return this;
        }
        public Builder byteMatchStatement(@Nullable RuleGroupByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }
        public Builder geoMatchStatement(@Nullable RuleGroupGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }
        public Builder iPSetReferenceStatement(@Nullable RuleGroupIPSetReferenceStatement iPSetReferenceStatement) {
            this.iPSetReferenceStatement = iPSetReferenceStatement;
            return this;
        }
        public Builder labelMatchStatement(@Nullable RuleGroupLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }
        public Builder notStatement(@Nullable RuleGroupNotStatement notStatement) {
            this.notStatement = notStatement;
            return this;
        }
        public Builder orStatement(@Nullable RuleGroupOrStatement orStatement) {
            this.orStatement = orStatement;
            return this;
        }
        public Builder rateBasedStatement(@Nullable RuleGroupRateBasedStatement rateBasedStatement) {
            this.rateBasedStatement = rateBasedStatement;
            return this;
        }
        public Builder regexMatchStatement(@Nullable RuleGroupRegexMatchStatement regexMatchStatement) {
            this.regexMatchStatement = regexMatchStatement;
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable RuleGroupRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable RuleGroupSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }
        public Builder sqliMatchStatement(@Nullable RuleGroupSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }
        public Builder xssMatchStatement(@Nullable RuleGroupXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }        public RuleGroupStatement build() {
            return new RuleGroupStatement(andStatement, byteMatchStatement, geoMatchStatement, iPSetReferenceStatement, labelMatchStatement, notStatement, orStatement, rateBasedStatement, regexMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
