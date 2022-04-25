// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.CookieExpirationResponse;
import com.pulumi.azurenative.web.outputs.LoginRoutesResponse;
import com.pulumi.azurenative.web.outputs.NonceResponse;
import com.pulumi.azurenative.web.outputs.TokenStoreResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoginResponse {
    /**
     * @return External URLs that can be redirected to as part of logging in or logging out of the app. Note that the query string part of the URL is ignored.
     * This is an advanced setting typically only needed by Windows Store application backends.
     * Note that URLs within the current domain are always implicitly allowed.
     * 
     */
    private final @Nullable List<String> allowedExternalRedirectUrls;
    /**
     * @return The configuration settings of the session cookie&#39;s expiration.
     * 
     */
    private final @Nullable CookieExpirationResponse cookieExpiration;
    /**
     * @return The configuration settings of the nonce used in the login flow.
     * 
     */
    private final @Nullable NonceResponse nonce;
    /**
     * @return &lt;code&gt;true&lt;/code&gt; if the fragments from the request are preserved after the login request is made; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    private final @Nullable Boolean preserveUrlFragmentsForLogins;
    /**
     * @return The routes that specify the endpoints used for login and logout requests.
     * 
     */
    private final @Nullable LoginRoutesResponse routes;
    /**
     * @return The configuration settings of the token store.
     * 
     */
    private final @Nullable TokenStoreResponse tokenStore;

    @CustomType.Constructor
    private LoginResponse(
        @CustomType.Parameter("allowedExternalRedirectUrls") @Nullable List<String> allowedExternalRedirectUrls,
        @CustomType.Parameter("cookieExpiration") @Nullable CookieExpirationResponse cookieExpiration,
        @CustomType.Parameter("nonce") @Nullable NonceResponse nonce,
        @CustomType.Parameter("preserveUrlFragmentsForLogins") @Nullable Boolean preserveUrlFragmentsForLogins,
        @CustomType.Parameter("routes") @Nullable LoginRoutesResponse routes,
        @CustomType.Parameter("tokenStore") @Nullable TokenStoreResponse tokenStore) {
        this.allowedExternalRedirectUrls = allowedExternalRedirectUrls;
        this.cookieExpiration = cookieExpiration;
        this.nonce = nonce;
        this.preserveUrlFragmentsForLogins = preserveUrlFragmentsForLogins;
        this.routes = routes;
        this.tokenStore = tokenStore;
    }

    /**
     * @return External URLs that can be redirected to as part of logging in or logging out of the app. Note that the query string part of the URL is ignored.
     * This is an advanced setting typically only needed by Windows Store application backends.
     * Note that URLs within the current domain are always implicitly allowed.
     * 
     */
    public List<String> allowedExternalRedirectUrls() {
        return this.allowedExternalRedirectUrls == null ? List.of() : this.allowedExternalRedirectUrls;
    }
    /**
     * @return The configuration settings of the session cookie&#39;s expiration.
     * 
     */
    public Optional<CookieExpirationResponse> cookieExpiration() {
        return Optional.ofNullable(this.cookieExpiration);
    }
    /**
     * @return The configuration settings of the nonce used in the login flow.
     * 
     */
    public Optional<NonceResponse> nonce() {
        return Optional.ofNullable(this.nonce);
    }
    /**
     * @return &lt;code&gt;true&lt;/code&gt; if the fragments from the request are preserved after the login request is made; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    public Optional<Boolean> preserveUrlFragmentsForLogins() {
        return Optional.ofNullable(this.preserveUrlFragmentsForLogins);
    }
    /**
     * @return The routes that specify the endpoints used for login and logout requests.
     * 
     */
    public Optional<LoginRoutesResponse> routes() {
        return Optional.ofNullable(this.routes);
    }
    /**
     * @return The configuration settings of the token store.
     * 
     */
    public Optional<TokenStoreResponse> tokenStore() {
        return Optional.ofNullable(this.tokenStore);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoginResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedExternalRedirectUrls;
        private @Nullable CookieExpirationResponse cookieExpiration;
        private @Nullable NonceResponse nonce;
        private @Nullable Boolean preserveUrlFragmentsForLogins;
        private @Nullable LoginRoutesResponse routes;
        private @Nullable TokenStoreResponse tokenStore;

        public Builder() {
    	      // Empty
        }

        public Builder(LoginResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedExternalRedirectUrls = defaults.allowedExternalRedirectUrls;
    	      this.cookieExpiration = defaults.cookieExpiration;
    	      this.nonce = defaults.nonce;
    	      this.preserveUrlFragmentsForLogins = defaults.preserveUrlFragmentsForLogins;
    	      this.routes = defaults.routes;
    	      this.tokenStore = defaults.tokenStore;
        }

        public Builder allowedExternalRedirectUrls(@Nullable List<String> allowedExternalRedirectUrls) {
            this.allowedExternalRedirectUrls = allowedExternalRedirectUrls;
            return this;
        }
        public Builder allowedExternalRedirectUrls(String... allowedExternalRedirectUrls) {
            return allowedExternalRedirectUrls(List.of(allowedExternalRedirectUrls));
        }
        public Builder cookieExpiration(@Nullable CookieExpirationResponse cookieExpiration) {
            this.cookieExpiration = cookieExpiration;
            return this;
        }
        public Builder nonce(@Nullable NonceResponse nonce) {
            this.nonce = nonce;
            return this;
        }
        public Builder preserveUrlFragmentsForLogins(@Nullable Boolean preserveUrlFragmentsForLogins) {
            this.preserveUrlFragmentsForLogins = preserveUrlFragmentsForLogins;
            return this;
        }
        public Builder routes(@Nullable LoginRoutesResponse routes) {
            this.routes = routes;
            return this;
        }
        public Builder tokenStore(@Nullable TokenStoreResponse tokenStore) {
            this.tokenStore = tokenStore;
            return this;
        }        public LoginResponse build() {
            return new LoginResponse(allowedExternalRedirectUrls, cookieExpiration, nonce, preserveUrlFragmentsForLogins, routes, tokenStore);
        }
    }
}
