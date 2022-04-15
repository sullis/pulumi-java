// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerRuleActionAuthenticateCognito {
    /**
     * The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
     * 
     */
    private final @Nullable Map<String,String> authenticationRequestExtraParams;
    /**
     * The behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
     * 
     */
    private final @Nullable String onUnauthenticatedRequest;
    /**
     * The set of user claims to be requested from the IdP.
     * 
     */
    private final @Nullable String scope;
    /**
     * The name of the cookie used to maintain session information.
     * 
     */
    private final @Nullable String sessionCookieName;
    /**
     * The maximum duration of the authentication session, in seconds.
     * 
     */
    private final @Nullable Integer sessionTimeout;
    /**
     * The ARN of the Cognito user pool.
     * 
     */
    private final String userPoolArn;
    /**
     * The ID of the Cognito user pool client.
     * 
     */
    private final String userPoolClientId;
    /**
     * The domain prefix or fully-qualified domain name of the Cognito user pool.
     * 
     */
    private final String userPoolDomain;

    @CustomType.Constructor
    private ListenerRuleActionAuthenticateCognito(
        @CustomType.Parameter("authenticationRequestExtraParams") @Nullable Map<String,String> authenticationRequestExtraParams,
        @CustomType.Parameter("onUnauthenticatedRequest") @Nullable String onUnauthenticatedRequest,
        @CustomType.Parameter("scope") @Nullable String scope,
        @CustomType.Parameter("sessionCookieName") @Nullable String sessionCookieName,
        @CustomType.Parameter("sessionTimeout") @Nullable Integer sessionTimeout,
        @CustomType.Parameter("userPoolArn") String userPoolArn,
        @CustomType.Parameter("userPoolClientId") String userPoolClientId,
        @CustomType.Parameter("userPoolDomain") String userPoolDomain) {
        this.authenticationRequestExtraParams = authenticationRequestExtraParams;
        this.onUnauthenticatedRequest = onUnauthenticatedRequest;
        this.scope = scope;
        this.sessionCookieName = sessionCookieName;
        this.sessionTimeout = sessionTimeout;
        this.userPoolArn = userPoolArn;
        this.userPoolClientId = userPoolClientId;
        this.userPoolDomain = userPoolDomain;
    }

    /**
     * The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
     * 
    */
    public Map<String,String> authenticationRequestExtraParams() {
        return this.authenticationRequestExtraParams == null ? Map.of() : this.authenticationRequestExtraParams;
    }
    /**
     * The behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
     * 
    */
    public Optional<String> onUnauthenticatedRequest() {
        return Optional.ofNullable(this.onUnauthenticatedRequest);
    }
    /**
     * The set of user claims to be requested from the IdP.
     * 
    */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * The name of the cookie used to maintain session information.
     * 
    */
    public Optional<String> sessionCookieName() {
        return Optional.ofNullable(this.sessionCookieName);
    }
    /**
     * The maximum duration of the authentication session, in seconds.
     * 
    */
    public Optional<Integer> sessionTimeout() {
        return Optional.ofNullable(this.sessionTimeout);
    }
    /**
     * The ARN of the Cognito user pool.
     * 
    */
    public String userPoolArn() {
        return this.userPoolArn;
    }
    /**
     * The ID of the Cognito user pool client.
     * 
    */
    public String userPoolClientId() {
        return this.userPoolClientId;
    }
    /**
     * The domain prefix or fully-qualified domain name of the Cognito user pool.
     * 
    */
    public String userPoolDomain() {
        return this.userPoolDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionAuthenticateCognito defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> authenticationRequestExtraParams;
        private @Nullable String onUnauthenticatedRequest;
        private @Nullable String scope;
        private @Nullable String sessionCookieName;
        private @Nullable Integer sessionTimeout;
        private String userPoolArn;
        private String userPoolClientId;
        private String userPoolDomain;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleActionAuthenticateCognito defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationRequestExtraParams = defaults.authenticationRequestExtraParams;
    	      this.onUnauthenticatedRequest = defaults.onUnauthenticatedRequest;
    	      this.scope = defaults.scope;
    	      this.sessionCookieName = defaults.sessionCookieName;
    	      this.sessionTimeout = defaults.sessionTimeout;
    	      this.userPoolArn = defaults.userPoolArn;
    	      this.userPoolClientId = defaults.userPoolClientId;
    	      this.userPoolDomain = defaults.userPoolDomain;
        }

        public Builder authenticationRequestExtraParams(@Nullable Map<String,String> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = authenticationRequestExtraParams;
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
        public Builder userPoolArn(String userPoolArn) {
            this.userPoolArn = Objects.requireNonNull(userPoolArn);
            return this;
        }
        public Builder userPoolClientId(String userPoolClientId) {
            this.userPoolClientId = Objects.requireNonNull(userPoolClientId);
            return this;
        }
        public Builder userPoolDomain(String userPoolDomain) {
            this.userPoolDomain = Objects.requireNonNull(userPoolDomain);
            return this;
        }        public ListenerRuleActionAuthenticateCognito build() {
            return new ListenerRuleActionAuthenticateCognito(authenticationRequestExtraParams, onUnauthenticatedRequest, scope, sessionCookieName, sessionTimeout, userPoolArn, userPoolClientId, userPoolDomain);
        }
    }
}
