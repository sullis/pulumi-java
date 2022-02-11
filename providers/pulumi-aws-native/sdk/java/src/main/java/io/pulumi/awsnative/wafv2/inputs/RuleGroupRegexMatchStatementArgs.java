// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupFieldToMatchArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupTextTransformationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRegexMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRegexMatchStatementArgs Empty = new RuleGroupRegexMatchStatementArgs();

    @InputImport(name="fieldToMatch", required=true)
    private final Input<RuleGroupFieldToMatchArgs> fieldToMatch;

    public Input<RuleGroupFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch;
    }

    @InputImport(name="regexString", required=true)
    private final Input<String> regexString;

    public Input<String> getRegexString() {
        return this.regexString;
    }

    @InputImport(name="textTransformations", required=true)
    private final Input<List<RuleGroupTextTransformationArgs>> textTransformations;

    public Input<List<RuleGroupTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public RuleGroupRegexMatchStatementArgs(
        Input<RuleGroupFieldToMatchArgs> fieldToMatch,
        Input<String> regexString,
        Input<List<RuleGroupTextTransformationArgs>> textTransformations) {
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.regexString = Objects.requireNonNull(regexString, "expected parameter 'regexString' to be non-null");
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private RuleGroupRegexMatchStatementArgs() {
        this.fieldToMatch = Input.empty();
        this.regexString = Input.empty();
        this.textTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRegexMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<RuleGroupFieldToMatchArgs> fieldToMatch;
        private Input<String> regexString;
        private Input<List<RuleGroupTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRegexMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.regexString = defaults.regexString;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setFieldToMatch(Input<RuleGroupFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder setFieldToMatch(RuleGroupFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Input.of(Objects.requireNonNull(fieldToMatch));
            return this;
        }

        public Builder setRegexString(Input<String> regexString) {
            this.regexString = Objects.requireNonNull(regexString);
            return this;
        }

        public Builder setRegexString(String regexString) {
            this.regexString = Input.of(Objects.requireNonNull(regexString));
            return this;
        }

        public Builder setTextTransformations(Input<List<RuleGroupTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder setTextTransformations(List<RuleGroupTextTransformationArgs> textTransformations) {
            this.textTransformations = Input.of(Objects.requireNonNull(textTransformations));
            return this;
        }

        public RuleGroupRegexMatchStatementArgs build() {
            return new RuleGroupRegexMatchStatementArgs(fieldToMatch, regexString, textTransformations);
        }
    }
}
