// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.CredentialReferenceResponse;
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
public final class RestServiceLinkedServiceResponse {
    /**
     * The resource you are requesting authorization to use.
     * 
     */
    private final @Nullable Object aadResourceId;
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The additional HTTP headers in the request to RESTful API used for authorization. Type: object (or Expression with resultType object).
     * 
     */
    private final @Nullable Object authHeaders;
    /**
     * Type of authentication used to connect to the REST service.
     * 
     */
    private final String authenticationType;
    /**
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object azureCloudType;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * The credential reference containing authentication information.
     * 
     */
    private final @Nullable CredentialReferenceResponse credential;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * Whether to validate server side SSL certificate when connecting to the endpoint.The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object enableServerCertificateValidation;
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * The password used in Basic authentication type.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    /**
     * The application's client ID used in AadServicePrincipal authentication type.
     * 
     */
    private final @Nullable Object servicePrincipalId;
    /**
     * The application's key used in AadServicePrincipal authentication type.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
    /**
     * The tenant information (domain name or tenant ID) used in AadServicePrincipal authentication type under which your application resides.
     * 
     */
    private final @Nullable Object tenant;
    /**
     * Type of linked service.
     * Expected value is 'RestService'.
     * 
     */
    private final String type;
    /**
     * The base URL of the REST service.
     * 
     */
    private final Object url;
    /**
     * The user name used in Basic authentication type.
     * 
     */
    private final @Nullable Object userName;

    @OutputCustomType.Constructor({"aadResourceId","annotations","authHeaders","authenticationType","azureCloudType","connectVia","credential","description","enableServerCertificateValidation","encryptedCredential","parameters","password","servicePrincipalId","servicePrincipalKey","tenant","type","url","userName"})
    private RestServiceLinkedServiceResponse(
        @Nullable Object aadResourceId,
        @Nullable List<Object> annotations,
        @Nullable Object authHeaders,
        String authenticationType,
        @Nullable Object azureCloudType,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable CredentialReferenceResponse credential,
        @Nullable String description,
        @Nullable Object enableServerCertificateValidation,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable Object servicePrincipalId,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey,
        @Nullable Object tenant,
        String type,
        Object url,
        @Nullable Object userName) {
        this.aadResourceId = aadResourceId;
        this.annotations = annotations;
        this.authHeaders = authHeaders;
        this.authenticationType = Objects.requireNonNull(authenticationType);
        this.azureCloudType = azureCloudType;
        this.connectVia = connectVia;
        this.credential = credential;
        this.description = description;
        this.enableServerCertificateValidation = enableServerCertificateValidation;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.tenant = tenant;
        this.type = Objects.requireNonNull(type);
        this.url = Objects.requireNonNull(url);
        this.userName = userName;
    }

    /**
     * The resource you are requesting authorization to use.
     * 
     */
    public Optional<Object> getAadResourceId() {
        return Optional.ofNullable(this.aadResourceId);
    }
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The additional HTTP headers in the request to RESTful API used for authorization. Type: object (or Expression with resultType object).
     * 
     */
    public Optional<Object> getAuthHeaders() {
        return Optional.ofNullable(this.authHeaders);
    }
    /**
     * Type of authentication used to connect to the REST service.
     * 
     */
    public String getAuthenticationType() {
        return this.authenticationType;
    }
    /**
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getAzureCloudType() {
        return Optional.ofNullable(this.azureCloudType);
    }
    /**
     * The integration runtime reference.
     * 
     */
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * The credential reference containing authentication information.
     * 
     */
    public Optional<CredentialReferenceResponse> getCredential() {
        return Optional.ofNullable(this.credential);
    }
    /**
     * Linked service description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Whether to validate server side SSL certificate when connecting to the endpoint.The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> getEnableServerCertificateValidation() {
        return Optional.ofNullable(this.enableServerCertificateValidation);
    }
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * Parameters for linked service.
     * 
     */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * The password used in Basic authentication type.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * The application's client ID used in AadServicePrincipal authentication type.
     * 
     */
    public Optional<Object> getServicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }
    /**
     * The application's key used in AadServicePrincipal authentication type.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getServicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }
    /**
     * The tenant information (domain name or tenant ID) used in AadServicePrincipal authentication type under which your application resides.
     * 
     */
    public Optional<Object> getTenant() {
        return Optional.ofNullable(this.tenant);
    }
    /**
     * Type of linked service.
     * Expected value is 'RestService'.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The base URL of the REST service.
     * 
     */
    public Object getUrl() {
        return this.url;
    }
    /**
     * The user name used in Basic authentication type.
     * 
     */
    public Optional<Object> getUserName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestServiceLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object aadResourceId;
        private @Nullable List<Object> annotations;
        private @Nullable Object authHeaders;
        private String authenticationType;
        private @Nullable Object azureCloudType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable CredentialReferenceResponse credential;
        private @Nullable String description;
        private @Nullable Object enableServerCertificateValidation;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Object servicePrincipalId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
        private @Nullable Object tenant;
        private String type;
        private Object url;
        private @Nullable Object userName;

        public Builder() {
    	      // Empty
        }

        public Builder(RestServiceLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadResourceId = defaults.aadResourceId;
    	      this.annotations = defaults.annotations;
    	      this.authHeaders = defaults.authHeaders;
    	      this.authenticationType = defaults.authenticationType;
    	      this.azureCloudType = defaults.azureCloudType;
    	      this.connectVia = defaults.connectVia;
    	      this.credential = defaults.credential;
    	      this.description = defaults.description;
    	      this.enableServerCertificateValidation = defaults.enableServerCertificateValidation;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.userName = defaults.userName;
        }

        public Builder setAadResourceId(@Nullable Object aadResourceId) {
            this.aadResourceId = aadResourceId;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAuthHeaders(@Nullable Object authHeaders) {
            this.authHeaders = authHeaders;
            return this;
        }

        public Builder setAuthenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder setAzureCloudType(@Nullable Object azureCloudType) {
            this.azureCloudType = azureCloudType;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setCredential(@Nullable CredentialReferenceResponse credential) {
            this.credential = credential;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEnableServerCertificateValidation(@Nullable Object enableServerCertificateValidation) {
            this.enableServerCertificateValidation = enableServerCertificateValidation;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
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

        public Builder setServicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder setServicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey) {
            this.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        public Builder setTenant(@Nullable Object tenant) {
            this.tenant = tenant;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUrl(Object url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUserName(@Nullable Object userName) {
            this.userName = userName;
            return this;
        }

        public RestServiceLinkedServiceResponse build() {
            return new RestServiceLinkedServiceResponse(aadResourceId, annotations, authHeaders, authenticationType, azureCloudType, connectVia, credential, description, enableServerCertificateValidation, encryptedCredential, parameters, password, servicePrincipalId, servicePrincipalKey, tenant, type, url, userName);
        }
    }
}
