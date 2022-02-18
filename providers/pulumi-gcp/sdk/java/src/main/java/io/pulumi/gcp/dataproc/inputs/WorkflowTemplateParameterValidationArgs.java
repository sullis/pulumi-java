// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterValidationRegexArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterValidationValuesArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplateParameterValidationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateParameterValidationArgs Empty = new WorkflowTemplateParameterValidationArgs();

    /**
     * Validation based on regular expressions.
     * 
     */
    @InputImport(name="regex")
    private final @Nullable Input<WorkflowTemplateParameterValidationRegexArgs> regex;

    public Input<WorkflowTemplateParameterValidationRegexArgs> getRegex() {
        return this.regex == null ? Input.empty() : this.regex;
    }

    /**
     * Optional. Corresponds to the label values of reservation resource.
     * 
     */
    @InputImport(name="values")
    private final @Nullable Input<WorkflowTemplateParameterValidationValuesArgs> values;

    public Input<WorkflowTemplateParameterValidationValuesArgs> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public WorkflowTemplateParameterValidationArgs(
        @Nullable Input<WorkflowTemplateParameterValidationRegexArgs> regex,
        @Nullable Input<WorkflowTemplateParameterValidationValuesArgs> values) {
        this.regex = regex;
        this.values = values;
    }

    private WorkflowTemplateParameterValidationArgs() {
        this.regex = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateParameterValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WorkflowTemplateParameterValidationRegexArgs> regex;
        private @Nullable Input<WorkflowTemplateParameterValidationValuesArgs> values;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateParameterValidationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regex = defaults.regex;
    	      this.values = defaults.values;
        }

        public Builder setRegex(@Nullable Input<WorkflowTemplateParameterValidationRegexArgs> regex) {
            this.regex = regex;
            return this;
        }

        public Builder setRegex(@Nullable WorkflowTemplateParameterValidationRegexArgs regex) {
            this.regex = Input.ofNullable(regex);
            return this;
        }

        public Builder setValues(@Nullable Input<WorkflowTemplateParameterValidationValuesArgs> values) {
            this.values = values;
            return this;
        }

        public Builder setValues(@Nullable WorkflowTemplateParameterValidationValuesArgs values) {
            this.values = Input.ofNullable(values);
            return this;
        }

        public WorkflowTemplateParameterValidationArgs build() {
            return new WorkflowTemplateParameterValidationArgs(regex, values);
        }
    }
}
