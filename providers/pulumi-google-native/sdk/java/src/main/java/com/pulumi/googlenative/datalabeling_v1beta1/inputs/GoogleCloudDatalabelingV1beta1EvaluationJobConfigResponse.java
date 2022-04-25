// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse;
import com.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1EvaluationConfigResponse;
import com.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigResponse;
import com.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse;
import com.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1ImageClassificationConfigResponse;
import com.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1InputConfigResponse;
import com.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Configures specific details of how a continuous evaluation job works. Provide this configuration when you create an EvaluationJob.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse Empty = new GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse();

    /**
     * Prediction keys that tell Data Labeling Service where to find the data for evaluation in your BigQuery table. When the service samples prediction input and output from your model version and saves it to BigQuery, the data gets stored as JSON strings in the BigQuery table. These keys tell Data Labeling Service how to parse the JSON. You can provide the following entries in this field: * `data_json_key`: the data key for prediction input. You must provide either this key or `reference_json_key`. * `reference_json_key`: the data reference key for prediction input. You must provide either this key or `data_json_key`. * `label_json_key`: the label key for prediction output. Required. * `label_score_json_key`: the score key for prediction output. Required. * `bounding_box_json_key`: the bounding box key for prediction output. Required if your model version perform image object detection. Learn [how to configure prediction keys](/ml-engine/docs/continuous-evaluation/create-job#prediction-keys).
     * 
     */
    @Import(name="bigqueryImportKeys", required=true)
    private Map<String,String> bigqueryImportKeys;

    /**
     * @return Prediction keys that tell Data Labeling Service where to find the data for evaluation in your BigQuery table. When the service samples prediction input and output from your model version and saves it to BigQuery, the data gets stored as JSON strings in the BigQuery table. These keys tell Data Labeling Service how to parse the JSON. You can provide the following entries in this field: * `data_json_key`: the data key for prediction input. You must provide either this key or `reference_json_key`. * `reference_json_key`: the data reference key for prediction input. You must provide either this key or `data_json_key`. * `label_json_key`: the label key for prediction output. Required. * `label_score_json_key`: the score key for prediction output. Required. * `bounding_box_json_key`: the bounding box key for prediction output. Required if your model version perform image object detection. Learn [how to configure prediction keys](/ml-engine/docs/continuous-evaluation/create-job#prediction-keys).
     * 
     */
    public Map<String,String> bigqueryImportKeys() {
        return this.bigqueryImportKeys;
    }

    /**
     * Specify this field if your model version performs image object detection (bounding box detection). `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet.
     * 
     */
    @Import(name="boundingPolyConfig", required=true)
    private GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse boundingPolyConfig;

    /**
     * @return Specify this field if your model version performs image object detection (bounding box detection). `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet.
     * 
     */
    public GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse boundingPolyConfig() {
        return this.boundingPolyConfig;
    }

    /**
     * Details for calculating evaluation metrics and creating Evaulations. If your model version performs image object detection, you must specify the `boundingBoxEvaluationOptions` field within this configuration. Otherwise, provide an empty object for this configuration.
     * 
     */
    @Import(name="evaluationConfig", required=true)
    private GoogleCloudDatalabelingV1beta1EvaluationConfigResponse evaluationConfig;

    /**
     * @return Details for calculating evaluation metrics and creating Evaulations. If your model version performs image object detection, you must specify the `boundingBoxEvaluationOptions` field within this configuration. Otherwise, provide an empty object for this configuration.
     * 
     */
    public GoogleCloudDatalabelingV1beta1EvaluationConfigResponse evaluationConfig() {
        return this.evaluationConfig;
    }

    /**
     * Optional. Configuration details for evaluation job alerts. Specify this field if you want to receive email alerts if the evaluation job finds that your predictions have low mean average precision during a run.
     * 
     */
    @Import(name="evaluationJobAlertConfig", required=true)
    private GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigResponse evaluationJobAlertConfig;

    /**
     * @return Optional. Configuration details for evaluation job alerts. Specify this field if you want to receive email alerts if the evaluation job finds that your predictions have low mean average precision during a run.
     * 
     */
    public GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigResponse evaluationJobAlertConfig() {
        return this.evaluationJobAlertConfig;
    }

    /**
     * The maximum number of predictions to sample and save to BigQuery during each evaluation interval. This limit overrides `example_sample_percentage`: even if the service has not sampled enough predictions to fulfill `example_sample_perecentage` during an interval, it stops sampling predictions when it meets this limit.
     * 
     */
    @Import(name="exampleCount", required=true)
    private Integer exampleCount;

    /**
     * @return The maximum number of predictions to sample and save to BigQuery during each evaluation interval. This limit overrides `example_sample_percentage`: even if the service has not sampled enough predictions to fulfill `example_sample_perecentage` during an interval, it stops sampling predictions when it meets this limit.
     * 
     */
    public Integer exampleCount() {
        return this.exampleCount;
    }

    /**
     * Fraction of predictions to sample and save to BigQuery during each evaluation interval. For example, 0.1 means 10% of predictions served by your model version get saved to BigQuery.
     * 
     */
    @Import(name="exampleSamplePercentage", required=true)
    private Double exampleSamplePercentage;

    /**
     * @return Fraction of predictions to sample and save to BigQuery during each evaluation interval. For example, 0.1 means 10% of predictions served by your model version get saved to BigQuery.
     * 
     */
    public Double exampleSamplePercentage() {
        return this.exampleSamplePercentage;
    }

    /**
     * Optional. Details for human annotation of your data. If you set labelMissingGroundTruth to `true` for this evaluation job, then you must specify this field. If you plan to provide your own ground truth labels, then omit this field. Note that you must create an Instruction resource before you can specify this field. Provide the name of the instruction resource in the `instruction` field within this configuration.
     * 
     */
    @Import(name="humanAnnotationConfig", required=true)
    private GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse humanAnnotationConfig;

    /**
     * @return Optional. Details for human annotation of your data. If you set labelMissingGroundTruth to `true` for this evaluation job, then you must specify this field. If you plan to provide your own ground truth labels, then omit this field. Note that you must create an Instruction resource before you can specify this field. Provide the name of the instruction resource in the `instruction` field within this configuration.
     * 
     */
    public GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse humanAnnotationConfig() {
        return this.humanAnnotationConfig;
    }

    /**
     * Specify this field if your model version performs image classification or general classification. `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet. `allowMultiLabel` in this configuration must match `classificationMetadata.isMultiLabel` in input_config.
     * 
     */
    @Import(name="imageClassificationConfig", required=true)
    private GoogleCloudDatalabelingV1beta1ImageClassificationConfigResponse imageClassificationConfig;

    /**
     * @return Specify this field if your model version performs image classification or general classification. `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet. `allowMultiLabel` in this configuration must match `classificationMetadata.isMultiLabel` in input_config.
     * 
     */
    public GoogleCloudDatalabelingV1beta1ImageClassificationConfigResponse imageClassificationConfig() {
        return this.imageClassificationConfig;
    }

    /**
     * Rquired. Details for the sampled prediction input. Within this configuration, there are requirements for several fields: * `dataType` must be one of `IMAGE`, `TEXT`, or `GENERAL_DATA`. * `annotationType` must be one of `IMAGE_CLASSIFICATION_ANNOTATION`, `TEXT_CLASSIFICATION_ANNOTATION`, `GENERAL_CLASSIFICATION_ANNOTATION`, or `IMAGE_BOUNDING_BOX_ANNOTATION` (image object detection). * If your machine learning model performs classification, you must specify `classificationMetadata.isMultiLabel`. * You must specify `bigquerySource` (not `gcsSource`).
     * 
     */
    @Import(name="inputConfig", required=true)
    private GoogleCloudDatalabelingV1beta1InputConfigResponse inputConfig;

    /**
     * @return Rquired. Details for the sampled prediction input. Within this configuration, there are requirements for several fields: * `dataType` must be one of `IMAGE`, `TEXT`, or `GENERAL_DATA`. * `annotationType` must be one of `IMAGE_CLASSIFICATION_ANNOTATION`, `TEXT_CLASSIFICATION_ANNOTATION`, `GENERAL_CLASSIFICATION_ANNOTATION`, or `IMAGE_BOUNDING_BOX_ANNOTATION` (image object detection). * If your machine learning model performs classification, you must specify `classificationMetadata.isMultiLabel`. * You must specify `bigquerySource` (not `gcsSource`).
     * 
     */
    public GoogleCloudDatalabelingV1beta1InputConfigResponse inputConfig() {
        return this.inputConfig;
    }

    /**
     * Specify this field if your model version performs text classification. `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet. `allowMultiLabel` in this configuration must match `classificationMetadata.isMultiLabel` in input_config.
     * 
     */
    @Import(name="textClassificationConfig", required=true)
    private GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse textClassificationConfig;

    /**
     * @return Specify this field if your model version performs text classification. `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet. `allowMultiLabel` in this configuration must match `classificationMetadata.isMultiLabel` in input_config.
     * 
     */
    public GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse textClassificationConfig() {
        return this.textClassificationConfig;
    }

    private GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse() {}

    private GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse(GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse $) {
        this.bigqueryImportKeys = $.bigqueryImportKeys;
        this.boundingPolyConfig = $.boundingPolyConfig;
        this.evaluationConfig = $.evaluationConfig;
        this.evaluationJobAlertConfig = $.evaluationJobAlertConfig;
        this.exampleCount = $.exampleCount;
        this.exampleSamplePercentage = $.exampleSamplePercentage;
        this.humanAnnotationConfig = $.humanAnnotationConfig;
        this.imageClassificationConfig = $.imageClassificationConfig;
        this.inputConfig = $.inputConfig;
        this.textClassificationConfig = $.textClassificationConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse $;

        public Builder() {
            $ = new GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse();
        }

        public Builder(GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse defaults) {
            $ = new GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param bigqueryImportKeys Prediction keys that tell Data Labeling Service where to find the data for evaluation in your BigQuery table. When the service samples prediction input and output from your model version and saves it to BigQuery, the data gets stored as JSON strings in the BigQuery table. These keys tell Data Labeling Service how to parse the JSON. You can provide the following entries in this field: * `data_json_key`: the data key for prediction input. You must provide either this key or `reference_json_key`. * `reference_json_key`: the data reference key for prediction input. You must provide either this key or `data_json_key`. * `label_json_key`: the label key for prediction output. Required. * `label_score_json_key`: the score key for prediction output. Required. * `bounding_box_json_key`: the bounding box key for prediction output. Required if your model version perform image object detection. Learn [how to configure prediction keys](/ml-engine/docs/continuous-evaluation/create-job#prediction-keys).
         * 
         * @return builder
         * 
         */
        public Builder bigqueryImportKeys(Map<String,String> bigqueryImportKeys) {
            $.bigqueryImportKeys = bigqueryImportKeys;
            return this;
        }

        /**
         * @param boundingPolyConfig Specify this field if your model version performs image object detection (bounding box detection). `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet.
         * 
         * @return builder
         * 
         */
        public Builder boundingPolyConfig(GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse boundingPolyConfig) {
            $.boundingPolyConfig = boundingPolyConfig;
            return this;
        }

        /**
         * @param evaluationConfig Details for calculating evaluation metrics and creating Evaulations. If your model version performs image object detection, you must specify the `boundingBoxEvaluationOptions` field within this configuration. Otherwise, provide an empty object for this configuration.
         * 
         * @return builder
         * 
         */
        public Builder evaluationConfig(GoogleCloudDatalabelingV1beta1EvaluationConfigResponse evaluationConfig) {
            $.evaluationConfig = evaluationConfig;
            return this;
        }

        /**
         * @param evaluationJobAlertConfig Optional. Configuration details for evaluation job alerts. Specify this field if you want to receive email alerts if the evaluation job finds that your predictions have low mean average precision during a run.
         * 
         * @return builder
         * 
         */
        public Builder evaluationJobAlertConfig(GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigResponse evaluationJobAlertConfig) {
            $.evaluationJobAlertConfig = evaluationJobAlertConfig;
            return this;
        }

        /**
         * @param exampleCount The maximum number of predictions to sample and save to BigQuery during each evaluation interval. This limit overrides `example_sample_percentage`: even if the service has not sampled enough predictions to fulfill `example_sample_perecentage` during an interval, it stops sampling predictions when it meets this limit.
         * 
         * @return builder
         * 
         */
        public Builder exampleCount(Integer exampleCount) {
            $.exampleCount = exampleCount;
            return this;
        }

        /**
         * @param exampleSamplePercentage Fraction of predictions to sample and save to BigQuery during each evaluation interval. For example, 0.1 means 10% of predictions served by your model version get saved to BigQuery.
         * 
         * @return builder
         * 
         */
        public Builder exampleSamplePercentage(Double exampleSamplePercentage) {
            $.exampleSamplePercentage = exampleSamplePercentage;
            return this;
        }

        /**
         * @param humanAnnotationConfig Optional. Details for human annotation of your data. If you set labelMissingGroundTruth to `true` for this evaluation job, then you must specify this field. If you plan to provide your own ground truth labels, then omit this field. Note that you must create an Instruction resource before you can specify this field. Provide the name of the instruction resource in the `instruction` field within this configuration.
         * 
         * @return builder
         * 
         */
        public Builder humanAnnotationConfig(GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse humanAnnotationConfig) {
            $.humanAnnotationConfig = humanAnnotationConfig;
            return this;
        }

        /**
         * @param imageClassificationConfig Specify this field if your model version performs image classification or general classification. `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet. `allowMultiLabel` in this configuration must match `classificationMetadata.isMultiLabel` in input_config.
         * 
         * @return builder
         * 
         */
        public Builder imageClassificationConfig(GoogleCloudDatalabelingV1beta1ImageClassificationConfigResponse imageClassificationConfig) {
            $.imageClassificationConfig = imageClassificationConfig;
            return this;
        }

        /**
         * @param inputConfig Rquired. Details for the sampled prediction input. Within this configuration, there are requirements for several fields: * `dataType` must be one of `IMAGE`, `TEXT`, or `GENERAL_DATA`. * `annotationType` must be one of `IMAGE_CLASSIFICATION_ANNOTATION`, `TEXT_CLASSIFICATION_ANNOTATION`, `GENERAL_CLASSIFICATION_ANNOTATION`, or `IMAGE_BOUNDING_BOX_ANNOTATION` (image object detection). * If your machine learning model performs classification, you must specify `classificationMetadata.isMultiLabel`. * You must specify `bigquerySource` (not `gcsSource`).
         * 
         * @return builder
         * 
         */
        public Builder inputConfig(GoogleCloudDatalabelingV1beta1InputConfigResponse inputConfig) {
            $.inputConfig = inputConfig;
            return this;
        }

        /**
         * @param textClassificationConfig Specify this field if your model version performs text classification. `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet. `allowMultiLabel` in this configuration must match `classificationMetadata.isMultiLabel` in input_config.
         * 
         * @return builder
         * 
         */
        public Builder textClassificationConfig(GoogleCloudDatalabelingV1beta1TextClassificationConfigResponse textClassificationConfig) {
            $.textClassificationConfig = textClassificationConfig;
            return this;
        }

        public GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse build() {
            $.bigqueryImportKeys = Objects.requireNonNull($.bigqueryImportKeys, "expected parameter 'bigqueryImportKeys' to be non-null");
            $.boundingPolyConfig = Objects.requireNonNull($.boundingPolyConfig, "expected parameter 'boundingPolyConfig' to be non-null");
            $.evaluationConfig = Objects.requireNonNull($.evaluationConfig, "expected parameter 'evaluationConfig' to be non-null");
            $.evaluationJobAlertConfig = Objects.requireNonNull($.evaluationJobAlertConfig, "expected parameter 'evaluationJobAlertConfig' to be non-null");
            $.exampleCount = Objects.requireNonNull($.exampleCount, "expected parameter 'exampleCount' to be non-null");
            $.exampleSamplePercentage = Objects.requireNonNull($.exampleSamplePercentage, "expected parameter 'exampleSamplePercentage' to be non-null");
            $.humanAnnotationConfig = Objects.requireNonNull($.humanAnnotationConfig, "expected parameter 'humanAnnotationConfig' to be non-null");
            $.imageClassificationConfig = Objects.requireNonNull($.imageClassificationConfig, "expected parameter 'imageClassificationConfig' to be non-null");
            $.inputConfig = Objects.requireNonNull($.inputConfig, "expected parameter 'inputConfig' to be non-null");
            $.textClassificationConfig = Objects.requireNonNull($.textClassificationConfig, "expected parameter 'textClassificationConfig' to be non-null");
            return $;
        }
    }

}
