// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.CredentialReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CosmosDbLinkedServiceResponse {
    /**
     * The endpoint of the Azure CosmosDB account. Type: string (or Expression with resultType string)
     * 
     */
    private final @Nullable Object accountEndpoint;
    /**
     * The account key of the Azure CosmosDB account. Type: SecureString or AzureKeyVaultSecretReference.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accountKey;
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
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
     * The connection mode used to access CosmosDB account. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable String connectionMode;
    /**
     * The connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    private final @Nullable Object connectionString;
    /**
     * The credential reference containing authentication information.
     * 
     */
    private final @Nullable CredentialReferenceResponse credential;
    /**
     * The name of the database. Type: string (or Expression with resultType string)
     * 
     */
    private final @Nullable Object database;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
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
     * The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert', servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalCredential;
    /**
     * The service principal credential type to use in Server-To-Server authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable String servicePrincipalCredentialType;
    /**
     * The client ID of the application in Azure Active Directory used for Server-To-Server authentication. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object servicePrincipalId;
    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object tenant;
    /**
     * Type of linked service.
     * Expected value is 'CosmosDb'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"accountEndpoint","accountKey","annotations","azureCloudType","connectVia","connectionMode","connectionString","credential","database","description","encryptedCredential","parameters","servicePrincipalCredential","servicePrincipalCredentialType","servicePrincipalId","tenant","type"})
    private CosmosDbLinkedServiceResponse(
        @Nullable Object accountEndpoint,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accountKey,
        @Nullable List<Object> annotations,
        @Nullable Object azureCloudType,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String connectionMode,
        @Nullable Object connectionString,
        @Nullable CredentialReferenceResponse credential,
        @Nullable Object database,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalCredential,
        @Nullable String servicePrincipalCredentialType,
        @Nullable Object servicePrincipalId,
        @Nullable Object tenant,
        String type) {
        this.accountEndpoint = accountEndpoint;
        this.accountKey = accountKey;
        this.annotations = annotations;
        this.azureCloudType = azureCloudType;
        this.connectVia = connectVia;
        this.connectionMode = connectionMode;
        this.connectionString = connectionString;
        this.credential = credential;
        this.database = database;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.servicePrincipalCredential = servicePrincipalCredential;
        this.servicePrincipalCredentialType = servicePrincipalCredentialType;
        this.servicePrincipalId = servicePrincipalId;
        this.tenant = tenant;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The endpoint of the Azure CosmosDB account. Type: string (or Expression with resultType string)
     * 
    */
    public Optional<Object> getAccountEndpoint() {
        return Optional.ofNullable(this.accountEndpoint);
    }
    /**
     * The account key of the Azure CosmosDB account. Type: SecureString or AzureKeyVaultSecretReference.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getAccountKey() {
        return Optional.ofNullable(this.accountKey);
    }
    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
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
     * The connection mode used to access CosmosDB account. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<String> getConnectionMode() {
        return Optional.ofNullable(this.connectionMode);
    }
    /**
     * The connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
    */
    public Optional<Object> getConnectionString() {
        return Optional.ofNullable(this.connectionString);
    }
    /**
     * The credential reference containing authentication information.
     * 
    */
    public Optional<CredentialReferenceResponse> getCredential() {
        return Optional.ofNullable(this.credential);
    }
    /**
     * The name of the database. Type: string (or Expression with resultType string)
     * 
    */
    public Optional<Object> getDatabase() {
        return Optional.ofNullable(this.database);
    }
    /**
     * Linked service description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
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
     * The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert', servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getServicePrincipalCredential() {
        return Optional.ofNullable(this.servicePrincipalCredential);
    }
    /**
     * The service principal credential type to use in Server-To-Server authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<String> getServicePrincipalCredentialType() {
        return Optional.ofNullable(this.servicePrincipalCredentialType);
    }
    /**
     * The client ID of the application in Azure Active Directory used for Server-To-Server authentication. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getServicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }
    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getTenant() {
        return Optional.ofNullable(this.tenant);
    }
    /**
     * Type of linked service.
     * Expected value is 'CosmosDb'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CosmosDbLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object accountEndpoint;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accountKey;
        private @Nullable List<Object> annotations;
        private @Nullable Object azureCloudType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String connectionMode;
        private @Nullable Object connectionString;
        private @Nullable CredentialReferenceResponse credential;
        private @Nullable Object database;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalCredential;
        private @Nullable String servicePrincipalCredentialType;
        private @Nullable Object servicePrincipalId;
        private @Nullable Object tenant;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(CosmosDbLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountEndpoint = defaults.accountEndpoint;
    	      this.accountKey = defaults.accountKey;
    	      this.annotations = defaults.annotations;
    	      this.azureCloudType = defaults.azureCloudType;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionMode = defaults.connectionMode;
    	      this.connectionString = defaults.connectionString;
    	      this.credential = defaults.credential;
    	      this.database = defaults.database;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.servicePrincipalCredential = defaults.servicePrincipalCredential;
    	      this.servicePrincipalCredentialType = defaults.servicePrincipalCredentialType;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
        }

        public Builder setAccountEndpoint(@Nullable Object accountEndpoint) {
            this.accountEndpoint = accountEndpoint;
            return this;
        }

        public Builder setAccountKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accountKey) {
            this.accountKey = accountKey;
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

        public Builder setConnectionMode(@Nullable String connectionMode) {
            this.connectionMode = connectionMode;
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

        public Builder setDatabase(@Nullable Object database) {
            this.database = database;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
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

        public Builder setServicePrincipalCredential(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalCredential) {
            this.servicePrincipalCredential = servicePrincipalCredential;
            return this;
        }

        public Builder setServicePrincipalCredentialType(@Nullable String servicePrincipalCredentialType) {
            this.servicePrincipalCredentialType = servicePrincipalCredentialType;
            return this;
        }

        public Builder setServicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
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
        public CosmosDbLinkedServiceResponse build() {
            return new CosmosDbLinkedServiceResponse(accountEndpoint, accountKey, annotations, azureCloudType, connectVia, connectionMode, connectionString, credential, database, description, encryptedCredential, parameters, servicePrincipalCredential, servicePrincipalCredentialType, servicePrincipalId, tenant, type);
        }
    }
}