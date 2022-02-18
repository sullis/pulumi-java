// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity Eloqua server source.
 * 
 */
public final class EloquaSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EloquaSourceArgs Empty = new EloquaSourceArgs();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @InputImport(name="additionalColumns")
    private final @Nullable Input<Object> additionalColumns;

    public Input<Object> getAdditionalColumns() {
        return this.additionalColumns == null ? Input.empty() : this.additionalColumns;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="disableMetricsCollection")
    private final @Nullable Input<Object> disableMetricsCollection;

    public Input<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Input.empty() : this.disableMetricsCollection;
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
    private final @Nullable Input<Object> maxConcurrentConnections;

    public Input<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Input.empty() : this.maxConcurrentConnections;
    }

    /**
     * A query to retrieve data from source. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="query")
    private final @Nullable Input<Object> query;

    public Input<Object> getQuery() {
        return this.query == null ? Input.empty() : this.query;
    }

    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="queryTimeout")
    private final @Nullable Input<Object> queryTimeout;

    public Input<Object> getQueryTimeout() {
        return this.queryTimeout == null ? Input.empty() : this.queryTimeout;
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="sourceRetryCount")
    private final @Nullable Input<Object> sourceRetryCount;

    public Input<Object> getSourceRetryCount() {
        return this.sourceRetryCount == null ? Input.empty() : this.sourceRetryCount;
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="sourceRetryWait")
    private final @Nullable Input<Object> sourceRetryWait;

    public Input<Object> getSourceRetryWait() {
        return this.sourceRetryWait == null ? Input.empty() : this.sourceRetryWait;
    }

    /**
     * Copy source type.
     * Expected value is 'EloquaSource'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public EloquaSourceArgs(
        @Nullable Input<Object> additionalColumns,
        @Nullable Input<Object> disableMetricsCollection,
        @Nullable Input<Object> maxConcurrentConnections,
        @Nullable Input<Object> query,
        @Nullable Input<Object> queryTimeout,
        @Nullable Input<Object> sourceRetryCount,
        @Nullable Input<Object> sourceRetryWait,
        Input<String> type) {
        this.additionalColumns = additionalColumns;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.query = query;
        this.queryTimeout = queryTimeout;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private EloquaSourceArgs() {
        this.additionalColumns = Input.empty();
        this.disableMetricsCollection = Input.empty();
        this.maxConcurrentConnections = Input.empty();
        this.query = Input.empty();
        this.queryTimeout = Input.empty();
        this.sourceRetryCount = Input.empty();
        this.sourceRetryWait = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EloquaSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> additionalColumns;
        private @Nullable Input<Object> disableMetricsCollection;
        private @Nullable Input<Object> maxConcurrentConnections;
        private @Nullable Input<Object> query;
        private @Nullable Input<Object> queryTimeout;
        private @Nullable Input<Object> sourceRetryCount;
        private @Nullable Input<Object> sourceRetryWait;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(EloquaSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.query = defaults.query;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder setAdditionalColumns(@Nullable Input<Object> additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }

        public Builder setAdditionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = Input.ofNullable(additionalColumns);
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Input<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Input.ofNullable(disableMetricsCollection);
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Input<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Input.ofNullable(maxConcurrentConnections);
            return this;
        }

        public Builder setQuery(@Nullable Input<Object> query) {
            this.query = query;
            return this;
        }

        public Builder setQuery(@Nullable Object query) {
            this.query = Input.ofNullable(query);
            return this;
        }

        public Builder setQueryTimeout(@Nullable Input<Object> queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }

        public Builder setQueryTimeout(@Nullable Object queryTimeout) {
            this.queryTimeout = Input.ofNullable(queryTimeout);
            return this;
        }

        public Builder setSourceRetryCount(@Nullable Input<Object> sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder setSourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = Input.ofNullable(sourceRetryCount);
            return this;
        }

        public Builder setSourceRetryWait(@Nullable Input<Object> sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder setSourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = Input.ofNullable(sourceRetryWait);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public EloquaSourceArgs build() {
            return new EloquaSourceArgs(additionalColumns, disableMetricsCollection, maxConcurrentConnections, query, queryTimeout, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
