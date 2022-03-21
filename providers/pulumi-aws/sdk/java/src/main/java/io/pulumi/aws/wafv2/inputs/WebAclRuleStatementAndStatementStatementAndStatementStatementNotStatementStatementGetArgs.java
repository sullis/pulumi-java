// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGeoMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementLabelMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGetArgs Empty = new WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGetArgs();

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @Import(name="byteMatchStatement")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementGetArgs> byteMatchStatement;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementGetArgs> getByteMatchStatement() {
        return this.byteMatchStatement == null ? Output.empty() : this.byteMatchStatement;
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @Import(name="geoMatchStatement")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGeoMatchStatementGetArgs> getGeoMatchStatement() {
        return this.geoMatchStatement == null ? Output.empty() : this.geoMatchStatement;
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @Import(name="ipSetReferenceStatement")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs> getIpSetReferenceStatement() {
        return this.ipSetReferenceStatement == null ? Output.empty() : this.ipSetReferenceStatement;
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @Import(name="labelMatchStatement")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementLabelMatchStatementGetArgs> getLabelMatchStatement() {
        return this.labelMatchStatement == null ? Output.empty() : this.labelMatchStatement;
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @Import(name="regexPatternSetReferenceStatement")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> getRegexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Output.empty() : this.regexPatternSetReferenceStatement;
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    @Import(name="sizeConstraintStatement")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementGetArgs> getSizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Output.empty() : this.sizeConstraintStatement;
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @Import(name="sqliMatchStatement")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementGetArgs> getSqliMatchStatement() {
        return this.sqliMatchStatement == null ? Output.empty() : this.sqliMatchStatement;
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @Import(name="xssMatchStatement")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs> getXssMatchStatement() {
        return this.xssMatchStatement == null ? Output.empty() : this.xssMatchStatement;
    }

    public WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGetArgs(
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementGetArgs> byteMatchStatement,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGeoMatchStatementGetArgs> geoMatchStatement,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementLabelMatchStatementGetArgs> labelMatchStatement,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    private WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGetArgs() {
        this.byteMatchStatement = Output.empty();
        this.geoMatchStatement = Output.empty();
        this.ipSetReferenceStatement = Output.empty();
        this.labelMatchStatement = Output.empty();
        this.regexPatternSetReferenceStatement = Output.empty();
        this.sizeConstraintStatement = Output.empty();
        this.sqliMatchStatement = Output.empty();
        this.xssMatchStatement = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementGetArgs> byteMatchStatement;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGetArgs defaults) {
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

        public Builder byteMatchStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementGetArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }
        public Builder byteMatchStatement(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementGetArgs byteMatchStatement) {
            this.byteMatchStatement = Output.ofNullable(byteMatchStatement);
            return this;
        }
        public Builder geoMatchStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGeoMatchStatementGetArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }
        public Builder geoMatchStatement(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGeoMatchStatementGetArgs geoMatchStatement) {
            this.geoMatchStatement = Output.ofNullable(geoMatchStatement);
            return this;
        }
        public Builder ipSetReferenceStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }
        public Builder ipSetReferenceStatement(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementGetArgs ipSetReferenceStatement) {
            this.ipSetReferenceStatement = Output.ofNullable(ipSetReferenceStatement);
            return this;
        }
        public Builder labelMatchStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementLabelMatchStatementGetArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }
        public Builder labelMatchStatement(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementLabelMatchStatementGetArgs labelMatchStatement) {
            this.labelMatchStatement = Output.ofNullable(labelMatchStatement);
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Output.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementGetArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Output.ofNullable(sizeConstraintStatement);
            return this;
        }
        public Builder sqliMatchStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }
        public Builder sqliMatchStatement(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementGetArgs sqliMatchStatement) {
            this.sqliMatchStatement = Output.ofNullable(sqliMatchStatement);
            return this;
        }
        public Builder xssMatchStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public Builder xssMatchStatement(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs xssMatchStatement) {
            this.xssMatchStatement = Output.ofNullable(xssMatchStatement);
            return this;
        }        public WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGetArgs build() {
            return new WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGetArgs(byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
