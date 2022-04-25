// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionBackendServiceCdnPolicyCacheKeyPolicyGetArgs;
import com.pulumi.gcp.compute.inputs.RegionBackendServiceCdnPolicyNegativeCachingPolicyGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionBackendServiceCdnPolicyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionBackendServiceCdnPolicyGetArgs Empty = new RegionBackendServiceCdnPolicyGetArgs();

    /**
     * The CacheKeyPolicy for this CdnPolicy.
     * Structure is documented below.
     * 
     */
    @Import(name="cacheKeyPolicy")
    private @Nullable Output<RegionBackendServiceCdnPolicyCacheKeyPolicyGetArgs> cacheKeyPolicy;

    /**
     * @return The CacheKeyPolicy for this CdnPolicy.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionBackendServiceCdnPolicyCacheKeyPolicyGetArgs>> cacheKeyPolicy() {
        return Optional.ofNullable(this.cacheKeyPolicy);
    }

    /**
     * Specifies the cache setting for all responses from this backend.
     * The possible values are: USE_ORIGIN_HEADERS, FORCE_CACHE_ALL and CACHE_ALL_STATIC
     * Possible values are `USE_ORIGIN_HEADERS`, `FORCE_CACHE_ALL`, and `CACHE_ALL_STATIC`.
     * 
     */
    @Import(name="cacheMode")
    private @Nullable Output<String> cacheMode;

    /**
     * @return Specifies the cache setting for all responses from this backend.
     * The possible values are: USE_ORIGIN_HEADERS, FORCE_CACHE_ALL and CACHE_ALL_STATIC
     * Possible values are `USE_ORIGIN_HEADERS`, `FORCE_CACHE_ALL`, and `CACHE_ALL_STATIC`.
     * 
     */
    public Optional<Output<String>> cacheMode() {
        return Optional.ofNullable(this.cacheMode);
    }

    /**
     * Specifies the maximum allowed TTL for cached content served by this origin.
     * 
     */
    @Import(name="clientTtl")
    private @Nullable Output<Integer> clientTtl;

    /**
     * @return Specifies the maximum allowed TTL for cached content served by this origin.
     * 
     */
    public Optional<Output<Integer>> clientTtl() {
        return Optional.ofNullable(this.clientTtl);
    }

    /**
     * Specifies the default TTL for cached content served by this origin for responses
     * that do not have an existing valid TTL (max-age or s-max-age).
     * 
     */
    @Import(name="defaultTtl")
    private @Nullable Output<Integer> defaultTtl;

    /**
     * @return Specifies the default TTL for cached content served by this origin for responses
     * that do not have an existing valid TTL (max-age or s-max-age).
     * 
     */
    public Optional<Output<Integer>> defaultTtl() {
        return Optional.ofNullable(this.defaultTtl);
    }

    /**
     * Specifies the maximum allowed TTL for cached content served by this origin.
     * 
     */
    @Import(name="maxTtl")
    private @Nullable Output<Integer> maxTtl;

    /**
     * @return Specifies the maximum allowed TTL for cached content served by this origin.
     * 
     */
    public Optional<Output<Integer>> maxTtl() {
        return Optional.ofNullable(this.maxTtl);
    }

    /**
     * Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects.
     * 
     */
    @Import(name="negativeCaching")
    private @Nullable Output<Boolean> negativeCaching;

    /**
     * @return Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects.
     * 
     */
    public Optional<Output<Boolean>> negativeCaching() {
        return Optional.ofNullable(this.negativeCaching);
    }

    /**
     * Sets a cache TTL for the specified HTTP status code. negativeCaching must be enabled to configure negativeCachingPolicy.
     * Omitting the policy and leaving negativeCaching enabled will use Cloud CDN&#39;s default cache TTLs.
     * Structure is documented below.
     * 
     */
    @Import(name="negativeCachingPolicies")
    private @Nullable Output<List<RegionBackendServiceCdnPolicyNegativeCachingPolicyGetArgs>> negativeCachingPolicies;

    /**
     * @return Sets a cache TTL for the specified HTTP status code. negativeCaching must be enabled to configure negativeCachingPolicy.
     * Omitting the policy and leaving negativeCaching enabled will use Cloud CDN&#39;s default cache TTLs.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<RegionBackendServiceCdnPolicyNegativeCachingPolicyGetArgs>>> negativeCachingPolicies() {
        return Optional.ofNullable(this.negativeCachingPolicies);
    }

    /**
     * Serve existing content from the cache (if available) when revalidating content with the origin, or when an error is encountered when refreshing the cache.
     * 
     */
    @Import(name="serveWhileStale")
    private @Nullable Output<Integer> serveWhileStale;

    /**
     * @return Serve existing content from the cache (if available) when revalidating content with the origin, or when an error is encountered when refreshing the cache.
     * 
     */
    public Optional<Output<Integer>> serveWhileStale() {
        return Optional.ofNullable(this.serveWhileStale);
    }

    /**
     * Maximum number of seconds the response to a signed URL request
     * will be considered fresh, defaults to 1hr (3600s). After this
     * time period, the response will be revalidated before
     * being served.
     * When serving responses to signed URL requests, Cloud CDN will
     * internally behave as though all responses from this backend had a
     * &#34;Cache-Control: public, max-age=[TTL]&#34; header, regardless of any
     * existing Cache-Control header. The actual headers served in
     * responses will not be altered.
     * 
     */
    @Import(name="signedUrlCacheMaxAgeSec")
    private @Nullable Output<Integer> signedUrlCacheMaxAgeSec;

    /**
     * @return Maximum number of seconds the response to a signed URL request
     * will be considered fresh, defaults to 1hr (3600s). After this
     * time period, the response will be revalidated before
     * being served.
     * When serving responses to signed URL requests, Cloud CDN will
     * internally behave as though all responses from this backend had a
     * &#34;Cache-Control: public, max-age=[TTL]&#34; header, regardless of any
     * existing Cache-Control header. The actual headers served in
     * responses will not be altered.
     * 
     */
    public Optional<Output<Integer>> signedUrlCacheMaxAgeSec() {
        return Optional.ofNullable(this.signedUrlCacheMaxAgeSec);
    }

    private RegionBackendServiceCdnPolicyGetArgs() {}

    private RegionBackendServiceCdnPolicyGetArgs(RegionBackendServiceCdnPolicyGetArgs $) {
        this.cacheKeyPolicy = $.cacheKeyPolicy;
        this.cacheMode = $.cacheMode;
        this.clientTtl = $.clientTtl;
        this.defaultTtl = $.defaultTtl;
        this.maxTtl = $.maxTtl;
        this.negativeCaching = $.negativeCaching;
        this.negativeCachingPolicies = $.negativeCachingPolicies;
        this.serveWhileStale = $.serveWhileStale;
        this.signedUrlCacheMaxAgeSec = $.signedUrlCacheMaxAgeSec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionBackendServiceCdnPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionBackendServiceCdnPolicyGetArgs $;

        public Builder() {
            $ = new RegionBackendServiceCdnPolicyGetArgs();
        }

        public Builder(RegionBackendServiceCdnPolicyGetArgs defaults) {
            $ = new RegionBackendServiceCdnPolicyGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cacheKeyPolicy The CacheKeyPolicy for this CdnPolicy.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cacheKeyPolicy(@Nullable Output<RegionBackendServiceCdnPolicyCacheKeyPolicyGetArgs> cacheKeyPolicy) {
            $.cacheKeyPolicy = cacheKeyPolicy;
            return this;
        }

        /**
         * @param cacheKeyPolicy The CacheKeyPolicy for this CdnPolicy.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cacheKeyPolicy(RegionBackendServiceCdnPolicyCacheKeyPolicyGetArgs cacheKeyPolicy) {
            return cacheKeyPolicy(Output.of(cacheKeyPolicy));
        }

        /**
         * @param cacheMode Specifies the cache setting for all responses from this backend.
         * The possible values are: USE_ORIGIN_HEADERS, FORCE_CACHE_ALL and CACHE_ALL_STATIC
         * Possible values are `USE_ORIGIN_HEADERS`, `FORCE_CACHE_ALL`, and `CACHE_ALL_STATIC`.
         * 
         * @return builder
         * 
         */
        public Builder cacheMode(@Nullable Output<String> cacheMode) {
            $.cacheMode = cacheMode;
            return this;
        }

        /**
         * @param cacheMode Specifies the cache setting for all responses from this backend.
         * The possible values are: USE_ORIGIN_HEADERS, FORCE_CACHE_ALL and CACHE_ALL_STATIC
         * Possible values are `USE_ORIGIN_HEADERS`, `FORCE_CACHE_ALL`, and `CACHE_ALL_STATIC`.
         * 
         * @return builder
         * 
         */
        public Builder cacheMode(String cacheMode) {
            return cacheMode(Output.of(cacheMode));
        }

        /**
         * @param clientTtl Specifies the maximum allowed TTL for cached content served by this origin.
         * 
         * @return builder
         * 
         */
        public Builder clientTtl(@Nullable Output<Integer> clientTtl) {
            $.clientTtl = clientTtl;
            return this;
        }

        /**
         * @param clientTtl Specifies the maximum allowed TTL for cached content served by this origin.
         * 
         * @return builder
         * 
         */
        public Builder clientTtl(Integer clientTtl) {
            return clientTtl(Output.of(clientTtl));
        }

        /**
         * @param defaultTtl Specifies the default TTL for cached content served by this origin for responses
         * that do not have an existing valid TTL (max-age or s-max-age).
         * 
         * @return builder
         * 
         */
        public Builder defaultTtl(@Nullable Output<Integer> defaultTtl) {
            $.defaultTtl = defaultTtl;
            return this;
        }

        /**
         * @param defaultTtl Specifies the default TTL for cached content served by this origin for responses
         * that do not have an existing valid TTL (max-age or s-max-age).
         * 
         * @return builder
         * 
         */
        public Builder defaultTtl(Integer defaultTtl) {
            return defaultTtl(Output.of(defaultTtl));
        }

        /**
         * @param maxTtl Specifies the maximum allowed TTL for cached content served by this origin.
         * 
         * @return builder
         * 
         */
        public Builder maxTtl(@Nullable Output<Integer> maxTtl) {
            $.maxTtl = maxTtl;
            return this;
        }

        /**
         * @param maxTtl Specifies the maximum allowed TTL for cached content served by this origin.
         * 
         * @return builder
         * 
         */
        public Builder maxTtl(Integer maxTtl) {
            return maxTtl(Output.of(maxTtl));
        }

        /**
         * @param negativeCaching Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects.
         * 
         * @return builder
         * 
         */
        public Builder negativeCaching(@Nullable Output<Boolean> negativeCaching) {
            $.negativeCaching = negativeCaching;
            return this;
        }

        /**
         * @param negativeCaching Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects.
         * 
         * @return builder
         * 
         */
        public Builder negativeCaching(Boolean negativeCaching) {
            return negativeCaching(Output.of(negativeCaching));
        }

        /**
         * @param negativeCachingPolicies Sets a cache TTL for the specified HTTP status code. negativeCaching must be enabled to configure negativeCachingPolicy.
         * Omitting the policy and leaving negativeCaching enabled will use Cloud CDN&#39;s default cache TTLs.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder negativeCachingPolicies(@Nullable Output<List<RegionBackendServiceCdnPolicyNegativeCachingPolicyGetArgs>> negativeCachingPolicies) {
            $.negativeCachingPolicies = negativeCachingPolicies;
            return this;
        }

        /**
         * @param negativeCachingPolicies Sets a cache TTL for the specified HTTP status code. negativeCaching must be enabled to configure negativeCachingPolicy.
         * Omitting the policy and leaving negativeCaching enabled will use Cloud CDN&#39;s default cache TTLs.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder negativeCachingPolicies(List<RegionBackendServiceCdnPolicyNegativeCachingPolicyGetArgs> negativeCachingPolicies) {
            return negativeCachingPolicies(Output.of(negativeCachingPolicies));
        }

        /**
         * @param negativeCachingPolicies Sets a cache TTL for the specified HTTP status code. negativeCaching must be enabled to configure negativeCachingPolicy.
         * Omitting the policy and leaving negativeCaching enabled will use Cloud CDN&#39;s default cache TTLs.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder negativeCachingPolicies(RegionBackendServiceCdnPolicyNegativeCachingPolicyGetArgs... negativeCachingPolicies) {
            return negativeCachingPolicies(List.of(negativeCachingPolicies));
        }

        /**
         * @param serveWhileStale Serve existing content from the cache (if available) when revalidating content with the origin, or when an error is encountered when refreshing the cache.
         * 
         * @return builder
         * 
         */
        public Builder serveWhileStale(@Nullable Output<Integer> serveWhileStale) {
            $.serveWhileStale = serveWhileStale;
            return this;
        }

        /**
         * @param serveWhileStale Serve existing content from the cache (if available) when revalidating content with the origin, or when an error is encountered when refreshing the cache.
         * 
         * @return builder
         * 
         */
        public Builder serveWhileStale(Integer serveWhileStale) {
            return serveWhileStale(Output.of(serveWhileStale));
        }

        /**
         * @param signedUrlCacheMaxAgeSec Maximum number of seconds the response to a signed URL request
         * will be considered fresh, defaults to 1hr (3600s). After this
         * time period, the response will be revalidated before
         * being served.
         * When serving responses to signed URL requests, Cloud CDN will
         * internally behave as though all responses from this backend had a
         * &#34;Cache-Control: public, max-age=[TTL]&#34; header, regardless of any
         * existing Cache-Control header. The actual headers served in
         * responses will not be altered.
         * 
         * @return builder
         * 
         */
        public Builder signedUrlCacheMaxAgeSec(@Nullable Output<Integer> signedUrlCacheMaxAgeSec) {
            $.signedUrlCacheMaxAgeSec = signedUrlCacheMaxAgeSec;
            return this;
        }

        /**
         * @param signedUrlCacheMaxAgeSec Maximum number of seconds the response to a signed URL request
         * will be considered fresh, defaults to 1hr (3600s). After this
         * time period, the response will be revalidated before
         * being served.
         * When serving responses to signed URL requests, Cloud CDN will
         * internally behave as though all responses from this backend had a
         * &#34;Cache-Control: public, max-age=[TTL]&#34; header, regardless of any
         * existing Cache-Control header. The actual headers served in
         * responses will not be altered.
         * 
         * @return builder
         * 
         */
        public Builder signedUrlCacheMaxAgeSec(Integer signedUrlCacheMaxAgeSec) {
            return signedUrlCacheMaxAgeSec(Output.of(signedUrlCacheMaxAgeSec));
        }

        public RegionBackendServiceCdnPolicyGetArgs build() {
            return $;
        }
    }

}
