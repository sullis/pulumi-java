// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.outputs;

import com.pulumi.aws.wafregional.outputs.SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SqlInjectionMatchSetSqlInjectionMatchTuple {
    /**
     * @return Specifies where in a web request to look for snippets of malicious SQL code.
     * 
     */
    private final SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch fieldToMatch;
    /**
     * @return Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * If you specify a transformation, AWS WAF performs the transformation on `field_to_match` before inspecting a request for a match.
     * e.g., `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_regional_SqlInjectionMatchTuple.html#WAF-Type-regional_SqlInjectionMatchTuple-TextTransformation)
     * for all supported values.
     * 
     */
    private final String textTransformation;

    @CustomType.Constructor
    private SqlInjectionMatchSetSqlInjectionMatchTuple(
        @CustomType.Parameter("fieldToMatch") SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch fieldToMatch,
        @CustomType.Parameter("textTransformation") String textTransformation) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformation = textTransformation;
    }

    /**
     * @return Specifies where in a web request to look for snippets of malicious SQL code.
     * 
     */
    public SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch fieldToMatch() {
        return this.fieldToMatch;
    }
    /**
     * @return Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * If you specify a transformation, AWS WAF performs the transformation on `field_to_match` before inspecting a request for a match.
     * e.g., `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_regional_SqlInjectionMatchTuple.html#WAF-Type-regional_SqlInjectionMatchTuple-TextTransformation)
     * for all supported values.
     * 
     */
    public String textTransformation() {
        return this.textTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlInjectionMatchSetSqlInjectionMatchTuple defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch fieldToMatch;
        private String textTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlInjectionMatchSetSqlInjectionMatchTuple defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformation = defaults.textTransformation;
        }

        public Builder fieldToMatch(SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatch fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }
        public Builder textTransformation(String textTransformation) {
            this.textTransformation = Objects.requireNonNull(textTransformation);
            return this;
        }        public SqlInjectionMatchSetSqlInjectionMatchTuple build() {
            return new SqlInjectionMatchSetSqlInjectionMatchTuple(fieldToMatch, textTransformation);
        }
    }
}
