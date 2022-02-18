// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.CachePolicyCookiesConfigArgs;
import io.pulumi.awsnative.cloudfront.inputs.CachePolicyHeadersConfigArgs;
import io.pulumi.awsnative.cloudfront.inputs.CachePolicyQueryStringsConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CachePolicyParametersInCacheKeyAndForwardedToOriginArgs extends io.pulumi.resources.ResourceArgs {

    public static final CachePolicyParametersInCacheKeyAndForwardedToOriginArgs Empty = new CachePolicyParametersInCacheKeyAndForwardedToOriginArgs();

    @InputImport(name="cookiesConfig", required=true)
    private final Input<CachePolicyCookiesConfigArgs> cookiesConfig;

    public Input<CachePolicyCookiesConfigArgs> getCookiesConfig() {
        return this.cookiesConfig;
    }

    @InputImport(name="enableAcceptEncodingBrotli")
    private final @Nullable Input<Boolean> enableAcceptEncodingBrotli;

    public Input<Boolean> getEnableAcceptEncodingBrotli() {
        return this.enableAcceptEncodingBrotli == null ? Input.empty() : this.enableAcceptEncodingBrotli;
    }

    @InputImport(name="enableAcceptEncodingGzip", required=true)
    private final Input<Boolean> enableAcceptEncodingGzip;

    public Input<Boolean> getEnableAcceptEncodingGzip() {
        return this.enableAcceptEncodingGzip;
    }

    @InputImport(name="headersConfig", required=true)
    private final Input<CachePolicyHeadersConfigArgs> headersConfig;

    public Input<CachePolicyHeadersConfigArgs> getHeadersConfig() {
        return this.headersConfig;
    }

    @InputImport(name="queryStringsConfig", required=true)
    private final Input<CachePolicyQueryStringsConfigArgs> queryStringsConfig;

    public Input<CachePolicyQueryStringsConfigArgs> getQueryStringsConfig() {
        return this.queryStringsConfig;
    }

    public CachePolicyParametersInCacheKeyAndForwardedToOriginArgs(
        Input<CachePolicyCookiesConfigArgs> cookiesConfig,
        @Nullable Input<Boolean> enableAcceptEncodingBrotli,
        Input<Boolean> enableAcceptEncodingGzip,
        Input<CachePolicyHeadersConfigArgs> headersConfig,
        Input<CachePolicyQueryStringsConfigArgs> queryStringsConfig) {
        this.cookiesConfig = Objects.requireNonNull(cookiesConfig, "expected parameter 'cookiesConfig' to be non-null");
        this.enableAcceptEncodingBrotli = enableAcceptEncodingBrotli;
        this.enableAcceptEncodingGzip = Objects.requireNonNull(enableAcceptEncodingGzip, "expected parameter 'enableAcceptEncodingGzip' to be non-null");
        this.headersConfig = Objects.requireNonNull(headersConfig, "expected parameter 'headersConfig' to be non-null");
        this.queryStringsConfig = Objects.requireNonNull(queryStringsConfig, "expected parameter 'queryStringsConfig' to be non-null");
    }

    private CachePolicyParametersInCacheKeyAndForwardedToOriginArgs() {
        this.cookiesConfig = Input.empty();
        this.enableAcceptEncodingBrotli = Input.empty();
        this.enableAcceptEncodingGzip = Input.empty();
        this.headersConfig = Input.empty();
        this.queryStringsConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<CachePolicyCookiesConfigArgs> cookiesConfig;
        private @Nullable Input<Boolean> enableAcceptEncodingBrotli;
        private Input<Boolean> enableAcceptEncodingGzip;
        private Input<CachePolicyHeadersConfigArgs> headersConfig;
        private Input<CachePolicyQueryStringsConfigArgs> queryStringsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookiesConfig = defaults.cookiesConfig;
    	      this.enableAcceptEncodingBrotli = defaults.enableAcceptEncodingBrotli;
    	      this.enableAcceptEncodingGzip = defaults.enableAcceptEncodingGzip;
    	      this.headersConfig = defaults.headersConfig;
    	      this.queryStringsConfig = defaults.queryStringsConfig;
        }

        public Builder setCookiesConfig(Input<CachePolicyCookiesConfigArgs> cookiesConfig) {
            this.cookiesConfig = Objects.requireNonNull(cookiesConfig);
            return this;
        }

        public Builder setCookiesConfig(CachePolicyCookiesConfigArgs cookiesConfig) {
            this.cookiesConfig = Input.of(Objects.requireNonNull(cookiesConfig));
            return this;
        }

        public Builder setEnableAcceptEncodingBrotli(@Nullable Input<Boolean> enableAcceptEncodingBrotli) {
            this.enableAcceptEncodingBrotli = enableAcceptEncodingBrotli;
            return this;
        }

        public Builder setEnableAcceptEncodingBrotli(@Nullable Boolean enableAcceptEncodingBrotli) {
            this.enableAcceptEncodingBrotli = Input.ofNullable(enableAcceptEncodingBrotli);
            return this;
        }

        public Builder setEnableAcceptEncodingGzip(Input<Boolean> enableAcceptEncodingGzip) {
            this.enableAcceptEncodingGzip = Objects.requireNonNull(enableAcceptEncodingGzip);
            return this;
        }

        public Builder setEnableAcceptEncodingGzip(Boolean enableAcceptEncodingGzip) {
            this.enableAcceptEncodingGzip = Input.of(Objects.requireNonNull(enableAcceptEncodingGzip));
            return this;
        }

        public Builder setHeadersConfig(Input<CachePolicyHeadersConfigArgs> headersConfig) {
            this.headersConfig = Objects.requireNonNull(headersConfig);
            return this;
        }

        public Builder setHeadersConfig(CachePolicyHeadersConfigArgs headersConfig) {
            this.headersConfig = Input.of(Objects.requireNonNull(headersConfig));
            return this;
        }

        public Builder setQueryStringsConfig(Input<CachePolicyQueryStringsConfigArgs> queryStringsConfig) {
            this.queryStringsConfig = Objects.requireNonNull(queryStringsConfig);
            return this;
        }

        public Builder setQueryStringsConfig(CachePolicyQueryStringsConfigArgs queryStringsConfig) {
            this.queryStringsConfig = Input.of(Objects.requireNonNull(queryStringsConfig));
            return this;
        }

        public CachePolicyParametersInCacheKeyAndForwardedToOriginArgs build() {
            return new CachePolicyParametersInCacheKeyAndForwardedToOriginArgs(cookiesConfig, enableAcceptEncodingBrotli, enableAcceptEncodingGzip, headersConfig, queryStringsConfig);
        }
    }
}
