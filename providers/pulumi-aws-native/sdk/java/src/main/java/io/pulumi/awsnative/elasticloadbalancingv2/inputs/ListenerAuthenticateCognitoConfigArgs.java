// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerAuthenticateCognitoConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerAuthenticateCognitoConfigArgs Empty = new ListenerAuthenticateCognitoConfigArgs();

    @InputImport(name="authenticationRequestExtraParams")
    private final @Nullable Input<Object> authenticationRequestExtraParams;

    public Input<Object> getAuthenticationRequestExtraParams() {
        return this.authenticationRequestExtraParams == null ? Input.empty() : this.authenticationRequestExtraParams;
    }

    @InputImport(name="onUnauthenticatedRequest")
    private final @Nullable Input<String> onUnauthenticatedRequest;

    public Input<String> getOnUnauthenticatedRequest() {
        return this.onUnauthenticatedRequest == null ? Input.empty() : this.onUnauthenticatedRequest;
    }

    @InputImport(name="scope")
    private final @Nullable Input<String> scope;

    public Input<String> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    @InputImport(name="sessionCookieName")
    private final @Nullable Input<String> sessionCookieName;

    public Input<String> getSessionCookieName() {
        return this.sessionCookieName == null ? Input.empty() : this.sessionCookieName;
    }

    @InputImport(name="sessionTimeout")
    private final @Nullable Input<String> sessionTimeout;

    public Input<String> getSessionTimeout() {
        return this.sessionTimeout == null ? Input.empty() : this.sessionTimeout;
    }

    @InputImport(name="userPoolArn", required=true)
    private final Input<String> userPoolArn;

    public Input<String> getUserPoolArn() {
        return this.userPoolArn;
    }

    @InputImport(name="userPoolClientId", required=true)
    private final Input<String> userPoolClientId;

    public Input<String> getUserPoolClientId() {
        return this.userPoolClientId;
    }

    @InputImport(name="userPoolDomain", required=true)
    private final Input<String> userPoolDomain;

    public Input<String> getUserPoolDomain() {
        return this.userPoolDomain;
    }

    public ListenerAuthenticateCognitoConfigArgs(
        @Nullable Input<Object> authenticationRequestExtraParams,
        @Nullable Input<String> onUnauthenticatedRequest,
        @Nullable Input<String> scope,
        @Nullable Input<String> sessionCookieName,
        @Nullable Input<String> sessionTimeout,
        Input<String> userPoolArn,
        Input<String> userPoolClientId,
        Input<String> userPoolDomain) {
        this.authenticationRequestExtraParams = authenticationRequestExtraParams;
        this.onUnauthenticatedRequest = onUnauthenticatedRequest;
        this.scope = scope;
        this.sessionCookieName = sessionCookieName;
        this.sessionTimeout = sessionTimeout;
        this.userPoolArn = Objects.requireNonNull(userPoolArn, "expected parameter 'userPoolArn' to be non-null");
        this.userPoolClientId = Objects.requireNonNull(userPoolClientId, "expected parameter 'userPoolClientId' to be non-null");
        this.userPoolDomain = Objects.requireNonNull(userPoolDomain, "expected parameter 'userPoolDomain' to be non-null");
    }

    private ListenerAuthenticateCognitoConfigArgs() {
        this.authenticationRequestExtraParams = Input.empty();
        this.onUnauthenticatedRequest = Input.empty();
        this.scope = Input.empty();
        this.sessionCookieName = Input.empty();
        this.sessionTimeout = Input.empty();
        this.userPoolArn = Input.empty();
        this.userPoolClientId = Input.empty();
        this.userPoolDomain = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerAuthenticateCognitoConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> authenticationRequestExtraParams;
        private @Nullable Input<String> onUnauthenticatedRequest;
        private @Nullable Input<String> scope;
        private @Nullable Input<String> sessionCookieName;
        private @Nullable Input<String> sessionTimeout;
        private Input<String> userPoolArn;
        private Input<String> userPoolClientId;
        private Input<String> userPoolDomain;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerAuthenticateCognitoConfigArgs defaults) {
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

        public Builder setAuthenticationRequestExtraParams(@Nullable Input<Object> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = authenticationRequestExtraParams;
            return this;
        }

        public Builder setAuthenticationRequestExtraParams(@Nullable Object authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = Input.ofNullable(authenticationRequestExtraParams);
            return this;
        }

        public Builder setOnUnauthenticatedRequest(@Nullable Input<String> onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = onUnauthenticatedRequest;
            return this;
        }

        public Builder setOnUnauthenticatedRequest(@Nullable String onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = Input.ofNullable(onUnauthenticatedRequest);
            return this;
        }

        public Builder setScope(@Nullable Input<String> scope) {
            this.scope = scope;
            return this;
        }

        public Builder setScope(@Nullable String scope) {
            this.scope = Input.ofNullable(scope);
            return this;
        }

        public Builder setSessionCookieName(@Nullable Input<String> sessionCookieName) {
            this.sessionCookieName = sessionCookieName;
            return this;
        }

        public Builder setSessionCookieName(@Nullable String sessionCookieName) {
            this.sessionCookieName = Input.ofNullable(sessionCookieName);
            return this;
        }

        public Builder setSessionTimeout(@Nullable Input<String> sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        public Builder setSessionTimeout(@Nullable String sessionTimeout) {
            this.sessionTimeout = Input.ofNullable(sessionTimeout);
            return this;
        }

        public Builder setUserPoolArn(Input<String> userPoolArn) {
            this.userPoolArn = Objects.requireNonNull(userPoolArn);
            return this;
        }

        public Builder setUserPoolArn(String userPoolArn) {
            this.userPoolArn = Input.of(Objects.requireNonNull(userPoolArn));
            return this;
        }

        public Builder setUserPoolClientId(Input<String> userPoolClientId) {
            this.userPoolClientId = Objects.requireNonNull(userPoolClientId);
            return this;
        }

        public Builder setUserPoolClientId(String userPoolClientId) {
            this.userPoolClientId = Input.of(Objects.requireNonNull(userPoolClientId));
            return this;
        }

        public Builder setUserPoolDomain(Input<String> userPoolDomain) {
            this.userPoolDomain = Objects.requireNonNull(userPoolDomain);
            return this;
        }

        public Builder setUserPoolDomain(String userPoolDomain) {
            this.userPoolDomain = Input.of(Objects.requireNonNull(userPoolDomain));
            return this;
        }

        public ListenerAuthenticateCognitoConfigArgs build() {
            return new ListenerAuthenticateCognitoConfigArgs(authenticationRequestExtraParams, onUnauthenticatedRequest, scope, sessionCookieName, sessionTimeout, userPoolArn, userPoolClientId, userPoolDomain);
        }
    }
}
