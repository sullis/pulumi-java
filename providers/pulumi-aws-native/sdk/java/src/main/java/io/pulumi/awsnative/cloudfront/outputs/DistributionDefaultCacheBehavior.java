// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.awsnative.cloudfront.outputs.DistributionForwardedValues;
import io.pulumi.awsnative.cloudfront.outputs.DistributionFunctionAssociation;
import io.pulumi.awsnative.cloudfront.outputs.DistributionLambdaFunctionAssociation;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionDefaultCacheBehavior {
    private final @Nullable List<String> allowedMethods;
    private final @Nullable String cachePolicyId;
    private final @Nullable List<String> cachedMethods;
    private final @Nullable Boolean compress;
    private final @Nullable Double defaultTTL;
    private final @Nullable String fieldLevelEncryptionId;
    private final @Nullable DistributionForwardedValues forwardedValues;
    private final @Nullable List<DistributionFunctionAssociation> functionAssociations;
    private final @Nullable List<DistributionLambdaFunctionAssociation> lambdaFunctionAssociations;
    private final @Nullable Double maxTTL;
    private final @Nullable Double minTTL;
    private final @Nullable String originRequestPolicyId;
    private final @Nullable String realtimeLogConfigArn;
    private final @Nullable String responseHeadersPolicyId;
    private final @Nullable Boolean smoothStreaming;
    private final String targetOriginId;
    private final @Nullable List<String> trustedKeyGroups;
    private final @Nullable List<String> trustedSigners;
    private final String viewerProtocolPolicy;

    @OutputCustomType.Constructor({"allowedMethods","cachePolicyId","cachedMethods","compress","defaultTTL","fieldLevelEncryptionId","forwardedValues","functionAssociations","lambdaFunctionAssociations","maxTTL","minTTL","originRequestPolicyId","realtimeLogConfigArn","responseHeadersPolicyId","smoothStreaming","targetOriginId","trustedKeyGroups","trustedSigners","viewerProtocolPolicy"})
    private DistributionDefaultCacheBehavior(
        @Nullable List<String> allowedMethods,
        @Nullable String cachePolicyId,
        @Nullable List<String> cachedMethods,
        @Nullable Boolean compress,
        @Nullable Double defaultTTL,
        @Nullable String fieldLevelEncryptionId,
        @Nullable DistributionForwardedValues forwardedValues,
        @Nullable List<DistributionFunctionAssociation> functionAssociations,
        @Nullable List<DistributionLambdaFunctionAssociation> lambdaFunctionAssociations,
        @Nullable Double maxTTL,
        @Nullable Double minTTL,
        @Nullable String originRequestPolicyId,
        @Nullable String realtimeLogConfigArn,
        @Nullable String responseHeadersPolicyId,
        @Nullable Boolean smoothStreaming,
        String targetOriginId,
        @Nullable List<String> trustedKeyGroups,
        @Nullable List<String> trustedSigners,
        String viewerProtocolPolicy) {
        this.allowedMethods = allowedMethods;
        this.cachePolicyId = cachePolicyId;
        this.cachedMethods = cachedMethods;
        this.compress = compress;
        this.defaultTTL = defaultTTL;
        this.fieldLevelEncryptionId = fieldLevelEncryptionId;
        this.forwardedValues = forwardedValues;
        this.functionAssociations = functionAssociations;
        this.lambdaFunctionAssociations = lambdaFunctionAssociations;
        this.maxTTL = maxTTL;
        this.minTTL = minTTL;
        this.originRequestPolicyId = originRequestPolicyId;
        this.realtimeLogConfigArn = realtimeLogConfigArn;
        this.responseHeadersPolicyId = responseHeadersPolicyId;
        this.smoothStreaming = smoothStreaming;
        this.targetOriginId = Objects.requireNonNull(targetOriginId);
        this.trustedKeyGroups = trustedKeyGroups;
        this.trustedSigners = trustedSigners;
        this.viewerProtocolPolicy = Objects.requireNonNull(viewerProtocolPolicy);
    }

    public List<String> getAllowedMethods() {
        return this.allowedMethods == null ? List.of() : this.allowedMethods;
    }
    public Optional<String> getCachePolicyId() {
        return Optional.ofNullable(this.cachePolicyId);
    }
    public List<String> getCachedMethods() {
        return this.cachedMethods == null ? List.of() : this.cachedMethods;
    }
    public Optional<Boolean> getCompress() {
        return Optional.ofNullable(this.compress);
    }
    public Optional<Double> getDefaultTTL() {
        return Optional.ofNullable(this.defaultTTL);
    }
    public Optional<String> getFieldLevelEncryptionId() {
        return Optional.ofNullable(this.fieldLevelEncryptionId);
    }
    public Optional<DistributionForwardedValues> getForwardedValues() {
        return Optional.ofNullable(this.forwardedValues);
    }
    public List<DistributionFunctionAssociation> getFunctionAssociations() {
        return this.functionAssociations == null ? List.of() : this.functionAssociations;
    }
    public List<DistributionLambdaFunctionAssociation> getLambdaFunctionAssociations() {
        return this.lambdaFunctionAssociations == null ? List.of() : this.lambdaFunctionAssociations;
    }
    public Optional<Double> getMaxTTL() {
        return Optional.ofNullable(this.maxTTL);
    }
    public Optional<Double> getMinTTL() {
        return Optional.ofNullable(this.minTTL);
    }
    public Optional<String> getOriginRequestPolicyId() {
        return Optional.ofNullable(this.originRequestPolicyId);
    }
    public Optional<String> getRealtimeLogConfigArn() {
        return Optional.ofNullable(this.realtimeLogConfigArn);
    }
    public Optional<String> getResponseHeadersPolicyId() {
        return Optional.ofNullable(this.responseHeadersPolicyId);
    }
    public Optional<Boolean> getSmoothStreaming() {
        return Optional.ofNullable(this.smoothStreaming);
    }
    public String getTargetOriginId() {
        return this.targetOriginId;
    }
    public List<String> getTrustedKeyGroups() {
        return this.trustedKeyGroups == null ? List.of() : this.trustedKeyGroups;
    }
    public List<String> getTrustedSigners() {
        return this.trustedSigners == null ? List.of() : this.trustedSigners;
    }
    public String getViewerProtocolPolicy() {
        return this.viewerProtocolPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionDefaultCacheBehavior defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedMethods;
        private @Nullable String cachePolicyId;
        private @Nullable List<String> cachedMethods;
        private @Nullable Boolean compress;
        private @Nullable Double defaultTTL;
        private @Nullable String fieldLevelEncryptionId;
        private @Nullable DistributionForwardedValues forwardedValues;
        private @Nullable List<DistributionFunctionAssociation> functionAssociations;
        private @Nullable List<DistributionLambdaFunctionAssociation> lambdaFunctionAssociations;
        private @Nullable Double maxTTL;
        private @Nullable Double minTTL;
        private @Nullable String originRequestPolicyId;
        private @Nullable String realtimeLogConfigArn;
        private @Nullable String responseHeadersPolicyId;
        private @Nullable Boolean smoothStreaming;
        private String targetOriginId;
        private @Nullable List<String> trustedKeyGroups;
        private @Nullable List<String> trustedSigners;
        private String viewerProtocolPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionDefaultCacheBehavior defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.cachePolicyId = defaults.cachePolicyId;
    	      this.cachedMethods = defaults.cachedMethods;
    	      this.compress = defaults.compress;
    	      this.defaultTTL = defaults.defaultTTL;
    	      this.fieldLevelEncryptionId = defaults.fieldLevelEncryptionId;
    	      this.forwardedValues = defaults.forwardedValues;
    	      this.functionAssociations = defaults.functionAssociations;
    	      this.lambdaFunctionAssociations = defaults.lambdaFunctionAssociations;
    	      this.maxTTL = defaults.maxTTL;
    	      this.minTTL = defaults.minTTL;
    	      this.originRequestPolicyId = defaults.originRequestPolicyId;
    	      this.realtimeLogConfigArn = defaults.realtimeLogConfigArn;
    	      this.responseHeadersPolicyId = defaults.responseHeadersPolicyId;
    	      this.smoothStreaming = defaults.smoothStreaming;
    	      this.targetOriginId = defaults.targetOriginId;
    	      this.trustedKeyGroups = defaults.trustedKeyGroups;
    	      this.trustedSigners = defaults.trustedSigners;
    	      this.viewerProtocolPolicy = defaults.viewerProtocolPolicy;
        }

        public Builder setAllowedMethods(@Nullable List<String> allowedMethods) {
            this.allowedMethods = allowedMethods;
            return this;
        }

        public Builder setCachePolicyId(@Nullable String cachePolicyId) {
            this.cachePolicyId = cachePolicyId;
            return this;
        }

        public Builder setCachedMethods(@Nullable List<String> cachedMethods) {
            this.cachedMethods = cachedMethods;
            return this;
        }

        public Builder setCompress(@Nullable Boolean compress) {
            this.compress = compress;
            return this;
        }

        public Builder setDefaultTTL(@Nullable Double defaultTTL) {
            this.defaultTTL = defaultTTL;
            return this;
        }

        public Builder setFieldLevelEncryptionId(@Nullable String fieldLevelEncryptionId) {
            this.fieldLevelEncryptionId = fieldLevelEncryptionId;
            return this;
        }

        public Builder setForwardedValues(@Nullable DistributionForwardedValues forwardedValues) {
            this.forwardedValues = forwardedValues;
            return this;
        }

        public Builder setFunctionAssociations(@Nullable List<DistributionFunctionAssociation> functionAssociations) {
            this.functionAssociations = functionAssociations;
            return this;
        }

        public Builder setLambdaFunctionAssociations(@Nullable List<DistributionLambdaFunctionAssociation> lambdaFunctionAssociations) {
            this.lambdaFunctionAssociations = lambdaFunctionAssociations;
            return this;
        }

        public Builder setMaxTTL(@Nullable Double maxTTL) {
            this.maxTTL = maxTTL;
            return this;
        }

        public Builder setMinTTL(@Nullable Double minTTL) {
            this.minTTL = minTTL;
            return this;
        }

        public Builder setOriginRequestPolicyId(@Nullable String originRequestPolicyId) {
            this.originRequestPolicyId = originRequestPolicyId;
            return this;
        }

        public Builder setRealtimeLogConfigArn(@Nullable String realtimeLogConfigArn) {
            this.realtimeLogConfigArn = realtimeLogConfigArn;
            return this;
        }

        public Builder setResponseHeadersPolicyId(@Nullable String responseHeadersPolicyId) {
            this.responseHeadersPolicyId = responseHeadersPolicyId;
            return this;
        }

        public Builder setSmoothStreaming(@Nullable Boolean smoothStreaming) {
            this.smoothStreaming = smoothStreaming;
            return this;
        }

        public Builder setTargetOriginId(String targetOriginId) {
            this.targetOriginId = Objects.requireNonNull(targetOriginId);
            return this;
        }

        public Builder setTrustedKeyGroups(@Nullable List<String> trustedKeyGroups) {
            this.trustedKeyGroups = trustedKeyGroups;
            return this;
        }

        public Builder setTrustedSigners(@Nullable List<String> trustedSigners) {
            this.trustedSigners = trustedSigners;
            return this;
        }

        public Builder setViewerProtocolPolicy(String viewerProtocolPolicy) {
            this.viewerProtocolPolicy = Objects.requireNonNull(viewerProtocolPolicy);
            return this;
        }

        public DistributionDefaultCacheBehavior build() {
            return new DistributionDefaultCacheBehavior(allowedMethods, cachePolicyId, cachedMethods, compress, defaultTTL, fieldLevelEncryptionId, forwardedValues, functionAssociations, lambdaFunctionAssociations, maxTTL, minTTL, originRequestPolicyId, realtimeLogConfigArn, responseHeadersPolicyId, smoothStreaming, targetOriginId, trustedKeyGroups, trustedSigners, viewerProtocolPolicy);
        }
    }
}
