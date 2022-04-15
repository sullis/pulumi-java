// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementAndStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementByteMatchStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementGeoMatchStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementIpSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementLabelMatchStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementOrStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementSizeConstraintStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementSqliMatchStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementXssMatchStatement;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementOrStatementStatement {
    /**
     * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementAndStatement andStatement;
    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementByteMatchStatement byteMatchStatement;
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementGeoMatchStatement geoMatchStatement;
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementLabelMatchStatement labelMatchStatement;
    /**
     * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementNotStatement notStatement;
    /**
     * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementOrStatement orStatement;
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementSizeConstraintStatement sizeConstraintStatement;
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementSqliMatchStatement sqliMatchStatement;
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementXssMatchStatement xssMatchStatement;

    @CustomType.Constructor
    private RuleGroupRuleStatementOrStatementStatement(
        @CustomType.Parameter("andStatement") @Nullable RuleGroupRuleStatementOrStatementStatementAndStatement andStatement,
        @CustomType.Parameter("byteMatchStatement") @Nullable RuleGroupRuleStatementOrStatementStatementByteMatchStatement byteMatchStatement,
        @CustomType.Parameter("geoMatchStatement") @Nullable RuleGroupRuleStatementOrStatementStatementGeoMatchStatement geoMatchStatement,
        @CustomType.Parameter("ipSetReferenceStatement") @Nullable RuleGroupRuleStatementOrStatementStatementIpSetReferenceStatement ipSetReferenceStatement,
        @CustomType.Parameter("labelMatchStatement") @Nullable RuleGroupRuleStatementOrStatementStatementLabelMatchStatement labelMatchStatement,
        @CustomType.Parameter("notStatement") @Nullable RuleGroupRuleStatementOrStatementStatementNotStatement notStatement,
        @CustomType.Parameter("orStatement") @Nullable RuleGroupRuleStatementOrStatementStatementOrStatement orStatement,
        @CustomType.Parameter("regexPatternSetReferenceStatement") @Nullable RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement,
        @CustomType.Parameter("sizeConstraintStatement") @Nullable RuleGroupRuleStatementOrStatementStatementSizeConstraintStatement sizeConstraintStatement,
        @CustomType.Parameter("sqliMatchStatement") @Nullable RuleGroupRuleStatementOrStatementStatementSqliMatchStatement sqliMatchStatement,
        @CustomType.Parameter("xssMatchStatement") @Nullable RuleGroupRuleStatementOrStatementStatementXssMatchStatement xssMatchStatement) {
        this.andStatement = andStatement;
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.notStatement = notStatement;
        this.orStatement = orStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    /**
     * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementAndStatement> andStatement() {
        return Optional.ofNullable(this.andStatement);
    }
    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementByteMatchStatement> byteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementGeoMatchStatement> geoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementIpSetReferenceStatement> ipSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementLabelMatchStatement> labelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }
    /**
     * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementNotStatement> notStatement() {
        return Optional.ofNullable(this.notStatement);
    }
    /**
     * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementOrStatement> orStatement() {
        return Optional.ofNullable(this.orStatement);
    }
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatement> sizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementSqliMatchStatement> sqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementXssMatchStatement> xssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementOrStatementStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleStatementOrStatementStatementAndStatement andStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementByteMatchStatement byteMatchStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementGeoMatchStatement geoMatchStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementLabelMatchStatement labelMatchStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatement notStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementOrStatement orStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementSizeConstraintStatement sizeConstraintStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementSqliMatchStatement sqliMatchStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementXssMatchStatement xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementOrStatementStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.andStatement = defaults.andStatement;
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.ipSetReferenceStatement = defaults.ipSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.notStatement = defaults.notStatement;
    	      this.orStatement = defaults.orStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        public Builder andStatement(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatement andStatement) {
            this.andStatement = andStatement;
            return this;
        }
        public Builder byteMatchStatement(@Nullable RuleGroupRuleStatementOrStatementStatementByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }
        public Builder geoMatchStatement(@Nullable RuleGroupRuleStatementOrStatementStatementGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }
        public Builder ipSetReferenceStatement(@Nullable RuleGroupRuleStatementOrStatementStatementIpSetReferenceStatement ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }
        public Builder labelMatchStatement(@Nullable RuleGroupRuleStatementOrStatementStatementLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }
        public Builder notStatement(@Nullable RuleGroupRuleStatementOrStatementStatementNotStatement notStatement) {
            this.notStatement = notStatement;
            return this;
        }
        public Builder orStatement(@Nullable RuleGroupRuleStatementOrStatementStatementOrStatement orStatement) {
            this.orStatement = orStatement;
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable RuleGroupRuleStatementOrStatementStatementSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }
        public Builder sqliMatchStatement(@Nullable RuleGroupRuleStatementOrStatementStatementSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }
        public Builder xssMatchStatement(@Nullable RuleGroupRuleStatementOrStatementStatementXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }        public RuleGroupRuleStatementOrStatementStatement build() {
            return new RuleGroupRuleStatementOrStatementStatement(andStatement, byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, notStatement, orStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
