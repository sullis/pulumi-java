// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2BigQueryTableResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CategoricalStatsResultResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2DeltaPresenceEstimationResultResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2KAnonymityResultResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2KMapEstimationResultResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2LDiversityResultResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2NumericalStatsResultResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2PrivacyMetricResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2RequestedRiskAnalysisOptionsResponse;
import java.util.Objects;


/**
 * Result of a risk analysis operation request.
 * 
 */
public final class GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse Empty = new GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse();

    /**
     * Categorical stats result
     * 
     */
    @Import(name="categoricalStatsResult", required=true)
    private GooglePrivacyDlpV2CategoricalStatsResultResponse categoricalStatsResult;

    /**
     * @return Categorical stats result
     * 
     */
    public GooglePrivacyDlpV2CategoricalStatsResultResponse categoricalStatsResult() {
        return this.categoricalStatsResult;
    }

    /**
     * Delta-presence result
     * 
     */
    @Import(name="deltaPresenceEstimationResult", required=true)
    private GooglePrivacyDlpV2DeltaPresenceEstimationResultResponse deltaPresenceEstimationResult;

    /**
     * @return Delta-presence result
     * 
     */
    public GooglePrivacyDlpV2DeltaPresenceEstimationResultResponse deltaPresenceEstimationResult() {
        return this.deltaPresenceEstimationResult;
    }

    /**
     * K-anonymity result
     * 
     */
    @Import(name="kAnonymityResult", required=true)
    private GooglePrivacyDlpV2KAnonymityResultResponse kAnonymityResult;

    /**
     * @return K-anonymity result
     * 
     */
    public GooglePrivacyDlpV2KAnonymityResultResponse kAnonymityResult() {
        return this.kAnonymityResult;
    }

    /**
     * K-map result
     * 
     */
    @Import(name="kMapEstimationResult", required=true)
    private GooglePrivacyDlpV2KMapEstimationResultResponse kMapEstimationResult;

    /**
     * @return K-map result
     * 
     */
    public GooglePrivacyDlpV2KMapEstimationResultResponse kMapEstimationResult() {
        return this.kMapEstimationResult;
    }

    /**
     * L-divesity result
     * 
     */
    @Import(name="lDiversityResult", required=true)
    private GooglePrivacyDlpV2LDiversityResultResponse lDiversityResult;

    /**
     * @return L-divesity result
     * 
     */
    public GooglePrivacyDlpV2LDiversityResultResponse lDiversityResult() {
        return this.lDiversityResult;
    }

    /**
     * Numerical stats result
     * 
     */
    @Import(name="numericalStatsResult", required=true)
    private GooglePrivacyDlpV2NumericalStatsResultResponse numericalStatsResult;

    /**
     * @return Numerical stats result
     * 
     */
    public GooglePrivacyDlpV2NumericalStatsResultResponse numericalStatsResult() {
        return this.numericalStatsResult;
    }

    /**
     * The configuration used for this job.
     * 
     */
    @Import(name="requestedOptions", required=true)
    private GooglePrivacyDlpV2RequestedRiskAnalysisOptionsResponse requestedOptions;

    /**
     * @return The configuration used for this job.
     * 
     */
    public GooglePrivacyDlpV2RequestedRiskAnalysisOptionsResponse requestedOptions() {
        return this.requestedOptions;
    }

    /**
     * Privacy metric to compute.
     * 
     */
    @Import(name="requestedPrivacyMetric", required=true)
    private GooglePrivacyDlpV2PrivacyMetricResponse requestedPrivacyMetric;

    /**
     * @return Privacy metric to compute.
     * 
     */
    public GooglePrivacyDlpV2PrivacyMetricResponse requestedPrivacyMetric() {
        return this.requestedPrivacyMetric;
    }

    /**
     * Input dataset to compute metrics over.
     * 
     */
    @Import(name="requestedSourceTable", required=true)
    private GooglePrivacyDlpV2BigQueryTableResponse requestedSourceTable;

    /**
     * @return Input dataset to compute metrics over.
     * 
     */
    public GooglePrivacyDlpV2BigQueryTableResponse requestedSourceTable() {
        return this.requestedSourceTable;
    }

    private GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse() {}

    private GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse(GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse $) {
        this.categoricalStatsResult = $.categoricalStatsResult;
        this.deltaPresenceEstimationResult = $.deltaPresenceEstimationResult;
        this.kAnonymityResult = $.kAnonymityResult;
        this.kMapEstimationResult = $.kMapEstimationResult;
        this.lDiversityResult = $.lDiversityResult;
        this.numericalStatsResult = $.numericalStatsResult;
        this.requestedOptions = $.requestedOptions;
        this.requestedPrivacyMetric = $.requestedPrivacyMetric;
        this.requestedSourceTable = $.requestedSourceTable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse $;

        public Builder() {
            $ = new GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse();
        }

        public Builder(GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse defaults) {
            $ = new GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param categoricalStatsResult Categorical stats result
         * 
         * @return builder
         * 
         */
        public Builder categoricalStatsResult(GooglePrivacyDlpV2CategoricalStatsResultResponse categoricalStatsResult) {
            $.categoricalStatsResult = categoricalStatsResult;
            return this;
        }

        /**
         * @param deltaPresenceEstimationResult Delta-presence result
         * 
         * @return builder
         * 
         */
        public Builder deltaPresenceEstimationResult(GooglePrivacyDlpV2DeltaPresenceEstimationResultResponse deltaPresenceEstimationResult) {
            $.deltaPresenceEstimationResult = deltaPresenceEstimationResult;
            return this;
        }

        /**
         * @param kAnonymityResult K-anonymity result
         * 
         * @return builder
         * 
         */
        public Builder kAnonymityResult(GooglePrivacyDlpV2KAnonymityResultResponse kAnonymityResult) {
            $.kAnonymityResult = kAnonymityResult;
            return this;
        }

        /**
         * @param kMapEstimationResult K-map result
         * 
         * @return builder
         * 
         */
        public Builder kMapEstimationResult(GooglePrivacyDlpV2KMapEstimationResultResponse kMapEstimationResult) {
            $.kMapEstimationResult = kMapEstimationResult;
            return this;
        }

        /**
         * @param lDiversityResult L-divesity result
         * 
         * @return builder
         * 
         */
        public Builder lDiversityResult(GooglePrivacyDlpV2LDiversityResultResponse lDiversityResult) {
            $.lDiversityResult = lDiversityResult;
            return this;
        }

        /**
         * @param numericalStatsResult Numerical stats result
         * 
         * @return builder
         * 
         */
        public Builder numericalStatsResult(GooglePrivacyDlpV2NumericalStatsResultResponse numericalStatsResult) {
            $.numericalStatsResult = numericalStatsResult;
            return this;
        }

        /**
         * @param requestedOptions The configuration used for this job.
         * 
         * @return builder
         * 
         */
        public Builder requestedOptions(GooglePrivacyDlpV2RequestedRiskAnalysisOptionsResponse requestedOptions) {
            $.requestedOptions = requestedOptions;
            return this;
        }

        /**
         * @param requestedPrivacyMetric Privacy metric to compute.
         * 
         * @return builder
         * 
         */
        public Builder requestedPrivacyMetric(GooglePrivacyDlpV2PrivacyMetricResponse requestedPrivacyMetric) {
            $.requestedPrivacyMetric = requestedPrivacyMetric;
            return this;
        }

        /**
         * @param requestedSourceTable Input dataset to compute metrics over.
         * 
         * @return builder
         * 
         */
        public Builder requestedSourceTable(GooglePrivacyDlpV2BigQueryTableResponse requestedSourceTable) {
            $.requestedSourceTable = requestedSourceTable;
            return this;
        }

        public GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse build() {
            $.categoricalStatsResult = Objects.requireNonNull($.categoricalStatsResult, "expected parameter 'categoricalStatsResult' to be non-null");
            $.deltaPresenceEstimationResult = Objects.requireNonNull($.deltaPresenceEstimationResult, "expected parameter 'deltaPresenceEstimationResult' to be non-null");
            $.kAnonymityResult = Objects.requireNonNull($.kAnonymityResult, "expected parameter 'kAnonymityResult' to be non-null");
            $.kMapEstimationResult = Objects.requireNonNull($.kMapEstimationResult, "expected parameter 'kMapEstimationResult' to be non-null");
            $.lDiversityResult = Objects.requireNonNull($.lDiversityResult, "expected parameter 'lDiversityResult' to be non-null");
            $.numericalStatsResult = Objects.requireNonNull($.numericalStatsResult, "expected parameter 'numericalStatsResult' to be non-null");
            $.requestedOptions = Objects.requireNonNull($.requestedOptions, "expected parameter 'requestedOptions' to be non-null");
            $.requestedPrivacyMetric = Objects.requireNonNull($.requestedPrivacyMetric, "expected parameter 'requestedPrivacyMetric' to be non-null");
            $.requestedSourceTable = Objects.requireNonNull($.requestedSourceTable, "expected parameter 'requestedSourceTable' to be non-null");
            return $;
        }
    }

}
