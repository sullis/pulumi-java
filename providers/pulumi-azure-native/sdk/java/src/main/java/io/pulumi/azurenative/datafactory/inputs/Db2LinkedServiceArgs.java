// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.Db2AuthenticationType;
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
 * Linked service for DB2 data source.
 * 
 */
public final class Db2LinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final Db2LinkedServiceArgs Empty = new Db2LinkedServiceArgs();

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
     * AuthenticationType to be used for connection. It is mutually exclusive with connectionString property.
     * 
     */
    @InputImport(name="authenticationType")
    private final @Nullable Input<Either<String,Db2AuthenticationType>> authenticationType;

    public Input<Either<String,Db2AuthenticationType>> getAuthenticationType() {
        return this.authenticationType == null ? Input.empty() : this.authenticationType;
    }

    /**
     * Certificate Common Name when TLS is enabled. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="certificateCommonName")
    private final @Nullable Input<Object> certificateCommonName;

    public Input<Object> getCertificateCommonName() {
        return this.certificateCommonName == null ? Input.empty() : this.certificateCommonName;
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
     * The connection string. It is mutually exclusive with server, database, authenticationType, userName, packageCollection and certificateCommonName property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @InputImport(name="connectionString")
    private final @Nullable Input<Object> connectionString;

    public Input<Object> getConnectionString() {
        return this.connectionString == null ? Input.empty() : this.connectionString;
    }

    /**
     * Database name for connection. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="database")
    private final @Nullable Input<Object> database;

    public Input<Object> getDatabase() {
        return this.database == null ? Input.empty() : this.database;
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
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="encryptedCredential")
    private final @Nullable Input<Object> encryptedCredential;

    public Input<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Input.empty() : this.encryptedCredential;
    }

    /**
     * Under where packages are created when querying database. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="packageCollection")
    private final @Nullable Input<Object> packageCollection;

    public Input<Object> getPackageCollection() {
        return this.packageCollection == null ? Input.empty() : this.packageCollection;
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
     * Password for authentication.
     * 
     */
    @InputImport(name="password")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * Server name for connection. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="server")
    private final @Nullable Input<Object> server;

    public Input<Object> getServer() {
        return this.server == null ? Input.empty() : this.server;
    }

    /**
     * Type of linked service.
     * Expected value is 'Db2'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Username for authentication. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="username")
    private final @Nullable Input<Object> username;

    public Input<Object> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public Db2LinkedServiceArgs(
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<Either<String,Db2AuthenticationType>> authenticationType,
        @Nullable Input<Object> certificateCommonName,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<Object> connectionString,
        @Nullable Input<Object> database,
        @Nullable Input<String> description,
        @Nullable Input<Object> encryptedCredential,
        @Nullable Input<Object> packageCollection,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        @Nullable Input<Object> server,
        Input<String> type,
        @Nullable Input<Object> username) {
        this.annotations = annotations;
        this.authenticationType = authenticationType;
        this.certificateCommonName = certificateCommonName;
        this.connectVia = connectVia;
        this.connectionString = connectionString;
        this.database = database;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.packageCollection = packageCollection;
        this.parameters = parameters;
        this.password = password;
        this.server = server;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.username = username;
    }

    private Db2LinkedServiceArgs() {
        this.annotations = Input.empty();
        this.authenticationType = Input.empty();
        this.certificateCommonName = Input.empty();
        this.connectVia = Input.empty();
        this.connectionString = Input.empty();
        this.database = Input.empty();
        this.description = Input.empty();
        this.encryptedCredential = Input.empty();
        this.packageCollection = Input.empty();
        this.parameters = Input.empty();
        this.password = Input.empty();
        this.server = Input.empty();
        this.type = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Db2LinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<Either<String,Db2AuthenticationType>> authenticationType;
        private @Nullable Input<Object> certificateCommonName;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<Object> connectionString;
        private @Nullable Input<Object> database;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> encryptedCredential;
        private @Nullable Input<Object> packageCollection;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private @Nullable Input<Object> server;
        private Input<String> type;
        private @Nullable Input<Object> username;

        public Builder() {
    	      // Empty
        }

        public Builder(Db2LinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.certificateCommonName = defaults.certificateCommonName;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionString = defaults.connectionString;
    	      this.database = defaults.database;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.packageCollection = defaults.packageCollection;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.server = defaults.server;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder setAnnotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setAuthenticationType(@Nullable Input<Either<String,Db2AuthenticationType>> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setAuthenticationType(@Nullable Either<String,Db2AuthenticationType> authenticationType) {
            this.authenticationType = Input.ofNullable(authenticationType);
            return this;
        }

        public Builder setCertificateCommonName(@Nullable Input<Object> certificateCommonName) {
            this.certificateCommonName = certificateCommonName;
            return this;
        }

        public Builder setCertificateCommonName(@Nullable Object certificateCommonName) {
            this.certificateCommonName = Input.ofNullable(certificateCommonName);
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

        public Builder setConnectionString(@Nullable Input<Object> connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder setConnectionString(@Nullable Object connectionString) {
            this.connectionString = Input.ofNullable(connectionString);
            return this;
        }

        public Builder setDatabase(@Nullable Input<Object> database) {
            this.database = database;
            return this;
        }

        public Builder setDatabase(@Nullable Object database) {
            this.database = Input.ofNullable(database);
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

        public Builder setPackageCollection(@Nullable Input<Object> packageCollection) {
            this.packageCollection = packageCollection;
            return this;
        }

        public Builder setPackageCollection(@Nullable Object packageCollection) {
            this.packageCollection = Input.ofNullable(packageCollection);
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

        public Builder setServer(@Nullable Input<Object> server) {
            this.server = server;
            return this;
        }

        public Builder setServer(@Nullable Object server) {
            this.server = Input.ofNullable(server);
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

        public Builder setUsername(@Nullable Input<Object> username) {
            this.username = username;
            return this;
        }

        public Builder setUsername(@Nullable Object username) {
            this.username = Input.ofNullable(username);
            return this;
        }

        public Db2LinkedServiceArgs build() {
            return new Db2LinkedServiceArgs(annotations, authenticationType, certificateCommonName, connectVia, connectionString, database, description, encryptedCredential, packageCollection, parameters, password, server, type, username);
        }
    }
}
