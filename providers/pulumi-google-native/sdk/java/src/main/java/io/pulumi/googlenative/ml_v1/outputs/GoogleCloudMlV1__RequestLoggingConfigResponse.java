// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1__RequestLoggingConfigResponse {
    /**
     * Fully qualified BigQuery table name in the following format: " project_id.dataset_name.table_name" The specified table must already exist, and the "Cloud ML Service Agent" for your project must have permission to write to it. The table must have the following [schema](/bigquery/docs/schemas): Field nameType Mode model STRING REQUIRED model_version STRING REQUIRED time TIMESTAMP REQUIRED raw_data STRING REQUIRED raw_prediction STRING NULLABLE groundtruth STRING NULLABLE
     * 
     */
    private final String bigqueryTableName;
    /**
     * Percentage of requests to be logged, expressed as a fraction from 0 to 1. For example, if you want to log 10% of requests, enter `0.1`. The sampling window is the lifetime of the model version. Defaults to 0.
     * 
     */
    private final Double samplingPercentage;

    @OutputCustomType.Constructor({"bigqueryTableName","samplingPercentage"})
    private GoogleCloudMlV1__RequestLoggingConfigResponse(
        String bigqueryTableName,
        Double samplingPercentage) {
        this.bigqueryTableName = Objects.requireNonNull(bigqueryTableName);
        this.samplingPercentage = Objects.requireNonNull(samplingPercentage);
    }

    /**
     * Fully qualified BigQuery table name in the following format: " project_id.dataset_name.table_name" The specified table must already exist, and the "Cloud ML Service Agent" for your project must have permission to write to it. The table must have the following [schema](/bigquery/docs/schemas): Field nameType Mode model STRING REQUIRED model_version STRING REQUIRED time TIMESTAMP REQUIRED raw_data STRING REQUIRED raw_prediction STRING NULLABLE groundtruth STRING NULLABLE
     * 
    */
    public String getBigqueryTableName() {
        return this.bigqueryTableName;
    }
    /**
     * Percentage of requests to be logged, expressed as a fraction from 0 to 1. For example, if you want to log 10% of requests, enter `0.1`. The sampling window is the lifetime of the model version. Defaults to 0.
     * 
    */
    public Double getSamplingPercentage() {
        return this.samplingPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__RequestLoggingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bigqueryTableName;
        private Double samplingPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__RequestLoggingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryTableName = defaults.bigqueryTableName;
    	      this.samplingPercentage = defaults.samplingPercentage;
        }

        public Builder setBigqueryTableName(String bigqueryTableName) {
            this.bigqueryTableName = Objects.requireNonNull(bigqueryTableName);
            return this;
        }

        public Builder setSamplingPercentage(Double samplingPercentage) {
            this.samplingPercentage = Objects.requireNonNull(samplingPercentage);
            return this;
        }
        public GoogleCloudMlV1__RequestLoggingConfigResponse build() {
            return new GoogleCloudMlV1__RequestLoggingConfigResponse(bigqueryTableName, samplingPercentage);
        }
    }
}