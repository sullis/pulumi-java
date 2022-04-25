// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.DistributionDefaultCacheBehaviorForwardedValues;
import com.pulumi.aws.cloudfront.outputs.DistributionDefaultCacheBehaviorFunctionAssociation;
import com.pulumi.aws.cloudfront.outputs.DistributionDefaultCacheBehaviorLambdaFunctionAssociation;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DistributionDefaultCacheBehavior {
    /**
     * @return Controls which HTTP methods CloudFront
     * processes and forwards to your Amazon S3 bucket or your custom origin.
     * 
     */
    private final List<String> allowedMethods;
    /**
     * @return The unique identifier of the cache policy that
     * is attached to the cache behavior.
     * 
     */
    private final @Nullable String cachePolicyId;
    /**
     * @return Controls whether CloudFront caches the
     * response to requests using the specified HTTP methods.
     * 
     */
    private final List<String> cachedMethods;
    /**
     * @return Whether you want CloudFront to automatically
     * compress content for web requests that include `Accept-Encoding: gzip` in
     * the request header (default: `false`).
     * 
     */
    private final @Nullable Boolean compress;
    /**
     * @return The default amount of time (in seconds) that an
     * object is in a CloudFront cache before CloudFront forwards another request
     * in the absence of an `Cache-Control max-age` or `Expires` header.
     * 
     */
    private final @Nullable Integer defaultTtl;
    /**
     * @return Field level encryption configuration ID
     * 
     */
    private final @Nullable String fieldLevelEncryptionId;
    /**
     * @return The forwarded values configuration that specifies how CloudFront
     * handles query strings, cookies and headers (maximum one).
     * 
     */
    private final @Nullable DistributionDefaultCacheBehaviorForwardedValues forwardedValues;
    /**
     * @return A config block that triggers a cloudfront
     * function with specific actions (maximum 2).
     * 
     */
    private final @Nullable List<DistributionDefaultCacheBehaviorFunctionAssociation> functionAssociations;
    /**
     * @return A config block that triggers a lambda
     * function with specific actions (maximum 4).
     * 
     */
    private final @Nullable List<DistributionDefaultCacheBehaviorLambdaFunctionAssociation> lambdaFunctionAssociations;
    /**
     * @return The maximum amount of time (in seconds) that an
     * object is in a CloudFront cache before CloudFront forwards another request
     * to your origin to determine whether the object has been updated. Only
     * effective in the presence of `Cache-Control max-age`, `Cache-Control
     * s-maxage`, and `Expires` headers.
     * 
     */
    private final @Nullable Integer maxTtl;
    /**
     * @return The minimum amount of time that you want objects to
     * stay in CloudFront caches before CloudFront queries your origin to see
     * whether the object has been updated. Defaults to 0 seconds.
     * 
     */
    private final @Nullable Integer minTtl;
    /**
     * @return The unique identifier of the origin request policy
     * that is attached to the behavior.
     * 
     */
    private final @Nullable String originRequestPolicyId;
    /**
     * @return The ARN of the real-time log configuration
     * that is attached to this cache behavior.
     * 
     */
    private final @Nullable String realtimeLogConfigArn;
    /**
     * @return The identifier for a response headers policy.
     * 
     */
    private final @Nullable String responseHeadersPolicyId;
    /**
     * @return Indicates whether you want to distribute
     * media files in Microsoft Smooth Streaming format using the origin that is
     * associated with this cache behavior.
     * 
     */
    private final @Nullable Boolean smoothStreaming;
    /**
     * @return The value of ID for the origin that you want
     * CloudFront to route requests to when a request matches the path pattern
     * either for a cache behavior or for the default cache behavior.
     * 
     */
    private final String targetOriginId;
    /**
     * @return A list of key group IDs that CloudFront can use to validate signed URLs or signed cookies.
     * See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
     * 
     */
    private final @Nullable List<String> trustedKeyGroups;
    /**
     * @return List of AWS account IDs (or `self`) that you want to allow to create signed URLs for private content.
     * See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
     * 
     */
    private final @Nullable List<String> trustedSigners;
    /**
     * @return Use this element to specify the
     * protocol that users can use to access the files in the origin specified by
     * TargetOriginId when a request matches the path pattern in PathPattern. One
     * of `allow-all`, `https-only`, or `redirect-to-https`.
     * 
     */
    private final String viewerProtocolPolicy;

    @CustomType.Constructor
    private DistributionDefaultCacheBehavior(
        @CustomType.Parameter("allowedMethods") List<String> allowedMethods,
        @CustomType.Parameter("cachePolicyId") @Nullable String cachePolicyId,
        @CustomType.Parameter("cachedMethods") List<String> cachedMethods,
        @CustomType.Parameter("compress") @Nullable Boolean compress,
        @CustomType.Parameter("defaultTtl") @Nullable Integer defaultTtl,
        @CustomType.Parameter("fieldLevelEncryptionId") @Nullable String fieldLevelEncryptionId,
        @CustomType.Parameter("forwardedValues") @Nullable DistributionDefaultCacheBehaviorForwardedValues forwardedValues,
        @CustomType.Parameter("functionAssociations") @Nullable List<DistributionDefaultCacheBehaviorFunctionAssociation> functionAssociations,
        @CustomType.Parameter("lambdaFunctionAssociations") @Nullable List<DistributionDefaultCacheBehaviorLambdaFunctionAssociation> lambdaFunctionAssociations,
        @CustomType.Parameter("maxTtl") @Nullable Integer maxTtl,
        @CustomType.Parameter("minTtl") @Nullable Integer minTtl,
        @CustomType.Parameter("originRequestPolicyId") @Nullable String originRequestPolicyId,
        @CustomType.Parameter("realtimeLogConfigArn") @Nullable String realtimeLogConfigArn,
        @CustomType.Parameter("responseHeadersPolicyId") @Nullable String responseHeadersPolicyId,
        @CustomType.Parameter("smoothStreaming") @Nullable Boolean smoothStreaming,
        @CustomType.Parameter("targetOriginId") String targetOriginId,
        @CustomType.Parameter("trustedKeyGroups") @Nullable List<String> trustedKeyGroups,
        @CustomType.Parameter("trustedSigners") @Nullable List<String> trustedSigners,
        @CustomType.Parameter("viewerProtocolPolicy") String viewerProtocolPolicy) {
        this.allowedMethods = allowedMethods;
        this.cachePolicyId = cachePolicyId;
        this.cachedMethods = cachedMethods;
        this.compress = compress;
        this.defaultTtl = defaultTtl;
        this.fieldLevelEncryptionId = fieldLevelEncryptionId;
        this.forwardedValues = forwardedValues;
        this.functionAssociations = functionAssociations;
        this.lambdaFunctionAssociations = lambdaFunctionAssociations;
        this.maxTtl = maxTtl;
        this.minTtl = minTtl;
        this.originRequestPolicyId = originRequestPolicyId;
        this.realtimeLogConfigArn = realtimeLogConfigArn;
        this.responseHeadersPolicyId = responseHeadersPolicyId;
        this.smoothStreaming = smoothStreaming;
        this.targetOriginId = targetOriginId;
        this.trustedKeyGroups = trustedKeyGroups;
        this.trustedSigners = trustedSigners;
        this.viewerProtocolPolicy = viewerProtocolPolicy;
    }

    /**
     * @return Controls which HTTP methods CloudFront
     * processes and forwards to your Amazon S3 bucket or your custom origin.
     * 
     */
    public List<String> allowedMethods() {
        return this.allowedMethods;
    }
    /**
     * @return The unique identifier of the cache policy that
     * is attached to the cache behavior.
     * 
     */
    public Optional<String> cachePolicyId() {
        return Optional.ofNullable(this.cachePolicyId);
    }
    /**
     * @return Controls whether CloudFront caches the
     * response to requests using the specified HTTP methods.
     * 
     */
    public List<String> cachedMethods() {
        return this.cachedMethods;
    }
    /**
     * @return Whether you want CloudFront to automatically
     * compress content for web requests that include `Accept-Encoding: gzip` in
     * the request header (default: `false`).
     * 
     */
    public Optional<Boolean> compress() {
        return Optional.ofNullable(this.compress);
    }
    /**
     * @return The default amount of time (in seconds) that an
     * object is in a CloudFront cache before CloudFront forwards another request
     * in the absence of an `Cache-Control max-age` or `Expires` header.
     * 
     */
    public Optional<Integer> defaultTtl() {
        return Optional.ofNullable(this.defaultTtl);
    }
    /**
     * @return Field level encryption configuration ID
     * 
     */
    public Optional<String> fieldLevelEncryptionId() {
        return Optional.ofNullable(this.fieldLevelEncryptionId);
    }
    /**
     * @return The forwarded values configuration that specifies how CloudFront
     * handles query strings, cookies and headers (maximum one).
     * 
     */
    public Optional<DistributionDefaultCacheBehaviorForwardedValues> forwardedValues() {
        return Optional.ofNullable(this.forwardedValues);
    }
    /**
     * @return A config block that triggers a cloudfront
     * function with specific actions (maximum 2).
     * 
     */
    public List<DistributionDefaultCacheBehaviorFunctionAssociation> functionAssociations() {
        return this.functionAssociations == null ? List.of() : this.functionAssociations;
    }
    /**
     * @return A config block that triggers a lambda
     * function with specific actions (maximum 4).
     * 
     */
    public List<DistributionDefaultCacheBehaviorLambdaFunctionAssociation> lambdaFunctionAssociations() {
        return this.lambdaFunctionAssociations == null ? List.of() : this.lambdaFunctionAssociations;
    }
    /**
     * @return The maximum amount of time (in seconds) that an
     * object is in a CloudFront cache before CloudFront forwards another request
     * to your origin to determine whether the object has been updated. Only
     * effective in the presence of `Cache-Control max-age`, `Cache-Control
     * s-maxage`, and `Expires` headers.
     * 
     */
    public Optional<Integer> maxTtl() {
        return Optional.ofNullable(this.maxTtl);
    }
    /**
     * @return The minimum amount of time that you want objects to
     * stay in CloudFront caches before CloudFront queries your origin to see
     * whether the object has been updated. Defaults to 0 seconds.
     * 
     */
    public Optional<Integer> minTtl() {
        return Optional.ofNullable(this.minTtl);
    }
    /**
     * @return The unique identifier of the origin request policy
     * that is attached to the behavior.
     * 
     */
    public Optional<String> originRequestPolicyId() {
        return Optional.ofNullable(this.originRequestPolicyId);
    }
    /**
     * @return The ARN of the real-time log configuration
     * that is attached to this cache behavior.
     * 
     */
    public Optional<String> realtimeLogConfigArn() {
        return Optional.ofNullable(this.realtimeLogConfigArn);
    }
    /**
     * @return The identifier for a response headers policy.
     * 
     */
    public Optional<String> responseHeadersPolicyId() {
        return Optional.ofNullable(this.responseHeadersPolicyId);
    }
    /**
     * @return Indicates whether you want to distribute
     * media files in Microsoft Smooth Streaming format using the origin that is
     * associated with this cache behavior.
     * 
     */
    public Optional<Boolean> smoothStreaming() {
        return Optional.ofNullable(this.smoothStreaming);
    }
    /**
     * @return The value of ID for the origin that you want
     * CloudFront to route requests to when a request matches the path pattern
     * either for a cache behavior or for the default cache behavior.
     * 
     */
    public String targetOriginId() {
        return this.targetOriginId;
    }
    /**
     * @return A list of key group IDs that CloudFront can use to validate signed URLs or signed cookies.
     * See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
     * 
     */
    public List<String> trustedKeyGroups() {
        return this.trustedKeyGroups == null ? List.of() : this.trustedKeyGroups;
    }
    /**
     * @return List of AWS account IDs (or `self`) that you want to allow to create signed URLs for private content.
     * See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
     * 
     */
    public List<String> trustedSigners() {
        return this.trustedSigners == null ? List.of() : this.trustedSigners;
    }
    /**
     * @return Use this element to specify the
     * protocol that users can use to access the files in the origin specified by
     * TargetOriginId when a request matches the path pattern in PathPattern. One
     * of `allow-all`, `https-only`, or `redirect-to-https`.
     * 
     */
    public String viewerProtocolPolicy() {
        return this.viewerProtocolPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionDefaultCacheBehavior defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedMethods;
        private @Nullable String cachePolicyId;
        private List<String> cachedMethods;
        private @Nullable Boolean compress;
        private @Nullable Integer defaultTtl;
        private @Nullable String fieldLevelEncryptionId;
        private @Nullable DistributionDefaultCacheBehaviorForwardedValues forwardedValues;
        private @Nullable List<DistributionDefaultCacheBehaviorFunctionAssociation> functionAssociations;
        private @Nullable List<DistributionDefaultCacheBehaviorLambdaFunctionAssociation> lambdaFunctionAssociations;
        private @Nullable Integer maxTtl;
        private @Nullable Integer minTtl;
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
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.fieldLevelEncryptionId = defaults.fieldLevelEncryptionId;
    	      this.forwardedValues = defaults.forwardedValues;
    	      this.functionAssociations = defaults.functionAssociations;
    	      this.lambdaFunctionAssociations = defaults.lambdaFunctionAssociations;
    	      this.maxTtl = defaults.maxTtl;
    	      this.minTtl = defaults.minTtl;
    	      this.originRequestPolicyId = defaults.originRequestPolicyId;
    	      this.realtimeLogConfigArn = defaults.realtimeLogConfigArn;
    	      this.responseHeadersPolicyId = defaults.responseHeadersPolicyId;
    	      this.smoothStreaming = defaults.smoothStreaming;
    	      this.targetOriginId = defaults.targetOriginId;
    	      this.trustedKeyGroups = defaults.trustedKeyGroups;
    	      this.trustedSigners = defaults.trustedSigners;
    	      this.viewerProtocolPolicy = defaults.viewerProtocolPolicy;
        }

        public Builder allowedMethods(List<String> allowedMethods) {
            this.allowedMethods = Objects.requireNonNull(allowedMethods);
            return this;
        }
        public Builder allowedMethods(String... allowedMethods) {
            return allowedMethods(List.of(allowedMethods));
        }
        public Builder cachePolicyId(@Nullable String cachePolicyId) {
            this.cachePolicyId = cachePolicyId;
            return this;
        }
        public Builder cachedMethods(List<String> cachedMethods) {
            this.cachedMethods = Objects.requireNonNull(cachedMethods);
            return this;
        }
        public Builder cachedMethods(String... cachedMethods) {
            return cachedMethods(List.of(cachedMethods));
        }
        public Builder compress(@Nullable Boolean compress) {
            this.compress = compress;
            return this;
        }
        public Builder defaultTtl(@Nullable Integer defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }
        public Builder fieldLevelEncryptionId(@Nullable String fieldLevelEncryptionId) {
            this.fieldLevelEncryptionId = fieldLevelEncryptionId;
            return this;
        }
        public Builder forwardedValues(@Nullable DistributionDefaultCacheBehaviorForwardedValues forwardedValues) {
            this.forwardedValues = forwardedValues;
            return this;
        }
        public Builder functionAssociations(@Nullable List<DistributionDefaultCacheBehaviorFunctionAssociation> functionAssociations) {
            this.functionAssociations = functionAssociations;
            return this;
        }
        public Builder functionAssociations(DistributionDefaultCacheBehaviorFunctionAssociation... functionAssociations) {
            return functionAssociations(List.of(functionAssociations));
        }
        public Builder lambdaFunctionAssociations(@Nullable List<DistributionDefaultCacheBehaviorLambdaFunctionAssociation> lambdaFunctionAssociations) {
            this.lambdaFunctionAssociations = lambdaFunctionAssociations;
            return this;
        }
        public Builder lambdaFunctionAssociations(DistributionDefaultCacheBehaviorLambdaFunctionAssociation... lambdaFunctionAssociations) {
            return lambdaFunctionAssociations(List.of(lambdaFunctionAssociations));
        }
        public Builder maxTtl(@Nullable Integer maxTtl) {
            this.maxTtl = maxTtl;
            return this;
        }
        public Builder minTtl(@Nullable Integer minTtl) {
            this.minTtl = minTtl;
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
            return new DistributionDefaultCacheBehavior(allowedMethods, cachePolicyId, cachedMethods, compress, defaultTtl, fieldLevelEncryptionId, forwardedValues, functionAssociations, lambdaFunctionAssociations, maxTtl, minTtl, originRequestPolicyId, realtimeLogConfigArn, responseHeadersPolicyId, smoothStreaming, targetOriginId, trustedKeyGroups, trustedSigners, viewerProtocolPolicy);
        }
    }
}
