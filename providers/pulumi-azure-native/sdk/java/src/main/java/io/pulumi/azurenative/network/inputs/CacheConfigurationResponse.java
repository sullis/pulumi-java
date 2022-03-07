// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Caching settings for a caching-type route. To disable caching, do not provide a cacheConfiguration object.
 * 
 */
public final class CacheConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final CacheConfigurationResponse Empty = new CacheConfigurationResponse();

    /**
     * The duration for which the content needs to be cached. Allowed format is in ISO 8601 format (http://en.wikipedia.org/wiki/ISO_8601#Durations). HTTP requires the value to be no more than a year
     * 
     */
    @InputImport(name="cacheDuration")
      private final @Nullable String cacheDuration;

    public Optional<String> getCacheDuration() {
        return this.cacheDuration == null ? Optional.empty() : Optional.ofNullable(this.cacheDuration);
    }

    /**
     * Whether to use dynamic compression for cached content
     * 
     */
    @InputImport(name="dynamicCompression")
      private final @Nullable String dynamicCompression;

    public Optional<String> getDynamicCompression() {
        return this.dynamicCompression == null ? Optional.empty() : Optional.ofNullable(this.dynamicCompression);
    }

    /**
     * Treatment of URL query terms when forming the cache key.
     * 
     */
    @InputImport(name="queryParameterStripDirective")
      private final @Nullable String queryParameterStripDirective;

    public Optional<String> getQueryParameterStripDirective() {
        return this.queryParameterStripDirective == null ? Optional.empty() : Optional.ofNullable(this.queryParameterStripDirective);
    }

    /**
     * query parameters to include or exclude (comma separated).
     * 
     */
    @InputImport(name="queryParameters")
      private final @Nullable String queryParameters;

    public Optional<String> getQueryParameters() {
        return this.queryParameters == null ? Optional.empty() : Optional.ofNullable(this.queryParameters);
    }

    public CacheConfigurationResponse(
        @Nullable String cacheDuration,
        @Nullable String dynamicCompression,
        @Nullable String queryParameterStripDirective,
        @Nullable String queryParameters) {
        this.cacheDuration = cacheDuration;
        this.dynamicCompression = dynamicCompression;
        this.queryParameterStripDirective = queryParameterStripDirective;
        this.queryParameters = queryParameters;
    }

    private CacheConfigurationResponse() {
        this.cacheDuration = null;
        this.dynamicCompression = null;
        this.queryParameterStripDirective = null;
        this.queryParameters = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cacheDuration;
        private @Nullable String dynamicCompression;
        private @Nullable String queryParameterStripDirective;
        private @Nullable String queryParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheDuration = defaults.cacheDuration;
    	      this.dynamicCompression = defaults.dynamicCompression;
    	      this.queryParameterStripDirective = defaults.queryParameterStripDirective;
    	      this.queryParameters = defaults.queryParameters;
        }

        public Builder setCacheDuration(@Nullable String cacheDuration) {
            this.cacheDuration = cacheDuration;
            return this;
        }

        public Builder setDynamicCompression(@Nullable String dynamicCompression) {
            this.dynamicCompression = dynamicCompression;
            return this;
        }

        public Builder setQueryParameterStripDirective(@Nullable String queryParameterStripDirective) {
            this.queryParameterStripDirective = queryParameterStripDirective;
            return this;
        }

        public Builder setQueryParameters(@Nullable String queryParameters) {
            this.queryParameters = queryParameters;
            return this;
        }
        public CacheConfigurationResponse build() {
            return new CacheConfigurationResponse(cacheDuration, dynamicCompression, queryParameterStripDirective, queryParameters);
        }
    }
}