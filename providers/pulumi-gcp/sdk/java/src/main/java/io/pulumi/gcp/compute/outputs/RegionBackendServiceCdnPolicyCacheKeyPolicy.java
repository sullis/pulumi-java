// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionBackendServiceCdnPolicyCacheKeyPolicy {
    /**
     * If true requests to different hosts will be cached separately.
     * 
     */
    private final @Nullable Boolean includeHost;
    /**
     * If true, http and https requests will be cached separately.
     * 
     */
    private final @Nullable Boolean includeProtocol;
    /**
     * If true, include query string parameters in the cache key
     * according to query_string_whitelist and
     * query_string_blacklist. If neither is set, the entire query
     * string will be included.
     * If false, the query string will be excluded from the cache
     * key entirely.
     * 
     */
    private final @Nullable Boolean includeQueryString;
    /**
     * Names of query string parameters to exclude in cache keys.
     * All other parameters will be included. Either specify
     * query_string_whitelist or query_string_blacklist, not both.
     * '&' and '=' will be percent encoded and not treated as
     * delimiters.
     * 
     */
    private final @Nullable List<String> queryStringBlacklists;
    /**
     * Names of query string parameters to include in cache keys.
     * All other parameters will be excluded. Either specify
     * query_string_whitelist or query_string_blacklist, not both.
     * '&' and '=' will be percent encoded and not treated as
     * delimiters.
     * 
     */
    private final @Nullable List<String> queryStringWhitelists;

    @OutputCustomType.Constructor({"includeHost","includeProtocol","includeQueryString","queryStringBlacklists","queryStringWhitelists"})
    private RegionBackendServiceCdnPolicyCacheKeyPolicy(
        @Nullable Boolean includeHost,
        @Nullable Boolean includeProtocol,
        @Nullable Boolean includeQueryString,
        @Nullable List<String> queryStringBlacklists,
        @Nullable List<String> queryStringWhitelists) {
        this.includeHost = includeHost;
        this.includeProtocol = includeProtocol;
        this.includeQueryString = includeQueryString;
        this.queryStringBlacklists = queryStringBlacklists;
        this.queryStringWhitelists = queryStringWhitelists;
    }

    /**
     * If true requests to different hosts will be cached separately.
     * 
    */
    public Optional<Boolean> getIncludeHost() {
        return Optional.ofNullable(this.includeHost);
    }
    /**
     * If true, http and https requests will be cached separately.
     * 
    */
    public Optional<Boolean> getIncludeProtocol() {
        return Optional.ofNullable(this.includeProtocol);
    }
    /**
     * If true, include query string parameters in the cache key
     * according to query_string_whitelist and
     * query_string_blacklist. If neither is set, the entire query
     * string will be included.
     * If false, the query string will be excluded from the cache
     * key entirely.
     * 
    */
    public Optional<Boolean> getIncludeQueryString() {
        return Optional.ofNullable(this.includeQueryString);
    }
    /**
     * Names of query string parameters to exclude in cache keys.
     * All other parameters will be included. Either specify
     * query_string_whitelist or query_string_blacklist, not both.
     * '&' and '=' will be percent encoded and not treated as
     * delimiters.
     * 
    */
    public List<String> getQueryStringBlacklists() {
        return this.queryStringBlacklists == null ? List.of() : this.queryStringBlacklists;
    }
    /**
     * Names of query string parameters to include in cache keys.
     * All other parameters will be excluded. Either specify
     * query_string_whitelist or query_string_blacklist, not both.
     * '&' and '=' will be percent encoded and not treated as
     * delimiters.
     * 
    */
    public List<String> getQueryStringWhitelists() {
        return this.queryStringWhitelists == null ? List.of() : this.queryStringWhitelists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceCdnPolicyCacheKeyPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean includeHost;
        private @Nullable Boolean includeProtocol;
        private @Nullable Boolean includeQueryString;
        private @Nullable List<String> queryStringBlacklists;
        private @Nullable List<String> queryStringWhitelists;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceCdnPolicyCacheKeyPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeHost = defaults.includeHost;
    	      this.includeProtocol = defaults.includeProtocol;
    	      this.includeQueryString = defaults.includeQueryString;
    	      this.queryStringBlacklists = defaults.queryStringBlacklists;
    	      this.queryStringWhitelists = defaults.queryStringWhitelists;
        }

        public Builder setIncludeHost(@Nullable Boolean includeHost) {
            this.includeHost = includeHost;
            return this;
        }

        public Builder setIncludeProtocol(@Nullable Boolean includeProtocol) {
            this.includeProtocol = includeProtocol;
            return this;
        }

        public Builder setIncludeQueryString(@Nullable Boolean includeQueryString) {
            this.includeQueryString = includeQueryString;
            return this;
        }

        public Builder setQueryStringBlacklists(@Nullable List<String> queryStringBlacklists) {
            this.queryStringBlacklists = queryStringBlacklists;
            return this;
        }

        public Builder setQueryStringWhitelists(@Nullable List<String> queryStringWhitelists) {
            this.queryStringWhitelists = queryStringWhitelists;
            return this;
        }
        public RegionBackendServiceCdnPolicyCacheKeyPolicy build() {
            return new RegionBackendServiceCdnPolicyCacheKeyPolicy(includeHost, includeProtocol, includeQueryString, queryStringBlacklists, queryStringWhitelists);
        }
    }
}