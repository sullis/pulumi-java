// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GoogleBigQueryLinkedServiceResponse {
    /**
     * A comma-separated list of public BigQuery projects to access.
     * 
     */
    private final @Nullable Object additionalProjects;
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The OAuth 2.0 authentication mechanism used for authentication. ServiceAuthentication can only be used on self-hosted IR.
     * 
     */
    private final String authenticationType;
    /**
     * The client id of the google application used to acquire the refresh token. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object clientId;
    /**
     * The client secret of the google application used to acquire the refresh token.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * The service account email ID that is used for ServiceAuthentication and can only be used on self-hosted IR.
     * 
     */
    private final @Nullable Object email;
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * The full path to the .p12 key file that is used to authenticate the service account email address and can only be used on self-hosted IR.
     * 
     */
    private final @Nullable Object keyFilePath;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * The default BigQuery project to query against.
     * 
     */
    private final Object project;
    /**
     * The refresh token obtained from Google for authorizing access to BigQuery for UserAuthentication.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken;
    /**
     * Whether to request access to Google Drive. Allowing Google Drive access enables support for federated tables that combine BigQuery data with data from Google Drive. The default value is false.
     * 
     */
    private final @Nullable Object requestGoogleDriveScope;
    /**
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
     */
    private final @Nullable Object trustedCertPath;
    /**
     * Type of linked service.
     * Expected value is 'GoogleBigQuery'.
     * 
     */
    private final String type;
    /**
     * Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     * 
     */
    private final @Nullable Object useSystemTrustStore;

    @OutputCustomType.Constructor({"additionalProjects","annotations","authenticationType","clientId","clientSecret","connectVia","description","email","encryptedCredential","keyFilePath","parameters","project","refreshToken","requestGoogleDriveScope","trustedCertPath","type","useSystemTrustStore"})
    private GoogleBigQueryLinkedServiceResponse(
        @Nullable Object additionalProjects,
        @Nullable List<Object> annotations,
        String authenticationType,
        @Nullable Object clientId,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object email,
        @Nullable Object encryptedCredential,
        @Nullable Object keyFilePath,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        Object project,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken,
        @Nullable Object requestGoogleDriveScope,
        @Nullable Object trustedCertPath,
        String type,
        @Nullable Object useSystemTrustStore) {
        this.additionalProjects = additionalProjects;
        this.annotations = annotations;
        this.authenticationType = Objects.requireNonNull(authenticationType);
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.connectVia = connectVia;
        this.description = description;
        this.email = email;
        this.encryptedCredential = encryptedCredential;
        this.keyFilePath = keyFilePath;
        this.parameters = parameters;
        this.project = Objects.requireNonNull(project);
        this.refreshToken = refreshToken;
        this.requestGoogleDriveScope = requestGoogleDriveScope;
        this.trustedCertPath = trustedCertPath;
        this.type = Objects.requireNonNull(type);
        this.useSystemTrustStore = useSystemTrustStore;
    }

    /**
     * A comma-separated list of public BigQuery projects to access.
     * 
     */
    public Optional<Object> getAdditionalProjects() {
        return Optional.ofNullable(this.additionalProjects);
    }
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The OAuth 2.0 authentication mechanism used for authentication. ServiceAuthentication can only be used on self-hosted IR.
     * 
     */
    public String getAuthenticationType() {
        return this.authenticationType;
    }
    /**
     * The client id of the google application used to acquire the refresh token. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * The client secret of the google application used to acquire the refresh token.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getClientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * The integration runtime reference.
     * 
     */
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * Linked service description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The service account email ID that is used for ServiceAuthentication and can only be used on self-hosted IR.
     * 
     */
    public Optional<Object> getEmail() {
        return Optional.ofNullable(this.email);
    }
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * The full path to the .p12 key file that is used to authenticate the service account email address and can only be used on self-hosted IR.
     * 
     */
    public Optional<Object> getKeyFilePath() {
        return Optional.ofNullable(this.keyFilePath);
    }
    /**
     * Parameters for linked service.
     * 
     */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * The default BigQuery project to query against.
     * 
     */
    public Object getProject() {
        return this.project;
    }
    /**
     * The refresh token obtained from Google for authorizing access to BigQuery for UserAuthentication.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getRefreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }
    /**
     * Whether to request access to Google Drive. Allowing Google Drive access enables support for federated tables that combine BigQuery data with data from Google Drive. The default value is false.
     * 
     */
    public Optional<Object> getRequestGoogleDriveScope() {
        return Optional.ofNullable(this.requestGoogleDriveScope);
    }
    /**
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
     */
    public Optional<Object> getTrustedCertPath() {
        return Optional.ofNullable(this.trustedCertPath);
    }
    /**
     * Type of linked service.
     * Expected value is 'GoogleBigQuery'.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     * 
     */
    public Optional<Object> getUseSystemTrustStore() {
        return Optional.ofNullable(this.useSystemTrustStore);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleBigQueryLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalProjects;
        private @Nullable List<Object> annotations;
        private String authenticationType;
        private @Nullable Object clientId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object email;
        private @Nullable Object encryptedCredential;
        private @Nullable Object keyFilePath;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private Object project;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken;
        private @Nullable Object requestGoogleDriveScope;
        private @Nullable Object trustedCertPath;
        private String type;
        private @Nullable Object useSystemTrustStore;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleBigQueryLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalProjects = defaults.additionalProjects;
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.email = defaults.email;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.keyFilePath = defaults.keyFilePath;
    	      this.parameters = defaults.parameters;
    	      this.project = defaults.project;
    	      this.refreshToken = defaults.refreshToken;
    	      this.requestGoogleDriveScope = defaults.requestGoogleDriveScope;
    	      this.trustedCertPath = defaults.trustedCertPath;
    	      this.type = defaults.type;
    	      this.useSystemTrustStore = defaults.useSystemTrustStore;
        }

        public Builder setAdditionalProjects(@Nullable Object additionalProjects) {
            this.additionalProjects = additionalProjects;
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

        public Builder setClientId(@Nullable Object clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientSecret(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret) {
            this.clientSecret = clientSecret;
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

        public Builder setEmail(@Nullable Object email) {
            this.email = email;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setKeyFilePath(@Nullable Object keyFilePath) {
            this.keyFilePath = keyFilePath;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setProject(Object project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setRefreshToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        public Builder setRequestGoogleDriveScope(@Nullable Object requestGoogleDriveScope) {
            this.requestGoogleDriveScope = requestGoogleDriveScope;
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

        public Builder setUseSystemTrustStore(@Nullable Object useSystemTrustStore) {
            this.useSystemTrustStore = useSystemTrustStore;
            return this;
        }

        public GoogleBigQueryLinkedServiceResponse build() {
            return new GoogleBigQueryLinkedServiceResponse(additionalProjects, annotations, authenticationType, clientId, clientSecret, connectVia, description, email, encryptedCredential, keyFilePath, parameters, project, refreshToken, requestGoogleDriveScope, trustedCertPath, type, useSystemTrustStore);
        }
    }
}
