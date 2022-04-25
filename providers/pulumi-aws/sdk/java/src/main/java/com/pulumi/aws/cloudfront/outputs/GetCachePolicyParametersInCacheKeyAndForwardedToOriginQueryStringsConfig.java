// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig {
    /**
     * @return Determines whether any URL query strings in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`, `allExcept`, `all`.
     * 
     */
    private final String queryStringBehavior;
    /**
     * @return Object that contains a list of query string names. See Items for more information.
     * 
     */
    private final List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString> queryStrings;

    @CustomType.Constructor
    private GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig(
        @CustomType.Parameter("queryStringBehavior") String queryStringBehavior,
        @CustomType.Parameter("queryStrings") List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString> queryStrings) {
        this.queryStringBehavior = queryStringBehavior;
        this.queryStrings = queryStrings;
    }

    /**
     * @return Determines whether any URL query strings in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`, `allExcept`, `all`.
     * 
     */
    public String queryStringBehavior() {
        return this.queryStringBehavior;
    }
    /**
     * @return Object that contains a list of query string names. See Items for more information.
     * 
     */
    public List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString> queryStrings() {
        return this.queryStrings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String queryStringBehavior;
        private List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString> queryStrings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryStringBehavior = defaults.queryStringBehavior;
    	      this.queryStrings = defaults.queryStrings;
        }

        public Builder queryStringBehavior(String queryStringBehavior) {
            this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior);
            return this;
        }
        public Builder queryStrings(List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString> queryStrings) {
            this.queryStrings = Objects.requireNonNull(queryStrings);
            return this;
        }
        public Builder queryStrings(GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString... queryStrings) {
            return queryStrings(List.of(queryStrings));
        }        public GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig build() {
            return new GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig(queryStringBehavior, queryStrings);
        }
    }
}
