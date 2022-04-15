// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.awsnative.apigateway.inputs.DeploymentAccessLogSettingArgs;
import io.pulumi.awsnative.apigateway.inputs.DeploymentCanarySettingArgs;
import io.pulumi.awsnative.apigateway.inputs.DeploymentMethodSettingArgs;
import io.pulumi.awsnative.apigateway.inputs.DeploymentTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentStageDescriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentStageDescriptionArgs Empty = new DeploymentStageDescriptionArgs();

    /**
     * Specifies settings for logging access in this stage.
     * 
     */
    @Import(name="accessLogSetting")
      private final @Nullable Output<DeploymentAccessLogSettingArgs> accessLogSetting;

    public Output<DeploymentAccessLogSettingArgs> accessLogSetting() {
        return this.accessLogSetting == null ? Codegen.empty() : this.accessLogSetting;
    }

    /**
     * Indicates whether cache clustering is enabled for the stage.
     * 
     */
    @Import(name="cacheClusterEnabled")
      private final @Nullable Output<Boolean> cacheClusterEnabled;

    public Output<Boolean> cacheClusterEnabled() {
        return this.cacheClusterEnabled == null ? Codegen.empty() : this.cacheClusterEnabled;
    }

    /**
     * The size of the stage's cache cluster.
     * 
     */
    @Import(name="cacheClusterSize")
      private final @Nullable Output<String> cacheClusterSize;

    public Output<String> cacheClusterSize() {
        return this.cacheClusterSize == null ? Codegen.empty() : this.cacheClusterSize;
    }

    /**
     * The time-to-live (TTL) period, in seconds, that specifies how long API Gateway caches responses.
     * 
     */
    @Import(name="cacheDataEncrypted")
      private final @Nullable Output<Boolean> cacheDataEncrypted;

    public Output<Boolean> cacheDataEncrypted() {
        return this.cacheDataEncrypted == null ? Codegen.empty() : this.cacheDataEncrypted;
    }

    /**
     * The time-to-live (TTL) period, in seconds, that specifies how long API Gateway caches responses.
     * 
     */
    @Import(name="cacheTtlInSeconds")
      private final @Nullable Output<Integer> cacheTtlInSeconds;

    public Output<Integer> cacheTtlInSeconds() {
        return this.cacheTtlInSeconds == null ? Codegen.empty() : this.cacheTtlInSeconds;
    }

    /**
     * Indicates whether responses are cached and returned for requests. You must enable a cache cluster on the stage to cache responses.
     * 
     */
    @Import(name="cachingEnabled")
      private final @Nullable Output<Boolean> cachingEnabled;

    public Output<Boolean> cachingEnabled() {
        return this.cachingEnabled == null ? Codegen.empty() : this.cachingEnabled;
    }

    /**
     * Specifies settings for the canary deployment in this stage.
     * 
     */
    @Import(name="canarySetting")
      private final @Nullable Output<DeploymentCanarySettingArgs> canarySetting;

    public Output<DeploymentCanarySettingArgs> canarySetting() {
        return this.canarySetting == null ? Codegen.empty() : this.canarySetting;
    }

    /**
     * The identifier of the client certificate that API Gateway uses to call your integration endpoints in the stage.
     * 
     */
    @Import(name="clientCertificateId")
      private final @Nullable Output<String> clientCertificateId;

    public Output<String> clientCertificateId() {
        return this.clientCertificateId == null ? Codegen.empty() : this.clientCertificateId;
    }

    /**
     * Indicates whether data trace logging is enabled for methods in the stage. API Gateway pushes these logs to Amazon CloudWatch Logs.
     * 
     */
    @Import(name="dataTraceEnabled")
      private final @Nullable Output<Boolean> dataTraceEnabled;

    public Output<Boolean> dataTraceEnabled() {
        return this.dataTraceEnabled == null ? Codegen.empty() : this.dataTraceEnabled;
    }

    /**
     * A description of the purpose of the stage.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The version identifier of the API documentation snapshot.
     * 
     */
    @Import(name="documentationVersion")
      private final @Nullable Output<String> documentationVersion;

    public Output<String> documentationVersion() {
        return this.documentationVersion == null ? Codegen.empty() : this.documentationVersion;
    }

    /**
     * The logging level for this method. For valid values, see the loggingLevel property of the Stage resource in the Amazon API Gateway API Reference.
     * 
     */
    @Import(name="loggingLevel")
      private final @Nullable Output<String> loggingLevel;

    public Output<String> loggingLevel() {
        return this.loggingLevel == null ? Codegen.empty() : this.loggingLevel;
    }

    /**
     * Configures settings for all of the stage's methods.
     * 
     */
    @Import(name="methodSettings")
      private final @Nullable Output<List<DeploymentMethodSettingArgs>> methodSettings;

    public Output<List<DeploymentMethodSettingArgs>> methodSettings() {
        return this.methodSettings == null ? Codegen.empty() : this.methodSettings;
    }

    /**
     * Indicates whether Amazon CloudWatch metrics are enabled for methods in the stage.
     * 
     */
    @Import(name="metricsEnabled")
      private final @Nullable Output<Boolean> metricsEnabled;

    public Output<Boolean> metricsEnabled() {
        return this.metricsEnabled == null ? Codegen.empty() : this.metricsEnabled;
    }

    /**
     * An array of arbitrary tags (key-value pairs) to associate with the stage.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<DeploymentTagArgs>> tags;

    public Output<List<DeploymentTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The number of burst requests per second that API Gateway permits across all APIs, stages, and methods in your AWS account.
     * 
     */
    @Import(name="throttlingBurstLimit")
      private final @Nullable Output<Integer> throttlingBurstLimit;

    public Output<Integer> throttlingBurstLimit() {
        return this.throttlingBurstLimit == null ? Codegen.empty() : this.throttlingBurstLimit;
    }

    /**
     * The number of steady-state requests per second that API Gateway permits across all APIs, stages, and methods in your AWS account.
     * 
     */
    @Import(name="throttlingRateLimit")
      private final @Nullable Output<Double> throttlingRateLimit;

    public Output<Double> throttlingRateLimit() {
        return this.throttlingRateLimit == null ? Codegen.empty() : this.throttlingRateLimit;
    }

    /**
     * Specifies whether active tracing with X-ray is enabled for this stage.
     * 
     */
    @Import(name="tracingEnabled")
      private final @Nullable Output<Boolean> tracingEnabled;

    public Output<Boolean> tracingEnabled() {
        return this.tracingEnabled == null ? Codegen.empty() : this.tracingEnabled;
    }

    /**
     * A map that defines the stage variables. Variable names must consist of alphanumeric characters, and the values must match the following regular expression: [A-Za-z0-9-._~:/?#&=,]+.
     * 
     */
    @Import(name="variables")
      private final @Nullable Output<Object> variables;

    public Output<Object> variables() {
        return this.variables == null ? Codegen.empty() : this.variables;
    }

    public DeploymentStageDescriptionArgs(
        @Nullable Output<DeploymentAccessLogSettingArgs> accessLogSetting,
        @Nullable Output<Boolean> cacheClusterEnabled,
        @Nullable Output<String> cacheClusterSize,
        @Nullable Output<Boolean> cacheDataEncrypted,
        @Nullable Output<Integer> cacheTtlInSeconds,
        @Nullable Output<Boolean> cachingEnabled,
        @Nullable Output<DeploymentCanarySettingArgs> canarySetting,
        @Nullable Output<String> clientCertificateId,
        @Nullable Output<Boolean> dataTraceEnabled,
        @Nullable Output<String> description,
        @Nullable Output<String> documentationVersion,
        @Nullable Output<String> loggingLevel,
        @Nullable Output<List<DeploymentMethodSettingArgs>> methodSettings,
        @Nullable Output<Boolean> metricsEnabled,
        @Nullable Output<List<DeploymentTagArgs>> tags,
        @Nullable Output<Integer> throttlingBurstLimit,
        @Nullable Output<Double> throttlingRateLimit,
        @Nullable Output<Boolean> tracingEnabled,
        @Nullable Output<Object> variables) {
        this.accessLogSetting = accessLogSetting;
        this.cacheClusterEnabled = cacheClusterEnabled;
        this.cacheClusterSize = cacheClusterSize;
        this.cacheDataEncrypted = cacheDataEncrypted;
        this.cacheTtlInSeconds = cacheTtlInSeconds;
        this.cachingEnabled = cachingEnabled;
        this.canarySetting = canarySetting;
        this.clientCertificateId = clientCertificateId;
        this.dataTraceEnabled = dataTraceEnabled;
        this.description = description;
        this.documentationVersion = documentationVersion;
        this.loggingLevel = loggingLevel;
        this.methodSettings = methodSettings;
        this.metricsEnabled = metricsEnabled;
        this.tags = tags;
        this.throttlingBurstLimit = throttlingBurstLimit;
        this.throttlingRateLimit = throttlingRateLimit;
        this.tracingEnabled = tracingEnabled;
        this.variables = variables;
    }

    private DeploymentStageDescriptionArgs() {
        this.accessLogSetting = Codegen.empty();
        this.cacheClusterEnabled = Codegen.empty();
        this.cacheClusterSize = Codegen.empty();
        this.cacheDataEncrypted = Codegen.empty();
        this.cacheTtlInSeconds = Codegen.empty();
        this.cachingEnabled = Codegen.empty();
        this.canarySetting = Codegen.empty();
        this.clientCertificateId = Codegen.empty();
        this.dataTraceEnabled = Codegen.empty();
        this.description = Codegen.empty();
        this.documentationVersion = Codegen.empty();
        this.loggingLevel = Codegen.empty();
        this.methodSettings = Codegen.empty();
        this.metricsEnabled = Codegen.empty();
        this.tags = Codegen.empty();
        this.throttlingBurstLimit = Codegen.empty();
        this.throttlingRateLimit = Codegen.empty();
        this.tracingEnabled = Codegen.empty();
        this.variables = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentStageDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DeploymentAccessLogSettingArgs> accessLogSetting;
        private @Nullable Output<Boolean> cacheClusterEnabled;
        private @Nullable Output<String> cacheClusterSize;
        private @Nullable Output<Boolean> cacheDataEncrypted;
        private @Nullable Output<Integer> cacheTtlInSeconds;
        private @Nullable Output<Boolean> cachingEnabled;
        private @Nullable Output<DeploymentCanarySettingArgs> canarySetting;
        private @Nullable Output<String> clientCertificateId;
        private @Nullable Output<Boolean> dataTraceEnabled;
        private @Nullable Output<String> description;
        private @Nullable Output<String> documentationVersion;
        private @Nullable Output<String> loggingLevel;
        private @Nullable Output<List<DeploymentMethodSettingArgs>> methodSettings;
        private @Nullable Output<Boolean> metricsEnabled;
        private @Nullable Output<List<DeploymentTagArgs>> tags;
        private @Nullable Output<Integer> throttlingBurstLimit;
        private @Nullable Output<Double> throttlingRateLimit;
        private @Nullable Output<Boolean> tracingEnabled;
        private @Nullable Output<Object> variables;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentStageDescriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLogSetting = defaults.accessLogSetting;
    	      this.cacheClusterEnabled = defaults.cacheClusterEnabled;
    	      this.cacheClusterSize = defaults.cacheClusterSize;
    	      this.cacheDataEncrypted = defaults.cacheDataEncrypted;
    	      this.cacheTtlInSeconds = defaults.cacheTtlInSeconds;
    	      this.cachingEnabled = defaults.cachingEnabled;
    	      this.canarySetting = defaults.canarySetting;
    	      this.clientCertificateId = defaults.clientCertificateId;
    	      this.dataTraceEnabled = defaults.dataTraceEnabled;
    	      this.description = defaults.description;
    	      this.documentationVersion = defaults.documentationVersion;
    	      this.loggingLevel = defaults.loggingLevel;
    	      this.methodSettings = defaults.methodSettings;
    	      this.metricsEnabled = defaults.metricsEnabled;
    	      this.tags = defaults.tags;
    	      this.throttlingBurstLimit = defaults.throttlingBurstLimit;
    	      this.throttlingRateLimit = defaults.throttlingRateLimit;
    	      this.tracingEnabled = defaults.tracingEnabled;
    	      this.variables = defaults.variables;
        }

        public Builder accessLogSetting(@Nullable Output<DeploymentAccessLogSettingArgs> accessLogSetting) {
            this.accessLogSetting = accessLogSetting;
            return this;
        }
        public Builder accessLogSetting(@Nullable DeploymentAccessLogSettingArgs accessLogSetting) {
            this.accessLogSetting = Codegen.ofNullable(accessLogSetting);
            return this;
        }
        public Builder cacheClusterEnabled(@Nullable Output<Boolean> cacheClusterEnabled) {
            this.cacheClusterEnabled = cacheClusterEnabled;
            return this;
        }
        public Builder cacheClusterEnabled(@Nullable Boolean cacheClusterEnabled) {
            this.cacheClusterEnabled = Codegen.ofNullable(cacheClusterEnabled);
            return this;
        }
        public Builder cacheClusterSize(@Nullable Output<String> cacheClusterSize) {
            this.cacheClusterSize = cacheClusterSize;
            return this;
        }
        public Builder cacheClusterSize(@Nullable String cacheClusterSize) {
            this.cacheClusterSize = Codegen.ofNullable(cacheClusterSize);
            return this;
        }
        public Builder cacheDataEncrypted(@Nullable Output<Boolean> cacheDataEncrypted) {
            this.cacheDataEncrypted = cacheDataEncrypted;
            return this;
        }
        public Builder cacheDataEncrypted(@Nullable Boolean cacheDataEncrypted) {
            this.cacheDataEncrypted = Codegen.ofNullable(cacheDataEncrypted);
            return this;
        }
        public Builder cacheTtlInSeconds(@Nullable Output<Integer> cacheTtlInSeconds) {
            this.cacheTtlInSeconds = cacheTtlInSeconds;
            return this;
        }
        public Builder cacheTtlInSeconds(@Nullable Integer cacheTtlInSeconds) {
            this.cacheTtlInSeconds = Codegen.ofNullable(cacheTtlInSeconds);
            return this;
        }
        public Builder cachingEnabled(@Nullable Output<Boolean> cachingEnabled) {
            this.cachingEnabled = cachingEnabled;
            return this;
        }
        public Builder cachingEnabled(@Nullable Boolean cachingEnabled) {
            this.cachingEnabled = Codegen.ofNullable(cachingEnabled);
            return this;
        }
        public Builder canarySetting(@Nullable Output<DeploymentCanarySettingArgs> canarySetting) {
            this.canarySetting = canarySetting;
            return this;
        }
        public Builder canarySetting(@Nullable DeploymentCanarySettingArgs canarySetting) {
            this.canarySetting = Codegen.ofNullable(canarySetting);
            return this;
        }
        public Builder clientCertificateId(@Nullable Output<String> clientCertificateId) {
            this.clientCertificateId = clientCertificateId;
            return this;
        }
        public Builder clientCertificateId(@Nullable String clientCertificateId) {
            this.clientCertificateId = Codegen.ofNullable(clientCertificateId);
            return this;
        }
        public Builder dataTraceEnabled(@Nullable Output<Boolean> dataTraceEnabled) {
            this.dataTraceEnabled = dataTraceEnabled;
            return this;
        }
        public Builder dataTraceEnabled(@Nullable Boolean dataTraceEnabled) {
            this.dataTraceEnabled = Codegen.ofNullable(dataTraceEnabled);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder documentationVersion(@Nullable Output<String> documentationVersion) {
            this.documentationVersion = documentationVersion;
            return this;
        }
        public Builder documentationVersion(@Nullable String documentationVersion) {
            this.documentationVersion = Codegen.ofNullable(documentationVersion);
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
        public Builder methodSettings(@Nullable Output<List<DeploymentMethodSettingArgs>> methodSettings) {
            this.methodSettings = methodSettings;
            return this;
        }
        public Builder methodSettings(@Nullable List<DeploymentMethodSettingArgs> methodSettings) {
            this.methodSettings = Codegen.ofNullable(methodSettings);
            return this;
        }
        public Builder methodSettings(DeploymentMethodSettingArgs... methodSettings) {
            return methodSettings(List.of(methodSettings));
        }
        public Builder metricsEnabled(@Nullable Output<Boolean> metricsEnabled) {
            this.metricsEnabled = metricsEnabled;
            return this;
        }
        public Builder metricsEnabled(@Nullable Boolean metricsEnabled) {
            this.metricsEnabled = Codegen.ofNullable(metricsEnabled);
            return this;
        }
        public Builder tags(@Nullable Output<List<DeploymentTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<DeploymentTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(DeploymentTagArgs... tags) {
            return tags(List.of(tags));
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
        }
        public Builder tracingEnabled(@Nullable Output<Boolean> tracingEnabled) {
            this.tracingEnabled = tracingEnabled;
            return this;
        }
        public Builder tracingEnabled(@Nullable Boolean tracingEnabled) {
            this.tracingEnabled = Codegen.ofNullable(tracingEnabled);
            return this;
        }
        public Builder variables(@Nullable Output<Object> variables) {
            this.variables = variables;
            return this;
        }
        public Builder variables(@Nullable Object variables) {
            this.variables = Codegen.ofNullable(variables);
            return this;
        }        public DeploymentStageDescriptionArgs build() {
            return new DeploymentStageDescriptionArgs(accessLogSetting, cacheClusterEnabled, cacheClusterSize, cacheDataEncrypted, cacheTtlInSeconds, cachingEnabled, canarySetting, clientCertificateId, dataTraceEnabled, description, documentationVersion, loggingLevel, methodSettings, metricsEnabled, tags, throttlingBurstLimit, throttlingRateLimit, tracingEnabled, variables);
        }
    }
}
