// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import com.pulumi.azurenative.datafactory.outputs.SqlAlwaysEncryptedPropertiesResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AmazonRdsForSqlServerLinkedServiceResponse {
    /**
     * @return Sql always encrypted properties.
     * 
     */
    private final @Nullable SqlAlwaysEncryptedPropertiesResponse alwaysEncryptedSettings;
    /**
     * @return List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * @return The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * @return The connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    private final Object connectionString;
    /**
     * @return Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * @return Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * @return The on-premises Windows authentication password.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    /**
     * @return Type of linked service.
     * Expected value is &#39;AmazonRdsForSqlServer&#39;.
     * 
     */
    private final String type;
    /**
     * @return The on-premises Windows authentication user name. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object userName;

    @CustomType.Constructor
    private AmazonRdsForSqlServerLinkedServiceResponse(
        @CustomType.Parameter("alwaysEncryptedSettings") @Nullable SqlAlwaysEncryptedPropertiesResponse alwaysEncryptedSettings,
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @CustomType.Parameter("connectionString") Object connectionString,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("password") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userName") @Nullable Object userName) {
        this.alwaysEncryptedSettings = alwaysEncryptedSettings;
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.connectionString = connectionString;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.type = type;
        this.userName = userName;
    }

    /**
     * @return Sql always encrypted properties.
     * 
     */
    public Optional<SqlAlwaysEncryptedPropertiesResponse> alwaysEncryptedSettings() {
        return Optional.ofNullable(this.alwaysEncryptedSettings);
    }
    /**
     * @return List of tags that can be used for describing the linked service.
     * 
     */
    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * @return The integration runtime reference.
     * 
     */
    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * @return The connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    public Object connectionString() {
        return this.connectionString;
    }
    /**
     * @return Linked service description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * @return Parameters for linked service.
     * 
     */
    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * @return The on-premises Windows authentication password.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return Type of linked service.
     * Expected value is &#39;AmazonRdsForSqlServer&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The on-premises Windows authentication user name. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> userName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmazonRdsForSqlServerLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SqlAlwaysEncryptedPropertiesResponse alwaysEncryptedSettings;
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private Object connectionString;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private String type;
        private @Nullable Object userName;

        public Builder() {
    	      // Empty
        }

        public Builder(AmazonRdsForSqlServerLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alwaysEncryptedSettings = defaults.alwaysEncryptedSettings;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionString = defaults.connectionString;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder alwaysEncryptedSettings(@Nullable SqlAlwaysEncryptedPropertiesResponse alwaysEncryptedSettings) {
            this.alwaysEncryptedSettings = alwaysEncryptedSettings;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder connectionString(Object connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userName(@Nullable Object userName) {
            this.userName = userName;
            return this;
        }        public AmazonRdsForSqlServerLinkedServiceResponse build() {
            return new AmazonRdsForSqlServerLinkedServiceResponse(alwaysEncryptedSettings, annotations, connectVia, connectionString, description, encryptedCredential, parameters, password, type, userName);
        }
    }
}
