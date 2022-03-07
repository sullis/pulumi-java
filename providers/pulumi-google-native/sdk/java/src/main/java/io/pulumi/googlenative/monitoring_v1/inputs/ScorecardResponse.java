// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v1.inputs.GaugeViewResponse;
import io.pulumi.googlenative.monitoring_v1.inputs.SparkChartViewResponse;
import io.pulumi.googlenative.monitoring_v1.inputs.ThresholdResponse;
import io.pulumi.googlenative.monitoring_v1.inputs.TimeSeriesQueryResponse;
import java.util.List;
import java.util.Objects;


/**
 * A widget showing the latest value of a metric, and how this value relates to one or more thresholds.
 * 
 */
public final class ScorecardResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScorecardResponse Empty = new ScorecardResponse();

    /**
     * Will cause the scorecard to show a gauge chart.
     * 
     */
    @InputImport(name="gaugeView", required=true)
      private final GaugeViewResponse gaugeView;

    public GaugeViewResponse getGaugeView() {
        return this.gaugeView;
    }

    /**
     * Will cause the scorecard to show a spark chart.
     * 
     */
    @InputImport(name="sparkChartView", required=true)
      private final SparkChartViewResponse sparkChartView;

    public SparkChartViewResponse getSparkChartView() {
        return this.sparkChartView;
    }

    /**
     * The thresholds used to determine the state of the scorecard given the time series' current value. For an actual value x, the scorecard is in a danger state if x is less than or equal to a danger threshold that triggers below, or greater than or equal to a danger threshold that triggers above. Similarly, if x is above/below a warning threshold that triggers above/below, then the scorecard is in a warning state - unless x also puts it in a danger state. (Danger trumps warning.)As an example, consider a scorecard with the following four thresholds: { value: 90, category: 'DANGER', trigger: 'ABOVE', }, { value: 70, category: 'WARNING', trigger: 'ABOVE', }, { value: 10, category: 'DANGER', trigger: 'BELOW', }, { value: 20, category: 'WARNING', trigger: 'BELOW', }Then: values less than or equal to 10 would put the scorecard in a DANGER state, values greater than 10 but less than or equal to 20 a WARNING state, values strictly between 20 and 70 an OK state, values greater than or equal to 70 but less than 90 a WARNING state, and values greater than or equal to 90 a DANGER state.
     * 
     */
    @InputImport(name="thresholds", required=true)
      private final List<ThresholdResponse> thresholds;

    public List<ThresholdResponse> getThresholds() {
        return this.thresholds;
    }

    /**
     * Fields for querying time series data from the Stackdriver metrics API.
     * 
     */
    @InputImport(name="timeSeriesQuery", required=true)
      private final TimeSeriesQueryResponse timeSeriesQuery;

    public TimeSeriesQueryResponse getTimeSeriesQuery() {
        return this.timeSeriesQuery;
    }

    public ScorecardResponse(
        GaugeViewResponse gaugeView,
        SparkChartViewResponse sparkChartView,
        List<ThresholdResponse> thresholds,
        TimeSeriesQueryResponse timeSeriesQuery) {
        this.gaugeView = Objects.requireNonNull(gaugeView, "expected parameter 'gaugeView' to be non-null");
        this.sparkChartView = Objects.requireNonNull(sparkChartView, "expected parameter 'sparkChartView' to be non-null");
        this.thresholds = Objects.requireNonNull(thresholds, "expected parameter 'thresholds' to be non-null");
        this.timeSeriesQuery = Objects.requireNonNull(timeSeriesQuery, "expected parameter 'timeSeriesQuery' to be non-null");
    }

    private ScorecardResponse() {
        this.gaugeView = null;
        this.sparkChartView = null;
        this.thresholds = List.of();
        this.timeSeriesQuery = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScorecardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GaugeViewResponse gaugeView;
        private SparkChartViewResponse sparkChartView;
        private List<ThresholdResponse> thresholds;
        private TimeSeriesQueryResponse timeSeriesQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(ScorecardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gaugeView = defaults.gaugeView;
    	      this.sparkChartView = defaults.sparkChartView;
    	      this.thresholds = defaults.thresholds;
    	      this.timeSeriesQuery = defaults.timeSeriesQuery;
        }

        public Builder setGaugeView(GaugeViewResponse gaugeView) {
            this.gaugeView = Objects.requireNonNull(gaugeView);
            return this;
        }

        public Builder setSparkChartView(SparkChartViewResponse sparkChartView) {
            this.sparkChartView = Objects.requireNonNull(sparkChartView);
            return this;
        }

        public Builder setThresholds(List<ThresholdResponse> thresholds) {
            this.thresholds = Objects.requireNonNull(thresholds);
            return this;
        }

        public Builder setTimeSeriesQuery(TimeSeriesQueryResponse timeSeriesQuery) {
            this.timeSeriesQuery = Objects.requireNonNull(timeSeriesQuery);
            return this;
        }
        public ScorecardResponse build() {
            return new ScorecardResponse(gaugeView, sparkChartView, thresholds, timeSeriesQuery);
        }
    }
}