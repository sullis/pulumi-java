// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLFieldToMatchArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLTextTransformationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class WebACLRegexMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLRegexMatchStatementArgs Empty = new WebACLRegexMatchStatementArgs();

    @Import(name="fieldToMatch", required=true)
      private final Output<WebACLFieldToMatchArgs> fieldToMatch;

    public Output<WebACLFieldToMatchArgs> fieldToMatch() {
        return this.fieldToMatch;
    }

    @Import(name="regexString", required=true)
      private final Output<String> regexString;

    public Output<String> regexString() {
        return this.regexString;
    }

    @Import(name="textTransformations", required=true)
      private final Output<List<WebACLTextTransformationArgs>> textTransformations;

    public Output<List<WebACLTextTransformationArgs>> textTransformations() {
        return this.textTransformations;
    }

    public WebACLRegexMatchStatementArgs(
        Output<WebACLFieldToMatchArgs> fieldToMatch,
        Output<String> regexString,
        Output<List<WebACLTextTransformationArgs>> textTransformations) {
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.regexString = Objects.requireNonNull(regexString, "expected parameter 'regexString' to be non-null");
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebACLRegexMatchStatementArgs() {
        this.fieldToMatch = Codegen.empty();
        this.regexString = Codegen.empty();
        this.textTransformations = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLRegexMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<WebACLFieldToMatchArgs> fieldToMatch;
        private Output<String> regexString;
        private Output<List<WebACLTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLRegexMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.regexString = defaults.regexString;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(Output<WebACLFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }
        public Builder fieldToMatch(WebACLFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Output.of(Objects.requireNonNull(fieldToMatch));
            return this;
        }
        public Builder regexString(Output<String> regexString) {
            this.regexString = Objects.requireNonNull(regexString);
            return this;
        }
        public Builder regexString(String regexString) {
            this.regexString = Output.of(Objects.requireNonNull(regexString));
            return this;
        }
        public Builder textTransformations(Output<List<WebACLTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(List<WebACLTextTransformationArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public Builder textTransformations(WebACLTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public WebACLRegexMatchStatementArgs build() {
            return new WebACLRegexMatchStatementArgs(fieldToMatch, regexString, textTransformations);
        }
    }
}
