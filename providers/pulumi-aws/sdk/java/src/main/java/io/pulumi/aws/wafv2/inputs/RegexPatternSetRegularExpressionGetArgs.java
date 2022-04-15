// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class RegexPatternSetRegularExpressionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegexPatternSetRegularExpressionGetArgs Empty = new RegexPatternSetRegularExpressionGetArgs();

    /**
     * The string representing the regular expression, see the AWS WAF [documentation](https://docs.aws.amazon.com/waf/latest/developerguide/waf-regex-pattern-set-creating.html) for more information.
     * 
     */
    @Import(name="regexString", required=true)
      private final Output<String> regexString;

    public Output<String> regexString() {
        return this.regexString;
    }

    public RegexPatternSetRegularExpressionGetArgs(Output<String> regexString) {
        this.regexString = Objects.requireNonNull(regexString, "expected parameter 'regexString' to be non-null");
    }

    private RegexPatternSetRegularExpressionGetArgs() {
        this.regexString = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegexPatternSetRegularExpressionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> regexString;

        public Builder() {
    	      // Empty
        }

        public Builder(RegexPatternSetRegularExpressionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regexString = defaults.regexString;
        }

        public Builder regexString(Output<String> regexString) {
            this.regexString = Objects.requireNonNull(regexString);
            return this;
        }
        public Builder regexString(String regexString) {
            this.regexString = Output.of(Objects.requireNonNull(regexString));
            return this;
        }        public RegexPatternSetRegularExpressionGetArgs build() {
            return new RegexPatternSetRegularExpressionGetArgs(regexString);
        }
    }
}
