// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SourceResponse {
    /**
     * List of  Resource referred into query
     * 
     */
    private final @Nullable List<String> authorizedResources;
    /**
     * The resource uri over which log search query is to be run.
     * 
     */
    private final String dataSourceId;
    /**
     * Log search query. Required for action type - AlertingAction
     * 
     */
    private final @Nullable String query;
    /**
     * Set value to 'ResultCount' .
     * 
     */
    private final @Nullable String queryType;

    @OutputCustomType.Constructor({"authorizedResources","dataSourceId","query","queryType"})
    private SourceResponse(
        @Nullable List<String> authorizedResources,
        String dataSourceId,
        @Nullable String query,
        @Nullable String queryType) {
        this.authorizedResources = authorizedResources;
        this.dataSourceId = Objects.requireNonNull(dataSourceId);
        this.query = query;
        this.queryType = queryType;
    }

    /**
     * List of  Resource referred into query
     * 
     */
    public List<String> getAuthorizedResources() {
        return this.authorizedResources == null ? List.of() : this.authorizedResources;
    }
    /**
     * The resource uri over which log search query is to be run.
     * 
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }
    /**
     * Log search query. Required for action type - AlertingAction
     * 
     */
    public Optional<String> getQuery() {
        return Optional.ofNullable(this.query);
    }
    /**
     * Set value to 'ResultCount' .
     * 
     */
    public Optional<String> getQueryType() {
        return Optional.ofNullable(this.queryType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> authorizedResources;
        private String dataSourceId;
        private @Nullable String query;
        private @Nullable String queryType;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedResources = defaults.authorizedResources;
    	      this.dataSourceId = defaults.dataSourceId;
    	      this.query = defaults.query;
    	      this.queryType = defaults.queryType;
        }

        public Builder setAuthorizedResources(@Nullable List<String> authorizedResources) {
            this.authorizedResources = authorizedResources;
            return this;
        }

        public Builder setDataSourceId(String dataSourceId) {
            this.dataSourceId = Objects.requireNonNull(dataSourceId);
            return this;
        }

        public Builder setQuery(@Nullable String query) {
            this.query = query;
            return this;
        }

        public Builder setQueryType(@Nullable String queryType) {
            this.queryType = queryType;
            return this;
        }

        public SourceResponse build() {
            return new SourceResponse(authorizedResources, dataSourceId, query, queryType);
        }
    }
}
