// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerAuthenticateCognitoConfig extends io.pulumi.resources.InvokeArgs {

    public static final ListenerAuthenticateCognitoConfig Empty = new ListenerAuthenticateCognitoConfig();

    @Import(name="authenticationRequestExtraParams")
      private final @Nullable Object authenticationRequestExtraParams;

    public Optional<Object> authenticationRequestExtraParams() {
        return this.authenticationRequestExtraParams == null ? Optional.empty() : Optional.ofNullable(this.authenticationRequestExtraParams);
    }

    @Import(name="onUnauthenticatedRequest")
      private final @Nullable String onUnauthenticatedRequest;

    public Optional<String> onUnauthenticatedRequest() {
        return this.onUnauthenticatedRequest == null ? Optional.empty() : Optional.ofNullable(this.onUnauthenticatedRequest);
    }

    @Import(name="scope")
      private final @Nullable String scope;

    public Optional<String> scope() {
        return this.scope == null ? Optional.empty() : Optional.ofNullable(this.scope);
    }

    @Import(name="sessionCookieName")
      private final @Nullable String sessionCookieName;

    public Optional<String> sessionCookieName() {
        return this.sessionCookieName == null ? Optional.empty() : Optional.ofNullable(this.sessionCookieName);
    }

    @Import(name="sessionTimeout")
      private final @Nullable String sessionTimeout;

    public Optional<String> sessionTimeout() {
        return this.sessionTimeout == null ? Optional.empty() : Optional.ofNullable(this.sessionTimeout);
    }

    @Import(name="userPoolArn", required=true)
      private final String userPoolArn;

    public String userPoolArn() {
        return this.userPoolArn;
    }

    @Import(name="userPoolClientId", required=true)
      private final String userPoolClientId;

    public String userPoolClientId() {
        return this.userPoolClientId;
    }

    @Import(name="userPoolDomain", required=true)
      private final String userPoolDomain;

    public String userPoolDomain() {
        return this.userPoolDomain;
    }

    public ListenerAuthenticateCognitoConfig(
        @Nullable Object authenticationRequestExtraParams,
        @Nullable String onUnauthenticatedRequest,
        @Nullable String scope,
        @Nullable String sessionCookieName,
        @Nullable String sessionTimeout,
        String userPoolArn,
        String userPoolClientId,
        String userPoolDomain) {
        this.authenticationRequestExtraParams = authenticationRequestExtraParams;
        this.onUnauthenticatedRequest = onUnauthenticatedRequest;
        this.scope = scope;
        this.sessionCookieName = sessionCookieName;
        this.sessionTimeout = sessionTimeout;
        this.userPoolArn = Objects.requireNonNull(userPoolArn, "expected parameter 'userPoolArn' to be non-null");
        this.userPoolClientId = Objects.requireNonNull(userPoolClientId, "expected parameter 'userPoolClientId' to be non-null");
        this.userPoolDomain = Objects.requireNonNull(userPoolDomain, "expected parameter 'userPoolDomain' to be non-null");
    }

    private ListenerAuthenticateCognitoConfig() {
        this.authenticationRequestExtraParams = null;
        this.onUnauthenticatedRequest = null;
        this.scope = null;
        this.sessionCookieName = null;
        this.sessionTimeout = null;
        this.userPoolArn = null;
        this.userPoolClientId = null;
        this.userPoolDomain = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerAuthenticateCognitoConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object authenticationRequestExtraParams;
        private @Nullable String onUnauthenticatedRequest;
        private @Nullable String scope;
        private @Nullable String sessionCookieName;
        private @Nullable String sessionTimeout;
        private String userPoolArn;
        private String userPoolClientId;
        private String userPoolDomain;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerAuthenticateCognitoConfig defaults) {
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

        public Builder authenticationRequestExtraParams(@Nullable Object authenticationRequestExtraParams) {
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
        public Builder sessionTimeout(@Nullable String sessionTimeout) {
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
        }        public ListenerAuthenticateCognitoConfig build() {
            return new ListenerAuthenticateCognitoConfig(authenticationRequestExtraParams, onUnauthenticatedRequest, scope, sessionCookieName, sessionTimeout, userPoolArn, userPoolClientId, userPoolDomain);
        }
    }
}
