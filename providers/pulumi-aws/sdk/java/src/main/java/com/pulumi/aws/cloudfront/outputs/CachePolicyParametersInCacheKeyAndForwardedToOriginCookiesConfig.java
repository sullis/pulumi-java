// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookies;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig {
    /**
     * @return Determines whether any cookies in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`, `allExcept`, `all`.
     * 
     */
    private final String cookieBehavior;
    /**
     * @return Object that contains a list of cookie names. See Items for more information.
     * 
     */
    private final @Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookies cookies;

    @CustomType.Constructor
    private CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig(
        @CustomType.Parameter("cookieBehavior") String cookieBehavior,
        @CustomType.Parameter("cookies") @Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookies cookies) {
        this.cookieBehavior = cookieBehavior;
        this.cookies = cookies;
    }

    /**
     * @return Determines whether any cookies in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`, `allExcept`, `all`.
     * 
     */
    public String cookieBehavior() {
        return this.cookieBehavior;
    }
    /**
     * @return Object that contains a list of cookie names. See Items for more information.
     * 
     */
    public Optional<CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookies> cookies() {
        return Optional.ofNullable(this.cookies);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cookieBehavior;
        private @Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookies cookies;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieBehavior = defaults.cookieBehavior;
    	      this.cookies = defaults.cookies;
        }

        public Builder cookieBehavior(String cookieBehavior) {
            this.cookieBehavior = Objects.requireNonNull(cookieBehavior);
            return this;
        }
        public Builder cookies(@Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookies cookies) {
            this.cookies = cookies;
            return this;
        }        public CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig build() {
            return new CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig(cookieBehavior, cookies);
        }
    }
}
