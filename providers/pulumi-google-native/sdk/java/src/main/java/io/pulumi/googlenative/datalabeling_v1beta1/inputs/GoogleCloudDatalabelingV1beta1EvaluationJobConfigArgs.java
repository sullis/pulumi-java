// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1BoundingPolyConfigArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1EvaluationConfigArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1HumanAnnotationConfigArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1InputConfigArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configures specific details of how a continuous evaluation job works. Provide this configuration when you create an EvaluationJob.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1EvaluationJobConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatalabelingV1beta1EvaluationJobConfigArgs Empty = new GoogleCloudDatalabelingV1beta1EvaluationJobConfigArgs();

    /**
     * Prediction keys that tell Data Labeling Service where to find the data for evaluation in your BigQuery table. When the service samples prediction input and output from your model version and saves it to BigQuery, the data gets stored as JSON strings in the BigQuery table. These keys tell Data Labeling Service how to parse the JSON. You can provide the following entries in this field: * `data_json_key`: the data key for prediction input. You must provide either this key or `reference_json_key`. * `reference_json_key`: the data reference key for prediction input. You must provide either this key or `data_json_key`. * `label_json_key`: the label key for prediction output. Required. * `label_score_json_key`: the score key for prediction output. Required. * `bounding_box_json_key`: the bounding box key for prediction output. Required if your model version perform image object detection. Learn [how to configure prediction keys](/ml-engine/docs/continuous-evaluation/create-job#prediction-keys).
     * 
     */
    @InputImport(name="bigqueryImportKeys", required=true)
      private final Input<Map<String,String>> bigqueryImportKeys;

    public Input<Map<String,String>> getBigqueryImportKeys() {
        return this.bigqueryImportKeys;
    }

    /**
     * Specify this field if your model version performs image object detection (bounding box detection). `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet.
     * 
     */
    @InputImport(name="boundingPolyConfig")
      private final @Nullable Input<GoogleCloudDatalabelingV1beta1BoundingPolyConfigArgs> boundingPolyConfig;

    public Input<GoogleCloudDatalabelingV1beta1BoundingPolyConfigArgs> getBoundingPolyConfig() {
        return this.boundingPolyConfig == null ? Input.empty() : this.boundingPolyConfig;
    }

    /**
     * Details for calculating evaluation metrics and creating Evaulations. If your model version performs image object detection, you must specify the `boundingBoxEvaluationOptions` field within this configuration. Otherwise, provide an empty object for this configuration.
     * 
     */
    @InputImport(name="evaluationConfig", required=true)
      private final Input<GoogleCloudDatalabelingV1beta1EvaluationConfigArgs> evaluationConfig;

    public Input<GoogleCloudDatalabelingV1beta1EvaluationConfigArgs> getEvaluationConfig() {
        return this.evaluationConfig;
    }

    /**
     * Optional. Configuration details for evaluation job alerts. Specify this field if you want to receive email alerts if the evaluation job finds that your predictions have low mean average precision during a run.
     * 
     */
    @InputImport(name="evaluationJobAlertConfig")
      private final @Nullable Input<GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigArgs> evaluationJobAlertConfig;

    public Input<GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigArgs> getEvaluationJobAlertConfig() {
        return this.evaluationJobAlertConfig == null ? Input.empty() : this.evaluationJobAlertConfig;
    }

    /**
     * The maximum number of predictions to sample and save to BigQuery during each evaluation interval. This limit overrides `example_sample_percentage`: even if the service has not sampled enough predictions to fulfill `example_sample_perecentage` during an interval, it stops sampling predictions when it meets this limit.
     * 
     */
    @InputImport(name="exampleCount", required=true)
      private final Input<Integer> exampleCount;

    public Input<Integer> getExampleCount() {
        return this.exampleCount;
    }

    /**
     * Fraction of predictions to sample and save to BigQuery during each evaluation interval. For example, 0.1 means 10% of predictions served by your model version get saved to BigQuery.
     * 
     */
    @InputImport(name="exampleSamplePercentage", required=true)
      private final Input<Double> exampleSamplePercentage;

    public Input<Double> getExampleSamplePercentage() {
        return this.exampleSamplePercentage;
    }

    /**
     * Optional. Details for human annotation of your data. If you set labelMissingGroundTruth to `true` for this evaluation job, then you must specify this field. If you plan to provide your own ground truth labels, then omit this field. Note that you must create an Instruction resource before you can specify this field. Provide the name of the instruction resource in the `instruction` field within this configuration.
     * 
     */
    @InputImport(name="humanAnnotationConfig")
      private final @Nullable Input<GoogleCloudDatalabelingV1beta1HumanAnnotationConfigArgs> humanAnnotationConfig;

    public Input<GoogleCloudDatalabelingV1beta1HumanAnnotationConfigArgs> getHumanAnnotationConfig() {
        return this.humanAnnotationConfig == null ? Input.empty() : this.humanAnnotationConfig;
    }

    /**
     * Specify this field if your model version performs image classification or general classification. `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet. `allowMultiLabel` in this configuration must match `classificationMetadata.isMultiLabel` in input_config.
     * 
     */
    @InputImport(name="imageClassificationConfig")
      private final @Nullable Input<GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs> imageClassificationConfig;

    public Input<GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs> getImageClassificationConfig() {
        return this.imageClassificationConfig == null ? Input.empty() : this.imageClassificationConfig;
    }

    /**
     * Rquired. Details for the sampled prediction input. Within this configuration, there are requirements for several fields: * `dataType` must be one of `IMAGE`, `TEXT`, or `GENERAL_DATA`. * `annotationType` must be one of `IMAGE_CLASSIFICATION_ANNOTATION`, `TEXT_CLASSIFICATION_ANNOTATION`, `GENERAL_CLASSIFICATION_ANNOTATION`, or `IMAGE_BOUNDING_BOX_ANNOTATION` (image object detection). * If your machine learning model performs classification, you must specify `classificationMetadata.isMultiLabel`. * You must specify `bigquerySource` (not `gcsSource`).
     * 
     */
    @InputImport(name="inputConfig")
      private final @Nullable Input<GoogleCloudDatalabelingV1beta1InputConfigArgs> inputConfig;

    public Input<GoogleCloudDatalabelingV1beta1InputConfigArgs> getInputConfig() {
        return this.inputConfig == null ? Input.empty() : this.inputConfig;
    }

    /**
     * Specify this field if your model version performs text classification. `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet. `allowMultiLabel` in this configuration must match `classificationMetadata.isMultiLabel` in input_config.
     * 
     */
    @InputImport(name="textClassificationConfig")
      private final @Nullable Input<GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs> textClassificationConfig;

    public Input<GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs> getTextClassificationConfig() {
        return this.textClassificationConfig == null ? Input.empty() : this.textClassificationConfig;
    }

    public GoogleCloudDatalabelingV1beta1EvaluationJobConfigArgs(
        Input<Map<String,String>> bigqueryImportKeys,
        @Nullable Input<GoogleCloudDatalabelingV1beta1BoundingPolyConfigArgs> boundingPolyConfig,
        Input<GoogleCloudDatalabelingV1beta1EvaluationConfigArgs> evaluationConfig,
        @Nullable Input<GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigArgs> evaluationJobAlertConfig,
        Input<Integer> exampleCount,
        Input<Double> exampleSamplePercentage,
        @Nullable Input<GoogleCloudDatalabelingV1beta1HumanAnnotationConfigArgs> humanAnnotationConfig,
        @Nullable Input<GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs> imageClassificationConfig,
        @Nullable Input<GoogleCloudDatalabelingV1beta1InputConfigArgs> inputConfig,
        @Nullable Input<GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs> textClassificationConfig) {
        this.bigqueryImportKeys = Objects.requireNonNull(bigqueryImportKeys, "expected parameter 'bigqueryImportKeys' to be non-null");
        this.boundingPolyConfig = boundingPolyConfig;
        this.evaluationConfig = Objects.requireNonNull(evaluationConfig, "expected parameter 'evaluationConfig' to be non-null");
        this.evaluationJobAlertConfig = evaluationJobAlertConfig;
        this.exampleCount = Objects.requireNonNull(exampleCount, "expected parameter 'exampleCount' to be non-null");
        this.exampleSamplePercentage = Objects.requireNonNull(exampleSamplePercentage, "expected parameter 'exampleSamplePercentage' to be non-null");
        this.humanAnnotationConfig = humanAnnotationConfig;
        this.imageClassificationConfig = imageClassificationConfig;
        this.inputConfig = inputConfig;
        this.textClassificationConfig = textClassificationConfig;
    }

    private GoogleCloudDatalabelingV1beta1EvaluationJobConfigArgs() {
        this.bigqueryImportKeys = Input.empty();
        this.boundingPolyConfig = Input.empty();
        this.evaluationConfig = Input.empty();
        this.evaluationJobAlertConfig = Input.empty();
        this.exampleCount = Input.empty();
        this.exampleSamplePercentage = Input.empty();
        this.humanAnnotationConfig = Input.empty();
        this.imageClassificationConfig = Input.empty();
        this.inputConfig = Input.empty();
        this.textClassificationConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1EvaluationJobConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Map<String,String>> bigqueryImportKeys;
        private @Nullable Input<GoogleCloudDatalabelingV1beta1BoundingPolyConfigArgs> boundingPolyConfig;
        private Input<GoogleCloudDatalabelingV1beta1EvaluationConfigArgs> evaluationConfig;
        private @Nullable Input<GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigArgs> evaluationJobAlertConfig;
        private Input<Integer> exampleCount;
        private Input<Double> exampleSamplePercentage;
        private @Nullable Input<GoogleCloudDatalabelingV1beta1HumanAnnotationConfigArgs> humanAnnotationConfig;
        private @Nullable Input<GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs> imageClassificationConfig;
        private @Nullable Input<GoogleCloudDatalabelingV1beta1InputConfigArgs> inputConfig;
        private @Nullable Input<GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs> textClassificationConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1EvaluationJobConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryImportKeys = defaults.bigqueryImportKeys;
    	      this.boundingPolyConfig = defaults.boundingPolyConfig;
    	      this.evaluationConfig = defaults.evaluationConfig;
    	      this.evaluationJobAlertConfig = defaults.evaluationJobAlertConfig;
    	      this.exampleCount = defaults.exampleCount;
    	      this.exampleSamplePercentage = defaults.exampleSamplePercentage;
    	      this.humanAnnotationConfig = defaults.humanAnnotationConfig;
    	      this.imageClassificationConfig = defaults.imageClassificationConfig;
    	      this.inputConfig = defaults.inputConfig;
    	      this.textClassificationConfig = defaults.textClassificationConfig;
        }

        public Builder setBigqueryImportKeys(Input<Map<String,String>> bigqueryImportKeys) {
            this.bigqueryImportKeys = Objects.requireNonNull(bigqueryImportKeys);
            return this;
        }

        public Builder setBigqueryImportKeys(Map<String,String> bigqueryImportKeys) {
            this.bigqueryImportKeys = Input.of(Objects.requireNonNull(bigqueryImportKeys));
            return this;
        }

        public Builder setBoundingPolyConfig(@Nullable Input<GoogleCloudDatalabelingV1beta1BoundingPolyConfigArgs> boundingPolyConfig) {
            this.boundingPolyConfig = boundingPolyConfig;
            return this;
        }

        public Builder setBoundingPolyConfig(@Nullable GoogleCloudDatalabelingV1beta1BoundingPolyConfigArgs boundingPolyConfig) {
            this.boundingPolyConfig = Input.ofNullable(boundingPolyConfig);
            return this;
        }

        public Builder setEvaluationConfig(Input<GoogleCloudDatalabelingV1beta1EvaluationConfigArgs> evaluationConfig) {
            this.evaluationConfig = Objects.requireNonNull(evaluationConfig);
            return this;
        }

        public Builder setEvaluationConfig(GoogleCloudDatalabelingV1beta1EvaluationConfigArgs evaluationConfig) {
            this.evaluationConfig = Input.of(Objects.requireNonNull(evaluationConfig));
            return this;
        }

        public Builder setEvaluationJobAlertConfig(@Nullable Input<GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigArgs> evaluationJobAlertConfig) {
            this.evaluationJobAlertConfig = evaluationJobAlertConfig;
            return this;
        }

        public Builder setEvaluationJobAlertConfig(@Nullable GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigArgs evaluationJobAlertConfig) {
            this.evaluationJobAlertConfig = Input.ofNullable(evaluationJobAlertConfig);
            return this;
        }

        public Builder setExampleCount(Input<Integer> exampleCount) {
            this.exampleCount = Objects.requireNonNull(exampleCount);
            return this;
        }

        public Builder setExampleCount(Integer exampleCount) {
            this.exampleCount = Input.of(Objects.requireNonNull(exampleCount));
            return this;
        }

        public Builder setExampleSamplePercentage(Input<Double> exampleSamplePercentage) {
            this.exampleSamplePercentage = Objects.requireNonNull(exampleSamplePercentage);
            return this;
        }

        public Builder setExampleSamplePercentage(Double exampleSamplePercentage) {
            this.exampleSamplePercentage = Input.of(Objects.requireNonNull(exampleSamplePercentage));
            return this;
        }

        public Builder setHumanAnnotationConfig(@Nullable Input<GoogleCloudDatalabelingV1beta1HumanAnnotationConfigArgs> humanAnnotationConfig) {
            this.humanAnnotationConfig = humanAnnotationConfig;
            return this;
        }

        public Builder setHumanAnnotationConfig(@Nullable GoogleCloudDatalabelingV1beta1HumanAnnotationConfigArgs humanAnnotationConfig) {
            this.humanAnnotationConfig = Input.ofNullable(humanAnnotationConfig);
            return this;
        }

        public Builder setImageClassificationConfig(@Nullable Input<GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs> imageClassificationConfig) {
            this.imageClassificationConfig = imageClassificationConfig;
            return this;
        }

        public Builder setImageClassificationConfig(@Nullable GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs imageClassificationConfig) {
            this.imageClassificationConfig = Input.ofNullable(imageClassificationConfig);
            return this;
        }

        public Builder setInputConfig(@Nullable Input<GoogleCloudDatalabelingV1beta1InputConfigArgs> inputConfig) {
            this.inputConfig = inputConfig;
            return this;
        }

        public Builder setInputConfig(@Nullable GoogleCloudDatalabelingV1beta1InputConfigArgs inputConfig) {
            this.inputConfig = Input.ofNullable(inputConfig);
            return this;
        }

        public Builder setTextClassificationConfig(@Nullable Input<GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs> textClassificationConfig) {
            this.textClassificationConfig = textClassificationConfig;
            return this;
        }

        public Builder setTextClassificationConfig(@Nullable GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs textClassificationConfig) {
            this.textClassificationConfig = Input.ofNullable(textClassificationConfig);
            return this;
        }
        public GoogleCloudDatalabelingV1beta1EvaluationJobConfigArgs build() {
            return new GoogleCloudDatalabelingV1beta1EvaluationJobConfigArgs(bigqueryImportKeys, boundingPolyConfig, evaluationConfig, evaluationJobAlertConfig, exampleCount, exampleSamplePercentage, humanAnnotationConfig, imageClassificationConfig, inputConfig, textClassificationConfig);
        }
    }
}