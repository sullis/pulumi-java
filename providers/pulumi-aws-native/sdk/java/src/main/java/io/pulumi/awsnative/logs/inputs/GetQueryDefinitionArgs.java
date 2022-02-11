// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.logs.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetQueryDefinitionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetQueryDefinitionArgs Empty = new GetQueryDefinitionArgs();

    @InputImport(name="queryDefinitionId", required=true)
    private final String queryDefinitionId;

    public String getQueryDefinitionId() {
        return this.queryDefinitionId;
    }

    public GetQueryDefinitionArgs(String queryDefinitionId) {
        this.queryDefinitionId = Objects.requireNonNull(queryDefinitionId, "expected parameter 'queryDefinitionId' to be non-null");
    }

    private GetQueryDefinitionArgs() {
        this.queryDefinitionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueryDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String queryDefinitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQueryDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryDefinitionId = defaults.queryDefinitionId;
        }

        public Builder setQueryDefinitionId(String queryDefinitionId) {
            this.queryDefinitionId = Objects.requireNonNull(queryDefinitionId);
            return this;
        }

        public GetQueryDefinitionArgs build() {
            return new GetQueryDefinitionArgs(queryDefinitionId);
        }
    }
}
