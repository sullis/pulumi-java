// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CategoricalStatsHistogramBucketResponse;
import java.util.List;
import java.util.Objects;


/**
 * Result of the categorical stats computation.
 * 
 */
public final class GooglePrivacyDlpV2CategoricalStatsResultResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2CategoricalStatsResultResponse Empty = new GooglePrivacyDlpV2CategoricalStatsResultResponse();

    /**
     * Histogram of value frequencies in the column.
     * 
     */
    @InputImport(name="valueFrequencyHistogramBuckets", required=true)
      private final List<GooglePrivacyDlpV2CategoricalStatsHistogramBucketResponse> valueFrequencyHistogramBuckets;

    public List<GooglePrivacyDlpV2CategoricalStatsHistogramBucketResponse> getValueFrequencyHistogramBuckets() {
        return this.valueFrequencyHistogramBuckets;
    }

    public GooglePrivacyDlpV2CategoricalStatsResultResponse(List<GooglePrivacyDlpV2CategoricalStatsHistogramBucketResponse> valueFrequencyHistogramBuckets) {
        this.valueFrequencyHistogramBuckets = Objects.requireNonNull(valueFrequencyHistogramBuckets, "expected parameter 'valueFrequencyHistogramBuckets' to be non-null");
    }

    private GooglePrivacyDlpV2CategoricalStatsResultResponse() {
        this.valueFrequencyHistogramBuckets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CategoricalStatsResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2CategoricalStatsHistogramBucketResponse> valueFrequencyHistogramBuckets;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CategoricalStatsResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.valueFrequencyHistogramBuckets = defaults.valueFrequencyHistogramBuckets;
        }

        public Builder setValueFrequencyHistogramBuckets(List<GooglePrivacyDlpV2CategoricalStatsHistogramBucketResponse> valueFrequencyHistogramBuckets) {
            this.valueFrequencyHistogramBuckets = Objects.requireNonNull(valueFrequencyHistogramBuckets);
            return this;
        }
        public GooglePrivacyDlpV2CategoricalStatsResultResponse build() {
            return new GooglePrivacyDlpV2CategoricalStatsResultResponse(valueFrequencyHistogramBuckets);
        }
    }
}