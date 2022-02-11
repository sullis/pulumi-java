// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListenerRuleAuthenticateCognitoConfig {
    private final @Nullable Object authenticationRequestExtraParams;
    private final @Nullable String onUnauthenticatedRequest;
    private final @Nullable String scope;
    private final @Nullable String sessionCookieName;
    private final @Nullable Integer sessionTimeout;
    private final String userPoolArn;
    private final String userPoolClientId;
    private final String userPoolDomain;

    @OutputCustomType.Constructor({"authenticationRequestExtraParams","onUnauthenticatedRequest","scope","sessionCookieName","sessionTimeout","userPoolArn","userPoolClientId","userPoolDomain"})
    private ListenerRuleAuthenticateCognitoConfig(
        @Nullable Object authenticationRequestExtraParams,
        @Nullable String onUnauthenticatedRequest,
        @Nullable String scope,
        @Nullable String sessionCookieName,
        @Nullable Integer sessionTimeout,
        String userPoolArn,
        String userPoolClientId,
        String userPoolDomain) {
        this.authenticationRequestExtraParams = authenticationRequestExtraParams;
        this.onUnauthenticatedRequest = onUnauthenticatedRequest;
        this.scope = scope;
        this.sessionCookieName = sessionCookieName;
        this.sessionTimeout = sessionTimeout;
        this.userPoolArn = Objects.requireNonNull(userPoolArn);
        this.userPoolClientId = Objects.requireNonNull(userPoolClientId);
        this.userPoolDomain = Objects.requireNonNull(userPoolDomain);
    }

    public Optional<Object> getAuthenticationRequestExtraParams() {
        return Optional.ofNullable(this.authenticationRequestExtraParams);
    }
    public Optional<String> getOnUnauthenticatedRequest() {
        return Optional.ofNullable(this.onUnauthenticatedRequest);
    }
    public Optional<String> getScope() {
        return Optional.ofNullable(this.scope);
    }
    public Optional<String> getSessionCookieName() {
        return Optional.ofNullable(this.sessionCookieName);
    }
    public Optional<Integer> getSessionTimeout() {
        return Optional.ofNullable(this.sessionTimeout);
    }
    public String getUserPoolArn() {
        return this.userPoolArn;
    }
    public String getUserPoolClientId() {
        return this.userPoolClientId;
    }
    public String getUserPoolDomain() {
        return this.userPoolDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleAuthenticateCognitoConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object authenticationRequestExtraParams;
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

        public Builder(ListenerRuleAuthenticateCognitoConfig defaults) {
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

        public Builder setAuthenticationRequestExtraParams(@Nullable Object authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = authenticationRequestExtraParams;
            return this;
        }

        public Builder setOnUnauthenticatedRequest(@Nullable String onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = onUnauthenticatedRequest;
            return this;
        }

        public Builder setScope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }

        public Builder setSessionCookieName(@Nullable String sessionCookieName) {
            this.sessionCookieName = sessionCookieName;
            return this;
        }

        public Builder setSessionTimeout(@Nullable Integer sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        public Builder setUserPoolArn(String userPoolArn) {
            this.userPoolArn = Objects.requireNonNull(userPoolArn);
            return this;
        }

        public Builder setUserPoolClientId(String userPoolClientId) {
            this.userPoolClientId = Objects.requireNonNull(userPoolClientId);
            return this;
        }

        public Builder setUserPoolDomain(String userPoolDomain) {
            this.userPoolDomain = Objects.requireNonNull(userPoolDomain);
            return this;
        }

        public ListenerRuleAuthenticateCognitoConfig build() {
            return new ListenerRuleAuthenticateCognitoConfig(authenticationRequestExtraParams, onUnauthenticatedRequest, scope, sessionCookieName, sessionTimeout, userPoolArn, userPoolClientId, userPoolDomain);
        }
    }
}
