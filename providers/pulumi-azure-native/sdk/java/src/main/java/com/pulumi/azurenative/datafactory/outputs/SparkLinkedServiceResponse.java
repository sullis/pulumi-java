// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SparkLinkedServiceResponse {
    /**
     * @return Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     * 
     */
    private final @Nullable Object allowHostNameCNMismatch;
    /**
     * @return Specifies whether to allow self-signed certificates from the server. The default value is false.
     * 
     */
    private final @Nullable Object allowSelfSignedServerCert;
    /**
     * @return List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * @return The authentication method used to access the Spark server.
     * 
     */
    private final String authenticationType;
    /**
     * @return The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * @return Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Specifies whether the connections to the server are encrypted using SSL. The default value is false.
     * 
     */
    private final @Nullable Object enableSsl;
    /**
     * @return The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * @return IP address or host name of the Spark server
     * 
     */
    private final Object host;
    /**
     * @return The partial URL corresponding to the Spark server.
     * 
     */
    private final @Nullable Object httpPath;
    /**
     * @return Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * @return The password corresponding to the user name that you provided in the Username field
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    /**
     * @return The TCP port that the Spark server uses to listen for client connections.
     * 
     */
    private final Object port;
    /**
     * @return The type of Spark server.
     * 
     */
    private final @Nullable String serverType;
    /**
     * @return The transport protocol to use in the Thrift layer.
     * 
     */
    private final @Nullable String thriftTransportProtocol;
    /**
     * @return The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
     */
    private final @Nullable Object trustedCertPath;
    /**
     * @return Type of linked service.
     * Expected value is &#39;Spark&#39;.
     * 
     */
    private final String type;
    /**
     * @return Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     * 
     */
    private final @Nullable Object useSystemTrustStore;
    /**
     * @return The user name that you use to access Spark Server.
     * 
     */
    private final @Nullable Object username;

    @CustomType.Constructor
    private SparkLinkedServiceResponse(
        @CustomType.Parameter("allowHostNameCNMismatch") @Nullable Object allowHostNameCNMismatch,
        @CustomType.Parameter("allowSelfSignedServerCert") @Nullable Object allowSelfSignedServerCert,
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("authenticationType") String authenticationType,
        @CustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("enableSsl") @Nullable Object enableSsl,
        @CustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @CustomType.Parameter("host") Object host,
        @CustomType.Parameter("httpPath") @Nullable Object httpPath,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("password") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @CustomType.Parameter("port") Object port,
        @CustomType.Parameter("serverType") @Nullable String serverType,
        @CustomType.Parameter("thriftTransportProtocol") @Nullable String thriftTransportProtocol,
        @CustomType.Parameter("trustedCertPath") @Nullable Object trustedCertPath,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("useSystemTrustStore") @Nullable Object useSystemTrustStore,
        @CustomType.Parameter("username") @Nullable Object username) {
        this.allowHostNameCNMismatch = allowHostNameCNMismatch;
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
        this.annotations = annotations;
        this.authenticationType = authenticationType;
        this.connectVia = connectVia;
        this.description = description;
        this.enableSsl = enableSsl;
        this.encryptedCredential = encryptedCredential;
        this.host = host;
        this.httpPath = httpPath;
        this.parameters = parameters;
        this.password = password;
        this.port = port;
        this.serverType = serverType;
        this.thriftTransportProtocol = thriftTransportProtocol;
        this.trustedCertPath = trustedCertPath;
        this.type = type;
        this.useSystemTrustStore = useSystemTrustStore;
        this.username = username;
    }

    /**
     * @return Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     * 
     */
    public Optional<Object> allowHostNameCNMismatch() {
        return Optional.ofNullable(this.allowHostNameCNMismatch);
    }
    /**
     * @return Specifies whether to allow self-signed certificates from the server. The default value is false.
     * 
     */
    public Optional<Object> allowSelfSignedServerCert() {
        return Optional.ofNullable(this.allowSelfSignedServerCert);
    }
    /**
     * @return List of tags that can be used for describing the linked service.
     * 
     */
    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * @return The authentication method used to access the Spark server.
     * 
     */
    public String authenticationType() {
        return this.authenticationType;
    }
    /**
     * @return The integration runtime reference.
     * 
     */
    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * @return Linked service description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Specifies whether the connections to the server are encrypted using SSL. The default value is false.
     * 
     */
    public Optional<Object> enableSsl() {
        return Optional.ofNullable(this.enableSsl);
    }
    /**
     * @return The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * @return IP address or host name of the Spark server
     * 
     */
    public Object host() {
        return this.host;
    }
    /**
     * @return The partial URL corresponding to the Spark server.
     * 
     */
    public Optional<Object> httpPath() {
        return Optional.ofNullable(this.httpPath);
    }
    /**
     * @return Parameters for linked service.
     * 
     */
    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * @return The password corresponding to the user name that you provided in the Username field
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return The TCP port that the Spark server uses to listen for client connections.
     * 
     */
    public Object port() {
        return this.port;
    }
    /**
     * @return The type of Spark server.
     * 
     */
    public Optional<String> serverType() {
        return Optional.ofNullable(this.serverType);
    }
    /**
     * @return The transport protocol to use in the Thrift layer.
     * 
     */
    public Optional<String> thriftTransportProtocol() {
        return Optional.ofNullable(this.thriftTransportProtocol);
    }
    /**
     * @return The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
     */
    public Optional<Object> trustedCertPath() {
        return Optional.ofNullable(this.trustedCertPath);
    }
    /**
     * @return Type of linked service.
     * Expected value is &#39;Spark&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     * 
     */
    public Optional<Object> useSystemTrustStore() {
        return Optional.ofNullable(this.useSystemTrustStore);
    }
    /**
     * @return The user name that you use to access Spark Server.
     * 
     */
    public Optional<Object> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object allowHostNameCNMismatch;
        private @Nullable Object allowSelfSignedServerCert;
        private @Nullable List<Object> annotations;
        private String authenticationType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object enableSsl;
        private @Nullable Object encryptedCredential;
        private Object host;
        private @Nullable Object httpPath;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private Object port;
        private @Nullable String serverType;
        private @Nullable String thriftTransportProtocol;
        private @Nullable Object trustedCertPath;
        private String type;
        private @Nullable Object useSystemTrustStore;
        private @Nullable Object username;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowHostNameCNMismatch = defaults.allowHostNameCNMismatch;
    	      this.allowSelfSignedServerCert = defaults.allowSelfSignedServerCert;
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.enableSsl = defaults.enableSsl;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.host = defaults.host;
    	      this.httpPath = defaults.httpPath;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.serverType = defaults.serverType;
    	      this.thriftTransportProtocol = defaults.thriftTransportProtocol;
    	      this.trustedCertPath = defaults.trustedCertPath;
    	      this.type = defaults.type;
    	      this.useSystemTrustStore = defaults.useSystemTrustStore;
    	      this.username = defaults.username;
        }

        public Builder allowHostNameCNMismatch(@Nullable Object allowHostNameCNMismatch) {
            this.allowHostNameCNMismatch = allowHostNameCNMismatch;
            return this;
        }
        public Builder allowSelfSignedServerCert(@Nullable Object allowSelfSignedServerCert) {
            this.allowSelfSignedServerCert = allowSelfSignedServerCert;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder enableSsl(@Nullable Object enableSsl) {
            this.enableSsl = enableSsl;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder host(Object host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder httpPath(@Nullable Object httpPath) {
            this.httpPath = httpPath;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }
        public Builder port(Object port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder serverType(@Nullable String serverType) {
            this.serverType = serverType;
            return this;
        }
        public Builder thriftTransportProtocol(@Nullable String thriftTransportProtocol) {
            this.thriftTransportProtocol = thriftTransportProtocol;
            return this;
        }
        public Builder trustedCertPath(@Nullable Object trustedCertPath) {
            this.trustedCertPath = trustedCertPath;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder useSystemTrustStore(@Nullable Object useSystemTrustStore) {
            this.useSystemTrustStore = useSystemTrustStore;
            return this;
        }
        public Builder username(@Nullable Object username) {
            this.username = username;
            return this;
        }        public SparkLinkedServiceResponse build() {
            return new SparkLinkedServiceResponse(allowHostNameCNMismatch, allowSelfSignedServerCert, annotations, authenticationType, connectVia, description, enableSsl, encryptedCredential, host, httpPath, parameters, password, port, serverType, thriftTransportProtocol, trustedCertPath, type, useSystemTrustStore, username);
        }
    }
}
