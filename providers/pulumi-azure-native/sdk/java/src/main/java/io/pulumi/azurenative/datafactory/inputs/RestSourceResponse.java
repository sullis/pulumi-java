// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Rest service source.
 * 
 */
public final class RestSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final RestSourceResponse Empty = new RestSourceResponse();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @InputImport(name="additionalColumns")
    private final @Nullable Object additionalColumns;

    public Optional<Object> getAdditionalColumns() {
        return this.additionalColumns == null ? Optional.empty() : Optional.ofNullable(this.additionalColumns);
    }

    /**
     * The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="additionalHeaders")
    private final @Nullable Object additionalHeaders;

    public Optional<Object> getAdditionalHeaders() {
        return this.additionalHeaders == null ? Optional.empty() : Optional.ofNullable(this.additionalHeaders);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="disableMetricsCollection")
    private final @Nullable Object disableMetricsCollection;

    public Optional<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Optional.empty() : Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="httpRequestTimeout")
    private final @Nullable Object httpRequestTimeout;

    public Optional<Object> getHttpRequestTimeout() {
        return this.httpRequestTimeout == null ? Optional.empty() : Optional.ofNullable(this.httpRequestTimeout);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
    private final @Nullable Object maxConcurrentConnections;

    public Optional<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * The pagination rules to compose next page requests. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="paginationRules")
    private final @Nullable Object paginationRules;

    public Optional<Object> getPaginationRules() {
        return this.paginationRules == null ? Optional.empty() : Optional.ofNullable(this.paginationRules);
    }

    /**
     * The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="requestBody")
    private final @Nullable Object requestBody;

    public Optional<Object> getRequestBody() {
        return this.requestBody == null ? Optional.empty() : Optional.ofNullable(this.requestBody);
    }

    /**
     * The time to await before sending next page request.
     * 
     */
    @InputImport(name="requestInterval")
    private final @Nullable Object requestInterval;

    public Optional<Object> getRequestInterval() {
        return this.requestInterval == null ? Optional.empty() : Optional.ofNullable(this.requestInterval);
    }

    /**
     * The HTTP method used to call the RESTful API. The default is GET. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="requestMethod")
    private final @Nullable Object requestMethod;

    public Optional<Object> getRequestMethod() {
        return this.requestMethod == null ? Optional.empty() : Optional.ofNullable(this.requestMethod);
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="sourceRetryCount")
    private final @Nullable Object sourceRetryCount;

    public Optional<Object> getSourceRetryCount() {
        return this.sourceRetryCount == null ? Optional.empty() : Optional.ofNullable(this.sourceRetryCount);
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="sourceRetryWait")
    private final @Nullable Object sourceRetryWait;

    public Optional<Object> getSourceRetryWait() {
        return this.sourceRetryWait == null ? Optional.empty() : Optional.ofNullable(this.sourceRetryWait);
    }

    /**
     * Copy source type.
     * Expected value is 'RestSource'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public RestSourceResponse(
        @Nullable Object additionalColumns,
        @Nullable Object additionalHeaders,
        @Nullable Object disableMetricsCollection,
        @Nullable Object httpRequestTimeout,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object paginationRules,
        @Nullable Object requestBody,
        @Nullable Object requestInterval,
        @Nullable Object requestMethod,
        @Nullable Object sourceRetryCount,
        @Nullable Object sourceRetryWait,
        String type) {
        this.additionalColumns = additionalColumns;
        this.additionalHeaders = additionalHeaders;
        this.disableMetricsCollection = disableMetricsCollection;
        this.httpRequestTimeout = httpRequestTimeout;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.paginationRules = paginationRules;
        this.requestBody = requestBody;
        this.requestInterval = requestInterval;
        this.requestMethod = requestMethod;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RestSourceResponse() {
        this.additionalColumns = null;
        this.additionalHeaders = null;
        this.disableMetricsCollection = null;
        this.httpRequestTimeout = null;
        this.maxConcurrentConnections = null;
        this.paginationRules = null;
        this.requestBody = null;
        this.requestInterval = null;
        this.requestMethod = null;
        this.sourceRetryCount = null;
        this.sourceRetryWait = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalColumns;
        private @Nullable Object additionalHeaders;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object httpRequestTimeout;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object paginationRules;
        private @Nullable Object requestBody;
        private @Nullable Object requestInterval;
        private @Nullable Object requestMethod;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RestSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.additionalHeaders = defaults.additionalHeaders;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.httpRequestTimeout = defaults.httpRequestTimeout;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.paginationRules = defaults.paginationRules;
    	      this.requestBody = defaults.requestBody;
    	      this.requestInterval = defaults.requestInterval;
    	      this.requestMethod = defaults.requestMethod;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder setAdditionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }

        public Builder setAdditionalHeaders(@Nullable Object additionalHeaders) {
            this.additionalHeaders = additionalHeaders;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setHttpRequestTimeout(@Nullable Object httpRequestTimeout) {
            this.httpRequestTimeout = httpRequestTimeout;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setPaginationRules(@Nullable Object paginationRules) {
            this.paginationRules = paginationRules;
            return this;
        }

        public Builder setRequestBody(@Nullable Object requestBody) {
            this.requestBody = requestBody;
            return this;
        }

        public Builder setRequestInterval(@Nullable Object requestInterval) {
            this.requestInterval = requestInterval;
            return this;
        }

        public Builder setRequestMethod(@Nullable Object requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }

        public Builder setSourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder setSourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public RestSourceResponse build() {
            return new RestSourceResponse(additionalColumns, additionalHeaders, disableMetricsCollection, httpRequestTimeout, maxConcurrentConnections, paginationRules, requestBody, requestInterval, requestMethod, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
