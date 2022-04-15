// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLAndStatement;
import io.pulumi.awsnative.wafv2.inputs.WebACLByteMatchStatement;
import io.pulumi.awsnative.wafv2.inputs.WebACLGeoMatchStatement;
import io.pulumi.awsnative.wafv2.inputs.WebACLIPSetReferenceStatement;
import io.pulumi.awsnative.wafv2.inputs.WebACLLabelMatchStatement;
import io.pulumi.awsnative.wafv2.inputs.WebACLManagedRuleGroupStatement;
import io.pulumi.awsnative.wafv2.inputs.WebACLNotStatement;
import io.pulumi.awsnative.wafv2.inputs.WebACLOrStatement;
import io.pulumi.awsnative.wafv2.inputs.WebACLRateBasedStatement;
import io.pulumi.awsnative.wafv2.inputs.WebACLRegexMatchStatement;
import io.pulumi.awsnative.wafv2.inputs.WebACLRegexPatternSetReferenceStatement;
import io.pulumi.awsnative.wafv2.inputs.WebACLRuleGroupReferenceStatement;
import io.pulumi.awsnative.wafv2.inputs.WebACLSizeConstraintStatement;
import io.pulumi.awsnative.wafv2.inputs.WebACLSqliMatchStatement;
import io.pulumi.awsnative.wafv2.inputs.WebACLXssMatchStatement;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * First level statement that contains conditions, such as ByteMatch, SizeConstraint, etc
 * 
 */
public final class WebACLStatement extends io.pulumi.resources.InvokeArgs {

    public static final WebACLStatement Empty = new WebACLStatement();

    @Import(name="andStatement")
      private final @Nullable WebACLAndStatement andStatement;

    public Optional<WebACLAndStatement> andStatement() {
        return this.andStatement == null ? Optional.empty() : Optional.ofNullable(this.andStatement);
    }

    @Import(name="byteMatchStatement")
      private final @Nullable WebACLByteMatchStatement byteMatchStatement;

    public Optional<WebACLByteMatchStatement> byteMatchStatement() {
        return this.byteMatchStatement == null ? Optional.empty() : Optional.ofNullable(this.byteMatchStatement);
    }

    @Import(name="geoMatchStatement")
      private final @Nullable WebACLGeoMatchStatement geoMatchStatement;

    public Optional<WebACLGeoMatchStatement> geoMatchStatement() {
        return this.geoMatchStatement == null ? Optional.empty() : Optional.ofNullable(this.geoMatchStatement);
    }

    @Import(name="iPSetReferenceStatement")
      private final @Nullable WebACLIPSetReferenceStatement iPSetReferenceStatement;

    public Optional<WebACLIPSetReferenceStatement> iPSetReferenceStatement() {
        return this.iPSetReferenceStatement == null ? Optional.empty() : Optional.ofNullable(this.iPSetReferenceStatement);
    }

    @Import(name="labelMatchStatement")
      private final @Nullable WebACLLabelMatchStatement labelMatchStatement;

    public Optional<WebACLLabelMatchStatement> labelMatchStatement() {
        return this.labelMatchStatement == null ? Optional.empty() : Optional.ofNullable(this.labelMatchStatement);
    }

    @Import(name="managedRuleGroupStatement")
      private final @Nullable WebACLManagedRuleGroupStatement managedRuleGroupStatement;

    public Optional<WebACLManagedRuleGroupStatement> managedRuleGroupStatement() {
        return this.managedRuleGroupStatement == null ? Optional.empty() : Optional.ofNullable(this.managedRuleGroupStatement);
    }

    @Import(name="notStatement")
      private final @Nullable WebACLNotStatement notStatement;

    public Optional<WebACLNotStatement> notStatement() {
        return this.notStatement == null ? Optional.empty() : Optional.ofNullable(this.notStatement);
    }

    @Import(name="orStatement")
      private final @Nullable WebACLOrStatement orStatement;

    public Optional<WebACLOrStatement> orStatement() {
        return this.orStatement == null ? Optional.empty() : Optional.ofNullable(this.orStatement);
    }

    @Import(name="rateBasedStatement")
      private final @Nullable WebACLRateBasedStatement rateBasedStatement;

    public Optional<WebACLRateBasedStatement> rateBasedStatement() {
        return this.rateBasedStatement == null ? Optional.empty() : Optional.ofNullable(this.rateBasedStatement);
    }

    @Import(name="regexMatchStatement")
      private final @Nullable WebACLRegexMatchStatement regexMatchStatement;

    public Optional<WebACLRegexMatchStatement> regexMatchStatement() {
        return this.regexMatchStatement == null ? Optional.empty() : Optional.ofNullable(this.regexMatchStatement);
    }

    @Import(name="regexPatternSetReferenceStatement")
      private final @Nullable WebACLRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;

    public Optional<WebACLRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Optional.empty() : Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }

    @Import(name="ruleGroupReferenceStatement")
      private final @Nullable WebACLRuleGroupReferenceStatement ruleGroupReferenceStatement;

    public Optional<WebACLRuleGroupReferenceStatement> ruleGroupReferenceStatement() {
        return this.ruleGroupReferenceStatement == null ? Optional.empty() : Optional.ofNullable(this.ruleGroupReferenceStatement);
    }

    @Import(name="sizeConstraintStatement")
      private final @Nullable WebACLSizeConstraintStatement sizeConstraintStatement;

    public Optional<WebACLSizeConstraintStatement> sizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Optional.empty() : Optional.ofNullable(this.sizeConstraintStatement);
    }

    @Import(name="sqliMatchStatement")
      private final @Nullable WebACLSqliMatchStatement sqliMatchStatement;

    public Optional<WebACLSqliMatchStatement> sqliMatchStatement() {
        return this.sqliMatchStatement == null ? Optional.empty() : Optional.ofNullable(this.sqliMatchStatement);
    }

    @Import(name="xssMatchStatement")
      private final @Nullable WebACLXssMatchStatement xssMatchStatement;

    public Optional<WebACLXssMatchStatement> xssMatchStatement() {
        return this.xssMatchStatement == null ? Optional.empty() : Optional.ofNullable(this.xssMatchStatement);
    }

    public WebACLStatement(
        @Nullable WebACLAndStatement andStatement,
        @Nullable WebACLByteMatchStatement byteMatchStatement,
        @Nullable WebACLGeoMatchStatement geoMatchStatement,
        @Nullable WebACLIPSetReferenceStatement iPSetReferenceStatement,
        @Nullable WebACLLabelMatchStatement labelMatchStatement,
        @Nullable WebACLManagedRuleGroupStatement managedRuleGroupStatement,
        @Nullable WebACLNotStatement notStatement,
        @Nullable WebACLOrStatement orStatement,
        @Nullable WebACLRateBasedStatement rateBasedStatement,
        @Nullable WebACLRegexMatchStatement regexMatchStatement,
        @Nullable WebACLRegexPatternSetReferenceStatement regexPatternSetReferenceStatement,
        @Nullable WebACLRuleGroupReferenceStatement ruleGroupReferenceStatement,
        @Nullable WebACLSizeConstraintStatement sizeConstraintStatement,
        @Nullable WebACLSqliMatchStatement sqliMatchStatement,
        @Nullable WebACLXssMatchStatement xssMatchStatement) {
        this.andStatement = andStatement;
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.iPSetReferenceStatement = iPSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.managedRuleGroupStatement = managedRuleGroupStatement;
        this.notStatement = notStatement;
        this.orStatement = orStatement;
        this.rateBasedStatement = rateBasedStatement;
        this.regexMatchStatement = regexMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.ruleGroupReferenceStatement = ruleGroupReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    private WebACLStatement() {
        this.andStatement = null;
        this.byteMatchStatement = null;
        this.geoMatchStatement = null;
        this.iPSetReferenceStatement = null;
        this.labelMatchStatement = null;
        this.managedRuleGroupStatement = null;
        this.notStatement = null;
        this.orStatement = null;
        this.rateBasedStatement = null;
        this.regexMatchStatement = null;
        this.regexPatternSetReferenceStatement = null;
        this.ruleGroupReferenceStatement = null;
        this.sizeConstraintStatement = null;
        this.sqliMatchStatement = null;
        this.xssMatchStatement = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebACLAndStatement andStatement;
        private @Nullable WebACLByteMatchStatement byteMatchStatement;
        private @Nullable WebACLGeoMatchStatement geoMatchStatement;
        private @Nullable WebACLIPSetReferenceStatement iPSetReferenceStatement;
        private @Nullable WebACLLabelMatchStatement labelMatchStatement;
        private @Nullable WebACLManagedRuleGroupStatement managedRuleGroupStatement;
        private @Nullable WebACLNotStatement notStatement;
        private @Nullable WebACLOrStatement orStatement;
        private @Nullable WebACLRateBasedStatement rateBasedStatement;
        private @Nullable WebACLRegexMatchStatement regexMatchStatement;
        private @Nullable WebACLRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private @Nullable WebACLRuleGroupReferenceStatement ruleGroupReferenceStatement;
        private @Nullable WebACLSizeConstraintStatement sizeConstraintStatement;
        private @Nullable WebACLSqliMatchStatement sqliMatchStatement;
        private @Nullable WebACLXssMatchStatement xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.andStatement = defaults.andStatement;
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.iPSetReferenceStatement = defaults.iPSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.managedRuleGroupStatement = defaults.managedRuleGroupStatement;
    	      this.notStatement = defaults.notStatement;
    	      this.orStatement = defaults.orStatement;
    	      this.rateBasedStatement = defaults.rateBasedStatement;
    	      this.regexMatchStatement = defaults.regexMatchStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.ruleGroupReferenceStatement = defaults.ruleGroupReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        public Builder andStatement(@Nullable WebACLAndStatement andStatement) {
            this.andStatement = andStatement;
            return this;
        }
        public Builder byteMatchStatement(@Nullable WebACLByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }
        public Builder geoMatchStatement(@Nullable WebACLGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }
        public Builder iPSetReferenceStatement(@Nullable WebACLIPSetReferenceStatement iPSetReferenceStatement) {
            this.iPSetReferenceStatement = iPSetReferenceStatement;
            return this;
        }
        public Builder labelMatchStatement(@Nullable WebACLLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }
        public Builder managedRuleGroupStatement(@Nullable WebACLManagedRuleGroupStatement managedRuleGroupStatement) {
            this.managedRuleGroupStatement = managedRuleGroupStatement;
            return this;
        }
        public Builder notStatement(@Nullable WebACLNotStatement notStatement) {
            this.notStatement = notStatement;
            return this;
        }
        public Builder orStatement(@Nullable WebACLOrStatement orStatement) {
            this.orStatement = orStatement;
            return this;
        }
        public Builder rateBasedStatement(@Nullable WebACLRateBasedStatement rateBasedStatement) {
            this.rateBasedStatement = rateBasedStatement;
            return this;
        }
        public Builder regexMatchStatement(@Nullable WebACLRegexMatchStatement regexMatchStatement) {
            this.regexMatchStatement = regexMatchStatement;
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable WebACLRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }
        public Builder ruleGroupReferenceStatement(@Nullable WebACLRuleGroupReferenceStatement ruleGroupReferenceStatement) {
            this.ruleGroupReferenceStatement = ruleGroupReferenceStatement;
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable WebACLSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }
        public Builder sqliMatchStatement(@Nullable WebACLSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }
        public Builder xssMatchStatement(@Nullable WebACLXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }        public WebACLStatement build() {
            return new WebACLStatement(andStatement, byteMatchStatement, geoMatchStatement, iPSetReferenceStatement, labelMatchStatement, managedRuleGroupStatement, notStatement, orStatement, rateBasedStatement, regexMatchStatement, regexPatternSetReferenceStatement, ruleGroupReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
