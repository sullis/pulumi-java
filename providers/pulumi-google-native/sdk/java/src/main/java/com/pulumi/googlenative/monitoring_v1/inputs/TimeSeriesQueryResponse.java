// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring_v1.inputs.TimeSeriesFilterRatioResponse;
import com.pulumi.googlenative.monitoring_v1.inputs.TimeSeriesFilterResponse;
import java.lang.String;
import java.util.Objects;


/**
 * TimeSeriesQuery collects the set of supported methods for querying time series data from the Stackdriver metrics API.
 * 
 */
public final class TimeSeriesQueryResponse extends com.pulumi.resources.InvokeArgs {

    public static final TimeSeriesQueryResponse Empty = new TimeSeriesQueryResponse();

    /**
     * Filter parameters to fetch time series.
     * 
     */
    @Import(name="timeSeriesFilter", required=true)
    private TimeSeriesFilterResponse timeSeriesFilter;

    /**
     * @return Filter parameters to fetch time series.
     * 
     */
    public TimeSeriesFilterResponse timeSeriesFilter() {
        return this.timeSeriesFilter;
    }

    /**
     * Parameters to fetch a ratio between two time series filters.
     * 
     */
    @Import(name="timeSeriesFilterRatio", required=true)
    private TimeSeriesFilterRatioResponse timeSeriesFilterRatio;

    /**
     * @return Parameters to fetch a ratio between two time series filters.
     * 
     */
    public TimeSeriesFilterRatioResponse timeSeriesFilterRatio() {
        return this.timeSeriesFilterRatio;
    }

    /**
     * A query used to fetch time series.
     * 
     */
    @Import(name="timeSeriesQueryLanguage", required=true)
    private String timeSeriesQueryLanguage;

    /**
     * @return A query used to fetch time series.
     * 
     */
    public String timeSeriesQueryLanguage() {
        return this.timeSeriesQueryLanguage;
    }

    /**
     * The unit of data contained in fetched time series. If non-empty, this unit will override any unit that accompanies fetched data. The format is the same as the unit (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors) field in MetricDescriptor.
     * 
     */
    @Import(name="unitOverride", required=true)
    private String unitOverride;

    /**
     * @return The unit of data contained in fetched time series. If non-empty, this unit will override any unit that accompanies fetched data. The format is the same as the unit (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors) field in MetricDescriptor.
     * 
     */
    public String unitOverride() {
        return this.unitOverride;
    }

    private TimeSeriesQueryResponse() {}

    private TimeSeriesQueryResponse(TimeSeriesQueryResponse $) {
        this.timeSeriesFilter = $.timeSeriesFilter;
        this.timeSeriesFilterRatio = $.timeSeriesFilterRatio;
        this.timeSeriesQueryLanguage = $.timeSeriesQueryLanguage;
        this.unitOverride = $.unitOverride;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TimeSeriesQueryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimeSeriesQueryResponse $;

        public Builder() {
            $ = new TimeSeriesQueryResponse();
        }

        public Builder(TimeSeriesQueryResponse defaults) {
            $ = new TimeSeriesQueryResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param timeSeriesFilter Filter parameters to fetch time series.
         * 
         * @return builder
         * 
         */
        public Builder timeSeriesFilter(TimeSeriesFilterResponse timeSeriesFilter) {
            $.timeSeriesFilter = timeSeriesFilter;
            return this;
        }

        /**
         * @param timeSeriesFilterRatio Parameters to fetch a ratio between two time series filters.
         * 
         * @return builder
         * 
         */
        public Builder timeSeriesFilterRatio(TimeSeriesFilterRatioResponse timeSeriesFilterRatio) {
            $.timeSeriesFilterRatio = timeSeriesFilterRatio;
            return this;
        }

        /**
         * @param timeSeriesQueryLanguage A query used to fetch time series.
         * 
         * @return builder
         * 
         */
        public Builder timeSeriesQueryLanguage(String timeSeriesQueryLanguage) {
            $.timeSeriesQueryLanguage = timeSeriesQueryLanguage;
            return this;
        }

        /**
         * @param unitOverride The unit of data contained in fetched time series. If non-empty, this unit will override any unit that accompanies fetched data. The format is the same as the unit (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors) field in MetricDescriptor.
         * 
         * @return builder
         * 
         */
        public Builder unitOverride(String unitOverride) {
            $.unitOverride = unitOverride;
            return this;
        }

        public TimeSeriesQueryResponse build() {
            $.timeSeriesFilter = Objects.requireNonNull($.timeSeriesFilter, "expected parameter 'timeSeriesFilter' to be non-null");
            $.timeSeriesFilterRatio = Objects.requireNonNull($.timeSeriesFilterRatio, "expected parameter 'timeSeriesFilterRatio' to be non-null");
            $.timeSeriesQueryLanguage = Objects.requireNonNull($.timeSeriesQueryLanguage, "expected parameter 'timeSeriesQueryLanguage' to be non-null");
            $.unitOverride = Objects.requireNonNull($.unitOverride, "expected parameter 'unitOverride' to be non-null");
            return $;
        }
    }

}
