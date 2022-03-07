// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2BigQueryTableResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CategoricalStatsResultResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2DeltaPresenceEstimationResultResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2KAnonymityResultResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2KMapEstimationResultResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2LDiversityResultResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2NumericalStatsResultResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2PrivacyMetricResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2RequestedRiskAnalysisOptionsResponse;
import java.util.Objects;


/**
 * Result of a risk analysis operation request.
 * 
 */
public final class GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse Empty = new GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse();

    /**
     * Categorical stats result
     * 
     */
    @InputImport(name="categoricalStatsResult", required=true)
      private final GooglePrivacyDlpV2CategoricalStatsResultResponse categoricalStatsResult;

    public GooglePrivacyDlpV2CategoricalStatsResultResponse getCategoricalStatsResult() {
        return this.categoricalStatsResult;
    }

    /**
     * Delta-presence result
     * 
     */
    @InputImport(name="deltaPresenceEstimationResult", required=true)
      private final GooglePrivacyDlpV2DeltaPresenceEstimationResultResponse deltaPresenceEstimationResult;

    public GooglePrivacyDlpV2DeltaPresenceEstimationResultResponse getDeltaPresenceEstimationResult() {
        return this.deltaPresenceEstimationResult;
    }

    /**
     * K-anonymity result
     * 
     */
    @InputImport(name="kAnonymityResult", required=true)
      private final GooglePrivacyDlpV2KAnonymityResultResponse kAnonymityResult;

    public GooglePrivacyDlpV2KAnonymityResultResponse getKAnonymityResult() {
        return this.kAnonymityResult;
    }

    /**
     * K-map result
     * 
     */
    @InputImport(name="kMapEstimationResult", required=true)
      private final GooglePrivacyDlpV2KMapEstimationResultResponse kMapEstimationResult;

    public GooglePrivacyDlpV2KMapEstimationResultResponse getKMapEstimationResult() {
        return this.kMapEstimationResult;
    }

    /**
     * L-divesity result
     * 
     */
    @InputImport(name="lDiversityResult", required=true)
      private final GooglePrivacyDlpV2LDiversityResultResponse lDiversityResult;

    public GooglePrivacyDlpV2LDiversityResultResponse getLDiversityResult() {
        return this.lDiversityResult;
    }

    /**
     * Numerical stats result
     * 
     */
    @InputImport(name="numericalStatsResult", required=true)
      private final GooglePrivacyDlpV2NumericalStatsResultResponse numericalStatsResult;

    public GooglePrivacyDlpV2NumericalStatsResultResponse getNumericalStatsResult() {
        return this.numericalStatsResult;
    }

    /**
     * The configuration used for this job.
     * 
     */
    @InputImport(name="requestedOptions", required=true)
      private final GooglePrivacyDlpV2RequestedRiskAnalysisOptionsResponse requestedOptions;

    public GooglePrivacyDlpV2RequestedRiskAnalysisOptionsResponse getRequestedOptions() {
        return this.requestedOptions;
    }

    /**
     * Privacy metric to compute.
     * 
     */
    @InputImport(name="requestedPrivacyMetric", required=true)
      private final GooglePrivacyDlpV2PrivacyMetricResponse requestedPrivacyMetric;

    public GooglePrivacyDlpV2PrivacyMetricResponse getRequestedPrivacyMetric() {
        return this.requestedPrivacyMetric;
    }

    /**
     * Input dataset to compute metrics over.
     * 
     */
    @InputImport(name="requestedSourceTable", required=true)
      private final GooglePrivacyDlpV2BigQueryTableResponse requestedSourceTable;

    public GooglePrivacyDlpV2BigQueryTableResponse getRequestedSourceTable() {
        return this.requestedSourceTable;
    }

    public GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse(
        GooglePrivacyDlpV2CategoricalStatsResultResponse categoricalStatsResult,
        GooglePrivacyDlpV2DeltaPresenceEstimationResultResponse deltaPresenceEstimationResult,
        GooglePrivacyDlpV2KAnonymityResultResponse kAnonymityResult,
        GooglePrivacyDlpV2KMapEstimationResultResponse kMapEstimationResult,
        GooglePrivacyDlpV2LDiversityResultResponse lDiversityResult,
        GooglePrivacyDlpV2NumericalStatsResultResponse numericalStatsResult,
        GooglePrivacyDlpV2RequestedRiskAnalysisOptionsResponse requestedOptions,
        GooglePrivacyDlpV2PrivacyMetricResponse requestedPrivacyMetric,
        GooglePrivacyDlpV2BigQueryTableResponse requestedSourceTable) {
        this.categoricalStatsResult = Objects.requireNonNull(categoricalStatsResult, "expected parameter 'categoricalStatsResult' to be non-null");
        this.deltaPresenceEstimationResult = Objects.requireNonNull(deltaPresenceEstimationResult, "expected parameter 'deltaPresenceEstimationResult' to be non-null");
        this.kAnonymityResult = Objects.requireNonNull(kAnonymityResult, "expected parameter 'kAnonymityResult' to be non-null");
        this.kMapEstimationResult = Objects.requireNonNull(kMapEstimationResult, "expected parameter 'kMapEstimationResult' to be non-null");
        this.lDiversityResult = Objects.requireNonNull(lDiversityResult, "expected parameter 'lDiversityResult' to be non-null");
        this.numericalStatsResult = Objects.requireNonNull(numericalStatsResult, "expected parameter 'numericalStatsResult' to be non-null");
        this.requestedOptions = Objects.requireNonNull(requestedOptions, "expected parameter 'requestedOptions' to be non-null");
        this.requestedPrivacyMetric = Objects.requireNonNull(requestedPrivacyMetric, "expected parameter 'requestedPrivacyMetric' to be non-null");
        this.requestedSourceTable = Objects.requireNonNull(requestedSourceTable, "expected parameter 'requestedSourceTable' to be non-null");
    }

    private GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse() {
        this.categoricalStatsResult = null;
        this.deltaPresenceEstimationResult = null;
        this.kAnonymityResult = null;
        this.kMapEstimationResult = null;
        this.lDiversityResult = null;
        this.numericalStatsResult = null;
        this.requestedOptions = null;
        this.requestedPrivacyMetric = null;
        this.requestedSourceTable = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2CategoricalStatsResultResponse categoricalStatsResult;
        private GooglePrivacyDlpV2DeltaPresenceEstimationResultResponse deltaPresenceEstimationResult;
        private GooglePrivacyDlpV2KAnonymityResultResponse kAnonymityResult;
        private GooglePrivacyDlpV2KMapEstimationResultResponse kMapEstimationResult;
        private GooglePrivacyDlpV2LDiversityResultResponse lDiversityResult;
        private GooglePrivacyDlpV2NumericalStatsResultResponse numericalStatsResult;
        private GooglePrivacyDlpV2RequestedRiskAnalysisOptionsResponse requestedOptions;
        private GooglePrivacyDlpV2PrivacyMetricResponse requestedPrivacyMetric;
        private GooglePrivacyDlpV2BigQueryTableResponse requestedSourceTable;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categoricalStatsResult = defaults.categoricalStatsResult;
    	      this.deltaPresenceEstimationResult = defaults.deltaPresenceEstimationResult;
    	      this.kAnonymityResult = defaults.kAnonymityResult;
    	      this.kMapEstimationResult = defaults.kMapEstimationResult;
    	      this.lDiversityResult = defaults.lDiversityResult;
    	      this.numericalStatsResult = defaults.numericalStatsResult;
    	      this.requestedOptions = defaults.requestedOptions;
    	      this.requestedPrivacyMetric = defaults.requestedPrivacyMetric;
    	      this.requestedSourceTable = defaults.requestedSourceTable;
        }

        public Builder setCategoricalStatsResult(GooglePrivacyDlpV2CategoricalStatsResultResponse categoricalStatsResult) {
            this.categoricalStatsResult = Objects.requireNonNull(categoricalStatsResult);
            return this;
        }

        public Builder setDeltaPresenceEstimationResult(GooglePrivacyDlpV2DeltaPresenceEstimationResultResponse deltaPresenceEstimationResult) {
            this.deltaPresenceEstimationResult = Objects.requireNonNull(deltaPresenceEstimationResult);
            return this;
        }

        public Builder setKAnonymityResult(GooglePrivacyDlpV2KAnonymityResultResponse kAnonymityResult) {
            this.kAnonymityResult = Objects.requireNonNull(kAnonymityResult);
            return this;
        }

        public Builder setKMapEstimationResult(GooglePrivacyDlpV2KMapEstimationResultResponse kMapEstimationResult) {
            this.kMapEstimationResult = Objects.requireNonNull(kMapEstimationResult);
            return this;
        }

        public Builder setLDiversityResult(GooglePrivacyDlpV2LDiversityResultResponse lDiversityResult) {
            this.lDiversityResult = Objects.requireNonNull(lDiversityResult);
            return this;
        }

        public Builder setNumericalStatsResult(GooglePrivacyDlpV2NumericalStatsResultResponse numericalStatsResult) {
            this.numericalStatsResult = Objects.requireNonNull(numericalStatsResult);
            return this;
        }

        public Builder setRequestedOptions(GooglePrivacyDlpV2RequestedRiskAnalysisOptionsResponse requestedOptions) {
            this.requestedOptions = Objects.requireNonNull(requestedOptions);
            return this;
        }

        public Builder setRequestedPrivacyMetric(GooglePrivacyDlpV2PrivacyMetricResponse requestedPrivacyMetric) {
            this.requestedPrivacyMetric = Objects.requireNonNull(requestedPrivacyMetric);
            return this;
        }

        public Builder setRequestedSourceTable(GooglePrivacyDlpV2BigQueryTableResponse requestedSourceTable) {
            this.requestedSourceTable = Objects.requireNonNull(requestedSourceTable);
            return this;
        }
        public GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse build() {
            return new GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse(categoricalStatsResult, deltaPresenceEstimationResult, kAnonymityResult, kMapEstimationResult, lDiversityResult, numericalStatsResult, requestedOptions, requestedPrivacyMetric, requestedSourceTable);
        }
    }
}