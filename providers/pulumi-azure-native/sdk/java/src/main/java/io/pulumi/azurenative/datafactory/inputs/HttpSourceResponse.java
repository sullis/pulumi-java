// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity source for an HTTP file.
 * 
 */
public final class HttpSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpSourceResponse Empty = new HttpSourceResponse();

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
     * Specifies the timeout for a HTTP client to get HTTP response from HTTP server. The default value is equivalent to System.Net.HttpWebRequest.Timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
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
     * Expected value is 'HttpSource'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public HttpSourceResponse(
        @Nullable Object disableMetricsCollection,
        @Nullable Object httpRequestTimeout,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object sourceRetryCount,
        @Nullable Object sourceRetryWait,
        String type) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.httpRequestTimeout = httpRequestTimeout;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private HttpSourceResponse() {
        this.disableMetricsCollection = null;
        this.httpRequestTimeout = null;
        this.maxConcurrentConnections = null;
        this.sourceRetryCount = null;
        this.sourceRetryWait = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object httpRequestTimeout;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.httpRequestTimeout = defaults.httpRequestTimeout;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
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
        public HttpSourceResponse build() {
            return new HttpSourceResponse(disableMetricsCollection, httpRequestTimeout, maxConcurrentConnections, sourceRetryCount, sourceRetryWait, type);
        }
    }
}