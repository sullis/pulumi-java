// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeploymentMethodSetting {
    private final @Nullable Boolean cacheDataEncrypted;
    private final @Nullable Integer cacheTtlInSeconds;
    private final @Nullable Boolean cachingEnabled;
    private final @Nullable Boolean dataTraceEnabled;
    private final @Nullable String httpMethod;
    private final @Nullable String loggingLevel;
    private final @Nullable Boolean metricsEnabled;
    private final @Nullable String resourcePath;
    private final @Nullable Integer throttlingBurstLimit;
    private final @Nullable Double throttlingRateLimit;

    @OutputCustomType.Constructor({"cacheDataEncrypted","cacheTtlInSeconds","cachingEnabled","dataTraceEnabled","httpMethod","loggingLevel","metricsEnabled","resourcePath","throttlingBurstLimit","throttlingRateLimit"})
    private DeploymentMethodSetting(
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

    public Optional<Boolean> getCacheDataEncrypted() {
        return Optional.ofNullable(this.cacheDataEncrypted);
    }
    public Optional<Integer> getCacheTtlInSeconds() {
        return Optional.ofNullable(this.cacheTtlInSeconds);
    }
    public Optional<Boolean> getCachingEnabled() {
        return Optional.ofNullable(this.cachingEnabled);
    }
    public Optional<Boolean> getDataTraceEnabled() {
        return Optional.ofNullable(this.dataTraceEnabled);
    }
    public Optional<String> getHttpMethod() {
        return Optional.ofNullable(this.httpMethod);
    }
    public Optional<String> getLoggingLevel() {
        return Optional.ofNullable(this.loggingLevel);
    }
    public Optional<Boolean> getMetricsEnabled() {
        return Optional.ofNullable(this.metricsEnabled);
    }
    public Optional<String> getResourcePath() {
        return Optional.ofNullable(this.resourcePath);
    }
    public Optional<Integer> getThrottlingBurstLimit() {
        return Optional.ofNullable(this.throttlingBurstLimit);
    }
    public Optional<Double> getThrottlingRateLimit() {
        return Optional.ofNullable(this.throttlingRateLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentMethodSetting defaults) {
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

        public Builder(DeploymentMethodSetting defaults) {
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

        public DeploymentMethodSetting build() {
            return new DeploymentMethodSetting(cacheDataEncrypted, cacheTtlInSeconds, cachingEnabled, dataTraceEnabled, httpMethod, loggingLevel, metricsEnabled, resourcePath, throttlingBurstLimit, throttlingRateLimit);
        }
    }
}
