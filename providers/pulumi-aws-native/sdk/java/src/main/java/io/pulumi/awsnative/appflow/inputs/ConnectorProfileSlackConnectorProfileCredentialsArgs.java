// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.inputs.ConnectorProfileConnectorOAuthRequestArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorProfileSlackConnectorProfileCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileSlackConnectorProfileCredentialsArgs Empty = new ConnectorProfileSlackConnectorProfileCredentialsArgs();

    /**
     * The credentials used to access protected resources.
     * 
     */
    @Import(name="accessToken")
      private final @Nullable Output<String> accessToken;

    public Output<String> accessToken() {
        return this.accessToken == null ? Codegen.empty() : this.accessToken;
    }

    /**
     * The identiﬁer for the desired client.
     * 
     */
    @Import(name="clientId", required=true)
      private final Output<String> clientId;

    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * The client secret used by the oauth client to authenticate to the authorization server.
     * 
     */
    @Import(name="clientSecret", required=true)
      private final Output<String> clientSecret;

    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    /**
     * The oauth needed to request security tokens from the connector endpoint.
     * 
     */
    @Import(name="connectorOAuthRequest")
      private final @Nullable Output<ConnectorProfileConnectorOAuthRequestArgs> connectorOAuthRequest;

    public Output<ConnectorProfileConnectorOAuthRequestArgs> connectorOAuthRequest() {
        return this.connectorOAuthRequest == null ? Codegen.empty() : this.connectorOAuthRequest;
    }

    public ConnectorProfileSlackConnectorProfileCredentialsArgs(
        @Nullable Output<String> accessToken,
        Output<String> clientId,
        Output<String> clientSecret,
        @Nullable Output<ConnectorProfileConnectorOAuthRequestArgs> connectorOAuthRequest) {
        this.accessToken = accessToken;
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.clientSecret = Objects.requireNonNull(clientSecret, "expected parameter 'clientSecret' to be non-null");
        this.connectorOAuthRequest = connectorOAuthRequest;
    }

    private ConnectorProfileSlackConnectorProfileCredentialsArgs() {
        this.accessToken = Codegen.empty();
        this.clientId = Codegen.empty();
        this.clientSecret = Codegen.empty();
        this.connectorOAuthRequest = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileSlackConnectorProfileCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessToken;
        private Output<String> clientId;
        private Output<String> clientSecret;
        private @Nullable Output<ConnectorProfileConnectorOAuthRequestArgs> connectorOAuthRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileSlackConnectorProfileCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.connectorOAuthRequest = defaults.connectorOAuthRequest;
        }

        public Builder accessToken(@Nullable Output<String> accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = Codegen.ofNullable(accessToken);
            return this;
        }
        public Builder clientId(Output<String> clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder clientId(String clientId) {
            this.clientId = Output.of(Objects.requireNonNull(clientId));
            return this;
        }
        public Builder clientSecret(Output<String> clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Output.of(Objects.requireNonNull(clientSecret));
            return this;
        }
        public Builder connectorOAuthRequest(@Nullable Output<ConnectorProfileConnectorOAuthRequestArgs> connectorOAuthRequest) {
            this.connectorOAuthRequest = connectorOAuthRequest;
            return this;
        }
        public Builder connectorOAuthRequest(@Nullable ConnectorProfileConnectorOAuthRequestArgs connectorOAuthRequest) {
            this.connectorOAuthRequest = Codegen.ofNullable(connectorOAuthRequest);
            return this;
        }        public ConnectorProfileSlackConnectorProfileCredentialsArgs build() {
            return new ConnectorProfileSlackConnectorProfileCredentialsArgs(accessToken, clientId, clientSecret, connectorOAuthRequest);
        }
    }
}
