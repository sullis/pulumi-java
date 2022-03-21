// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs();

    /**
     * If true, requests to different hosts will be cached separately.
     * Note: this should only be enabled if hosts share the same origin and content Removing the host from the cache key may inadvertently result in different objects being cached than intended, depending on which route the first user matched.
     * 
     */
    @Import(name="excludeHost")
      private final @Nullable Output<Boolean> excludeHost;

    public Output<Boolean> getExcludeHost() {
        return this.excludeHost == null ? Output.empty() : this.excludeHost;
    }

    /**
     * If true, exclude query string parameters from the cache key
     * If false (the default), include the query string parameters in
     * the cache key according to includeQueryParameters and
     * excludeQueryParameters. If neither includeQueryParameters nor
     * excludeQueryParameters is set, the entire query string will be
     * included.
     * 
     */
    @Import(name="excludeQueryString")
      private final @Nullable Output<Boolean> excludeQueryString;

    public Output<Boolean> getExcludeQueryString() {
        return this.excludeQueryString == null ? Output.empty() : this.excludeQueryString;
    }

    /**
     * Names of query string parameters to exclude from cache keys. All other parameters will be included.
     * Either specify includedQueryParameters or excludedQueryParameters, not both. '&' and '=' will be percent encoded and not treated as delimiters.
     * 
     */
    @Import(name="excludedQueryParameters")
      private final @Nullable Output<List<String>> excludedQueryParameters;

    public Output<List<String>> getExcludedQueryParameters() {
        return this.excludedQueryParameters == null ? Output.empty() : this.excludedQueryParameters;
    }

    /**
     * If true, http and https requests will be cached separately.
     * 
     */
    @Import(name="includeProtocol")
      private final @Nullable Output<Boolean> includeProtocol;

    public Output<Boolean> getIncludeProtocol() {
        return this.includeProtocol == null ? Output.empty() : this.includeProtocol;
    }

    /**
     * Names of HTTP request headers to include in cache keys. The value of the header field will be used as part of the cache key.
     * - Header names must be valid HTTP RFC 7230 header field values.
     * - Header field names are case insensitive
     * - To include the HTTP method, use ":method"
     *   Note that specifying several headers, and/or headers that have a large range of values (e.g. per-user) will dramatically impact the cache hit rate, and may result in a higher eviction rate and reduced performance.
     * 
     */
    @Import(name="includedHeaderNames")
      private final @Nullable Output<List<String>> includedHeaderNames;

    public Output<List<String>> getIncludedHeaderNames() {
        return this.includedHeaderNames == null ? Output.empty() : this.includedHeaderNames;
    }

    /**
     * Names of query string parameters to include in cache keys. All other parameters will be excluded.
     * Either specify includedQueryParameters or excludedQueryParameters, not both. '&' and '=' will be percent encoded and not treated as delimiters.
     * 
     */
    @Import(name="includedQueryParameters")
      private final @Nullable Output<List<String>> includedQueryParameters;

    public Output<List<String>> getIncludedQueryParameters() {
        return this.includedQueryParameters == null ? Output.empty() : this.includedQueryParameters;
    }

    public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs(
        @Nullable Output<Boolean> excludeHost,
        @Nullable Output<Boolean> excludeQueryString,
        @Nullable Output<List<String>> excludedQueryParameters,
        @Nullable Output<Boolean> includeProtocol,
        @Nullable Output<List<String>> includedHeaderNames,
        @Nullable Output<List<String>> includedQueryParameters) {
        this.excludeHost = excludeHost;
        this.excludeQueryString = excludeQueryString;
        this.excludedQueryParameters = excludedQueryParameters;
        this.includeProtocol = includeProtocol;
        this.includedHeaderNames = includedHeaderNames;
        this.includedQueryParameters = includedQueryParameters;
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs() {
        this.excludeHost = Output.empty();
        this.excludeQueryString = Output.empty();
        this.excludedQueryParameters = Output.empty();
        this.includeProtocol = Output.empty();
        this.includedHeaderNames = Output.empty();
        this.includedQueryParameters = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> excludeHost;
        private @Nullable Output<Boolean> excludeQueryString;
        private @Nullable Output<List<String>> excludedQueryParameters;
        private @Nullable Output<Boolean> includeProtocol;
        private @Nullable Output<List<String>> includedHeaderNames;
        private @Nullable Output<List<String>> includedQueryParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludeHost = defaults.excludeHost;
    	      this.excludeQueryString = defaults.excludeQueryString;
    	      this.excludedQueryParameters = defaults.excludedQueryParameters;
    	      this.includeProtocol = defaults.includeProtocol;
    	      this.includedHeaderNames = defaults.includedHeaderNames;
    	      this.includedQueryParameters = defaults.includedQueryParameters;
        }

        public Builder excludeHost(@Nullable Output<Boolean> excludeHost) {
            this.excludeHost = excludeHost;
            return this;
        }
        public Builder excludeHost(@Nullable Boolean excludeHost) {
            this.excludeHost = Output.ofNullable(excludeHost);
            return this;
        }
        public Builder excludeQueryString(@Nullable Output<Boolean> excludeQueryString) {
            this.excludeQueryString = excludeQueryString;
            return this;
        }
        public Builder excludeQueryString(@Nullable Boolean excludeQueryString) {
            this.excludeQueryString = Output.ofNullable(excludeQueryString);
            return this;
        }
        public Builder excludedQueryParameters(@Nullable Output<List<String>> excludedQueryParameters) {
            this.excludedQueryParameters = excludedQueryParameters;
            return this;
        }
        public Builder excludedQueryParameters(@Nullable List<String> excludedQueryParameters) {
            this.excludedQueryParameters = Output.ofNullable(excludedQueryParameters);
            return this;
        }
        public Builder excludedQueryParameters(String... excludedQueryParameters) {
            return excludedQueryParameters(List.of(excludedQueryParameters));
        }
        public Builder includeProtocol(@Nullable Output<Boolean> includeProtocol) {
            this.includeProtocol = includeProtocol;
            return this;
        }
        public Builder includeProtocol(@Nullable Boolean includeProtocol) {
            this.includeProtocol = Output.ofNullable(includeProtocol);
            return this;
        }
        public Builder includedHeaderNames(@Nullable Output<List<String>> includedHeaderNames) {
            this.includedHeaderNames = includedHeaderNames;
            return this;
        }
        public Builder includedHeaderNames(@Nullable List<String> includedHeaderNames) {
            this.includedHeaderNames = Output.ofNullable(includedHeaderNames);
            return this;
        }
        public Builder includedHeaderNames(String... includedHeaderNames) {
            return includedHeaderNames(List.of(includedHeaderNames));
        }
        public Builder includedQueryParameters(@Nullable Output<List<String>> includedQueryParameters) {
            this.includedQueryParameters = includedQueryParameters;
            return this;
        }
        public Builder includedQueryParameters(@Nullable List<String> includedQueryParameters) {
            this.includedQueryParameters = Output.ofNullable(includedQueryParameters);
            return this;
        }
        public Builder includedQueryParameters(String... includedQueryParameters) {
            return includedQueryParameters(List.of(includedQueryParameters));
        }        public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs(excludeHost, excludeQueryString, excludedQueryParameters, includeProtocol, includedHeaderNames, includedQueryParameters);
        }
    }
}
