// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.IterationResultResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MlStatisticsResponse {
    /**
     * Results for all completed iterations.
     * 
     */
    private final List<IterationResultResponse> iterationResults;
    /**
     * Maximum number of iterations specified as max_iterations in the 'CREATE MODEL' query. The actual number of iterations may be less than this number due to early stop.
     * 
     */
    private final String maxIterations;

    @OutputCustomType.Constructor({"iterationResults","maxIterations"})
    private MlStatisticsResponse(
        List<IterationResultResponse> iterationResults,
        String maxIterations) {
        this.iterationResults = Objects.requireNonNull(iterationResults);
        this.maxIterations = Objects.requireNonNull(maxIterations);
    }

    /**
     * Results for all completed iterations.
     * 
    */
    public List<IterationResultResponse> getIterationResults() {
        return this.iterationResults;
    }
    /**
     * Maximum number of iterations specified as max_iterations in the 'CREATE MODEL' query. The actual number of iterations may be less than this number due to early stop.
     * 
    */
    public String getMaxIterations() {
        return this.maxIterations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MlStatisticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<IterationResultResponse> iterationResults;
        private String maxIterations;

        public Builder() {
    	      // Empty
        }

        public Builder(MlStatisticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iterationResults = defaults.iterationResults;
    	      this.maxIterations = defaults.maxIterations;
        }

        public Builder setIterationResults(List<IterationResultResponse> iterationResults) {
            this.iterationResults = Objects.requireNonNull(iterationResults);
            return this;
        }

        public Builder setMaxIterations(String maxIterations) {
            this.maxIterations = Objects.requireNonNull(maxIterations);
            return this;
        }
        public MlStatisticsResponse build() {
            return new MlStatisticsResponse(iterationResults, maxIterations);
        }
    }
}