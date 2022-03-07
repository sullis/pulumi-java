// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1_StudyConfig_MetricSpecResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1_StudyConfig_ParameterSpecResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__AutomatedStoppingConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1__StudyConfigResponse {
    /**
     * The search algorithm specified for the study.
     * 
     */
    private final String algorithm;
    /**
     * Configuration for automated stopping of unpromising Trials.
     * 
     */
    private final GoogleCloudMlV1__AutomatedStoppingConfigResponse automatedStoppingConfig;
    /**
     * Metric specs for the study.
     * 
     */
    private final List<GoogleCloudMlV1_StudyConfig_MetricSpecResponse> metrics;
    /**
     * The set of parameters to tune.
     * 
     */
    private final List<GoogleCloudMlV1_StudyConfig_ParameterSpecResponse> parameters;

    @OutputCustomType.Constructor({"algorithm","automatedStoppingConfig","metrics","parameters"})
    private GoogleCloudMlV1__StudyConfigResponse(
        String algorithm,
        GoogleCloudMlV1__AutomatedStoppingConfigResponse automatedStoppingConfig,
        List<GoogleCloudMlV1_StudyConfig_MetricSpecResponse> metrics,
        List<GoogleCloudMlV1_StudyConfig_ParameterSpecResponse> parameters) {
        this.algorithm = Objects.requireNonNull(algorithm);
        this.automatedStoppingConfig = Objects.requireNonNull(automatedStoppingConfig);
        this.metrics = Objects.requireNonNull(metrics);
        this.parameters = Objects.requireNonNull(parameters);
    }

    /**
     * The search algorithm specified for the study.
     * 
    */
    public String getAlgorithm() {
        return this.algorithm;
    }
    /**
     * Configuration for automated stopping of unpromising Trials.
     * 
    */
    public GoogleCloudMlV1__AutomatedStoppingConfigResponse getAutomatedStoppingConfig() {
        return this.automatedStoppingConfig;
    }
    /**
     * Metric specs for the study.
     * 
    */
    public List<GoogleCloudMlV1_StudyConfig_MetricSpecResponse> getMetrics() {
        return this.metrics;
    }
    /**
     * The set of parameters to tune.
     * 
    */
    public List<GoogleCloudMlV1_StudyConfig_ParameterSpecResponse> getParameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__StudyConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private GoogleCloudMlV1__AutomatedStoppingConfigResponse automatedStoppingConfig;
        private List<GoogleCloudMlV1_StudyConfig_MetricSpecResponse> metrics;
        private List<GoogleCloudMlV1_StudyConfig_ParameterSpecResponse> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__StudyConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.automatedStoppingConfig = defaults.automatedStoppingConfig;
    	      this.metrics = defaults.metrics;
    	      this.parameters = defaults.parameters;
        }

        public Builder setAlgorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder setAutomatedStoppingConfig(GoogleCloudMlV1__AutomatedStoppingConfigResponse automatedStoppingConfig) {
            this.automatedStoppingConfig = Objects.requireNonNull(automatedStoppingConfig);
            return this;
        }

        public Builder setMetrics(List<GoogleCloudMlV1_StudyConfig_MetricSpecResponse> metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }

        public Builder setParameters(List<GoogleCloudMlV1_StudyConfig_ParameterSpecResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public GoogleCloudMlV1__StudyConfigResponse build() {
            return new GoogleCloudMlV1__StudyConfigResponse(algorithm, automatedStoppingConfig, metrics, parameters);
        }
    }
}