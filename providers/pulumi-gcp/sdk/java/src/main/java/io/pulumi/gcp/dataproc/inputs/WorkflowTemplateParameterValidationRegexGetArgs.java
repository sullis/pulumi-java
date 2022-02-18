// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class WorkflowTemplateParameterValidationRegexGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateParameterValidationRegexGetArgs Empty = new WorkflowTemplateParameterValidationRegexGetArgs();

    /**
     * Required. RE2 regular expressions used to validate the parameter's value. The value must match the regex in its entirety (substring matches are not sufficient).
     * 
     */
    @InputImport(name="regexes", required=true)
    private final Input<List<String>> regexes;

    public Input<List<String>> getRegexes() {
        return this.regexes;
    }

    public WorkflowTemplateParameterValidationRegexGetArgs(Input<List<String>> regexes) {
        this.regexes = Objects.requireNonNull(regexes, "expected parameter 'regexes' to be non-null");
    }

    private WorkflowTemplateParameterValidationRegexGetArgs() {
        this.regexes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateParameterValidationRegexGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> regexes;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateParameterValidationRegexGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regexes = defaults.regexes;
        }

        public Builder setRegexes(Input<List<String>> regexes) {
            this.regexes = Objects.requireNonNull(regexes);
            return this;
        }

        public Builder setRegexes(List<String> regexes) {
            this.regexes = Input.of(Objects.requireNonNull(regexes));
            return this;
        }

        public WorkflowTemplateParameterValidationRegexGetArgs build() {
            return new WorkflowTemplateParameterValidationRegexGetArgs(regexes);
        }
    }
}
