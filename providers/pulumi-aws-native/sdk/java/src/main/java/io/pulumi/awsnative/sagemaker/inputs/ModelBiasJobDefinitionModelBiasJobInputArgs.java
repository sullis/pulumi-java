// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.ModelBiasJobDefinitionEndpointInputArgs;
import io.pulumi.awsnative.sagemaker.inputs.ModelBiasJobDefinitionMonitoringGroundTruthS3InputArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


/**
 * The inputs for a monitoring job.
 * 
 */
public final class ModelBiasJobDefinitionModelBiasJobInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelBiasJobDefinitionModelBiasJobInputArgs Empty = new ModelBiasJobDefinitionModelBiasJobInputArgs();

    @Import(name="endpointInput", required=true)
      private final Output<ModelBiasJobDefinitionEndpointInputArgs> endpointInput;

    public Output<ModelBiasJobDefinitionEndpointInputArgs> endpointInput() {
        return this.endpointInput;
    }

    @Import(name="groundTruthS3Input", required=true)
      private final Output<ModelBiasJobDefinitionMonitoringGroundTruthS3InputArgs> groundTruthS3Input;

    public Output<ModelBiasJobDefinitionMonitoringGroundTruthS3InputArgs> groundTruthS3Input() {
        return this.groundTruthS3Input;
    }

    public ModelBiasJobDefinitionModelBiasJobInputArgs(
        Output<ModelBiasJobDefinitionEndpointInputArgs> endpointInput,
        Output<ModelBiasJobDefinitionMonitoringGroundTruthS3InputArgs> groundTruthS3Input) {
        this.endpointInput = Objects.requireNonNull(endpointInput, "expected parameter 'endpointInput' to be non-null");
        this.groundTruthS3Input = Objects.requireNonNull(groundTruthS3Input, "expected parameter 'groundTruthS3Input' to be non-null");
    }

    private ModelBiasJobDefinitionModelBiasJobInputArgs() {
        this.endpointInput = Codegen.empty();
        this.groundTruthS3Input = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelBiasJobDefinitionModelBiasJobInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ModelBiasJobDefinitionEndpointInputArgs> endpointInput;
        private Output<ModelBiasJobDefinitionMonitoringGroundTruthS3InputArgs> groundTruthS3Input;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelBiasJobDefinitionModelBiasJobInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointInput = defaults.endpointInput;
    	      this.groundTruthS3Input = defaults.groundTruthS3Input;
        }

        public Builder endpointInput(Output<ModelBiasJobDefinitionEndpointInputArgs> endpointInput) {
            this.endpointInput = Objects.requireNonNull(endpointInput);
            return this;
        }
        public Builder endpointInput(ModelBiasJobDefinitionEndpointInputArgs endpointInput) {
            this.endpointInput = Output.of(Objects.requireNonNull(endpointInput));
            return this;
        }
        public Builder groundTruthS3Input(Output<ModelBiasJobDefinitionMonitoringGroundTruthS3InputArgs> groundTruthS3Input) {
            this.groundTruthS3Input = Objects.requireNonNull(groundTruthS3Input);
            return this;
        }
        public Builder groundTruthS3Input(ModelBiasJobDefinitionMonitoringGroundTruthS3InputArgs groundTruthS3Input) {
            this.groundTruthS3Input = Output.of(Objects.requireNonNull(groundTruthS3Input));
            return this;
        }        public ModelBiasJobDefinitionModelBiasJobInputArgs build() {
            return new ModelBiasJobDefinitionModelBiasJobInputArgs(endpointInput, groundTruthS3Input);
        }
    }
}
