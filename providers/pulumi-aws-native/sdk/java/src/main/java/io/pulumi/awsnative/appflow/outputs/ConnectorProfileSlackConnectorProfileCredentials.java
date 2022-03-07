// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.awsnative.appflow.outputs.ConnectorProfileConnectorOAuthRequest;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectorProfileSlackConnectorProfileCredentials {
    /**
     * The credentials used to access protected resources.
     * 
     */
    private final @Nullable String accessToken;
    /**
     * The identiﬁer for the desired client.
     * 
     */
    private final String clientId;
    /**
     * The client secret used by the oauth client to authenticate to the authorization server.
     * 
     */
    private final String clientSecret;
    /**
     * The oauth needed to request security tokens from the connector endpoint.
     * 
     */
    private final @Nullable ConnectorProfileConnectorOAuthRequest connectorOAuthRequest;

    @OutputCustomType.Constructor({"accessToken","clientId","clientSecret","connectorOAuthRequest"})
    private ConnectorProfileSlackConnectorProfileCredentials(
        @Nullable String accessToken,
        String clientId,
        String clientSecret,
        @Nullable ConnectorProfileConnectorOAuthRequest connectorOAuthRequest) {
        this.accessToken = accessToken;
        this.clientId = Objects.requireNonNull(clientId);
        this.clientSecret = Objects.requireNonNull(clientSecret);
        this.connectorOAuthRequest = connectorOAuthRequest;
    }

    /**
     * The credentials used to access protected resources.
     * 
    */
    public Optional<String> getAccessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * The identiﬁer for the desired client.
     * 
    */
    public String getClientId() {
        return this.clientId;
    }
    /**
     * The client secret used by the oauth client to authenticate to the authorization server.
     * 
    */
    public String getClientSecret() {
        return this.clientSecret;
    }
    /**
     * The oauth needed to request security tokens from the connector endpoint.
     * 
    */
    public Optional<ConnectorProfileConnectorOAuthRequest> getConnectorOAuthRequest() {
        return Optional.ofNullable(this.connectorOAuthRequest);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileSlackConnectorProfileCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessToken;
        private String clientId;
        private String clientSecret;
        private @Nullable ConnectorProfileConnectorOAuthRequest connectorOAuthRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileSlackConnectorProfileCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.connectorOAuthRequest = defaults.connectorOAuthRequest;
        }

        public Builder setAccessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setClientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }

        public Builder setConnectorOAuthRequest(@Nullable ConnectorProfileConnectorOAuthRequest connectorOAuthRequest) {
            this.connectorOAuthRequest = connectorOAuthRequest;
            return this;
        }
        public ConnectorProfileSlackConnectorProfileCredentials build() {
            return new ConnectorProfileSlackConnectorProfileCredentials(accessToken, clientId, clientSecret, connectorOAuthRequest);
        }
    }
}