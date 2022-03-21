// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatio {
    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * quantifying bad service provided, either demanded service that
     * was not provided or demanded service that was of inadequate
     * quality. Exactly two of
     * good, bad, or total service filter must be defined (where
     * good + bad = total is assumed)
     * Must have ValueType = DOUBLE or ValueType = INT64 and
     * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    private final @Nullable String badServiceFilter;
    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * quantifying good service provided. Exactly two of
     * good, bad, or total service filter must be defined (where
     * good + bad = total is assumed)
     * Must have ValueType = DOUBLE or ValueType = INT64 and
     * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    private final @Nullable String goodServiceFilter;
    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * quantifying total demanded service. Exactly two of
     * good, bad, or total service filter must be defined (where
     * good + bad = total is assumed)
     * Must have ValueType = DOUBLE or ValueType = INT64 and
     * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    private final @Nullable String totalServiceFilter;

    @CustomType.Constructor
    private SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatio(
        @CustomType.Parameter("badServiceFilter") @Nullable String badServiceFilter,
        @CustomType.Parameter("goodServiceFilter") @Nullable String goodServiceFilter,
        @CustomType.Parameter("totalServiceFilter") @Nullable String totalServiceFilter) {
        this.badServiceFilter = badServiceFilter;
        this.goodServiceFilter = goodServiceFilter;
        this.totalServiceFilter = totalServiceFilter;
    }

    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * quantifying bad service provided, either demanded service that
     * was not provided or demanded service that was of inadequate
     * quality. Exactly two of
     * good, bad, or total service filter must be defined (where
     * good + bad = total is assumed)
     * Must have ValueType = DOUBLE or ValueType = INT64 and
     * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
    */
    public Optional<String> getBadServiceFilter() {
        return Optional.ofNullable(this.badServiceFilter);
    }
    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * quantifying good service provided. Exactly two of
     * good, bad, or total service filter must be defined (where
     * good + bad = total is assumed)
     * Must have ValueType = DOUBLE or ValueType = INT64 and
     * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
    */
    public Optional<String> getGoodServiceFilter() {
        return Optional.ofNullable(this.goodServiceFilter);
    }
    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * quantifying total demanded service. Exactly two of
     * good, bad, or total service filter must be defined (where
     * good + bad = total is assumed)
     * Must have ValueType = DOUBLE or ValueType = INT64 and
     * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
    */
    public Optional<String> getTotalServiceFilter() {
        return Optional.ofNullable(this.totalServiceFilter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatio defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String badServiceFilter;
        private @Nullable String goodServiceFilter;
        private @Nullable String totalServiceFilter;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatio defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.badServiceFilter = defaults.badServiceFilter;
    	      this.goodServiceFilter = defaults.goodServiceFilter;
    	      this.totalServiceFilter = defaults.totalServiceFilter;
        }

        public Builder badServiceFilter(@Nullable String badServiceFilter) {
            this.badServiceFilter = badServiceFilter;
            return this;
        }
        public Builder goodServiceFilter(@Nullable String goodServiceFilter) {
            this.goodServiceFilter = goodServiceFilter;
            return this;
        }
        public Builder totalServiceFilter(@Nullable String totalServiceFilter) {
            this.totalServiceFilter = totalServiceFilter;
            return this;
        }        public SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatio build() {
            return new SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatio(badServiceFilter, goodServiceFilter, totalServiceFilter);
        }
    }
}
