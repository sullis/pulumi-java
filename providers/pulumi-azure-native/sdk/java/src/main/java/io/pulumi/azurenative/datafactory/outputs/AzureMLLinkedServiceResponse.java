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
public final class AzureMLLinkedServiceResponse {
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The API key for accessing the Azure ML model endpoint.
     * 
     */
    private final Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> apiKey;
    /**
     * Type of authentication (Required to specify MSI) used to connect to AzureML. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object authentication;
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
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * The Batch Execution REST URL for an Azure ML Studio Web Service endpoint. Type: string (or Expression with resultType string).
     * 
     */
    private final Object mlEndpoint;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * The ID of the service principal used to authenticate against the ARM-based updateResourceEndpoint of an Azure ML Studio web service. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object servicePrincipalId;
    /**
     * The key of the service principal used to authenticate against the ARM-based updateResourceEndpoint of an Azure ML Studio web service.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object tenant;
    /**
     * Type of linked service.
     * Expected value is 'AzureML'.
     * 
     */
    private final String type;
    /**
     * The Update Resource REST URL for an Azure ML Studio Web Service endpoint. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object updateResourceEndpoint;

    @OutputCustomType.Constructor({"annotations","apiKey","authentication","connectVia","description","encryptedCredential","mlEndpoint","parameters","servicePrincipalId","servicePrincipalKey","tenant","type","updateResourceEndpoint"})
    private AzureMLLinkedServiceResponse(
        @Nullable List<Object> annotations,
        Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> apiKey,
        @Nullable Object authentication,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        Object mlEndpoint,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object servicePrincipalId,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey,
        @Nullable Object tenant,
        String type,
        @Nullable Object updateResourceEndpoint) {
        this.annotations = annotations;
        this.apiKey = Objects.requireNonNull(apiKey);
        this.authentication = authentication;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.mlEndpoint = Objects.requireNonNull(mlEndpoint);
        this.parameters = parameters;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.tenant = tenant;
        this.type = Objects.requireNonNull(type);
        this.updateResourceEndpoint = updateResourceEndpoint;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The API key for accessing the Azure ML model endpoint.
     * 
     */
    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getApiKey() {
        return this.apiKey;
    }
    /**
     * Type of authentication (Required to specify MSI) used to connect to AzureML. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getAuthentication() {
        return Optional.ofNullable(this.authentication);
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
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * The Batch Execution REST URL for an Azure ML Studio Web Service endpoint. Type: string (or Expression with resultType string).
     * 
     */
    public Object getMlEndpoint() {
        return this.mlEndpoint;
    }
    /**
     * Parameters for linked service.
     * 
     */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * The ID of the service principal used to authenticate against the ARM-based updateResourceEndpoint of an Azure ML Studio web service. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getServicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }
    /**
     * The key of the service principal used to authenticate against the ARM-based updateResourceEndpoint of an Azure ML Studio web service.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getServicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
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
     * Expected value is 'AzureML'.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The Update Resource REST URL for an Azure ML Studio Web Service endpoint. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getUpdateResourceEndpoint() {
        return Optional.ofNullable(this.updateResourceEndpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMLLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> apiKey;
        private @Nullable Object authentication;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private Object mlEndpoint;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object servicePrincipalId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
        private @Nullable Object tenant;
        private String type;
        private @Nullable Object updateResourceEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMLLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.apiKey = defaults.apiKey;
    	      this.authentication = defaults.authentication;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.mlEndpoint = defaults.mlEndpoint;
    	      this.parameters = defaults.parameters;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
    	      this.updateResourceEndpoint = defaults.updateResourceEndpoint;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setApiKey(Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey);
            return this;
        }

        public Builder setAuthentication(@Nullable Object authentication) {
            this.authentication = authentication;
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

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setMlEndpoint(Object mlEndpoint) {
            this.mlEndpoint = Objects.requireNonNull(mlEndpoint);
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
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

        public Builder setUpdateResourceEndpoint(@Nullable Object updateResourceEndpoint) {
            this.updateResourceEndpoint = updateResourceEndpoint;
            return this;
        }

        public AzureMLLinkedServiceResponse build() {
            return new AzureMLLinkedServiceResponse(annotations, apiKey, authentication, connectVia, description, encryptedCredential, mlEndpoint, parameters, servicePrincipalId, servicePrincipalKey, tenant, type, updateResourceEndpoint);
        }
    }
}
