// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SAP Table Linked Service.
 * 
 */
public final class SapTableLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SapTableLinkedServiceArgs Empty = new SapTableLinkedServiceArgs();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> getAnnotations() {
        return this.annotations == null ? Output.empty() : this.annotations;
    }

    /**
     * Client ID of the client on the SAP system where the table is located. (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clientId")
      private final @Nullable Output<Object> clientId;

    public Output<Object> getClientId() {
        return this.clientId == null ? Output.empty() : this.clientId;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Output<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Output.empty() : this.connectVia;
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Output<Object> encryptedCredential;

    public Output<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Output.empty() : this.encryptedCredential;
    }

    /**
     * Language of the SAP system where the table is located. The default value is EN. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="language")
      private final @Nullable Output<Object> language;

    public Output<Object> getLanguage() {
        return this.language == null ? Output.empty() : this.language;
    }

    /**
     * The Logon Group for the SAP System. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="logonGroup")
      private final @Nullable Output<Object> logonGroup;

    public Output<Object> getLogonGroup() {
        return this.logonGroup == null ? Output.empty() : this.logonGroup;
    }

    /**
     * The hostname of the SAP Message Server. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="messageServer")
      private final @Nullable Output<Object> messageServer;

    public Output<Object> getMessageServer() {
        return this.messageServer == null ? Output.empty() : this.messageServer;
    }

    /**
     * The service name or port number of the Message Server. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="messageServerService")
      private final @Nullable Output<Object> messageServerService;

    public Output<Object> getMessageServerService() {
        return this.messageServerService == null ? Output.empty() : this.messageServerService;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Output<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * Password to access the SAP server where the table is located.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    /**
     * Host name of the SAP instance where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="server")
      private final @Nullable Output<Object> server;

    public Output<Object> getServer() {
        return this.server == null ? Output.empty() : this.server;
    }

    /**
     * External security product's library to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sncLibraryPath")
      private final @Nullable Output<Object> sncLibraryPath;

    public Output<Object> getSncLibraryPath() {
        return this.sncLibraryPath == null ? Output.empty() : this.sncLibraryPath;
    }

    /**
     * SNC activation indicator to access the SAP server where the table is located. Must be either 0 (off) or 1 (on). Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sncMode")
      private final @Nullable Output<Object> sncMode;

    public Output<Object> getSncMode() {
        return this.sncMode == null ? Output.empty() : this.sncMode;
    }

    /**
     * Initiator's SNC name to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sncMyName")
      private final @Nullable Output<Object> sncMyName;

    public Output<Object> getSncMyName() {
        return this.sncMyName == null ? Output.empty() : this.sncMyName;
    }

    /**
     * Communication partner's SNC name to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sncPartnerName")
      private final @Nullable Output<Object> sncPartnerName;

    public Output<Object> getSncPartnerName() {
        return this.sncPartnerName == null ? Output.empty() : this.sncPartnerName;
    }

    /**
     * SNC Quality of Protection. Allowed value include: 1, 2, 3, 8, 9. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sncQop")
      private final @Nullable Output<Object> sncQop;

    public Output<Object> getSncQop() {
        return this.sncQop == null ? Output.empty() : this.sncQop;
    }

    /**
     * SystemID of the SAP system where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="systemId")
      private final @Nullable Output<Object> systemId;

    public Output<Object> getSystemId() {
        return this.systemId == null ? Output.empty() : this.systemId;
    }

    /**
     * System number of the SAP system where the table is located. (Usually a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="systemNumber")
      private final @Nullable Output<Object> systemNumber;

    public Output<Object> getSystemNumber() {
        return this.systemNumber == null ? Output.empty() : this.systemNumber;
    }

    /**
     * Type of linked service.
     * Expected value is 'SapTable'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Username to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="userName")
      private final @Nullable Output<Object> userName;

    public Output<Object> getUserName() {
        return this.userName == null ? Output.empty() : this.userName;
    }

    public SapTableLinkedServiceArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<Object> clientId,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        @Nullable Output<Object> language,
        @Nullable Output<Object> logonGroup,
        @Nullable Output<Object> messageServer,
        @Nullable Output<Object> messageServerService,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        @Nullable Output<Object> server,
        @Nullable Output<Object> sncLibraryPath,
        @Nullable Output<Object> sncMode,
        @Nullable Output<Object> sncMyName,
        @Nullable Output<Object> sncPartnerName,
        @Nullable Output<Object> sncQop,
        @Nullable Output<Object> systemId,
        @Nullable Output<Object> systemNumber,
        Output<String> type,
        @Nullable Output<Object> userName) {
        this.annotations = annotations;
        this.clientId = clientId;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.language = language;
        this.logonGroup = logonGroup;
        this.messageServer = messageServer;
        this.messageServerService = messageServerService;
        this.parameters = parameters;
        this.password = password;
        this.server = server;
        this.sncLibraryPath = sncLibraryPath;
        this.sncMode = sncMode;
        this.sncMyName = sncMyName;
        this.sncPartnerName = sncPartnerName;
        this.sncQop = sncQop;
        this.systemId = systemId;
        this.systemNumber = systemNumber;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userName = userName;
    }

    private SapTableLinkedServiceArgs() {
        this.annotations = Output.empty();
        this.clientId = Output.empty();
        this.connectVia = Output.empty();
        this.description = Output.empty();
        this.encryptedCredential = Output.empty();
        this.language = Output.empty();
        this.logonGroup = Output.empty();
        this.messageServer = Output.empty();
        this.messageServerService = Output.empty();
        this.parameters = Output.empty();
        this.password = Output.empty();
        this.server = Output.empty();
        this.sncLibraryPath = Output.empty();
        this.sncMode = Output.empty();
        this.sncMyName = Output.empty();
        this.sncPartnerName = Output.empty();
        this.sncQop = Output.empty();
        this.systemId = Output.empty();
        this.systemNumber = Output.empty();
        this.type = Output.empty();
        this.userName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapTableLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<Object> clientId;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private @Nullable Output<Object> language;
        private @Nullable Output<Object> logonGroup;
        private @Nullable Output<Object> messageServer;
        private @Nullable Output<Object> messageServerService;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private @Nullable Output<Object> server;
        private @Nullable Output<Object> sncLibraryPath;
        private @Nullable Output<Object> sncMode;
        private @Nullable Output<Object> sncMyName;
        private @Nullable Output<Object> sncPartnerName;
        private @Nullable Output<Object> sncQop;
        private @Nullable Output<Object> systemId;
        private @Nullable Output<Object> systemNumber;
        private Output<String> type;
        private @Nullable Output<Object> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SapTableLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clientId = defaults.clientId;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.language = defaults.language;
    	      this.logonGroup = defaults.logonGroup;
    	      this.messageServer = defaults.messageServer;
    	      this.messageServerService = defaults.messageServerService;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.server = defaults.server;
    	      this.sncLibraryPath = defaults.sncLibraryPath;
    	      this.sncMode = defaults.sncMode;
    	      this.sncMyName = defaults.sncMyName;
    	      this.sncPartnerName = defaults.sncPartnerName;
    	      this.sncQop = defaults.sncQop;
    	      this.systemId = defaults.systemId;
    	      this.systemNumber = defaults.systemNumber;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Output.ofNullable(annotations);
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder clientId(@Nullable Output<Object> clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientId(@Nullable Object clientId) {
            this.clientId = Output.ofNullable(clientId);
            return this;
        }
        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Output.ofNullable(connectVia);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = Output.ofNullable(encryptedCredential);
            return this;
        }
        public Builder language(@Nullable Output<Object> language) {
            this.language = language;
            return this;
        }
        public Builder language(@Nullable Object language) {
            this.language = Output.ofNullable(language);
            return this;
        }
        public Builder logonGroup(@Nullable Output<Object> logonGroup) {
            this.logonGroup = logonGroup;
            return this;
        }
        public Builder logonGroup(@Nullable Object logonGroup) {
            this.logonGroup = Output.ofNullable(logonGroup);
            return this;
        }
        public Builder messageServer(@Nullable Output<Object> messageServer) {
            this.messageServer = messageServer;
            return this;
        }
        public Builder messageServer(@Nullable Object messageServer) {
            this.messageServer = Output.ofNullable(messageServer);
            return this;
        }
        public Builder messageServerService(@Nullable Output<Object> messageServerService) {
            this.messageServerService = messageServerService;
            return this;
        }
        public Builder messageServerService(@Nullable Object messageServerService) {
            this.messageServerService = Output.ofNullable(messageServerService);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }
        public Builder password(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            this.password = Output.ofNullable(password);
            return this;
        }
        public Builder server(@Nullable Output<Object> server) {
            this.server = server;
            return this;
        }
        public Builder server(@Nullable Object server) {
            this.server = Output.ofNullable(server);
            return this;
        }
        public Builder sncLibraryPath(@Nullable Output<Object> sncLibraryPath) {
            this.sncLibraryPath = sncLibraryPath;
            return this;
        }
        public Builder sncLibraryPath(@Nullable Object sncLibraryPath) {
            this.sncLibraryPath = Output.ofNullable(sncLibraryPath);
            return this;
        }
        public Builder sncMode(@Nullable Output<Object> sncMode) {
            this.sncMode = sncMode;
            return this;
        }
        public Builder sncMode(@Nullable Object sncMode) {
            this.sncMode = Output.ofNullable(sncMode);
            return this;
        }
        public Builder sncMyName(@Nullable Output<Object> sncMyName) {
            this.sncMyName = sncMyName;
            return this;
        }
        public Builder sncMyName(@Nullable Object sncMyName) {
            this.sncMyName = Output.ofNullable(sncMyName);
            return this;
        }
        public Builder sncPartnerName(@Nullable Output<Object> sncPartnerName) {
            this.sncPartnerName = sncPartnerName;
            return this;
        }
        public Builder sncPartnerName(@Nullable Object sncPartnerName) {
            this.sncPartnerName = Output.ofNullable(sncPartnerName);
            return this;
        }
        public Builder sncQop(@Nullable Output<Object> sncQop) {
            this.sncQop = sncQop;
            return this;
        }
        public Builder sncQop(@Nullable Object sncQop) {
            this.sncQop = Output.ofNullable(sncQop);
            return this;
        }
        public Builder systemId(@Nullable Output<Object> systemId) {
            this.systemId = systemId;
            return this;
        }
        public Builder systemId(@Nullable Object systemId) {
            this.systemId = Output.ofNullable(systemId);
            return this;
        }
        public Builder systemNumber(@Nullable Output<Object> systemNumber) {
            this.systemNumber = systemNumber;
            return this;
        }
        public Builder systemNumber(@Nullable Object systemNumber) {
            this.systemNumber = Output.ofNullable(systemNumber);
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
            this.userName = Output.ofNullable(userName);
            return this;
        }        public SapTableLinkedServiceArgs build() {
            return new SapTableLinkedServiceArgs(annotations, clientId, connectVia, description, encryptedCredential, language, logonGroup, messageServer, messageServerService, parameters, password, server, sncLibraryPath, sncMode, sncMyName, sncPartnerName, sncQop, systemId, systemNumber, type, userName);
        }
    }
}
