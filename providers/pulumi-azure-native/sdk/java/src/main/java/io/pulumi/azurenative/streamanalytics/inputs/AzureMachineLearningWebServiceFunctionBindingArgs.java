// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.azurenative.streamanalytics.inputs.AzureMachineLearningWebServiceInputsArgs;
import io.pulumi.azurenative.streamanalytics.inputs.AzureMachineLearningWebServiceOutputColumnArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The binding to an Azure Machine Learning web service.
 * 
 */
public final class AzureMachineLearningWebServiceFunctionBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureMachineLearningWebServiceFunctionBindingArgs Empty = new AzureMachineLearningWebServiceFunctionBindingArgs();

    /**
     * The API key used to authenticate with Request-Response endpoint.
     * 
     */
    @InputImport(name="apiKey")
    private final @Nullable Input<String> apiKey;

    public Input<String> getApiKey() {
        return this.apiKey == null ? Input.empty() : this.apiKey;
    }

    /**
     * Number between 1 and 10000 describing maximum number of rows for every Azure ML RRS execute request. Default is 1000.
     * 
     */
    @InputImport(name="batchSize")
    private final @Nullable Input<Integer> batchSize;

    public Input<Integer> getBatchSize() {
        return this.batchSize == null ? Input.empty() : this.batchSize;
    }

    /**
     * The Request-Response execute endpoint of the Azure Machine Learning web service. Find out more here: https://docs.microsoft.com/en-us/azure/machine-learning/machine-learning-consume-web-services#request-response-service-rrs
     * 
     */
    @InputImport(name="endpoint")
    private final @Nullable Input<String> endpoint;

    public Input<String> getEndpoint() {
        return this.endpoint == null ? Input.empty() : this.endpoint;
    }

    /**
     * The inputs for the Azure Machine Learning web service endpoint.
     * 
     */
    @InputImport(name="inputs")
    private final @Nullable Input<AzureMachineLearningWebServiceInputsArgs> inputs;

    public Input<AzureMachineLearningWebServiceInputsArgs> getInputs() {
        return this.inputs == null ? Input.empty() : this.inputs;
    }

    /**
     * A list of outputs from the Azure Machine Learning web service endpoint execution.
     * 
     */
    @InputImport(name="outputs")
    private final @Nullable Input<List<AzureMachineLearningWebServiceOutputColumnArgs>> outputs;

    public Input<List<AzureMachineLearningWebServiceOutputColumnArgs>> getOutputs() {
        return this.outputs == null ? Input.empty() : this.outputs;
    }

    /**
     * Indicates the function binding type.
     * Expected value is 'Microsoft.MachineLearning/WebService'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public AzureMachineLearningWebServiceFunctionBindingArgs(
        @Nullable Input<String> apiKey,
        @Nullable Input<Integer> batchSize,
        @Nullable Input<String> endpoint,
        @Nullable Input<AzureMachineLearningWebServiceInputsArgs> inputs,
        @Nullable Input<List<AzureMachineLearningWebServiceOutputColumnArgs>> outputs,
        Input<String> type) {
        this.apiKey = apiKey;
        this.batchSize = batchSize;
        this.endpoint = endpoint;
        this.inputs = inputs;
        this.outputs = outputs;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureMachineLearningWebServiceFunctionBindingArgs() {
        this.apiKey = Input.empty();
        this.batchSize = Input.empty();
        this.endpoint = Input.empty();
        this.inputs = Input.empty();
        this.outputs = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMachineLearningWebServiceFunctionBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiKey;
        private @Nullable Input<Integer> batchSize;
        private @Nullable Input<String> endpoint;
        private @Nullable Input<AzureMachineLearningWebServiceInputsArgs> inputs;
        private @Nullable Input<List<AzureMachineLearningWebServiceOutputColumnArgs>> outputs;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMachineLearningWebServiceFunctionBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.batchSize = defaults.batchSize;
    	      this.endpoint = defaults.endpoint;
    	      this.inputs = defaults.inputs;
    	      this.outputs = defaults.outputs;
    	      this.type = defaults.type;
        }

        public Builder setApiKey(@Nullable Input<String> apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public Builder setApiKey(@Nullable String apiKey) {
            this.apiKey = Input.ofNullable(apiKey);
            return this;
        }

        public Builder setBatchSize(@Nullable Input<Integer> batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        public Builder setBatchSize(@Nullable Integer batchSize) {
            this.batchSize = Input.ofNullable(batchSize);
            return this;
        }

        public Builder setEndpoint(@Nullable Input<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = Input.ofNullable(endpoint);
            return this;
        }

        public Builder setInputs(@Nullable Input<AzureMachineLearningWebServiceInputsArgs> inputs) {
            this.inputs = inputs;
            return this;
        }

        public Builder setInputs(@Nullable AzureMachineLearningWebServiceInputsArgs inputs) {
            this.inputs = Input.ofNullable(inputs);
            return this;
        }

        public Builder setOutputs(@Nullable Input<List<AzureMachineLearningWebServiceOutputColumnArgs>> outputs) {
            this.outputs = outputs;
            return this;
        }

        public Builder setOutputs(@Nullable List<AzureMachineLearningWebServiceOutputColumnArgs> outputs) {
            this.outputs = Input.ofNullable(outputs);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public AzureMachineLearningWebServiceFunctionBindingArgs build() {
            return new AzureMachineLearningWebServiceFunctionBindingArgs(apiKey, batchSize, endpoint, inputs, outputs, type);
        }
    }
}
