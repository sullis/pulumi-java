// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datalabeling_v1beta1.outputs.GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse;
import io.pulumi.googlenative.datalabeling_v1beta1.outputs.GoogleCloudDatalabelingV1beta1EvaluationConfigResponse;
import io.pulumi.googlenative.datalabeling_v1beta1.outputs.GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigResponse;
import io.pulumi.googlenative.datalabeling_v1beta1.outputs.GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse;
import io.pulumi.googlenative.datalabeling_v1beta1.outputs.GoogleCloudDatalabelingV1beta1ImageClassificationConfigResponse;
import io.pulumi.googlenative.datalabeling_v1beta1.outputs.GoogleCloudDatalabelingV1beta1InputConfigResponse;
import io.pulumi.googlenative.datalabeling_v1beta1.outputs.GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse {
    /**
     * Prediction keys that tell Data Labeling Service where to find the data for evaluation in your BigQuery table. When the service samples prediction input and output from your model version and saves it to BigQuery, the data gets stored as JSON strings in the BigQuery table. These keys tell Data Labeling Service how to parse the JSON. You can provide the following entries in this field: * `data_json_key`: the data key for prediction input. You must provide either this key or `reference_json_key`. * `reference_json_key`: the data reference key for prediction input. You must provide either this key or `data_json_key`. * `label_json_key`: the label key for prediction output. Required. * `label_score_json_key`: the score key for prediction output. Required. * `bounding_box_json_key`: the bounding box key for prediction output. Required if your model version perform image object detection. Learn [how to configure prediction keys](/ml-engine/docs/continuous-evaluation/create-job#prediction-keys).
     * 
     */
    private final Map<String,String> bigqueryImportKeys;
    /**
     * Specify this field if your model version performs image object detection (bounding box detection). `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet.
     * 
     */
    private final GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse boundingPolyConfig;
    /**
     * Details for calculating evaluation metrics and creating Evaulations. If your model version performs image object detection, you must specify the `boundingBoxEvaluationOptions` field within this configuration. Otherwise, provide an empty object for this configuration.
     * 
     */
    private final GoogleCloudDatalabelingV1beta1EvaluationConfigResponse evaluationConfig;
    /**
     * Optional. Configuration details for evaluation job alerts. Specify this field if you want to receive email alerts if the evaluation job finds that your predictions have low mean average precision during a run.
     * 
     */
    private final GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigResponse evaluationJobAlertConfig;
    /**
     * The maximum number of predictions to sample and save to BigQuery during each evaluation interval. This limit overrides `example_sample_percentage`: even if the service has not sampled enough predictions to fulfill `example_sample_perecentage` during an interval, it stops sampling predictions when it meets this limit.
     * 
     */
    private final Integer exampleCount;
    /**
     * Fraction of predictions to sample and save to BigQuery during each evaluation interval. For example, 0.1 means 10% of predictions served by your model version get saved to BigQuery.
     * 
     */
    private final Double exampleSamplePercentage;
    /**
     * Optional. Details for human annotation of your data. If you set labelMissingGroundTruth to `true` for this evaluation job, then you must specify this field. If you plan to provide your own ground truth labels, then omit this field. Note that you must create an Instruction resource before you can specify this field. Provide the name of the instruction resource in the `instruction` field within this configuration.
     * 
     */
    private final GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse humanAnnotationConfig;
    /**
     * Specify this field if your model version performs image classification or general classification. `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet. `allowMultiLabel` in this configuration must match `classificationMetadata.isMultiLabel` in input_config.
     * 
     */
    private final GoogleCloudDatalabelingV1beta1ImageClassificationConfigResponse imageClassificationConfig;
    /**
     * Rquired. Details for the sampled prediction input. Within this configuration, there are requirements for several fields: * `dataType` must be one of `IMAGE`, `TEXT`, or `GENERAL_DATA`. * `annotationType` must be one of `IMAGE_CLASSIFICATION_ANNOTATION`, `TEXT_CLASSIFICATION_ANNOTATION`, `GENERAL_CLASSIFICATION_ANNOTATION`, or `IMAGE_BOUNDING_BOX_ANNOTATION` (image object detection). * If your machine learning model performs classification, you must specify `classificationMetadata.isMultiLabel`. * You must specify `bigquerySource` (not `gcsSource`).
     * 
     */
    private final GoogleCloudDatalabelingV1beta1InputConfigResponse inputConfig;
    /**
     * Specify this field if your model version performs text classification. `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet. `allowMultiLabel` in this configuration must match `classificationMetadata.isMultiLabel` in input_config.
     * 
     */
    private final GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse textClassificationConfig;

    @OutputCustomType.Constructor({"bigqueryImportKeys","boundingPolyConfig","evaluationConfig","evaluationJobAlertConfig","exampleCount","exampleSamplePercentage","humanAnnotationConfig","imageClassificationConfig","inputConfig","textClassificationConfig"})
    private GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse(
        Map<String,String> bigqueryImportKeys,
        GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse boundingPolyConfig,
        GoogleCloudDatalabelingV1beta1EvaluationConfigResponse evaluationConfig,
        GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigResponse evaluationJobAlertConfig,
        Integer exampleCount,
        Double exampleSamplePercentage,
        GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse humanAnnotationConfig,
        GoogleCloudDatalabelingV1beta1ImageClassificationConfigResponse imageClassificationConfig,
        GoogleCloudDatalabelingV1beta1InputConfigResponse inputConfig,
        GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse textClassificationConfig) {
        this.bigqueryImportKeys = Objects.requireNonNull(bigqueryImportKeys);
        this.boundingPolyConfig = Objects.requireNonNull(boundingPolyConfig);
        this.evaluationConfig = Objects.requireNonNull(evaluationConfig);
        this.evaluationJobAlertConfig = Objects.requireNonNull(evaluationJobAlertConfig);
        this.exampleCount = Objects.requireNonNull(exampleCount);
        this.exampleSamplePercentage = Objects.requireNonNull(exampleSamplePercentage);
        this.humanAnnotationConfig = Objects.requireNonNull(humanAnnotationConfig);
        this.imageClassificationConfig = Objects.requireNonNull(imageClassificationConfig);
        this.inputConfig = Objects.requireNonNull(inputConfig);
        this.textClassificationConfig = Objects.requireNonNull(textClassificationConfig);
    }

    /**
     * Prediction keys that tell Data Labeling Service where to find the data for evaluation in your BigQuery table. When the service samples prediction input and output from your model version and saves it to BigQuery, the data gets stored as JSON strings in the BigQuery table. These keys tell Data Labeling Service how to parse the JSON. You can provide the following entries in this field: * `data_json_key`: the data key for prediction input. You must provide either this key or `reference_json_key`. * `reference_json_key`: the data reference key for prediction input. You must provide either this key or `data_json_key`. * `label_json_key`: the label key for prediction output. Required. * `label_score_json_key`: the score key for prediction output. Required. * `bounding_box_json_key`: the bounding box key for prediction output. Required if your model version perform image object detection. Learn [how to configure prediction keys](/ml-engine/docs/continuous-evaluation/create-job#prediction-keys).
     * 
    */
    public Map<String,String> getBigqueryImportKeys() {
        return this.bigqueryImportKeys;
    }
    /**
     * Specify this field if your model version performs image object detection (bounding box detection). `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet.
     * 
    */
    public GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse getBoundingPolyConfig() {
        return this.boundingPolyConfig;
    }
    /**
     * Details for calculating evaluation metrics and creating Evaulations. If your model version performs image object detection, you must specify the `boundingBoxEvaluationOptions` field within this configuration. Otherwise, provide an empty object for this configuration.
     * 
    */
    public GoogleCloudDatalabelingV1beta1EvaluationConfigResponse getEvaluationConfig() {
        return this.evaluationConfig;
    }
    /**
     * Optional. Configuration details for evaluation job alerts. Specify this field if you want to receive email alerts if the evaluation job finds that your predictions have low mean average precision during a run.
     * 
    */
    public GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigResponse getEvaluationJobAlertConfig() {
        return this.evaluationJobAlertConfig;
    }
    /**
     * The maximum number of predictions to sample and save to BigQuery during each evaluation interval. This limit overrides `example_sample_percentage`: even if the service has not sampled enough predictions to fulfill `example_sample_perecentage` during an interval, it stops sampling predictions when it meets this limit.
     * 
    */
    public Integer getExampleCount() {
        return this.exampleCount;
    }
    /**
     * Fraction of predictions to sample and save to BigQuery during each evaluation interval. For example, 0.1 means 10% of predictions served by your model version get saved to BigQuery.
     * 
    */
    public Double getExampleSamplePercentage() {
        return this.exampleSamplePercentage;
    }
    /**
     * Optional. Details for human annotation of your data. If you set labelMissingGroundTruth to `true` for this evaluation job, then you must specify this field. If you plan to provide your own ground truth labels, then omit this field. Note that you must create an Instruction resource before you can specify this field. Provide the name of the instruction resource in the `instruction` field within this configuration.
     * 
    */
    public GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse getHumanAnnotationConfig() {
        return this.humanAnnotationConfig;
    }
    /**
     * Specify this field if your model version performs image classification or general classification. `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet. `allowMultiLabel` in this configuration must match `classificationMetadata.isMultiLabel` in input_config.
     * 
    */
    public GoogleCloudDatalabelingV1beta1ImageClassificationConfigResponse getImageClassificationConfig() {
        return this.imageClassificationConfig;
    }
    /**
     * Rquired. Details for the sampled prediction input. Within this configuration, there are requirements for several fields: * `dataType` must be one of `IMAGE`, `TEXT`, or `GENERAL_DATA`. * `annotationType` must be one of `IMAGE_CLASSIFICATION_ANNOTATION`, `TEXT_CLASSIFICATION_ANNOTATION`, `GENERAL_CLASSIFICATION_ANNOTATION`, or `IMAGE_BOUNDING_BOX_ANNOTATION` (image object detection). * If your machine learning model performs classification, you must specify `classificationMetadata.isMultiLabel`. * You must specify `bigquerySource` (not `gcsSource`).
     * 
    */
    public GoogleCloudDatalabelingV1beta1InputConfigResponse getInputConfig() {
        return this.inputConfig;
    }
    /**
     * Specify this field if your model version performs text classification. `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet. `allowMultiLabel` in this configuration must match `classificationMetadata.isMultiLabel` in input_config.
     * 
    */
    public GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse getTextClassificationConfig() {
        return this.textClassificationConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> bigqueryImportKeys;
        private GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse boundingPolyConfig;
        private GoogleCloudDatalabelingV1beta1EvaluationConfigResponse evaluationConfig;
        private GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigResponse evaluationJobAlertConfig;
        private Integer exampleCount;
        private Double exampleSamplePercentage;
        private GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse humanAnnotationConfig;
        private GoogleCloudDatalabelingV1beta1ImageClassificationConfigResponse imageClassificationConfig;
        private GoogleCloudDatalabelingV1beta1InputConfigResponse inputConfig;
        private GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse textClassificationConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse defaults) {
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

        public Builder setBigqueryImportKeys(Map<String,String> bigqueryImportKeys) {
            this.bigqueryImportKeys = Objects.requireNonNull(bigqueryImportKeys);
            return this;
        }

        public Builder setBoundingPolyConfig(GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse boundingPolyConfig) {
            this.boundingPolyConfig = Objects.requireNonNull(boundingPolyConfig);
            return this;
        }

        public Builder setEvaluationConfig(GoogleCloudDatalabelingV1beta1EvaluationConfigResponse evaluationConfig) {
            this.evaluationConfig = Objects.requireNonNull(evaluationConfig);
            return this;
        }

        public Builder setEvaluationJobAlertConfig(GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigResponse evaluationJobAlertConfig) {
            this.evaluationJobAlertConfig = Objects.requireNonNull(evaluationJobAlertConfig);
            return this;
        }

        public Builder setExampleCount(Integer exampleCount) {
            this.exampleCount = Objects.requireNonNull(exampleCount);
            return this;
        }

        public Builder setExampleSamplePercentage(Double exampleSamplePercentage) {
            this.exampleSamplePercentage = Objects.requireNonNull(exampleSamplePercentage);
            return this;
        }

        public Builder setHumanAnnotationConfig(GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse humanAnnotationConfig) {
            this.humanAnnotationConfig = Objects.requireNonNull(humanAnnotationConfig);
            return this;
        }

        public Builder setImageClassificationConfig(GoogleCloudDatalabelingV1beta1ImageClassificationConfigResponse imageClassificationConfig) {
            this.imageClassificationConfig = Objects.requireNonNull(imageClassificationConfig);
            return this;
        }

        public Builder setInputConfig(GoogleCloudDatalabelingV1beta1InputConfigResponse inputConfig) {
            this.inputConfig = Objects.requireNonNull(inputConfig);
            return this;
        }

        public Builder setTextClassificationConfig(GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse textClassificationConfig) {
            this.textClassificationConfig = Objects.requireNonNull(textClassificationConfig);
            return this;
        }
        public GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse build() {
            return new GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse(bigqueryImportKeys, boundingPolyConfig, evaluationConfig, evaluationJobAlertConfig, exampleCount, exampleSamplePercentage, humanAnnotationConfig, imageClassificationConfig, inputConfig, textClassificationConfig);
        }
    }
}