// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import com.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Informix linked service.
 * 
 */
public final class InformixLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InformixLinkedServiceArgs Empty = new InformixLinkedServiceArgs();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> annotations() {
        return this.annotations == null ? Codegen.empty() : this.annotations;
    }

    /**
     * Type of authentication used to connect to the Informix as ODBC data store. Possible values are: Anonymous and Basic. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="authenticationType")
      private final @Nullable Output<Object> authenticationType;

    public Output<Object> authenticationType() {
        return this.authenticationType == null ? Codegen.empty() : this.authenticationType;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Output<IntegrationRuntimeReferenceArgs> connectVia() {
        return this.connectVia == null ? Codegen.empty() : this.connectVia;
    }

    /**
     * The non-access credential portion of the connection string as well as an optional encrypted credential. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="connectionString", required=true)
      private final Output<Object> connectionString;

    public Output<Object> connectionString() {
        return this.connectionString;
    }

    /**
     * The access credential portion of the connection string specified in driver-specific property-value format.
     * 
     */
    @Import(name="credential")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> credential;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> credential() {
        return this.credential == null ? Codegen.empty() : this.credential;
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Output<Object> encryptedCredential;

    public Output<Object> encryptedCredential() {
        return this.encryptedCredential == null ? Codegen.empty() : this.encryptedCredential;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Output<Map<String,ParameterSpecificationArgs>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * Password for Basic authentication.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * Type of linked service.
     * Expected value is 'Informix'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * User name for Basic authentication. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="userName")
      private final @Nullable Output<Object> userName;

    public Output<Object> userName() {
        return this.userName == null ? Codegen.empty() : this.userName;
    }

    public InformixLinkedServiceArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<Object> authenticationType,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        Output<Object> connectionString,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> credential,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        Output<String> type,
        @Nullable Output<Object> userName) {
        this.annotations = annotations;
        this.authenticationType = authenticationType;
        this.connectVia = connectVia;
        this.connectionString = Objects.requireNonNull(connectionString, "expected parameter 'connectionString' to be non-null");
        this.credential = credential;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.type = Codegen.stringProp("type").output().arg(type).require();
        this.userName = userName;
    }

    private InformixLinkedServiceArgs() {
        this.annotations = Codegen.empty();
        this.authenticationType = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.connectionString = Codegen.empty();
        this.credential = Codegen.empty();
        this.description = Codegen.empty();
        this.encryptedCredential = Codegen.empty();
        this.parameters = Codegen.empty();
        this.password = Codegen.empty();
        this.type = Codegen.empty();
        this.userName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InformixLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<Object> authenticationType;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private Output<Object> connectionString;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> credential;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private Output<String> type;
        private @Nullable Output<Object> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(InformixLinkedServiceArgs defaults) {
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

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Codegen.ofNullable(annotations);
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder authenticationType(@Nullable Output<Object> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder authenticationType(@Nullable Object authenticationType) {
            this.authenticationType = Codegen.ofNullable(authenticationType);
            return this;
        }
        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Codegen.ofNullable(connectVia);
            return this;
        }
        public Builder connectionString(Output<Object> connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }
        public Builder connectionString(Object connectionString) {
            this.connectionString = Output.of(Objects.requireNonNull(connectionString));
            return this;
        }
        public Builder credential(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> credential) {
            this.credential = credential;
            return this;
        }
        public Builder credential(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> credential) {
            this.credential = Codegen.ofNullable(credential);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = Codegen.ofNullable(encryptedCredential);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder password(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            this.password = Codegen.ofNullable(password);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder userName(@Nullable Output<Object> userName) {
            this.userName = userName;
            return this;
        }
        public Builder userName(@Nullable Object userName) {
            this.userName = Codegen.ofNullable(userName);
            return this;
        }        public InformixLinkedServiceArgs build() {
            return new InformixLinkedServiceArgs(annotations, authenticationType, connectVia, connectionString, credential, description, encryptedCredential, parameters, password, type, userName);
        }
    }
}
