// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RegexPatternSetRegularExpressionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegexPatternSetRegularExpressionGetArgs Empty = new RegexPatternSetRegularExpressionGetArgs();

    /**
     * The string representing the regular expression, see the AWS WAF [documentation](https://docs.aws.amazon.com/waf/latest/developerguide/waf-regex-pattern-set-creating.html) for more information.
     * 
     */
    @Import(name="regexString", required=true)
    private Output<String> regexString;

    /**
     * @return The string representing the regular expression, see the AWS WAF [documentation](https://docs.aws.amazon.com/waf/latest/developerguide/waf-regex-pattern-set-creating.html) for more information.
     * 
     */
    public Output<String> regexString() {
        return this.regexString;
    }

    private RegexPatternSetRegularExpressionGetArgs() {}

    private RegexPatternSetRegularExpressionGetArgs(RegexPatternSetRegularExpressionGetArgs $) {
        this.regexString = $.regexString;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegexPatternSetRegularExpressionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegexPatternSetRegularExpressionGetArgs $;

        public Builder() {
            $ = new RegexPatternSetRegularExpressionGetArgs();
        }

        public Builder(RegexPatternSetRegularExpressionGetArgs defaults) {
            $ = new RegexPatternSetRegularExpressionGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param regexString The string representing the regular expression, see the AWS WAF [documentation](https://docs.aws.amazon.com/waf/latest/developerguide/waf-regex-pattern-set-creating.html) for more information.
         * 
         * @return builder
         * 
         */
        public Builder regexString(Output<String> regexString) {
            $.regexString = regexString;
            return this;
        }

        /**
         * @param regexString The string representing the regular expression, see the AWS WAF [documentation](https://docs.aws.amazon.com/waf/latest/developerguide/waf-regex-pattern-set-creating.html) for more information.
         * 
         * @return builder
         * 
         */
        public Builder regexString(String regexString) {
            return regexString(Output.of(regexString));
        }

        public RegexPatternSetRegularExpressionGetArgs build() {
            $.regexString = Objects.requireNonNull($.regexString, "expected parameter 'regexString' to be non-null");
            return $;
        }
    }

}
