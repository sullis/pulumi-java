// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.logging.outputs.MetricMetricDescriptorLabel;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricMetricDescriptor {
    /**
     * A concise name for the metric, which can be displayed in user interfaces. Use sentence case
     * without an ending period, for example "Request count". This field is optional but it is
     * recommended to be set for any metrics associated with user-visible concepts, such as Quota.
     * 
     */
    private final @Nullable String displayName;
    /**
     * The set of labels that can be used to describe a specific instance of this metric type. For
     * example, the appengine.googleapis.com/http/server/response_latencies metric type has a label
     * for the HTTP response code, response_code, so you can look at latencies for successful responses
     * or just for responses that failed.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<MetricMetricDescriptorLabel> labels;
    /**
     * Whether the metric records instantaneous values, changes to a value, etc.
     * Some combinations of metricKind and valueType might not be supported.
     * For counter metrics, set this to DELTA.
     * Possible values are `DELTA`, `GAUGE`, and `CUMULATIVE`.
     * 
     */
    private final String metricKind;
    /**
     * The unit in which the metric value is reported. It is only applicable if the valueType is
     * `INT64`, `DOUBLE`, or `DISTRIBUTION`. The supported units are a subset of
     * [The Unified Code for Units of Measure](http://unitsofmeasure.org/ucum.html) standard
     * 
     */
    private final @Nullable String unit;
    /**
     * The type of data that can be assigned to the label.
     * Default value is `STRING`.
     * Possible values are `BOOL`, `INT64`, and `STRING`.
     * 
     */
    private final String valueType;

    @OutputCustomType.Constructor({"displayName","labels","metricKind","unit","valueType"})
    private MetricMetricDescriptor(
        @Nullable String displayName,
        @Nullable List<MetricMetricDescriptorLabel> labels,
        String metricKind,
        @Nullable String unit,
        String valueType) {
        this.displayName = displayName;
        this.labels = labels;
        this.metricKind = Objects.requireNonNull(metricKind);
        this.unit = unit;
        this.valueType = Objects.requireNonNull(valueType);
    }

    /**
     * A concise name for the metric, which can be displayed in user interfaces. Use sentence case
     * without an ending period, for example "Request count". This field is optional but it is
     * recommended to be set for any metrics associated with user-visible concepts, such as Quota.
     * 
     */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The set of labels that can be used to describe a specific instance of this metric type. For
     * example, the appengine.googleapis.com/http/server/response_latencies metric type has a label
     * for the HTTP response code, response_code, so you can look at latencies for successful responses
     * or just for responses that failed.
     * Structure is documented below.
     * 
     */
    public List<MetricMetricDescriptorLabel> getLabels() {
        return this.labels == null ? List.of() : this.labels;
    }
    /**
     * Whether the metric records instantaneous values, changes to a value, etc.
     * Some combinations of metricKind and valueType might not be supported.
     * For counter metrics, set this to DELTA.
     * Possible values are `DELTA`, `GAUGE`, and `CUMULATIVE`.
     * 
     */
    public String getMetricKind() {
        return this.metricKind;
    }
    /**
     * The unit in which the metric value is reported. It is only applicable if the valueType is
     * `INT64`, `DOUBLE`, or `DISTRIBUTION`. The supported units are a subset of
     * [The Unified Code for Units of Measure](http://unitsofmeasure.org/ucum.html) standard
     * 
     */
    public Optional<String> getUnit() {
        return Optional.ofNullable(this.unit);
    }
    /**
     * The type of data that can be assigned to the label.
     * Default value is `STRING`.
     * Possible values are `BOOL`, `INT64`, and `STRING`.
     * 
     */
    public String getValueType() {
        return this.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricMetricDescriptor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable List<MetricMetricDescriptorLabel> labels;
        private String metricKind;
        private @Nullable String unit;
        private String valueType;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricMetricDescriptor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.metricKind = defaults.metricKind;
    	      this.unit = defaults.unit;
    	      this.valueType = defaults.valueType;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setLabels(@Nullable List<MetricMetricDescriptorLabel> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setMetricKind(String metricKind) {
            this.metricKind = Objects.requireNonNull(metricKind);
            return this;
        }

        public Builder setUnit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }

        public Builder setValueType(String valueType) {
            this.valueType = Objects.requireNonNull(valueType);
            return this;
        }

        public MetricMetricDescriptor build() {
            return new MetricMetricDescriptor(displayName, labels, metricKind, unit, valueType);
        }
    }
}
