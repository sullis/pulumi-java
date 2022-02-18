// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configures settings for all methods in a stage.
 * 
 */
public final class StageMethodSetting extends io.pulumi.resources.InvokeArgs {

    public static final StageMethodSetting Empty = new StageMethodSetting();

    /**
     * Indicates whether the cached responses are encrypted.
     * 
     */
    @InputImport(name="cacheDataEncrypted")
    private final @Nullable Boolean cacheDataEncrypted;

    public Optional<Boolean> getCacheDataEncrypted() {
        return this.cacheDataEncrypted == null ? Optional.empty() : Optional.ofNullable(this.cacheDataEncrypted);
    }

    /**
     * The time-to-live (TTL) period, in seconds, that specifies how long API Gateway caches responses.
     * 
     */
    @InputImport(name="cacheTtlInSeconds")
    private final @Nullable Integer cacheTtlInSeconds;

    public Optional<Integer> getCacheTtlInSeconds() {
        return this.cacheTtlInSeconds == null ? Optional.empty() : Optional.ofNullable(this.cacheTtlInSeconds);
    }

    /**
     * Indicates whether responses are cached and returned for requests. You must enable a cache cluster on the stage to cache responses.
     * 
     */
    @InputImport(name="cachingEnabled")
    private final @Nullable Boolean cachingEnabled;

    public Optional<Boolean> getCachingEnabled() {
        return this.cachingEnabled == null ? Optional.empty() : Optional.ofNullable(this.cachingEnabled);
    }

    /**
     * Indicates whether data trace logging is enabled for methods in the stage. API Gateway pushes these logs to Amazon CloudWatch Logs.
     * 
     */
    @InputImport(name="dataTraceEnabled")
    private final @Nullable Boolean dataTraceEnabled;

    public Optional<Boolean> getDataTraceEnabled() {
        return this.dataTraceEnabled == null ? Optional.empty() : Optional.ofNullable(this.dataTraceEnabled);
    }

    /**
     * The HTTP method. You can use an asterisk (*) as a wildcard to apply method settings to multiple methods.
     * 
     */
    @InputImport(name="httpMethod")
    private final @Nullable String httpMethod;

    public Optional<String> getHttpMethod() {
        return this.httpMethod == null ? Optional.empty() : Optional.ofNullable(this.httpMethod);
    }

    /**
     * The logging level for this method. For valid values, see the loggingLevel property of the Stage (https://docs.aws.amazon.com/apigateway/api-reference/resource/stage/#loggingLevel) resource in the Amazon API Gateway API Reference.
     * 
     */
    @InputImport(name="loggingLevel")
    private final @Nullable String loggingLevel;

    public Optional<String> getLoggingLevel() {
        return this.loggingLevel == null ? Optional.empty() : Optional.ofNullable(this.loggingLevel);
    }

    /**
     * Indicates whether Amazon CloudWatch metrics are enabled for methods in the stage.
     * 
     */
    @InputImport(name="metricsEnabled")
    private final @Nullable Boolean metricsEnabled;

    public Optional<Boolean> getMetricsEnabled() {
        return this.metricsEnabled == null ? Optional.empty() : Optional.ofNullable(this.metricsEnabled);
    }

    /**
     * The resource path for this method. Forward slashes (/) are encoded as ~1 and the initial slash must include a forward slash. For example, the path value /resource/subresource must be encoded as /~1resource~1subresource. To specify the root path, use only a slash (/). You can use an asterisk (*) as a wildcard to apply method settings to multiple methods.
     * 
     */
    @InputImport(name="resourcePath")
    private final @Nullable String resourcePath;

    public Optional<String> getResourcePath() {
        return this.resourcePath == null ? Optional.empty() : Optional.ofNullable(this.resourcePath);
    }

    /**
     * The number of burst requests per second that API Gateway permits across all APIs, stages, and methods in your AWS account.
     * 
     */
    @InputImport(name="throttlingBurstLimit")
    private final @Nullable Integer throttlingBurstLimit;

    public Optional<Integer> getThrottlingBurstLimit() {
        return this.throttlingBurstLimit == null ? Optional.empty() : Optional.ofNullable(this.throttlingBurstLimit);
    }

    /**
     * The number of steady-state requests per second that API Gateway permits across all APIs, stages, and methods in your AWS account.
     * 
     */
    @InputImport(name="throttlingRateLimit")
    private final @Nullable Double throttlingRateLimit;

    public Optional<Double> getThrottlingRateLimit() {
        return this.throttlingRateLimit == null ? Optional.empty() : Optional.ofNullable(this.throttlingRateLimit);
    }

    public StageMethodSetting(
        @Nullable Boolean cacheDataEncrypted,
        @Nullable Integer cacheTtlInSeconds,
        @Nullable Boolean cachingEnabled,
        @Nullable Boolean dataTraceEnabled,
        @Nullable String httpMethod,
        @Nullable String loggingLevel,
        @Nullable Boolean metricsEnabled,
        @Nullable String resourcePath,
        @Nullable Integer throttlingBurstLimit,
        @Nullable Double throttlingRateLimit) {
        this.cacheDataEncrypted = cacheDataEncrypted;
        this.cacheTtlInSeconds = cacheTtlInSeconds;
        this.cachingEnabled = cachingEnabled;
        this.dataTraceEnabled = dataTraceEnabled;
        this.httpMethod = httpMethod;
        this.loggingLevel = loggingLevel;
        this.metricsEnabled = metricsEnabled;
        this.resourcePath = resourcePath;
        this.throttlingBurstLimit = throttlingBurstLimit;
        this.throttlingRateLimit = throttlingRateLimit;
    }

    private StageMethodSetting() {
        this.cacheDataEncrypted = null;
        this.cacheTtlInSeconds = null;
        this.cachingEnabled = null;
        this.dataTraceEnabled = null;
        this.httpMethod = null;
        this.loggingLevel = null;
        this.metricsEnabled = null;
        this.resourcePath = null;
        this.throttlingBurstLimit = null;
        this.throttlingRateLimit = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageMethodSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean cacheDataEncrypted;
        private @Nullable Integer cacheTtlInSeconds;
        private @Nullable Boolean cachingEnabled;
        private @Nullable Boolean dataTraceEnabled;
        private @Nullable String httpMethod;
        private @Nullable String loggingLevel;
        private @Nullable Boolean metricsEnabled;
        private @Nullable String resourcePath;
        private @Nullable Integer throttlingBurstLimit;
        private @Nullable Double throttlingRateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(StageMethodSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheDataEncrypted = defaults.cacheDataEncrypted;
    	      this.cacheTtlInSeconds = defaults.cacheTtlInSeconds;
    	      this.cachingEnabled = defaults.cachingEnabled;
    	      this.dataTraceEnabled = defaults.dataTraceEnabled;
    	      this.httpMethod = defaults.httpMethod;
    	      this.loggingLevel = defaults.loggingLevel;
    	      this.metricsEnabled = defaults.metricsEnabled;
    	      this.resourcePath = defaults.resourcePath;
    	      this.throttlingBurstLimit = defaults.throttlingBurstLimit;
    	      this.throttlingRateLimit = defaults.throttlingRateLimit;
        }

        public Builder setCacheDataEncrypted(@Nullable Boolean cacheDataEncrypted) {
            this.cacheDataEncrypted = cacheDataEncrypted;
            return this;
        }

        public Builder setCacheTtlInSeconds(@Nullable Integer cacheTtlInSeconds) {
            this.cacheTtlInSeconds = cacheTtlInSeconds;
            return this;
        }

        public Builder setCachingEnabled(@Nullable Boolean cachingEnabled) {
            this.cachingEnabled = cachingEnabled;
            return this;
        }

        public Builder setDataTraceEnabled(@Nullable Boolean dataTraceEnabled) {
            this.dataTraceEnabled = dataTraceEnabled;
            return this;
        }

        public Builder setHttpMethod(@Nullable String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        public Builder setLoggingLevel(@Nullable String loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }

        public Builder setMetricsEnabled(@Nullable Boolean metricsEnabled) {
            this.metricsEnabled = metricsEnabled;
            return this;
        }

        public Builder setResourcePath(@Nullable String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setThrottlingBurstLimit(@Nullable Integer throttlingBurstLimit) {
            this.throttlingBurstLimit = throttlingBurstLimit;
            return this;
        }

        public Builder setThrottlingRateLimit(@Nullable Double throttlingRateLimit) {
            this.throttlingRateLimit = throttlingRateLimit;
            return this;
        }

        public StageMethodSetting build() {
            return new StageMethodSetting(cacheDataEncrypted, cacheTtlInSeconds, cachingEnabled, dataTraceEnabled, httpMethod, loggingLevel, metricsEnabled, resourcePath, throttlingBurstLimit, throttlingRateLimit);
        }
    }
}
