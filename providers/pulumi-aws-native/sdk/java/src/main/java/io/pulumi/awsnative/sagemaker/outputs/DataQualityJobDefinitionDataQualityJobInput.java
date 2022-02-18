// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionEndpointInput;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class DataQualityJobDefinitionDataQualityJobInput {
    private final DataQualityJobDefinitionEndpointInput endpointInput;

    @OutputCustomType.Constructor({"endpointInput"})
    private DataQualityJobDefinitionDataQualityJobInput(DataQualityJobDefinitionEndpointInput endpointInput) {
        this.endpointInput = Objects.requireNonNull(endpointInput);
    }

    public DataQualityJobDefinitionEndpointInput getEndpointInput() {
        return this.endpointInput;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataQualityJobDefinitionDataQualityJobInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataQualityJobDefinitionEndpointInput endpointInput;

        public Builder() {
    	      // Empty
        }

        public Builder(DataQualityJobDefinitionDataQualityJobInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointInput = defaults.endpointInput;
        }

        public Builder setEndpointInput(DataQualityJobDefinitionEndpointInput endpointInput) {
            this.endpointInput = Objects.requireNonNull(endpointInput);
            return this;
        }

        public DataQualityJobDefinitionDataQualityJobInput build() {
            return new DataQualityJobDefinitionDataQualityJobInput(endpointInput);
        }
    }
}
