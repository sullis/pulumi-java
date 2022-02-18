// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Hive Server linked service.
 * 
 */
public final class HiveLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final HiveLinkedServiceResponse Empty = new HiveLinkedServiceResponse();

    /**
     * Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     * 
     */
    @InputImport(name="allowHostNameCNMismatch")
    private final @Nullable Object allowHostNameCNMismatch;

    public Optional<Object> getAllowHostNameCNMismatch() {
        return this.allowHostNameCNMismatch == null ? Optional.empty() : Optional.ofNullable(this.allowHostNameCNMismatch);
    }

    /**
     * Specifies whether to allow self-signed certificates from the server. The default value is false.
     * 
     */
    @InputImport(name="allowSelfSignedServerCert")
    private final @Nullable Object allowSelfSignedServerCert;

    public Optional<Object> getAllowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert == null ? Optional.empty() : Optional.ofNullable(this.allowSelfSignedServerCert);
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @InputImport(name="annotations")
    private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * The authentication method used to access the Hive server.
     * 
     */
    @InputImport(name="authenticationType", required=true)
    private final String authenticationType;

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @InputImport(name="connectVia")
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    /**
     * Linked service description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false.
     * 
     */
    @InputImport(name="enableSsl")
    private final @Nullable Object enableSsl;

    public Optional<Object> getEnableSsl() {
        return this.enableSsl == null ? Optional.empty() : Optional.ofNullable(this.enableSsl);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="encryptedCredential")
    private final @Nullable Object encryptedCredential;

    public Optional<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Optional.empty() : Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * IP address or host name of the Hive server, separated by ';' for multiple hosts (only when serviceDiscoveryMode is enable).
     * 
     */
    @InputImport(name="host", required=true)
    private final Object host;

    public Object getHost() {
        return this.host;
    }

    /**
     * The partial URL corresponding to the Hive server.
     * 
     */
    @InputImport(name="httpPath")
    private final @Nullable Object httpPath;

    public Optional<Object> getHttpPath() {
        return this.httpPath == null ? Optional.empty() : Optional.ofNullable(this.httpPath);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * The password corresponding to the user name that you provided in the Username field
     * 
     */
    @InputImport(name="password")
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPassword() {
        return this.password == null ? null : this.password;
    }

    /**
     * The TCP port that the Hive server uses to listen for client connections.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Object port;

    public Optional<Object> getPort() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    /**
     * The type of Hive server.
     * 
     */
    @InputImport(name="serverType")
    private final @Nullable String serverType;

    public Optional<String> getServerType() {
        return this.serverType == null ? Optional.empty() : Optional.ofNullable(this.serverType);
    }

    /**
     * true to indicate using the ZooKeeper service, false not.
     * 
     */
    @InputImport(name="serviceDiscoveryMode")
    private final @Nullable Object serviceDiscoveryMode;

    public Optional<Object> getServiceDiscoveryMode() {
        return this.serviceDiscoveryMode == null ? Optional.empty() : Optional.ofNullable(this.serviceDiscoveryMode);
    }

    /**
     * The transport protocol to use in the Thrift layer.
     * 
     */
    @InputImport(name="thriftTransportProtocol")
    private final @Nullable String thriftTransportProtocol;

    public Optional<String> getThriftTransportProtocol() {
        return this.thriftTransportProtocol == null ? Optional.empty() : Optional.ofNullable(this.thriftTransportProtocol);
    }

    /**
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
     */
    @InputImport(name="trustedCertPath")
    private final @Nullable Object trustedCertPath;

    public Optional<Object> getTrustedCertPath() {
        return this.trustedCertPath == null ? Optional.empty() : Optional.ofNullable(this.trustedCertPath);
    }

    /**
     * Type of linked service.
     * Expected value is 'Hive'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Specifies whether the driver uses native HiveQL queries,or converts them into an equivalent form in HiveQL.
     * 
     */
    @InputImport(name="useNativeQuery")
    private final @Nullable Object useNativeQuery;

    public Optional<Object> getUseNativeQuery() {
        return this.useNativeQuery == null ? Optional.empty() : Optional.ofNullable(this.useNativeQuery);
    }

    /**
     * Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     * 
     */
    @InputImport(name="useSystemTrustStore")
    private final @Nullable Object useSystemTrustStore;

    public Optional<Object> getUseSystemTrustStore() {
        return this.useSystemTrustStore == null ? Optional.empty() : Optional.ofNullable(this.useSystemTrustStore);
    }

    /**
     * The user name that you use to access Hive Server.
     * 
     */
    @InputImport(name="username")
    private final @Nullable Object username;

    public Optional<Object> getUsername() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    /**
     * The namespace on ZooKeeper under which Hive Server 2 nodes are added.
     * 
     */
    @InputImport(name="zooKeeperNameSpace")
    private final @Nullable Object zooKeeperNameSpace;

    public Optional<Object> getZooKeeperNameSpace() {
        return this.zooKeeperNameSpace == null ? Optional.empty() : Optional.ofNullable(this.zooKeeperNameSpace);
    }

    public HiveLinkedServiceResponse(
        @Nullable Object allowHostNameCNMismatch,
        @Nullable Object allowSelfSignedServerCert,
        @Nullable List<Object> annotations,
        String authenticationType,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object enableSsl,
        @Nullable Object encryptedCredential,
        Object host,
        @Nullable Object httpPath,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable Object port,
        @Nullable String serverType,
        @Nullable Object serviceDiscoveryMode,
        @Nullable String thriftTransportProtocol,
        @Nullable Object trustedCertPath,
        String type,
        @Nullable Object useNativeQuery,
        @Nullable Object useSystemTrustStore,
        @Nullable Object username,
        @Nullable Object zooKeeperNameSpace) {
        this.allowHostNameCNMismatch = allowHostNameCNMismatch;
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
        this.annotations = annotations;
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.connectVia = connectVia;
        this.description = description;
        this.enableSsl = enableSsl;
        this.encryptedCredential = encryptedCredential;
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.httpPath = httpPath;
        this.parameters = parameters;
        this.password = password;
        this.port = port;
        this.serverType = serverType;
        this.serviceDiscoveryMode = serviceDiscoveryMode;
        this.thriftTransportProtocol = thriftTransportProtocol;
        this.trustedCertPath = trustedCertPath;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.useNativeQuery = useNativeQuery;
        this.useSystemTrustStore = useSystemTrustStore;
        this.username = username;
        this.zooKeeperNameSpace = zooKeeperNameSpace;
    }

    private HiveLinkedServiceResponse() {
        this.allowHostNameCNMismatch = null;
        this.allowSelfSignedServerCert = null;
        this.annotations = List.of();
        this.authenticationType = null;
        this.connectVia = null;
        this.description = null;
        this.enableSsl = null;
        this.encryptedCredential = null;
        this.host = null;
        this.httpPath = null;
        this.parameters = Map.of();
        this.password = null;
        this.port = null;
        this.serverType = null;
        this.serviceDiscoveryMode = null;
        this.thriftTransportProtocol = null;
        this.trustedCertPath = null;
        this.type = null;
        this.useNativeQuery = null;
        this.useSystemTrustStore = null;
        this.username = null;
        this.zooKeeperNameSpace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HiveLinkedServiceResponse defaults) {
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
        private @Nullable Object port;
        private @Nullable String serverType;
        private @Nullable Object serviceDiscoveryMode;
        private @Nullable String thriftTransportProtocol;
        private @Nullable Object trustedCertPath;
        private String type;
        private @Nullable Object useNativeQuery;
        private @Nullable Object useSystemTrustStore;
        private @Nullable Object username;
        private @Nullable Object zooKeeperNameSpace;

        public Builder() {
    	      // Empty
        }

        public Builder(HiveLinkedServiceResponse defaults) {
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
    	      this.serviceDiscoveryMode = defaults.serviceDiscoveryMode;
    	      this.thriftTransportProtocol = defaults.thriftTransportProtocol;
    	      this.trustedCertPath = defaults.trustedCertPath;
    	      this.type = defaults.type;
    	      this.useNativeQuery = defaults.useNativeQuery;
    	      this.useSystemTrustStore = defaults.useSystemTrustStore;
    	      this.username = defaults.username;
    	      this.zooKeeperNameSpace = defaults.zooKeeperNameSpace;
        }

        public Builder setAllowHostNameCNMismatch(@Nullable Object allowHostNameCNMismatch) {
            this.allowHostNameCNMismatch = allowHostNameCNMismatch;
            return this;
        }

        public Builder setAllowSelfSignedServerCert(@Nullable Object allowSelfSignedServerCert) {
            this.allowSelfSignedServerCert = allowSelfSignedServerCert;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAuthenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEnableSsl(@Nullable Object enableSsl) {
            this.enableSsl = enableSsl;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setHost(Object host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setHttpPath(@Nullable Object httpPath) {
            this.httpPath = httpPath;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPassword(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }

        public Builder setPort(@Nullable Object port) {
            this.port = port;
            return this;
        }

        public Builder setServerType(@Nullable String serverType) {
            this.serverType = serverType;
            return this;
        }

        public Builder setServiceDiscoveryMode(@Nullable Object serviceDiscoveryMode) {
            this.serviceDiscoveryMode = serviceDiscoveryMode;
            return this;
        }

        public Builder setThriftTransportProtocol(@Nullable String thriftTransportProtocol) {
            this.thriftTransportProtocol = thriftTransportProtocol;
            return this;
        }

        public Builder setTrustedCertPath(@Nullable Object trustedCertPath) {
            this.trustedCertPath = trustedCertPath;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUseNativeQuery(@Nullable Object useNativeQuery) {
            this.useNativeQuery = useNativeQuery;
            return this;
        }

        public Builder setUseSystemTrustStore(@Nullable Object useSystemTrustStore) {
            this.useSystemTrustStore = useSystemTrustStore;
            return this;
        }

        public Builder setUsername(@Nullable Object username) {
            this.username = username;
            return this;
        }

        public Builder setZooKeeperNameSpace(@Nullable Object zooKeeperNameSpace) {
            this.zooKeeperNameSpace = zooKeeperNameSpace;
            return this;
        }

        public HiveLinkedServiceResponse build() {
            return new HiveLinkedServiceResponse(allowHostNameCNMismatch, allowSelfSignedServerCert, annotations, authenticationType, connectVia, description, enableSsl, encryptedCredential, host, httpPath, parameters, password, port, serverType, serviceDiscoveryMode, thriftTransportProtocol, trustedCertPath, type, useNativeQuery, useSystemTrustStore, username, zooKeeperNameSpace);
        }
    }
}
