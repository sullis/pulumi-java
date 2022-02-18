// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.awsnative.cloudfront.outputs.CachePolicyCookiesConfig;
import io.pulumi.awsnative.cloudfront.outputs.CachePolicyHeadersConfig;
import io.pulumi.awsnative.cloudfront.outputs.CachePolicyQueryStringsConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CachePolicyParametersInCacheKeyAndForwardedToOrigin {
    private final CachePolicyCookiesConfig cookiesConfig;
    private final @Nullable Boolean enableAcceptEncodingBrotli;
    private final Boolean enableAcceptEncodingGzip;
    private final CachePolicyHeadersConfig headersConfig;
    private final CachePolicyQueryStringsConfig queryStringsConfig;

    @OutputCustomType.Constructor({"cookiesConfig","enableAcceptEncodingBrotli","enableAcceptEncodingGzip","headersConfig","queryStringsConfig"})
    private CachePolicyParametersInCacheKeyAndForwardedToOrigin(
        CachePolicyCookiesConfig cookiesConfig,
        @Nullable Boolean enableAcceptEncodingBrotli,
        Boolean enableAcceptEncodingGzip,
        CachePolicyHeadersConfig headersConfig,
        CachePolicyQueryStringsConfig queryStringsConfig) {
        this.cookiesConfig = Objects.requireNonNull(cookiesConfig);
        this.enableAcceptEncodingBrotli = enableAcceptEncodingBrotli;
        this.enableAcceptEncodingGzip = Objects.requireNonNull(enableAcceptEncodingGzip);
        this.headersConfig = Objects.requireNonNull(headersConfig);
        this.queryStringsConfig = Objects.requireNonNull(queryStringsConfig);
    }

    public CachePolicyCookiesConfig getCookiesConfig() {
        return this.cookiesConfig;
    }
    public Optional<Boolean> getEnableAcceptEncodingBrotli() {
        return Optional.ofNullable(this.enableAcceptEncodingBrotli);
    }
    public Boolean getEnableAcceptEncodingGzip() {
        return this.enableAcceptEncodingGzip;
    }
    public CachePolicyHeadersConfig getHeadersConfig() {
        return this.headersConfig;
    }
    public CachePolicyQueryStringsConfig getQueryStringsConfig() {
        return this.queryStringsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOrigin defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CachePolicyCookiesConfig cookiesConfig;
        private @Nullable Boolean enableAcceptEncodingBrotli;
        private Boolean enableAcceptEncodingGzip;
        private CachePolicyHeadersConfig headersConfig;
        private CachePolicyQueryStringsConfig queryStringsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOrigin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookiesConfig = defaults.cookiesConfig;
    	      this.enableAcceptEncodingBrotli = defaults.enableAcceptEncodingBrotli;
    	      this.enableAcceptEncodingGzip = defaults.enableAcceptEncodingGzip;
    	      this.headersConfig = defaults.headersConfig;
    	      this.queryStringsConfig = defaults.queryStringsConfig;
        }

        public Builder setCookiesConfig(CachePolicyCookiesConfig cookiesConfig) {
            this.cookiesConfig = Objects.requireNonNull(cookiesConfig);
            return this;
        }

        public Builder setEnableAcceptEncodingBrotli(@Nullable Boolean enableAcceptEncodingBrotli) {
            this.enableAcceptEncodingBrotli = enableAcceptEncodingBrotli;
            return this;
        }

        public Builder setEnableAcceptEncodingGzip(Boolean enableAcceptEncodingGzip) {
            this.enableAcceptEncodingGzip = Objects.requireNonNull(enableAcceptEncodingGzip);
            return this;
        }

        public Builder setHeadersConfig(CachePolicyHeadersConfig headersConfig) {
            this.headersConfig = Objects.requireNonNull(headersConfig);
            return this;
        }

        public Builder setQueryStringsConfig(CachePolicyQueryStringsConfig queryStringsConfig) {
            this.queryStringsConfig = Objects.requireNonNull(queryStringsConfig);
            return this;
        }

        public CachePolicyParametersInCacheKeyAndForwardedToOrigin build() {
            return new CachePolicyParametersInCacheKeyAndForwardedToOrigin(cookiesConfig, enableAcceptEncodingBrotli, enableAcceptEncodingGzip, headersConfig, queryStringsConfig);
        }
    }
}
