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
public final class AzureDatabricksDeltaLakeLinkedServiceResponse {
    /**
     * Access token for databricks REST API. Refer to https://docs.azuredatabricks.net/api/latest/authentication.html. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken;
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The id of an existing interactive cluster that will be used for all runs of this job. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object clusterId;
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
     * <REGION>.azuredatabricks.net, domain name of your Databricks deployment. Type: string (or Expression with resultType string).
     * 
     */
    private final Object domain;
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
     * Type of linked service.
     * Expected value is 'AzureDatabricksDeltaLake'.
     * 
     */
    private final String type;
    /**
     * Workspace resource id for databricks REST API. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object workspaceResourceId;

    @OutputCustomType.Constructor({"accessToken","annotations","clusterId","connectVia","credential","description","domain","encryptedCredential","parameters","type","workspaceResourceId"})
    private AzureDatabricksDeltaLakeLinkedServiceResponse(
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken,
        @Nullable List<Object> annotations,
        @Nullable Object clusterId,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable CredentialReferenceResponse credential,
        @Nullable String description,
        Object domain,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        String type,
        @Nullable Object workspaceResourceId) {
        this.accessToken = accessToken;
        this.annotations = annotations;
        this.clusterId = clusterId;
        this.connectVia = connectVia;
        this.credential = credential;
        this.description = description;
        this.domain = Objects.requireNonNull(domain);
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type);
        this.workspaceResourceId = workspaceResourceId;
    }

    /**
     * Access token for databricks REST API. Refer to https://docs.azuredatabricks.net/api/latest/authentication.html. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getAccessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The id of an existing interactive cluster that will be used for all runs of this job. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getClusterId() {
        return Optional.ofNullable(this.clusterId);
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
     * <REGION>.azuredatabricks.net, domain name of your Databricks deployment. Type: string (or Expression with resultType string).
     * 
    */
    public Object getDomain() {
        return this.domain;
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
     * Type of linked service.
     * Expected value is 'AzureDatabricksDeltaLake'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Workspace resource id for databricks REST API. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getWorkspaceResourceId() {
        return Optional.ofNullable(this.workspaceResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDatabricksDeltaLakeLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken;
        private @Nullable List<Object> annotations;
        private @Nullable Object clusterId;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable CredentialReferenceResponse credential;
        private @Nullable String description;
        private Object domain;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private String type;
        private @Nullable Object workspaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDatabricksDeltaLakeLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.annotations = defaults.annotations;
    	      this.clusterId = defaults.clusterId;
    	      this.connectVia = defaults.connectVia;
    	      this.credential = defaults.credential;
    	      this.description = defaults.description;
    	      this.domain = defaults.domain;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        public Builder setAccessToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setClusterId(@Nullable Object clusterId) {
            this.clusterId = clusterId;
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

        public Builder setDomain(Object domain) {
            this.domain = Objects.requireNonNull(domain);
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

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWorkspaceResourceId(@Nullable Object workspaceResourceId) {
            this.workspaceResourceId = workspaceResourceId;
            return this;
        }
        public AzureDatabricksDeltaLakeLinkedServiceResponse build() {
            return new AzureDatabricksDeltaLakeLinkedServiceResponse(accessToken, annotations, clusterId, connectVia, credential, description, domain, encryptedCredential, parameters, type, workspaceResourceId);
        }
    }
}