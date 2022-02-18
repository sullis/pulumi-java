// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.ExecutionStatisticsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class QueryExecutionResultResponse {
    /**
     * Query text retrieved from the source server
     * 
     */
    private final String queryText;
    /**
     * Query analysis result from the source
     * 
     */
    private final ExecutionStatisticsResponse sourceResult;
    /**
     * Total no. of statements in the batch
     * 
     */
    private final Double statementsInBatch;
    /**
     * Query analysis result from the target
     * 
     */
    private final ExecutionStatisticsResponse targetResult;

    @OutputCustomType.Constructor({"queryText","sourceResult","statementsInBatch","targetResult"})
    private QueryExecutionResultResponse(
        String queryText,
        ExecutionStatisticsResponse sourceResult,
        Double statementsInBatch,
        ExecutionStatisticsResponse targetResult) {
        this.queryText = Objects.requireNonNull(queryText);
        this.sourceResult = Objects.requireNonNull(sourceResult);
        this.statementsInBatch = Objects.requireNonNull(statementsInBatch);
        this.targetResult = Objects.requireNonNull(targetResult);
    }

    /**
     * Query text retrieved from the source server
     * 
     */
    public String getQueryText() {
        return this.queryText;
    }
    /**
     * Query analysis result from the source
     * 
     */
    public ExecutionStatisticsResponse getSourceResult() {
        return this.sourceResult;
    }
    /**
     * Total no. of statements in the batch
     * 
     */
    public Double getStatementsInBatch() {
        return this.statementsInBatch;
    }
    /**
     * Query analysis result from the target
     * 
     */
    public ExecutionStatisticsResponse getTargetResult() {
        return this.targetResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryExecutionResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String queryText;
        private ExecutionStatisticsResponse sourceResult;
        private Double statementsInBatch;
        private ExecutionStatisticsResponse targetResult;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryExecutionResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryText = defaults.queryText;
    	      this.sourceResult = defaults.sourceResult;
    	      this.statementsInBatch = defaults.statementsInBatch;
    	      this.targetResult = defaults.targetResult;
        }

        public Builder setQueryText(String queryText) {
            this.queryText = Objects.requireNonNull(queryText);
            return this;
        }

        public Builder setSourceResult(ExecutionStatisticsResponse sourceResult) {
            this.sourceResult = Objects.requireNonNull(sourceResult);
            return this;
        }

        public Builder setStatementsInBatch(Double statementsInBatch) {
            this.statementsInBatch = Objects.requireNonNull(statementsInBatch);
            return this;
        }

        public Builder setTargetResult(ExecutionStatisticsResponse targetResult) {
            this.targetResult = Objects.requireNonNull(targetResult);
            return this;
        }

        public QueryExecutionResultResponse build() {
            return new QueryExecutionResultResponse(queryText, sourceResult, statementsInBatch, targetResult);
        }
    }
}
