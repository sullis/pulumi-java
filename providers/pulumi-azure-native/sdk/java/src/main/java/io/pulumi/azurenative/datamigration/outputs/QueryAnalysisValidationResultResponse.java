// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.QueryExecutionResultResponse;
import io.pulumi.azurenative.datamigration.outputs.ValidationErrorResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class QueryAnalysisValidationResultResponse {
    /**
     * List of queries executed and it's execution results in source and target
     * 
     */
    private final QueryExecutionResultResponse queryResults;
    /**
     * Errors that are part of the execution
     * 
     */
    private final ValidationErrorResponse validationErrors;

    @OutputCustomType.Constructor({"queryResults","validationErrors"})
    private QueryAnalysisValidationResultResponse(
        QueryExecutionResultResponse queryResults,
        ValidationErrorResponse validationErrors) {
        this.queryResults = Objects.requireNonNull(queryResults);
        this.validationErrors = Objects.requireNonNull(validationErrors);
    }

    /**
     * List of queries executed and it's execution results in source and target
     * 
     */
    public QueryExecutionResultResponse getQueryResults() {
        return this.queryResults;
    }
    /**
     * Errors that are part of the execution
     * 
     */
    public ValidationErrorResponse getValidationErrors() {
        return this.validationErrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryAnalysisValidationResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueryExecutionResultResponse queryResults;
        private ValidationErrorResponse validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryAnalysisValidationResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryResults = defaults.queryResults;
    	      this.validationErrors = defaults.validationErrors;
        }

        public Builder setQueryResults(QueryExecutionResultResponse queryResults) {
            this.queryResults = Objects.requireNonNull(queryResults);
            return this;
        }

        public Builder setValidationErrors(ValidationErrorResponse validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }

        public QueryAnalysisValidationResultResponse build() {
            return new QueryAnalysisValidationResultResponse(queryResults, validationErrors);
        }
    }
}
