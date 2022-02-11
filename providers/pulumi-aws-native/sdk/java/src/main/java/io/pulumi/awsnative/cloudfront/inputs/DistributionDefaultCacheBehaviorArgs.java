// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.DistributionForwardedValuesArgs;
import io.pulumi.awsnative.cloudfront.inputs.DistributionFunctionAssociationArgs;
import io.pulumi.awsnative.cloudfront.inputs.DistributionLambdaFunctionAssociationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionDefaultCacheBehaviorArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionDefaultCacheBehaviorArgs Empty = new DistributionDefaultCacheBehaviorArgs();

    @InputImport(name="allowedMethods")
    private final @Nullable Input<List<String>> allowedMethods;

    public Input<List<String>> getAllowedMethods() {
        return this.allowedMethods == null ? Input.empty() : this.allowedMethods;
    }

    @InputImport(name="cachePolicyId")
    private final @Nullable Input<String> cachePolicyId;

    public Input<String> getCachePolicyId() {
        return this.cachePolicyId == null ? Input.empty() : this.cachePolicyId;
    }

    @InputImport(name="cachedMethods")
    private final @Nullable Input<List<String>> cachedMethods;

    public Input<List<String>> getCachedMethods() {
        return this.cachedMethods == null ? Input.empty() : this.cachedMethods;
    }

    @InputImport(name="compress")
    private final @Nullable Input<Boolean> compress;

    public Input<Boolean> getCompress() {
        return this.compress == null ? Input.empty() : this.compress;
    }

    @InputImport(name="defaultTTL")
    private final @Nullable Input<Double> defaultTTL;

    public Input<Double> getDefaultTTL() {
        return this.defaultTTL == null ? Input.empty() : this.defaultTTL;
    }

    @InputImport(name="fieldLevelEncryptionId")
    private final @Nullable Input<String> fieldLevelEncryptionId;

    public Input<String> getFieldLevelEncryptionId() {
        return this.fieldLevelEncryptionId == null ? Input.empty() : this.fieldLevelEncryptionId;
    }

    @InputImport(name="forwardedValues")
    private final @Nullable Input<DistributionForwardedValuesArgs> forwardedValues;

    public Input<DistributionForwardedValuesArgs> getForwardedValues() {
        return this.forwardedValues == null ? Input.empty() : this.forwardedValues;
    }

    @InputImport(name="functionAssociations")
    private final @Nullable Input<List<DistributionFunctionAssociationArgs>> functionAssociations;

    public Input<List<DistributionFunctionAssociationArgs>> getFunctionAssociations() {
        return this.functionAssociations == null ? Input.empty() : this.functionAssociations;
    }

    @InputImport(name="lambdaFunctionAssociations")
    private final @Nullable Input<List<DistributionLambdaFunctionAssociationArgs>> lambdaFunctionAssociations;

    public Input<List<DistributionLambdaFunctionAssociationArgs>> getLambdaFunctionAssociations() {
        return this.lambdaFunctionAssociations == null ? Input.empty() : this.lambdaFunctionAssociations;
    }

    @InputImport(name="maxTTL")
    private final @Nullable Input<Double> maxTTL;

    public Input<Double> getMaxTTL() {
        return this.maxTTL == null ? Input.empty() : this.maxTTL;
    }

    @InputImport(name="minTTL")
    private final @Nullable Input<Double> minTTL;

    public Input<Double> getMinTTL() {
        return this.minTTL == null ? Input.empty() : this.minTTL;
    }

    @InputImport(name="originRequestPolicyId")
    private final @Nullable Input<String> originRequestPolicyId;

    public Input<String> getOriginRequestPolicyId() {
        return this.originRequestPolicyId == null ? Input.empty() : this.originRequestPolicyId;
    }

    @InputImport(name="realtimeLogConfigArn")
    private final @Nullable Input<String> realtimeLogConfigArn;

    public Input<String> getRealtimeLogConfigArn() {
        return this.realtimeLogConfigArn == null ? Input.empty() : this.realtimeLogConfigArn;
    }

    @InputImport(name="responseHeadersPolicyId")
    private final @Nullable Input<String> responseHeadersPolicyId;

    public Input<String> getResponseHeadersPolicyId() {
        return this.responseHeadersPolicyId == null ? Input.empty() : this.responseHeadersPolicyId;
    }

    @InputImport(name="smoothStreaming")
    private final @Nullable Input<Boolean> smoothStreaming;

    public Input<Boolean> getSmoothStreaming() {
        return this.smoothStreaming == null ? Input.empty() : this.smoothStreaming;
    }

    @InputImport(name="targetOriginId", required=true)
    private final Input<String> targetOriginId;

    public Input<String> getTargetOriginId() {
        return this.targetOriginId;
    }

    @InputImport(name="trustedKeyGroups")
    private final @Nullable Input<List<String>> trustedKeyGroups;

    public Input<List<String>> getTrustedKeyGroups() {
        return this.trustedKeyGroups == null ? Input.empty() : this.trustedKeyGroups;
    }

    @InputImport(name="trustedSigners")
    private final @Nullable Input<List<String>> trustedSigners;

    public Input<List<String>> getTrustedSigners() {
        return this.trustedSigners == null ? Input.empty() : this.trustedSigners;
    }

    @InputImport(name="viewerProtocolPolicy", required=true)
    private final Input<String> viewerProtocolPolicy;

    public Input<String> getViewerProtocolPolicy() {
        return this.viewerProtocolPolicy;
    }

    public DistributionDefaultCacheBehaviorArgs(
        @Nullable Input<List<String>> allowedMethods,
        @Nullable Input<String> cachePolicyId,
        @Nullable Input<List<String>> cachedMethods,
        @Nullable Input<Boolean> compress,
        @Nullable Input<Double> defaultTTL,
        @Nullable Input<String> fieldLevelEncryptionId,
        @Nullable Input<DistributionForwardedValuesArgs> forwardedValues,
        @Nullable Input<List<DistributionFunctionAssociationArgs>> functionAssociations,
        @Nullable Input<List<DistributionLambdaFunctionAssociationArgs>> lambdaFunctionAssociations,
        @Nullable Input<Double> maxTTL,
        @Nullable Input<Double> minTTL,
        @Nullable Input<String> originRequestPolicyId,
        @Nullable Input<String> realtimeLogConfigArn,
        @Nullable Input<String> responseHeadersPolicyId,
        @Nullable Input<Boolean> smoothStreaming,
        Input<String> targetOriginId,
        @Nullable Input<List<String>> trustedKeyGroups,
        @Nullable Input<List<String>> trustedSigners,
        Input<String> viewerProtocolPolicy) {
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

    private DistributionDefaultCacheBehaviorArgs() {
        this.allowedMethods = Input.empty();
        this.cachePolicyId = Input.empty();
        this.cachedMethods = Input.empty();
        this.compress = Input.empty();
        this.defaultTTL = Input.empty();
        this.fieldLevelEncryptionId = Input.empty();
        this.forwardedValues = Input.empty();
        this.functionAssociations = Input.empty();
        this.lambdaFunctionAssociations = Input.empty();
        this.maxTTL = Input.empty();
        this.minTTL = Input.empty();
        this.originRequestPolicyId = Input.empty();
        this.realtimeLogConfigArn = Input.empty();
        this.responseHeadersPolicyId = Input.empty();
        this.smoothStreaming = Input.empty();
        this.targetOriginId = Input.empty();
        this.trustedKeyGroups = Input.empty();
        this.trustedSigners = Input.empty();
        this.viewerProtocolPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionDefaultCacheBehaviorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> allowedMethods;
        private @Nullable Input<String> cachePolicyId;
        private @Nullable Input<List<String>> cachedMethods;
        private @Nullable Input<Boolean> compress;
        private @Nullable Input<Double> defaultTTL;
        private @Nullable Input<String> fieldLevelEncryptionId;
        private @Nullable Input<DistributionForwardedValuesArgs> forwardedValues;
        private @Nullable Input<List<DistributionFunctionAssociationArgs>> functionAssociations;
        private @Nullable Input<List<DistributionLambdaFunctionAssociationArgs>> lambdaFunctionAssociations;
        private @Nullable Input<Double> maxTTL;
        private @Nullable Input<Double> minTTL;
        private @Nullable Input<String> originRequestPolicyId;
        private @Nullable Input<String> realtimeLogConfigArn;
        private @Nullable Input<String> responseHeadersPolicyId;
        private @Nullable Input<Boolean> smoothStreaming;
        private Input<String> targetOriginId;
        private @Nullable Input<List<String>> trustedKeyGroups;
        private @Nullable Input<List<String>> trustedSigners;
        private Input<String> viewerProtocolPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionDefaultCacheBehaviorArgs defaults) {
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

        public Builder setAllowedMethods(@Nullable Input<List<String>> allowedMethods) {
            this.allowedMethods = allowedMethods;
            return this;
        }

        public Builder setAllowedMethods(@Nullable List<String> allowedMethods) {
            this.allowedMethods = Input.ofNullable(allowedMethods);
            return this;
        }

        public Builder setCachePolicyId(@Nullable Input<String> cachePolicyId) {
            this.cachePolicyId = cachePolicyId;
            return this;
        }

        public Builder setCachePolicyId(@Nullable String cachePolicyId) {
            this.cachePolicyId = Input.ofNullable(cachePolicyId);
            return this;
        }

        public Builder setCachedMethods(@Nullable Input<List<String>> cachedMethods) {
            this.cachedMethods = cachedMethods;
            return this;
        }

        public Builder setCachedMethods(@Nullable List<String> cachedMethods) {
            this.cachedMethods = Input.ofNullable(cachedMethods);
            return this;
        }

        public Builder setCompress(@Nullable Input<Boolean> compress) {
            this.compress = compress;
            return this;
        }

        public Builder setCompress(@Nullable Boolean compress) {
            this.compress = Input.ofNullable(compress);
            return this;
        }

        public Builder setDefaultTTL(@Nullable Input<Double> defaultTTL) {
            this.defaultTTL = defaultTTL;
            return this;
        }

        public Builder setDefaultTTL(@Nullable Double defaultTTL) {
            this.defaultTTL = Input.ofNullable(defaultTTL);
            return this;
        }

        public Builder setFieldLevelEncryptionId(@Nullable Input<String> fieldLevelEncryptionId) {
            this.fieldLevelEncryptionId = fieldLevelEncryptionId;
            return this;
        }

        public Builder setFieldLevelEncryptionId(@Nullable String fieldLevelEncryptionId) {
            this.fieldLevelEncryptionId = Input.ofNullable(fieldLevelEncryptionId);
            return this;
        }

        public Builder setForwardedValues(@Nullable Input<DistributionForwardedValuesArgs> forwardedValues) {
            this.forwardedValues = forwardedValues;
            return this;
        }

        public Builder setForwardedValues(@Nullable DistributionForwardedValuesArgs forwardedValues) {
            this.forwardedValues = Input.ofNullable(forwardedValues);
            return this;
        }

        public Builder setFunctionAssociations(@Nullable Input<List<DistributionFunctionAssociationArgs>> functionAssociations) {
            this.functionAssociations = functionAssociations;
            return this;
        }

        public Builder setFunctionAssociations(@Nullable List<DistributionFunctionAssociationArgs> functionAssociations) {
            this.functionAssociations = Input.ofNullable(functionAssociations);
            return this;
        }

        public Builder setLambdaFunctionAssociations(@Nullable Input<List<DistributionLambdaFunctionAssociationArgs>> lambdaFunctionAssociations) {
            this.lambdaFunctionAssociations = lambdaFunctionAssociations;
            return this;
        }

        public Builder setLambdaFunctionAssociations(@Nullable List<DistributionLambdaFunctionAssociationArgs> lambdaFunctionAssociations) {
            this.lambdaFunctionAssociations = Input.ofNullable(lambdaFunctionAssociations);
            return this;
        }

        public Builder setMaxTTL(@Nullable Input<Double> maxTTL) {
            this.maxTTL = maxTTL;
            return this;
        }

        public Builder setMaxTTL(@Nullable Double maxTTL) {
            this.maxTTL = Input.ofNullable(maxTTL);
            return this;
        }

        public Builder setMinTTL(@Nullable Input<Double> minTTL) {
            this.minTTL = minTTL;
            return this;
        }

        public Builder setMinTTL(@Nullable Double minTTL) {
            this.minTTL = Input.ofNullable(minTTL);
            return this;
        }

        public Builder setOriginRequestPolicyId(@Nullable Input<String> originRequestPolicyId) {
            this.originRequestPolicyId = originRequestPolicyId;
            return this;
        }

        public Builder setOriginRequestPolicyId(@Nullable String originRequestPolicyId) {
            this.originRequestPolicyId = Input.ofNullable(originRequestPolicyId);
            return this;
        }

        public Builder setRealtimeLogConfigArn(@Nullable Input<String> realtimeLogConfigArn) {
            this.realtimeLogConfigArn = realtimeLogConfigArn;
            return this;
        }

        public Builder setRealtimeLogConfigArn(@Nullable String realtimeLogConfigArn) {
            this.realtimeLogConfigArn = Input.ofNullable(realtimeLogConfigArn);
            return this;
        }

        public Builder setResponseHeadersPolicyId(@Nullable Input<String> responseHeadersPolicyId) {
            this.responseHeadersPolicyId = responseHeadersPolicyId;
            return this;
        }

        public Builder setResponseHeadersPolicyId(@Nullable String responseHeadersPolicyId) {
            this.responseHeadersPolicyId = Input.ofNullable(responseHeadersPolicyId);
            return this;
        }

        public Builder setSmoothStreaming(@Nullable Input<Boolean> smoothStreaming) {
            this.smoothStreaming = smoothStreaming;
            return this;
        }

        public Builder setSmoothStreaming(@Nullable Boolean smoothStreaming) {
            this.smoothStreaming = Input.ofNullable(smoothStreaming);
            return this;
        }

        public Builder setTargetOriginId(Input<String> targetOriginId) {
            this.targetOriginId = Objects.requireNonNull(targetOriginId);
            return this;
        }

        public Builder setTargetOriginId(String targetOriginId) {
            this.targetOriginId = Input.of(Objects.requireNonNull(targetOriginId));
            return this;
        }

        public Builder setTrustedKeyGroups(@Nullable Input<List<String>> trustedKeyGroups) {
            this.trustedKeyGroups = trustedKeyGroups;
            return this;
        }

        public Builder setTrustedKeyGroups(@Nullable List<String> trustedKeyGroups) {
            this.trustedKeyGroups = Input.ofNullable(trustedKeyGroups);
            return this;
        }

        public Builder setTrustedSigners(@Nullable Input<List<String>> trustedSigners) {
            this.trustedSigners = trustedSigners;
            return this;
        }

        public Builder setTrustedSigners(@Nullable List<String> trustedSigners) {
            this.trustedSigners = Input.ofNullable(trustedSigners);
            return this;
        }

        public Builder setViewerProtocolPolicy(Input<String> viewerProtocolPolicy) {
            this.viewerProtocolPolicy = Objects.requireNonNull(viewerProtocolPolicy);
            return this;
        }

        public Builder setViewerProtocolPolicy(String viewerProtocolPolicy) {
            this.viewerProtocolPolicy = Input.of(Objects.requireNonNull(viewerProtocolPolicy));
            return this;
        }

        public DistributionDefaultCacheBehaviorArgs build() {
            return new DistributionDefaultCacheBehaviorArgs(allowedMethods, cachePolicyId, cachedMethods, compress, defaultTTL, fieldLevelEncryptionId, forwardedValues, functionAssociations, lambdaFunctionAssociations, maxTTL, minTTL, originRequestPolicyId, realtimeLogConfigArn, responseHeadersPolicyId, smoothStreaming, targetOriginId, trustedKeyGroups, trustedSigners, viewerProtocolPolicy);
        }
    }
}
