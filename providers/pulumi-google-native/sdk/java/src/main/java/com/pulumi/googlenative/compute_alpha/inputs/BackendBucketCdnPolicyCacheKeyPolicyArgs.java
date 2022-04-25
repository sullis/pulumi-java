// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Message containing what to include in the cache key for a request for Cloud CDN.
 * 
 */
public final class BackendBucketCdnPolicyCacheKeyPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendBucketCdnPolicyCacheKeyPolicyArgs Empty = new BackendBucketCdnPolicyCacheKeyPolicyArgs();

    /**
     * Allows HTTP request headers (by name) to be used in the cache key.
     * 
     */
    @Import(name="includeHttpHeaders")
    private @Nullable Output<List<String>> includeHttpHeaders;

    /**
     * @return Allows HTTP request headers (by name) to be used in the cache key.
     * 
     */
    public Optional<Output<List<String>>> includeHttpHeaders() {
        return Optional.ofNullable(this.includeHttpHeaders);
    }

    /**
     * Names of query string parameters to include in cache keys. All other parameters will be excluded. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
     * 
     */
    @Import(name="queryStringWhitelist")
    private @Nullable Output<List<String>> queryStringWhitelist;

    /**
     * @return Names of query string parameters to include in cache keys. All other parameters will be excluded. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
     * 
     */
    public Optional<Output<List<String>>> queryStringWhitelist() {
        return Optional.ofNullable(this.queryStringWhitelist);
    }

    private BackendBucketCdnPolicyCacheKeyPolicyArgs() {}

    private BackendBucketCdnPolicyCacheKeyPolicyArgs(BackendBucketCdnPolicyCacheKeyPolicyArgs $) {
        this.includeHttpHeaders = $.includeHttpHeaders;
        this.queryStringWhitelist = $.queryStringWhitelist;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendBucketCdnPolicyCacheKeyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendBucketCdnPolicyCacheKeyPolicyArgs $;

        public Builder() {
            $ = new BackendBucketCdnPolicyCacheKeyPolicyArgs();
        }

        public Builder(BackendBucketCdnPolicyCacheKeyPolicyArgs defaults) {
            $ = new BackendBucketCdnPolicyCacheKeyPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param includeHttpHeaders Allows HTTP request headers (by name) to be used in the cache key.
         * 
         * @return builder
         * 
         */
        public Builder includeHttpHeaders(@Nullable Output<List<String>> includeHttpHeaders) {
            $.includeHttpHeaders = includeHttpHeaders;
            return this;
        }

        /**
         * @param includeHttpHeaders Allows HTTP request headers (by name) to be used in the cache key.
         * 
         * @return builder
         * 
         */
        public Builder includeHttpHeaders(List<String> includeHttpHeaders) {
            return includeHttpHeaders(Output.of(includeHttpHeaders));
        }

        /**
         * @param includeHttpHeaders Allows HTTP request headers (by name) to be used in the cache key.
         * 
         * @return builder
         * 
         */
        public Builder includeHttpHeaders(String... includeHttpHeaders) {
            return includeHttpHeaders(List.of(includeHttpHeaders));
        }

        /**
         * @param queryStringWhitelist Names of query string parameters to include in cache keys. All other parameters will be excluded. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
         * 
         * @return builder
         * 
         */
        public Builder queryStringWhitelist(@Nullable Output<List<String>> queryStringWhitelist) {
            $.queryStringWhitelist = queryStringWhitelist;
            return this;
        }

        /**
         * @param queryStringWhitelist Names of query string parameters to include in cache keys. All other parameters will be excluded. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
         * 
         * @return builder
         * 
         */
        public Builder queryStringWhitelist(List<String> queryStringWhitelist) {
            return queryStringWhitelist(Output.of(queryStringWhitelist));
        }

        /**
         * @param queryStringWhitelist Names of query string parameters to include in cache keys. All other parameters will be excluded. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
         * 
         * @return builder
         * 
         */
        public Builder queryStringWhitelist(String... queryStringWhitelist) {
            return queryStringWhitelist(List.of(queryStringWhitelist));
        }

        public BackendBucketCdnPolicyCacheKeyPolicyArgs build() {
            return $;
        }
    }

}
