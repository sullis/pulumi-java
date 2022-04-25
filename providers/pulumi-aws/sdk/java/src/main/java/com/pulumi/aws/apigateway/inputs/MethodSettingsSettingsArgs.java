// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MethodSettingsSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final MethodSettingsSettingsArgs Empty = new MethodSettingsSettingsArgs();

    /**
     * Specifies whether the cached responses are encrypted.
     * 
     */
    @Import(name="cacheDataEncrypted")
    private @Nullable Output<Boolean> cacheDataEncrypted;

    /**
     * @return Specifies whether the cached responses are encrypted.
     * 
     */
    public Optional<Output<Boolean>> cacheDataEncrypted() {
        return Optional.ofNullable(this.cacheDataEncrypted);
    }

    /**
     * Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response will be cached.
     * 
     */
    @Import(name="cacheTtlInSeconds")
    private @Nullable Output<Integer> cacheTtlInSeconds;

    /**
     * @return Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response will be cached.
     * 
     */
    public Optional<Output<Integer>> cacheTtlInSeconds() {
        return Optional.ofNullable(this.cacheTtlInSeconds);
    }

    /**
     * Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled on the stage for responses to be cached.
     * 
     */
    @Import(name="cachingEnabled")
    private @Nullable Output<Boolean> cachingEnabled;

    /**
     * @return Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled on the stage for responses to be cached.
     * 
     */
    public Optional<Output<Boolean>> cachingEnabled() {
        return Optional.ofNullable(this.cachingEnabled);
    }

    /**
     * Specifies whether data trace logging is enabled for this method, which effects the log entries pushed to Amazon CloudWatch Logs.
     * 
     */
    @Import(name="dataTraceEnabled")
    private @Nullable Output<Boolean> dataTraceEnabled;

    /**
     * @return Specifies whether data trace logging is enabled for this method, which effects the log entries pushed to Amazon CloudWatch Logs.
     * 
     */
    public Optional<Output<Boolean>> dataTraceEnabled() {
        return Optional.ofNullable(this.dataTraceEnabled);
    }

    /**
     * Specifies the logging level for this method, which effects the log entries pushed to Amazon CloudWatch Logs. The available levels are `OFF`, `ERROR`, and `INFO`.
     * 
     */
    @Import(name="loggingLevel")
    private @Nullable Output<String> loggingLevel;

    /**
     * @return Specifies the logging level for this method, which effects the log entries pushed to Amazon CloudWatch Logs. The available levels are `OFF`, `ERROR`, and `INFO`.
     * 
     */
    public Optional<Output<String>> loggingLevel() {
        return Optional.ofNullable(this.loggingLevel);
    }

    /**
     * Specifies whether Amazon CloudWatch metrics are enabled for this method.
     * 
     */
    @Import(name="metricsEnabled")
    private @Nullable Output<Boolean> metricsEnabled;

    /**
     * @return Specifies whether Amazon CloudWatch metrics are enabled for this method.
     * 
     */
    public Optional<Output<Boolean>> metricsEnabled() {
        return Optional.ofNullable(this.metricsEnabled);
    }

    /**
     * Specifies whether authorization is required for a cache invalidation request.
     * 
     */
    @Import(name="requireAuthorizationForCacheControl")
    private @Nullable Output<Boolean> requireAuthorizationForCacheControl;

    /**
     * @return Specifies whether authorization is required for a cache invalidation request.
     * 
     */
    public Optional<Output<Boolean>> requireAuthorizationForCacheControl() {
        return Optional.ofNullable(this.requireAuthorizationForCacheControl);
    }

    /**
     * Specifies the throttling burst limit. Default: `-1` (throttling disabled).
     * 
     */
    @Import(name="throttlingBurstLimit")
    private @Nullable Output<Integer> throttlingBurstLimit;

    /**
     * @return Specifies the throttling burst limit. Default: `-1` (throttling disabled).
     * 
     */
    public Optional<Output<Integer>> throttlingBurstLimit() {
        return Optional.ofNullable(this.throttlingBurstLimit);
    }

    /**
     * Specifies the throttling rate limit. Default: `-1` (throttling disabled).
     * 
     */
    @Import(name="throttlingRateLimit")
    private @Nullable Output<Double> throttlingRateLimit;

    /**
     * @return Specifies the throttling rate limit. Default: `-1` (throttling disabled).
     * 
     */
    public Optional<Output<Double>> throttlingRateLimit() {
        return Optional.ofNullable(this.throttlingRateLimit);
    }

    /**
     * Specifies how to handle unauthorized requests for cache invalidation. The available values are `FAIL_WITH_403`, `SUCCEED_WITH_RESPONSE_HEADER`, `SUCCEED_WITHOUT_RESPONSE_HEADER`.
     * 
     */
    @Import(name="unauthorizedCacheControlHeaderStrategy")
    private @Nullable Output<String> unauthorizedCacheControlHeaderStrategy;

    /**
     * @return Specifies how to handle unauthorized requests for cache invalidation. The available values are `FAIL_WITH_403`, `SUCCEED_WITH_RESPONSE_HEADER`, `SUCCEED_WITHOUT_RESPONSE_HEADER`.
     * 
     */
    public Optional<Output<String>> unauthorizedCacheControlHeaderStrategy() {
        return Optional.ofNullable(this.unauthorizedCacheControlHeaderStrategy);
    }

    private MethodSettingsSettingsArgs() {}

    private MethodSettingsSettingsArgs(MethodSettingsSettingsArgs $) {
        this.cacheDataEncrypted = $.cacheDataEncrypted;
        this.cacheTtlInSeconds = $.cacheTtlInSeconds;
        this.cachingEnabled = $.cachingEnabled;
        this.dataTraceEnabled = $.dataTraceEnabled;
        this.loggingLevel = $.loggingLevel;
        this.metricsEnabled = $.metricsEnabled;
        this.requireAuthorizationForCacheControl = $.requireAuthorizationForCacheControl;
        this.throttlingBurstLimit = $.throttlingBurstLimit;
        this.throttlingRateLimit = $.throttlingRateLimit;
        this.unauthorizedCacheControlHeaderStrategy = $.unauthorizedCacheControlHeaderStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MethodSettingsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MethodSettingsSettingsArgs $;

        public Builder() {
            $ = new MethodSettingsSettingsArgs();
        }

        public Builder(MethodSettingsSettingsArgs defaults) {
            $ = new MethodSettingsSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cacheDataEncrypted Specifies whether the cached responses are encrypted.
         * 
         * @return builder
         * 
         */
        public Builder cacheDataEncrypted(@Nullable Output<Boolean> cacheDataEncrypted) {
            $.cacheDataEncrypted = cacheDataEncrypted;
            return this;
        }

        /**
         * @param cacheDataEncrypted Specifies whether the cached responses are encrypted.
         * 
         * @return builder
         * 
         */
        public Builder cacheDataEncrypted(Boolean cacheDataEncrypted) {
            return cacheDataEncrypted(Output.of(cacheDataEncrypted));
        }

        /**
         * @param cacheTtlInSeconds Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response will be cached.
         * 
         * @return builder
         * 
         */
        public Builder cacheTtlInSeconds(@Nullable Output<Integer> cacheTtlInSeconds) {
            $.cacheTtlInSeconds = cacheTtlInSeconds;
            return this;
        }

        /**
         * @param cacheTtlInSeconds Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response will be cached.
         * 
         * @return builder
         * 
         */
        public Builder cacheTtlInSeconds(Integer cacheTtlInSeconds) {
            return cacheTtlInSeconds(Output.of(cacheTtlInSeconds));
        }

        /**
         * @param cachingEnabled Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled on the stage for responses to be cached.
         * 
         * @return builder
         * 
         */
        public Builder cachingEnabled(@Nullable Output<Boolean> cachingEnabled) {
            $.cachingEnabled = cachingEnabled;
            return this;
        }

        /**
         * @param cachingEnabled Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled on the stage for responses to be cached.
         * 
         * @return builder
         * 
         */
        public Builder cachingEnabled(Boolean cachingEnabled) {
            return cachingEnabled(Output.of(cachingEnabled));
        }

        /**
         * @param dataTraceEnabled Specifies whether data trace logging is enabled for this method, which effects the log entries pushed to Amazon CloudWatch Logs.
         * 
         * @return builder
         * 
         */
        public Builder dataTraceEnabled(@Nullable Output<Boolean> dataTraceEnabled) {
            $.dataTraceEnabled = dataTraceEnabled;
            return this;
        }

        /**
         * @param dataTraceEnabled Specifies whether data trace logging is enabled for this method, which effects the log entries pushed to Amazon CloudWatch Logs.
         * 
         * @return builder
         * 
         */
        public Builder dataTraceEnabled(Boolean dataTraceEnabled) {
            return dataTraceEnabled(Output.of(dataTraceEnabled));
        }

        /**
         * @param loggingLevel Specifies the logging level for this method, which effects the log entries pushed to Amazon CloudWatch Logs. The available levels are `OFF`, `ERROR`, and `INFO`.
         * 
         * @return builder
         * 
         */
        public Builder loggingLevel(@Nullable Output<String> loggingLevel) {
            $.loggingLevel = loggingLevel;
            return this;
        }

        /**
         * @param loggingLevel Specifies the logging level for this method, which effects the log entries pushed to Amazon CloudWatch Logs. The available levels are `OFF`, `ERROR`, and `INFO`.
         * 
         * @return builder
         * 
         */
        public Builder loggingLevel(String loggingLevel) {
            return loggingLevel(Output.of(loggingLevel));
        }

        /**
         * @param metricsEnabled Specifies whether Amazon CloudWatch metrics are enabled for this method.
         * 
         * @return builder
         * 
         */
        public Builder metricsEnabled(@Nullable Output<Boolean> metricsEnabled) {
            $.metricsEnabled = metricsEnabled;
            return this;
        }

        /**
         * @param metricsEnabled Specifies whether Amazon CloudWatch metrics are enabled for this method.
         * 
         * @return builder
         * 
         */
        public Builder metricsEnabled(Boolean metricsEnabled) {
            return metricsEnabled(Output.of(metricsEnabled));
        }

        /**
         * @param requireAuthorizationForCacheControl Specifies whether authorization is required for a cache invalidation request.
         * 
         * @return builder
         * 
         */
        public Builder requireAuthorizationForCacheControl(@Nullable Output<Boolean> requireAuthorizationForCacheControl) {
            $.requireAuthorizationForCacheControl = requireAuthorizationForCacheControl;
            return this;
        }

        /**
         * @param requireAuthorizationForCacheControl Specifies whether authorization is required for a cache invalidation request.
         * 
         * @return builder
         * 
         */
        public Builder requireAuthorizationForCacheControl(Boolean requireAuthorizationForCacheControl) {
            return requireAuthorizationForCacheControl(Output.of(requireAuthorizationForCacheControl));
        }

        /**
         * @param throttlingBurstLimit Specifies the throttling burst limit. Default: `-1` (throttling disabled).
         * 
         * @return builder
         * 
         */
        public Builder throttlingBurstLimit(@Nullable Output<Integer> throttlingBurstLimit) {
            $.throttlingBurstLimit = throttlingBurstLimit;
            return this;
        }

        /**
         * @param throttlingBurstLimit Specifies the throttling burst limit. Default: `-1` (throttling disabled).
         * 
         * @return builder
         * 
         */
        public Builder throttlingBurstLimit(Integer throttlingBurstLimit) {
            return throttlingBurstLimit(Output.of(throttlingBurstLimit));
        }

        /**
         * @param throttlingRateLimit Specifies the throttling rate limit. Default: `-1` (throttling disabled).
         * 
         * @return builder
         * 
         */
        public Builder throttlingRateLimit(@Nullable Output<Double> throttlingRateLimit) {
            $.throttlingRateLimit = throttlingRateLimit;
            return this;
        }

        /**
         * @param throttlingRateLimit Specifies the throttling rate limit. Default: `-1` (throttling disabled).
         * 
         * @return builder
         * 
         */
        public Builder throttlingRateLimit(Double throttlingRateLimit) {
            return throttlingRateLimit(Output.of(throttlingRateLimit));
        }

        /**
         * @param unauthorizedCacheControlHeaderStrategy Specifies how to handle unauthorized requests for cache invalidation. The available values are `FAIL_WITH_403`, `SUCCEED_WITH_RESPONSE_HEADER`, `SUCCEED_WITHOUT_RESPONSE_HEADER`.
         * 
         * @return builder
         * 
         */
        public Builder unauthorizedCacheControlHeaderStrategy(@Nullable Output<String> unauthorizedCacheControlHeaderStrategy) {
            $.unauthorizedCacheControlHeaderStrategy = unauthorizedCacheControlHeaderStrategy;
            return this;
        }

        /**
         * @param unauthorizedCacheControlHeaderStrategy Specifies how to handle unauthorized requests for cache invalidation. The available values are `FAIL_WITH_403`, `SUCCEED_WITH_RESPONSE_HEADER`, `SUCCEED_WITHOUT_RESPONSE_HEADER`.
         * 
         * @return builder
         * 
         */
        public Builder unauthorizedCacheControlHeaderStrategy(String unauthorizedCacheControlHeaderStrategy) {
            return unauthorizedCacheControlHeaderStrategy(Output.of(unauthorizedCacheControlHeaderStrategy));
        }

        public MethodSettingsSettingsArgs build() {
            return $;
        }
    }

}
