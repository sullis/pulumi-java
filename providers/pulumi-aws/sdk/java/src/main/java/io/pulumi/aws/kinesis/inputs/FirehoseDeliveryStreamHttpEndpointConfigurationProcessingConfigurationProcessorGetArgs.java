// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorGetArgs Empty = new FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorGetArgs();

    /**
     * Array of processor parameters. More details are given below
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterGetArgs>> parameters;

    public Output<List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterGetArgs>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * The type of processor. Valid Values: `Lambda`
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorGetArgs(
        @Nullable Output<List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterGetArgs>> parameters,
        Output<String> type) {
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorGetArgs() {
        this.parameters = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterGetArgs>> parameters;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder parameters(@Nullable Output<List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterGetArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterGetArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder parameters(FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterGetArgs... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorGetArgs build() {
            return new FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorGetArgs(parameters, type);
        }
    }
}
