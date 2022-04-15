// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionEndpointInput;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class DataQualityJobDefinitionDataQualityJobInput {
    private final DataQualityJobDefinitionEndpointInput endpointInput;

    @CustomType.Constructor
    private DataQualityJobDefinitionDataQualityJobInput(@CustomType.Parameter("endpointInput") DataQualityJobDefinitionEndpointInput endpointInput) {
        this.endpointInput = endpointInput;
    }

    public DataQualityJobDefinitionEndpointInput endpointInput() {
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

        public Builder endpointInput(DataQualityJobDefinitionEndpointInput endpointInput) {
            this.endpointInput = Objects.requireNonNull(endpointInput);
            return this;
        }        public DataQualityJobDefinitionDataQualityJobInput build() {
            return new DataQualityJobDefinitionDataQualityJobInput(endpointInput);
        }
    }
}
