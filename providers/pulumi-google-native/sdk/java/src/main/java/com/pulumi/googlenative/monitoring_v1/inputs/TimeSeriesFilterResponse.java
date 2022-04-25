// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring_v1.inputs.AggregationResponse;
import com.pulumi.googlenative.monitoring_v1.inputs.PickTimeSeriesFilterResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A filter that defines a subset of time series data that is displayed in a widget. Time series data is fetched using the ListTimeSeries (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list) method.
 * 
 */
public final class TimeSeriesFilterResponse extends com.pulumi.resources.InvokeArgs {

    public static final TimeSeriesFilterResponse Empty = new TimeSeriesFilterResponse();

    /**
     * By default, the raw time series data is returned. Use this field to combine multiple time series for different views of the data.
     * 
     */
    @Import(name="aggregation", required=true)
    private AggregationResponse aggregation;

    /**
     * @return By default, the raw time series data is returned. Use this field to combine multiple time series for different views of the data.
     * 
     */
    public AggregationResponse aggregation() {
        return this.aggregation;
    }

    /**
     * The monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies the metric types, resources, and projects to query.
     * 
     */
    @Import(name="filter", required=true)
    private String filter;

    /**
     * @return The monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies the metric types, resources, and projects to query.
     * 
     */
    public String filter() {
        return this.filter;
    }

    /**
     * Ranking based time series filter.
     * 
     */
    @Import(name="pickTimeSeriesFilter", required=true)
    private PickTimeSeriesFilterResponse pickTimeSeriesFilter;

    /**
     * @return Ranking based time series filter.
     * 
     */
    public PickTimeSeriesFilterResponse pickTimeSeriesFilter() {
        return this.pickTimeSeriesFilter;
    }

    /**
     * Apply a second aggregation after aggregation is applied.
     * 
     */
    @Import(name="secondaryAggregation", required=true)
    private AggregationResponse secondaryAggregation;

    /**
     * @return Apply a second aggregation after aggregation is applied.
     * 
     */
    public AggregationResponse secondaryAggregation() {
        return this.secondaryAggregation;
    }

    private TimeSeriesFilterResponse() {}

    private TimeSeriesFilterResponse(TimeSeriesFilterResponse $) {
        this.aggregation = $.aggregation;
        this.filter = $.filter;
        this.pickTimeSeriesFilter = $.pickTimeSeriesFilter;
        this.secondaryAggregation = $.secondaryAggregation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TimeSeriesFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimeSeriesFilterResponse $;

        public Builder() {
            $ = new TimeSeriesFilterResponse();
        }

        public Builder(TimeSeriesFilterResponse defaults) {
            $ = new TimeSeriesFilterResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregation By default, the raw time series data is returned. Use this field to combine multiple time series for different views of the data.
         * 
         * @return builder
         * 
         */
        public Builder aggregation(AggregationResponse aggregation) {
            $.aggregation = aggregation;
            return this;
        }

        /**
         * @param filter The monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies the metric types, resources, and projects to query.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param pickTimeSeriesFilter Ranking based time series filter.
         * 
         * @return builder
         * 
         */
        public Builder pickTimeSeriesFilter(PickTimeSeriesFilterResponse pickTimeSeriesFilter) {
            $.pickTimeSeriesFilter = pickTimeSeriesFilter;
            return this;
        }

        /**
         * @param secondaryAggregation Apply a second aggregation after aggregation is applied.
         * 
         * @return builder
         * 
         */
        public Builder secondaryAggregation(AggregationResponse secondaryAggregation) {
            $.secondaryAggregation = secondaryAggregation;
            return this;
        }

        public TimeSeriesFilterResponse build() {
            $.aggregation = Objects.requireNonNull($.aggregation, "expected parameter 'aggregation' to be non-null");
            $.filter = Objects.requireNonNull($.filter, "expected parameter 'filter' to be non-null");
            $.pickTimeSeriesFilter = Objects.requireNonNull($.pickTimeSeriesFilter, "expected parameter 'pickTimeSeriesFilter' to be non-null");
            $.secondaryAggregation = Objects.requireNonNull($.secondaryAggregation, "expected parameter 'secondaryAggregation' to be non-null");
            return $;
        }
    }

}
