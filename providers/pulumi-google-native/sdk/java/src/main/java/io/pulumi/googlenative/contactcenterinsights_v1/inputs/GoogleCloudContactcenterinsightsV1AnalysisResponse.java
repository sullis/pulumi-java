// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1AnalysisResultResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The analysis resource.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1AnalysisResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1AnalysisResponse Empty = new GoogleCloudContactcenterinsightsV1AnalysisResponse();

    /**
     * The result of the analysis, which is populated when the analysis finishes.
     * 
     */
    @InputImport(name="analysisResult", required=true)
      private final GoogleCloudContactcenterinsightsV1AnalysisResultResponse analysisResult;

    public GoogleCloudContactcenterinsightsV1AnalysisResultResponse getAnalysisResult() {
        return this.analysisResult;
    }

    /**
     * The time at which the analysis was created, which occurs when the long-running operation completes.
     * 
     */
    @InputImport(name="createTime", required=true)
      private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * Immutable. The resource name of the analysis. Format: projects/{project}/locations/{location}/conversations/{conversation}/analyses/{analysis}
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The time at which the analysis was requested.
     * 
     */
    @InputImport(name="requestTime", required=true)
      private final String requestTime;

    public String getRequestTime() {
        return this.requestTime;
    }

    public GoogleCloudContactcenterinsightsV1AnalysisResponse(
        GoogleCloudContactcenterinsightsV1AnalysisResultResponse analysisResult,
        String createTime,
        String name,
        String requestTime) {
        this.analysisResult = Objects.requireNonNull(analysisResult, "expected parameter 'analysisResult' to be non-null");
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.requestTime = Objects.requireNonNull(requestTime, "expected parameter 'requestTime' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1AnalysisResponse() {
        this.analysisResult = null;
        this.createTime = null;
        this.name = null;
        this.requestTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1AnalysisResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1AnalysisResultResponse analysisResult;
        private String createTime;
        private String name;
        private String requestTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1AnalysisResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analysisResult = defaults.analysisResult;
    	      this.createTime = defaults.createTime;
    	      this.name = defaults.name;
    	      this.requestTime = defaults.requestTime;
        }

        public Builder setAnalysisResult(GoogleCloudContactcenterinsightsV1AnalysisResultResponse analysisResult) {
            this.analysisResult = Objects.requireNonNull(analysisResult);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRequestTime(String requestTime) {
            this.requestTime = Objects.requireNonNull(requestTime);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1AnalysisResponse build() {
            return new GoogleCloudContactcenterinsightsV1AnalysisResponse(analysisResult, createTime, name, requestTime);
        }
    }
}