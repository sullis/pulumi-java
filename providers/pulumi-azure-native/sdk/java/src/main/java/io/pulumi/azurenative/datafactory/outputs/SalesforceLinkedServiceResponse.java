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
public final class SalesforceLinkedServiceResponse {
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The Salesforce API version used in ADF. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object apiVersion;
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
     * The URL of Salesforce instance. Default is 'https://login.salesforce.com'. To copy data from sandbox, specify 'https://test.salesforce.com'. To copy data from custom domain, specify, for example, 'https://[domain].my.salesforce.com'. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object environmentUrl;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * The password for Basic authentication of the Salesforce instance.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    /**
     * The security token is optional to remotely access Salesforce instance.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> securityToken;
    /**
     * Type of linked service.
     * Expected value is 'Salesforce'.
     * 
     */
    private final String type;
    /**
     * The username for Basic authentication of the Salesforce instance. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object username;

    @OutputCustomType.Constructor({"annotations","apiVersion","connectVia","description","encryptedCredential","environmentUrl","parameters","password","securityToken","type","username"})
    private SalesforceLinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable Object apiVersion,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Object environmentUrl,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> securityToken,
        String type,
        @Nullable Object username) {
        this.annotations = annotations;
        this.apiVersion = apiVersion;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.environmentUrl = environmentUrl;
        this.parameters = parameters;
        this.password = password;
        this.securityToken = securityToken;
        this.type = Objects.requireNonNull(type);
        this.username = username;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The Salesforce API version used in ADF. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getApiVersion() {
        return Optional.ofNullable(this.apiVersion);
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
     * The URL of Salesforce instance. Default is 'https://login.salesforce.com'. To copy data from sandbox, specify 'https://test.salesforce.com'. To copy data from custom domain, specify, for example, 'https://[domain].my.salesforce.com'. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getEnvironmentUrl() {
        return Optional.ofNullable(this.environmentUrl);
    }
    /**
     * Parameters for linked service.
     * 
     */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * The password for Basic authentication of the Salesforce instance.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * The security token is optional to remotely access Salesforce instance.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getSecurityToken() {
        return Optional.ofNullable(this.securityToken);
    }
    /**
     * Type of linked service.
     * Expected value is 'Salesforce'.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The username for Basic authentication of the Salesforce instance. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SalesforceLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable Object apiVersion;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Object environmentUrl;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> securityToken;
        private String type;
        private @Nullable Object username;

        public Builder() {
    	      // Empty
        }

        public Builder(SalesforceLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.apiVersion = defaults.apiVersion;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.environmentUrl = defaults.environmentUrl;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.securityToken = defaults.securityToken;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setApiVersion(@Nullable Object apiVersion) {
            this.apiVersion = apiVersion;
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

        public Builder setEnvironmentUrl(@Nullable Object environmentUrl) {
            this.environmentUrl = environmentUrl;
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

        public Builder setSecurityToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> securityToken) {
            this.securityToken = securityToken;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUsername(@Nullable Object username) {
            this.username = username;
            return this;
        }

        public SalesforceLinkedServiceResponse build() {
            return new SalesforceLinkedServiceResponse(annotations, apiVersion, connectVia, description, encryptedCredential, environmentUrl, parameters, password, securityToken, type, username);
        }
    }
}
