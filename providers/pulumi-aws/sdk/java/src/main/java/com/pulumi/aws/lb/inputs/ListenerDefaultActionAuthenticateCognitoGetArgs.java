// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerDefaultActionAuthenticateCognitoGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerDefaultActionAuthenticateCognitoGetArgs Empty = new ListenerDefaultActionAuthenticateCognitoGetArgs();

    /**
     * Query parameters to include in the redirect request to the authorization endpoint. Max: 10.
     * 
     */
    @Import(name="authenticationRequestExtraParams")
    private @Nullable Output<Map<String,String>> authenticationRequestExtraParams;

    /**
     * @return Query parameters to include in the redirect request to the authorization endpoint. Max: 10.
     * 
     */
    public Optional<Output<Map<String,String>>> authenticationRequestExtraParams() {
        return Optional.ofNullable(this.authenticationRequestExtraParams);
    }

    /**
     * Behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
     * 
     */
    @Import(name="onUnauthenticatedRequest")
    private @Nullable Output<String> onUnauthenticatedRequest;

    /**
     * @return Behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
     * 
     */
    public Optional<Output<String>> onUnauthenticatedRequest() {
        return Optional.ofNullable(this.onUnauthenticatedRequest);
    }

    /**
     * Set of user claims to be requested from the IdP.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return Set of user claims to be requested from the IdP.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * Name of the cookie used to maintain session information.
     * 
     */
    @Import(name="sessionCookieName")
    private @Nullable Output<String> sessionCookieName;

    /**
     * @return Name of the cookie used to maintain session information.
     * 
     */
    public Optional<Output<String>> sessionCookieName() {
        return Optional.ofNullable(this.sessionCookieName);
    }

    /**
     * Maximum duration of the authentication session, in seconds.
     * 
     */
    @Import(name="sessionTimeout")
    private @Nullable Output<Integer> sessionTimeout;

    /**
     * @return Maximum duration of the authentication session, in seconds.
     * 
     */
    public Optional<Output<Integer>> sessionTimeout() {
        return Optional.ofNullable(this.sessionTimeout);
    }

    /**
     * ARN of the Cognito user pool.
     * 
     */
    @Import(name="userPoolArn", required=true)
    private Output<String> userPoolArn;

    /**
     * @return ARN of the Cognito user pool.
     * 
     */
    public Output<String> userPoolArn() {
        return this.userPoolArn;
    }

    /**
     * ID of the Cognito user pool client.
     * 
     */
    @Import(name="userPoolClientId", required=true)
    private Output<String> userPoolClientId;

    /**
     * @return ID of the Cognito user pool client.
     * 
     */
    public Output<String> userPoolClientId() {
        return this.userPoolClientId;
    }

    /**
     * Domain prefix or fully-qualified domain name of the Cognito user pool.
     * 
     */
    @Import(name="userPoolDomain", required=true)
    private Output<String> userPoolDomain;

    /**
     * @return Domain prefix or fully-qualified domain name of the Cognito user pool.
     * 
     */
    public Output<String> userPoolDomain() {
        return this.userPoolDomain;
    }

    private ListenerDefaultActionAuthenticateCognitoGetArgs() {}

    private ListenerDefaultActionAuthenticateCognitoGetArgs(ListenerDefaultActionAuthenticateCognitoGetArgs $) {
        this.authenticationRequestExtraParams = $.authenticationRequestExtraParams;
        this.onUnauthenticatedRequest = $.onUnauthenticatedRequest;
        this.scope = $.scope;
        this.sessionCookieName = $.sessionCookieName;
        this.sessionTimeout = $.sessionTimeout;
        this.userPoolArn = $.userPoolArn;
        this.userPoolClientId = $.userPoolClientId;
        this.userPoolDomain = $.userPoolDomain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerDefaultActionAuthenticateCognitoGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerDefaultActionAuthenticateCognitoGetArgs $;

        public Builder() {
            $ = new ListenerDefaultActionAuthenticateCognitoGetArgs();
        }

        public Builder(ListenerDefaultActionAuthenticateCognitoGetArgs defaults) {
            $ = new ListenerDefaultActionAuthenticateCognitoGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationRequestExtraParams Query parameters to include in the redirect request to the authorization endpoint. Max: 10.
         * 
         * @return builder
         * 
         */
        public Builder authenticationRequestExtraParams(@Nullable Output<Map<String,String>> authenticationRequestExtraParams) {
            $.authenticationRequestExtraParams = authenticationRequestExtraParams;
            return this;
        }

        /**
         * @param authenticationRequestExtraParams Query parameters to include in the redirect request to the authorization endpoint. Max: 10.
         * 
         * @return builder
         * 
         */
        public Builder authenticationRequestExtraParams(Map<String,String> authenticationRequestExtraParams) {
            return authenticationRequestExtraParams(Output.of(authenticationRequestExtraParams));
        }

        /**
         * @param onUnauthenticatedRequest Behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
         * 
         * @return builder
         * 
         */
        public Builder onUnauthenticatedRequest(@Nullable Output<String> onUnauthenticatedRequest) {
            $.onUnauthenticatedRequest = onUnauthenticatedRequest;
            return this;
        }

        /**
         * @param onUnauthenticatedRequest Behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
         * 
         * @return builder
         * 
         */
        public Builder onUnauthenticatedRequest(String onUnauthenticatedRequest) {
            return onUnauthenticatedRequest(Output.of(onUnauthenticatedRequest));
        }

        /**
         * @param scope Set of user claims to be requested from the IdP.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Set of user claims to be requested from the IdP.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param sessionCookieName Name of the cookie used to maintain session information.
         * 
         * @return builder
         * 
         */
        public Builder sessionCookieName(@Nullable Output<String> sessionCookieName) {
            $.sessionCookieName = sessionCookieName;
            return this;
        }

        /**
         * @param sessionCookieName Name of the cookie used to maintain session information.
         * 
         * @return builder
         * 
         */
        public Builder sessionCookieName(String sessionCookieName) {
            return sessionCookieName(Output.of(sessionCookieName));
        }

        /**
         * @param sessionTimeout Maximum duration of the authentication session, in seconds.
         * 
         * @return builder
         * 
         */
        public Builder sessionTimeout(@Nullable Output<Integer> sessionTimeout) {
            $.sessionTimeout = sessionTimeout;
            return this;
        }

        /**
         * @param sessionTimeout Maximum duration of the authentication session, in seconds.
         * 
         * @return builder
         * 
         */
        public Builder sessionTimeout(Integer sessionTimeout) {
            return sessionTimeout(Output.of(sessionTimeout));
        }

        /**
         * @param userPoolArn ARN of the Cognito user pool.
         * 
         * @return builder
         * 
         */
        public Builder userPoolArn(Output<String> userPoolArn) {
            $.userPoolArn = userPoolArn;
            return this;
        }

        /**
         * @param userPoolArn ARN of the Cognito user pool.
         * 
         * @return builder
         * 
         */
        public Builder userPoolArn(String userPoolArn) {
            return userPoolArn(Output.of(userPoolArn));
        }

        /**
         * @param userPoolClientId ID of the Cognito user pool client.
         * 
         * @return builder
         * 
         */
        public Builder userPoolClientId(Output<String> userPoolClientId) {
            $.userPoolClientId = userPoolClientId;
            return this;
        }

        /**
         * @param userPoolClientId ID of the Cognito user pool client.
         * 
         * @return builder
         * 
         */
        public Builder userPoolClientId(String userPoolClientId) {
            return userPoolClientId(Output.of(userPoolClientId));
        }

        /**
         * @param userPoolDomain Domain prefix or fully-qualified domain name of the Cognito user pool.
         * 
         * @return builder
         * 
         */
        public Builder userPoolDomain(Output<String> userPoolDomain) {
            $.userPoolDomain = userPoolDomain;
            return this;
        }

        /**
         * @param userPoolDomain Domain prefix or fully-qualified domain name of the Cognito user pool.
         * 
         * @return builder
         * 
         */
        public Builder userPoolDomain(String userPoolDomain) {
            return userPoolDomain(Output.of(userPoolDomain));
        }

        public ListenerDefaultActionAuthenticateCognitoGetArgs build() {
            $.userPoolArn = Objects.requireNonNull($.userPoolArn, "expected parameter 'userPoolArn' to be non-null");
            $.userPoolClientId = Objects.requireNonNull($.userPoolClientId, "expected parameter 'userPoolClientId' to be non-null");
            $.userPoolDomain = Objects.requireNonNull($.userPoolDomain, "expected parameter 'userPoolDomain' to be non-null");
            return $;
        }
    }

}
