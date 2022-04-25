// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents input parameters for a prediction job.
 * 
 */
public final class GoogleCloudMlV1__PredictionInputResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__PredictionInputResponse Empty = new GoogleCloudMlV1__PredictionInputResponse();

    /**
     * Optional. Number of records per batch, defaults to 64. The service will buffer batch_size number of records in memory before invoking one Tensorflow prediction call internally. So take the record size and memory available into consideration when setting this parameter.
     * 
     */
    @Import(name="batchSize", required=true)
    private String batchSize;

    /**
     * @return Optional. Number of records per batch, defaults to 64. The service will buffer batch_size number of records in memory before invoking one Tensorflow prediction call internally. So take the record size and memory available into consideration when setting this parameter.
     * 
     */
    public String batchSize() {
        return this.batchSize;
    }

    /**
     * The format of the input data files.
     * 
     */
    @Import(name="dataFormat", required=true)
    private String dataFormat;

    /**
     * @return The format of the input data files.
     * 
     */
    public String dataFormat() {
        return this.dataFormat;
    }

    /**
     * The Cloud Storage location of the input data files. May contain wildcards.
     * 
     */
    @Import(name="inputPaths", required=true)
    private List<String> inputPaths;

    /**
     * @return The Cloud Storage location of the input data files. May contain wildcards.
     * 
     */
    public List<String> inputPaths() {
        return this.inputPaths;
    }

    /**
     * Optional. The maximum number of workers to be used for parallel processing. Defaults to 10 if not specified.
     * 
     */
    @Import(name="maxWorkerCount", required=true)
    private String maxWorkerCount;

    /**
     * @return Optional. The maximum number of workers to be used for parallel processing. Defaults to 10 if not specified.
     * 
     */
    public String maxWorkerCount() {
        return this.maxWorkerCount;
    }

    /**
     * Use this field if you want to use the default version for the specified model. The string must use the following format: `&#34;projects/YOUR_PROJECT/models/YOUR_MODEL&#34;`
     * 
     */
    @Import(name="modelName", required=true)
    private String modelName;

    /**
     * @return Use this field if you want to use the default version for the specified model. The string must use the following format: `&#34;projects/YOUR_PROJECT/models/YOUR_MODEL&#34;`
     * 
     */
    public String modelName() {
        return this.modelName;
    }

    /**
     * Optional. Format of the output data files, defaults to JSON.
     * 
     */
    @Import(name="outputDataFormat", required=true)
    private String outputDataFormat;

    /**
     * @return Optional. Format of the output data files, defaults to JSON.
     * 
     */
    public String outputDataFormat() {
        return this.outputDataFormat;
    }

    /**
     * The output Google Cloud Storage location.
     * 
     */
    @Import(name="outputPath", required=true)
    private String outputPath;

    /**
     * @return The output Google Cloud Storage location.
     * 
     */
    public String outputPath() {
        return this.outputPath;
    }

    /**
     * The Google Compute Engine region to run the prediction job in. See the available regions for AI Platform services.
     * 
     */
    @Import(name="region", required=true)
    private String region;

    /**
     * @return The Google Compute Engine region to run the prediction job in. See the available regions for AI Platform services.
     * 
     */
    public String region() {
        return this.region;
    }

    /**
     * Optional. The AI Platform runtime version to use for this batch prediction. If not set, AI Platform will pick the runtime version used during the CreateVersion request for this model version, or choose the latest stable version when model version information is not available such as when the model is specified by uri.
     * 
     */
    @Import(name="runtimeVersion", required=true)
    private String runtimeVersion;

    /**
     * @return Optional. The AI Platform runtime version to use for this batch prediction. If not set, AI Platform will pick the runtime version used during the CreateVersion request for this model version, or choose the latest stable version when model version information is not available such as when the model is specified by uri.
     * 
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Optional. The name of the signature defined in the SavedModel to use for this job. Please refer to [SavedModel](https://tensorflow.github.io/serving/serving_basic.html) for information about how to use signatures. Defaults to [DEFAULT_SERVING_SIGNATURE_DEF_KEY](https://www.tensorflow.org/api_docs/python/tf/saved_model/signature_constants) , which is &#34;serving_default&#34;.
     * 
     */
    @Import(name="signatureName", required=true)
    private String signatureName;

    /**
     * @return Optional. The name of the signature defined in the SavedModel to use for this job. Please refer to [SavedModel](https://tensorflow.github.io/serving/serving_basic.html) for information about how to use signatures. Defaults to [DEFAULT_SERVING_SIGNATURE_DEF_KEY](https://www.tensorflow.org/api_docs/python/tf/saved_model/signature_constants) , which is &#34;serving_default&#34;.
     * 
     */
    public String signatureName() {
        return this.signatureName;
    }

    /**
     * Use this field if you want to specify a Google Cloud Storage path for the model to use.
     * 
     */
    @Import(name="uri", required=true)
    private String uri;

    /**
     * @return Use this field if you want to specify a Google Cloud Storage path for the model to use.
     * 
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Use this field if you want to specify a version of the model to use. The string is formatted the same way as `model_version`, with the addition of the version information: `&#34;projects/YOUR_PROJECT/models/YOUR_MODEL/versions/YOUR_VERSION&#34;`
     * 
     */
    @Import(name="versionName", required=true)
    private String versionName;

    /**
     * @return Use this field if you want to specify a version of the model to use. The string is formatted the same way as `model_version`, with the addition of the version information: `&#34;projects/YOUR_PROJECT/models/YOUR_MODEL/versions/YOUR_VERSION&#34;`
     * 
     */
    public String versionName() {
        return this.versionName;
    }

    private GoogleCloudMlV1__PredictionInputResponse() {}

    private GoogleCloudMlV1__PredictionInputResponse(GoogleCloudMlV1__PredictionInputResponse $) {
        this.batchSize = $.batchSize;
        this.dataFormat = $.dataFormat;
        this.inputPaths = $.inputPaths;
        this.maxWorkerCount = $.maxWorkerCount;
        this.modelName = $.modelName;
        this.outputDataFormat = $.outputDataFormat;
        this.outputPath = $.outputPath;
        this.region = $.region;
        this.runtimeVersion = $.runtimeVersion;
        this.signatureName = $.signatureName;
        this.uri = $.uri;
        this.versionName = $.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1__PredictionInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1__PredictionInputResponse $;

        public Builder() {
            $ = new GoogleCloudMlV1__PredictionInputResponse();
        }

        public Builder(GoogleCloudMlV1__PredictionInputResponse defaults) {
            $ = new GoogleCloudMlV1__PredictionInputResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param batchSize Optional. Number of records per batch, defaults to 64. The service will buffer batch_size number of records in memory before invoking one Tensorflow prediction call internally. So take the record size and memory available into consideration when setting this parameter.
         * 
         * @return builder
         * 
         */
        public Builder batchSize(String batchSize) {
            $.batchSize = batchSize;
            return this;
        }

        /**
         * @param dataFormat The format of the input data files.
         * 
         * @return builder
         * 
         */
        public Builder dataFormat(String dataFormat) {
            $.dataFormat = dataFormat;
            return this;
        }

        /**
         * @param inputPaths The Cloud Storage location of the input data files. May contain wildcards.
         * 
         * @return builder
         * 
         */
        public Builder inputPaths(List<String> inputPaths) {
            $.inputPaths = inputPaths;
            return this;
        }

        /**
         * @param inputPaths The Cloud Storage location of the input data files. May contain wildcards.
         * 
         * @return builder
         * 
         */
        public Builder inputPaths(String... inputPaths) {
            return inputPaths(List.of(inputPaths));
        }

        /**
         * @param maxWorkerCount Optional. The maximum number of workers to be used for parallel processing. Defaults to 10 if not specified.
         * 
         * @return builder
         * 
         */
        public Builder maxWorkerCount(String maxWorkerCount) {
            $.maxWorkerCount = maxWorkerCount;
            return this;
        }

        /**
         * @param modelName Use this field if you want to use the default version for the specified model. The string must use the following format: `&#34;projects/YOUR_PROJECT/models/YOUR_MODEL&#34;`
         * 
         * @return builder
         * 
         */
        public Builder modelName(String modelName) {
            $.modelName = modelName;
            return this;
        }

        /**
         * @param outputDataFormat Optional. Format of the output data files, defaults to JSON.
         * 
         * @return builder
         * 
         */
        public Builder outputDataFormat(String outputDataFormat) {
            $.outputDataFormat = outputDataFormat;
            return this;
        }

        /**
         * @param outputPath The output Google Cloud Storage location.
         * 
         * @return builder
         * 
         */
        public Builder outputPath(String outputPath) {
            $.outputPath = outputPath;
            return this;
        }

        /**
         * @param region The Google Compute Engine region to run the prediction job in. See the available regions for AI Platform services.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            $.region = region;
            return this;
        }

        /**
         * @param runtimeVersion Optional. The AI Platform runtime version to use for this batch prediction. If not set, AI Platform will pick the runtime version used during the CreateVersion request for this model version, or choose the latest stable version when model version information is not available such as when the model is specified by uri.
         * 
         * @return builder
         * 
         */
        public Builder runtimeVersion(String runtimeVersion) {
            $.runtimeVersion = runtimeVersion;
            return this;
        }

        /**
         * @param signatureName Optional. The name of the signature defined in the SavedModel to use for this job. Please refer to [SavedModel](https://tensorflow.github.io/serving/serving_basic.html) for information about how to use signatures. Defaults to [DEFAULT_SERVING_SIGNATURE_DEF_KEY](https://www.tensorflow.org/api_docs/python/tf/saved_model/signature_constants) , which is &#34;serving_default&#34;.
         * 
         * @return builder
         * 
         */
        public Builder signatureName(String signatureName) {
            $.signatureName = signatureName;
            return this;
        }

        /**
         * @param uri Use this field if you want to specify a Google Cloud Storage path for the model to use.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param versionName Use this field if you want to specify a version of the model to use. The string is formatted the same way as `model_version`, with the addition of the version information: `&#34;projects/YOUR_PROJECT/models/YOUR_MODEL/versions/YOUR_VERSION&#34;`
         * 
         * @return builder
         * 
         */
        public Builder versionName(String versionName) {
            $.versionName = versionName;
            return this;
        }

        public GoogleCloudMlV1__PredictionInputResponse build() {
            $.batchSize = Objects.requireNonNull($.batchSize, "expected parameter 'batchSize' to be non-null");
            $.dataFormat = Objects.requireNonNull($.dataFormat, "expected parameter 'dataFormat' to be non-null");
            $.inputPaths = Objects.requireNonNull($.inputPaths, "expected parameter 'inputPaths' to be non-null");
            $.maxWorkerCount = Objects.requireNonNull($.maxWorkerCount, "expected parameter 'maxWorkerCount' to be non-null");
            $.modelName = Objects.requireNonNull($.modelName, "expected parameter 'modelName' to be non-null");
            $.outputDataFormat = Objects.requireNonNull($.outputDataFormat, "expected parameter 'outputDataFormat' to be non-null");
            $.outputPath = Objects.requireNonNull($.outputPath, "expected parameter 'outputPath' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.runtimeVersion = Objects.requireNonNull($.runtimeVersion, "expected parameter 'runtimeVersion' to be non-null");
            $.signatureName = Objects.requireNonNull($.signatureName, "expected parameter 'signatureName' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            $.versionName = Objects.requireNonNull($.versionName, "expected parameter 'versionName' to be non-null");
            return $;
        }
    }

}
