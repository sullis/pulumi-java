// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.inputs;

import io.pulumi.aws.wafregional.inputs.XssMatchSetXssMatchTupleFieldToMatchGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class XssMatchSetXssMatchTupleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final XssMatchSetXssMatchTupleGetArgs Empty = new XssMatchSetXssMatchTupleGetArgs();

    /**
     * Specifies where in a web request to look for cross-site scripting attacks.
     * 
     */
    @Import(name="fieldToMatch", required=true)
      private final Output<XssMatchSetXssMatchTupleFieldToMatchGetArgs> fieldToMatch;

    public Output<XssMatchSetXssMatchTupleFieldToMatchGetArgs> fieldToMatch() {
        return this.fieldToMatch;
    }

    /**
     * Which text transformation, if any, to perform on the web request before inspecting the request for cross-site scripting attacks.
     * 
     */
    @Import(name="textTransformation", required=true)
      private final Output<String> textTransformation;

    public Output<String> textTransformation() {
        return this.textTransformation;
    }

    public XssMatchSetXssMatchTupleGetArgs(
        Output<XssMatchSetXssMatchTupleFieldToMatchGetArgs> fieldToMatch,
        Output<String> textTransformation) {
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.textTransformation = Objects.requireNonNull(textTransformation, "expected parameter 'textTransformation' to be non-null");
    }

    private XssMatchSetXssMatchTupleGetArgs() {
        this.fieldToMatch = Codegen.empty();
        this.textTransformation = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(XssMatchSetXssMatchTupleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<XssMatchSetXssMatchTupleFieldToMatchGetArgs> fieldToMatch;
        private Output<String> textTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(XssMatchSetXssMatchTupleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformation = defaults.textTransformation;
        }

        public Builder fieldToMatch(Output<XssMatchSetXssMatchTupleFieldToMatchGetArgs> fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }
        public Builder fieldToMatch(XssMatchSetXssMatchTupleFieldToMatchGetArgs fieldToMatch) {
            this.fieldToMatch = Output.of(Objects.requireNonNull(fieldToMatch));
            return this;
        }
        public Builder textTransformation(Output<String> textTransformation) {
            this.textTransformation = Objects.requireNonNull(textTransformation);
            return this;
        }
        public Builder textTransformation(String textTransformation) {
            this.textTransformation = Output.of(Objects.requireNonNull(textTransformation));
            return this;
        }        public XssMatchSetXssMatchTupleGetArgs build() {
            return new XssMatchSetXssMatchTupleGetArgs(fieldToMatch, textTransformation);
        }
    }
}
