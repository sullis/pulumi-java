// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.DistributionForwardedValues;
import io.pulumi.awsnative.cloudfront.inputs.DistributionFunctionAssociation;
import io.pulumi.awsnative.cloudfront.inputs.DistributionLambdaFunctionAssociation;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionDefaultCacheBehavior extends io.pulumi.resources.InvokeArgs {

    public static final DistributionDefaultCacheBehavior Empty = new DistributionDefaultCacheBehavior();

    @Import(name="allowedMethods")
      private final @Nullable List<String> allowedMethods;

    public List<String> allowedMethods() {
        return this.allowedMethods == null ? List.of() : this.allowedMethods;
    }

    @Import(name="cachePolicyId")
      private final @Nullable String cachePolicyId;

    public Optional<String> cachePolicyId() {
        return this.cachePolicyId == null ? Optional.empty() : Optional.ofNullable(this.cachePolicyId);
    }

    @Import(name="cachedMethods")
      private final @Nullable List<String> cachedMethods;

    public List<String> cachedMethods() {
        return this.cachedMethods == null ? List.of() : this.cachedMethods;
    }

    @Import(name="compress")
      private final @Nullable Boolean compress;

    public Optional<Boolean> compress() {
        return this.compress == null ? Optional.empty() : Optional.ofNullable(this.compress);
    }

    @Import(name="defaultTTL")
      private final @Nullable Double defaultTTL;

    public Optional<Double> defaultTTL() {
        return this.defaultTTL == null ? Optional.empty() : Optional.ofNullable(this.defaultTTL);
    }

    @Import(name="fieldLevelEncryptionId")
      private final @Nullable String fieldLevelEncryptionId;

    public Optional<String> fieldLevelEncryptionId() {
        return this.fieldLevelEncryptionId == null ? Optional.empty() : Optional.ofNullable(this.fieldLevelEncryptionId);
    }

    @Import(name="forwardedValues")
      private final @Nullable DistributionForwardedValues forwardedValues;

    public Optional<DistributionForwardedValues> forwardedValues() {
        return this.forwardedValues == null ? Optional.empty() : Optional.ofNullable(this.forwardedValues);
    }

    @Import(name="functionAssociations")
      private final @Nullable List<DistributionFunctionAssociation> functionAssociations;

    public List<DistributionFunctionAssociation> functionAssociations() {
        return this.functionAssociations == null ? List.of() : this.functionAssociations;
    }

    @Import(name="lambdaFunctionAssociations")
      private final @Nullable List<DistributionLambdaFunctionAssociation> lambdaFunctionAssociations;

    public List<DistributionLambdaFunctionAssociation> lambdaFunctionAssociations() {
        return this.lambdaFunctionAssociations == null ? List.of() : this.lambdaFunctionAssociations;
    }

    @Import(name="maxTTL")
      private final @Nullable Double maxTTL;

    public Optional<Double> maxTTL() {
        return this.maxTTL == null ? Optional.empty() : Optional.ofNullable(this.maxTTL);
    }

    @Import(name="minTTL")
      private final @Nullable Double minTTL;

    public Optional<Double> minTTL() {
        return this.minTTL == null ? Optional.empty() : Optional.ofNullable(this.minTTL);
    }

    @Import(name="originRequestPolicyId")
      private final @Nullable String originRequestPolicyId;

    public Optional<String> originRequestPolicyId() {
        return this.originRequestPolicyId == null ? Optional.empty() : Optional.ofNullable(this.originRequestPolicyId);
    }

    @Import(name="realtimeLogConfigArn")
      private final @Nullable String realtimeLogConfigArn;

    public Optional<String> realtimeLogConfigArn() {
        return this.realtimeLogConfigArn == null ? Optional.empty() : Optional.ofNullable(this.realtimeLogConfigArn);
    }

    @Import(name="responseHeadersPolicyId")
      private final @Nullable String responseHeadersPolicyId;

    public Optional<String> responseHeadersPolicyId() {
        return this.responseHeadersPolicyId == null ? Optional.empty() : Optional.ofNullable(this.responseHeadersPolicyId);
    }

    @Import(name="smoothStreaming")
      private final @Nullable Boolean smoothStreaming;

    public Optional<Boolean> smoothStreaming() {
        return this.smoothStreaming == null ? Optional.empty() : Optional.ofNullable(this.smoothStreaming);
    }

    @Import(name="targetOriginId", required=true)
      private final String targetOriginId;

    public String targetOriginId() {
        return this.targetOriginId;
    }

    @Import(name="trustedKeyGroups")
      private final @Nullable List<String> trustedKeyGroups;

    public List<String> trustedKeyGroups() {
        return this.trustedKeyGroups == null ? List.of() : this.trustedKeyGroups;
    }

    @Import(name="trustedSigners")
      private final @Nullable List<String> trustedSigners;

    public List<String> trustedSigners() {
        return this.trustedSigners == null ? List.of() : this.trustedSigners;
    }

    @Import(name="viewerProtocolPolicy", required=true)
      private final String viewerProtocolPolicy;

    public String viewerProtocolPolicy() {
        return this.viewerProtocolPolicy;
    }

    public DistributionDefaultCacheBehavior(
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
        this.targetOriginId = Objects.requireNonNull(targetOriginId, "expected parameter 'targetOriginId' to be non-null");
        this.trustedKeyGroups = trustedKeyGroups;
        this.trustedSigners = trustedSigners;
        this.viewerProtocolPolicy = Objects.requireNonNull(viewerProtocolPolicy, "expected parameter 'viewerProtocolPolicy' to be non-null");
    }

    private DistributionDefaultCacheBehavior() {
        this.allowedMethods = List.of();
        this.cachePolicyId = null;
        this.cachedMethods = List.of();
        this.compress = null;
        this.defaultTTL = null;
        this.fieldLevelEncryptionId = null;
        this.forwardedValues = null;
        this.functionAssociations = List.of();
        this.lambdaFunctionAssociations = List.of();
        this.maxTTL = null;
        this.minTTL = null;
        this.originRequestPolicyId = null;
        this.realtimeLogConfigArn = null;
        this.responseHeadersPolicyId = null;
        this.smoothStreaming = null;
        this.targetOriginId = null;
        this.trustedKeyGroups = List.of();
        this.trustedSigners = List.of();
        this.viewerProtocolPolicy = null;
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

        public Builder allowedMethods(@Nullable List<String> allowedMethods) {
            this.allowedMethods = allowedMethods;
            return this;
        }
        public Builder allowedMethods(String... allowedMethods) {
            return allowedMethods(List.of(allowedMethods));
        }
        public Builder cachePolicyId(@Nullable String cachePolicyId) {
            this.cachePolicyId = cachePolicyId;
            return this;
        }
        public Builder cachedMethods(@Nullable List<String> cachedMethods) {
            this.cachedMethods = cachedMethods;
            return this;
        }
        public Builder cachedMethods(String... cachedMethods) {
            return cachedMethods(List.of(cachedMethods));
        }
        public Builder compress(@Nullable Boolean compress) {
            this.compress = compress;
            return this;
        }
        public Builder defaultTTL(@Nullable Double defaultTTL) {
            this.defaultTTL = defaultTTL;
            return this;
        }
        public Builder fieldLevelEncryptionId(@Nullable String fieldLevelEncryptionId) {
            this.fieldLevelEncryptionId = fieldLevelEncryptionId;
            return this;
        }
        public Builder forwardedValues(@Nullable DistributionForwardedValues forwardedValues) {
            this.forwardedValues = forwardedValues;
            return this;
        }
        public Builder functionAssociations(@Nullable List<DistributionFunctionAssociation> functionAssociations) {
            this.functionAssociations = functionAssociations;
            return this;
        }
        public Builder functionAssociations(DistributionFunctionAssociation... functionAssociations) {
            return functionAssociations(List.of(functionAssociations));
        }
        public Builder lambdaFunctionAssociations(@Nullable List<DistributionLambdaFunctionAssociation> lambdaFunctionAssociations) {
            this.lambdaFunctionAssociations = lambdaFunctionAssociations;
            return this;
        }
        public Builder lambdaFunctionAssociations(DistributionLambdaFunctionAssociation... lambdaFunctionAssociations) {
            return lambdaFunctionAssociations(List.of(lambdaFunctionAssociations));
        }
        public Builder maxTTL(@Nullable Double maxTTL) {
            this.maxTTL = maxTTL;
            return this;
        }
        public Builder minTTL(@Nullable Double minTTL) {
            this.minTTL = minTTL;
            return this;
        }
        public Builder originRequestPolicyId(@Nullable String originRequestPolicyId) {
            this.originRequestPolicyId = originRequestPolicyId;
            return this;
        }
        public Builder realtimeLogConfigArn(@Nullable String realtimeLogConfigArn) {
            this.realtimeLogConfigArn = realtimeLogConfigArn;
            return this;
        }
        public Builder responseHeadersPolicyId(@Nullable String responseHeadersPolicyId) {
            this.responseHeadersPolicyId = responseHeadersPolicyId;
            return this;
        }
        public Builder smoothStreaming(@Nullable Boolean smoothStreaming) {
            this.smoothStreaming = smoothStreaming;
            return this;
        }
        public Builder targetOriginId(String targetOriginId) {
            this.targetOriginId = Objects.requireNonNull(targetOriginId);
            return this;
        }
        public Builder trustedKeyGroups(@Nullable List<String> trustedKeyGroups) {
            this.trustedKeyGroups = trustedKeyGroups;
            return this;
        }
        public Builder trustedKeyGroups(String... trustedKeyGroups) {
            return trustedKeyGroups(List.of(trustedKeyGroups));
        }
        public Builder trustedSigners(@Nullable List<String> trustedSigners) {
            this.trustedSigners = trustedSigners;
            return this;
        }
        public Builder trustedSigners(String... trustedSigners) {
            return trustedSigners(List.of(trustedSigners));
        }
        public Builder viewerProtocolPolicy(String viewerProtocolPolicy) {
            this.viewerProtocolPolicy = Objects.requireNonNull(viewerProtocolPolicy);
            return this;
        }        public DistributionDefaultCacheBehavior build() {
            return new DistributionDefaultCacheBehavior(allowedMethods, cachePolicyId, cachedMethods, compress, defaultTTL, fieldLevelEncryptionId, forwardedValues, functionAssociations, lambdaFunctionAssociations, maxTTL, minTTL, originRequestPolicyId, realtimeLogConfigArn, responseHeadersPolicyId, smoothStreaming, targetOriginId, trustedKeyGroups, trustedSigners, viewerProtocolPolicy);
        }
    }
}
