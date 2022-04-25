// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WorkflowTemplateParameterValidationValues {
    /**
     * @return Optional. Corresponds to the label values of reservation resource.
     * 
     */
    private final List<String> values;

    @CustomType.Constructor
    private WorkflowTemplateParameterValidationValues(@CustomType.Parameter("values") List<String> values) {
        this.values = values;
    }

    /**
     * @return Optional. Corresponds to the label values of reservation resource.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateParameterValidationValues defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateParameterValidationValues defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public WorkflowTemplateParameterValidationValues build() {
            return new WorkflowTemplateParameterValidationValues(values);
        }
    }
}
