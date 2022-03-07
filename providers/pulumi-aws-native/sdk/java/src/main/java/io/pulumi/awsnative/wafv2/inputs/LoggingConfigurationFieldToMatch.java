// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.LoggingConfigurationFieldToMatchJsonBodyProperties;
import io.pulumi.awsnative.wafv2.inputs.LoggingConfigurationFieldToMatchSingleHeaderProperties;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A key-value pair to associate with a resource.
 * 
 */
public final class LoggingConfigurationFieldToMatch extends io.pulumi.resources.InvokeArgs {

    public static final LoggingConfigurationFieldToMatch Empty = new LoggingConfigurationFieldToMatch();

    /**
     * Inspect the request body as JSON. The request body immediately follows the request headers. This is the part of a request that contains any additional data that you want to send to your web server as the HTTP request body, such as data from a form.
     * 
     */
    @InputImport(name="jsonBody")
      private final @Nullable LoggingConfigurationFieldToMatchJsonBodyProperties jsonBody;

    public Optional<LoggingConfigurationFieldToMatchJsonBodyProperties> getJsonBody() {
        return this.jsonBody == null ? Optional.empty() : Optional.ofNullable(this.jsonBody);
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
      private final @Nullable Object method;

    public Optional<Object> getMethod() {
        return this.method == null ? Optional.empty() : Optional.ofNullable(this.method);
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a ? character, if any.
     * 
     */
    @InputImport(name="queryString")
      private final @Nullable Object queryString;

    public Optional<Object> getQueryString() {
        return this.queryString == null ? Optional.empty() : Optional.ofNullable(this.queryString);
    }

    /**
     * Inspect a single header. Provide the name of the header to inspect, for example, User-Agent or Referer. This setting isn't case sensitive.
     * 
     */
    @InputImport(name="singleHeader")
      private final @Nullable LoggingConfigurationFieldToMatchSingleHeaderProperties singleHeader;

    public Optional<LoggingConfigurationFieldToMatchSingleHeaderProperties> getSingleHeader() {
        return this.singleHeader == null ? Optional.empty() : Optional.ofNullable(this.singleHeader);
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, /images/daily-ad.jpg.
     * 
     */
    @InputImport(name="uriPath")
      private final @Nullable Object uriPath;

    public Optional<Object> getUriPath() {
        return this.uriPath == null ? Optional.empty() : Optional.ofNullable(this.uriPath);
    }

    public LoggingConfigurationFieldToMatch(
        @Nullable LoggingConfigurationFieldToMatchJsonBodyProperties jsonBody,
        @Nullable Object method,
        @Nullable Object queryString,
        @Nullable LoggingConfigurationFieldToMatchSingleHeaderProperties singleHeader,
        @Nullable Object uriPath) {
        this.jsonBody = jsonBody;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.uriPath = uriPath;
    }

    private LoggingConfigurationFieldToMatch() {
        this.jsonBody = null;
        this.method = null;
        this.queryString = null;
        this.singleHeader = null;
        this.uriPath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LoggingConfigurationFieldToMatchJsonBodyProperties jsonBody;
        private @Nullable Object method;
        private @Nullable Object queryString;
        private @Nullable LoggingConfigurationFieldToMatchSingleHeaderProperties singleHeader;
        private @Nullable Object uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jsonBody = defaults.jsonBody;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setJsonBody(@Nullable LoggingConfigurationFieldToMatchJsonBodyProperties jsonBody) {
            this.jsonBody = jsonBody;
            return this;
        }

        public Builder setMethod(@Nullable Object method) {
            this.method = method;
            return this;
        }

        public Builder setQueryString(@Nullable Object queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setSingleHeader(@Nullable LoggingConfigurationFieldToMatchSingleHeaderProperties singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setUriPath(@Nullable Object uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public LoggingConfigurationFieldToMatch build() {
            return new LoggingConfigurationFieldToMatch(jsonBody, method, queryString, singleHeader, uriPath);
        }
    }
}