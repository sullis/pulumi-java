// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * An observed value of a metric.
 * 
 */
public final class GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse Empty = new GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse();

    /**
     * The objective value at this training step.
     * 
     */
    @Import(name="objectiveValue", required=true)
    private Double objectiveValue;

    /**
     * @return The objective value at this training step.
     * 
     */
    public Double objectiveValue() {
        return this.objectiveValue;
    }

    /**
     * The global training step for this metric.
     * 
     */
    @Import(name="trainingStep", required=true)
    private String trainingStep;

    /**
     * @return The global training step for this metric.
     * 
     */
    public String trainingStep() {
        return this.trainingStep;
    }

    private GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse() {}

    private GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse(GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse $) {
        this.objectiveValue = $.objectiveValue;
        this.trainingStep = $.trainingStep;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse $;

        public Builder() {
            $ = new GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse();
        }

        public Builder(GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse defaults) {
            $ = new GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param objectiveValue The objective value at this training step.
         * 
         * @return builder
         * 
         */
        public Builder objectiveValue(Double objectiveValue) {
            $.objectiveValue = objectiveValue;
            return this;
        }

        /**
         * @param trainingStep The global training step for this metric.
         * 
         * @return builder
         * 
         */
        public Builder trainingStep(String trainingStep) {
            $.trainingStep = trainingStep;
            return this;
        }

        public GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse build() {
            $.objectiveValue = Objects.requireNonNull($.objectiveValue, "expected parameter 'objectiveValue' to be non-null");
            $.trainingStep = Objects.requireNonNull($.trainingStep, "expected parameter 'trainingStep' to be non-null");
            return $;
        }
    }

}
