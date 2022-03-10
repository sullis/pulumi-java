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
public final class ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsProperties {
    private final @Nullable String accessToken;
    private final @Nullable String clientId;
    private final @Nullable String clientSecret;
    private final @Nullable ConnectorProfileConnectorOAuthRequest connectorOAuthRequest;
    private final @Nullable String refreshToken;

    @OutputCustomType.Constructor
    private ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsProperties(
        @OutputCustomType.Parameter("accessToken") @Nullable String accessToken,
        @OutputCustomType.Parameter("clientId") @Nullable String clientId,
        @OutputCustomType.Parameter("clientSecret") @Nullable String clientSecret,
        @OutputCustomType.Parameter("connectorOAuthRequest") @Nullable ConnectorProfileConnectorOAuthRequest connectorOAuthRequest,
        @OutputCustomType.Parameter("refreshToken") @Nullable String refreshToken) {
        this.accessToken = accessToken;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.connectorOAuthRequest = connectorOAuthRequest;
        this.refreshToken = refreshToken;
    }

    public Optional<String> getAccessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    public Optional<String> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    public Optional<String> getClientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    public Optional<ConnectorProfileConnectorOAuthRequest> getConnectorOAuthRequest() {
        return Optional.ofNullable(this.connectorOAuthRequest);
    }
    public Optional<String> getRefreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessToken;
        private @Nullable String clientId;
        private @Nullable String clientSecret;
        private @Nullable ConnectorProfileConnectorOAuthRequest connectorOAuthRequest;
        private @Nullable String refreshToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.connectorOAuthRequest = defaults.connectorOAuthRequest;
    	      this.refreshToken = defaults.refreshToken;
        }

        public Builder setAccessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder setConnectorOAuthRequest(@Nullable ConnectorProfileConnectorOAuthRequest connectorOAuthRequest) {
            this.connectorOAuthRequest = connectorOAuthRequest;
            return this;
        }

        public Builder setRefreshToken(@Nullable String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsProperties build() {
            return new ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsProperties(accessToken, clientId, clientSecret, connectorOAuthRequest, refreshToken);
        }
    }
}
