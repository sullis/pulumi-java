// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Open Database Connectivity (ODBC) linked service.
 * 
 */
public final class OdbcLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final OdbcLinkedServiceArgs Empty = new OdbcLinkedServiceArgs();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @InputImport(name="annotations")
    private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    /**
     * Type of authentication used to connect to the ODBC data store. Possible values are: Anonymous and Basic. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="authenticationType")
    private final @Nullable Input<Object> authenticationType;

    public Input<Object> getAuthenticationType() {
        return this.authenticationType == null ? Input.empty() : this.authenticationType;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @InputImport(name="connectVia")
    private final @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;

    public Input<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Input.empty() : this.connectVia;
    }

    /**
     * The non-access credential portion of the connection string as well as an optional encrypted credential. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @InputImport(name="connectionString", required=true)
    private final Input<Object> connectionString;

    public Input<Object> getConnectionString() {
        return this.connectionString;
    }

    /**
     * The access credential portion of the connection string specified in driver-specific property-value format.
     * 
     */
    @InputImport(name="credential")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> credential;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getCredential() {
        return this.credential == null ? Input.empty() : this.credential;
    }

    /**
     * Linked service description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="encryptedCredential")
    private final @Nullable Input<Object> encryptedCredential;

    public Input<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Input.empty() : this.encryptedCredential;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;

    public Input<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Password for Basic authentication.
     * 
     */
    @InputImport(name="password")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * Type of linked service.
     * Expected value is 'Odbc'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * User name for Basic authentication. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="userName")
    private final @Nullable Input<Object> userName;

    public Input<Object> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public OdbcLinkedServiceArgs(
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<Object> authenticationType,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        Input<Object> connectionString,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> credential,
        @Nullable Input<String> description,
        @Nullable Input<Object> encryptedCredential,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        Input<String> type,
        @Nullable Input<Object> userName) {
        this.annotations = annotations;
        this.authenticationType = authenticationType;
        this.connectVia = connectVia;
        this.connectionString = Objects.requireNonNull(connectionString, "expected parameter 'connectionString' to be non-null");
        this.credential = credential;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userName = userName;
    }

    private OdbcLinkedServiceArgs() {
        this.annotations = Input.empty();
        this.authenticationType = Input.empty();
        this.connectVia = Input.empty();
        this.connectionString = Input.empty();
        this.credential = Input.empty();
        this.description = Input.empty();
        this.encryptedCredential = Input.empty();
        this.parameters = Input.empty();
        this.password = Input.empty();
        this.type = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OdbcLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<Object> authenticationType;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private Input<Object> connectionString;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> credential;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> encryptedCredential;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private Input<String> type;
        private @Nullable Input<Object> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(OdbcLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionString = defaults.connectionString;
    	      this.credential = defaults.credential;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder setAnnotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setAuthenticationType(@Nullable Input<Object> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setAuthenticationType(@Nullable Object authenticationType) {
            this.authenticationType = Input.ofNullable(authenticationType);
            return this;
        }

        public Builder setConnectVia(@Nullable Input<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Input.ofNullable(connectVia);
            return this;
        }

        public Builder setConnectionString(Input<Object> connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }

        public Builder setConnectionString(Object connectionString) {
            this.connectionString = Input.of(Objects.requireNonNull(connectionString));
            return this;
        }

        public Builder setCredential(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> credential) {
            this.credential = credential;
            return this;
        }

        public Builder setCredential(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> credential) {
            this.credential = Input.ofNullable(credential);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Input<Object> encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = Input.ofNullable(encryptedCredential);
            return this;
        }

        public Builder setParameters(@Nullable Input<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setPassword(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUserName(@Nullable Input<Object> userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserName(@Nullable Object userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }

        public OdbcLinkedServiceArgs build() {
            return new OdbcLinkedServiceArgs(annotations, authenticationType, connectVia, connectionString, credential, description, encryptedCredential, parameters, password, type, userName);
        }
    }
}
