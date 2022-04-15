// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementByteMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementLabelMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementAndStatementStatementNotStatementStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementAndStatementStatementNotStatementStatementGetArgs Empty = new RuleGroupRuleStatementAndStatementStatementNotStatementStatementGetArgs();

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @Import(name="byteMatchStatement")
      private final @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementByteMatchStatementGetArgs> byteMatchStatement;

    public Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementByteMatchStatementGetArgs> byteMatchStatement() {
        return this.byteMatchStatement == null ? Codegen.empty() : this.byteMatchStatement;
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @Import(name="geoMatchStatement")
      private final @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;

    public Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementGetArgs> geoMatchStatement() {
        return this.geoMatchStatement == null ? Codegen.empty() : this.geoMatchStatement;
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @Import(name="ipSetReferenceStatement")
      private final @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;

    public Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement() {
        return this.ipSetReferenceStatement == null ? Codegen.empty() : this.ipSetReferenceStatement;
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @Import(name="labelMatchStatement")
      private final @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;

    public Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementLabelMatchStatementGetArgs> labelMatchStatement() {
        return this.labelMatchStatement == null ? Codegen.empty() : this.labelMatchStatement;
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @Import(name="regexPatternSetReferenceStatement")
      private final @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;

    public Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Codegen.empty() : this.regexPatternSetReferenceStatement;
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    @Import(name="sizeConstraintStatement")
      private final @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;

    public Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Codegen.empty() : this.sizeConstraintStatement;
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @Import(name="sqliMatchStatement")
      private final @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;

    public Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement() {
        return this.sqliMatchStatement == null ? Codegen.empty() : this.sqliMatchStatement;
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @Import(name="xssMatchStatement")
      private final @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

    public Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs> xssMatchStatement() {
        return this.xssMatchStatement == null ? Codegen.empty() : this.xssMatchStatement;
    }

    public RuleGroupRuleStatementAndStatementStatementNotStatementStatementGetArgs(
        @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementByteMatchStatementGetArgs> byteMatchStatement,
        @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementGetArgs> geoMatchStatement,
        @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement,
        @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementLabelMatchStatementGetArgs> labelMatchStatement,
        @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement,
        @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement,
        @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement,
        @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    private RuleGroupRuleStatementAndStatementStatementNotStatementStatementGetArgs() {
        this.byteMatchStatement = Codegen.empty();
        this.geoMatchStatement = Codegen.empty();
        this.ipSetReferenceStatement = Codegen.empty();
        this.labelMatchStatement = Codegen.empty();
        this.regexPatternSetReferenceStatement = Codegen.empty();
        this.sizeConstraintStatement = Codegen.empty();
        this.sqliMatchStatement = Codegen.empty();
        this.xssMatchStatement = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementNotStatementStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementByteMatchStatementGetArgs> byteMatchStatement;
        private @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;
        private @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;
        private @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;
        private @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;
        private @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;
        private @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;
        private @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementNotStatementStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.ipSetReferenceStatement = defaults.ipSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        public Builder byteMatchStatement(@Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementByteMatchStatementGetArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }
        public Builder byteMatchStatement(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementByteMatchStatementGetArgs byteMatchStatement) {
            this.byteMatchStatement = Codegen.ofNullable(byteMatchStatement);
            return this;
        }
        public Builder geoMatchStatement(@Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementGetArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }
        public Builder geoMatchStatement(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementGetArgs geoMatchStatement) {
            this.geoMatchStatement = Codegen.ofNullable(geoMatchStatement);
            return this;
        }
        public Builder ipSetReferenceStatement(@Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }
        public Builder ipSetReferenceStatement(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs ipSetReferenceStatement) {
            this.ipSetReferenceStatement = Codegen.ofNullable(ipSetReferenceStatement);
            return this;
        }
        public Builder labelMatchStatement(@Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementLabelMatchStatementGetArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }
        public Builder labelMatchStatement(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementLabelMatchStatementGetArgs labelMatchStatement) {
            this.labelMatchStatement = Codegen.ofNullable(labelMatchStatement);
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Codegen.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementSizeConstraintStatementGetArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Codegen.ofNullable(sizeConstraintStatement);
            return this;
        }
        public Builder sqliMatchStatement(@Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }
        public Builder sqliMatchStatement(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementSqliMatchStatementGetArgs sqliMatchStatement) {
            this.sqliMatchStatement = Codegen.ofNullable(sqliMatchStatement);
            return this;
        }
        public Builder xssMatchStatement(@Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public Builder xssMatchStatement(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs xssMatchStatement) {
            this.xssMatchStatement = Codegen.ofNullable(xssMatchStatement);
            return this;
        }        public RuleGroupRuleStatementAndStatementStatementNotStatementStatementGetArgs build() {
            return new RuleGroupRuleStatementAndStatementStatementNotStatementStatementGetArgs(byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
