// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.outputs;

import com.pulumi.azurenative.costmanagement.outputs.ExportExecutionResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ExportExecutionListResultResponse {
    /**
     * @return A list of export executions.
     * 
     */
    private final List<ExportExecutionResponse> value;

    @CustomType.Constructor
    private ExportExecutionListResultResponse(@CustomType.Parameter("value") List<ExportExecutionResponse> value) {
        this.value = value;
    }

    /**
     * @return A list of export executions.
     * 
     */
    public List<ExportExecutionResponse> value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportExecutionListResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ExportExecutionResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportExecutionListResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(List<ExportExecutionResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(ExportExecutionResponse... value) {
            return value(List.of(value));
        }        public ExportExecutionListResultResponse build() {
            return new ExportExecutionListResultResponse(value);
        }
    }
}
