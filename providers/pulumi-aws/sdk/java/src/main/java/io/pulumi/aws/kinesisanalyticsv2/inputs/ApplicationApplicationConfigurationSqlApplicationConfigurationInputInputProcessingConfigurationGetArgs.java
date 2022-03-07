// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationGetArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationGetArgs();

    /**
     * Describes the Lambda function that is used to preprocess the records in the stream before being processed by your application code.
     * 
     */
    @InputImport(name="inputLambdaProcessor", required=true)
      private final Input<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorGetArgs> inputLambdaProcessor;

    public Input<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorGetArgs> getInputLambdaProcessor() {
        return this.inputLambdaProcessor;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationGetArgs(Input<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorGetArgs> inputLambdaProcessor) {
        this.inputLambdaProcessor = Objects.requireNonNull(inputLambdaProcessor, "expected parameter 'inputLambdaProcessor' to be non-null");
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationGetArgs() {
        this.inputLambdaProcessor = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorGetArgs> inputLambdaProcessor;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputLambdaProcessor = defaults.inputLambdaProcessor;
        }

        public Builder setInputLambdaProcessor(Input<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorGetArgs> inputLambdaProcessor) {
            this.inputLambdaProcessor = Objects.requireNonNull(inputLambdaProcessor);
            return this;
        }

        public Builder setInputLambdaProcessor(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessorGetArgs inputLambdaProcessor) {
            this.inputLambdaProcessor = Input.of(Objects.requireNonNull(inputLambdaProcessor));
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationGetArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationGetArgs(inputLambdaProcessor);
        }
    }
}