// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StageRouteSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final StageRouteSettingArgs Empty = new StageRouteSettingArgs();

    /**
     * Whether data trace logging is enabled for the route. Affects the log entries pushed to Amazon CloudWatch Logs.
     * Defaults to `false`. Supported only for WebSocket APIs.
     * 
     */
    @Import(name="dataTraceEnabled")
      private final @Nullable Output<Boolean> dataTraceEnabled;

    public Output<Boolean> dataTraceEnabled() {
        return this.dataTraceEnabled == null ? Codegen.empty() : this.dataTraceEnabled;
    }

    /**
     * Whether detailed metrics are enabled for the route. Defaults to `false`.
     * 
     */
    @Import(name="detailedMetricsEnabled")
      private final @Nullable Output<Boolean> detailedMetricsEnabled;

    public Output<Boolean> detailedMetricsEnabled() {
        return this.detailedMetricsEnabled == null ? Codegen.empty() : this.detailedMetricsEnabled;
    }

    /**
     * The logging level for the route. Affects the log entries pushed to Amazon CloudWatch Logs.
     * Valid values: `ERROR`, `INFO`, `OFF`. Defaults to `OFF`. Supported only for WebSocket APIs. This provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    @Import(name="loggingLevel")
      private final @Nullable Output<String> loggingLevel;

    public Output<String> loggingLevel() {
        return this.loggingLevel == null ? Codegen.empty() : this.loggingLevel;
    }

    /**
     * Route key.
     * 
     */
    @Import(name="routeKey", required=true)
      private final Output<String> routeKey;

    public Output<String> routeKey() {
        return this.routeKey;
    }

    /**
     * The throttling burst limit for the route.
     * 
     */
    @Import(name="throttlingBurstLimit")
      private final @Nullable Output<Integer> throttlingBurstLimit;

    public Output<Integer> throttlingBurstLimit() {
        return this.throttlingBurstLimit == null ? Codegen.empty() : this.throttlingBurstLimit;
    }

    /**
     * The throttling rate limit for the route.
     * 
     */
    @Import(name="throttlingRateLimit")
      private final @Nullable Output<Double> throttlingRateLimit;

    public Output<Double> throttlingRateLimit() {
        return this.throttlingRateLimit == null ? Codegen.empty() : this.throttlingRateLimit;
    }

    public StageRouteSettingArgs(
        @Nullable Output<Boolean> dataTraceEnabled,
        @Nullable Output<Boolean> detailedMetricsEnabled,
        @Nullable Output<String> loggingLevel,
        Output<String> routeKey,
        @Nullable Output<Integer> throttlingBurstLimit,
        @Nullable Output<Double> throttlingRateLimit) {
        this.dataTraceEnabled = dataTraceEnabled;
        this.detailedMetricsEnabled = detailedMetricsEnabled;
        this.loggingLevel = loggingLevel;
        this.routeKey = Objects.requireNonNull(routeKey, "expected parameter 'routeKey' to be non-null");
        this.throttlingBurstLimit = throttlingBurstLimit;
        this.throttlingRateLimit = throttlingRateLimit;
    }

    private StageRouteSettingArgs() {
        this.dataTraceEnabled = Codegen.empty();
        this.detailedMetricsEnabled = Codegen.empty();
        this.loggingLevel = Codegen.empty();
        this.routeKey = Codegen.empty();
        this.throttlingBurstLimit = Codegen.empty();
        this.throttlingRateLimit = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageRouteSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> dataTraceEnabled;
        private @Nullable Output<Boolean> detailedMetricsEnabled;
        private @Nullable Output<String> loggingLevel;
        private Output<String> routeKey;
        private @Nullable Output<Integer> throttlingBurstLimit;
        private @Nullable Output<Double> throttlingRateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(StageRouteSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataTraceEnabled = defaults.dataTraceEnabled;
    	      this.detailedMetricsEnabled = defaults.detailedMetricsEnabled;
    	      this.loggingLevel = defaults.loggingLevel;
    	      this.routeKey = defaults.routeKey;
    	      this.throttlingBurstLimit = defaults.throttlingBurstLimit;
    	      this.throttlingRateLimit = defaults.throttlingRateLimit;
        }

        public Builder dataTraceEnabled(@Nullable Output<Boolean> dataTraceEnabled) {
            this.dataTraceEnabled = dataTraceEnabled;
            return this;
        }
        public Builder dataTraceEnabled(@Nullable Boolean dataTraceEnabled) {
            this.dataTraceEnabled = Codegen.ofNullable(dataTraceEnabled);
            return this;
        }
        public Builder detailedMetricsEnabled(@Nullable Output<Boolean> detailedMetricsEnabled) {
            this.detailedMetricsEnabled = detailedMetricsEnabled;
            return this;
        }
        public Builder detailedMetricsEnabled(@Nullable Boolean detailedMetricsEnabled) {
            this.detailedMetricsEnabled = Codegen.ofNullable(detailedMetricsEnabled);
            return this;
        }
        public Builder loggingLevel(@Nullable Output<String> loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }
        public Builder loggingLevel(@Nullable String loggingLevel) {
            this.loggingLevel = Codegen.ofNullable(loggingLevel);
            return this;
        }
        public Builder routeKey(Output<String> routeKey) {
            this.routeKey = Objects.requireNonNull(routeKey);
            return this;
        }
        public Builder routeKey(String routeKey) {
            this.routeKey = Output.of(Objects.requireNonNull(routeKey));
            return this;
        }
        public Builder throttlingBurstLimit(@Nullable Output<Integer> throttlingBurstLimit) {
            this.throttlingBurstLimit = throttlingBurstLimit;
            return this;
        }
        public Builder throttlingBurstLimit(@Nullable Integer throttlingBurstLimit) {
            this.throttlingBurstLimit = Codegen.ofNullable(throttlingBurstLimit);
            return this;
        }
        public Builder throttlingRateLimit(@Nullable Output<Double> throttlingRateLimit) {
            this.throttlingRateLimit = throttlingRateLimit;
            return this;
        }
        public Builder throttlingRateLimit(@Nullable Double throttlingRateLimit) {
            this.throttlingRateLimit = Codegen.ofNullable(throttlingRateLimit);
            return this;
        }        public StageRouteSettingArgs build() {
            return new StageRouteSettingArgs(dataTraceEnabled, detailedMetricsEnabled, loggingLevel, routeKey, throttlingBurstLimit, throttlingRateLimit);
        }
    }
}
