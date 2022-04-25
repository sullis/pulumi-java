// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.outputs;

import com.pulumi.azurenative.streamanalytics.outputs.AzureMachineLearningWebServiceInputsResponse;
import com.pulumi.azurenative.streamanalytics.outputs.AzureMachineLearningWebServiceOutputColumnResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureMachineLearningWebServiceFunctionBindingResponse {
    /**
     * @return The API key used to authenticate with Request-Response endpoint.
     * 
     */
    private final @Nullable String apiKey;
    /**
     * @return Number between 1 and 10000 describing maximum number of rows for every Azure ML RRS execute request. Default is 1000.
     * 
     */
    private final @Nullable Integer batchSize;
    /**
     * @return The Request-Response execute endpoint of the Azure Machine Learning web service. Find out more here: https://docs.microsoft.com/en-us/azure/machine-learning/machine-learning-consume-web-services#request-response-service-rrs
     * 
     */
    private final @Nullable String endpoint;
    /**
     * @return The inputs for the Azure Machine Learning web service endpoint.
     * 
     */
    private final @Nullable AzureMachineLearningWebServiceInputsResponse inputs;
    /**
     * @return A list of outputs from the Azure Machine Learning web service endpoint execution.
     * 
     */
    private final @Nullable List<AzureMachineLearningWebServiceOutputColumnResponse> outputs;
    /**
     * @return Indicates the function binding type.
     * Expected value is &#39;Microsoft.MachineLearning/WebService&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AzureMachineLearningWebServiceFunctionBindingResponse(
        @CustomType.Parameter("apiKey") @Nullable String apiKey,
        @CustomType.Parameter("batchSize") @Nullable Integer batchSize,
        @CustomType.Parameter("endpoint") @Nullable String endpoint,
        @CustomType.Parameter("inputs") @Nullable AzureMachineLearningWebServiceInputsResponse inputs,
        @CustomType.Parameter("outputs") @Nullable List<AzureMachineLearningWebServiceOutputColumnResponse> outputs,
        @CustomType.Parameter("type") String type) {
        this.apiKey = apiKey;
        this.batchSize = batchSize;
        this.endpoint = endpoint;
        this.inputs = inputs;
        this.outputs = outputs;
        this.type = type;
    }

    /**
     * @return The API key used to authenticate with Request-Response endpoint.
     * 
     */
    public Optional<String> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }
    /**
     * @return Number between 1 and 10000 describing maximum number of rows for every Azure ML RRS execute request. Default is 1000.
     * 
     */
    public Optional<Integer> batchSize() {
        return Optional.ofNullable(this.batchSize);
    }
    /**
     * @return The Request-Response execute endpoint of the Azure Machine Learning web service. Find out more here: https://docs.microsoft.com/en-us/azure/machine-learning/machine-learning-consume-web-services#request-response-service-rrs
     * 
     */
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    /**
     * @return The inputs for the Azure Machine Learning web service endpoint.
     * 
     */
    public Optional<AzureMachineLearningWebServiceInputsResponse> inputs() {
        return Optional.ofNullable(this.inputs);
    }
    /**
     * @return A list of outputs from the Azure Machine Learning web service endpoint execution.
     * 
     */
    public List<AzureMachineLearningWebServiceOutputColumnResponse> outputs() {
        return this.outputs == null ? List.of() : this.outputs;
    }
    /**
     * @return Indicates the function binding type.
     * Expected value is &#39;Microsoft.MachineLearning/WebService&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMachineLearningWebServiceFunctionBindingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiKey;
        private @Nullable Integer batchSize;
        private @Nullable String endpoint;
        private @Nullable AzureMachineLearningWebServiceInputsResponse inputs;
        private @Nullable List<AzureMachineLearningWebServiceOutputColumnResponse> outputs;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMachineLearningWebServiceFunctionBindingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.batchSize = defaults.batchSize;
    	      this.endpoint = defaults.endpoint;
    	      this.inputs = defaults.inputs;
    	      this.outputs = defaults.outputs;
    	      this.type = defaults.type;
        }

        public Builder apiKey(@Nullable String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public Builder batchSize(@Nullable Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public Builder inputs(@Nullable AzureMachineLearningWebServiceInputsResponse inputs) {
            this.inputs = inputs;
            return this;
        }
        public Builder outputs(@Nullable List<AzureMachineLearningWebServiceOutputColumnResponse> outputs) {
            this.outputs = outputs;
            return this;
        }
        public Builder outputs(AzureMachineLearningWebServiceOutputColumnResponse... outputs) {
            return outputs(List.of(outputs));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AzureMachineLearningWebServiceFunctionBindingResponse build() {
            return new AzureMachineLearningWebServiceFunctionBindingResponse(apiKey, batchSize, endpoint, inputs, outputs, type);
        }
    }
}
