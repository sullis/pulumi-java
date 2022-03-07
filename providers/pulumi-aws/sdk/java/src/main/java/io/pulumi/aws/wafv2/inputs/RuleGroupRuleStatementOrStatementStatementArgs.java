// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementAndStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementByteMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementGeoMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementIpSetReferenceStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementLabelMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementNotStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementOrStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementSqliMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementXssMatchStatementArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementOrStatementStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementOrStatementStatementArgs Empty = new RuleGroupRuleStatementOrStatementStatementArgs();

    /**
     * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    @InputImport(name="andStatement")
      private final @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementArgs> andStatement;

    public Input<RuleGroupRuleStatementOrStatementStatementAndStatementArgs> getAndStatement() {
        return this.andStatement == null ? Input.empty() : this.andStatement;
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @InputImport(name="byteMatchStatement")
      private final @Nullable Input<RuleGroupRuleStatementOrStatementStatementByteMatchStatementArgs> byteMatchStatement;

    public Input<RuleGroupRuleStatementOrStatementStatementByteMatchStatementArgs> getByteMatchStatement() {
        return this.byteMatchStatement == null ? Input.empty() : this.byteMatchStatement;
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @InputImport(name="geoMatchStatement")
      private final @Nullable Input<RuleGroupRuleStatementOrStatementStatementGeoMatchStatementArgs> geoMatchStatement;

    public Input<RuleGroupRuleStatementOrStatementStatementGeoMatchStatementArgs> getGeoMatchStatement() {
        return this.geoMatchStatement == null ? Input.empty() : this.geoMatchStatement;
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @InputImport(name="ipSetReferenceStatement")
      private final @Nullable Input<RuleGroupRuleStatementOrStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;

    public Input<RuleGroupRuleStatementOrStatementStatementIpSetReferenceStatementArgs> getIpSetReferenceStatement() {
        return this.ipSetReferenceStatement == null ? Input.empty() : this.ipSetReferenceStatement;
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @InputImport(name="labelMatchStatement")
      private final @Nullable Input<RuleGroupRuleStatementOrStatementStatementLabelMatchStatementArgs> labelMatchStatement;

    public Input<RuleGroupRuleStatementOrStatementStatementLabelMatchStatementArgs> getLabelMatchStatement() {
        return this.labelMatchStatement == null ? Input.empty() : this.labelMatchStatement;
    }

    /**
     * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    @InputImport(name="notStatement")
      private final @Nullable Input<RuleGroupRuleStatementOrStatementStatementNotStatementArgs> notStatement;

    public Input<RuleGroupRuleStatementOrStatementStatementNotStatementArgs> getNotStatement() {
        return this.notStatement == null ? Input.empty() : this.notStatement;
    }

    /**
     * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    @InputImport(name="orStatement")
      private final @Nullable Input<RuleGroupRuleStatementOrStatementStatementOrStatementArgs> orStatement;

    public Input<RuleGroupRuleStatementOrStatementStatementOrStatementArgs> getOrStatement() {
        return this.orStatement == null ? Input.empty() : this.orStatement;
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @InputImport(name="regexPatternSetReferenceStatement")
      private final @Nullable Input<RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;

    public Input<RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementArgs> getRegexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Input.empty() : this.regexPatternSetReferenceStatement;
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    @InputImport(name="sizeConstraintStatement")
      private final @Nullable Input<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;

    public Input<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs> getSizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Input.empty() : this.sizeConstraintStatement;
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @InputImport(name="sqliMatchStatement")
      private final @Nullable Input<RuleGroupRuleStatementOrStatementStatementSqliMatchStatementArgs> sqliMatchStatement;

    public Input<RuleGroupRuleStatementOrStatementStatementSqliMatchStatementArgs> getSqliMatchStatement() {
        return this.sqliMatchStatement == null ? Input.empty() : this.sqliMatchStatement;
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @InputImport(name="xssMatchStatement")
      private final @Nullable Input<RuleGroupRuleStatementOrStatementStatementXssMatchStatementArgs> xssMatchStatement;

    public Input<RuleGroupRuleStatementOrStatementStatementXssMatchStatementArgs> getXssMatchStatement() {
        return this.xssMatchStatement == null ? Input.empty() : this.xssMatchStatement;
    }

    public RuleGroupRuleStatementOrStatementStatementArgs(
        @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementArgs> andStatement,
        @Nullable Input<RuleGroupRuleStatementOrStatementStatementByteMatchStatementArgs> byteMatchStatement,
        @Nullable Input<RuleGroupRuleStatementOrStatementStatementGeoMatchStatementArgs> geoMatchStatement,
        @Nullable Input<RuleGroupRuleStatementOrStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement,
        @Nullable Input<RuleGroupRuleStatementOrStatementStatementLabelMatchStatementArgs> labelMatchStatement,
        @Nullable Input<RuleGroupRuleStatementOrStatementStatementNotStatementArgs> notStatement,
        @Nullable Input<RuleGroupRuleStatementOrStatementStatementOrStatementArgs> orStatement,
        @Nullable Input<RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement,
        @Nullable Input<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement,
        @Nullable Input<RuleGroupRuleStatementOrStatementStatementSqliMatchStatementArgs> sqliMatchStatement,
        @Nullable Input<RuleGroupRuleStatementOrStatementStatementXssMatchStatementArgs> xssMatchStatement) {
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

    private RuleGroupRuleStatementOrStatementStatementArgs() {
        this.andStatement = Input.empty();
        this.byteMatchStatement = Input.empty();
        this.geoMatchStatement = Input.empty();
        this.ipSetReferenceStatement = Input.empty();
        this.labelMatchStatement = Input.empty();
        this.notStatement = Input.empty();
        this.orStatement = Input.empty();
        this.regexPatternSetReferenceStatement = Input.empty();
        this.sizeConstraintStatement = Input.empty();
        this.sqliMatchStatement = Input.empty();
        this.xssMatchStatement = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementArgs> andStatement;
        private @Nullable Input<RuleGroupRuleStatementOrStatementStatementByteMatchStatementArgs> byteMatchStatement;
        private @Nullable Input<RuleGroupRuleStatementOrStatementStatementGeoMatchStatementArgs> geoMatchStatement;
        private @Nullable Input<RuleGroupRuleStatementOrStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;
        private @Nullable Input<RuleGroupRuleStatementOrStatementStatementLabelMatchStatementArgs> labelMatchStatement;
        private @Nullable Input<RuleGroupRuleStatementOrStatementStatementNotStatementArgs> notStatement;
        private @Nullable Input<RuleGroupRuleStatementOrStatementStatementOrStatementArgs> orStatement;
        private @Nullable Input<RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;
        private @Nullable Input<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;
        private @Nullable Input<RuleGroupRuleStatementOrStatementStatementSqliMatchStatementArgs> sqliMatchStatement;
        private @Nullable Input<RuleGroupRuleStatementOrStatementStatementXssMatchStatementArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementArgs defaults) {
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

        public Builder setAndStatement(@Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementArgs> andStatement) {
            this.andStatement = andStatement;
            return this;
        }

        public Builder setAndStatement(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementArgs andStatement) {
            this.andStatement = Input.ofNullable(andStatement);
            return this;
        }

        public Builder setByteMatchStatement(@Nullable Input<RuleGroupRuleStatementOrStatementStatementByteMatchStatementArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder setByteMatchStatement(@Nullable RuleGroupRuleStatementOrStatementStatementByteMatchStatementArgs byteMatchStatement) {
            this.byteMatchStatement = Input.ofNullable(byteMatchStatement);
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable Input<RuleGroupRuleStatementOrStatementStatementGeoMatchStatementArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable RuleGroupRuleStatementOrStatementStatementGeoMatchStatementArgs geoMatchStatement) {
            this.geoMatchStatement = Input.ofNullable(geoMatchStatement);
            return this;
        }

        public Builder setIpSetReferenceStatement(@Nullable Input<RuleGroupRuleStatementOrStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder setIpSetReferenceStatement(@Nullable RuleGroupRuleStatementOrStatementStatementIpSetReferenceStatementArgs ipSetReferenceStatement) {
            this.ipSetReferenceStatement = Input.ofNullable(ipSetReferenceStatement);
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable Input<RuleGroupRuleStatementOrStatementStatementLabelMatchStatementArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable RuleGroupRuleStatementOrStatementStatementLabelMatchStatementArgs labelMatchStatement) {
            this.labelMatchStatement = Input.ofNullable(labelMatchStatement);
            return this;
        }

        public Builder setNotStatement(@Nullable Input<RuleGroupRuleStatementOrStatementStatementNotStatementArgs> notStatement) {
            this.notStatement = notStatement;
            return this;
        }

        public Builder setNotStatement(@Nullable RuleGroupRuleStatementOrStatementStatementNotStatementArgs notStatement) {
            this.notStatement = Input.ofNullable(notStatement);
            return this;
        }

        public Builder setOrStatement(@Nullable Input<RuleGroupRuleStatementOrStatementStatementOrStatementArgs> orStatement) {
            this.orStatement = orStatement;
            return this;
        }

        public Builder setOrStatement(@Nullable RuleGroupRuleStatementOrStatementStatementOrStatementArgs orStatement) {
            this.orStatement = Input.ofNullable(orStatement);
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable Input<RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Input.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable Input<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Input.ofNullable(sizeConstraintStatement);
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable Input<RuleGroupRuleStatementOrStatementStatementSqliMatchStatementArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable RuleGroupRuleStatementOrStatementStatementSqliMatchStatementArgs sqliMatchStatement) {
            this.sqliMatchStatement = Input.ofNullable(sqliMatchStatement);
            return this;
        }

        public Builder setXssMatchStatement(@Nullable Input<RuleGroupRuleStatementOrStatementStatementXssMatchStatementArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }

        public Builder setXssMatchStatement(@Nullable RuleGroupRuleStatementOrStatementStatementXssMatchStatementArgs xssMatchStatement) {
            this.xssMatchStatement = Input.ofNullable(xssMatchStatement);
            return this;
        }
        public RuleGroupRuleStatementOrStatementStatementArgs build() {
            return new RuleGroupRuleStatementOrStatementStatementArgs(andStatement, byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, notStatement, orStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}