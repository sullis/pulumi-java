// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementByteMatchStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementLabelMatchStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementSizeConstraintStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementSqliMatchStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatement;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementOrStatementStatementOrStatementStatement {
    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementByteMatchStatement byteMatchStatement;
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatement geoMatchStatement;
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementLabelMatchStatement labelMatchStatement;
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementSizeConstraintStatement sizeConstraintStatement;
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementSqliMatchStatement sqliMatchStatement;
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatement xssMatchStatement;

    @CustomType.Constructor
    private RuleGroupRuleStatementOrStatementStatementOrStatementStatement(
        @CustomType.Parameter("byteMatchStatement") @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementByteMatchStatement byteMatchStatement,
        @CustomType.Parameter("geoMatchStatement") @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatement geoMatchStatement,
        @CustomType.Parameter("ipSetReferenceStatement") @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatement ipSetReferenceStatement,
        @CustomType.Parameter("labelMatchStatement") @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementLabelMatchStatement labelMatchStatement,
        @CustomType.Parameter("regexPatternSetReferenceStatement") @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement,
        @CustomType.Parameter("sizeConstraintStatement") @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementSizeConstraintStatement sizeConstraintStatement,
        @CustomType.Parameter("sqliMatchStatement") @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementSqliMatchStatement sqliMatchStatement,
        @CustomType.Parameter("xssMatchStatement") @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatement xssMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementOrStatementStatementByteMatchStatement> byteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatement> geoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatement> ipSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementOrStatementStatementLabelMatchStatement> labelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementOrStatementStatementSizeConstraintStatement> sizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementOrStatementStatementSqliMatchStatement> sqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatement> xssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementOrStatementStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementByteMatchStatement byteMatchStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatement geoMatchStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementLabelMatchStatement labelMatchStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementSizeConstraintStatement sizeConstraintStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementSqliMatchStatement sqliMatchStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatement xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementOrStatementStatement defaults) {
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

        public Builder byteMatchStatement(@Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }
        public Builder geoMatchStatement(@Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }
        public Builder ipSetReferenceStatement(@Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatement ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }
        public Builder labelMatchStatement(@Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }
        public Builder sqliMatchStatement(@Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }
        public Builder xssMatchStatement(@Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }        public RuleGroupRuleStatementOrStatementStatementOrStatementStatement build() {
            return new RuleGroupRuleStatementOrStatementStatementOrStatementStatement(byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
