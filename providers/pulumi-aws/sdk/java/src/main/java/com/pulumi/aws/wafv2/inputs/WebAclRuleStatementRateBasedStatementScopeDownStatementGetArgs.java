// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementGetArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementGetArgs();

    /**
     * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    @Import(name="andStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementGetArgs> andStatement;

    /**
     * @return A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementGetArgs>> andStatement() {
        return Optional.ofNullable(this.andStatement);
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @Import(name="byteMatchStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementGetArgs> byteMatchStatement;

    /**
     * @return A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementGetArgs>> byteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @Import(name="geoMatchStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatementGetArgs> geoMatchStatement;

    /**
     * @return A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatementGetArgs>> geoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @Import(name="ipSetReferenceStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;

    /**
     * @return A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatementGetArgs>> ipSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @Import(name="labelMatchStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementGetArgs> labelMatchStatement;

    /**
     * @return A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementGetArgs>> labelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }

    /**
     * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    @Import(name="notStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementGetArgs> notStatement;

    /**
     * @return A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementGetArgs>> notStatement() {
        return Optional.ofNullable(this.notStatement);
    }

    /**
     * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    @Import(name="orStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementGetArgs> orStatement;

    /**
     * @return A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementGetArgs>> orStatement() {
        return Optional.ofNullable(this.orStatement);
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @Import(name="regexPatternSetReferenceStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;

    /**
     * @return A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementGetArgs>> regexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    @Import(name="sizeConstraintStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;

    /**
     * @return A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementGetArgs>> sizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @Import(name="sqliMatchStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementGetArgs> sqliMatchStatement;

    /**
     * @return An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementGetArgs>> sqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @Import(name="xssMatchStatement")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementGetArgs> xssMatchStatement;

    /**
     * @return A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementGetArgs>> xssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementGetArgs() {}

    private WebAclRuleStatementRateBasedStatementScopeDownStatementGetArgs(WebAclRuleStatementRateBasedStatementScopeDownStatementGetArgs $) {
        this.andStatement = $.andStatement;
        this.byteMatchStatement = $.byteMatchStatement;
        this.geoMatchStatement = $.geoMatchStatement;
        this.ipSetReferenceStatement = $.ipSetReferenceStatement;
        this.labelMatchStatement = $.labelMatchStatement;
        this.notStatement = $.notStatement;
        this.orStatement = $.orStatement;
        this.regexPatternSetReferenceStatement = $.regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = $.sizeConstraintStatement;
        this.sqliMatchStatement = $.sqliMatchStatement;
        this.xssMatchStatement = $.xssMatchStatement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementRateBasedStatementScopeDownStatementGetArgs $;

        public Builder() {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementGetArgs();
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementGetArgs defaults) {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param andStatement A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder andStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementGetArgs> andStatement) {
            $.andStatement = andStatement;
            return this;
        }

        /**
         * @param andStatement A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder andStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementGetArgs andStatement) {
            return andStatement(Output.of(andStatement));
        }

        /**
         * @param byteMatchStatement A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder byteMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementGetArgs> byteMatchStatement) {
            $.byteMatchStatement = byteMatchStatement;
            return this;
        }

        /**
         * @param byteMatchStatement A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder byteMatchStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementGetArgs byteMatchStatement) {
            return byteMatchStatement(Output.of(byteMatchStatement));
        }

        /**
         * @param geoMatchStatement A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder geoMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatementGetArgs> geoMatchStatement) {
            $.geoMatchStatement = geoMatchStatement;
            return this;
        }

        /**
         * @param geoMatchStatement A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder geoMatchStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatementGetArgs geoMatchStatement) {
            return geoMatchStatement(Output.of(geoMatchStatement));
        }

        /**
         * @param ipSetReferenceStatement A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder ipSetReferenceStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement) {
            $.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        /**
         * @param ipSetReferenceStatement A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder ipSetReferenceStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatementGetArgs ipSetReferenceStatement) {
            return ipSetReferenceStatement(Output.of(ipSetReferenceStatement));
        }

        /**
         * @param labelMatchStatement A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder labelMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementGetArgs> labelMatchStatement) {
            $.labelMatchStatement = labelMatchStatement;
            return this;
        }

        /**
         * @param labelMatchStatement A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder labelMatchStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementGetArgs labelMatchStatement) {
            return labelMatchStatement(Output.of(labelMatchStatement));
        }

        /**
         * @param notStatement A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder notStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementGetArgs> notStatement) {
            $.notStatement = notStatement;
            return this;
        }

        /**
         * @param notStatement A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder notStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementGetArgs notStatement) {
            return notStatement(Output.of(notStatement));
        }

        /**
         * @param orStatement A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder orStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementGetArgs> orStatement) {
            $.orStatement = orStatement;
            return this;
        }

        /**
         * @param orStatement A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder orStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementGetArgs orStatement) {
            return orStatement(Output.of(orStatement));
        }

        /**
         * @param regexPatternSetReferenceStatement A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder regexPatternSetReferenceStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement) {
            $.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        /**
         * @param regexPatternSetReferenceStatement A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder regexPatternSetReferenceStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementGetArgs regexPatternSetReferenceStatement) {
            return regexPatternSetReferenceStatement(Output.of(regexPatternSetReferenceStatement));
        }

        /**
         * @param sizeConstraintStatement A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
         * 
         * @return builder
         * 
         */
        public Builder sizeConstraintStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementGetArgs> sizeConstraintStatement) {
            $.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        /**
         * @param sizeConstraintStatement A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
         * 
         * @return builder
         * 
         */
        public Builder sizeConstraintStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementGetArgs sizeConstraintStatement) {
            return sizeConstraintStatement(Output.of(sizeConstraintStatement));
        }

        /**
         * @param sqliMatchStatement An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder sqliMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementGetArgs> sqliMatchStatement) {
            $.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        /**
         * @param sqliMatchStatement An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder sqliMatchStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementGetArgs sqliMatchStatement) {
            return sqliMatchStatement(Output.of(sqliMatchStatement));
        }

        /**
         * @param xssMatchStatement A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder xssMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementGetArgs> xssMatchStatement) {
            $.xssMatchStatement = xssMatchStatement;
            return this;
        }

        /**
         * @param xssMatchStatement A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
         * 
         * @return builder
         * 
         */
        public Builder xssMatchStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementGetArgs xssMatchStatement) {
            return xssMatchStatement(Output.of(xssMatchStatement));
        }

        public WebAclRuleStatementRateBasedStatementScopeDownStatementGetArgs build() {
            return $;
        }
    }

}
