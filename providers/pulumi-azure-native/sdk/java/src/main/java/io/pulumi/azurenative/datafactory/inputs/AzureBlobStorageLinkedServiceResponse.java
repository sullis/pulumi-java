// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.CredentialReferenceResponse;
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
 * The azure blob storage linked service.
 * 
 */
public final class AzureBlobStorageLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureBlobStorageLinkedServiceResponse Empty = new AzureBlobStorageLinkedServiceResponse();

    /**
     * The Azure key vault secret reference of accountKey in connection string.
     * 
     */
    @InputImport(name="accountKey")
    private final @Nullable AzureKeyVaultSecretReferenceResponse accountKey;

    public Optional<AzureKeyVaultSecretReferenceResponse> getAccountKey() {
        return this.accountKey == null ? Optional.empty() : Optional.ofNullable(this.accountKey);
    }

    /**
     * Specify the kind of your storage account. Allowed values are: Storage (general purpose v1), StorageV2 (general purpose v2), BlobStorage, or BlockBlobStorage. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="accountKind")
    private final @Nullable String accountKind;

    public Optional<String> getAccountKind() {
        return this.accountKind == null ? Optional.empty() : Optional.ofNullable(this.accountKind);
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
     * The connection string. It is mutually exclusive with sasUri, serviceEndpoint property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @InputImport(name="connectionString")
    private final @Nullable Object connectionString;

    public Optional<Object> getConnectionString() {
        return this.connectionString == null ? Optional.empty() : Optional.ofNullable(this.connectionString);
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
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="encryptedCredential")
    private final @Nullable String encryptedCredential;

    public Optional<String> getEncryptedCredential() {
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
     * The Azure key vault secret reference of sasToken in sas uri.
     * 
     */
    @InputImport(name="sasToken")
    private final @Nullable AzureKeyVaultSecretReferenceResponse sasToken;

    public Optional<AzureKeyVaultSecretReferenceResponse> getSasToken() {
        return this.sasToken == null ? Optional.empty() : Optional.ofNullable(this.sasToken);
    }

    /**
     * SAS URI of the Azure Blob Storage resource. It is mutually exclusive with connectionString, serviceEndpoint property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @InputImport(name="sasUri")
    private final @Nullable Object sasUri;

    public Optional<Object> getSasUri() {
        return this.sasUri == null ? Optional.empty() : Optional.ofNullable(this.sasUri);
    }

    /**
     * Blob service endpoint of the Azure Blob Storage resource. It is mutually exclusive with connectionString, sasUri property.
     * 
     */
    @InputImport(name="serviceEndpoint")
    private final @Nullable String serviceEndpoint;

    public Optional<String> getServiceEndpoint() {
        return this.serviceEndpoint == null ? Optional.empty() : Optional.ofNullable(this.serviceEndpoint);
    }

    /**
     * The ID of the service principal used to authenticate against Azure SQL Data Warehouse. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="servicePrincipalId")
    private final @Nullable Object servicePrincipalId;

    public Optional<Object> getServicePrincipalId() {
        return this.servicePrincipalId == null ? Optional.empty() : Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The key of the service principal used to authenticate against Azure SQL Data Warehouse.
     * 
     */
    @InputImport(name="servicePrincipalKey")
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getServicePrincipalKey() {
        return this.servicePrincipalKey == null ? null : this.servicePrincipalKey;
    }

    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="tenant")
    private final @Nullable Object tenant;

    public Optional<Object> getTenant() {
        return this.tenant == null ? Optional.empty() : Optional.ofNullable(this.tenant);
    }

    /**
     * Type of linked service.
     * Expected value is 'AzureBlobStorage'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public AzureBlobStorageLinkedServiceResponse(
        @Nullable AzureKeyVaultSecretReferenceResponse accountKey,
        @Nullable String accountKind,
        @Nullable List<Object> annotations,
        @Nullable Object azureCloudType,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable Object connectionString,
        @Nullable CredentialReferenceResponse credential,
        @Nullable String description,
        @Nullable String encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable AzureKeyVaultSecretReferenceResponse sasToken,
        @Nullable Object sasUri,
        @Nullable String serviceEndpoint,
        @Nullable Object servicePrincipalId,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey,
        @Nullable Object tenant,
        String type) {
        this.accountKey = accountKey;
        this.accountKind = accountKind;
        this.annotations = annotations;
        this.azureCloudType = azureCloudType;
        this.connectVia = connectVia;
        this.connectionString = connectionString;
        this.credential = credential;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.sasToken = sasToken;
        this.sasUri = sasUri;
        this.serviceEndpoint = serviceEndpoint;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.tenant = tenant;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureBlobStorageLinkedServiceResponse() {
        this.accountKey = null;
        this.accountKind = null;
        this.annotations = List.of();
        this.azureCloudType = null;
        this.connectVia = null;
        this.connectionString = null;
        this.credential = null;
        this.description = null;
        this.encryptedCredential = null;
        this.parameters = Map.of();
        this.sasToken = null;
        this.sasUri = null;
        this.serviceEndpoint = null;
        this.servicePrincipalId = null;
        this.servicePrincipalKey = null;
        this.tenant = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobStorageLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureKeyVaultSecretReferenceResponse accountKey;
        private @Nullable String accountKind;
        private @Nullable List<Object> annotations;
        private @Nullable Object azureCloudType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable Object connectionString;
        private @Nullable CredentialReferenceResponse credential;
        private @Nullable String description;
        private @Nullable String encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable AzureKeyVaultSecretReferenceResponse sasToken;
        private @Nullable Object sasUri;
        private @Nullable String serviceEndpoint;
        private @Nullable Object servicePrincipalId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
        private @Nullable Object tenant;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobStorageLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.accountKind = defaults.accountKind;
    	      this.annotations = defaults.annotations;
    	      this.azureCloudType = defaults.azureCloudType;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionString = defaults.connectionString;
    	      this.credential = defaults.credential;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.sasToken = defaults.sasToken;
    	      this.sasUri = defaults.sasUri;
    	      this.serviceEndpoint = defaults.serviceEndpoint;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
        }

        public Builder setAccountKey(@Nullable AzureKeyVaultSecretReferenceResponse accountKey) {
            this.accountKey = accountKey;
            return this;
        }

        public Builder setAccountKind(@Nullable String accountKind) {
            this.accountKind = accountKind;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
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

        public Builder setConnectionString(@Nullable Object connectionString) {
            this.connectionString = connectionString;
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

        public Builder setEncryptedCredential(@Nullable String encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setSasToken(@Nullable AzureKeyVaultSecretReferenceResponse sasToken) {
            this.sasToken = sasToken;
            return this;
        }

        public Builder setSasUri(@Nullable Object sasUri) {
            this.sasUri = sasUri;
            return this;
        }

        public Builder setServiceEndpoint(@Nullable String serviceEndpoint) {
            this.serviceEndpoint = serviceEndpoint;
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

        public AzureBlobStorageLinkedServiceResponse build() {
            return new AzureBlobStorageLinkedServiceResponse(accountKey, accountKind, annotations, azureCloudType, connectVia, connectionString, credential, description, encryptedCredential, parameters, sasToken, sasUri, serviceEndpoint, servicePrincipalId, servicePrincipalKey, tenant, type);
        }
    }
}
