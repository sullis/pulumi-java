// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupAndStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupByteMatchStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupGeoMatchStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupIPSetReferenceStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupLabelMatchStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupNotStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupOrStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupRateBasedStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupRegexMatchStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupRegexPatternSetReferenceStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupSizeConstraintStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupSqliMatchStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupXssMatchStatementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * First level statement that contains conditions, such as ByteMatch, SizeConstraint, etc
 * 
 */
public final class RuleGroupStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupStatementArgs Empty = new RuleGroupStatementArgs();

    @Import(name="andStatement")
      private final @Nullable Output<RuleGroupAndStatementArgs> andStatement;

    public Output<RuleGroupAndStatementArgs> andStatement() {
        return this.andStatement == null ? Codegen.empty() : this.andStatement;
    }

    @Import(name="byteMatchStatement")
      private final @Nullable Output<RuleGroupByteMatchStatementArgs> byteMatchStatement;

    public Output<RuleGroupByteMatchStatementArgs> byteMatchStatement() {
        return this.byteMatchStatement == null ? Codegen.empty() : this.byteMatchStatement;
    }

    @Import(name="geoMatchStatement")
      private final @Nullable Output<RuleGroupGeoMatchStatementArgs> geoMatchStatement;

    public Output<RuleGroupGeoMatchStatementArgs> geoMatchStatement() {
        return this.geoMatchStatement == null ? Codegen.empty() : this.geoMatchStatement;
    }

    @Import(name="iPSetReferenceStatement")
      private final @Nullable Output<RuleGroupIPSetReferenceStatementArgs> iPSetReferenceStatement;

    public Output<RuleGroupIPSetReferenceStatementArgs> iPSetReferenceStatement() {
        return this.iPSetReferenceStatement == null ? Codegen.empty() : this.iPSetReferenceStatement;
    }

    @Import(name="labelMatchStatement")
      private final @Nullable Output<RuleGroupLabelMatchStatementArgs> labelMatchStatement;

    public Output<RuleGroupLabelMatchStatementArgs> labelMatchStatement() {
        return this.labelMatchStatement == null ? Codegen.empty() : this.labelMatchStatement;
    }

    @Import(name="notStatement")
      private final @Nullable Output<RuleGroupNotStatementArgs> notStatement;

    public Output<RuleGroupNotStatementArgs> notStatement() {
        return this.notStatement == null ? Codegen.empty() : this.notStatement;
    }

    @Import(name="orStatement")
      private final @Nullable Output<RuleGroupOrStatementArgs> orStatement;

    public Output<RuleGroupOrStatementArgs> orStatement() {
        return this.orStatement == null ? Codegen.empty() : this.orStatement;
    }

    @Import(name="rateBasedStatement")
      private final @Nullable Output<RuleGroupRateBasedStatementArgs> rateBasedStatement;

    public Output<RuleGroupRateBasedStatementArgs> rateBasedStatement() {
        return this.rateBasedStatement == null ? Codegen.empty() : this.rateBasedStatement;
    }

    @Import(name="regexMatchStatement")
      private final @Nullable Output<RuleGroupRegexMatchStatementArgs> regexMatchStatement;

    public Output<RuleGroupRegexMatchStatementArgs> regexMatchStatement() {
        return this.regexMatchStatement == null ? Codegen.empty() : this.regexMatchStatement;
    }

    @Import(name="regexPatternSetReferenceStatement")
      private final @Nullable Output<RuleGroupRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;

    public Output<RuleGroupRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Codegen.empty() : this.regexPatternSetReferenceStatement;
    }

    @Import(name="sizeConstraintStatement")
      private final @Nullable Output<RuleGroupSizeConstraintStatementArgs> sizeConstraintStatement;

    public Output<RuleGroupSizeConstraintStatementArgs> sizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Codegen.empty() : this.sizeConstraintStatement;
    }

    @Import(name="sqliMatchStatement")
      private final @Nullable Output<RuleGroupSqliMatchStatementArgs> sqliMatchStatement;

    public Output<RuleGroupSqliMatchStatementArgs> sqliMatchStatement() {
        return this.sqliMatchStatement == null ? Codegen.empty() : this.sqliMatchStatement;
    }

    @Import(name="xssMatchStatement")
      private final @Nullable Output<RuleGroupXssMatchStatementArgs> xssMatchStatement;

    public Output<RuleGroupXssMatchStatementArgs> xssMatchStatement() {
        return this.xssMatchStatement == null ? Codegen.empty() : this.xssMatchStatement;
    }

    public RuleGroupStatementArgs(
        @Nullable Output<RuleGroupAndStatementArgs> andStatement,
        @Nullable Output<RuleGroupByteMatchStatementArgs> byteMatchStatement,
        @Nullable Output<RuleGroupGeoMatchStatementArgs> geoMatchStatement,
        @Nullable Output<RuleGroupIPSetReferenceStatementArgs> iPSetReferenceStatement,
        @Nullable Output<RuleGroupLabelMatchStatementArgs> labelMatchStatement,
        @Nullable Output<RuleGroupNotStatementArgs> notStatement,
        @Nullable Output<RuleGroupOrStatementArgs> orStatement,
        @Nullable Output<RuleGroupRateBasedStatementArgs> rateBasedStatement,
        @Nullable Output<RuleGroupRegexMatchStatementArgs> regexMatchStatement,
        @Nullable Output<RuleGroupRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement,
        @Nullable Output<RuleGroupSizeConstraintStatementArgs> sizeConstraintStatement,
        @Nullable Output<RuleGroupSqliMatchStatementArgs> sqliMatchStatement,
        @Nullable Output<RuleGroupXssMatchStatementArgs> xssMatchStatement) {
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

    private RuleGroupStatementArgs() {
        this.andStatement = Codegen.empty();
        this.byteMatchStatement = Codegen.empty();
        this.geoMatchStatement = Codegen.empty();
        this.iPSetReferenceStatement = Codegen.empty();
        this.labelMatchStatement = Codegen.empty();
        this.notStatement = Codegen.empty();
        this.orStatement = Codegen.empty();
        this.rateBasedStatement = Codegen.empty();
        this.regexMatchStatement = Codegen.empty();
        this.regexPatternSetReferenceStatement = Codegen.empty();
        this.sizeConstraintStatement = Codegen.empty();
        this.sqliMatchStatement = Codegen.empty();
        this.xssMatchStatement = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleGroupAndStatementArgs> andStatement;
        private @Nullable Output<RuleGroupByteMatchStatementArgs> byteMatchStatement;
        private @Nullable Output<RuleGroupGeoMatchStatementArgs> geoMatchStatement;
        private @Nullable Output<RuleGroupIPSetReferenceStatementArgs> iPSetReferenceStatement;
        private @Nullable Output<RuleGroupLabelMatchStatementArgs> labelMatchStatement;
        private @Nullable Output<RuleGroupNotStatementArgs> notStatement;
        private @Nullable Output<RuleGroupOrStatementArgs> orStatement;
        private @Nullable Output<RuleGroupRateBasedStatementArgs> rateBasedStatement;
        private @Nullable Output<RuleGroupRegexMatchStatementArgs> regexMatchStatement;
        private @Nullable Output<RuleGroupRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;
        private @Nullable Output<RuleGroupSizeConstraintStatementArgs> sizeConstraintStatement;
        private @Nullable Output<RuleGroupSqliMatchStatementArgs> sqliMatchStatement;
        private @Nullable Output<RuleGroupXssMatchStatementArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupStatementArgs defaults) {
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

        public Builder andStatement(@Nullable Output<RuleGroupAndStatementArgs> andStatement) {
            this.andStatement = andStatement;
            return this;
        }
        public Builder andStatement(@Nullable RuleGroupAndStatementArgs andStatement) {
            this.andStatement = Codegen.ofNullable(andStatement);
            return this;
        }
        public Builder byteMatchStatement(@Nullable Output<RuleGroupByteMatchStatementArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }
        public Builder byteMatchStatement(@Nullable RuleGroupByteMatchStatementArgs byteMatchStatement) {
            this.byteMatchStatement = Codegen.ofNullable(byteMatchStatement);
            return this;
        }
        public Builder geoMatchStatement(@Nullable Output<RuleGroupGeoMatchStatementArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }
        public Builder geoMatchStatement(@Nullable RuleGroupGeoMatchStatementArgs geoMatchStatement) {
            this.geoMatchStatement = Codegen.ofNullable(geoMatchStatement);
            return this;
        }
        public Builder iPSetReferenceStatement(@Nullable Output<RuleGroupIPSetReferenceStatementArgs> iPSetReferenceStatement) {
            this.iPSetReferenceStatement = iPSetReferenceStatement;
            return this;
        }
        public Builder iPSetReferenceStatement(@Nullable RuleGroupIPSetReferenceStatementArgs iPSetReferenceStatement) {
            this.iPSetReferenceStatement = Codegen.ofNullable(iPSetReferenceStatement);
            return this;
        }
        public Builder labelMatchStatement(@Nullable Output<RuleGroupLabelMatchStatementArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }
        public Builder labelMatchStatement(@Nullable RuleGroupLabelMatchStatementArgs labelMatchStatement) {
            this.labelMatchStatement = Codegen.ofNullable(labelMatchStatement);
            return this;
        }
        public Builder notStatement(@Nullable Output<RuleGroupNotStatementArgs> notStatement) {
            this.notStatement = notStatement;
            return this;
        }
        public Builder notStatement(@Nullable RuleGroupNotStatementArgs notStatement) {
            this.notStatement = Codegen.ofNullable(notStatement);
            return this;
        }
        public Builder orStatement(@Nullable Output<RuleGroupOrStatementArgs> orStatement) {
            this.orStatement = orStatement;
            return this;
        }
        public Builder orStatement(@Nullable RuleGroupOrStatementArgs orStatement) {
            this.orStatement = Codegen.ofNullable(orStatement);
            return this;
        }
        public Builder rateBasedStatement(@Nullable Output<RuleGroupRateBasedStatementArgs> rateBasedStatement) {
            this.rateBasedStatement = rateBasedStatement;
            return this;
        }
        public Builder rateBasedStatement(@Nullable RuleGroupRateBasedStatementArgs rateBasedStatement) {
            this.rateBasedStatement = Codegen.ofNullable(rateBasedStatement);
            return this;
        }
        public Builder regexMatchStatement(@Nullable Output<RuleGroupRegexMatchStatementArgs> regexMatchStatement) {
            this.regexMatchStatement = regexMatchStatement;
            return this;
        }
        public Builder regexMatchStatement(@Nullable RuleGroupRegexMatchStatementArgs regexMatchStatement) {
            this.regexMatchStatement = Codegen.ofNullable(regexMatchStatement);
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable Output<RuleGroupRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable RuleGroupRegexPatternSetReferenceStatementArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Codegen.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable Output<RuleGroupSizeConstraintStatementArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable RuleGroupSizeConstraintStatementArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Codegen.ofNullable(sizeConstraintStatement);
            return this;
        }
        public Builder sqliMatchStatement(@Nullable Output<RuleGroupSqliMatchStatementArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }
        public Builder sqliMatchStatement(@Nullable RuleGroupSqliMatchStatementArgs sqliMatchStatement) {
            this.sqliMatchStatement = Codegen.ofNullable(sqliMatchStatement);
            return this;
        }
        public Builder xssMatchStatement(@Nullable Output<RuleGroupXssMatchStatementArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public Builder xssMatchStatement(@Nullable RuleGroupXssMatchStatementArgs xssMatchStatement) {
            this.xssMatchStatement = Codegen.ofNullable(xssMatchStatement);
            return this;
        }        public RuleGroupStatementArgs build() {
            return new RuleGroupStatementArgs(andStatement, byteMatchStatement, geoMatchStatement, iPSetReferenceStatement, labelMatchStatement, notStatement, orStatement, rateBasedStatement, regexMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
