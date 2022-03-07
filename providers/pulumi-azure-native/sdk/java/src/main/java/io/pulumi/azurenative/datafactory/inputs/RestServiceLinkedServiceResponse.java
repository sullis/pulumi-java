// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.CredentialReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Rest Service linked service.
 * 
 */
public final class RestServiceLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final RestServiceLinkedServiceResponse Empty = new RestServiceLinkedServiceResponse();

    /**
     * The resource you are requesting authorization to use.
     * 
     */
    @InputImport(name="aadResourceId")
      private final @Nullable Object aadResourceId;

    public Optional<Object> getAadResourceId() {
        return this.aadResourceId == null ? Optional.empty() : Optional.ofNullable(this.aadResourceId);
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
     * The additional HTTP headers in the request to RESTful API used for authorization. Type: object (or Expression with resultType object).
     * 
     */
    @InputImport(name="authHeaders")
      private final @Nullable Object authHeaders;

    public Optional<Object> getAuthHeaders() {
        return this.authHeaders == null ? Optional.empty() : Optional.ofNullable(this.authHeaders);
    }

    /**
     * Type of authentication used to connect to the REST service.
     * 
     */
    @InputImport(name="authenticationType", required=true)
      private final String authenticationType;

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="azureCloudType")
      private final @Nullable Object azureCloudType;

    public Optional<Object> getAzureCloudType() {
        return this.azureCloudType == null ? Optional.empty() : Optional.ofNullable(this.azureCloudType);
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
     * The credential reference containing authentication information.
     * 
     */
    @InputImport(name="credential")
      private final @Nullable CredentialReferenceResponse credential;

    public Optional<CredentialReferenceResponse> getCredential() {
        return this.credential == null ? Optional.empty() : Optional.ofNullable(this.credential);
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
     * Whether to validate server side SSL certificate when connecting to the endpoint.The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="enableServerCertificateValidation")
      private final @Nullable Object enableServerCertificateValidation;

    public Optional<Object> getEnableServerCertificateValidation() {
        return this.enableServerCertificateValidation == null ? Optional.empty() : Optional.ofNullable(this.enableServerCertificateValidation);
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
     * Parameters for linked service.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * The password used in Basic authentication type.
     * 
     */
    @InputImport(name="password")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPassword() {
        return this.password == null ? null : this.password;
    }

    /**
     * The application's client ID used in AadServicePrincipal authentication type.
     * 
     */
    @InputImport(name="servicePrincipalId")
      private final @Nullable Object servicePrincipalId;

    public Optional<Object> getServicePrincipalId() {
        return this.servicePrincipalId == null ? Optional.empty() : Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The application's key used in AadServicePrincipal authentication type.
     * 
     */
    @InputImport(name="servicePrincipalKey")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getServicePrincipalKey() {
        return this.servicePrincipalKey == null ? null : this.servicePrincipalKey;
    }

    /**
     * The tenant information (domain name or tenant ID) used in AadServicePrincipal authentication type under which your application resides.
     * 
     */
    @InputImport(name="tenant")
      private final @Nullable Object tenant;

    public Optional<Object> getTenant() {
        return this.tenant == null ? Optional.empty() : Optional.ofNullable(this.tenant);
    }

    /**
     * Type of linked service.
     * Expected value is 'RestService'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * The base URL of the REST service.
     * 
     */
    @InputImport(name="url", required=true)
      private final Object url;

    public Object getUrl() {
        return this.url;
    }

    /**
     * The user name used in Basic authentication type.
     * 
     */
    @InputImport(name="userName")
      private final @Nullable Object userName;

    public Optional<Object> getUserName() {
        return this.userName == null ? Optional.empty() : Optional.ofNullable(this.userName);
    }

    public RestServiceLinkedServiceResponse(
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
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
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
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.userName = userName;
    }

    private RestServiceLinkedServiceResponse() {
        this.aadResourceId = null;
        this.annotations = List.of();
        this.authHeaders = null;
        this.authenticationType = null;
        this.azureCloudType = null;
        this.connectVia = null;
        this.credential = null;
        this.description = null;
        this.enableServerCertificateValidation = null;
        this.encryptedCredential = null;
        this.parameters = Map.of();
        this.password = null;
        this.servicePrincipalId = null;
        this.servicePrincipalKey = null;
        this.tenant = null;
        this.type = null;
        this.url = null;
        this.userName = null;
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