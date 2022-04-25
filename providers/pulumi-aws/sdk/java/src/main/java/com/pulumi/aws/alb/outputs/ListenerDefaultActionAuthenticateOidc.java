// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerDefaultActionAuthenticateOidc {
    /**
     * @return Query parameters to include in the redirect request to the authorization endpoint. Max: 10.
     * 
     */
    private final @Nullable Map<String,String> authenticationRequestExtraParams;
    /**
     * @return Authorization endpoint of the IdP.
     * 
     */
    private final String authorizationEndpoint;
    /**
     * @return OAuth 2.0 client identifier.
     * 
     */
    private final String clientId;
    /**
     * @return OAuth 2.0 client secret.
     * 
     */
    private final String clientSecret;
    /**
     * @return OIDC issuer identifier of the IdP.
     * 
     */
    private final String issuer;
    /**
     * @return Behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
     * 
     */
    private final @Nullable String onUnauthenticatedRequest;
    /**
     * @return Set of user claims to be requested from the IdP.
     * 
     */
    private final @Nullable String scope;
    /**
     * @return Name of the cookie used to maintain session information.
     * 
     */
    private final @Nullable String sessionCookieName;
    /**
     * @return Maximum duration of the authentication session, in seconds.
     * 
     */
    private final @Nullable Integer sessionTimeout;
    /**
     * @return Token endpoint of the IdP.
     * 
     */
    private final String tokenEndpoint;
    /**
     * @return User info endpoint of the IdP.
     * 
     */
    private final String userInfoEndpoint;

    @CustomType.Constructor
    private ListenerDefaultActionAuthenticateOidc(
        @CustomType.Parameter("authenticationRequestExtraParams") @Nullable Map<String,String> authenticationRequestExtraParams,
        @CustomType.Parameter("authorizationEndpoint") String authorizationEndpoint,
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("clientSecret") String clientSecret,
        @CustomType.Parameter("issuer") String issuer,
        @CustomType.Parameter("onUnauthenticatedRequest") @Nullable String onUnauthenticatedRequest,
        @CustomType.Parameter("scope") @Nullable String scope,
        @CustomType.Parameter("sessionCookieName") @Nullable String sessionCookieName,
        @CustomType.Parameter("sessionTimeout") @Nullable Integer sessionTimeout,
        @CustomType.Parameter("tokenEndpoint") String tokenEndpoint,
        @CustomType.Parameter("userInfoEndpoint") String userInfoEndpoint) {
        this.authenticationRequestExtraParams = authenticationRequestExtraParams;
        this.authorizationEndpoint = authorizationEndpoint;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.issuer = issuer;
        this.onUnauthenticatedRequest = onUnauthenticatedRequest;
        this.scope = scope;
        this.sessionCookieName = sessionCookieName;
        this.sessionTimeout = sessionTimeout;
        this.tokenEndpoint = tokenEndpoint;
        this.userInfoEndpoint = userInfoEndpoint;
    }

    /**
     * @return Query parameters to include in the redirect request to the authorization endpoint. Max: 10.
     * 
     */
    public Map<String,String> authenticationRequestExtraParams() {
        return this.authenticationRequestExtraParams == null ? Map.of() : this.authenticationRequestExtraParams;
    }
    /**
     * @return Authorization endpoint of the IdP.
     * 
     */
    public String authorizationEndpoint() {
        return this.authorizationEndpoint;
    }
    /**
     * @return OAuth 2.0 client identifier.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return OAuth 2.0 client secret.
     * 
     */
    public String clientSecret() {
        return this.clientSecret;
    }
    /**
     * @return OIDC issuer identifier of the IdP.
     * 
     */
    public String issuer() {
        return this.issuer;
    }
    /**
     * @return Behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
     * 
     */
    public Optional<String> onUnauthenticatedRequest() {
        return Optional.ofNullable(this.onUnauthenticatedRequest);
    }
    /**
     * @return Set of user claims to be requested from the IdP.
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * @return Name of the cookie used to maintain session information.
     * 
     */
    public Optional<String> sessionCookieName() {
        return Optional.ofNullable(this.sessionCookieName);
    }
    /**
     * @return Maximum duration of the authentication session, in seconds.
     * 
     */
    public Optional<Integer> sessionTimeout() {
        return Optional.ofNullable(this.sessionTimeout);
    }
    /**
     * @return Token endpoint of the IdP.
     * 
     */
    public String tokenEndpoint() {
        return this.tokenEndpoint;
    }
    /**
     * @return User info endpoint of the IdP.
     * 
     */
    public String userInfoEndpoint() {
        return this.userInfoEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionAuthenticateOidc defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> authenticationRequestExtraParams;
        private String authorizationEndpoint;
        private String clientId;
        private String clientSecret;
        private String issuer;
        private @Nullable String onUnauthenticatedRequest;
        private @Nullable String scope;
        private @Nullable String sessionCookieName;
        private @Nullable Integer sessionTimeout;
        private String tokenEndpoint;
        private String userInfoEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionAuthenticateOidc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationRequestExtraParams = defaults.authenticationRequestExtraParams;
    	      this.authorizationEndpoint = defaults.authorizationEndpoint;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.issuer = defaults.issuer;
    	      this.onUnauthenticatedRequest = defaults.onUnauthenticatedRequest;
    	      this.scope = defaults.scope;
    	      this.sessionCookieName = defaults.sessionCookieName;
    	      this.sessionTimeout = defaults.sessionTimeout;
    	      this.tokenEndpoint = defaults.tokenEndpoint;
    	      this.userInfoEndpoint = defaults.userInfoEndpoint;
        }

        public Builder authenticationRequestExtraParams(@Nullable Map<String,String> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = authenticationRequestExtraParams;
            return this;
        }
        public Builder authorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint);
            return this;
        }
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        public Builder issuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        public Builder onUnauthenticatedRequest(@Nullable String onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = onUnauthenticatedRequest;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }
        public Builder sessionCookieName(@Nullable String sessionCookieName) {
            this.sessionCookieName = sessionCookieName;
            return this;
        }
        public Builder sessionTimeout(@Nullable Integer sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
            return this;
        }
        public Builder tokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = Objects.requireNonNull(tokenEndpoint);
            return this;
        }
        public Builder userInfoEndpoint(String userInfoEndpoint) {
            this.userInfoEndpoint = Objects.requireNonNull(userInfoEndpoint);
            return this;
        }        public ListenerDefaultActionAuthenticateOidc build() {
            return new ListenerDefaultActionAuthenticateOidc(authenticationRequestExtraParams, authorizationEndpoint, clientId, clientSecret, issuer, onUnauthenticatedRequest, scope, sessionCookieName, sessionTimeout, tokenEndpoint, userInfoEndpoint);
        }
    }
}
