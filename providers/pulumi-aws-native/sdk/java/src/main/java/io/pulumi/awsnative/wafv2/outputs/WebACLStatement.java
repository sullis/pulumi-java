// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.WebACLAndStatement;
import io.pulumi.awsnative.wafv2.outputs.WebACLByteMatchStatement;
import io.pulumi.awsnative.wafv2.outputs.WebACLGeoMatchStatement;
import io.pulumi.awsnative.wafv2.outputs.WebACLIPSetReferenceStatement;
import io.pulumi.awsnative.wafv2.outputs.WebACLLabelMatchStatement;
import io.pulumi.awsnative.wafv2.outputs.WebACLManagedRuleGroupStatement;
import io.pulumi.awsnative.wafv2.outputs.WebACLNotStatement;
import io.pulumi.awsnative.wafv2.outputs.WebACLOrStatement;
import io.pulumi.awsnative.wafv2.outputs.WebACLRateBasedStatement;
import io.pulumi.awsnative.wafv2.outputs.WebACLRegexMatchStatement;
import io.pulumi.awsnative.wafv2.outputs.WebACLRegexPatternSetReferenceStatement;
import io.pulumi.awsnative.wafv2.outputs.WebACLRuleGroupReferenceStatement;
import io.pulumi.awsnative.wafv2.outputs.WebACLSizeConstraintStatement;
import io.pulumi.awsnative.wafv2.outputs.WebACLSqliMatchStatement;
import io.pulumi.awsnative.wafv2.outputs.WebACLXssMatchStatement;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebACLStatement {
    private final @Nullable WebACLAndStatement andStatement;
    private final @Nullable WebACLByteMatchStatement byteMatchStatement;
    private final @Nullable WebACLGeoMatchStatement geoMatchStatement;
    private final @Nullable WebACLIPSetReferenceStatement iPSetReferenceStatement;
    private final @Nullable WebACLLabelMatchStatement labelMatchStatement;
    private final @Nullable WebACLManagedRuleGroupStatement managedRuleGroupStatement;
    private final @Nullable WebACLNotStatement notStatement;
    private final @Nullable WebACLOrStatement orStatement;
    private final @Nullable WebACLRateBasedStatement rateBasedStatement;
    private final @Nullable WebACLRegexMatchStatement regexMatchStatement;
    private final @Nullable WebACLRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
    private final @Nullable WebACLRuleGroupReferenceStatement ruleGroupReferenceStatement;
    private final @Nullable WebACLSizeConstraintStatement sizeConstraintStatement;
    private final @Nullable WebACLSqliMatchStatement sqliMatchStatement;
    private final @Nullable WebACLXssMatchStatement xssMatchStatement;

    @OutputCustomType.Constructor({"andStatement","byteMatchStatement","geoMatchStatement","iPSetReferenceStatement","labelMatchStatement","managedRuleGroupStatement","notStatement","orStatement","rateBasedStatement","regexMatchStatement","regexPatternSetReferenceStatement","ruleGroupReferenceStatement","sizeConstraintStatement","sqliMatchStatement","xssMatchStatement"})
    private WebACLStatement(
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

    public Optional<WebACLAndStatement> getAndStatement() {
        return Optional.ofNullable(this.andStatement);
    }
    public Optional<WebACLByteMatchStatement> getByteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }
    public Optional<WebACLGeoMatchStatement> getGeoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }
    public Optional<WebACLIPSetReferenceStatement> getIPSetReferenceStatement() {
        return Optional.ofNullable(this.iPSetReferenceStatement);
    }
    public Optional<WebACLLabelMatchStatement> getLabelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }
    public Optional<WebACLManagedRuleGroupStatement> getManagedRuleGroupStatement() {
        return Optional.ofNullable(this.managedRuleGroupStatement);
    }
    public Optional<WebACLNotStatement> getNotStatement() {
        return Optional.ofNullable(this.notStatement);
    }
    public Optional<WebACLOrStatement> getOrStatement() {
        return Optional.ofNullable(this.orStatement);
    }
    public Optional<WebACLRateBasedStatement> getRateBasedStatement() {
        return Optional.ofNullable(this.rateBasedStatement);
    }
    public Optional<WebACLRegexMatchStatement> getRegexMatchStatement() {
        return Optional.ofNullable(this.regexMatchStatement);
    }
    public Optional<WebACLRegexPatternSetReferenceStatement> getRegexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }
    public Optional<WebACLRuleGroupReferenceStatement> getRuleGroupReferenceStatement() {
        return Optional.ofNullable(this.ruleGroupReferenceStatement);
    }
    public Optional<WebACLSizeConstraintStatement> getSizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }
    public Optional<WebACLSqliMatchStatement> getSqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }
    public Optional<WebACLXssMatchStatement> getXssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
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

        public Builder setAndStatement(@Nullable WebACLAndStatement andStatement) {
            this.andStatement = andStatement;
            return this;
        }

        public Builder setByteMatchStatement(@Nullable WebACLByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable WebACLGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder setIPSetReferenceStatement(@Nullable WebACLIPSetReferenceStatement iPSetReferenceStatement) {
            this.iPSetReferenceStatement = iPSetReferenceStatement;
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable WebACLLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder setManagedRuleGroupStatement(@Nullable WebACLManagedRuleGroupStatement managedRuleGroupStatement) {
            this.managedRuleGroupStatement = managedRuleGroupStatement;
            return this;
        }

        public Builder setNotStatement(@Nullable WebACLNotStatement notStatement) {
            this.notStatement = notStatement;
            return this;
        }

        public Builder setOrStatement(@Nullable WebACLOrStatement orStatement) {
            this.orStatement = orStatement;
            return this;
        }

        public Builder setRateBasedStatement(@Nullable WebACLRateBasedStatement rateBasedStatement) {
            this.rateBasedStatement = rateBasedStatement;
            return this;
        }

        public Builder setRegexMatchStatement(@Nullable WebACLRegexMatchStatement regexMatchStatement) {
            this.regexMatchStatement = regexMatchStatement;
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable WebACLRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder setRuleGroupReferenceStatement(@Nullable WebACLRuleGroupReferenceStatement ruleGroupReferenceStatement) {
            this.ruleGroupReferenceStatement = ruleGroupReferenceStatement;
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable WebACLSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable WebACLSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder setXssMatchStatement(@Nullable WebACLXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }

        public WebACLStatement build() {
            return new WebACLStatement(andStatement, byteMatchStatement, geoMatchStatement, iPSetReferenceStatement, labelMatchStatement, managedRuleGroupStatement, notStatement, orStatement, rateBasedStatement, regexMatchStatement, regexPatternSetReferenceStatement, ruleGroupReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
