// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An observed value of a metric.
 * 
 */
public final class GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs Empty = new GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs();

    /**
     * The objective value at this training step.
     * 
     */
    @Import(name="objectiveValue")
    private @Nullable Output<Double> objectiveValue;

    /**
     * @return The objective value at this training step.
     * 
     */
    public Optional<Output<Double>> objectiveValue() {
        return Optional.ofNullable(this.objectiveValue);
    }

    /**
     * The global training step for this metric.
     * 
     */
    @Import(name="trainingStep")
    private @Nullable Output<String> trainingStep;

    /**
     * @return The global training step for this metric.
     * 
     */
    public Optional<Output<String>> trainingStep() {
        return Optional.ofNullable(this.trainingStep);
    }

    private GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs() {}

    private GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs(GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs $) {
        this.objectiveValue = $.objectiveValue;
        this.trainingStep = $.trainingStep;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs $;

        public Builder() {
            $ = new GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs();
        }

        public Builder(GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs defaults) {
            $ = new GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param objectiveValue The objective value at this training step.
         * 
         * @return builder
         * 
         */
        public Builder objectiveValue(@Nullable Output<Double> objectiveValue) {
            $.objectiveValue = objectiveValue;
            return this;
        }

        /**
         * @param objectiveValue The objective value at this training step.
         * 
         * @return builder
         * 
         */
        public Builder objectiveValue(Double objectiveValue) {
            return objectiveValue(Output.of(objectiveValue));
        }

        /**
         * @param trainingStep The global training step for this metric.
         * 
         * @return builder
         * 
         */
        public Builder trainingStep(@Nullable Output<String> trainingStep) {
            $.trainingStep = trainingStep;
            return this;
        }

        /**
         * @param trainingStep The global training step for this metric.
         * 
         * @return builder
         * 
         */
        public Builder trainingStep(String trainingStep) {
            return trainingStep(Output.of(trainingStep));
        }

        public GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs build() {
            return $;
        }
    }

}
