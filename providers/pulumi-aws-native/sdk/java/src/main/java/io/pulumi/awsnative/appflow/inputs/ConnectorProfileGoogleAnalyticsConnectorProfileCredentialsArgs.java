// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.inputs.ConnectorProfileConnectorOAuthRequestArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorProfileGoogleAnalyticsConnectorProfileCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileGoogleAnalyticsConnectorProfileCredentialsArgs Empty = new ConnectorProfileGoogleAnalyticsConnectorProfileCredentialsArgs();

    /**
     * The credentials used to access protected resources.
     * 
     */
    @InputImport(name="accessToken")
    private final @Nullable Input<String> accessToken;

    public Input<String> getAccessToken() {
        return this.accessToken == null ? Input.empty() : this.accessToken;
    }

    /**
     * The identiﬁer for the desired client.
     * 
     */
    @InputImport(name="clientId", required=true)
    private final Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId;
    }

    /**
     * The client secret used by the oauth client to authenticate to the authorization server.
     * 
     */
    @InputImport(name="clientSecret", required=true)
    private final Input<String> clientSecret;

    public Input<String> getClientSecret() {
        return this.clientSecret;
    }

    /**
     * The oauth needed to request security tokens from the connector endpoint.
     * 
     */
    @InputImport(name="connectorOAuthRequest")
    private final @Nullable Input<ConnectorProfileConnectorOAuthRequestArgs> connectorOAuthRequest;

    public Input<ConnectorProfileConnectorOAuthRequestArgs> getConnectorOAuthRequest() {
        return this.connectorOAuthRequest == null ? Input.empty() : this.connectorOAuthRequest;
    }

    /**
     * The credentials used to acquire new access tokens.
     * 
     */
    @InputImport(name="refreshToken")
    private final @Nullable Input<String> refreshToken;

    public Input<String> getRefreshToken() {
        return this.refreshToken == null ? Input.empty() : this.refreshToken;
    }

    public ConnectorProfileGoogleAnalyticsConnectorProfileCredentialsArgs(
        @Nullable Input<String> accessToken,
        Input<String> clientId,
        Input<String> clientSecret,
        @Nullable Input<ConnectorProfileConnectorOAuthRequestArgs> connectorOAuthRequest,
        @Nullable Input<String> refreshToken) {
        this.accessToken = accessToken;
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.clientSecret = Objects.requireNonNull(clientSecret, "expected parameter 'clientSecret' to be non-null");
        this.connectorOAuthRequest = connectorOAuthRequest;
        this.refreshToken = refreshToken;
    }

    private ConnectorProfileGoogleAnalyticsConnectorProfileCredentialsArgs() {
        this.accessToken = Input.empty();
        this.clientId = Input.empty();
        this.clientSecret = Input.empty();
        this.connectorOAuthRequest = Input.empty();
        this.refreshToken = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileGoogleAnalyticsConnectorProfileCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessToken;
        private Input<String> clientId;
        private Input<String> clientSecret;
        private @Nullable Input<ConnectorProfileConnectorOAuthRequestArgs> connectorOAuthRequest;
        private @Nullable Input<String> refreshToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileGoogleAnalyticsConnectorProfileCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.connectorOAuthRequest = defaults.connectorOAuthRequest;
    	      this.refreshToken = defaults.refreshToken;
        }

        public Builder setAccessToken(@Nullable Input<String> accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setAccessToken(@Nullable String accessToken) {
            this.accessToken = Input.ofNullable(accessToken);
            return this;
        }

        public Builder setClientId(Input<String> clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Input.of(Objects.requireNonNull(clientId));
            return this;
        }

        public Builder setClientSecret(Input<String> clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }

        public Builder setClientSecret(String clientSecret) {
            this.clientSecret = Input.of(Objects.requireNonNull(clientSecret));
            return this;
        }

        public Builder setConnectorOAuthRequest(@Nullable Input<ConnectorProfileConnectorOAuthRequestArgs> connectorOAuthRequest) {
            this.connectorOAuthRequest = connectorOAuthRequest;
            return this;
        }

        public Builder setConnectorOAuthRequest(@Nullable ConnectorProfileConnectorOAuthRequestArgs connectorOAuthRequest) {
            this.connectorOAuthRequest = Input.ofNullable(connectorOAuthRequest);
            return this;
        }

        public Builder setRefreshToken(@Nullable Input<String> refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        public Builder setRefreshToken(@Nullable String refreshToken) {
            this.refreshToken = Input.ofNullable(refreshToken);
            return this;
        }

        public ConnectorProfileGoogleAnalyticsConnectorProfileCredentialsArgs build() {
            return new ConnectorProfileGoogleAnalyticsConnectorProfileCredentialsArgs(accessToken, clientId, clientSecret, connectorOAuthRequest, refreshToken);
        }
    }
}
