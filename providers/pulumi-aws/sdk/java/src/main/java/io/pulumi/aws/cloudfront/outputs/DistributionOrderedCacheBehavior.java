// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.DistributionOrderedCacheBehaviorForwardedValues;
import io.pulumi.aws.cloudfront.outputs.DistributionOrderedCacheBehaviorFunctionAssociation;
import io.pulumi.aws.cloudfront.outputs.DistributionOrderedCacheBehaviorLambdaFunctionAssociation;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionOrderedCacheBehavior {
    /**
     * Controls which HTTP methods CloudFront
     * processes and forwards to your Amazon S3 bucket or your custom origin.
     * 
     */
    private final List<String> allowedMethods;
    /**
     * The unique identifier of the cache policy that
     * is attached to the cache behavior.
     * 
     */
    private final @Nullable String cachePolicyId;
    /**
     * Controls whether CloudFront caches the
     * response to requests using the specified HTTP methods.
     * 
     */
    private final List<String> cachedMethods;
    /**
     * Whether you want CloudFront to automatically
     * compress content for web requests that include `Accept-Encoding: gzip` in
     * the request header (default: `false`).
     * 
     */
    private final @Nullable Boolean compress;
    /**
     * The default amount of time (in seconds) that an
     * object is in a CloudFront cache before CloudFront forwards another request
     * in the absence of an `Cache-Control max-age` or `Expires` header.
     * 
     */
    private final @Nullable Integer defaultTtl;
    /**
     * Field level encryption configuration ID
     * 
     */
    private final @Nullable String fieldLevelEncryptionId;
    /**
     * The forwarded values configuration that specifies how CloudFront
     * handles query strings, cookies and headers (maximum one).
     * 
     */
    private final @Nullable DistributionOrderedCacheBehaviorForwardedValues forwardedValues;
    /**
     * A config block that triggers a cloudfront
     * function with specific actions (maximum 2).
     * 
     */
    private final @Nullable List<DistributionOrderedCacheBehaviorFunctionAssociation> functionAssociations;
    /**
     * A config block that triggers a lambda
     * function with specific actions (maximum 4).
     * 
     */
    private final @Nullable List<DistributionOrderedCacheBehaviorLambdaFunctionAssociation> lambdaFunctionAssociations;
    /**
     * The maximum amount of time (in seconds) that an
     * object is in a CloudFront cache before CloudFront forwards another request
     * to your origin to determine whether the object has been updated. Only
     * effective in the presence of `Cache-Control max-age`, `Cache-Control
     * s-maxage`, and `Expires` headers.
     * 
     */
    private final @Nullable Integer maxTtl;
    /**
     * The minimum amount of time that you want objects to
     * stay in CloudFront caches before CloudFront queries your origin to see
     * whether the object has been updated. Defaults to 0 seconds.
     * 
     */
    private final @Nullable Integer minTtl;
    /**
     * The unique identifier of the origin request policy
     * that is attached to the behavior.
     * 
     */
    private final @Nullable String originRequestPolicyId;
    /**
     * The pattern (for example, `images/*.jpg`) that
     * specifies which requests you want this cache behavior to apply to.
     * 
     */
    private final String pathPattern;
    /**
     * The ARN of the real-time log configuration
     * that is attached to this cache behavior.
     * 
     */
    private final @Nullable String realtimeLogConfigArn;
    /**
     * The identifier for a response headers policy.
     * 
     */
    private final @Nullable String responseHeadersPolicyId;
    /**
     * Indicates whether you want to distribute
     * media files in Microsoft Smooth Streaming format using the origin that is
     * associated with this cache behavior.
     * 
     */
    private final @Nullable Boolean smoothStreaming;
    /**
     * The value of ID for the origin that you want
     * CloudFront to route requests to when a request matches the path pattern
     * either for a cache behavior or for the default cache behavior.
     * 
     */
    private final String targetOriginId;
    /**
     * A list of key group IDs that CloudFront can use to validate signed URLs or signed cookies.
     * See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
     * 
     */
    private final @Nullable List<String> trustedKeyGroups;
    /**
     * List of AWS account IDs (or `self`) that you want to allow to create signed URLs for private content.
     * See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
     * 
     */
    private final @Nullable List<String> trustedSigners;
    /**
     * Use this element to specify the
     * protocol that users can use to access the files in the origin specified by
     * TargetOriginId when a request matches the path pattern in PathPattern. One
     * of `allow-all`, `https-only`, or `redirect-to-https`.
     * 
     */
    private final String viewerProtocolPolicy;

    @OutputCustomType.Constructor({"allowedMethods","cachePolicyId","cachedMethods","compress","defaultTtl","fieldLevelEncryptionId","forwardedValues","functionAssociations","lambdaFunctionAssociations","maxTtl","minTtl","originRequestPolicyId","pathPattern","realtimeLogConfigArn","responseHeadersPolicyId","smoothStreaming","targetOriginId","trustedKeyGroups","trustedSigners","viewerProtocolPolicy"})
    private DistributionOrderedCacheBehavior(
        List<String> allowedMethods,
        @Nullable String cachePolicyId,
        List<String> cachedMethods,
        @Nullable Boolean compress,
        @Nullable Integer defaultTtl,
        @Nullable String fieldLevelEncryptionId,
        @Nullable DistributionOrderedCacheBehaviorForwardedValues forwardedValues,
        @Nullable List<DistributionOrderedCacheBehaviorFunctionAssociation> functionAssociations,
        @Nullable List<DistributionOrderedCacheBehaviorLambdaFunctionAssociation> lambdaFunctionAssociations,
        @Nullable Integer maxTtl,
        @Nullable Integer minTtl,
        @Nullable String originRequestPolicyId,
        String pathPattern,
        @Nullable String realtimeLogConfigArn,
        @Nullable String responseHeadersPolicyId,
        @Nullable Boolean smoothStreaming,
        String targetOriginId,
        @Nullable List<String> trustedKeyGroups,
        @Nullable List<String> trustedSigners,
        String viewerProtocolPolicy) {
        this.allowedMethods = Objects.requireNonNull(allowedMethods);
        this.cachePolicyId = cachePolicyId;
        this.cachedMethods = Objects.requireNonNull(cachedMethods);
        this.compress = compress;
        this.defaultTtl = defaultTtl;
        this.fieldLevelEncryptionId = fieldLevelEncryptionId;
        this.forwardedValues = forwardedValues;
        this.functionAssociations = functionAssociations;
        this.lambdaFunctionAssociations = lambdaFunctionAssociations;
        this.maxTtl = maxTtl;
        this.minTtl = minTtl;
        this.originRequestPolicyId = originRequestPolicyId;
        this.pathPattern = Objects.requireNonNull(pathPattern);
        this.realtimeLogConfigArn = realtimeLogConfigArn;
        this.responseHeadersPolicyId = responseHeadersPolicyId;
        this.smoothStreaming = smoothStreaming;
        this.targetOriginId = Objects.requireNonNull(targetOriginId);
        this.trustedKeyGroups = trustedKeyGroups;
        this.trustedSigners = trustedSigners;
        this.viewerProtocolPolicy = Objects.requireNonNull(viewerProtocolPolicy);
    }

    /**
     * Controls which HTTP methods CloudFront
     * processes and forwards to your Amazon S3 bucket or your custom origin.
     * 
    */
    public List<String> getAllowedMethods() {
        return this.allowedMethods;
    }
    /**
     * The unique identifier of the cache policy that
     * is attached to the cache behavior.
     * 
    */
    public Optional<String> getCachePolicyId() {
        return Optional.ofNullable(this.cachePolicyId);
    }
    /**
     * Controls whether CloudFront caches the
     * response to requests using the specified HTTP methods.
     * 
    */
    public List<String> getCachedMethods() {
        return this.cachedMethods;
    }
    /**
     * Whether you want CloudFront to automatically
     * compress content for web requests that include `Accept-Encoding: gzip` in
     * the request header (default: `false`).
     * 
    */
    public Optional<Boolean> getCompress() {
        return Optional.ofNullable(this.compress);
    }
    /**
     * The default amount of time (in seconds) that an
     * object is in a CloudFront cache before CloudFront forwards another request
     * in the absence of an `Cache-Control max-age` or `Expires` header.
     * 
    */
    public Optional<Integer> getDefaultTtl() {
        return Optional.ofNullable(this.defaultTtl);
    }
    /**
     * Field level encryption configuration ID
     * 
    */
    public Optional<String> getFieldLevelEncryptionId() {
        return Optional.ofNullable(this.fieldLevelEncryptionId);
    }
    /**
     * The forwarded values configuration that specifies how CloudFront
     * handles query strings, cookies and headers (maximum one).
     * 
    */
    public Optional<DistributionOrderedCacheBehaviorForwardedValues> getForwardedValues() {
        return Optional.ofNullable(this.forwardedValues);
    }
    /**
     * A config block that triggers a cloudfront
     * function with specific actions (maximum 2).
     * 
    */
    public List<DistributionOrderedCacheBehaviorFunctionAssociation> getFunctionAssociations() {
        return this.functionAssociations == null ? List.of() : this.functionAssociations;
    }
    /**
     * A config block that triggers a lambda
     * function with specific actions (maximum 4).
     * 
    */
    public List<DistributionOrderedCacheBehaviorLambdaFunctionAssociation> getLambdaFunctionAssociations() {
        return this.lambdaFunctionAssociations == null ? List.of() : this.lambdaFunctionAssociations;
    }
    /**
     * The maximum amount of time (in seconds) that an
     * object is in a CloudFront cache before CloudFront forwards another request
     * to your origin to determine whether the object has been updated. Only
     * effective in the presence of `Cache-Control max-age`, `Cache-Control
     * s-maxage`, and `Expires` headers.
     * 
    */
    public Optional<Integer> getMaxTtl() {
        return Optional.ofNullable(this.maxTtl);
    }
    /**
     * The minimum amount of time that you want objects to
     * stay in CloudFront caches before CloudFront queries your origin to see
     * whether the object has been updated. Defaults to 0 seconds.
     * 
    */
    public Optional<Integer> getMinTtl() {
        return Optional.ofNullable(this.minTtl);
    }
    /**
     * The unique identifier of the origin request policy
     * that is attached to the behavior.
     * 
    */
    public Optional<String> getOriginRequestPolicyId() {
        return Optional.ofNullable(this.originRequestPolicyId);
    }
    /**
     * The pattern (for example, `images/*.jpg`) that
     * specifies which requests you want this cache behavior to apply to.
     * 
    */
    public String getPathPattern() {
        return this.pathPattern;
    }
    /**
     * The ARN of the real-time log configuration
     * that is attached to this cache behavior.
     * 
    */
    public Optional<String> getRealtimeLogConfigArn() {
        return Optional.ofNullable(this.realtimeLogConfigArn);
    }
    /**
     * The identifier for a response headers policy.
     * 
    */
    public Optional<String> getResponseHeadersPolicyId() {
        return Optional.ofNullable(this.responseHeadersPolicyId);
    }
    /**
     * Indicates whether you want to distribute
     * media files in Microsoft Smooth Streaming format using the origin that is
     * associated with this cache behavior.
     * 
    */
    public Optional<Boolean> getSmoothStreaming() {
        return Optional.ofNullable(this.smoothStreaming);
    }
    /**
     * The value of ID for the origin that you want
     * CloudFront to route requests to when a request matches the path pattern
     * either for a cache behavior or for the default cache behavior.
     * 
    */
    public String getTargetOriginId() {
        return this.targetOriginId;
    }
    /**
     * A list of key group IDs that CloudFront can use to validate signed URLs or signed cookies.
     * See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
     * 
    */
    public List<String> getTrustedKeyGroups() {
        return this.trustedKeyGroups == null ? List.of() : this.trustedKeyGroups;
    }
    /**
     * List of AWS account IDs (or `self`) that you want to allow to create signed URLs for private content.
     * See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
     * 
    */
    public List<String> getTrustedSigners() {
        return this.trustedSigners == null ? List.of() : this.trustedSigners;
    }
    /**
     * Use this element to specify the
     * protocol that users can use to access the files in the origin specified by
     * TargetOriginId when a request matches the path pattern in PathPattern. One
     * of `allow-all`, `https-only`, or `redirect-to-https`.
     * 
    */
    public String getViewerProtocolPolicy() {
        return this.viewerProtocolPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOrderedCacheBehavior defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedMethods;
        private @Nullable String cachePolicyId;
        private List<String> cachedMethods;
        private @Nullable Boolean compress;
        private @Nullable Integer defaultTtl;
        private @Nullable String fieldLevelEncryptionId;
        private @Nullable DistributionOrderedCacheBehaviorForwardedValues forwardedValues;
        private @Nullable List<DistributionOrderedCacheBehaviorFunctionAssociation> functionAssociations;
        private @Nullable List<DistributionOrderedCacheBehaviorLambdaFunctionAssociation> lambdaFunctionAssociations;
        private @Nullable Integer maxTtl;
        private @Nullable Integer minTtl;
        private @Nullable String originRequestPolicyId;
        private String pathPattern;
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

        public Builder(DistributionOrderedCacheBehavior defaults) {
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
    	      this.pathPattern = defaults.pathPattern;
    	      this.realtimeLogConfigArn = defaults.realtimeLogConfigArn;
    	      this.responseHeadersPolicyId = defaults.responseHeadersPolicyId;
    	      this.smoothStreaming = defaults.smoothStreaming;
    	      this.targetOriginId = defaults.targetOriginId;
    	      this.trustedKeyGroups = defaults.trustedKeyGroups;
    	      this.trustedSigners = defaults.trustedSigners;
    	      this.viewerProtocolPolicy = defaults.viewerProtocolPolicy;
        }

        public Builder setAllowedMethods(List<String> allowedMethods) {
            this.allowedMethods = Objects.requireNonNull(allowedMethods);
            return this;
        }

        public Builder setCachePolicyId(@Nullable String cachePolicyId) {
            this.cachePolicyId = cachePolicyId;
            return this;
        }

        public Builder setCachedMethods(List<String> cachedMethods) {
            this.cachedMethods = Objects.requireNonNull(cachedMethods);
            return this;
        }

        public Builder setCompress(@Nullable Boolean compress) {
            this.compress = compress;
            return this;
        }

        public Builder setDefaultTtl(@Nullable Integer defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }

        public Builder setFieldLevelEncryptionId(@Nullable String fieldLevelEncryptionId) {
            this.fieldLevelEncryptionId = fieldLevelEncryptionId;
            return this;
        }

        public Builder setForwardedValues(@Nullable DistributionOrderedCacheBehaviorForwardedValues forwardedValues) {
            this.forwardedValues = forwardedValues;
            return this;
        }

        public Builder setFunctionAssociations(@Nullable List<DistributionOrderedCacheBehaviorFunctionAssociation> functionAssociations) {
            this.functionAssociations = functionAssociations;
            return this;
        }

        public Builder setLambdaFunctionAssociations(@Nullable List<DistributionOrderedCacheBehaviorLambdaFunctionAssociation> lambdaFunctionAssociations) {
            this.lambdaFunctionAssociations = lambdaFunctionAssociations;
            return this;
        }

        public Builder setMaxTtl(@Nullable Integer maxTtl) {
            this.maxTtl = maxTtl;
            return this;
        }

        public Builder setMinTtl(@Nullable Integer minTtl) {
            this.minTtl = minTtl;
            return this;
        }

        public Builder setOriginRequestPolicyId(@Nullable String originRequestPolicyId) {
            this.originRequestPolicyId = originRequestPolicyId;
            return this;
        }

        public Builder setPathPattern(String pathPattern) {
            this.pathPattern = Objects.requireNonNull(pathPattern);
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
        public DistributionOrderedCacheBehavior build() {
            return new DistributionOrderedCacheBehavior(allowedMethods, cachePolicyId, cachedMethods, compress, defaultTtl, fieldLevelEncryptionId, forwardedValues, functionAssociations, lambdaFunctionAssociations, maxTtl, minTtl, originRequestPolicyId, pathPattern, realtimeLogConfigArn, responseHeadersPolicyId, smoothStreaming, targetOriginId, trustedKeyGroups, trustedSigners, viewerProtocolPolicy);
        }
    }
}