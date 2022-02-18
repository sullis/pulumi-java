// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.inputs;

import io.pulumi.awsnative.lookoutmetrics.enums.AnomalyDetectorMetricSetMetricSetFrequency;
import io.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorMetricArgs;
import io.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorMetricSourceArgs;
import io.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorTimestampColumnArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnomalyDetectorMetricSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnomalyDetectorMetricSetArgs Empty = new AnomalyDetectorMetricSetArgs();

    /**
     * Dimensions for this MetricSet.
     * 
     */
    @InputImport(name="dimensionList")
    private final @Nullable Input<List<String>> dimensionList;

    public Input<List<String>> getDimensionList() {
        return this.dimensionList == null ? Input.empty() : this.dimensionList;
    }

    /**
     * Metrics captured by this MetricSet.
     * 
     */
    @InputImport(name="metricList", required=true)
    private final Input<List<AnomalyDetectorMetricArgs>> metricList;

    public Input<List<AnomalyDetectorMetricArgs>> getMetricList() {
        return this.metricList;
    }

    /**
     * A description for the MetricSet.
     * 
     */
    @InputImport(name="metricSetDescription")
    private final @Nullable Input<String> metricSetDescription;

    public Input<String> getMetricSetDescription() {
        return this.metricSetDescription == null ? Input.empty() : this.metricSetDescription;
    }

    /**
     * A frequency period to aggregate the data
     * 
     */
    @InputImport(name="metricSetFrequency")
    private final @Nullable Input<AnomalyDetectorMetricSetMetricSetFrequency> metricSetFrequency;

    public Input<AnomalyDetectorMetricSetMetricSetFrequency> getMetricSetFrequency() {
        return this.metricSetFrequency == null ? Input.empty() : this.metricSetFrequency;
    }

    /**
     * The name of the MetricSet.
     * 
     */
    @InputImport(name="metricSetName", required=true)
    private final Input<String> metricSetName;

    public Input<String> getMetricSetName() {
        return this.metricSetName;
    }

    @InputImport(name="metricSource", required=true)
    private final Input<AnomalyDetectorMetricSourceArgs> metricSource;

    public Input<AnomalyDetectorMetricSourceArgs> getMetricSource() {
        return this.metricSource;
    }

    /**
     * Offset, in seconds, between the frequency interval and the time at which the metrics are available.
     * 
     */
    @InputImport(name="offset")
    private final @Nullable Input<Integer> offset;

    public Input<Integer> getOffset() {
        return this.offset == null ? Input.empty() : this.offset;
    }

    @InputImport(name="timestampColumn")
    private final @Nullable Input<AnomalyDetectorTimestampColumnArgs> timestampColumn;

    public Input<AnomalyDetectorTimestampColumnArgs> getTimestampColumn() {
        return this.timestampColumn == null ? Input.empty() : this.timestampColumn;
    }

    @InputImport(name="timezone")
    private final @Nullable Input<String> timezone;

    public Input<String> getTimezone() {
        return this.timezone == null ? Input.empty() : this.timezone;
    }

    public AnomalyDetectorMetricSetArgs(
        @Nullable Input<List<String>> dimensionList,
        Input<List<AnomalyDetectorMetricArgs>> metricList,
        @Nullable Input<String> metricSetDescription,
        @Nullable Input<AnomalyDetectorMetricSetMetricSetFrequency> metricSetFrequency,
        Input<String> metricSetName,
        Input<AnomalyDetectorMetricSourceArgs> metricSource,
        @Nullable Input<Integer> offset,
        @Nullable Input<AnomalyDetectorTimestampColumnArgs> timestampColumn,
        @Nullable Input<String> timezone) {
        this.dimensionList = dimensionList;
        this.metricList = Objects.requireNonNull(metricList, "expected parameter 'metricList' to be non-null");
        this.metricSetDescription = metricSetDescription;
        this.metricSetFrequency = metricSetFrequency;
        this.metricSetName = Objects.requireNonNull(metricSetName, "expected parameter 'metricSetName' to be non-null");
        this.metricSource = Objects.requireNonNull(metricSource, "expected parameter 'metricSource' to be non-null");
        this.offset = offset;
        this.timestampColumn = timestampColumn;
        this.timezone = timezone;
    }

    private AnomalyDetectorMetricSetArgs() {
        this.dimensionList = Input.empty();
        this.metricList = Input.empty();
        this.metricSetDescription = Input.empty();
        this.metricSetFrequency = Input.empty();
        this.metricSetName = Input.empty();
        this.metricSource = Input.empty();
        this.offset = Input.empty();
        this.timestampColumn = Input.empty();
        this.timezone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorMetricSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> dimensionList;
        private Input<List<AnomalyDetectorMetricArgs>> metricList;
        private @Nullable Input<String> metricSetDescription;
        private @Nullable Input<AnomalyDetectorMetricSetMetricSetFrequency> metricSetFrequency;
        private Input<String> metricSetName;
        private Input<AnomalyDetectorMetricSourceArgs> metricSource;
        private @Nullable Input<Integer> offset;
        private @Nullable Input<AnomalyDetectorTimestampColumnArgs> timestampColumn;
        private @Nullable Input<String> timezone;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorMetricSetArgs defaults) {
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

        public Builder setDimensionList(@Nullable Input<List<String>> dimensionList) {
            this.dimensionList = dimensionList;
            return this;
        }

        public Builder setDimensionList(@Nullable List<String> dimensionList) {
            this.dimensionList = Input.ofNullable(dimensionList);
            return this;
        }

        public Builder setMetricList(Input<List<AnomalyDetectorMetricArgs>> metricList) {
            this.metricList = Objects.requireNonNull(metricList);
            return this;
        }

        public Builder setMetricList(List<AnomalyDetectorMetricArgs> metricList) {
            this.metricList = Input.of(Objects.requireNonNull(metricList));
            return this;
        }

        public Builder setMetricSetDescription(@Nullable Input<String> metricSetDescription) {
            this.metricSetDescription = metricSetDescription;
            return this;
        }

        public Builder setMetricSetDescription(@Nullable String metricSetDescription) {
            this.metricSetDescription = Input.ofNullable(metricSetDescription);
            return this;
        }

        public Builder setMetricSetFrequency(@Nullable Input<AnomalyDetectorMetricSetMetricSetFrequency> metricSetFrequency) {
            this.metricSetFrequency = metricSetFrequency;
            return this;
        }

        public Builder setMetricSetFrequency(@Nullable AnomalyDetectorMetricSetMetricSetFrequency metricSetFrequency) {
            this.metricSetFrequency = Input.ofNullable(metricSetFrequency);
            return this;
        }

        public Builder setMetricSetName(Input<String> metricSetName) {
            this.metricSetName = Objects.requireNonNull(metricSetName);
            return this;
        }

        public Builder setMetricSetName(String metricSetName) {
            this.metricSetName = Input.of(Objects.requireNonNull(metricSetName));
            return this;
        }

        public Builder setMetricSource(Input<AnomalyDetectorMetricSourceArgs> metricSource) {
            this.metricSource = Objects.requireNonNull(metricSource);
            return this;
        }

        public Builder setMetricSource(AnomalyDetectorMetricSourceArgs metricSource) {
            this.metricSource = Input.of(Objects.requireNonNull(metricSource));
            return this;
        }

        public Builder setOffset(@Nullable Input<Integer> offset) {
            this.offset = offset;
            return this;
        }

        public Builder setOffset(@Nullable Integer offset) {
            this.offset = Input.ofNullable(offset);
            return this;
        }

        public Builder setTimestampColumn(@Nullable Input<AnomalyDetectorTimestampColumnArgs> timestampColumn) {
            this.timestampColumn = timestampColumn;
            return this;
        }

        public Builder setTimestampColumn(@Nullable AnomalyDetectorTimestampColumnArgs timestampColumn) {
            this.timestampColumn = Input.ofNullable(timestampColumn);
            return this;
        }

        public Builder setTimezone(@Nullable Input<String> timezone) {
            this.timezone = timezone;
            return this;
        }

        public Builder setTimezone(@Nullable String timezone) {
            this.timezone = Input.ofNullable(timezone);
            return this;
        }

        public AnomalyDetectorMetricSetArgs build() {
            return new AnomalyDetectorMetricSetArgs(dimensionList, metricList, metricSetDescription, metricSetFrequency, metricSetName, metricSource, offset, timestampColumn, timezone);
        }
    }
}
