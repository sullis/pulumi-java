// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.DistributionOrderedCacheBehaviorForwardedValuesCookies;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DistributionOrderedCacheBehaviorForwardedValues {
    /**
     * @return The forwarded values cookies
     * that specifies how CloudFront handles cookies (maximum one).
     * 
     */
    private final DistributionOrderedCacheBehaviorForwardedValuesCookies cookies;
    /**
     * @return Specifies the Headers, if any, that you want
     * CloudFront to vary upon for this cache behavior. Specify `*` to include all
     * headers.
     * 
     */
    private final @Nullable List<String> headers;
    /**
     * @return Indicates whether you want CloudFront to forward
     * query strings to the origin that is associated with this cache behavior.
     * 
     */
    private final Boolean queryString;
    /**
     * @return When specified, along with a value of
     * `true` for `query_string`, all query strings are forwarded, however only the
     * query string keys listed in this argument are cached. When omitted with a
     * value of `true` for `query_string`, all query string keys are cached.
     * 
     */
    private final @Nullable List<String> queryStringCacheKeys;

    @CustomType.Constructor
    private DistributionOrderedCacheBehaviorForwardedValues(
        @CustomType.Parameter("cookies") DistributionOrderedCacheBehaviorForwardedValuesCookies cookies,
        @CustomType.Parameter("headers") @Nullable List<String> headers,
        @CustomType.Parameter("queryString") Boolean queryString,
        @CustomType.Parameter("queryStringCacheKeys") @Nullable List<String> queryStringCacheKeys) {
        this.cookies = cookies;
        this.headers = headers;
        this.queryString = queryString;
        this.queryStringCacheKeys = queryStringCacheKeys;
    }

    /**
     * @return The forwarded values cookies
     * that specifies how CloudFront handles cookies (maximum one).
     * 
     */
    public DistributionOrderedCacheBehaviorForwardedValuesCookies cookies() {
        return this.cookies;
    }
    /**
     * @return Specifies the Headers, if any, that you want
     * CloudFront to vary upon for this cache behavior. Specify `*` to include all
     * headers.
     * 
     */
    public List<String> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * @return Indicates whether you want CloudFront to forward
     * query strings to the origin that is associated with this cache behavior.
     * 
     */
    public Boolean queryString() {
        return this.queryString;
    }
    /**
     * @return When specified, along with a value of
     * `true` for `query_string`, all query strings are forwarded, however only the
     * query string keys listed in this argument are cached. When omitted with a
     * value of `true` for `query_string`, all query string keys are cached.
     * 
     */
    public List<String> queryStringCacheKeys() {
        return this.queryStringCacheKeys == null ? List.of() : this.queryStringCacheKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOrderedCacheBehaviorForwardedValues defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionOrderedCacheBehaviorForwardedValuesCookies cookies;
        private @Nullable List<String> headers;
        private Boolean queryString;
        private @Nullable List<String> queryStringCacheKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOrderedCacheBehaviorForwardedValues defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookies = defaults.cookies;
    	      this.headers = defaults.headers;
    	      this.queryString = defaults.queryString;
    	      this.queryStringCacheKeys = defaults.queryStringCacheKeys;
        }

        public Builder cookies(DistributionOrderedCacheBehaviorForwardedValuesCookies cookies) {
            this.cookies = Objects.requireNonNull(cookies);
            return this;
        }
        public Builder headers(@Nullable List<String> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }
        public Builder queryString(Boolean queryString) {
            this.queryString = Objects.requireNonNull(queryString);
            return this;
        }
        public Builder queryStringCacheKeys(@Nullable List<String> queryStringCacheKeys) {
            this.queryStringCacheKeys = queryStringCacheKeys;
            return this;
        }
        public Builder queryStringCacheKeys(String... queryStringCacheKeys) {
            return queryStringCacheKeys(List.of(queryStringCacheKeys));
        }        public DistributionOrderedCacheBehaviorForwardedValues build() {
            return new DistributionOrderedCacheBehaviorForwardedValues(cookies, headers, queryString, queryStringCacheKeys);
        }
    }
}
