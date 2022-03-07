// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.monitoring.outputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRange;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCut {
    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * aggregating values to quantify the good service provided.
     * Must have ValueType = DISTRIBUTION and
     * MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    private final String distributionFilter;
    /**
     * Range of numerical values. The computed good_service
     * will be the count of values x in the Distribution such
     * that range.min <= x <= range.max. inclusive of min and
     * max. Open ranges can be defined by setting
     * just one of min or max. Summed value `X` should satisfy
     * `range.min <= X <= range.max` for a good window.
     * Structure is documented below.
     * 
     */
    private final SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRange range;

    @OutputCustomType.Constructor({"distributionFilter","range"})
    private SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCut(
        String distributionFilter,
        SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRange range) {
        this.distributionFilter = Objects.requireNonNull(distributionFilter);
        this.range = Objects.requireNonNull(range);
    }

    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * aggregating values to quantify the good service provided.
     * Must have ValueType = DISTRIBUTION and
     * MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
    */
    public String getDistributionFilter() {
        return this.distributionFilter;
    }
    /**
     * Range of numerical values. The computed good_service
     * will be the count of values x in the Distribution such
     * that range.min <= x <= range.max. inclusive of min and
     * max. Open ranges can be defined by setting
     * just one of min or max. Summed value `X` should satisfy
     * `range.min <= X <= range.max` for a good window.
     * Structure is documented below.
     * 
    */
    public SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRange getRange() {
        return this.range;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCut defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String distributionFilter;
        private SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRange range;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCut defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionFilter = defaults.distributionFilter;
    	      this.range = defaults.range;
        }

        public Builder setDistributionFilter(String distributionFilter) {
            this.distributionFilter = Objects.requireNonNull(distributionFilter);
            return this;
        }

        public Builder setRange(SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRange range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }
        public SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCut build() {
            return new SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCut(distributionFilter, range);
        }
    }
}