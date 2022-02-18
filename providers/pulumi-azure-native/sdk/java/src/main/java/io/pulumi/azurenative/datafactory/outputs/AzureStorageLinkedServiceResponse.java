// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureStorageLinkedServiceResponse {
    /**
     * The Azure key vault secret reference of accountKey in connection string.
     * 
     */
    private final @Nullable AzureKeyVaultSecretReferenceResponse accountKey;
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * The connection string. It is mutually exclusive with sasUri property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    private final @Nullable Object connectionString;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable String encryptedCredential;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * The Azure key vault secret reference of sasToken in sas uri.
     * 
     */
    private final @Nullable AzureKeyVaultSecretReferenceResponse sasToken;
    /**
     * SAS URI of the Azure Storage resource. It is mutually exclusive with connectionString property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    private final @Nullable Object sasUri;
    /**
     * Type of linked service.
     * Expected value is 'AzureStorage'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"accountKey","annotations","connectVia","connectionString","description","encryptedCredential","parameters","sasToken","sasUri","type"})
    private AzureStorageLinkedServiceResponse(
        @Nullable AzureKeyVaultSecretReferenceResponse accountKey,
        @Nullable List<Object> annotations,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable Object connectionString,
        @Nullable String description,
        @Nullable String encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable AzureKeyVaultSecretReferenceResponse sasToken,
        @Nullable Object sasUri,
        String type) {
        this.accountKey = accountKey;
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.connectionString = connectionString;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.sasToken = sasToken;
        this.sasUri = sasUri;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The Azure key vault secret reference of accountKey in connection string.
     * 
     */
    public Optional<AzureKeyVaultSecretReferenceResponse> getAccountKey() {
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
     * The integration runtime reference.
     * 
     */
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * The connection string. It is mutually exclusive with sasUri property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    public Optional<Object> getConnectionString() {
        return Optional.ofNullable(this.connectionString);
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
    public Optional<String> getEncryptedCredential() {
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
     * The Azure key vault secret reference of sasToken in sas uri.
     * 
     */
    public Optional<AzureKeyVaultSecretReferenceResponse> getSasToken() {
        return Optional.ofNullable(this.sasToken);
    }
    /**
     * SAS URI of the Azure Storage resource. It is mutually exclusive with connectionString property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    public Optional<Object> getSasUri() {
        return Optional.ofNullable(this.sasUri);
    }
    /**
     * Type of linked service.
     * Expected value is 'AzureStorage'.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureStorageLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureKeyVaultSecretReferenceResponse accountKey;
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable Object connectionString;
        private @Nullable String description;
        private @Nullable String encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable AzureKeyVaultSecretReferenceResponse sasToken;
        private @Nullable Object sasUri;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureStorageLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionString = defaults.connectionString;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.sasToken = defaults.sasToken;
    	      this.sasUri = defaults.sasUri;
    	      this.type = defaults.type;
        }

        public Builder setAccountKey(@Nullable AzureKeyVaultSecretReferenceResponse accountKey) {
            this.accountKey = accountKey;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
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

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AzureStorageLinkedServiceResponse build() {
            return new AzureStorageLinkedServiceResponse(accountKey, annotations, connectVia, connectionString, description, encryptedCredential, parameters, sasToken, sasUri, type);
        }
    }
}
