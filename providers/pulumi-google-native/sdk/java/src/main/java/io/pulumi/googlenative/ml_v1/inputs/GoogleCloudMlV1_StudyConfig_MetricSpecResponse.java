// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a metric to optimize.
 * 
 */
public final class GoogleCloudMlV1_StudyConfig_MetricSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1_StudyConfig_MetricSpecResponse Empty = new GoogleCloudMlV1_StudyConfig_MetricSpecResponse();

    /**
     * The optimization goal of the metric.
     * 
     */
    @Import(name="goal", required=true)
      private final String goal;

    public String getGoal() {
        return this.goal;
    }

    /**
     * The name of the metric.
     * 
     */
    @Import(name="metric", required=true)
      private final String metric;

    public String getMetric() {
        return this.metric;
    }

    public GoogleCloudMlV1_StudyConfig_MetricSpecResponse(
        String goal,
        String metric) {
        this.goal = Objects.requireNonNull(goal, "expected parameter 'goal' to be non-null");
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
    }

    private GoogleCloudMlV1_StudyConfig_MetricSpecResponse() {
        this.goal = null;
        this.metric = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_StudyConfig_MetricSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String goal;
        private String metric;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_StudyConfig_MetricSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.goal = defaults.goal;
    	      this.metric = defaults.metric;
        }

        public Builder goal(String goal) {
            this.goal = Objects.requireNonNull(goal);
            return this;
        }
        public Builder metric(String metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }        public GoogleCloudMlV1_StudyConfig_MetricSpecResponse build() {
            return new GoogleCloudMlV1_StudyConfig_MetricSpecResponse(goal, metric);
        }
    }
}
