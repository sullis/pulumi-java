// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudasset_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudasset_v1.inputs.IamPolicyAnalysisQueryResponse;
import java.util.Objects;


/**
 * The query content.
 * 
 */
public final class QueryContentResponse extends io.pulumi.resources.InvokeArgs {

    public static final QueryContentResponse Empty = new QueryContentResponse();

    /**
     * An IAM Policy Analysis query, which could be used in the AssetService.AnalyzeIamPolicy rpc or the AssetService.AnalyzeIamPolicyLongrunning rpc.
     * 
     */
    @InputImport(name="iamPolicyAnalysisQuery", required=true)
      private final IamPolicyAnalysisQueryResponse iamPolicyAnalysisQuery;

    public IamPolicyAnalysisQueryResponse getIamPolicyAnalysisQuery() {
        return this.iamPolicyAnalysisQuery;
    }

    public QueryContentResponse(IamPolicyAnalysisQueryResponse iamPolicyAnalysisQuery) {
        this.iamPolicyAnalysisQuery = Objects.requireNonNull(iamPolicyAnalysisQuery, "expected parameter 'iamPolicyAnalysisQuery' to be non-null");
    }

    private QueryContentResponse() {
        this.iamPolicyAnalysisQuery = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryContentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IamPolicyAnalysisQueryResponse iamPolicyAnalysisQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryContentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iamPolicyAnalysisQuery = defaults.iamPolicyAnalysisQuery;
        }

        public Builder setIamPolicyAnalysisQuery(IamPolicyAnalysisQueryResponse iamPolicyAnalysisQuery) {
            this.iamPolicyAnalysisQuery = Objects.requireNonNull(iamPolicyAnalysisQuery);
            return this;
        }
        public QueryContentResponse build() {
            return new QueryContentResponse(iamPolicyAnalysisQuery);
        }
    }
}