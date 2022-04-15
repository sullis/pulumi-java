// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.outputs;

import io.pulumi.awsnative.lookoutmetrics.enums.AnomalyDetectorMetricSetMetricSetFrequency;
import io.pulumi.awsnative.lookoutmetrics.outputs.AnomalyDetectorMetric;
import io.pulumi.awsnative.lookoutmetrics.outputs.AnomalyDetectorMetricSource;
import io.pulumi.awsnative.lookoutmetrics.outputs.AnomalyDetectorTimestampColumn;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AnomalyDetectorMetricSet {
    /**
     * Dimensions for this MetricSet.
     * 
     */
    private final @Nullable List<String> dimensionList;
    /**
     * Metrics captured by this MetricSet.
     * 
     */
    private final List<AnomalyDetectorMetric> metricList;
    /**
     * A description for the MetricSet.
     * 
     */
    private final @Nullable String metricSetDescription;
    /**
     * A frequency period to aggregate the data
     * 
     */
    private final @Nullable AnomalyDetectorMetricSetMetricSetFrequency metricSetFrequency;
    /**
     * The name of the MetricSet.
     * 
     */
    private final String metricSetName;
    private final AnomalyDetectorMetricSource metricSource;
    /**
     * Offset, in seconds, between the frequency interval and the time at which the metrics are available.
     * 
     */
    private final @Nullable Integer offset;
    private final @Nullable AnomalyDetectorTimestampColumn timestampColumn;
    private final @Nullable String timezone;

    @CustomType.Constructor
    private AnomalyDetectorMetricSet(
        @CustomType.Parameter("dimensionList") @Nullable List<String> dimensionList,
        @CustomType.Parameter("metricList") List<AnomalyDetectorMetric> metricList,
        @CustomType.Parameter("metricSetDescription") @Nullable String metricSetDescription,
        @CustomType.Parameter("metricSetFrequency") @Nullable AnomalyDetectorMetricSetMetricSetFrequency metricSetFrequency,
        @CustomType.Parameter("metricSetName") String metricSetName,
        @CustomType.Parameter("metricSource") AnomalyDetectorMetricSource metricSource,
        @CustomType.Parameter("offset") @Nullable Integer offset,
        @CustomType.Parameter("timestampColumn") @Nullable AnomalyDetectorTimestampColumn timestampColumn,
        @CustomType.Parameter("timezone") @Nullable String timezone) {
        this.dimensionList = dimensionList;
        this.metricList = metricList;
        this.metricSetDescription = metricSetDescription;
        this.metricSetFrequency = metricSetFrequency;
        this.metricSetName = metricSetName;
        this.metricSource = metricSource;
        this.offset = offset;
        this.timestampColumn = timestampColumn;
        this.timezone = timezone;
    }

    /**
     * Dimensions for this MetricSet.
     * 
    */
    public List<String> dimensionList() {
        return this.dimensionList == null ? List.of() : this.dimensionList;
    }
    /**
     * Metrics captured by this MetricSet.
     * 
    */
    public List<AnomalyDetectorMetric> metricList() {
        return this.metricList;
    }
    /**
     * A description for the MetricSet.
     * 
    */
    public Optional<String> metricSetDescription() {
        return Optional.ofNullable(this.metricSetDescription);
    }
    /**
     * A frequency period to aggregate the data
     * 
    */
    public Optional<AnomalyDetectorMetricSetMetricSetFrequency> metricSetFrequency() {
        return Optional.ofNullable(this.metricSetFrequency);
    }
    /**
     * The name of the MetricSet.
     * 
    */
    public String metricSetName() {
        return this.metricSetName;
    }
    public AnomalyDetectorMetricSource metricSource() {
        return this.metricSource;
    }
    /**
     * Offset, in seconds, between the frequency interval and the time at which the metrics are available.
     * 
    */
    public Optional<Integer> offset() {
        return Optional.ofNullable(this.offset);
    }
    public Optional<AnomalyDetectorTimestampColumn> timestampColumn() {
        return Optional.ofNullable(this.timestampColumn);
    }
    public Optional<String> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorMetricSet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dimensionList;
        private List<AnomalyDetectorMetric> metricList;
        private @Nullable String metricSetDescription;
        private @Nullable AnomalyDetectorMetricSetMetricSetFrequency metricSetFrequency;
        private String metricSetName;
        private AnomalyDetectorMetricSource metricSource;
        private @Nullable Integer offset;
        private @Nullable AnomalyDetectorTimestampColumn timestampColumn;
        private @Nullable String timezone;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorMetricSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensionList = defaults.dimensionList;
    	      this.metricList = defaults.metricList;
    	      this.metricSetDescription = defaults.metricSetDescription;
    	      this.metricSetFrequency = defaults.metricSetFrequency;
    	      this.metricSetName = defaults.metricSetName;
    	      this.metricSource = defaults.metricSource;
    	      this.offset = defaults.offset;
    	      this.timestampColumn = defaults.timestampColumn;
    	      this.timezone = defaults.timezone;
        }

        public Builder dimensionList(@Nullable List<String> dimensionList) {
            this.dimensionList = dimensionList;
            return this;
        }
        public Builder dimensionList(String... dimensionList) {
            return dimensionList(List.of(dimensionList));
        }
        public Builder metricList(List<AnomalyDetectorMetric> metricList) {
            this.metricList = Objects.requireNonNull(metricList);
            return this;
        }
        public Builder metricList(AnomalyDetectorMetric... metricList) {
            return metricList(List.of(metricList));
        }
        public Builder metricSetDescription(@Nullable String metricSetDescription) {
            this.metricSetDescription = metricSetDescription;
            return this;
        }
        public Builder metricSetFrequency(@Nullable AnomalyDetectorMetricSetMetricSetFrequency metricSetFrequency) {
            this.metricSetFrequency = metricSetFrequency;
            return this;
        }
        public Builder metricSetName(String metricSetName) {
            this.metricSetName = Objects.requireNonNull(metricSetName);
            return this;
        }
        public Builder metricSource(AnomalyDetectorMetricSource metricSource) {
            this.metricSource = Objects.requireNonNull(metricSource);
            return this;
        }
        public Builder offset(@Nullable Integer offset) {
            this.offset = offset;
            return this;
        }
        public Builder timestampColumn(@Nullable AnomalyDetectorTimestampColumn timestampColumn) {
            this.timestampColumn = timestampColumn;
            return this;
        }
        public Builder timezone(@Nullable String timezone) {
            this.timezone = timezone;
            return this;
        }        public AnomalyDetectorMetricSet build() {
            return new AnomalyDetectorMetricSet(dimensionList, metricList, metricSetDescription, metricSetFrequency, metricSetName, metricSource, offset, timestampColumn, timezone);
        }
    }
}
