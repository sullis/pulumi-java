// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a metric to optimize.
 * 
 */
public final class GoogleCloudMlV1_StudyConfig_MetricSpecResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1_StudyConfig_MetricSpecResponse Empty = new GoogleCloudMlV1_StudyConfig_MetricSpecResponse();

    /**
     * The optimization goal of the metric.
     * 
     */
    @Import(name="goal", required=true)
    private String goal;

    /**
     * @return The optimization goal of the metric.
     * 
     */
    public String goal() {
        return this.goal;
    }

    /**
     * The name of the metric.
     * 
     */
    @Import(name="metric", required=true)
    private String metric;

    /**
     * @return The name of the metric.
     * 
     */
    public String metric() {
        return this.metric;
    }

    private GoogleCloudMlV1_StudyConfig_MetricSpecResponse() {}

    private GoogleCloudMlV1_StudyConfig_MetricSpecResponse(GoogleCloudMlV1_StudyConfig_MetricSpecResponse $) {
        this.goal = $.goal;
        this.metric = $.metric;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1_StudyConfig_MetricSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1_StudyConfig_MetricSpecResponse $;

        public Builder() {
            $ = new GoogleCloudMlV1_StudyConfig_MetricSpecResponse();
        }

        public Builder(GoogleCloudMlV1_StudyConfig_MetricSpecResponse defaults) {
            $ = new GoogleCloudMlV1_StudyConfig_MetricSpecResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param goal The optimization goal of the metric.
         * 
         * @return builder
         * 
         */
        public Builder goal(String goal) {
            $.goal = goal;
            return this;
        }

        /**
         * @param metric The name of the metric.
         * 
         * @return builder
         * 
         */
        public Builder metric(String metric) {
            $.metric = metric;
            return this;
        }

        public GoogleCloudMlV1_StudyConfig_MetricSpecResponse build() {
            $.goal = Objects.requireNonNull($.goal, "expected parameter 'goal' to be non-null");
            $.metric = Objects.requireNonNull($.metric, "expected parameter 'metric' to be non-null");
            return $;
        }
    }

}
